package com.roamyhub.android.core.network.api

import com.roamyhub.android.core.network.model.CompatibleDevicesResponseDto
import com.roamyhub.android.core.network.model.DeviceSearchResponseDto
import com.roamyhub.android.core.network.model.LegalLinksResponseDto
import com.roamyhub.android.core.network.model.VersionCheckResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Retrofit API service for public endpoints (no auth required)
 */
interface PublicApiService {

    /**
     * Check app version and get update information
     */
    @GET("public/version/check")
    suspend fun checkVersion(@Query("currentVersion") currentVersion: String): VersionCheckResponseDto

    /**
     * Get list of compatible devices
     */
    @GET("public/devices/compatible")
    suspend fun getCompatibleDevices(): CompatibleDevicesResponseDto

    /**
     * Search for devices by query
     */
    @GET("public/devices/search")
    suspend fun searchDevices(@Query("query") query: String): DeviceSearchResponseDto

    /**
     * Get legal document links
     */
    @GET("public/config/legal-links")
    suspend fun getLegalLinks(): LegalLinksResponseDto
}
