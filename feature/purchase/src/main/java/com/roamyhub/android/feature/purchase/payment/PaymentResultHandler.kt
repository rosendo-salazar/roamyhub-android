package com.roamyhub.android.feature.purchase.payment

/**
 * Sealed class representing the result of a payment operation
 */
sealed class PaymentResult {
    /**
     * Payment completed successfully
     * @param orderId The ID of the created order
     */
    data class Success(val orderId: String) : PaymentResult()

    /**
     * User cancelled the payment
     */
    data object Cancelled : PaymentResult()

    /**
     * Payment failed with an error
     * @param error Description of what went wrong
     * @param throwable Optional exception that caused the failure
     */
    data class Failed(
        val error: String,
        val throwable: Throwable? = null
    ) : PaymentResult()
}
