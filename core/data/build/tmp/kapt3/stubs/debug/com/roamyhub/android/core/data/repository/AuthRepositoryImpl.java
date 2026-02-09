package com.roamyhub.android.core.data.repository;

/**
 * Implementation of AuthRepository.
 *
 * Handles authentication using Firebase Auth for the authentication layer
 * and syncs with backend API for user profile data.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0096@\u00a2\u0006\u0002\u0010\u0015J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@\u00a2\u0006\u0002\u0010\u0019J$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0018H\u0096@\u00a2\u0006\u0002\u0010\u001dJ\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00132\u0006\u0010\u001f\u001a\u00020\u0018H\u0096@\u00a2\u0006\u0002\u0010\u0019J\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0096@\u00a2\u0006\u0002\u0010\u0015J4\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0018H\u0096@\u00a2\u0006\u0002\u0010$R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/roamyhub/android/core/data/repository/AuthRepositoryImpl;", "Lcom/roamyhub/android/core/domain/repository/AuthRepository;", "authApiService", "Lcom/roamyhub/android/core/network/api/AuthApiService;", "profileApiService", "Lcom/roamyhub/android/core/network/api/ProfileApiService;", "tokenManager", "Lcom/roamyhub/android/core/data/local/TokenManager;", "(Lcom/roamyhub/android/core/network/api/AuthApiService;Lcom/roamyhub/android/core/network/api/ProfileApiService;Lcom/roamyhub/android/core/data/local/TokenManager;)V", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "getAuth", "()Lcom/google/firebase/auth/FirebaseAuth;", "auth$delegate", "Lkotlin/Lazy;", "getCurrentUser", "Lkotlinx/coroutines/flow/Flow;", "Lcom/roamyhub/android/core/domain/model/user/AuthState;", "resendVerification", "Lcom/roamyhub/android/core/common/result/Resource;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetPassword", "email", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signIn", "Lcom/roamyhub/android/core/domain/model/user/User;", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signInWithGoogle", "idToken", "signOut", "signUp", "firstName", "lastName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "data_debug"})
public final class AuthRepositoryImpl implements com.roamyhub.android.core.domain.repository.AuthRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.network.api.AuthApiService authApiService = null;
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.network.api.ProfileApiService profileApiService = null;
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.data.local.TokenManager tokenManager = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "AuthRepositoryImpl";
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy auth$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.roamyhub.android.core.data.repository.AuthRepositoryImpl.Companion Companion = null;
    
    @javax.inject.Inject()
    public AuthRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.network.api.AuthApiService authApiService, @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.network.api.ProfileApiService profileApiService, @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.data.local.TokenManager tokenManager) {
        super();
    }
    
    private final com.google.firebase.auth.FirebaseAuth getAuth() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<com.roamyhub.android.core.domain.model.user.AuthState> getCurrentUser() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object signUp(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String firstName, @org.jetbrains.annotations.NotNull()
    java.lang.String lastName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<com.roamyhub.android.core.domain.model.user.User>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object signIn(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<com.roamyhub.android.core.domain.model.user.User>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object signInWithGoogle(@org.jetbrains.annotations.NotNull()
    java.lang.String idToken, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<com.roamyhub.android.core.domain.model.user.User>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object signOut(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<kotlin.Unit>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object resetPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<kotlin.Unit>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object resendVerification(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<kotlin.Unit>> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/roamyhub/android/core/data/repository/AuthRepositoryImpl$Companion;", "", "()V", "TAG", "", "data_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}