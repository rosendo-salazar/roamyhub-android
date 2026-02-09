package com.roamyhub.android.core.domain.model.order

import kotlinx.datetime.Instant

/**
 * Domain model representing an order (summary for list views)
 */
data class Order(
    val id: String,
    val userId: String,
    val checkoutId: String,
    val planId: String,
    val planName: String,
    val esimId: String? = null, // Set after eSIM is provisioned

    // Pricing
    val subtotal: Double,
    val discount: Double = 0.0,
    val total: Double,
    val currency: String,

    // Points
    val pointsRedeemed: Int = 0,
    val pointsEarned: Int = 0,

    // Status
    val status: OrderStatus,
    val paymentStatus: PaymentStatus,

    // Metadata
    val createdAt: Instant,
    val updatedAt: Instant
) {
    /**
     * Returns true if the order is completed
     */
    val isCompleted: Boolean
        get() = status == OrderStatus.COMPLETED

    /**
     * Returns true if the order has an eSIM
     */
    val hasESim: Boolean
        get() = esimId != null

    /**
     * Returns a user-friendly status message
     */
    fun getStatusMessage(): String = when (status) {
        OrderStatus.PENDING -> "Processing your order..."
        OrderStatus.PROCESSING -> "Preparing your eSIM..."
        OrderStatus.COMPLETED -> "Order complete"
        OrderStatus.FAILED -> "Order failed"
        OrderStatus.CANCELLED -> "Order cancelled"
        OrderStatus.REFUNDED -> "Order refunded"
    }
}

/**
 * Enum representing order status
 */
enum class OrderStatus {
    PENDING,
    PROCESSING,
    COMPLETED,
    FAILED,
    CANCELLED,
    REFUNDED
}

/**
 * Enum representing payment status
 */
enum class PaymentStatus {
    PENDING,
    PROCESSING,
    SUCCEEDED,
    FAILED,
    CANCELLED,
    REFUNDED,
    REQUIRES_PAYMENT_METHOD,
    REQUIRES_CONFIRMATION,
    REQUIRES_ACTION
}
