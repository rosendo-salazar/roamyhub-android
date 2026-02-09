package com.roamyhub.android.version

/**
 * Represents the version status of the app
 */
sealed class VersionStatus {
    /**
     * App is up to date
     */
    object UpToDate : VersionStatus()

    /**
     * Update is available but not required
     * @param latestVersion The latest available version
     * @param releaseNotes Notes about the new version
     */
    data class UpdateAvailable(
        val latestVersion: String,
        val releaseNotes: String
    ) : VersionStatus()

    /**
     * Update is required to continue using the app
     * @param minVersion The minimum required version
     * @param message Message to display to the user
     */
    data class ForceUpdate(
        val minVersion: String,
        val message: String
    ) : VersionStatus()
}
