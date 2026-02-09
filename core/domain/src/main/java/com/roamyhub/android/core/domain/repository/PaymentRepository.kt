package com.roamyhub.android.core.domain.repository

import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.model.payment.PaymentConfig
import com.roamyhub.android.core.domain.model.payment.StripeSession

/**
 * Repository interface for payment processing operations.
 *
 * Handles Stripe payment configuration and session creation for checkout flows.
 */
interface PaymentRepository {

    /**
     * Get payment configuration
     *
     * Retrieves Stripe publishable key and other payment-related
     * configuration required to initialize the payment SDK.
     *
     * @return Resource containing PaymentConfig
     */
    suspend fun getPaymentConfig(): Resource<PaymentConfig>

    /**
     * Create a Stripe payment session
     *
     * Initiates a Stripe Checkout Session or Payment Intent for a checkout.
     * The session contains all information needed to collect payment.
     *
     * @param checkoutId Unique identifier of the checkout session
     * @return Resource containing StripeSession with client secret and session details
     */
    suspend fun createStripeSession(checkoutId: String): Resource<StripeSession>
}
