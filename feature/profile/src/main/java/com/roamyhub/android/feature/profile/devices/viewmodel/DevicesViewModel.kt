package com.roamyhub.android.feature.profile.devices.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.usecase.device.GetCompatibleDevicesUseCase
import com.roamyhub.android.core.domain.usecase.device.SearchDevicesUseCase
import com.roamyhub.android.feature.profile.devices.state.DevicesUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel for Devices screen
 *
 * Manages device compatibility search and filtering.
 */
@HiltViewModel
class DevicesViewModel @Inject constructor(
    private val getCompatibleDevicesUseCase: GetCompatibleDevicesUseCase,
    private val searchDevicesUseCase: SearchDevicesUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(DevicesUiState())
    val uiState: StateFlow<DevicesUiState> = _uiState.asStateFlow()

    init {
        loadDevices()
    }

    /**
     * Load all compatible devices
     */
    private fun loadDevices() {
        viewModelScope.launch {
            _uiState.update {
                it.copy(
                    isLoading = true,
                    error = null
                )
            }

            when (val result = getCompatibleDevicesUseCase()) {
                is Resource.Success -> {
                    _uiState.update {
                        it.copy(
                            devices = result.data,
                            isLoading = false,
                            error = null
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
                    // No-op
                }
            }
        }
    }

    /**
     * Update search query
     */
    fun onSearchQueryChange(query: String) {
        _uiState.update { it.copy(searchQuery = query) }

        if (query.length >= 2) {
            searchDevices(query)
        } else if (query.isEmpty()) {
            loadDevices()
        }
    }

    /**
     * Search devices
     */
    private fun searchDevices(query: String) {
        viewModelScope.launch {
            _uiState.update {
                it.copy(
                    isLoading = true,
                    error = null
                )
            }

            when (val result = searchDevicesUseCase(query)) {
                is Resource.Success -> {
                    _uiState.update {
                        it.copy(
                            devices = result.data,
                            isLoading = false,
                            error = null
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
                    // No-op
                }
            }
        }
    }

    /**
     * Filter by brand
     */
    fun filterByBrand(brand: String?) {
        _uiState.update { it.copy(selectedBrand = brand) }

        viewModelScope.launch {
            _uiState.update {
                it.copy(
                    isLoading = true,
                    error = null
                )
            }

            when (val result = getCompatibleDevicesUseCase(manufacturer = brand)) {
                is Resource.Success -> {
                    _uiState.update {
                        it.copy(
                            devices = result.data,
                            isLoading = false,
                            error = null
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
                    // No-op
                }
            }
        }
    }

    /**
     * Clear error message
     */
    fun clearError() {
        _uiState.update { it.copy(error = null) }
    }
}
