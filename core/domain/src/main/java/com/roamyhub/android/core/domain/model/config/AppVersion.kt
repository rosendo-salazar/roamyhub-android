package com.roamyhub.android.core.domain.model.config

/**
 * Domain model representing app version information
 */
data class AppVersion(
    val currentVersion: String,
    val minimumVersion: String,
    val latestVersion: String,
    val updateAvailable: Boolean,
    val forceUpdate: Boolean,
    val updateUrl: String? = null,
    val releaseNotes: String? = null
) {
    /**
     * Returns true if the current version is below the minimum required version
     */
    val mustUpdate: Boolean
        get() = forceUpdate

    /**
     * Returns true if an optional update is available
     */
    val canUpdate: Boolean
        get() = updateAvailable && !forceUpdate

    /**
     * Compares version strings (e.g., "1.2.3" vs "1.2.4")
     */
    private fun compareVersions(version1: String, version2: String): Int {
        val parts1 = version1.split(".").map { it.toIntOrNull() ?: 0 }
        val parts2 = version2.split(".").map { it.toIntOrNull() ?: 0 }

        for (i in 0 until maxOf(parts1.size, parts2.size)) {
            val v1 = parts1.getOrNull(i) ?: 0
            val v2 = parts2.getOrNull(i) ?: 0
            if (v1 != v2) return v1.compareTo(v2)
        }
        return 0
    }

    /**
     * Returns true if current version is outdated
     */
    fun isOutdated(): Boolean {
        return compareVersions(currentVersion, minimumVersion) < 0
    }
}
