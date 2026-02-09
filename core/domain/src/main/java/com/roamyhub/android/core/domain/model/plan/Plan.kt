package com.roamyhub.android.core.domain.model.plan

import kotlinx.datetime.Instant

/**
 * Domain model representing an eSIM data plan
 *
 * Plans are offered for different coverage areas (single country, regional, or global)
 * and contain information about data allowance, validity period, and pricing.
 */
data class Plan(
    val id: String,
    val name: String,
    val description: String? = null,
    val countryIso: String? = null,
    val regionKey: String? = null,
    val isGlobal: Boolean = false,
    val dataAmount: Long, // Data amount in megabytes
    val validity: Int, // Validity period in days
    val price: Double,
    val currency: String = "USD",
    val coverageType: CoverageType,
    val features: List<String> = emptyList(),
    val isActive: Boolean = true,
    val badge: String? = null,
    val unlimitedType: String? = null,
    val maxRedeemablePoints: Int? = null,
    val countries: List<String> = emptyList(), // List of ISO country codes covered
    val imageUrl: String? = null,
    val regionIconUrl: String? = null,
    val currencyPrices: Map<String, Double> = emptyMap(),
    val createdAt: Instant,
    val updatedAt: Instant
) {
    /**
     * Data formatted as string (e.g., "5GB" or "Unlimited")
     */
    val dataFormatted: String
        get() {
            if (unlimitedType != null) {
                return "Unlimited"
            }
            val dataInGB = dataAmount / 1024.0
            return if (dataInGB >= 1) {
                val gb = dataInGB.toInt()
                if (dataInGB - gb < 0.01) {
                    "${gb}GB"
                } else {
                    String.format("%.1fGB", dataInGB)
                }
            } else {
                "${dataAmount}MB"
            }
        }

    /**
     * Validity period description (e.g., "7 days")
     */
    val validityDescription: String
        get() = if (validity == 1) "1 day" else "$validity days"

    /**
     * Primary country ISO code
     * Returns the first country from the countries list, or falls back to countryIso
     */
    val primaryCountryIso: String?
        get() = countries.firstOrNull() ?: countryIso

    /**
     * Formatted price with currency symbol
     */
    fun getFormattedPrice(currencyCode: String = this.currency): String {
        val amount = currencyPrices[currencyCode] ?: price
        return when (currencyCode) {
            "USD" -> "$%.2f".format(amount)
            "EUR" -> "€%.2f".format(amount)
            "GBP" -> "£%.2f".format(amount)
            else -> "$currencyCode %.2f".format(amount)
        }
    }

    /**
     * Check if this plan is unlimited
     */
    val isUnlimited: Boolean
        get() = unlimitedType != null
}
