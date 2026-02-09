package com.roamyhub.android.core.domain.model.checkout

import kotlinx.datetime.Instant

/**
 * Domain model representing a checkout session
 */
data class Checkout(
    val id: String,
    val userId: String,
    val planId: String,
    val planName: String,
    val planDescription: String? = null,
    val status: CheckoutStatus,

    // Pricing
    val subtotal: Double, // Price before discounts
    val discount: Double = 0.0, // Discount amount
    val total: Double, // Final price after discounts
    val currency: String,

    // Points redemption
    val pointsRedeemed: Int = 0,
    val pointsValue: Double = 0.0, // Dollar value of redeemed points

    // Payment info
    val paymentIntentId: String? = null,
    val stripeSessionId: String? = null,

    // Order info
    val orderId: String? = null, // Set after successful payment

    // Metadata
    val createdAt: Instant,
    val updatedAt: Instant,
    val expiresAt: Instant? = null
) {
    /**
     * Returns true if points were redeemed
     */
    val hasPointsRedeemed: Boolean
        get() = pointsRedeemed > 0

    /**
     * Returns true if payment is required (total > 0)
     */
    val requiresPayment: Boolean
        get() = total > 0

    /**
     * Returns true if this is a zero-cost checkout (fully paid with points)
     */
    val isZeroCost: Boolean
        get() = total == 0.0

    /**
     * Returns the savings percentage
     */
    fun getSavingsPercentage(): Int {
        return if (subtotal > 0) {
            ((discount / subtotal) * 100).toInt()
        } else {
            0
        }
    }
}
