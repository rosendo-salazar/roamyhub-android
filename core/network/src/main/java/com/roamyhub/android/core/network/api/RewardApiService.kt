package com.roamyhub.android.core.network.api

import com.roamyhub.android.core.network.model.CalculateDiscountRequestDto
import com.roamyhub.android.core.network.model.CalculateDiscountResponseDto
import com.roamyhub.android.core.network.model.MaxRedeemablePointsResponseDto
import com.roamyhub.android.core.network.model.RewardsSummaryResponseDto
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Retrofit API service for rewards and points endpoints
 */
interface RewardApiService {

    /**
     * Get rewards summary for a user
     */
    @GET("rewards/{userId}")
    suspend fun getRewardsSummary(@Path("userId") userId: String): RewardsSummaryResponseDto

    /**
     * Get maximum redeemable points for a purchase amount
     */
    @GET("profile/points/max-redeemable")
    suspend fun getMaxRedeemablePoints(
        @Query("userId") userId: String,
        @Query("amount") amount: Double
    ): MaxRedeemablePointsResponseDto

    /**
     * Calculate discount based on points redemption
     */
    @POST("profile/points/calculate-discount")
    suspend fun calculateDiscount(@Body request: CalculateDiscountRequestDto): CalculateDiscountResponseDto
}
