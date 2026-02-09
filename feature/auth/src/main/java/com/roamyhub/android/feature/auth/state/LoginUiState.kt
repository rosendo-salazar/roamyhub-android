package com.roamyhub.android.feature.auth.state

/**
 * UI state for login screen
 */
data class LoginUiState(
    val email: String = "",
    val password: String = "",
    val isLoading: Boolean = false,
    val error: String? = null,
    val isEmailValid: Boolean = true,
    val isPasswordValid: Boolean = true
) {
    /**
     * Check if the form is valid and can be submitted
     */
    val isFormValid: Boolean
        get() = email.isNotBlank() &&
                password.isNotBlank() &&
                isEmailValid &&
                isPasswordValid

    /**
     * Check if inputs should be enabled (not loading)
     */
    val inputsEnabled: Boolean
        get() = !isLoading
}
