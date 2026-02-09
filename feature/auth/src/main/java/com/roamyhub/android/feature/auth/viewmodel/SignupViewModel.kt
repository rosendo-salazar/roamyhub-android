package com.roamyhub.android.feature.auth.viewmodel

import android.util.Patterns
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.repository.AuthRepository
import com.roamyhub.android.feature.auth.state.SignupUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel for signup screen
 *
 * Handles new user registration with form validation.
 */
@HiltViewModel
class SignupViewModel @Inject constructor(
    private val authRepository: AuthRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(SignupUiState())
    val uiState: StateFlow<SignupUiState> = _uiState.asStateFlow()

    private val _navigationEvents = MutableSharedFlow<NavigationEvent>()
    val navigationEvents = _navigationEvents.asSharedFlow()

    /**
     * Update first name and validate
     */
    fun onFirstNameChange(firstName: String) {
        _uiState.update {
            it.copy(
                firstName = firstName,
                isFirstNameValid = firstName.isNotBlank(),
                error = null
            )
        }
    }

    /**
     * Update last name and validate
     */
    fun onLastNameChange(lastName: String) {
        _uiState.update {
            it.copy(
                lastName = lastName,
                isLastNameValid = lastName.isNotBlank(),
                error = null
            )
        }
    }

    /**
     * Update email and validate
     */
    fun onEmailChange(email: String) {
        _uiState.update {
            it.copy(
                email = email,
                isEmailValid = validateEmail(email),
                error = null
            )
        }
    }

    /**
     * Update password and validate
     */
    fun onPasswordChange(password: String) {
        _uiState.update {
            it.copy(
                password = password,
                isPasswordValid = validatePassword(password),
                // Also revalidate confirm password
                isConfirmPasswordValid = if (it.confirmPassword.isNotEmpty()) {
                    password == it.confirmPassword
                } else {
                    true
                },
                error = null
            )
        }
    }

    /**
     * Update confirm password and validate
     */
    fun onConfirmPasswordChange(confirmPassword: String) {
        _uiState.update {
            it.copy(
                confirmPassword = confirmPassword,
                isConfirmPasswordValid = it.password == confirmPassword,
                error = null
            )
        }
    }

    /**
     * Toggle terms acceptance
     */
    fun onTermsAcceptedChange(accepted: Boolean) {
        _uiState.update {
            it.copy(
                termsAccepted = accepted,
                error = null
            )
        }
    }

    /**
     * Handle signup button click
     */
    fun onSignupClick() {
        val state = _uiState.value

        // Validate all fields
        if (!validateForm()) {
            return
        }

        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, error = null) }

            when (val result = authRepository.signUp(
                email = state.email,
                password = state.password,
                firstName = state.firstName,
                lastName = state.lastName
            )) {
                is Resource.Success -> {
                    _uiState.update { it.copy(isLoading = false) }
                    _navigationEvents.emit(NavigationEvent.NavigateToVerification(state.email))
                }
                is Resource.Error -> {
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            error = result.message
                        )
                    }
                }
                is Resource.Loading -> {
                    // Already in loading state
                }
            }
        }
    }

    /**
     * Validate the entire form
     */
    private fun validateForm(): Boolean {
        val state = _uiState.value

        val isFirstNameValid = state.firstName.isNotBlank()
        val isLastNameValid = state.lastName.isNotBlank()
        val isEmailValid = validateEmail(state.email)
        val isPasswordValid = validatePassword(state.password)
        val isConfirmPasswordValid = state.password == state.confirmPassword

        val errorMessage = when {
            !isFirstNameValid -> "First name is required"
            !isLastNameValid -> "Last name is required"
            !isEmailValid -> "Please enter a valid email address"
            !isPasswordValid -> "Password must be at least 8 characters with letters and numbers"
            !isConfirmPasswordValid -> "Passwords do not match"
            !state.termsAccepted -> "You must accept the terms and conditions"
            else -> null
        }

        _uiState.update {
            it.copy(
                isFirstNameValid = isFirstNameValid,
                isLastNameValid = isLastNameValid,
                isEmailValid = isEmailValid,
                isPasswordValid = isPasswordValid,
                isConfirmPasswordValid = isConfirmPasswordValid,
                error = errorMessage
            )
        }

        return errorMessage == null
    }

    /**
     * Validate email format
     */
    private fun validateEmail(email: String): Boolean {
        return email.isNotBlank() && Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    /**
     * Validate password requirements:
     * - At least 8 characters
     * - Contains at least one letter
     * - Contains at least one number
     */
    private fun validatePassword(password: String): Boolean {
        return password.length >= 8 &&
                password.any { it.isLetter() } &&
                password.any { it.isDigit() }
    }

    /**
     * Navigation events
     */
    sealed class NavigationEvent {
        data class NavigateToVerification(val email: String) : NavigationEvent()
    }
}
