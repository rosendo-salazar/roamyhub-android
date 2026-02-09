package com.roamyhub.android.feature.esims.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.repository.ESimRepository
import com.roamyhub.android.feature.esims.state.ESimListUiState
import com.roamyhub.android.feature.esims.state.ESimTab
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel for eSIM list screen
 *
 * Manages the user's eSIM collection with filtering by status.
 */
@HiltViewModel
class ESimListViewModel @Inject constructor(
    private val eSimRepository: ESimRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(ESimListUiState())
    val uiState: StateFlow<ESimListUiState> = _uiState.asStateFlow()

    init {
        loadESims()
    }

    /**
     * Load user's eSIMs
     */
    fun loadESims() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, error = null) }

            eSimRepository.getUserESims().collect { resource ->
                when (resource) {
                    is Resource.Loading -> {
                        _uiState.update {
                            it.copy(
                                isLoading = true,
                                error = null
                            )
                        }
                    }
                    is Resource.Success -> {
                        _uiState.update {
                            it.copy(
                                esims = resource.data,
                                isLoading = false,
                                isRefreshing = false,
                                error = null
                            )
                        }
                    }
                    is Resource.Error -> {
                        _uiState.update {
                            it.copy(
                                error = resource.message,
                                isLoading = false,
                                isRefreshing = false
                            )
                        }
                    }
                }
            }
        }
    }

    /**
     * Refresh eSIMs (pull-to-refresh)
     */
    fun refresh() {
        viewModelScope.launch {
            _uiState.update { it.copy(isRefreshing = true, error = null) }
            loadESims()
        }
    }

    /**
     * Change selected tab
     */
    fun onTabChange(tab: ESimTab) {
        _uiState.update { it.copy(selectedTab = tab) }
    }

    /**
     * Delete an eSIM
     */
    fun deleteESim(esimId: String) {
        viewModelScope.launch {
            when (val result = eSimRepository.deleteESim(esimId)) {
                is Resource.Success -> {
                    // eSIM deleted successfully - the Flow will update automatically
                }
                is Resource.Error -> {
                    _uiState.update {
                        it.copy(error = result.message)
                    }
                }
                is Resource.Loading -> {
                    // No-op
                }
            }
        }
    }
}
