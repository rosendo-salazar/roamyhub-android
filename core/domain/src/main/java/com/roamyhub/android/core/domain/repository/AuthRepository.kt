package com.roamyhub.android.core.domain.repository

import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.model.user.AuthState
import com.roamyhub.android.core.domain.model.user.User
import kotlinx.coroutines.flow.Flow

/**
 * Repository interface for authentication operations.
 *
 * Handles user sign-up, sign-in (email/password and Google),
 * password reset, email verification, and session management.
 */
interface AuthRepository {

    /**
     * Observe the current authentication state
     *
     * Emits updates whenever the authentication state changes
     * (e.g., user signs in, signs out, or session expires).
     */
    fun getCurrentUser(): Flow<AuthState>

    /**
     * Sign up a new user with email and password
     *
     * @param email User's email address
     * @param password User's password
     * @param firstName User's first name
     * @param lastName User's last name
     * @return Resource containing the newly created User or error
     */
    suspend fun signUp(
        email: String,
        password: String,
        firstName: String,
        lastName: String
    ): Resource<User>

    /**
     * Sign in an existing user with email and password
     *
     * @param email User's email address
     * @param password User's password
     * @return Resource containing the authenticated User or error
     */
    suspend fun signIn(
        email: String,
        password: String
    ): Resource<User>

    /**
     * Sign in with Google OAuth
     *
     * @param idToken Google ID token from Google Sign-In
     * @return Resource containing the authenticated User or error
     */
    suspend fun signInWithGoogle(idToken: String): Resource<User>

    /**
     * Sign out the current user
     *
     * Clears all local authentication state and invalidates the session.
     *
     * @return Resource indicating success or error
     */
    suspend fun signOut(): Resource<Unit>

    /**
     * Send a password reset email
     *
     * @param email Email address to send the reset link to
     * @return Resource indicating success or error
     */
    suspend fun resetPassword(email: String): Resource<Unit>

    /**
     * Resend email verification link
     *
     * @return Resource indicating success or error
     */
    suspend fun resendVerification(): Resource<Unit>
}
