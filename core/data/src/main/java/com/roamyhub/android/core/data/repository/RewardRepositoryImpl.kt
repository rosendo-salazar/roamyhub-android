package com.roamyhub.android.core.data.repository

import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.data.mapper.toDomain
import com.roamyhub.android.core.domain.model.reward.PointsDiscount
import com.roamyhub.android.core.domain.model.reward.RewardsSummary
import com.roamyhub.android.core.domain.repository.RewardRepository
import com.roamyhub.android.core.network.api.RewardApiService
import com.roamyhub.android.core.network.model.CalculateDiscountRequestDto
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Implementation of RewardRepository.
 *
 * Handles rewards and points management.
 */
@Singleton
class RewardRepositoryImpl @Inject constructor(
    private val rewardApiService: RewardApiService
) : RewardRepository {

    companion object {
        private const val TAG = "RewardRepositoryImpl"
    }

    private val auth: FirebaseAuth by lazy { FirebaseAuth.getInstance() }

    override fun getRewardsSummary(): Flow<Resource<RewardsSummary>> = flow {
        emit(Resource.Loading())

        try {
            val userId = auth.currentUser?.uid
                ?: throw IllegalStateException("User not authenticated")

            val response = rewardApiService.getRewardsSummary(userId)
            val summary = response.rewards.toDomain()
            emit(Resource.Success(summary))
        } catch (e: Exception) {
            Log.e(TAG, "Failed to fetch rewards summary", e)
            emit(Resource.Error(e.message ?: "Failed to fetch rewards summary"))
        }
    }

    override suspend fun getMaxRedeemablePoints(planId: String): Resource<Int> {
        return try {
            val userId = auth.currentUser?.uid
                ?: return Resource.Error("User not authenticated")

            // Get plan details to get the price
            val response = rewardApiService.getMaxRedeemablePoints(
                userId = userId,
                amount = 0.0 // TODO: Get plan price first
            )
            Resource.Success(response.maxRedeemablePoints)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to fetch max redeemable points", e)
            Resource.Error(e.message ?: "Failed to calculate max redeemable points")
        }
    }

    override suspend fun calculatePointsDiscount(
        planId: String,
        pointsToRedeem: Int
    ): Resource<PointsDiscount> {
        return try {
            val userId = auth.currentUser?.uid
                ?: return Resource.Error("User not authenticated")

            val request = CalculateDiscountRequestDto(
                userId = userId,
                planId = planId,
                pointsToRedeem = pointsToRedeem
            )

            val response = rewardApiService.calculateDiscount(request)
            val discount = response.discount.toDomain()
            Resource.Success(discount)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to calculate discount", e)
            Resource.Error(e.message ?: "Failed to calculate discount")
        }
    }
}
