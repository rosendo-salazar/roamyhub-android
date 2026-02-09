package com.roamyhub.android.feature.purchase.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.repository.CheckoutRepository
import com.roamyhub.android.core.domain.repository.OrderRepository
import com.roamyhub.android.core.domain.repository.PaymentRepository
import com.roamyhub.android.core.domain.repository.PlanRepository
import com.roamyhub.android.core.domain.repository.RewardRepository
import com.roamyhub.android.feature.purchase.payment.PaymentResult
import com.roamyhub.android.feature.purchase.state.CheckoutUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel for the Checkout screen.
 *
 * Manages checkout session creation, points redemption,
 * and payment processing flow.
 */
@HiltViewModel
class CheckoutViewModel @Inject constructor(
    private val planRepository: PlanRepository,
    private val checkoutRepository: CheckoutRepository,
    private val paymentRepository: PaymentRepository,
    private val rewardRepository: RewardRepository,
    private val orderRepository: OrderRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(CheckoutUiState())
    val uiState: StateFlow<CheckoutUiState> = _uiState.asStateFlow()

    /**
     * Load initial data for checkout
     */
    fun loadCheckoutData(planId: String) {
        loadPlan(planId)
        loadPaymentConfig()
        loadRewardsSummary()
    }

    /**
     * Load plan details
     */
    private fun loadPlan(planId: String) {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, error = null) }

            when (val result = planRepository.getPlanById(planId)) {
                is Resource.Success -> {
                    val plan = result.data
                    _uiState.update {
                        it.copy(
                            plan = plan,
                            isLoading = false,
                            finalTotal = plan.price
                        )
                    }
                    // Load max redeemable points for this plan
                    loadMaxRedeemablePoints(planId)
                }

                is Resource.Error -> {
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            error = result.message ?: "Failed to load plan"
                        )
                    }
                }

                is Resource.Loading -> {
                    // Already in loading state
                }
            }
        }
    }

    /**
     * Load payment configuration
     */
    private fun loadPaymentConfig() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoadingPaymentConfig = true) }

            when (val result = paymentRepository.getPaymentConfig()) {
                is Resource.Success -> {
                    _uiState.update {
                        it.copy(
                            paymentConfig = result.data,
                            isLoadingPaymentConfig = false
                        )
                    }
                }

                is Resource.Error -> {
                    _uiState.update {
                        it.copy(
                            isLoadingPaymentConfig = false,
                            error = result.message ?: "Failed to load payment configuration"
                        )
                    }
                }

                is Resource.Loading -> {
                    // Already in loading state
                }
            }
        }
    }

    /**
     * Load user's available points
     */
    private fun loadRewardsSummary() {
        viewModelScope.launch {
            rewardRepository.getRewardsSummary().collect { resource ->
                when (resource) {
                    is Resource.Success -> {
                        _uiState.update {
                            it.copy(availablePoints = resource.data.availablePoints)
                        }
                    }

                    is Resource.Error -> {
                        // Don't fail the whole checkout if rewards fail
                        _uiState.update { it.copy(availablePoints = 0) }
                    }

                    is Resource.Loading -> {
                        // Keep current state
                    }
                }
            }
        }
    }

    /**
     * Load maximum redeemable points for the plan
     */
    private fun loadMaxRedeemablePoints(planId: String) {
        viewModelScope.launch {
            when (val result = rewardRepository.getMaxRedeemablePoints(planId)) {
                is Resource.Success -> {
                    _uiState.update {
                        it.copy(maxRedeemablePoints = result.data)
                    }
                }

                is Resource.Error -> {
                    _uiState.update { it.copy(maxRedeemablePoints = 0) }
                }

                is Resource.Loading -> {
                    // Keep current state
                }
            }
        }
    }

    /**
     * Update points to redeem
     */
    fun onPointsChange(points: Int) {
        val maxPoints = minOf(
            _uiState.value.maxRedeemablePoints,
            _uiState.value.availablePoints
        )
        val validPoints = points.coerceIn(0, maxPoints)

        _uiState.update { it.copy(pointsToRedeem = validPoints) }

        // Calculate discount if points > 0
        if (validPoints > 0) {
            calculateDiscount(validPoints)
        } else {
            // Reset to original price
            _uiState.update {
                it.copy(
                    discountAmount = 0.0,
                    finalTotal = it.plan?.price ?: 0.0
                )
            }
        }
    }

    /**
     * Calculate discount for given points
     */
    private fun calculateDiscount(points: Int) {
        val planId = _uiState.value.plan?.id ?: return

        viewModelScope.launch {
            when (val result = rewardRepository.calculatePointsDiscount(planId, points)) {
                is Resource.Success -> {
                    val discount = result.data
                    _uiState.update {
                        it.copy(
                            discountAmount = discount.discountAmount,
                            finalTotal = discount.finalAmount
                        )
                    }
                }

                is Resource.Error -> {
                    // Reset on error
                    _uiState.update {
                        it.copy(
                            pointsToRedeem = 0,
                            discountAmount = 0.0,
                            finalTotal = it.plan?.price ?: 0.0
                        )
                    }
                }

                is Resource.Loading -> {
                    // Keep current state
                }
            }
        }
    }

    /**
     * Create checkout session
     */
    fun createCheckout() {
        val planId = _uiState.value.plan?.id ?: return

        viewModelScope.launch {
            _uiState.update { it.copy(isCreatingCheckout = true, error = null) }

            when (val result = checkoutRepository.createCheckout(
                planId = planId,
                pointsToRedeem = _uiState.value.pointsToRedeem
            )) {
                is Resource.Success -> {
                    val checkout = result.data
                    _uiState.update {
                        it.copy(
                            checkout = checkout,
                            isCreatingCheckout = false,
                            finalTotal = checkout.total,
                            discountAmount = checkout.discount
                        )
                    }
                }

                is Resource.Error -> {
                    _uiState.update {
                        it.copy(
                            isCreatingCheckout = false,
                            error = result.message ?: "Failed to create checkout"
                        )
                    }
                }

                is Resource.Loading -> {
                    // Already in loading state
                }
            }
        }
    }

    /**
     * Initiate payment flow
     */
    fun initiatePayment() {
        val checkout = _uiState.value.checkout ?: run {
            createCheckout()
            return
        }

        // If zero cost, complete order directly
        if (checkout.isZeroCost) {
            completeZeroCostOrder(checkout.id)
            return
        }

        // Otherwise, proceed with Stripe payment
        _uiState.update { it.copy(isProcessingPayment = true, paymentError = null) }
    }

    /**
     * Complete a zero-cost order (fully paid with points)
     */
    private fun completeZeroCostOrder(checkoutId: String) {
        viewModelScope.launch {
            // Backend should handle creating order for zero-cost checkouts
            // Poll or wait for order creation
            _uiState.update { it.copy(isProcessingPayment = true) }

            // For now, simulate success - in real implementation,
            // you would poll the checkout status or order creation
            kotlinx.coroutines.delay(1000)

            when (val result = checkoutRepository.getCheckout(checkoutId)) {
                is Resource.Success -> {
                    val checkout = result.data
                    val orderId = checkout.orderId
                    if (orderId != null) {
                        handlePaymentResult(PaymentResult.Success(orderId))
                    } else {
                        _uiState.update {
                            it.copy(
                                isProcessingPayment = false,
                                paymentError = "Order creation pending"
                            )
                        }
                    }
                }

                is Resource.Error -> {
                    _uiState.update {
                        it.copy(
                            isProcessingPayment = false,
                            paymentError = result.message ?: "Failed to complete order"
                        )
                    }
                }

                is Resource.Loading -> {
                    // Keep loading
                }
            }
        }
    }

    /**
     * Handle payment result from Stripe
     */
    fun handlePaymentResult(result: PaymentResult) {
        when (result) {
            is PaymentResult.Success -> {
                // Payment successful, orderId available
                _uiState.update {
                    it.copy(
                        isProcessingPayment = false,
                        paymentError = null
                    )
                }
                // Navigate to confirmation screen (handled by UI)
            }

            is PaymentResult.Cancelled -> {
                _uiState.update {
                    it.copy(
                        isProcessingPayment = false,
                        paymentError = null
                    )
                }
            }

            is PaymentResult.Failed -> {
                _uiState.update {
                    it.copy(
                        isProcessingPayment = false,
                        paymentError = result.error
                    )
                }
            }
        }
    }

    /**
     * Clear payment error
     */
    fun clearPaymentError() {
        _uiState.update { it.copy(paymentError = null) }
    }

    /**
     * Clear general error
     */
    fun clearError() {
        _uiState.update { it.copy(error = null) }
    }

    /**
     * Get Stripe session for payment
     */
    suspend fun getStripeSession(): Resource<com.roamyhub.android.core.domain.model.payment.StripeSession> {
        val checkoutId = _uiState.value.checkout?.id
            ?: return Resource.Error("No checkout session available")

        return paymentRepository.createStripeSession(checkoutId)
    }
}
