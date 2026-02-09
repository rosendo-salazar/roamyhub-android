package com.roamyhub.android.core.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * DTO for app version check
 */
@Serializable
data class AppVersionDto(
    @SerialName("current_version") val currentVersion: String,
    @SerialName("minimum_version") val minimumVersion: String,
    @SerialName("latest_version") val latestVersion: String,
    @SerialName("update_available") val updateAvailable: Boolean,
    @SerialName("force_update") val forceUpdate: Boolean,
    @SerialName("update_url") val updateUrl: String? = null,
    @SerialName("release_notes") val releaseNotes: String? = null
)

/**
 * DTO for version check response
 */
@Serializable
data class VersionCheckResponseDto(
    @SerialName("version_info") val versionInfo: AppVersionDto
)

/**
 * DTO for legal links
 */
@Serializable
data class LegalLinksDto(
    @SerialName("terms_of_service_url") val termsOfServiceUrl: String,
    @SerialName("privacy_policy_url") val privacyPolicyUrl: String,
    @SerialName("refund_policy_url") val refundPolicyUrl: String? = null,
    @SerialName("cookie_policy_url") val cookiePolicyUrl: String? = null,
    @SerialName("acceptable_use_url") val acceptableUseUrl: String? = null
)

/**
 * DTO for legal links response
 */
@Serializable
data class LegalLinksResponseDto(
    @SerialName("links") val links: LegalLinksDto
)
