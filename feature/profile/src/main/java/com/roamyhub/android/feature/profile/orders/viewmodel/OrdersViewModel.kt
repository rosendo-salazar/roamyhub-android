package com.roamyhub.android.feature.profile.orders.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.usecase.order.GetOrdersUseCase
import com.roamyhub.android.feature.profile.orders.state.OrdersUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel for Orders screen
 *
 * Manages paginated order history with pull-to-refresh.
 */
@HiltViewModel
class OrdersViewModel @Inject constructor(
    private val getOrdersUseCase: GetOrdersUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(OrdersUiState())
    val uiState: StateFlow<OrdersUiState> = _uiState.asStateFlow()

    init {
        loadOrders()
    }

    /**
     * Load orders (initial page)
     */
    fun loadOrders() {
        viewModelScope.launch {
            _uiState.update {
                it.copy(
                    isLoading = true,
                    error = null,
                    currentPage = 0
                )
            }

            when (val result = getOrdersUseCase(page = 0, pageSize = 20)) {
                is Resource.Success -> {
                    _uiState.update {
                        it.copy(
                            orders = result.data,
                            isLoading = false,
                            currentPage = 0,
                            hasMorePages = result.data.size >= 20,
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
     * Refresh orders (pull-to-refresh)
     */
    fun refresh() {
        viewModelScope.launch {
            _uiState.update {
                it.copy(
                    isRefreshing = true,
                    error = null
                )
            }

            when (val result = getOrdersUseCase(page = 0, pageSize = 20)) {
                is Resource.Success -> {
                    _uiState.update {
                        it.copy(
                            orders = result.data,
                            isRefreshing = false,
                            currentPage = 0,
                            hasMorePages = result.data.size >= 20,
                            error = null
                        )
                    }
                }
                is Resource.Error -> {
                    _uiState.update {
                        it.copy(
                            error = result.message,
                            isRefreshing = false
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
     * Load more orders (pagination)
     */
    fun loadMore() {
        val currentState = _uiState.value
        if (!currentState.canLoadMore) return

        viewModelScope.launch {
            val nextPage = currentState.currentPage + 1

            _uiState.update {
                it.copy(
                    isLoadingMore = true,
                    error = null
                )
            }

            when (val result = getOrdersUseCase(page = nextPage, pageSize = 20)) {
                is Resource.Success -> {
                    _uiState.update {
                        it.copy(
                            orders = it.orders + result.data,
                            isLoadingMore = false,
                            currentPage = nextPage,
                            hasMorePages = result.data.size >= 20,
                            error = null
                        )
                    }
                }
                is Resource.Error -> {
                    _uiState.update {
                        it.copy(
                            error = result.message,
                            isLoadingMore = false
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
