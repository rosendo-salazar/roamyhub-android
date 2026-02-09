package com.roamyhub.android.feature.purchase.state

import com.roamyhub.android.core.domain.model.checkout.Checkout
import com.roamyhub.android.core.domain.model.payment.PaymentConfig
import com.roamyhub.android.core.domain.model.plan.Plan

/**
 * UI state for the Checkout screen
 */
data class CheckoutUiState(
    val plan: Plan? = null,
    val checkout: Checkout? = null,
    val paymentConfig: PaymentConfig? = null,

    // Points redemption
    val pointsToRedeem: Int = 0,
    val maxRedeemablePoints: Int = 0,
    val availablePoints: Int = 0,

    // Calculated values
    val discountAmount: Double = 0.0,
    val finalTotal: Double = 0.0,

    // Loading states
    val isLoading: Boolean = false,
    val isProcessingPayment: Boolean = false,
    val isLoadingPaymentConfig: Boolean = false,
    val isCreatingCheckout: Boolean = false,

    // Error state
    val error: String? = null,
    val paymentError: String? = null
) {
    /**
     * Returns true if user can redeem points
     */
    val canRedeem: Boolean
        get() = availablePoints > 0 && maxRedeemablePoints > 0

    /**
     * Returns true if payment via Stripe is required
     */
    val requiresPayment: Boolean
        get() = finalTotal > 0

    /**
     * Returns true if this is a zero-cost checkout (fully covered by points)
     */
    val isZeroCost: Boolean
        get() = finalTotal == 0.0 && checkout != null

    /**
     * Returns true if all data needed for checkout is loaded
     */
    val isReady: Boolean
        get() = plan != null && paymentConfig != null && !isLoading

    /**
     * Returns true if user can proceed with payment
     */
    val canProceed: Boolean
        get() = isReady && checkout != null && !isProcessingPayment

    /**
     * Returns the subtotal before any discounts
     */
    val subtotal: Double
        get() = checkout?.subtotal ?: plan?.price ?: 0.0

    /**
     * Returns the currency code
     */
    val currency: String
        get() = checkout?.currency ?: plan?.currency ?: "USD"
}
