package com.roamyhub.android.feature.plans.browse.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.repository.PlanRepository
import com.roamyhub.android.feature.plans.browse.state.RegionDetailUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel for the Region Detail screen
 *
 * Displays region information and available plans for a specific region.
 */
@HiltViewModel
class RegionDetailViewModel @Inject constructor(
    private val planRepository: PlanRepository,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val regionKey: String = checkNotNull(savedStateHandle["regionKey"])

    private val _uiState = MutableStateFlow(RegionDetailUiState())
    val uiState: StateFlow<RegionDetailUiState> = _uiState.asStateFlow()

    init {
        loadRegionData()
    }

    /**
     * Load region data and plans
     */
    fun loadRegionData() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, error = null) }

            // Load region summary
            when (val summaryResult = planRepository.getPlansByRegion(regionKey)) {
                is Resource.Success -> {
                    val region = summaryResult.data.firstOrNull()
                    _uiState.update { it.copy(region = region) }
                }
                is Resource.Error -> {
                    _uiState.update {
                        it.copy(
                            error = summaryResult.message,
                            isLoading = false
                        )
                    }
                    return@launch
                }
                is Resource.Loading -> {
                    // Already in loading state
                }
            }

            // Load actual plans
            when (val plansResult = planRepository.getRegionPlans(regionKey)) {
                is Resource.Success -> {
                    _uiState.update {
                        it.copy(
                            plans = plansResult.data,
                            isLoading = false
                        )
                    }
                }
                is Resource.Error -> {
                    _uiState.update {
                        it.copy(
                            error = plansResult.message,
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

    /**
     * Refresh region data
     */
    fun refresh() {
        loadRegionData()
    }
}
