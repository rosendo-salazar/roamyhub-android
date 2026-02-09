package com.roamyhub.android.feature.profile.support.state

/**
 * UI state for Create Ticket screen
 */
data class CreateTicketUiState(
    val subject: String = "",
    val message: String = "",
    val category: String = "general",
    val isSubmitting: Boolean = false,
    val error: String? = null
) {
    /**
     * Returns true if the form is valid for submission
     */
    fun isValid(): Boolean {
        return subject.isNotBlank() &&
               subject.length >= 5 &&
               message.isNotBlank() &&
               message.length >= 10
    }
}
