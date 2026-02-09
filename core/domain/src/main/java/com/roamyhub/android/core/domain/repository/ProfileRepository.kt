package com.roamyhub.android.core.domain.repository

import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.model.user.User
import kotlinx.coroutines.flow.Flow

/**
 * Repository interface for user profile operations.
 *
 * Handles user profile retrieval, updates, and account management.
 */
interface ProfileRepository {

    /**
     * Observe the current user's profile
     *
     * Emits updates whenever the user's profile information changes
     * (e.g., name updated, profile image changed, points earned).
     *
     * @return Flow emitting the current User profile
     */
    fun getProfile(): Flow<Resource<User>>

    /**
     * Update user profile
     *
     * Updates the user's profile information. Only provided fields are updated.
     *
     * @param firstName User's first name (optional)
     * @param lastName User's last name (optional)
     * @param phoneNumber User's phone number (optional)
     * @param profileImageUrl URL to user's profile image (optional)
     * @param preferredCurrency User's preferred currency code (optional)
     * @param preferredLanguage User's preferred language code (optional)
     * @return Resource containing the updated User profile
     */
    suspend fun updateProfile(
        firstName: String? = null,
        lastName: String? = null,
        phoneNumber: String? = null,
        profileImageUrl: String? = null,
        preferredCurrency: String? = null,
        preferredLanguage: String? = null
    ): Resource<User>

    /**
     * Delete user account
     *
     * Permanently deletes the user's account and all associated data.
     * This operation cannot be undone.
     *
     * @param password User's current password for confirmation
     * @return Resource indicating success or error
     */
    suspend fun deleteAccount(password: String): Resource<Unit>

    /**
     * Deactivate user account
     *
     * Temporarily deactivates the user's account. The account can be
     * reactivated by signing in again within a grace period.
     *
     * @return Resource indicating success or error
     */
    suspend fun deactivateAccount(): Resource<Unit>
}
