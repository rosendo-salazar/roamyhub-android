package com.roamyhub.android.core.domain.model.plan

/**
 * Summary information for browsing global plans
 *
 * Provides a lightweight view of global plan availability and pricing
 */
data class GlobalSummary(
    val totalPlans: Int,
    val startingPrice: Double, // Cheapest global plan price
    val currency: String = "USD",
    val coverageCount: Int, // Number of countries covered by global plans
    val globalName: String = "Global",
    val globalIso3: String? = null,
    val iconUrl: String? = null
) {
    /**
     * Display name for global plans
     */
    val displayName: String
        get() = globalName

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
            val countries = if (coverageCount == 1) "1 country" else "$coverageCount countries"
            val plans = if (totalPlans == 1) "1 plan" else "$totalPlans plans"
            return "$countries • $plans"
        }
}
