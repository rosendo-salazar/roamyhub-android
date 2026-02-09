package com.roamyhub.android.core.data.mapper

import com.roamyhub.android.core.domain.model.reward.PointsDiscount
import com.roamyhub.android.core.domain.model.reward.RewardsSummary
import com.roamyhub.android.core.network.model.PointsDiscountDto
import com.roamyhub.android.core.network.model.RewardsSummaryDto

/**
 * Extension function to convert RewardsSummaryDto to domain RewardsSummary model
 */
fun RewardsSummaryDto.toDomain(): RewardsSummary {
    return RewardsSummary(
        userId = userId,
        totalPoints = totalPoints,
        availablePoints = availablePoints,
        pendingPoints = pendingPoints,
        lifetimePointsEarned = lifetimePointsEarned,
        lifetimePointsRedeemed = lifetimePointsRedeemed,
        maxRedeemablePoints = maxRedeemablePoints,
        pointsValue = pointsValue
    )
}

/**
 * Extension function to convert PointsDiscountDto to domain PointsDiscount model
 */
fun PointsDiscountDto.toDomain(): PointsDiscount {
    return PointsDiscount(
        pointsToRedeem = pointsRedeemed,
        discountAmount = discountAmount,
        originalAmount = subtotal,
        finalAmount = total,
        currency = currency
    )
}
