package com.roamyhub.android.feature.plans.home.state

import com.roamyhub.android.core.domain.model.plan.CountrySummary
import com.roamyhub.android.core.domain.model.plan.RegionSummary

/**
 * UI state for the Home screen
 */
sealed interface HomeUiState {

    /**
     * Initial loading state
     */
    data object Loading : HomeUiState

    /**
     * Successfully loaded home data
     */
    data class Success(
        val popularCountries: List<CountrySummary>,
        val regions: List<RegionSummary>
    ) : HomeUiState

    /**
     * Error loading home data
     */
    data class Error(val message: String) : HomeUiState
}
