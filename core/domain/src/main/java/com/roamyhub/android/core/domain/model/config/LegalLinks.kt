package com.roamyhub.android.core.domain.model.config

/**
 * Domain model representing legal document links
 */
data class LegalLinks(
    val termsOfServiceUrl: String,
    val privacyPolicyUrl: String,
    val refundPolicyUrl: String? = null,
    val cookiePolicyUrl: String? = null,
    val acceptableUseUrl: String? = null
) {
    /**
     * Returns all available legal links as a map
     */
    fun getAllLinks(): Map<String, String> {
        return buildMap {
            put("Terms of Service", termsOfServiceUrl)
            put("Privacy Policy", privacyPolicyUrl)
            refundPolicyUrl?.let { put("Refund Policy", it) }
            cookiePolicyUrl?.let { put("Cookie Policy", it) }
            acceptableUseUrl?.let { put("Acceptable Use", it) }
        }
    }
}
