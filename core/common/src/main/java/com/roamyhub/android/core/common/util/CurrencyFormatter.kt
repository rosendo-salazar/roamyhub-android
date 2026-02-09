package com.roamyhub.android.core.common.util

import java.text.NumberFormat
import java.util.Currency
import java.util.Locale

/**
 * Utility object for formatting currency values.
 * Supports 7 currencies: USD, EUR, GBP, CAD, AUD, JPY, MXN
 */
object CurrencyFormatter {

    enum class SupportedCurrency(val code: String, val symbol: String, val locale: Locale) {
        USD("USD", "$", Locale.US),
        EUR("EUR", "€", Locale.GERMANY),
        GBP("GBP", "£", Locale.UK),
        CAD("CAD", "CA$", Locale.CANADA),
        AUD("AUD", "A$", Locale("en", "AU")),
        JPY("JPY", "¥", Locale.JAPAN),
        MXN("MXN", "MX$", Locale("es", "MX"));

        companion object {
            fun fromCode(code: String): SupportedCurrency {
                return entries.find { it.code.equals(code, ignoreCase = true) } ?: USD
            }
        }
    }

    /**
     * Formats a monetary amount with the specified currency
     * @param amount The amount to format
     * @param currencyCode The ISO 4217 currency code (e.g., "USD", "EUR")
     * @param showSymbol Whether to show the currency symbol (default: true)
     * @return Formatted currency string
     */
    fun format(
        amount: Double,
        currencyCode: String = "USD",
        showSymbol: Boolean = true
    ): String {
        val currency = SupportedCurrency.fromCode(currencyCode)
        val formatter = NumberFormat.getCurrencyInstance(currency.locale).apply {
            this.currency = Currency.getInstance(currency.code)
            maximumFractionDigits = if (currency == SupportedCurrency.JPY) 0 else 2
            minimumFractionDigits = if (currency == SupportedCurrency.JPY) 0 else 2
        }

        return if (showSymbol) {
            formatter.format(amount)
        } else {
            formatter.format(amount).replace(currency.symbol, "").trim()
        }
    }

    /**
     * Formats a monetary amount as cents/smallest unit to a display string
     * @param cents The amount in cents (e.g., 1250 = $12.50)
     * @param currencyCode The ISO 4217 currency code
     * @return Formatted currency string
     */
    fun formatFromCents(cents: Long, currencyCode: String = "USD"): String {
        val currency = SupportedCurrency.fromCode(currencyCode)
        val amount = if (currency == SupportedCurrency.JPY) {
            cents.toDouble() // JPY doesn't use decimal places
        } else {
            cents / 100.0
        }
        return format(amount, currencyCode)
    }

    /**
     * Formats a monetary amount with a compact notation (e.g., $1.2K, $1.5M)
     * @param amount The amount to format
     * @param currencyCode The ISO 4217 currency code
     * @return Compact formatted currency string
     */
    fun formatCompact(amount: Double, currencyCode: String = "USD"): String {
        val currency = SupportedCurrency.fromCode(currencyCode)
        val symbol = currency.symbol

        return when {
            amount >= 1_000_000 -> "$symbol%.1fM".format(amount / 1_000_000)
            amount >= 1_000 -> "$symbol%.1fK".format(amount / 1_000)
            else -> format(amount, currencyCode)
        }
    }

    /**
     * Gets the currency symbol for the given currency code
     * @param currencyCode The ISO 4217 currency code
     * @return The currency symbol
     */
    fun getSymbol(currencyCode: String): String {
        return SupportedCurrency.fromCode(currencyCode).symbol
    }

    /**
     * Parses a formatted currency string back to a Double
     * Removes all non-digit characters except decimal point and negative sign
     * @param formattedAmount The formatted currency string
     * @return The numeric amount, or null if parsing fails
     */
    fun parse(formattedAmount: String): Double? {
        val cleaned = formattedAmount
            .replace(Regex("[^\\d.-]"), "")
            .trim()
        return cleaned.toDoubleOrNull()
    }

    /**
     * Checks if a currency code is supported
     * @param currencyCode The ISO 4217 currency code to check
     * @return true if supported, false otherwise
     */
    fun isSupported(currencyCode: String): Boolean {
        return SupportedCurrency.entries.any { it.code.equals(currencyCode, ignoreCase = true) }
    }
}
