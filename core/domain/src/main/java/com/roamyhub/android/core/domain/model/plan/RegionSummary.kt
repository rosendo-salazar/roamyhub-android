package com.roamyhub.android.core.domain.model.plan

/**
 * Summary information for browsing plans by region
 *
 * Provides a lightweight view of plan availability and pricing for a specific region
 */
data class RegionSummary(
    val regionKey: String, // Region identifier (e.g., "europe", "asia")
    val regionName: String,
    val description: String? = null,
    val countryCount: Int,
    val planCount: Int,
    val startingPrice: Double, // Cheapest plan price
    val currency: String = "USD",
    val regionIso3: String? = null, // ISO-3 code (e.g., "EUR", "ASI")
    val localizedName: String? = null,
    val iconUrl: String? = null
) {
    /**
     * Display name (uses localized name if available, falls back to regionName)
     */
    val displayName: String
        get() = localizedName ?: regionName

    /**
     * Stable identifier for API calls and navigation
     * Prefers ISO-3 code, falls back to regionKey
     */
    val apiIdentifier: String
        get() = regionIso3 ?: regionKey

    /**
     * Formatted starting price with currency symbol
     */
    fun getFormattedPrice(currencyCode: String = this.currency): String {
        return when (currencyCode) {
            "USD" -> "$%.2f".format(startingPrice)
            "EUR" -> "€%.2f".format(startingPrice)
            "GBP" -> "£%.2f".format(startingPrice)
            else -> "$currencyCode %.2f".format(startingPrice)
        }
    }

    /**
     * Description of coverage
     */
    val coverageDescription: String
        get() {
            val countries = if (countryCount == 1) "1 country" else "$countryCount countries"
            val plans = if (planCount == 1) "1 plan" else "$planCount plans"
            return "$countries • $plans"
        }
}
