package com.roamyhub.android.feature.auth.viewmodel

import android.util.Patterns
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.repository.AuthRepository
import com.roamyhub.android.feature.auth.state.LoginUiState
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
 * ViewModel for login screen
 *
 * Handles user authentication via email/password and Google Sign-In.
 */
@HiltViewModel
class LoginViewModel @Inject constructor(
    private val authRepository: AuthRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(LoginUiState())
    val uiState: StateFlow<LoginUiState> = _uiState.asStateFlow()

    private val _navigationEvents = MutableSharedFlow<NavigationEvent>()
    val navigationEvents = _navigationEvents.asSharedFlow()

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
                error = null
            )
        }
    }

    /**
     * Handle login button click
     */
    fun onLoginClick() {
        val state = _uiState.value

        // Validate all fields
        if (!validateForm()) {
            return
        }

        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, error = null) }

            when (val result = authRepository.signIn(state.email, state.password)) {
                is Resource.Success -> {
                    _uiState.update { it.copy(isLoading = false) }
                    _navigationEvents.emit(NavigationEvent.NavigateToHome)
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
     * Handle Google Sign-In
     */
    fun onGoogleSignInClick(idToken: String) {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, error = null) }

            when (val result = authRepository.signInWithGoogle(idToken)) {
                is Resource.Success -> {
                    _uiState.update { it.copy(isLoading = false) }
                    _navigationEvents.emit(NavigationEvent.NavigateToHome)
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
     * Handle forgot password link click
     */
    fun onForgotPasswordClick() {
        viewModelScope.launch {
            _navigationEvents.emit(NavigationEvent.NavigateToForgotPassword)
        }
    }

    /**
     * Validate the entire form
     */
    private fun validateForm(): Boolean {
        val email = _uiState.value.email
        val password = _uiState.value.password

        val isEmailValid = validateEmail(email)
        val isPasswordValid = validatePassword(password)

        _uiState.update {
            it.copy(
                isEmailValid = isEmailValid,
                isPasswordValid = isPasswordValid,
                error = when {
                    !isEmailValid -> "Please enter a valid email address"
                    !isPasswordValid -> "Password must be at least 8 characters"
                    else -> null
                }
            )
        }

        return isEmailValid && isPasswordValid
    }

    /**
     * Validate email format
     */
    private fun validateEmail(email: String): Boolean {
        return email.isNotBlank() && Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    /**
     * Validate password requirements
     */
    private fun validatePassword(password: String): Boolean {
        return password.length >= 8
    }

    /**
     * Navigation events
     */
    sealed class NavigationEvent {
        data object NavigateToHome : NavigationEvent()
        data object NavigateToForgotPassword : NavigationEvent()
    }
}
