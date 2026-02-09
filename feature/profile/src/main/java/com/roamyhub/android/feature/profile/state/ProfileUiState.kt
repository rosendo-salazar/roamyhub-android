package com.roamyhub.android.feature.profile.state

import com.roamyhub.android.core.domain.model.user.User

/**
 * UI state for Profile screen
 */
data class ProfileUiState(
    val user: User? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
