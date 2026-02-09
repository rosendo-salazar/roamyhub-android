package com.roamyhub.android.core.data.mapper

import com.roamyhub.android.core.domain.model.checkout.Checkout
import com.roamyhub.android.core.domain.model.checkout.CheckoutStatus
import com.roamyhub.android.core.network.model.CheckoutDto
import kotlinx.datetime.Instant

/**
 * Extension function to convert CheckoutDto to domain Checkout model
 */
fun CheckoutDto.toDomain(): Checkout {
    return Checkout(
        id = id,
        userId = userId,
        planId = planId,
        planName = planName,
        planDescription = planDescription,
        status = parseCheckoutStatus(status),
        subtotal = subtotal,
        discount = discount,
        total = total,
        currency = currency,
        pointsRedeemed = pointsRedeemed,
        pointsValue = pointsValue,
        paymentIntentId = paymentIntentId,
        stripeSessionId = stripeSessionId,
        orderId = orderId,
        createdAt = Instant.parse(createdAt),
        updatedAt = Instant.parse(updatedAt),
        expiresAt = expiresAt?.let { Instant.parse(it) }
    )
}

/**
 * Parse checkout status string to enum
 */
private fun parseCheckoutStatus(status: String): CheckoutStatus {
    return when (status.uppercase()) {
        "PENDING" -> CheckoutStatus.PENDING
        "PROCESSING" -> CheckoutStatus.PROCESSING
        "COMPLETED" -> CheckoutStatus.COMPLETED
        "FAILED" -> CheckoutStatus.FAILED
        "EXPIRED" -> CheckoutStatus.EXPIRED
        "CANCELLED" -> CheckoutStatus.CANCELLED
        else -> CheckoutStatus.PENDING
    }
}
