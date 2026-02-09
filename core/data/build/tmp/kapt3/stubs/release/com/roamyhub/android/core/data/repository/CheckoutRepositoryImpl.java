package com.roamyhub.android.core.data.repository;

/**
 * Implementation of CheckoutRepository.
 *
 * Handles checkout session creation and management.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0002\u0010\u0010J$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0002\u0010\u0016J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0002\u0010\u0010J\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00190\fH\u0096@\u00a2\u0006\u0002\u0010\u001aJ\u001a\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00190\fH\u0096@\u00a2\u0006\u0002\u0010\u001aR\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/roamyhub/android/core/data/repository/CheckoutRepositoryImpl;", "Lcom/roamyhub/android/core/domain/repository/CheckoutRepository;", "checkoutApiService", "Lcom/roamyhub/android/core/network/api/CheckoutApiService;", "(Lcom/roamyhub/android/core/network/api/CheckoutApiService;)V", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "getAuth", "()Lcom/google/firebase/auth/FirebaseAuth;", "auth$delegate", "Lkotlin/Lazy;", "cancelCheckout", "Lcom/roamyhub/android/core/common/result/Resource;", "", "checkoutId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCheckout", "Lcom/roamyhub/android/core/domain/model/checkout/Checkout;", "planId", "pointsToRedeem", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCheckout", "getPendingCheckouts", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserCheckouts", "Companion", "data_release"})
public final class CheckoutRepositoryImpl implements com.roamyhub.android.core.domain.repository.CheckoutRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.network.api.CheckoutApiService checkoutApiService = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "CheckoutRepositoryImpl";
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy auth$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.roamyhub.android.core.data.repository.CheckoutRepositoryImpl.Companion Companion = null;
    
    @javax.inject.Inject()
    public CheckoutRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.network.api.CheckoutApiService checkoutApiService) {
        super();
    }
    
    private final com.google.firebase.auth.FirebaseAuth getAuth() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object createCheckout(@org.jetbrains.annotations.NotNull()
    java.lang.String planId, int pointsToRedeem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<com.roamyhub.android.core.domain.model.checkout.Checkout>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCheckout(@org.jetbrains.annotations.NotNull()
    java.lang.String checkoutId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<com.roamyhub.android.core.domain.model.checkout.Checkout>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getUserCheckouts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<? extends java.util.List<com.roamyhub.android.core.domain.model.checkout.Checkout>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getPendingCheckouts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<? extends java.util.List<com.roamyhub.android.core.domain.model.checkout.Checkout>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object cancelCheckout(@org.jetbrains.annotations.NotNull()
    java.lang.String checkoutId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<kotlin.Unit>> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/roamyhub/android/core/data/repository/CheckoutRepositoryImpl$Companion;", "", "()V", "TAG", "", "data_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}