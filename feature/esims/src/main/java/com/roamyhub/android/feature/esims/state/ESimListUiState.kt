package com.roamyhub.android.feature.esims.state

import com.roamyhub.android.core.domain.model.esim.ESim
import com.roamyhub.android.core.domain.model.esim.ESimStatus

/**
 * Tab options for eSIM list
 */
enum class ESimTab {
    ACTIVE,
    ALL
}

/**
 * UI state for eSIM list screen
 */
data class ESimListUiState(
    val esims: List<ESim> = emptyList(),
    val selectedTab: ESimTab = ESimTab.ACTIVE,
    val isLoading: Boolean = false,
    val isRefreshing: Boolean = false,
    val error: String? = null
) {
    /**
     * Returns filtered list based on selected tab
     */
    val filteredList: List<ESim>
        get() = when (selectedTab) {
            ESimTab.ACTIVE -> esims.filter { it.status == ESimStatus.ACTIVE }
            ESimTab.ALL -> esims
        }

    /**
     * Returns true if user has any active eSIMs
     */
    val hasActiveESims: Boolean
        get() = esims.any { it.status == ESimStatus.ACTIVE }

    /**
     * Returns true if the filtered list is empty
     */
    val isEmpty: Boolean
        get() = filteredList.isEmpty()

    /**
     * Returns true if there are no eSIMs at all
     */
    val hasNoESims: Boolean
        get() = esims.isEmpty()
}
