package com.roamyhub.android.core.data.mapper

import com.roamyhub.android.core.domain.model.payment.PaymentConfig
import com.roamyhub.android.core.domain.model.payment.StripeSession
import com.roamyhub.android.core.network.model.PaymentConfigDto
import com.roamyhub.android.core.network.model.StripeSessionDto

/**
 * Extension function to convert PaymentConfigDto to domain PaymentConfig model
 */
fun PaymentConfigDto.toDomain(): PaymentConfig {
    return PaymentConfig(
        stripePublishableKey = stripePublishableKey,
        stripeMerchantId = stripeMerchantId,
        supportedCurrencies = supportedCurrencies,
        minimumAmount = minimumAmount,
        maximumAmount = maximumAmount
    )
}

/**
 * Extension function to convert StripeSessionDto to domain StripeSession model
 */
fun StripeSessionDto.toDomain(): StripeSession {
    return StripeSession(
        sessionId = sessionId,
        clientSecret = clientSecret ?: "",
        publishableKey = publishableKey,
        customerId = null,
        ephemeralKey = null
    )
}
