package com.roamyhub.android.core.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * DTO for payment configuration
 */
@Serializable
data class PaymentConfigDto(
    @SerialName("stripe_publishable_key") val stripePublishableKey: String,
    @SerialName("stripe_merchant_id") val stripeMerchantId: String? = null,
    @SerialName("supported_currencies") val supportedCurrencies: List<String> = emptyList(),
    @SerialName("minimum_amount") val minimumAmount: Double = 0.0,
    @SerialName("maximum_amount") val maximumAmount: Double = 0.0
)

/**
 * DTO for payment config response
 */
@Serializable
data class PaymentConfigResponseDto(
    @SerialName("config") val config: PaymentConfigDto
)

/**
 * DTO for Stripe session
 */
@Serializable
data class StripeSessionDto(
    @SerialName("session_id") val sessionId: String,
    @SerialName("publishable_key") val publishableKey: String,
    @SerialName("client_secret") val clientSecret: String? = null,
    @SerialName("checkout_id") val checkoutId: String
)

/**
 * DTO for Stripe session response
 */
@Serializable
data class StripeSessionResponseDto(
    @SerialName("session") val session: StripeSessionDto
)
