package com.roamyhub.android.feature.auth.state

/**
 * UI state for forgot password screen
 */
data class ForgotPasswordUiState(
    val email: String = "",
    val isLoading: Boolean = false,
    val error: String? = null,
    val successMessage: String? = null,
    val isEmailValid: Boolean = true
) {
    /**
     * Check if the form is valid and can be submitted
     */
    val isFormValid: Boolean
        get() = email.isNotBlank() && isEmailValid

    /**
     * Check if inputs should be enabled (not loading)
     */
    val inputsEnabled: Boolean
        get() = !isLoading && successMessage == null
}
