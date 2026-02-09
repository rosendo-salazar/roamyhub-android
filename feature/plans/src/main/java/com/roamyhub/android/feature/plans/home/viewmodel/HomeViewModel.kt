package com.roamyhub.android.feature.plans.home.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.repository.PlanRepository
import com.roamyhub.android.feature.plans.home.state.HomeUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel for the Home screen
 *
 * Manages the home screen data including popular destinations and regions.
 */
@HiltViewModel
class HomeViewModel @Inject constructor(
    private val planRepository: PlanRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow<HomeUiState>(HomeUiState.Loading)
    val uiState: StateFlow<HomeUiState> = _uiState.asStateFlow()

    init {
        loadHomeData()
    }

    /**
     * Load home screen data
     *
     * Fetches popular countries and regions for display on the home screen.
     */
    private fun loadHomeData() {
        viewModelScope.launch {
            _uiState.value = HomeUiState.Loading

            try {
                // Load popular countries (top 10)
                val countriesResult = planRepository.getCountrySummaries()
                val regionsResult = planRepository.getRegionSummaries()

                when {
                    countriesResult is Resource.Error -> {
                        _uiState.value = HomeUiState.Error(
                            countriesResult.message ?: "Failed to load countries"
                        )
                    }
                    regionsResult is Resource.Error -> {
                        _uiState.value = HomeUiState.Error(
                            regionsResult.message ?: "Failed to load regions"
                        )
                    }
                    else -> {
                        val countries = (countriesResult as? Resource.Success)?.data ?: emptyList()
                        val regions = (regionsResult as? Resource.Success)?.data ?: emptyList()

                        _uiState.value = HomeUiState.Success(
                            popularCountries = countries.take(10),
                            regions = regions
                        )
                    }
                }
            } catch (e: Exception) {
                _uiState.value = HomeUiState.Error(
                    e.message ?: "Failed to load home data"
                )
            }
        }
    }

    /**
     * Retry loading home data
     */
    fun retry() {
        loadHomeData()
    }
}
