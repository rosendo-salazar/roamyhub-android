package com.roamyhub.android.core.network.api

import com.roamyhub.android.core.network.model.OrderDetailResponseDto
import com.roamyhub.android.core.network.model.OrdersResponseDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Retrofit API service for order endpoints
 */
interface OrderApiService {

    /**
     * Get paginated orders for a user
     */
    @GET("orders/{userId}")
    suspend fun getUserOrders(
        @Path("userId") userId: String,
        @Query("page") page: Int = 1,
        @Query("pageSize") pageSize: Int = 20
    ): OrdersResponseDto

    /**
     * Get detailed order information
     */
    @GET("orders/{userId}/{orderId}")
    suspend fun getOrderDetail(
        @Path("userId") userId: String,
        @Path("orderId") orderId: String
    ): OrderDetailResponseDto
}
