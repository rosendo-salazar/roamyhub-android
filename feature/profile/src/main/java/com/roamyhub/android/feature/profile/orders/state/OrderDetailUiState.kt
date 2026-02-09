package com.roamyhub.android.feature.profile.orders.state

import com.roamyhub.android.core.domain.model.order.OrderDetail

/**
 * UI state for Order Detail screen
 */
data class OrderDetailUiState(
    val orderDetail: OrderDetail? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
