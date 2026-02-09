package com.roamyhub.android.core.domain.model.payment

/**
 * Domain model representing payment configuration from the backend
 */
data class PaymentConfig(
    val stripePublishableKey: String,
    val stripeMerchantId: String? = null,
    val supportedCurrencies: List<String> = emptyList(),
    val minimumAmount: Double = 0.0,
    val maximumAmount: Double = 0.0
) {
    /**
     * Returns true if a currency is supported
     */
    fun isCurrencySupported(currency: String): Boolean {
        return supportedCurrencies.any { it.equals(currency, ignoreCase = true) }
    }

    /**
     * Returns true if the amount is within acceptable range
     */
    fun isAmountValid(amount: Double, currency: String): Boolean {
        return isCurrencySupported(currency) &&
               amount >= minimumAmount &&
               amount <= maximumAmount
    }
}
