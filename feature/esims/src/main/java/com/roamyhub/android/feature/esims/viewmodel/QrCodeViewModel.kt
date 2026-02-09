package com.roamyhub.android.feature.esims.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.repository.ESimRepository
import com.roamyhub.android.feature.esims.state.QrCodeUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel for QR code screen
 *
 * Manages QR code data and copy-to-clipboard feedback.
 */
@HiltViewModel
class QrCodeViewModel @Inject constructor(
    private val eSimRepository: ESimRepository,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val esimId: String = checkNotNull(savedStateHandle["esimId"])

    private val _uiState = MutableStateFlow(QrCodeUiState())
    val uiState: StateFlow<QrCodeUiState> = _uiState.asStateFlow()

    init {
        loadQrCode()
    }

    /**
     * Load QR code data
     */
    fun loadQrCode() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, error = null) }

            when (val result = eSimRepository.getESimQrCode(esimId)) {
                is Resource.Success -> {
                    _uiState.update {
                        it.copy(
                            qrCodeData = result.data,
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
     * Mark that a field was copied
     */
    fun onFieldCopied(field: QrCodeUiState.CopiedField) {
        _uiState.update { it.copy(copiedField = field) }
    }

    /**
     * Clear the copied field state
     */
    fun clearCopiedState() {
        _uiState.update { it.copy(copiedField = null) }
    }
}
