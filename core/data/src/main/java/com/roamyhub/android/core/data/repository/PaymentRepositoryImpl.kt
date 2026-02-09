package com.roamyhub.android.core.data.repository

import android.util.Log
import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.data.mapper.toDomain
import com.roamyhub.android.core.domain.model.payment.PaymentConfig
import com.roamyhub.android.core.domain.model.payment.StripeSession
import com.roamyhub.android.core.domain.repository.PaymentRepository
import com.roamyhub.android.core.network.api.PaymentApiService
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Implementation of PaymentRepository.
 *
 * Handles payment configuration and Stripe session management.
 */
@Singleton
class PaymentRepositoryImpl @Inject constructor(
    private val paymentApiService: PaymentApiService
) : PaymentRepository {

    companion object {
        private const val TAG = "PaymentRepositoryImpl"
    }

    override suspend fun getPaymentConfig(): Resource<PaymentConfig> {
        return try {
            val response = paymentApiService.getPaymentConfig()
            val config = response.config.toDomain()
            Resource.Success(config)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to fetch payment config", e)
            Resource.Error(e.message ?: "Failed to fetch payment configuration")
        }
    }

    override suspend fun createStripeSession(checkoutId: String): Resource<StripeSession> {
        return try {
            val response = paymentApiService.getEmbeddedCheckoutSession()
            val session = response.session.toDomain()
            Resource.Success(session)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to create Stripe session", e)
            Resource.Error(e.message ?: "Failed to create payment session")
        }
    }
}
