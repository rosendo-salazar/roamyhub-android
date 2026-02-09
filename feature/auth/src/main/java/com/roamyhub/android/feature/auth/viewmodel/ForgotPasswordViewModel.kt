package com.roamyhub.android.feature.auth.viewmodel

import android.util.Patterns
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.repository.AuthRepository
import com.roamyhub.android.feature.auth.state.ForgotPasswordUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel for forgot password screen
 *
 * Handles password reset email functionality.
 */
@HiltViewModel
class ForgotPasswordViewModel @Inject constructor(
    private val authRepository: AuthRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(ForgotPasswordUiState())
    val uiState: StateFlow<ForgotPasswordUiState> = _uiState.asStateFlow()

    /**
     * Update email and validate
     */
    fun onEmailChange(email: String) {
        _uiState.update {
            it.copy(
                email = email,
                isEmailValid = validateEmail(email),
                error = null,
                successMessage = null
            )
        }
    }

    /**
     * Send password reset link
     */
    fun onSendResetLink() {
        val state = _uiState.value

        // Validate email
        if (!validateForm()) {
            return
        }

        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, error = null, successMessage = null) }

            when (val result = authRepository.resetPassword(state.email)) {
                is Resource.Success -> {
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            successMessage = "Password reset link has been sent to ${state.email}"
                        )
                    }
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
     * Validate the form
     */
    private fun validateForm(): Boolean {
        val email = _uiState.value.email
        val isEmailValid = validateEmail(email)

        _uiState.update {
            it.copy(
                isEmailValid = isEmailValid,
                error = if (!isEmailValid) "Please enter a valid email address" else null
            )
        }

        return isEmailValid
    }

    /**
     * Validate email format
     */
    private fun validateEmail(email: String): Boolean {
        return email.isNotBlank() && Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
}
