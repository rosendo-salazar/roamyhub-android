package com.roamyhub.android.core.domain.model.plan

/**
 * Coverage type for data plans
 */
enum class CoverageType {
    /**
     * Plan covers a single country
     */
    SINGLE_COUNTRY,

    /**
     * Plan covers multiple countries within a region
     */
    REGIONAL,

    /**
     * Plan covers multiple countries across the globe
     */
    GLOBAL
}
