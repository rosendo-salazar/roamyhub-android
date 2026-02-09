package com.roamyhub.android.core.network.api;

/**
 * Retrofit API service for authentication endpoints
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\fH\u00a7@\u00a2\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\u000fH\u00a7@\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/roamyhub/android/core/network/api/AuthApiService;", "", "forgotPassword", "Lcom/roamyhub/android/core/network/model/ForgotPasswordResponseDto;", "request", "Lcom/roamyhub/android/core/network/model/ForgotPasswordRequestDto;", "(Lcom/roamyhub/android/core/network/model/ForgotPasswordRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resendVerification", "Lcom/roamyhub/android/core/network/model/AuthResponseDto;", "Lcom/roamyhub/android/core/network/model/ResendVerificationRequestDto;", "(Lcom/roamyhub/android/core/network/model/ResendVerificationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signup", "Lcom/roamyhub/android/core/network/model/SignupRequestDto;", "(Lcom/roamyhub/android/core/network/model/SignupRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "socialLogin", "Lcom/roamyhub/android/core/network/model/SocialLoginRequestDto;", "(Lcom/roamyhub/android/core/network/model/SocialLoginRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "network_release"})
public abstract interface AuthApiService {
    
    /**
     * Sign up a new user with email and password
     */
    @retrofit2.http.POST(value = "auth/signup")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object signup(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.network.model.SignupRequestDto request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.AuthResponseDto> $completion);
    
    /**
     * Authenticate with social provider (Google, Apple)
     */
    @retrofit2.http.POST(value = "auth/social")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object socialLogin(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.network.model.SocialLoginRequestDto request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.AuthResponseDto> $completion);
    
    /**
     * Send password reset email
     */
    @retrofit2.http.POST(value = "auth/forgot-password")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object forgotPassword(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.network.model.ForgotPasswordRequestDto request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.ForgotPasswordResponseDto> $completion);
    
    /**
     * Resend email verification
     */
    @retrofit2.http.POST(value = "auth/resend-verification")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object resendVerification(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.network.model.ResendVerificationRequestDto request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.AuthResponseDto> $completion);
}