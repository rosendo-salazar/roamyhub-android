package com.roamyhub.android.core.domain.usecase.checkout

import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.model.reward.PointsDiscount
import com.roamyhub.android.core.domain.repository.RewardRepository
import javax.inject.Inject

/**
 * Use case for calculating points discount for a plan.
 *
 * Computes the discount amount and final price when applying
 * a specific number of points to a purchase.
 */
class CalculatePointsDiscountUseCase @Inject constructor(
    private val rewardRepository: RewardRepository
) {
    /**
     * Calculate points discount
     *
     * @param planId The plan to calculate discount for
     * @param pointsToRedeem Number of points to apply
     * @return Resource containing PointsDiscount with calculated values
     */
    suspend operator fun invoke(
        planId: String,
        pointsToRedeem: Int
    ): Resource<PointsDiscount> {
        if (pointsToRedeem <= 0) {
            return Resource.Error("Points to redeem must be greater than 0")
        }

        return rewardRepository.calculatePointsDiscount(
            planId = planId,
            pointsToRedeem = pointsToRedeem
        )
    }
}
