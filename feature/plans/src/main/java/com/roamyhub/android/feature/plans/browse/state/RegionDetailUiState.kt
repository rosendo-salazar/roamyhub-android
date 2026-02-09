package com.roamyhub.android.feature.plans.browse.state

import com.roamyhub.android.core.domain.model.plan.Plan
import com.roamyhub.android.core.domain.model.plan.RegionSummary

/**
 * UI state for the Region Detail screen
 */
data class RegionDetailUiState(
    val region: RegionSummary? = null,
    val plans: List<Plan> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
) {
    /**
     * Whether there's content to display
     */
    val hasContent: Boolean
        get() = region != null && plans.isNotEmpty()

    /**
     * Whether to show empty state
     */
    val showEmptyState: Boolean
        get() = !isLoading && region != null && plans.isEmpty() && error == null
}
