package com.roamyhub.android.core.domain.model.plan

/**
 * Summary information for browsing plans by country
 *
 * Provides a lightweight view of plan availability and pricing for a specific country
 */
data class CountrySummary(
    val countryCode: String, // ISO 3166-1 alpha-2 code
    val countryName: String,
    val flagEmoji: String,
    val planCount: Int,
    val startingPrice: Double, // Cheapest plan price
    val currency: String = "USD",
    val localizedName: String? = null,
    val flagUrls: CountryFlagUrls? = null
) {
    /**
     * Display name (uses localized name if available, falls back to countryName)
     */
    val displayName: String
        get() = localizedName ?: countryName

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
     * Description of available plans
     */
    val planDescription: String
        get() = if (planCount == 1) "1 plan" else "$planCount plans"
}
