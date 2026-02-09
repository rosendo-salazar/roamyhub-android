package com.roamyhub.android.feature.purchase.viewmodel;

/**
 * ViewModel for the Checkout screen.
 *
 * Manages checkout session creation, points redemption,
 * and payment processing flow.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0006\u0010\u0018\u001a\u00020\u0015J\u0006\u0010\u0019\u001a\u00020\u0015J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0006\u0010\u001d\u001a\u00020\u0015J\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0086@\u00a2\u0006\u0002\u0010!J\u000e\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020\u0015J\u000e\u0010&\u001a\u00020\u00152\u0006\u0010\'\u001a\u00020\u001cJ\u0010\u0010(\u001a\u00020\u00152\u0006\u0010\'\u001a\u00020\u001cH\u0002J\b\u0010)\u001a\u00020\u0015H\u0002J\u0010\u0010*\u001a\u00020\u00152\u0006\u0010\'\u001a\u00020\u001cH\u0002J\b\u0010+\u001a\u00020\u0015H\u0002J\u000e\u0010,\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006-"}, d2 = {"Lcom/roamyhub/android/feature/purchase/viewmodel/CheckoutViewModel;", "Landroidx/lifecycle/ViewModel;", "planRepository", "Lcom/roamyhub/android/core/domain/repository/PlanRepository;", "checkoutRepository", "Lcom/roamyhub/android/core/domain/repository/CheckoutRepository;", "paymentRepository", "Lcom/roamyhub/android/core/domain/repository/PaymentRepository;", "rewardRepository", "Lcom/roamyhub/android/core/domain/repository/RewardRepository;", "orderRepository", "Lcom/roamyhub/android/core/domain/repository/OrderRepository;", "(Lcom/roamyhub/android/core/domain/repository/PlanRepository;Lcom/roamyhub/android/core/domain/repository/CheckoutRepository;Lcom/roamyhub/android/core/domain/repository/PaymentRepository;Lcom/roamyhub/android/core/domain/repository/RewardRepository;Lcom/roamyhub/android/core/domain/repository/OrderRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/roamyhub/android/feature/purchase/state/CheckoutUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "calculateDiscount", "", "points", "", "clearError", "clearPaymentError", "completeZeroCostOrder", "checkoutId", "", "createCheckout", "getStripeSession", "Lcom/roamyhub/android/core/common/result/Resource;", "Lcom/roamyhub/android/core/domain/model/payment/StripeSession;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handlePaymentResult", "result", "Lcom/roamyhub/android/feature/purchase/payment/PaymentResult;", "initiatePayment", "loadCheckoutData", "planId", "loadMaxRedeemablePoints", "loadPaymentConfig", "loadPlan", "loadRewardsSummary", "onPointsChange", "purchase_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class CheckoutViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.domain.repository.PlanRepository planRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.domain.repository.CheckoutRepository checkoutRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.domain.repository.PaymentRepository paymentRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.domain.repository.RewardRepository rewardRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.domain.repository.OrderRepository orderRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.roamyhub.android.feature.purchase.state.CheckoutUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.purchase.state.CheckoutUiState> uiState = null;
    
    @javax.inject.Inject()
    public CheckoutViewModel(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.domain.repository.PlanRepository planRepository, @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.domain.repository.CheckoutRepository checkoutRepository, @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.domain.repository.PaymentRepository paymentRepository, @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.domain.repository.RewardRepository rewardRepository, @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.domain.repository.OrderRepository orderRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.purchase.state.CheckoutUiState> getUiState() {
        return null;
    }
    
    /**
     * Load initial data for checkout
     */
    public final void loadCheckoutData(@org.jetbrains.annotations.NotNull()
    java.lang.String planId) {
    }
    
    /**
     * Load plan details
     */
    private final void loadPlan(java.lang.String planId) {
    }
    
    /**
     * Load payment configuration
     */
    private final void loadPaymentConfig() {
    }
    
    /**
     * Load user's available points
     */
    private final void loadRewardsSummary() {
    }
    
    /**
     * Load maximum redeemable points for the plan
     */
    private final void loadMaxRedeemablePoints(java.lang.String planId) {
    }
    
    /**
     * Update points to redeem
     */
    public final void onPointsChange(int points) {
    }
    
    /**
     * Calculate discount for given points
     */
    private final void calculateDiscount(int points) {
    }
    
    /**
     * Create checkout session
     */
    public final void createCheckout() {
    }
    
    /**
     * Initiate payment flow
     */
    public final void initiatePayment() {
    }
    
    /**
     * Complete a zero-cost order (fully paid with points)
     */
    private final void completeZeroCostOrder(java.lang.String checkoutId) {
    }
    
    /**
     * Handle payment result from Stripe
     */
    public final void handlePaymentResult(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.feature.purchase.payment.PaymentResult result) {
    }
    
    /**
     * Clear payment error
     */
    public final void clearPaymentError() {
    }
    
    /**
     * Clear general error
     */
    public final void clearError() {
    }
    
    /**
     * Get Stripe session for payment
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getStripeSession(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<com.roamyhub.android.core.domain.model.payment.StripeSession>> $completion) {
        return null;
    }
}