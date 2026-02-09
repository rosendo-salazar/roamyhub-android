package com.roamyhub.android.core.domain.usecase.checkout

import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.model.checkout.Checkout
import com.roamyhub.android.core.domain.repository.CheckoutRepository
import javax.inject.Inject

/**
 * Use case for creating a checkout session.
 *
 * Initiates a purchase flow for a specific plan with optional points redemption.
 */
class CreateCheckoutUseCase @Inject constructor(
    private val checkoutRepository: CheckoutRepository
) {
    /**
     * Create a checkout session
     *
     * @param planId The plan to purchase
     * @param pointsToRedeem Number of points to apply as discount
     * @return Resource containing the created Checkout
     */
    suspend operator fun invoke(
        planId: String,
        pointsToRedeem: Int = 0
    ): Resource<Checkout> {
        return checkoutRepository.createCheckout(
            planId = planId,
            pointsToRedeem = pointsToRedeem
        )
    }
}
