package com.roamyhub.android.core.domain.model.user

import kotlinx.datetime.Instant

/**
 * Domain model representing a user
 */
data class User(
    val id: String,
    val email: String,
    val firstName: String,
    val lastName: String,
    val phoneNumber: String? = null,
    val profileImageUrl: String? = null,
    val points: Int = 0,
    val createdAt: Instant,
    val updatedAt: Instant,
    val emailVerified: Boolean = false,
    val isActive: Boolean = true,
    val preferredCurrency: String = "USD",
    val preferredLanguage: String = "en"
) {
    val fullName: String
        get() = "$firstName $lastName".trim()

    val initials: String
        get() = "${firstName.firstOrNull() ?: ""}${lastName.firstOrNull() ?: ""}".uppercase()
}
