package com.roamyhub.android.core.domain.repository

import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.model.checkout.Checkout

/**
 * Repository interface for checkout session management.
 *
 * Handles creation and management of checkout sessions for purchasing eSIM plans.
 * A checkout session is created when a user initiates a purchase and tracks
 * the state through payment completion.
 */
interface CheckoutRepository {

    /**
     * Create a new checkout session
     *
     * Initiates a purchase flow for a specific plan with optional points redemption.
     *
     * @param planId Unique identifier of the plan to purchase
     * @param pointsToRedeem Number of reward points to apply as discount (default: 0)
     * @return Resource containing the created Checkout session
     */
    suspend fun createCheckout(
        planId: String,
        pointsToRedeem: Int = 0
    ): Resource<Checkout>

    /**
     * Get a specific checkout session by ID
     *
     * @param checkoutId Unique identifier of the checkout session
     * @return Resource containing the Checkout or error if not found
     */
    suspend fun getCheckout(checkoutId: String): Resource<Checkout>

    /**
     * Get all checkout sessions for the current user
     *
     * Returns checkout sessions in all states (pending, completed, expired, cancelled).
     *
     * @return Resource containing list of user's Checkouts, ordered by creation date (newest first)
     */
    suspend fun getUserCheckouts(): Resource<List<Checkout>>

    /**
     * Get pending checkout sessions for the current user
     *
     * Returns only checkout sessions that are awaiting payment completion.
     * Useful for resuming abandoned checkout flows.
     *
     * @return Resource containing list of pending Checkouts
     */
    suspend fun getPendingCheckouts(): Resource<List<Checkout>>

    /**
     * Cancel a checkout session
     *
     * Cancels a pending checkout session before payment is completed.
     * Cannot cancel checkouts that are already completed or expired.
     *
     * @param checkoutId Unique identifier of the checkout session to cancel
     * @return Resource indicating success or error
     */
    suspend fun cancelCheckout(checkoutId: String): Resource<Unit>
}
