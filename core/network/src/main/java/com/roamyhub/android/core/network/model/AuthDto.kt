package com.roamyhub.android.core.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * DTO for signup request
 */
@Serializable
data class SignupRequestDto(
    @SerialName("email") val email: String,
    @SerialName("password") val password: String,
    @SerialName("first_name") val firstName: String,
    @SerialName("last_name") val lastName: String
)

/**
 * DTO for social login request
 */
@Serializable
data class SocialLoginRequestDto(
    @SerialName("id_token") val idToken: String,
    @SerialName("provider") val provider: String
)

/**
 * DTO for forgot password request
 */
@Serializable
data class ForgotPasswordRequestDto(
    @SerialName("email") val email: String
)

/**
 * DTO for resend verification request
 */
@Serializable
data class ResendVerificationRequestDto(
    @SerialName("email") val email: String
)

/**
 * DTO for auth response
 */
@Serializable
data class AuthResponseDto(
    @SerialName("success") val success: Boolean,
    @SerialName("message") val message: String? = null,
    @SerialName("user") val user: UserDto? = null
)

/**
 * DTO for forgot password response
 */
@Serializable
data class ForgotPasswordResponseDto(
    @SerialName("success") val success: Boolean,
    @SerialName("message") val message: String
)
