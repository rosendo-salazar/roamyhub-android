package com.roamyhub.android.core.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * DTO for buy now request
 */
@Serializable
data class BuyNowRequestDto(
    @SerialName("plan_id") val planId: String,
    @SerialName("points_to_redeem") val pointsToRedeem: Int = 0
)

/**
 * DTO for checkout data
 */
@Serializable
data class CheckoutDto(
    @SerialName("id") val id: String,
    @SerialName("user_id") val userId: String,
    @SerialName("plan_id") val planId: String,
    @SerialName("plan_name") val planName: String,
    @SerialName("plan_description") val planDescription: String? = null,
    @SerialName("status") val status: String,
    @SerialName("subtotal") val subtotal: Double,
    @SerialName("discount") val discount: Double = 0.0,
    @SerialName("total") val total: Double,
    @SerialName("currency") val currency: String,
    @SerialName("points_redeemed") val pointsRedeemed: Int = 0,
    @SerialName("points_value") val pointsValue: Double = 0.0,
    @SerialName("payment_intent_id") val paymentIntentId: String? = null,
    @SerialName("stripe_session_id") val stripeSessionId: String? = null,
    @SerialName("order_id") val orderId: String? = null,
    @SerialName("created_at") val createdAt: String,
    @SerialName("updated_at") val updatedAt: String,
    @SerialName("expires_at") val expiresAt: String? = null
)

/**
 * DTO for checkout response
 */
@Serializable
data class CheckoutResponseDto(
    @SerialName("checkout") val checkout: CheckoutDto
)

/**
 * DTO for list of checkouts response
 */
@Serializable
data class CheckoutsResponseDto(
    @SerialName("checkouts") val checkouts: List<CheckoutDto>,
    @SerialName("total") val total: Int
)

/**
 * DTO for cancel checkout response
 */
@Serializable
data class CancelCheckoutResponseDto(
    @SerialName("success") val success: Boolean,
    @SerialName("message") val message: String
)
