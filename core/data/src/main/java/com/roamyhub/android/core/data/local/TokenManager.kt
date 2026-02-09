package com.roamyhub.android.core.data.local

import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.tasks.await
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Manager for Firebase ID token caching and automatic refresh.
 *
 * Handles:
 * - Caching Firebase ID tokens with expiration
 * - Automatic token refresh 5 minutes before expiry
 * - Thread-safe token access
 */
@Singleton
class TokenManager @Inject constructor() {

    companion object {
        /**
         * Token refresh threshold: refresh token 5 minutes before expiry
         */
        private const val REFRESH_THRESHOLD_MS = 5 * 60 * 1000L // 5 minutes
    }

    @Volatile
    private var cachedToken: String? = null

    @Volatile
    private var tokenExpirationTime: Long = 0L

    private val auth: FirebaseAuth by lazy { FirebaseAuth.getInstance() }

    /**
     * Get current Firebase ID token.
     *
     * Returns cached token if valid, otherwise fetches a new token from Firebase.
     * Automatically refreshes token if it will expire within 5 minutes.
     *
     * @return Current valid Firebase ID token
     * @throws IllegalStateException if user is not authenticated
     */
    suspend fun getToken(): String {
        val currentUser = auth.currentUser
            ?: throw IllegalStateException("User not authenticated")

        val now = System.currentTimeMillis()

        // Check if cached token is still valid (has more than 5 minutes left)
        if (cachedToken != null && tokenExpirationTime - now > REFRESH_THRESHOLD_MS) {
            return cachedToken!!
        }

        // Fetch new token from Firebase
        val tokenResult = currentUser.getIdToken(false).await()
        val token = tokenResult.token
            ?: throw IllegalStateException("Failed to get Firebase ID token")

        // Cache the token
        cachedToken = token

        // Firebase tokens typically expire after 1 hour
        // Set expiration time to 55 minutes from now to be safe
        tokenExpirationTime = now + (55 * 60 * 1000L)

        return token
    }

    /**
     * Force refresh the Firebase ID token.
     *
     * Bypasses cache and fetches a new token from Firebase.
     *
     * @return Newly fetched Firebase ID token
     * @throws IllegalStateException if user is not authenticated
     */
    suspend fun refreshToken(): String {
        val currentUser = auth.currentUser
            ?: throw IllegalStateException("User not authenticated")

        val tokenResult = currentUser.getIdToken(true).await()
        val token = tokenResult.token
            ?: throw IllegalStateException("Failed to refresh Firebase ID token")

        // Update cache
        cachedToken = token
        tokenExpirationTime = System.currentTimeMillis() + (55 * 60 * 1000L)

        return token
    }

    /**
     * Clear cached token.
     *
     * Should be called on sign out to ensure fresh token on next sign in.
     */
    fun clearToken() {
        cachedToken = null
        tokenExpirationTime = 0L
    }

    /**
     * Check if a valid cached token exists
     *
     * @return True if cached token is valid (not expired), false otherwise
     */
    fun hasValidToken(): Boolean {
        val now = System.currentTimeMillis()
        return cachedToken != null && tokenExpirationTime - now > REFRESH_THRESHOLD_MS
    }
}
