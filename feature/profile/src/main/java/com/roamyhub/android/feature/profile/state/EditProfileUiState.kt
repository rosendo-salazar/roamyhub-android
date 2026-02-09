package com.roamyhub.android.feature.profile.state

import com.roamyhub.android.core.domain.model.user.User

/**
 * UI state for Edit Profile screen
 */
data class EditProfileUiState(
    val user: User? = null,
    val firstName: String = "",
    val lastName: String = "",
    val phoneNumber: String = "",
    val isLoading: Boolean = false,
    val isSaving: Boolean = false,
    val error: String? = null,
    val successMessage: String? = null
) {
    /**
     * Returns true if the form has any changes compared to original user
     */
    fun hasChanges(): Boolean {
        return user?.let {
            firstName != it.firstName ||
            lastName != it.lastName ||
            phoneNumber != (it.phoneNumber ?: "")
        } ?: false
    }

    /**
     * Returns true if the form is valid for submission
     */
    fun isValid(): Boolean {
        return firstName.isNotBlank() && lastName.isNotBlank()
    }
}
