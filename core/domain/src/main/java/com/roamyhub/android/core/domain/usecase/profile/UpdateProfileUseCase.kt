package com.roamyhub.android.core.domain.usecase.profile

import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.model.user.User
import com.roamyhub.android.core.domain.repository.ProfileRepository
import javax.inject.Inject

/**
 * Use case to update the current user's profile.
 *
 * Validates input and updates profile fields that have changed.
 */
class UpdateProfileUseCase @Inject constructor(
    private val profileRepository: ProfileRepository
) {
    suspend operator fun invoke(
        firstName: String? = null,
        lastName: String? = null,
        phoneNumber: String? = null,
        profileImageUrl: String? = null,
        preferredCurrency: String? = null,
        preferredLanguage: String? = null
    ): Resource<User> {
        // Validate first name if provided
        if (firstName != null && firstName.isBlank()) {
            return Resource.Error("First name cannot be empty")
        }

        // Validate last name if provided
        if (lastName != null && lastName.isBlank()) {
            return Resource.Error("Last name cannot be empty")
        }

        // Validate phone number format if provided
        if (phoneNumber != null && phoneNumber.isNotBlank() && !isValidPhoneNumber(phoneNumber)) {
            return Resource.Error("Invalid phone number format")
        }

        return profileRepository.updateProfile(
            firstName = firstName,
            lastName = lastName,
            phoneNumber = phoneNumber,
            profileImageUrl = profileImageUrl,
            preferredCurrency = preferredCurrency,
            preferredLanguage = preferredLanguage
        )
    }

    private fun isValidPhoneNumber(phoneNumber: String): Boolean {
        // Basic phone number validation (10+ digits, may include + and spaces)
        val cleanedNumber = phoneNumber.replace(Regex("[^0-9+]"), "")
        return cleanedNumber.length >= 10
    }
}
