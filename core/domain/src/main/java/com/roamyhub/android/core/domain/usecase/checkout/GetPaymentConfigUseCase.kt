package com.roamyhub.android.core.domain.usecase.checkout

import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.model.payment.PaymentConfig
import com.roamyhub.android.core.domain.repository.PaymentRepository
import javax.inject.Inject

/**
 * Use case for retrieving payment configuration.
 *
 * Retrieves Stripe publishable key and other payment-related
 * configuration required to initialize the payment SDK.
 */
class GetPaymentConfigUseCase @Inject constructor(
    private val paymentRepository: PaymentRepository
) {
    /**
     * Get payment configuration
     *
     * @return Resource containing PaymentConfig
     */
    suspend operator fun invoke(): Resource<PaymentConfig> {
        return paymentRepository.getPaymentConfig()
    }
}
