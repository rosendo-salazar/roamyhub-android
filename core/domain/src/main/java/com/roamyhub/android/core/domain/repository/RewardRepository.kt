package com.roamyhub.android.core.domain.repository

import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.model.reward.PointsDiscount
import com.roamyhub.android.core.domain.model.reward.RewardsSummary
import kotlinx.coroutines.flow.Flow

/**
 * Repository interface for rewards and points operations.
 *
 * Manages user reward points, points redemption calculations,
 * and points history tracking.
 */
interface RewardRepository {

    /**
     * Observe the current user's rewards summary
     *
     * Emits updates whenever the user's points balance or tier changes
     * (e.g., points earned from purchase, points redeemed, tier upgrade).
     *
     * @return Flow emitting RewardsSummary with current points and tier information
     */
    fun getRewardsSummary(): Flow<Resource<RewardsSummary>>

    /**
     * Calculate points discount for a plan
     *
     * Computes the discount amount and final price when applying
     * a specific number of points to a plan purchase.
     *
     * @param planId Unique identifier of the plan
     * @param pointsToRedeem Number of points to apply
     * @return Resource containing PointsDiscount with calculated values
     */
    suspend fun calculatePointsDiscount(
        planId: String,
        pointsToRedeem: Int
    ): Resource<PointsDiscount>

    /**
     * Get maximum redeemable points for a plan
     *
     * Returns the maximum number of points that can be applied
     * to a specific plan, considering plan rules and user's balance.
     *
     * @param planId Unique identifier of the plan
     * @return Resource containing the maximum points that can be redeemed
     */
    suspend fun getMaxRedeemablePoints(planId: String): Resource<Int>
}
