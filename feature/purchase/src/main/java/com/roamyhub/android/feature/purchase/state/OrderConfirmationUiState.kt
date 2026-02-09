package com.roamyhub.android.feature.purchase.state

import com.roamyhub.android.core.domain.model.esim.ESim
import com.roamyhub.android.core.domain.model.order.OrderDetail

/**
 * UI state for the Order Confirmation screen
 */
data class OrderConfirmationUiState(
    val order: OrderDetail? = null,
    val esim: ESim? = null,

    // Loading states
    val isLoading: Boolean = false,
    val isLoadingESim: Boolean = false,

    // Error state
    val error: String? = null
) {
    /**
     * Returns true if order data is loaded
     */
    val hasOrder: Boolean
        get() = order != null

    /**
     * Returns true if order has an associated eSIM
     */
    val hasESim: Boolean
        get() = order?.esimId != null

    /**
     * Returns true if eSIM data is loaded
     */
    val isESimLoaded: Boolean
        get() = esim != null

    /**
     * Returns true if order earned points
     */
    val hasEarnedPoints: Boolean
        get() = (order?.pointsEarned ?: 0) > 0

    /**
     * Returns true if all data is ready to display
     */
    val isReady: Boolean
        get() = hasOrder && !isLoading
}
