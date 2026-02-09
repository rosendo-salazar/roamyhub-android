package com.roamyhub.android.core.network.api

import com.roamyhub.android.core.network.model.BuyNowRequestDto
import com.roamyhub.android.core.network.model.CancelCheckoutResponseDto
import com.roamyhub.android.core.network.model.CheckoutResponseDto
import com.roamyhub.android.core.network.model.CheckoutsResponseDto
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

/**
 * Retrofit API service for checkout endpoints
 */
interface CheckoutApiService {

    /**
     * Create a new checkout session (buy now)
     */
    @POST("checkout/{userId}/buy-now")
    suspend fun createCheckout(
        @Path("userId") userId: String,
        @Body request: BuyNowRequestDto
    ): CheckoutResponseDto

    /**
     * Get a specific checkout by ID
     */
    @GET("checkout/{checkoutId}")
    suspend fun getCheckoutById(@Path("checkoutId") checkoutId: String): CheckoutResponseDto

    /**
     * Get all checkouts for a user
     */
    @GET("checkout/user/{userId}/all")
    suspend fun getUserCheckouts(@Path("userId") userId: String): CheckoutsResponseDto

    /**
     * Get pending checkouts for a user
     */
    @GET("checkout/pending")
    suspend fun getPendingCheckouts(): CheckoutsResponseDto

    /**
     * Cancel a checkout
     */
    @POST("checkout/{checkoutId}/cancel")
    suspend fun cancelCheckout(@Path("checkoutId") checkoutId: String): CancelCheckoutResponseDto
}
