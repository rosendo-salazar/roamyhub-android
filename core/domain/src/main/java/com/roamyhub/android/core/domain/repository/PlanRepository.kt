package com.roamyhub.android.core.domain.repository

import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.model.plan.CountrySummary
import com.roamyhub.android.core.domain.model.plan.GlobalSummary
import com.roamyhub.android.core.domain.model.plan.Plan
import com.roamyhub.android.core.domain.model.plan.RegionSummary

/**
 * Repository interface for eSIM plan operations.
 *
 * Provides access to available eSIM data plans grouped by coverage type:
 * - Country-specific plans
 * - Regional plans (multi-country)
 * - Global plans (worldwide coverage)
 */
interface PlanRepository {

    /**
     * Get all active plans
     *
     * Returns all available plans across all coverage types.
     *
     * @return Resource containing list of all active Plans
     */
    suspend fun getPlans(): Resource<List<Plan>>

    /**
     * Get a specific plan by ID
     *
     * @param planId Unique identifier of the plan
     * @return Resource containing the Plan or error if not found
     */
    suspend fun getPlanById(planId: String): Resource<Plan>

    /**
     * Get plans available for a specific country
     *
     * Returns both country-specific plans and regional/global plans
     * that include coverage for the specified country.
     *
     * @param countryIso ISO 3166-1 alpha-2 country code (e.g., "US", "FR")
     * @return Resource containing list of CountrySummary with available plans
     */
    suspend fun getPlansByCountry(countryIso: String): Resource<List<CountrySummary>>

    /**
     * Get plans grouped by region
     *
     * Returns regional plans (multi-country coverage) organized by region.
     *
     * @param regionKey Optional region identifier to filter by specific region
     * @return Resource containing list of RegionSummary with available plans
     */
    suspend fun getPlansByRegion(regionKey: String? = null): Resource<List<RegionSummary>>

    /**
     * Get global plans
     *
     * Returns plans that provide worldwide coverage.
     *
     * @return Resource containing list of GlobalSummary with available plans
     */
    suspend fun getGlobalPlans(): Resource<List<GlobalSummary>>
}
