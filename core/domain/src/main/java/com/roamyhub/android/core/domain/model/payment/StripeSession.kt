package com.roamyhub.android.core.domain.model.payment

/**
 * Domain model representing a Stripe payment session
 */
data class StripeSession(
    val sessionId: String,
    val clientSecret: String,
    val publishableKey: String,
    val customerId: String? = null,
    val ephemeralKey: String? = null
) {
    /**
     * Returns true if all required data is available for PaymentSheet
     */
    fun isComplete(): Boolean {
        return sessionId.isNotBlank() &&
               clientSecret.isNotBlank() &&
               publishableKey.isNotBlank()
    }
}
