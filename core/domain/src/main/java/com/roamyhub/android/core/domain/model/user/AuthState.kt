package com.roamyhub.android.core.domain.model.user

/**
 * Sealed class representing the authentication state of the user
 */
sealed class AuthState {
    /**
     * User is authenticated
     */
    data class Authenticated(val user: User) : AuthState()

    /**
     * User is not authenticated
     */
    data object Unauthenticated : AuthState()

    /**
     * Authentication state is being determined
     */
    data object Loading : AuthState()
}
