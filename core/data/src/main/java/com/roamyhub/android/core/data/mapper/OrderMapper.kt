package com.roamyhub.android.core.data.mapper

import com.roamyhub.android.core.domain.model.order.Order
import com.roamyhub.android.core.domain.model.order.OrderDetail
import com.roamyhub.android.core.domain.model.order.OrderStatus
import com.roamyhub.android.core.domain.model.order.OrderStatusUpdate
import com.roamyhub.android.core.domain.model.order.PaymentStatus
import com.roamyhub.android.core.network.model.OrderDetailDto
import com.roamyhub.android.core.network.model.OrderDto
import com.roamyhub.android.core.network.model.OrderStatusUpdateDto
import kotlinx.datetime.Instant

/**
 * Extension function to convert OrderDto to domain Order model
 */
fun OrderDto.toDomain(): Order {
    return Order(
        id = id,
        userId = userId,
        checkoutId = checkoutId,
        planId = planId,
        planName = planName,
        esimId = esimId,
        subtotal = subtotal,
        discount = discount,
        total = total,
        currency = currency,
        pointsRedeemed = pointsRedeemed,
        pointsEarned = pointsEarned,
        status = parseOrderStatus(status),
        paymentStatus = parsePaymentStatus(paymentStatus),
        createdAt = Instant.parse(createdAt),
        updatedAt = Instant.parse(updatedAt)
    )
}

/**
 * Extension function to convert OrderDetailDto to domain OrderDetail model
 */
fun OrderDetailDto.toDomain(): OrderDetail {
    return OrderDetail(
        id = id,
        userId = userId,
        checkoutId = checkoutId,
        planId = planId,
        planName = planName,
        planDescription = planDescription,
        dataAmount = dataAmount,
        validityDays = validityDays,
        coverageDescription = coverageDescription,
        esimId = esimId,
        iccid = iccid,
        esimStatus = esimStatus,
        subtotal = subtotal,
        discount = discount,
        tax = tax,
        total = total,
        currency = currency,
        pointsRedeemed = pointsRedeemed,
        pointsValue = pointsValue,
        pointsEarned = pointsEarned,
        paymentMethod = paymentMethod,
        paymentIntentId = paymentIntentId,
        receiptUrl = receiptUrl,
        status = parseOrderStatus(status),
        paymentStatus = parsePaymentStatus(paymentStatus),
        statusHistory = statusHistory.map { it.toDomain() },
        createdAt = Instant.parse(createdAt),
        updatedAt = Instant.parse(updatedAt),
        completedAt = completedAt?.let { Instant.parse(it) },
        cancelledAt = cancelledAt?.let { Instant.parse(it) }
    )
}

/**
 * Extension function to convert OrderStatusUpdateDto to domain OrderStatusUpdate model
 */
fun OrderStatusUpdateDto.toDomain(): OrderStatusUpdate {
    return OrderStatusUpdate(
        status = parseOrderStatus(status),
        message = message,
        timestamp = Instant.parse(timestamp)
    )
}

/**
 * Parse order status string to enum
 */
private fun parseOrderStatus(status: String): OrderStatus {
    return when (status.uppercase()) {
        "PENDING" -> OrderStatus.PENDING
        "PROCESSING" -> OrderStatus.PROCESSING
        "COMPLETED" -> OrderStatus.COMPLETED
        "FAILED" -> OrderStatus.FAILED
        "CANCELLED" -> OrderStatus.CANCELLED
        "REFUNDED" -> OrderStatus.REFUNDED
        else -> OrderStatus.PENDING
    }
}

/**
 * Parse payment status string to enum
 */
private fun parsePaymentStatus(status: String): PaymentStatus {
    return when (status.uppercase()) {
        "PENDING" -> PaymentStatus.PENDING
        "PROCESSING" -> PaymentStatus.PROCESSING
        "SUCCEEDED" -> PaymentStatus.SUCCEEDED
        "FAILED" -> PaymentStatus.FAILED
        "REFUNDED" -> PaymentStatus.REFUNDED
        else -> PaymentStatus.PENDING
    }
}
