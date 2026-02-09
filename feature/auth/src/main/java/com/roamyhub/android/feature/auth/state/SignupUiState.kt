package com.roamyhub.android.feature.auth.state

/**
 * UI state for signup screen
 */
data class SignupUiState(
    val firstName: String = "",
    val lastName: String = "",
    val email: String = "",
    val password: String = "",
    val confirmPassword: String = "",
    val termsAccepted: Boolean = false,
    val isLoading: Boolean = false,
    val error: String? = null,
    val isFirstNameValid: Boolean = true,
    val isLastNameValid: Boolean = true,
    val isEmailValid: Boolean = true,
    val isPasswordValid: Boolean = true,
    val isConfirmPasswordValid: Boolean = true
) {
    /**
     * Get password strength level
     */
    val passwordStrength: PasswordStrength
        get() = when {
            password.isEmpty() -> PasswordStrength.NONE
            password.length < 8 -> PasswordStrength.WEAK
            !password.any { it.isLetter() } || !password.any { it.isDigit() } -> PasswordStrength.WEAK
            password.length < 12 -> PasswordStrength.MEDIUM
            else -> PasswordStrength.STRONG
        }

    /**
     * Check if the form is valid and can be submitted
     */
    val isFormValid: Boolean
        get() = firstName.isNotBlank() &&
                lastName.isNotBlank() &&
                email.isNotBlank() &&
                password.isNotBlank() &&
                confirmPassword.isNotBlank() &&
                password == confirmPassword &&
                termsAccepted &&
                isFirstNameValid &&
                isLastNameValid &&
                isEmailValid &&
                isPasswordValid &&
                isConfirmPasswordValid

    /**
     * Check if inputs should be enabled (not loading)
     */
    val inputsEnabled: Boolean
        get() = !isLoading
}

/**
 * Password strength levels
 */
enum class PasswordStrength {
    NONE,
    WEAK,
    MEDIUM,
    STRONG
}
