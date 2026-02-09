package com.roamyhub.android.feature.plans.browse.state

import com.roamyhub.android.core.domain.model.plan.Plan

/**
 * UI state for the Plan Detail screen
 */
data class PlanDetailUiState(
    val plan: Plan? = null,
    val isLoading: Boolean = false,
    val error: String? = null
) {
    /**
     * Whether there's content to display
     */
    val hasContent: Boolean
        get() = plan != null

    /**
     * Whether to show empty state
     */
    val showEmptyState: Boolean
        get() = !isLoading && plan == null && error == null
}
