package com.roamyhub.android.core.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * DTO for rewards summary
 */
@Serializable
data class RewardsSummaryDto(
    @SerialName("user_id") val userId: String,
    @SerialName("total_points") val totalPoints: Int,
    @SerialName("available_points") val availablePoints: Int,
    @SerialName("pending_points") val pendingPoints: Int = 0,
    @SerialName("lifetime_points_earned") val lifetimePointsEarned: Int,
    @SerialName("lifetime_points_redeemed") val lifetimePointsRedeemed: Int,
    @SerialName("max_redeemable_points") val maxRedeemablePoints: Int,
    @SerialName("points_value") val pointsValue: Double
)

/**
 * DTO for rewards summary response
 */
@Serializable
data class RewardsSummaryResponseDto(
    @SerialName("rewards") val rewards: RewardsSummaryDto
)

/**
 * DTO for max redeemable points response
 */
@Serializable
data class MaxRedeemablePointsResponseDto(
    @SerialName("max_redeemable_points") val maxRedeemablePoints: Int,
    @SerialName("points_value") val pointsValue: Double
)

/**
 * DTO for calculate discount request
 */
@Serializable
data class CalculateDiscountRequestDto(
    @SerialName("user_id") val userId: String,
    @SerialName("plan_id") val planId: String,
    @SerialName("points_to_redeem") val pointsToRedeem: Int
)

/**
 * DTO for points discount
 */
@Serializable
data class PointsDiscountDto(
    @SerialName("points_redeemed") val pointsRedeemed: Int,
    @SerialName("discount_amount") val discountAmount: Double,
    @SerialName("subtotal") val subtotal: Double,
    @SerialName("total") val total: Double,
    @SerialName("currency") val currency: String
)

/**
 * DTO for calculate discount response
 */
@Serializable
data class CalculateDiscountResponseDto(
    @SerialName("discount") val discount: PointsDiscountDto
)
