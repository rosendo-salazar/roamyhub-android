package com.roamyhub.android.core.data.repository

import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.data.local.TokenManager
import com.roamyhub.android.core.data.mapper.toDomain
import com.roamyhub.android.core.domain.model.user.AuthState
import com.roamyhub.android.core.domain.model.user.User
import com.roamyhub.android.core.domain.repository.AuthRepository
import com.roamyhub.android.core.network.api.AuthApiService
import com.roamyhub.android.core.network.api.ProfileApiService
import com.roamyhub.android.core.network.model.ForgotPasswordRequestDto
import com.roamyhub.android.core.network.model.ResendVerificationRequestDto
import com.roamyhub.android.core.network.model.SignupRequestDto
import com.roamyhub.android.core.network.model.SocialLoginRequestDto
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.tasks.await
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Implementation of AuthRepository.
 *
 * Handles authentication using Firebase Auth for the authentication layer
 * and syncs with backend API for user profile data.
 */
@Singleton
class AuthRepositoryImpl @Inject constructor(
    private val authApiService: AuthApiService,
    private val profileApiService: ProfileApiService,
    private val tokenManager: TokenManager
) : AuthRepository {

    companion object {
        private const val TAG = "AuthRepositoryImpl"
    }

    private val auth: FirebaseAuth by lazy { FirebaseAuth.getInstance() }

    override fun getCurrentUser(): Flow<AuthState> = callbackFlow {
        val authStateListener = FirebaseAuth.AuthStateListener { firebaseAuth ->
            val firebaseUser = firebaseAuth.currentUser

            if (firebaseUser == null) {
                trySend(AuthState.Unauthenticated)
            } else {
                trySend(AuthState.Loading)
            }
        }

        auth.addAuthStateListener(authStateListener)

        awaitClose {
            auth.removeAuthStateListener(authStateListener)
        }
    }

    override suspend fun signUp(
        email: String,
        password: String,
        firstName: String,
        lastName: String
    ): Resource<User> {
        return try {
            // Create Firebase user
            val result = auth.createUserWithEmailAndPassword(email, password).await()
            val firebaseUser = result.user
                ?: return Resource.Error("Failed to create user account")

            // Send email verification
            firebaseUser.sendEmailVerification().await()

            // Sync with backend
            val request = SignupRequestDto(
                email = email,
                password = password,
                firstName = firstName,
                lastName = lastName
            )

            val response = authApiService.signup(request)

            if (response.success) {
                response.user?.let { userDto ->
                    val user = userDto.toDomain()
                    Resource.Success(user)
                } ?: Resource.Error("User data not returned")
            } else {
                Resource.Error(response.message ?: "Sign up failed")
            }
        } catch (e: Exception) {
            Log.e(TAG, "Sign up failed", e)
            Resource.Error(e.message ?: "An error occurred during sign up")
        }
    }

    override suspend fun signIn(email: String, password: String): Resource<User> {
        return try {
            // Sign in with Firebase
            val result = auth.signInWithEmailAndPassword(email, password).await()
            val firebaseUser = result.user
                ?: return Resource.Error("Sign in failed")

            // Fetch user profile from backend
            val userDto = profileApiService.getProfile(firebaseUser.uid)
            val user = userDto.toDomain()

            Resource.Success(user)
        } catch (e: Exception) {
            Log.e(TAG, "Sign in failed", e)
            Resource.Error(e.message ?: "An error occurred during sign in")
        }
    }

    override suspend fun signInWithGoogle(idToken: String): Resource<User> {
        return try {
            // Sign in with Firebase using Google credential
            val credential = GoogleAuthProvider.getCredential(idToken, null)
            val result = auth.signInWithCredential(credential).await()
            val firebaseUser = result.user
                ?: return Resource.Error("Google sign in failed")

            // Sync with backend
            val request = SocialLoginRequestDto(
                idToken = idToken,
                provider = "google"
            )

            val response = authApiService.socialLogin(request)

            if (response.success) {
                response.user?.let { userDto ->
                    val user = userDto.toDomain()
                    Resource.Success(user)
                } ?: Resource.Error("User data not returned")
            } else {
                Resource.Error(response.message ?: "Google sign in failed")
            }
        } catch (e: Exception) {
            Log.e(TAG, "Google sign in failed", e)
            Resource.Error(e.message ?: "An error occurred during Google sign in")
        }
    }

    override suspend fun signOut(): Resource<Unit> {
        return try {
            auth.signOut()
            tokenManager.clearToken()
            Resource.Success(Unit)
        } catch (e: Exception) {
            Log.e(TAG, "Sign out failed", e)
            Resource.Error(e.message ?: "An error occurred during sign out")
        }
    }

    override suspend fun resetPassword(email: String): Resource<Unit> {
        return try {
            // Send Firebase password reset email
            auth.sendPasswordResetEmail(email).await()

            // Also notify backend
            val request = ForgotPasswordRequestDto(email = email)
            authApiService.forgotPassword(request)

            Resource.Success(Unit)
        } catch (e: Exception) {
            Log.e(TAG, "Password reset failed", e)
            Resource.Error(e.message ?: "Failed to send password reset email")
        }
    }

    override suspend fun resendVerification(): Resource<Unit> {
        return try {
            val firebaseUser = auth.currentUser
                ?: return Resource.Error("User not authenticated")

            // Send Firebase email verification
            firebaseUser.sendEmailVerification().await()

            // Also notify backend
            val request = ResendVerificationRequestDto(email = firebaseUser.email ?: "")
            authApiService.resendVerification(request)

            Resource.Success(Unit)
        } catch (e: Exception) {
            Log.e(TAG, "Resend verification failed", e)
            Resource.Error(e.message ?: "Failed to resend verification email")
        }
    }
}
