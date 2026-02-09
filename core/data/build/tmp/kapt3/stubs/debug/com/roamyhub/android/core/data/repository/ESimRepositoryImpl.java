package com.roamyhub.android.core.data.repository;

/**
 * Implementation of ESimRepository.
 *
 * Handles eSIM management operations.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0002\u0010\u0010J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0002\u0010\u0010J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0002\u0010\u0010J\u001a\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00170\f0\u0016H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/roamyhub/android/core/data/repository/ESimRepositoryImpl;", "Lcom/roamyhub/android/core/domain/repository/ESimRepository;", "eSimApiService", "Lcom/roamyhub/android/core/network/api/ESimApiService;", "(Lcom/roamyhub/android/core/network/api/ESimApiService;)V", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "getAuth", "()Lcom/google/firebase/auth/FirebaseAuth;", "auth$delegate", "Lkotlin/Lazy;", "deleteESim", "Lcom/roamyhub/android/core/common/result/Resource;", "", "eSimId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getESimById", "Lcom/roamyhub/android/core/domain/model/esim/ESim;", "getESimQrCode", "Lcom/roamyhub/android/core/domain/model/esim/QrCodeData;", "getUserESims", "Lkotlinx/coroutines/flow/Flow;", "", "Companion", "data_debug"})
public final class ESimRepositoryImpl implements com.roamyhub.android.core.domain.repository.ESimRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.network.api.ESimApiService eSimApiService = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "ESimRepositoryImpl";
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy auth$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.roamyhub.android.core.data.repository.ESimRepositoryImpl.Companion Companion = null;
    
    @javax.inject.Inject()
    public ESimRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.network.api.ESimApiService eSimApiService) {
        super();
    }
    
    private final com.google.firebase.auth.FirebaseAuth getAuth() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<com.roamyhub.android.core.common.result.Resource<java.util.List<com.roamyhub.android.core.domain.model.esim.ESim>>> getUserESims() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getESimById(@org.jetbrains.annotations.NotNull()
    java.lang.String eSimId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<com.roamyhub.android.core.domain.model.esim.ESim>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getESimQrCode(@org.jetbrains.annotations.NotNull()
    java.lang.String eSimId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<com.roamyhub.android.core.domain.model.esim.QrCodeData>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteESim(@org.jetbrains.annotations.NotNull()
    java.lang.String eSimId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<kotlin.Unit>> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/roamyhub/android/core/data/repository/ESimRepositoryImpl$Companion;", "", "()V", "TAG", "", "data_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}