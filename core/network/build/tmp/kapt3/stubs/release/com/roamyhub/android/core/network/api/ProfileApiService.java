package com.roamyhub.android.core.network.api;

/**
 * Retrofit API service for user profile endpoints
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\fJ\"\u0010\r\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0004\u001a\u00020\u000eH\u00a7@\u00a2\u0006\u0002\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/roamyhub/android/core/network/api/ProfileApiService;", "", "deactivateAccount", "Lcom/roamyhub/android/core/network/model/AccountActionResponseDto;", "request", "Lcom/roamyhub/android/core/network/model/AccountActionRequestDto;", "(Lcom/roamyhub/android/core/network/model/AccountActionRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAccount", "getProfile", "Lcom/roamyhub/android/core/network/model/UserDto;", "userId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProfile", "Lcom/roamyhub/android/core/network/model/UpdateProfileRequestDto;", "(Ljava/lang/String;Lcom/roamyhub/android/core/network/model/UpdateProfileRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "network_release"})
public abstract interface ProfileApiService {
    
    /**
     * Get user profile
     */
    @retrofit2.http.GET(value = "profile/{userId}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getProfile(@retrofit2.http.Path(value = "userId")
    @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.UserDto> $completion);
    
    /**
     * Update user profile
     */
    @retrofit2.http.PUT(value = "profile/{userId}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateProfile(@retrofit2.http.Path(value = "userId")
    @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.network.model.UpdateProfileRequestDto request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.UserDto> $completion);
    
    /**
     * Delete user account
     */
    @retrofit2.http.POST(value = "account/delete")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAccount(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.network.model.AccountActionRequestDto request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.AccountActionResponseDto> $completion);
    
    /**
     * Deactivate user account
     */
    @retrofit2.http.POST(value = "account/deactivate")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deactivateAccount(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.network.model.AccountActionRequestDto request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.AccountActionResponseDto> $completion);
}