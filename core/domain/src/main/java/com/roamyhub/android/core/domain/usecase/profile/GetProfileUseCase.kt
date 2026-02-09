package com.roamyhub.android.core.domain.usecase.profile

import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.model.user.User
import com.roamyhub.android.core.domain.repository.ProfileRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * Use case to retrieve the current user's profile.
 *
 * Returns a Flow that emits profile updates whenever the user's data changes.
 */
class GetProfileUseCase @Inject constructor(
    private val profileRepository: ProfileRepository
) {
    operator fun invoke(): Flow<Resource<User>> {
        return profileRepository.getProfile()
    }
}
