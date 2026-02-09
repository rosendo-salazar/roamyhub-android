package com.roamyhub.android.core.network.api;

/**
 * Retrofit API service for checkout endpoints
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000e\u001a\u00020\u000fH\u00a7@\u00a2\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u000f2\b\b\u0001\u0010\t\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lcom/roamyhub/android/core/network/api/CheckoutApiService;", "", "cancelCheckout", "Lcom/roamyhub/android/core/network/model/CancelCheckoutResponseDto;", "checkoutId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCheckout", "Lcom/roamyhub/android/core/network/model/CheckoutResponseDto;", "userId", "request", "Lcom/roamyhub/android/core/network/model/BuyNowRequestDto;", "(Ljava/lang/String;Lcom/roamyhub/android/core/network/model/BuyNowRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCheckoutById", "getPendingCheckouts", "Lcom/roamyhub/android/core/network/model/CheckoutsResponseDto;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserCheckouts", "network_release"})
public abstract interface CheckoutApiService {
    
    /**
     * Create a new checkout session (buy now)
     */
    @retrofit2.http.POST(value = "checkout/{userId}/buy-now")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createCheckout(@retrofit2.http.Path(value = "userId")
    @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.network.model.BuyNowRequestDto request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.CheckoutResponseDto> $completion);
    
    /**
     * Get a specific checkout by ID
     */
    @retrofit2.http.GET(value = "checkout/{checkoutId}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCheckoutById(@retrofit2.http.Path(value = "checkoutId")
    @org.jetbrains.annotations.NotNull()
    java.lang.String checkoutId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.CheckoutResponseDto> $completion);
    
    /**
     * Get all checkouts for a user
     */
    @retrofit2.http.GET(value = "checkout/user/{userId}/all")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUserCheckouts(@retrofit2.http.Path(value = "userId")
    @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.CheckoutsResponseDto> $completion);
    
    /**
     * Get pending checkouts for a user
     */
    @retrofit2.http.GET(value = "checkout/pending")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPendingCheckouts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.CheckoutsResponseDto> $completion);
    
    /**
     * Cancel a checkout
     */
    @retrofit2.http.POST(value = "checkout/{checkoutId}/cancel")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object cancelCheckout(@retrofit2.http.Path(value = "checkoutId")
    @org.jetbrains.annotations.NotNull()
    java.lang.String checkoutId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.CancelCheckoutResponseDto> $completion);
}