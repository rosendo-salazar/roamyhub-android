package com.roamyhub.android.feature.profile.support.state

import com.roamyhub.android.core.domain.model.support.Ticket

/**
 * UI state for Support screen
 */
data class SupportUiState(
    val tickets: List<Ticket> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
) {
    /**
     * Returns true if there are no tickets
     */
    val isEmpty: Boolean
        get() = tickets.isEmpty() && !isLoading
}
