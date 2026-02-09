package com.roamyhub.android.core.data.repository

import android.util.Log
import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.data.mapper.toDomain
import com.roamyhub.android.core.domain.model.plan.CountrySummary
import com.roamyhub.android.core.domain.model.plan.GlobalSummary
import com.roamyhub.android.core.domain.model.plan.Plan
import com.roamyhub.android.core.domain.model.plan.RegionSummary
import com.roamyhub.android.core.domain.repository.PlanRepository
import com.roamyhub.android.core.network.api.BrowseApiService
import com.roamyhub.android.core.network.api.PlanApiService
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Implementation of PlanRepository.
 *
 * Handles retrieval of eSIM plans from the backend API.
 */
@Singleton
class PlanRepositoryImpl @Inject constructor(
    private val planApiService: PlanApiService,
    private val browseApiService: BrowseApiService
) : PlanRepository {

    companion object {
        private const val TAG = "PlanRepositoryImpl"
    }

    override suspend fun getPlans(): Resource<List<Plan>> {
        return try {
            val response = planApiService.getPlans()
            val plans = response.plans.map { it.toDomain() }
            Resource.Success(plans)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to fetch plans", e)
            Resource.Error(e.message ?: "Failed to fetch plans")
        }
    }

    override suspend fun getPlanById(planId: String): Resource<Plan> {
        return try {
            val response = planApiService.getPlanById(planId)
            val plan = response.plan.toDomain()
            Resource.Success(plan)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to fetch plan with ID: $planId", e)
            Resource.Error(e.message ?: "Failed to fetch plan")
        }
    }

    override suspend fun getPlansByCountry(countryIso: String): Resource<List<CountrySummary>> {
        return try {
            val response = browseApiService.getCountrySummaries()
            val summaries = response.summaries
                .filter { it.countryCode.equals(countryIso, ignoreCase = true) }
                .map { it.toDomain() }
            Resource.Success(summaries)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to fetch plans for country: $countryIso", e)
            Resource.Error(e.message ?: "Failed to fetch plans for country")
        }
    }

    override suspend fun getPlansByRegion(regionKey: String?): Resource<List<RegionSummary>> {
        return try {
            val response = browseApiService.getRegionSummaries()
            val summaries = if (regionKey != null) {
                response.summaries
                    .filter { it.regionKey.equals(regionKey, ignoreCase = true) }
                    .map { it.toDomain() }
            } else {
                response.summaries.map { it.toDomain() }
            }
            Resource.Success(summaries)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to fetch regional plans", e)
            Resource.Error(e.message ?: "Failed to fetch regional plans")
        }
    }

    override suspend fun getGlobalPlans(): Resource<List<GlobalSummary>> {
        return try {
            val response = browseApiService.getGlobalSummary()
            val summary = response.summary.toDomain()
            Resource.Success(listOf(summary))
        } catch (e: Exception) {
            Log.e(TAG, "Failed to fetch global plans", e)
            Resource.Error(e.message ?: "Failed to fetch global plans")
        }
    }
}
