package com.roamyhub.android.core.network.api

import com.roamyhub.android.core.network.model.CountriesResponseDto
import com.roamyhub.android.core.network.model.CountrySummariesResponseDto
import com.roamyhub.android.core.network.model.GlobalSummaryResponseDto
import com.roamyhub.android.core.network.model.RegionSummariesResponseDto
import retrofit2.http.GET

/**
 * Retrofit API service for browse/discovery endpoints
 */
interface BrowseApiService {

    /**
     * Get all available countries with eSIM coverage
     */
    @GET("countries")
    suspend fun getCountries(): CountriesResponseDto

    /**
     * Get country summaries for browsing
     */
    @GET("browse/country-summaries")
    suspend fun getCountrySummaries(): CountrySummariesResponseDto

    /**
     * Get region summaries for browsing
     */
    @GET("browse/region-summaries")
    suspend fun getRegionSummaries(): RegionSummariesResponseDto

    /**
     * Get global plan summary
     */
    @GET("browse/global-summary")
    suspend fun getGlobalSummary(): GlobalSummaryResponseDto
}
