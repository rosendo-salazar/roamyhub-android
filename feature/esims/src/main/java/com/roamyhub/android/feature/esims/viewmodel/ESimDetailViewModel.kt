package com.roamyhub.android.feature.esims.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.repository.ESimRepository
import com.roamyhub.android.feature.esims.state.ESimDetailUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel for eSIM detail screen
 *
 * Manages individual eSIM details and deletion.
 */
@HiltViewModel
class ESimDetailViewModel @Inject constructor(
    private val eSimRepository: ESimRepository,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val esimId: String = checkNotNull(savedStateHandle["esimId"])

    private val _uiState = MutableStateFlow(ESimDetailUiState())
    val uiState: StateFlow<ESimDetailUiState> = _uiState.asStateFlow()

    init {
        loadESim()
    }

    /**
     * Load eSIM details
     */
    fun loadESim() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, error = null) }

            when (val result = eSimRepository.getESimById(esimId)) {
                is Resource.Success -> {
                    _uiState.update {
                        it.copy(
                            esim = result.data,
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
                    // Already in loading state
                }
            }
        }
    }

    /**
     * Delete the current eSIM
     */
    fun deleteESim(onSuccess: () -> Unit) {
        viewModelScope.launch {
            _uiState.update { it.copy(isDeleting = true, deleteError = null) }

            when (val result = eSimRepository.deleteESim(esimId)) {
                is Resource.Success -> {
                    _uiState.update {
                        it.copy(isDeleting = false, deleteError = null)
                    }
                    onSuccess()
                }
                is Resource.Error -> {
                    _uiState.update {
                        it.copy(
                            deleteError = result.message,
                            isDeleting = false
                        )
                    }
                }
                is Resource.Loading -> {
                    // Already in deleting state
                }
            }
        }
    }
}
