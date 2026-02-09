package com.roamyhub.android.core.domain.model.plan

/**
 * Domain model representing a geographic region with eSIM coverage
 */
data class Region(
    val key: String, // Region identifier (e.g., "europe", "asia", "middle-east")
    val name: String,
    val description: String? = null,
    val countries: List<String>, // List of ISO country codes in this region
    val availablePlansCount: Int,
    val iso3: String? = null, // ISO-3 code for the region (e.g., "EUR", "ASI")
    val localizedName: String? = null,
    val iconUrl: String? = null
) {
    /**
     * Display name (uses localized name if available, falls back to name)
     */
    val displayName: String
        get() = localizedName ?: name

    /**
     * Stable identifier for API calls and navigation
     * Prefers ISO-3 code, falls back to key
     */
    val apiIdentifier: String
        get() = iso3 ?: key

    /**
     * Number of countries in this region
     */
    val countryCount: Int
        get() = countries.size
}
