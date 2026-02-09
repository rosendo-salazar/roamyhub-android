package com.roamyhub.android.core.network.api

import com.roamyhub.android.core.network.model.AccountActionRequestDto
import com.roamyhub.android.core.network.model.AccountActionResponseDto
import com.roamyhub.android.core.network.model.UpdateProfileRequestDto
import com.roamyhub.android.core.network.model.UserDto
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

/**
 * Retrofit API service for user profile endpoints
 */
interface ProfileApiService {

    /**
     * Get user profile
     */
    @GET("profile/{userId}")
    suspend fun getProfile(@Path("userId") userId: String): UserDto

    /**
     * Update user profile
     */
    @PUT("profile/{userId}")
    suspend fun updateProfile(
        @Path("userId") userId: String,
        @Body request: UpdateProfileRequestDto
    ): UserDto

    /**
     * Delete user account
     */
    @POST("account/delete")
    suspend fun deleteAccount(@Body request: AccountActionRequestDto): AccountActionResponseDto

    /**
     * Deactivate user account
     */
    @POST("account/deactivate")
    suspend fun deactivateAccount(@Body request: AccountActionRequestDto): AccountActionResponseDto
}
