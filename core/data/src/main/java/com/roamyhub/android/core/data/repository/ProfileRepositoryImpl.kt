package com.roamyhub.android.core.data.repository

import android.util.Log
import com.google.firebase.auth.EmailAuthProvider
import com.google.firebase.auth.FirebaseAuth
import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.data.mapper.toDomain
import com.roamyhub.android.core.domain.model.user.User
import com.roamyhub.android.core.domain.repository.ProfileRepository
import com.roamyhub.android.core.network.api.ProfileApiService
import com.roamyhub.android.core.network.model.AccountActionRequestDto
import com.roamyhub.android.core.network.model.UpdateProfileRequestDto
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.tasks.await
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Implementation of ProfileRepository.
 *
 * Handles user profile operations.
 */
@Singleton
class ProfileRepositoryImpl @Inject constructor(
    private val profileApiService: ProfileApiService
) : ProfileRepository {

    companion object {
        private const val TAG = "ProfileRepositoryImpl"
    }

    private val auth: FirebaseAuth by lazy { FirebaseAuth.getInstance() }

    override fun getProfile(): Flow<Resource<User>> = flow {
        emit(Resource.Loading())

        try {
            val userId = auth.currentUser?.uid
                ?: throw IllegalStateException("User not authenticated")

            val userDto = profileApiService.getProfile(userId)
            val user = userDto.toDomain()
            emit(Resource.Success(user))
        } catch (e: Exception) {
            Log.e(TAG, "Failed to fetch user profile", e)
            emit(Resource.Error(e.message ?: "Failed to fetch profile"))
        }
    }

    override suspend fun updateProfile(
        firstName: String?,
        lastName: String?,
        phoneNumber: String?,
        profileImageUrl: String?,
        preferredCurrency: String?,
        preferredLanguage: String?
    ): Resource<User> {
        return try {
            val userId = auth.currentUser?.uid
                ?: return Resource.Error("User not authenticated")

            val request = UpdateProfileRequestDto(
                firstName = firstName,
                lastName = lastName,
                phoneNumber = phoneNumber,
                preferredCurrency = preferredCurrency,
                preferredLanguage = preferredLanguage
            )

            val userDto = profileApiService.updateProfile(userId, request)
            val user = userDto.toDomain()
            Resource.Success(user)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to update profile", e)
            Resource.Error(e.message ?: "Failed to update profile")
        }
    }

    override suspend fun deleteAccount(password: String): Resource<Unit> {
        return try {
            val firebaseUser = auth.currentUser
                ?: return Resource.Error("User not authenticated")

            val email = firebaseUser.email
                ?: return Resource.Error("User email not found")

            // Re-authenticate user before deletion (required by Firebase)
            val credential = EmailAuthProvider.getCredential(email, password)
            firebaseUser.reauthenticate(credential).await()

            val userId = firebaseUser.uid

            // Delete from backend first
            val request = AccountActionRequestDto(
                userId = userId,
                reason = "User requested account deletion"
            )
            val response = profileApiService.deleteAccount(request)

            if (!response.success) {
                return Resource.Error(response.message)
            }

            // Then delete from Firebase
            firebaseUser.delete().await()

            Resource.Success(Unit)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to delete account", e)
            Resource.Error(e.message ?: "Failed to delete account")
        }
    }

    override suspend fun deactivateAccount(): Resource<Unit> {
        return try {
            val userId = auth.currentUser?.uid
                ?: return Resource.Error("User not authenticated")

            val request = AccountActionRequestDto(
                userId = userId,
                reason = "User requested account deactivation"
            )

            val response = profileApiService.deactivateAccount(request)

            if (response.success) {
                // Sign out after deactivation
                auth.signOut()
                Resource.Success(Unit)
            } else {
                Resource.Error(response.message)
            }
        } catch (e: Exception) {
            Log.e(TAG, "Failed to deactivate account", e)
            Resource.Error(e.message ?: "Failed to deactivate account")
        }
    }
}
