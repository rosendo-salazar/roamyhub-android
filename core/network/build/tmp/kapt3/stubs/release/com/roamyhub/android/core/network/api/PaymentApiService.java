package com.roamyhub.android.core.network.api;

/**
 * Retrofit API service for payment endpoints
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0007"}, d2 = {"Lcom/roamyhub/android/core/network/api/PaymentApiService;", "", "getEmbeddedCheckoutSession", "Lcom/roamyhub/android/core/network/model/StripeSessionResponseDto;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentConfig", "Lcom/roamyhub/android/core/network/model/PaymentConfigResponseDto;", "network_release"})
public abstract interface PaymentApiService {
    
    /**
     * Get payment configuration (Stripe keys, supported currencies, etc.)
     */
    @retrofit2.http.GET(value = "payments/config")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPaymentConfig(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.PaymentConfigResponseDto> $completion);
    
    /**
     * Get embedded checkout session for Stripe
     */
    @retrofit2.http.GET(value = "payments/embedded-checkout/session")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getEmbeddedCheckoutSession(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.StripeSessionResponseDto> $completion);
}