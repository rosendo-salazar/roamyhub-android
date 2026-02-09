package com.roamyhub.android.feature.profile.orders.state

import com.roamyhub.android.core.domain.model.order.Order

/**
 * UI state for Orders screen
 */
data class OrdersUiState(
    val orders: List<Order> = emptyList(),
    val isLoading: Boolean = false,
    val isLoadingMore: Boolean = false,
    val isRefreshing: Boolean = false,
    val error: String? = null,
    val currentPage: Int = 0,
    val hasMorePages: Boolean = true
) {
    /**
     * Returns true if there are no orders
     */
    val isEmpty: Boolean
        get() = orders.isEmpty() && !isLoading

    /**
     * Returns true if we can load more orders
     */
    val canLoadMore: Boolean
        get() = hasMorePages && !isLoading && !isLoadingMore
}
