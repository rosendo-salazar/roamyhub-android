package com.roamyhub.android.feature.plans.browse.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.repository.PlanRepository
import com.roamyhub.android.feature.plans.browse.state.BrowseUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel for the Browse screen
 *
 * Manages country summaries, region summaries, and global summary for browsing plans.
 */
@HiltViewModel
class BrowseViewModel @Inject constructor(
    private val planRepository: PlanRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(BrowseUiState())
    val uiState: StateFlow<BrowseUiState> = _uiState.asStateFlow()

    init {
        loadData()
    }

    /**
     * Load all browse data (countries, regions, global)
     */
    fun loadData() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, error = null) }

            // Load all data in parallel
            launch { loadCountrySummaries() }
            launch { loadRegionSummaries() }
            launch { loadGlobalSummary() }
        }
    }

    /**
     * Refresh all data with pull-to-refresh
     */
    fun refresh() {
        viewModelScope.launch {
            _uiState.update { it.copy(isRefreshing = true, error = null) }

            // Load all data in parallel
            launch { loadCountrySummaries() }
            launch { loadRegionSummaries() }
            launch { loadGlobalSummary() }

            _uiState.update { it.copy(isRefreshing = false) }
        }
    }

    /**
     * Change selected tab
     */
    fun onTabChange(tabIndex: Int) {
        _uiState.update { it.copy(selectedTab = tabIndex) }
    }

    /**
     * Update search query
     */
    fun onSearchQueryChange(query: String) {
        _uiState.update { it.copy(searchQuery = query) }
    }

    /**
     * Clear search query
     */
    fun clearSearch() {
        _uiState.update { it.copy(searchQuery = "") }
    }

    private suspend fun loadCountrySummaries() {
        when (val result = planRepository.getCountrySummaries()) {
            is Resource.Success -> {
                _uiState.update {
                    it.copy(
                        countries = result.data,
                        isLoading = false
                    )
                }
            }
            is Resource.Error -> {
                _uiState.update {
                    it.copy(
                        error = result.message,
                        isLoading = false
                    )
                }
            }
            is Resource.Loading -> {
                // Already in loading state
            }
        }
    }

    private suspend fun loadRegionSummaries() {
        when (val result = planRepository.getRegionSummaries()) {
            is Resource.Success -> {
                _uiState.update {
                    it.copy(
                        regions = result.data,
                        isLoading = false
                    )
                }
            }
            is Resource.Error -> {
                _uiState.update {
                    it.copy(
                        error = result.message,
                        isLoading = false
                    )
                }
            }
            is Resource.Loading -> {
                // Already in loading state
            }
        }
    }

    private suspend fun loadGlobalSummary() {
        when (val result = planRepository.getGlobalSummary()) {
            is Resource.Success -> {
                _uiState.update {
                    it.copy(
                        globalSummary = result.data,
                        isLoading = false
                    )
                }
            }
            is Resource.Error -> {
                _uiState.update {
                    it.copy(
                        error = result.message,
                        isLoading = false
                    )
                }
            }
            is Resource.Loading -> {
                // Already in loading state
            }
        }
    }
}
