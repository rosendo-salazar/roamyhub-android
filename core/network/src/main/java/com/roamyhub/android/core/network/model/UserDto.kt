package com.roamyhub.android.core.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * DTO for user data
 */
@Serializable
data class UserDto(
    @SerialName("id") val id: String,
    @SerialName("email") val email: String,
    @SerialName("first_name") val firstName: String,
    @SerialName("last_name") val lastName: String,
    @SerialName("phone_number") val phoneNumber: String? = null,
    @SerialName("profile_image_url") val profileImageUrl: String? = null,
    @SerialName("points") val points: Int = 0,
    @SerialName("created_at") val createdAt: String,
    @SerialName("updated_at") val updatedAt: String,
    @SerialName("email_verified") val emailVerified: Boolean = false,
    @SerialName("is_active") val isActive: Boolean = true,
    @SerialName("preferred_currency") val preferredCurrency: String = "USD",
    @SerialName("preferred_language") val preferredLanguage: String = "en"
)

/**
 * DTO for updating user profile
 */
@Serializable
data class UpdateProfileRequestDto(
    @SerialName("first_name") val firstName: String? = null,
    @SerialName("last_name") val lastName: String? = null,
    @SerialName("phone_number") val phoneNumber: String? = null,
    @SerialName("preferred_currency") val preferredCurrency: String? = null,
    @SerialName("preferred_language") val preferredLanguage: String? = null
)

/**
 * DTO for account deletion request
 */
@Serializable
data class AccountActionRequestDto(
    @SerialName("user_id") val userId: String,
    @SerialName("reason") val reason: String? = null
)

/**
 * DTO for account action response
 */
@Serializable
data class AccountActionResponseDto(
    @SerialName("success") val success: Boolean,
    @SerialName("message") val message: String
)
