package com.roamyhub.android.feature.purchase.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.repository.ESimRepository
import com.roamyhub.android.core.domain.repository.OrderRepository
import com.roamyhub.android.feature.purchase.state.OrderConfirmationUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel for the Order Confirmation screen.
 *
 * Displays order details and associated eSIM after successful payment.
 */
@HiltViewModel
class OrderConfirmationViewModel @Inject constructor(
    private val orderRepository: OrderRepository,
    private val eSimRepository: ESimRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(OrderConfirmationUiState())
    val uiState: StateFlow<OrderConfirmationUiState> = _uiState.asStateFlow()

    /**
     * Load order details
     */
    fun loadOrder(orderId: String) {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, error = null) }

            when (val result = orderRepository.getOrderById(orderId)) {
                is Resource.Success -> {
                    val order = result.data
                    _uiState.update {
                        it.copy(
                            order = order,
                            isLoading = false
                        )
                    }

                    // Load eSIM if available
                    order.esimId?.let { esimId ->
                        loadESim(esimId)
                    }
                }

                is Resource.Error -> {
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            error = result.message ?: "Failed to load order"
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
     * Load eSIM details
     */
    private fun loadESim(esimId: String) {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoadingESim = true) }

            when (val result = eSimRepository.getESimById(esimId)) {
                is Resource.Success -> {
                    _uiState.update {
                        it.copy(
                            esim = result.data,
                            isLoadingESim = false
                        )
                    }
                }

                is Resource.Error -> {
                    // Don't fail the whole screen if eSIM load fails
                    _uiState.update {
                        it.copy(isLoadingESim = false)
                    }
                }

                is Resource.Loading -> {
                    // Already in loading state
                }
            }
        }
    }

    /**
     * Retry loading order
     */
    fun retryLoadOrder(orderId: String) {
        loadOrder(orderId)
    }

    /**
     * Clear error
     */
    fun clearError() {
        _uiState.update { it.copy(error = null) }
    }
}
