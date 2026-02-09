package com.roamyhub.android.core.data.repository

import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.data.mapper.toDomain
import com.roamyhub.android.core.domain.model.checkout.Checkout
import com.roamyhub.android.core.domain.repository.CheckoutRepository
import com.roamyhub.android.core.network.api.CheckoutApiService
import com.roamyhub.android.core.network.model.BuyNowRequestDto
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Implementation of CheckoutRepository.
 *
 * Handles checkout session creation and management.
 */
@Singleton
class CheckoutRepositoryImpl @Inject constructor(
    private val checkoutApiService: CheckoutApiService
) : CheckoutRepository {

    companion object {
        private const val TAG = "CheckoutRepositoryImpl"
    }

    private val auth: FirebaseAuth by lazy { FirebaseAuth.getInstance() }

    override suspend fun createCheckout(planId: String, pointsToRedeem: Int): Resource<Checkout> {
        return try {
            val userId = auth.currentUser?.uid
                ?: return Resource.Error("User not authenticated")

            val request = BuyNowRequestDto(
                planId = planId,
                pointsToRedeem = pointsToRedeem
            )

            val response = checkoutApiService.createCheckout(userId, request)
            val checkout = response.checkout.toDomain()
            Resource.Success(checkout)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to create checkout", e)
            Resource.Error(e.message ?: "Failed to create checkout")
        }
    }

    override suspend fun getCheckout(checkoutId: String): Resource<Checkout> {
        return try {
            val response = checkoutApiService.getCheckoutById(checkoutId)
            val checkout = response.checkout.toDomain()
            Resource.Success(checkout)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to fetch checkout: $checkoutId", e)
            Resource.Error(e.message ?: "Failed to fetch checkout")
        }
    }

    override suspend fun getUserCheckouts(): Resource<List<Checkout>> {
        return try {
            val userId = auth.currentUser?.uid
                ?: return Resource.Error("User not authenticated")

            val response = checkoutApiService.getUserCheckouts(userId)
            val checkouts = response.checkouts.map { it.toDomain() }
            Resource.Success(checkouts)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to fetch user checkouts", e)
            Resource.Error(e.message ?: "Failed to fetch checkouts")
        }
    }

    override suspend fun getPendingCheckouts(): Resource<List<Checkout>> {
        return try {
            val response = checkoutApiService.getPendingCheckouts()
            val checkouts = response.checkouts.map { it.toDomain() }
            Resource.Success(checkouts)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to fetch pending checkouts", e)
            Resource.Error(e.message ?: "Failed to fetch pending checkouts")
        }
    }

    override suspend fun cancelCheckout(checkoutId: String): Resource<Unit> {
        return try {
            val response = checkoutApiService.cancelCheckout(checkoutId)
            if (response.success) {
                Resource.Success(Unit)
            } else {
                Resource.Error(response.message)
            }
        } catch (e: Exception) {
            Log.e(TAG, "Failed to cancel checkout: $checkoutId", e)
            Resource.Error(e.message ?: "Failed to cancel checkout")
        }
    }
}
