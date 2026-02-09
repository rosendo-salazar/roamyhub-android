package com.roamyhub.android.core.network.api

import com.roamyhub.android.core.network.model.PaymentConfigResponseDto
import com.roamyhub.android.core.network.model.StripeSessionResponseDto
import retrofit2.http.GET

/**
 * Retrofit API service for payment endpoints
 */
interface PaymentApiService {

    /**
     * Get payment configuration (Stripe keys, supported currencies, etc.)
     */
    @GET("payments/config")
    suspend fun getPaymentConfig(): PaymentConfigResponseDto

    /**
     * Get embedded checkout session for Stripe
     */
    @GET("payments/embedded-checkout/session")
    suspend fun getEmbeddedCheckoutSession(): StripeSessionResponseDto
}
