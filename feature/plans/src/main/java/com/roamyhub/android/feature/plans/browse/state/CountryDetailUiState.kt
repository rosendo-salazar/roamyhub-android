package com.roamyhub.android.feature.plans.browse.state

import com.roamyhub.android.core.domain.model.plan.CountrySummary
import com.roamyhub.android.core.domain.model.plan.Plan

/**
 * UI state for the Country Detail screen
 */
data class CountryDetailUiState(
    val country: CountrySummary? = null,
    val plans: List<Plan> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
) {
    /**
     * Whether there's content to display
     */
    val hasContent: Boolean
        get() = country != null && plans.isNotEmpty()

    /**
     * Whether to show empty state
     */
    val showEmptyState: Boolean
        get() = !isLoading && country != null && plans.isEmpty() && error == null
}
