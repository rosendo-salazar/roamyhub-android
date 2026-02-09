package com.roamyhub.android.version

import com.roamyhub.android.BuildConfig
import timber.log.Timber
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Manager for checking app version and determining if update is needed
 */
@Singleton
class VersionManager @Inject constructor() {

    /**
     * Check if an app update is available
     * @return The version status
     */
    suspend fun checkForUpdate(): VersionStatus {
        return try {
            // TODO: Implement version check via backend API
            // Example endpoint: GET /public/version/check?platform=android&version=1.0.0
            // Response should include: minVersion, latestVersion, releaseNotes, forceUpdate

            // For now, return UpToDate
            // When backend is ready, uncomment the following:
            /*
            val response = versionApi.checkVersion(
                platform = "android",
                currentVersion = BuildConfig.VERSION_NAME
            )

            when {
                response.forceUpdate -> VersionStatus.ForceUpdate(
                    minVersion = response.minVersion,
                    message = response.message ?: "Please update to continue using RoamyHub"
                )
                isUpdateAvailable(BuildConfig.VERSION_NAME, response.latestVersion) -> {
                    VersionStatus.UpdateAvailable(
                        latestVersion = response.latestVersion,
                        releaseNotes = response.releaseNotes ?: "Bug fixes and improvements"
                    )
                }
                else -> VersionStatus.UpToDate
            }
            */

            Timber.d("Version check completed. Current version: ${BuildConfig.VERSION_NAME}")
            VersionStatus.UpToDate
        } catch (e: Exception) {
            Timber.e(e, "Failed to check for updates")
            // On error, don't block the user
            VersionStatus.UpToDate
        }
    }

    /**
     * Compare two version strings
     * @return true if newVersion > currentVersion
     */
    private fun isUpdateAvailable(currentVersion: String, newVersion: String): Boolean {
        try {
            val current = parseVersion(currentVersion)
            val new = parseVersion(newVersion)

            for (i in 0 until maxOf(current.size, new.size)) {
                val c = current.getOrNull(i) ?: 0
                val n = new.getOrNull(i) ?: 0
                if (n > c) return true
                if (n < c) return false
            }
            return false
        } catch (e: Exception) {
            Timber.e(e, "Failed to parse version numbers")
            return false
        }
    }

    /**
     * Parse version string into list of integers
     * Example: "1.2.3" -> [1, 2, 3]
     */
    private fun parseVersion(version: String): List<Int> {
        return version.split(".")
            .mapNotNull { it.toIntOrNull() }
    }
}
