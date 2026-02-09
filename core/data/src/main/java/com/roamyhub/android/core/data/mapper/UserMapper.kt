package com.roamyhub.android.core.data.mapper

import com.roamyhub.android.core.domain.model.user.User
import com.roamyhub.android.core.network.model.UserDto
import kotlinx.datetime.Instant

/**
 * Extension function to convert UserDto to domain User model
 */
fun UserDto.toDomain(): User {
    return User(
        id = id,
        email = email,
        firstName = firstName,
        lastName = lastName,
        phoneNumber = phoneNumber,
        profileImageUrl = profileImageUrl,
        points = points,
        createdAt = Instant.parse(createdAt),
        updatedAt = Instant.parse(updatedAt),
        emailVerified = emailVerified,
        isActive = isActive,
        preferredCurrency = preferredCurrency,
        preferredLanguage = preferredLanguage
    )
}
