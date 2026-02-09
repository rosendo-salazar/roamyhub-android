package com.roamyhub.android.core.network.interceptor

import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.tasks.await
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Interceptor that adds Firebase authentication token to API requests
 *
 * This interceptor retrieves the current user's ID token from Firebase Auth
 * and adds it as a Bearer token in the Authorization header for protected endpoints.
 */
@Singleton
class AuthInterceptor @Inject constructor(
    private val firebaseAuth: FirebaseAuth
) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()

        // Skip auth for public endpoints
        if (originalRequest.url.encodedPath.contains("/public/")) {
            return chain.proceed(originalRequest)
        }

        // Get the current user's ID token
        val currentUser = firebaseAuth.currentUser
        val token = if (currentUser != null) {
            runBlocking {
                try {
                    currentUser.getIdToken(false).await().token
                } catch (e: Exception) {
                    // If token retrieval fails, proceed without it
                    // The API will return 401 and the app should handle re-authentication
                    null
                }
            }
        } else {
            null
        }

        // If we have a token, add it to the request
        val requestBuilder = originalRequest.newBuilder()
        if (token != null) {
            requestBuilder.addHeader("Authorization", "Bearer $token")
        }

        return chain.proceed(requestBuilder.build())
    }
}
