package com.roamyhub.android.core.data.repository

import android.util.Log
import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.data.mapper.toDomain
import com.roamyhub.android.core.domain.model.config.AppVersion
import com.roamyhub.android.core.domain.model.config.LegalLinks
import com.roamyhub.android.core.domain.repository.ConfigRepository
import com.roamyhub.android.core.network.api.PublicApiService
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Implementation of ConfigRepository.
 *
 * Handles app configuration and legal information.
 */
@Singleton
class ConfigRepositoryImpl @Inject constructor(
    private val publicApiService: PublicApiService
) : ConfigRepository {

    companion object {
        private const val TAG = "ConfigRepositoryImpl"
    }

    override suspend fun checkVersion(
        currentVersion: String,
        platform: String
    ): Resource<AppVersion> {
        return try {
            val response = publicApiService.checkVersion(currentVersion)
            val versionInfo = response.versionInfo.toDomain()
            Resource.Success(versionInfo)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to check app version", e)
            Resource.Error(e.message ?: "Failed to check app version")
        }
    }

    override suspend fun getLegalLinks(): Resource<LegalLinks> {
        return try {
            val response = publicApiService.getLegalLinks()
            val legalLinks = response.links.toDomain()
            Resource.Success(legalLinks)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to fetch legal links", e)
            Resource.Error(e.message ?: "Failed to fetch legal links")
        }
    }
}
