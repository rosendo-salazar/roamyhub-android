package com.roamyhub.android.feature.purchase.state;

/**
 * UI state for the Checkout screen
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b3\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0002\u0010\u0017J\u000b\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0010H\u00c6\u0003J\t\u00107\u001a\u00020\u0010H\u00c6\u0003J\t\u00108\u001a\u00020\u0010H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010=\u001a\u00020\tH\u00c6\u0003J\t\u0010>\u001a\u00020\tH\u00c6\u0003J\t\u0010?\u001a\u00020\tH\u00c6\u0003J\t\u0010@\u001a\u00020\rH\u00c6\u0003J\t\u0010A\u001a\u00020\rH\u00c6\u0003J\t\u0010B\u001a\u00020\u0010H\u00c6\u0003J\u009f\u0001\u0010C\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u00c6\u0001J\u0013\u0010D\u001a\u00020\u00102\b\u0010E\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010F\u001a\u00020\tH\u00d6\u0001J\t\u0010G\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u000b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u00158F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0011\u0010\u000e\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010%R\u0011\u0010\u0013\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001cR\u0011\u0010(\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b(\u0010\u001cR\u0011\u0010)\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b)\u0010\u001cR\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0019R\u0011\u00101\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b2\u0010\u001cR\u0011\u00103\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b4\u0010%\u00a8\u0006H"}, d2 = {"Lcom/roamyhub/android/feature/purchase/state/CheckoutUiState;", "", "plan", "Lcom/roamyhub/android/core/domain/model/plan/Plan;", "checkout", "Lcom/roamyhub/android/core/domain/model/checkout/Checkout;", "paymentConfig", "Lcom/roamyhub/android/core/domain/model/payment/PaymentConfig;", "pointsToRedeem", "", "maxRedeemablePoints", "availablePoints", "discountAmount", "", "finalTotal", "isLoading", "", "isProcessingPayment", "isLoadingPaymentConfig", "isCreatingCheckout", "error", "", "paymentError", "(Lcom/roamyhub/android/core/domain/model/plan/Plan;Lcom/roamyhub/android/core/domain/model/checkout/Checkout;Lcom/roamyhub/android/core/domain/model/payment/PaymentConfig;IIIDDZZZZLjava/lang/String;Ljava/lang/String;)V", "getAvailablePoints", "()I", "canProceed", "getCanProceed", "()Z", "canRedeem", "getCanRedeem", "getCheckout", "()Lcom/roamyhub/android/core/domain/model/checkout/Checkout;", "currency", "getCurrency", "()Ljava/lang/String;", "getDiscountAmount", "()D", "getError", "getFinalTotal", "isReady", "isZeroCost", "getMaxRedeemablePoints", "getPaymentConfig", "()Lcom/roamyhub/android/core/domain/model/payment/PaymentConfig;", "getPaymentError", "getPlan", "()Lcom/roamyhub/android/core/domain/model/plan/Plan;", "getPointsToRedeem", "requiresPayment", "getRequiresPayment", "subtotal", "getSubtotal", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "purchase_release"})
public final class CheckoutUiState {
    @org.jetbrains.annotations.Nullable()
    private final com.roamyhub.android.core.domain.model.plan.Plan plan = null;
    @org.jetbrains.annotations.Nullable()
    private final com.roamyhub.android.core.domain.model.checkout.Checkout checkout = null;
    @org.jetbrains.annotations.Nullable()
    private final com.roamyhub.android.core.domain.model.payment.PaymentConfig paymentConfig = null;
    private final int pointsToRedeem = 0;
    private final int maxRedeemablePoints = 0;
    private final int availablePoints = 0;
    private final double discountAmount = 0.0;
    private final double finalTotal = 0.0;
    private final boolean isLoading = false;
    private final boolean isProcessingPayment = false;
    private final boolean isLoadingPaymentConfig = false;
    private final boolean isCreatingCheckout = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String error = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String paymentError = null;
    
    public CheckoutUiState(@org.jetbrains.annotations.Nullable()
    com.roamyhub.android.core.domain.model.plan.Plan plan, @org.jetbrains.annotations.Nullable()
    com.roamyhub.android.core.domain.model.checkout.Checkout checkout, @org.jetbrains.annotations.Nullable()
    com.roamyhub.android.core.domain.model.payment.PaymentConfig paymentConfig, int pointsToRedeem, int maxRedeemablePoints, int availablePoints, double discountAmount, double finalTotal, boolean isLoading, boolean isProcessingPayment, boolean isLoadingPaymentConfig, boolean isCreatingCheckout, @org.jetbrains.annotations.Nullable()
    java.lang.String error, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentError) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.roamyhub.android.core.domain.model.plan.Plan getPlan() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.roamyhub.android.core.domain.model.checkout.Checkout getCheckout() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.roamyhub.android.core.domain.model.payment.PaymentConfig getPaymentConfig() {
        return null;
    }
    
    public final int getPointsToRedeem() {
        return 0;
    }
    
    public final int getMaxRedeemablePoints() {
        return 0;
    }
    
    public final int getAvailablePoints() {
        return 0;
    }
    
    public final double getDiscountAmount() {
        return 0.0;
    }
    
    public final double getFinalTotal() {
        return 0.0;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public final boolean isProcessingPayment() {
        return false;
    }
    
    public final boolean isLoadingPaymentConfig() {
        return false;
    }
    
    public final boolean isCreatingCheckout() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getError() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPaymentError() {
        return null;
    }
    
    public final boolean getCanRedeem() {
        return false;
    }
    
    public final boolean getRequiresPayment() {
        return false;
    }
    
    public final boolean isZeroCost() {
        return false;
    }
    
    public final boolean isReady() {
        return false;
    }
    
    public final boolean getCanProceed() {
        return false;
    }
    
    public final double getSubtotal() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrency() {
        return null;
    }
    
    public CheckoutUiState() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.roamyhub.android.core.domain.model.plan.Plan component1() {
        return null;
    }
    
    public final boolean component10() {
        return false;
    }
    
    public final boolean component11() {
        return false;
    }
    
    public final boolean component12() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.roamyhub.android.core.domain.model.checkout.Checkout component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.roamyhub.android.core.domain.model.payment.PaymentConfig component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final double component8() {
        return 0.0;
    }
    
    public final boolean component9() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.roamyhub.android.feature.purchase.state.CheckoutUiState copy(@org.jetbrains.annotations.Nullable()
    com.roamyhub.android.core.domain.model.plan.Plan plan, @org.jetbrains.annotations.Nullable()
    com.roamyhub.android.core.domain.model.checkout.Checkout checkout, @org.jetbrains.annotations.Nullable()
    com.roamyhub.android.core.domain.model.payment.PaymentConfig paymentConfig, int pointsToRedeem, int maxRedeemablePoints, int availablePoints, double discountAmount, double finalTotal, boolean isLoading, boolean isProcessingPayment, boolean isLoadingPaymentConfig, boolean isCreatingCheckout, @org.jetbrains.annotations.Nullable()
    java.lang.String error, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentError) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}