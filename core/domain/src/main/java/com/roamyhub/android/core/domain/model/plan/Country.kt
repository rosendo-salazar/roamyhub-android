package com.roamyhub.android.core.domain.model.plan

/**
 * Domain model representing a country with eSIM coverage
 */
data class Country(
    val code: String, // ISO 3166-1 alpha-2 code (e.g., "US", "GB")
    val name: String,
    val flagEmoji: String,
    val region: String,
    val continent: String,
    val availablePlansCount: Int,
    val iso3: String? = null, // ISO 3166-1 alpha-3 code (e.g., "USA", "GBR")
    val localizedName: String? = null,
    val flagUrls: CountryFlagUrls? = null
) {
    /**
     * Display name (uses localized name if available, falls back to name)
     */
    val displayName: String
        get() = localizedName ?: name
}

/**
 * Country flag URLs in different sizes
 */
data class CountryFlagUrls(
    val small: String,
    val medium: String,
    val large: String,
    val xlarge: String,
    val xxlarge: String,
    val svg: String
) {
    /**
     * Best available large flag URL with fallbacks
     * Returns the first non-empty URL from: xxlarge, xlarge, large, medium
     */
    val bestLargeUrl: String
        get() = sequenceOf(xxlarge, xlarge, large, medium, small)
            .firstOrNull { it.isNotBlank() }
            ?: svg
}
