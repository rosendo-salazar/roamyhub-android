package com.roamyhub.android.core.network.api

import com.roamyhub.android.core.network.model.AuthResponseDto
import com.roamyhub.android.core.network.model.ForgotPasswordRequestDto
import com.roamyhub.android.core.network.model.ForgotPasswordResponseDto
import com.roamyhub.android.core.network.model.ResendVerificationRequestDto
import com.roamyhub.android.core.network.model.SignupRequestDto
import com.roamyhub.android.core.network.model.SocialLoginRequestDto
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * Retrofit API service for authentication endpoints
 */
interface AuthApiService {

    /**
     * Sign up a new user with email and password
     */
    @POST("auth/signup")
    suspend fun signup(@Body request: SignupRequestDto): AuthResponseDto

    /**
     * Authenticate with social provider (Google, Apple)
     */
    @POST("auth/social")
    suspend fun socialLogin(@Body request: SocialLoginRequestDto): AuthResponseDto

    /**
     * Send password reset email
     */
    @POST("auth/forgot-password")
    suspend fun forgotPassword(@Body request: ForgotPasswordRequestDto): ForgotPasswordResponseDto

    /**
     * Resend email verification
     */
    @POST("auth/resend-verification")
    suspend fun resendVerification(@Body request: ResendVerificationRequestDto): AuthResponseDto
}
