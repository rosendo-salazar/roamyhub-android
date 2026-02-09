package com.roamyhub.android.core.domain.usecase.config

import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.model.config.AppVersion
import com.roamyhub.android.core.domain.repository.ConfigRepository
import javax.inject.Inject

/**
 * Use case to check app version compatibility.
 *
 * Verifies if the current app version meets minimum requirements.
 */
class CheckVersionUseCase @Inject constructor(
    private val configRepository: ConfigRepository
) {
    suspend operator fun invoke(
        currentVersion: String,
        platform: String = "android"
    ): Resource<AppVersion> {
        if (currentVersion.isBlank()) {
            return Resource.Error("Current version is required")
        }

        return configRepository.checkVersion(
            currentVersion = currentVersion,
            platform = platform
        )
    }
}
