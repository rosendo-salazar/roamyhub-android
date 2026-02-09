package com.roamyhub.android.core.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * DTO for region summary
 */
@Serializable
data class RegionSummaryDto(
    @SerialName("region_key") val regionKey: String,
    @SerialName("region_name") val regionName: String,
    @SerialName("description") val description: String? = null,
    @SerialName("country_count") val countryCount: Int,
    @SerialName("plan_count") val planCount: Int,
    @SerialName("starting_price") val startingPrice: Double,
    @SerialName("currency") val currency: String = "USD",
    @SerialName("region_iso3") val regionIso3: String? = null,
    @SerialName("localized_name") val localizedName: String? = null,
    @SerialName("icon_url") val iconUrl: String? = null
)

/**
 * DTO for list of region summaries response
 */
@Serializable
data class RegionSummariesResponseDto(
    @SerialName("summaries") val summaries: List<RegionSummaryDto>,
    @SerialName("total") val total: Int
)

/**
 * DTO for global summary
 */
@Serializable
data class GlobalSummaryDto(
    @SerialName("region_key") val regionKey: String = "global",
    @SerialName("region_name") val regionName: String = "Global",
    @SerialName("description") val description: String? = null,
    @SerialName("country_count") val countryCount: Int,
    @SerialName("plan_count") val planCount: Int,
    @SerialName("starting_price") val startingPrice: Double,
    @SerialName("currency") val currency: String = "USD",
    @SerialName("localized_name") val localizedName: String? = null,
    @SerialName("icon_url") val iconUrl: String? = null
)

/**
 * DTO for global summary response
 */
@Serializable
data class GlobalSummaryResponseDto(
    @SerialName("summary") val summary: GlobalSummaryDto
)
