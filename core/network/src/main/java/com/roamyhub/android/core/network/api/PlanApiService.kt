package com.roamyhub.android.core.network.api

import com.roamyhub.android.core.network.model.PlanResponseDto
import com.roamyhub.android.core.network.model.PlansResponseDto
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Retrofit API service for plan endpoints
 */
interface PlanApiService {

    /**
     * Get all available plans
     */
    @GET("plans")
    suspend fun getPlans(): PlansResponseDto

    /**
     * Get a specific plan by ID
     */
    @GET("plans/{id}")
    suspend fun getPlanById(@Path("id") planId: String): PlanResponseDto

    /**
     * Get plans for a specific country
     */
    @GET("plans/country/{iso}")
    suspend fun getPlansByCountry(@Path("iso") countryIso: String): PlansResponseDto

    /**
     * Get plans for a specific region
     */
    @GET("plans/region/{key}")
    suspend fun getPlansByRegion(@Path("key") regionKey: String): PlansResponseDto

    /**
     * Get global plans
     */
    @GET("plans/global")
    suspend fun getGlobalPlans(): PlansResponseDto
}
