package com.roamyhub.android.core.data.repository;

/**
 * Implementation of PaymentRepository.
 *
 * Handles payment configuration and Stripe session management.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0096@\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006H\u0096@\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/roamyhub/android/core/data/repository/PaymentRepositoryImpl;", "Lcom/roamyhub/android/core/domain/repository/PaymentRepository;", "paymentApiService", "Lcom/roamyhub/android/core/network/api/PaymentApiService;", "(Lcom/roamyhub/android/core/network/api/PaymentApiService;)V", "createStripeSession", "Lcom/roamyhub/android/core/common/result/Resource;", "Lcom/roamyhub/android/core/domain/model/payment/StripeSession;", "checkoutId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentConfig", "Lcom/roamyhub/android/core/domain/model/payment/PaymentConfig;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "data_debug"})
public final class PaymentRepositoryImpl implements com.roamyhub.android.core.domain.repository.PaymentRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.network.api.PaymentApiService paymentApiService = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "PaymentRepositoryImpl";
    @org.jetbrains.annotations.NotNull()
    public static final com.roamyhub.android.core.data.repository.PaymentRepositoryImpl.Companion Companion = null;
    
    @javax.inject.Inject()
    public PaymentRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.network.api.PaymentApiService paymentApiService) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getPaymentConfig(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<com.roamyhub.android.core.domain.model.payment.PaymentConfig>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object createStripeSession(@org.jetbrains.annotations.NotNull()
    java.lang.String checkoutId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<com.roamyhub.android.core.domain.model.payment.StripeSession>> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/roamyhub/android/core/data/repository/PaymentRepositoryImpl$Companion;", "", "()V", "TAG", "", "data_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}