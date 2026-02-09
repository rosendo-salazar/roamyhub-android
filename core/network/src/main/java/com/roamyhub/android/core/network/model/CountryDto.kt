package com.roamyhub.android.core.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * DTO for country data
 */
@Serializable
data class CountryDto(
    @SerialName("code") val code: String,
    @SerialName("name") val name: String,
    @SerialName("flag_emoji") val flagEmoji: String,
    @SerialName("region") val region: String,
    @SerialName("continent") val continent: String,
    @SerialName("available_plans_count") val availablePlansCount: Int,
    @SerialName("iso3") val iso3: String? = null,
    @SerialName("localized_name") val localizedName: String? = null,
    @SerialName("flag_urls") val flagUrls: CountryFlagUrlsDto? = null
)

/**
 * DTO for country flag URLs
 */
@Serializable
data class CountryFlagUrlsDto(
    @SerialName("small") val small: String,
    @SerialName("medium") val medium: String,
    @SerialName("large") val large: String,
    @SerialName("xlarge") val xlarge: String,
    @SerialName("xxlarge") val xxlarge: String,
    @SerialName("svg") val svg: String
)

/**
 * DTO for list of countries response
 */
@Serializable
data class CountriesResponseDto(
    @SerialName("countries") val countries: List<CountryDto>,
    @SerialName("total") val total: Int
)

/**
 * DTO for country summary
 */
@Serializable
data class CountrySummaryDto(
    @SerialName("country_code") val countryCode: String,
    @SerialName("country_name") val countryName: String,
    @SerialName("flag_emoji") val flagEmoji: String,
    @SerialName("plan_count") val planCount: Int,
    @SerialName("starting_price") val startingPrice: Double,
    @SerialName("currency") val currency: String = "USD",
    @SerialName("localized_name") val localizedName: String? = null,
    @SerialName("flag_urls") val flagUrls: CountryFlagUrlsDto? = null
)

/**
 * DTO for list of country summaries response
 */
@Serializable
data class CountrySummariesResponseDto(
    @SerialName("summaries") val summaries: List<CountrySummaryDto>,
    @SerialName("total") val total: Int
)
