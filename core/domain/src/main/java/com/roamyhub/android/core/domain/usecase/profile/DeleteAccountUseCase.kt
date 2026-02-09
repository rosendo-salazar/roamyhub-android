package com.roamyhub.android.core.domain.usecase.profile

import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.repository.ProfileRepository
import javax.inject.Inject

/**
 * Use case to permanently delete the current user's account.
 *
 * Requires password confirmation for security.
 * This operation cannot be undone.
 */
class DeleteAccountUseCase @Inject constructor(
    private val profileRepository: ProfileRepository
) {
    suspend operator fun invoke(password: String): Resource<Unit> {
        if (password.isBlank()) {
            return Resource.Error("Password is required to delete account")
        }

        return profileRepository.deleteAccount(password)
    }
}
