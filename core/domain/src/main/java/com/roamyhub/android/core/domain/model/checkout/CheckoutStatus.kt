package com.roamyhub.android.core.domain.model.checkout

/**
 * Enum representing the status of a checkout session
 */
enum class CheckoutStatus {
    /**
     * Checkout has been created and is awaiting payment
     */
    PENDING,

    /**
     * Payment is being processed
     */
    PROCESSING,

    /**
     * Payment completed successfully
     */
    COMPLETED,

    /**
     * Payment failed
     */
    FAILED,

    /**
     * Checkout was cancelled by user
     */
    CANCELLED,

    /**
     * Checkout has expired
     */
    EXPIRED;

    /**
     * Returns true if checkout can be paid
     */
    fun canBePaid(): Boolean = this == PENDING

    /**
     * Returns true if checkout is in a final state
     */
    fun isFinal(): Boolean = this in listOf(COMPLETED, FAILED, CANCELLED, EXPIRED)
}
