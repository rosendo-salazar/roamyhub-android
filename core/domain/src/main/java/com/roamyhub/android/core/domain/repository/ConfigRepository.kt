package com.roamyhub.android.core.domain.repository

import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.model.config.AppVersion
import com.roamyhub.android.core.domain.model.config.LegalLinks

/**
 * Repository interface for app configuration operations.
 *
 * Provides access to application-level configuration including
 * version checking and legal/policy links.
 */
interface ConfigRepository {

    /**
     * Check app version compatibility
     *
     * Verifies if the current app version meets minimum requirements
     * and notifies users about available updates.
     *
     * @param currentVersion Current installed version of the app (e.g., "1.2.3")
     * @param platform Platform identifier (e.g., "android")
     * @return Resource containing AppVersion with update requirements and information
     */
    suspend fun checkVersion(
        currentVersion: String,
        platform: String = "android"
    ): Resource<AppVersion>

    /**
     * Get legal document links
     *
     * Retrieves URLs to Terms of Service, Privacy Policy, and other
     * legal documents. Links may be localized based on user's region.
     *
     * @return Resource containing LegalLinks with document URLs
     */
    suspend fun getLegalLinks(): Resource<LegalLinks>
}
