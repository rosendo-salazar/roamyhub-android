package com.roamyhub.android.core.data.repository;

/**
 * Implementation of ProfileRepository.
 *
 * Handles user profile operations.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0096@\u00a2\u0006\u0002\u0010\u000eJ\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0002\u0010\u0012J\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\f0\u0014H\u0016JP\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u0011H\u0096@\u00a2\u0006\u0002\u0010\u001dR\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/roamyhub/android/core/data/repository/ProfileRepositoryImpl;", "Lcom/roamyhub/android/core/domain/repository/ProfileRepository;", "profileApiService", "Lcom/roamyhub/android/core/network/api/ProfileApiService;", "(Lcom/roamyhub/android/core/network/api/ProfileApiService;)V", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "getAuth", "()Lcom/google/firebase/auth/FirebaseAuth;", "auth$delegate", "Lkotlin/Lazy;", "deactivateAccount", "Lcom/roamyhub/android/core/common/result/Resource;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAccount", "password", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProfile", "Lkotlinx/coroutines/flow/Flow;", "Lcom/roamyhub/android/core/domain/model/user/User;", "updateProfile", "firstName", "lastName", "phoneNumber", "profileImageUrl", "preferredCurrency", "preferredLanguage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "data_release"})
public final class ProfileRepositoryImpl implements com.roamyhub.android.core.domain.repository.ProfileRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.network.api.ProfileApiService profileApiService = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "ProfileRepositoryImpl";
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy auth$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.roamyhub.android.core.data.repository.ProfileRepositoryImpl.Companion Companion = null;
    
    @javax.inject.Inject()
    public ProfileRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.network.api.ProfileApiService profileApiService) {
        super();
    }
    
    private final com.google.firebase.auth.FirebaseAuth getAuth() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<com.roamyhub.android.core.common.result.Resource<com.roamyhub.android.core.domain.model.user.User>> getProfile() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateProfile(@org.jetbrains.annotations.Nullable()
    java.lang.String firstName, @org.jetbrains.annotations.Nullable()
    java.lang.String lastName, @org.jetbrains.annotations.Nullable()
    java.lang.String phoneNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String profileImageUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String preferredCurrency, @org.jetbrains.annotations.Nullable()
    java.lang.String preferredLanguage, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<com.roamyhub.android.core.domain.model.user.User>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteAccount(@org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<kotlin.Unit>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deactivateAccount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<kotlin.Unit>> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/roamyhub/android/core/data/repository/ProfileRepositoryImpl$Companion;", "", "()V", "TAG", "", "data_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}