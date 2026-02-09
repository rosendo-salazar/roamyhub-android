package com.roamyhub.android.core.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * DTO for order data
 */
@Serializable
data class OrderDto(
    @SerialName("id") val id: String,
    @SerialName("user_id") val userId: String,
    @SerialName("checkout_id") val checkoutId: String,
    @SerialName("plan_id") val planId: String,
    @SerialName("plan_name") val planName: String,
    @SerialName("esim_id") val esimId: String? = null,
    @SerialName("subtotal") val subtotal: Double,
    @SerialName("discount") val discount: Double = 0.0,
    @SerialName("total") val total: Double,
    @SerialName("currency") val currency: String,
    @SerialName("points_redeemed") val pointsRedeemed: Int = 0,
    @SerialName("points_earned") val pointsEarned: Int = 0,
    @SerialName("status") val status: String,
    @SerialName("payment_status") val paymentStatus: String,
    @SerialName("created_at") val createdAt: String,
    @SerialName("updated_at") val updatedAt: String
)

/**
 * DTO for paginated orders response
 */
@Serializable
data class OrdersResponseDto(
    @SerialName("orders") val orders: List<OrderDto>,
    @SerialName("total") val total: Int,
    @SerialName("page") val page: Int,
    @SerialName("page_size") val pageSize: Int,
    @SerialName("total_pages") val totalPages: Int
)

/**
 * DTO for order detail
 */
@Serializable
data class OrderDetailDto(
    @SerialName("id") val id: String,
    @SerialName("user_id") val userId: String,
    @SerialName("checkout_id") val checkoutId: String,
    @SerialName("plan_id") val planId: String,
    @SerialName("plan_name") val planName: String,
    @SerialName("plan_description") val planDescription: String? = null,
    @SerialName("data_amount") val dataAmount: Long,
    @SerialName("validity_days") val validityDays: Int,
    @SerialName("coverage_description") val coverageDescription: String,
    @SerialName("esim_id") val esimId: String? = null,
    @SerialName("iccid") val iccid: String? = null,
    @SerialName("esim_status") val esimStatus: String? = null,
    @SerialName("subtotal") val subtotal: Double,
    @SerialName("discount") val discount: Double = 0.0,
    @SerialName("tax") val tax: Double = 0.0,
    @SerialName("total") val total: Double,
    @SerialName("currency") val currency: String,
    @SerialName("points_redeemed") val pointsRedeemed: Int = 0,
    @SerialName("points_value") val pointsValue: Double = 0.0,
    @SerialName("points_earned") val pointsEarned: Int = 0,
    @SerialName("payment_method") val paymentMethod: String? = null,
    @SerialName("payment_intent_id") val paymentIntentId: String? = null,
    @SerialName("receipt_url") val receiptUrl: String? = null,
    @SerialName("status") val status: String,
    @SerialName("payment_status") val paymentStatus: String,
    @SerialName("status_history") val statusHistory: List<OrderStatusUpdateDto> = emptyList(),
    @SerialName("created_at") val createdAt: String,
    @SerialName("updated_at") val updatedAt: String,
    @SerialName("completed_at") val completedAt: String? = null,
    @SerialName("cancelled_at") val cancelledAt: String? = null
)

/**
 * DTO for order status update
 */
@Serializable
data class OrderStatusUpdateDto(
    @SerialName("status") val status: String,
    @SerialName("message") val message: String,
    @SerialName("timestamp") val timestamp: String
)

/**
 * DTO for order detail response
 */
@Serializable
data class OrderDetailResponseDto(
    @SerialName("order") val order: OrderDetailDto
)
