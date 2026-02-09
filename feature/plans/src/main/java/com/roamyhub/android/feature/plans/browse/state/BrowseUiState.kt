package com.roamyhub.android.feature.plans.browse.state

import com.roamyhub.android.core.domain.model.plan.CountrySummary
import com.roamyhub.android.core.domain.model.plan.GlobalSummary
import com.roamyhub.android.core.domain.model.plan.RegionSummary

/**
 * UI state for the Browse screen
 */
data class BrowseUiState(
    val countries: List<CountrySummary> = emptyList(),
    val regions: List<RegionSummary> = emptyList(),
    val globalSummary: GlobalSummary? = null,
    val selectedTab: Int = 0, // 0 = Countries, 1 = Regions
    val searchQuery: String = "",
    val isLoading: Boolean = false,
    val isRefreshing: Boolean = false,
    val error: String? = null
) {
    /**
     * Filtered countries based on search query
     */
    val filteredCountries: List<CountrySummary>
        get() = if (searchQuery.isBlank()) {
            countries
        } else {
            countries.filter { country ->
                country.displayName.contains(searchQuery, ignoreCase = true) ||
                        country.countryCode.contains(searchQuery, ignoreCase = true)
            }
        }

    /**
     * Filtered regions based on search query
     */
    val filteredRegions: List<RegionSummary>
        get() = if (searchQuery.isBlank()) {
            regions
        } else {
            regions.filter { region ->
                region.displayName.contains(searchQuery, ignoreCase = true) ||
                        region.regionKey.contains(searchQuery, ignoreCase = true)
            }
        }

    /**
     * Whether there's content to display
     */
    val hasContent: Boolean
        get() = countries.isNotEmpty() || regions.isNotEmpty()

    /**
     * Whether to show empty state
     */
    val showEmptyState: Boolean
        get() = !isLoading && !hasContent && error == null
}
