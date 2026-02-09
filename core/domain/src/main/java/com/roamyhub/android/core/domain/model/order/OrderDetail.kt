package com.roamyhub.android.core.domain.model.order

import kotlinx.datetime.Instant

/**
 * Domain model representing detailed order information
 */
data class OrderDetail(
    val id: String,
    val userId: String,
    val checkoutId: String,

    // Plan details
    val planId: String,
    val planName: String,
    val planDescription: String? = null,
    val dataAmount: Long, // MB
    val validityDays: Int,
    val coverageDescription: String,

    // eSIM details
    val esimId: String? = null,
    val iccid: String? = null,
    val esimStatus: String? = null,

    // Pricing breakdown
    val subtotal: Double,
    val discount: Double = 0.0,
    val tax: Double = 0.0,
    val total: Double,
    val currency: String,

    // Points
    val pointsRedeemed: Int = 0,
    val pointsValue: Double = 0.0,
    val pointsEarned: Int = 0,

    // Payment info
    val paymentMethod: String? = null,
    val paymentIntentId: String? = null,
    val receiptUrl: String? = null,

    // Status
    val status: OrderStatus,
    val paymentStatus: PaymentStatus,
    val statusHistory: List<OrderStatusUpdate> = emptyList(),

    // Metadata
    val createdAt: Instant,
    val updatedAt: Instant,
    val completedAt: Instant? = null,
    val cancelledAt: Instant? = null
) {
    /**
     * Returns true if the order can be cancelled
     */
    val canBeCancelled: Boolean
        get() = status in listOf(OrderStatus.PENDING, OrderStatus.PROCESSING) &&
                paymentStatus != PaymentStatus.REFUNDED

    /**
     * Returns true if the order has a receipt
     */
    val hasReceipt: Boolean
        get() = receiptUrl != null

    /**
     * Returns the most recent status update
     */
    fun getLatestStatusUpdate(): OrderStatusUpdate? = statusHistory.maxByOrNull { it.timestamp }
}

/**
 * Represents a status change in the order
 */
data class OrderStatusUpdate(
    val status: OrderStatus,
    val message: String,
    val timestamp: Instant
)
