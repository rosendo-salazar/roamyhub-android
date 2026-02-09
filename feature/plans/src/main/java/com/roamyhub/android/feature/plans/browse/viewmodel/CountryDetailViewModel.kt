package com.roamyhub.android.feature.plans.browse.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.repository.PlanRepository
import com.roamyhub.android.feature.plans.browse.state.CountryDetailUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel for the Country Detail screen
 *
 * Displays country information and available plans for a specific country.
 */
@HiltViewModel
class CountryDetailViewModel @Inject constructor(
    private val planRepository: PlanRepository,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val countryIso: String = checkNotNull(savedStateHandle["countryIso"])

    private val _uiState = MutableStateFlow(CountryDetailUiState())
    val uiState: StateFlow<CountryDetailUiState> = _uiState.asStateFlow()

    init {
        loadCountryData()
    }

    /**
     * Load country data and plans
     */
    fun loadCountryData() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, error = null) }

            // Load country summary
            when (val summaryResult = planRepository.getPlansByCountry(countryIso)) {
                is Resource.Success -> {
                    val country = summaryResult.data.firstOrNull()
                    _uiState.update { it.copy(country = country) }
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
            when (val plansResult = planRepository.getCountryPlans(countryIso)) {
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
     * Refresh country data
     */
    fun refresh() {
        loadCountryData()
    }
}
