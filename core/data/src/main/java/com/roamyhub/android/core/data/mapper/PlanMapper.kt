package com.roamyhub.android.core.data.mapper

import com.roamyhub.android.core.domain.model.plan.Country
import com.roamyhub.android.core.domain.model.plan.CountryFlagUrls
import com.roamyhub.android.core.domain.model.plan.CountrySummary
import com.roamyhub.android.core.domain.model.plan.CoverageType
import com.roamyhub.android.core.domain.model.plan.GlobalSummary
import com.roamyhub.android.core.domain.model.plan.Plan
import com.roamyhub.android.core.network.model.CountryDto
import com.roamyhub.android.core.network.model.CountryFlagUrlsDto
import com.roamyhub.android.core.network.model.CountrySummaryDto
import com.roamyhub.android.core.network.model.GlobalSummaryDto
import com.roamyhub.android.core.network.model.PlanDto
import com.roamyhub.android.core.network.model.RegionSummaryDto
import com.roamyhub.android.core.domain.model.plan.RegionSummary
import kotlinx.datetime.Instant

/**
 * Extension function to convert PlanDto to domain Plan model
 */
fun PlanDto.toDomain(): Plan {
    return Plan(
        id = id,
        name = name,
        description = description,
        countryIso = countryIso,
        regionKey = regionKey,
        isGlobal = isGlobal,
        dataAmount = dataAmount,
        validity = validity,
        price = price,
        currency = currency,
        coverageType = parseCoverageType(coverageType),
        features = features,
        isActive = isActive,
        badge = badge,
        unlimitedType = unlimitedType,
        maxRedeemablePoints = maxRedeemablePoints,
        countries = countries,
        imageUrl = imageUrl,
        regionIconUrl = regionIconUrl,
        currencyPrices = currencyPrices,
        createdAt = Instant.parse(createdAt),
        updatedAt = Instant.parse(updatedAt)
    )
}

/**
 * Parse coverage type string to enum
 */
private fun parseCoverageType(type: String): CoverageType {
    return when (type.uppercase()) {
        "COUNTRY", "SINGLE_COUNTRY" -> CoverageType.SINGLE_COUNTRY
        "REGIONAL" -> CoverageType.REGIONAL
        "GLOBAL" -> CoverageType.GLOBAL
        else -> CoverageType.SINGLE_COUNTRY
    }
}

/**
 * Extension function to convert CountryDto to domain Country model
 */
fun CountryDto.toDomain(): Country {
    return Country(
        code = code,
        name = name,
        flagEmoji = flagEmoji,
        region = region,
        continent = continent,
        availablePlansCount = availablePlansCount,
        iso3 = iso3,
        localizedName = localizedName,
        flagUrls = flagUrls?.toDomain()
    )
}

/**
 * Extension function to convert CountryFlagUrlsDto to domain CountryFlagUrls model
 */
fun CountryFlagUrlsDto.toDomain(): CountryFlagUrls {
    return CountryFlagUrls(
        small = small,
        medium = medium,
        large = large,
        xlarge = xlarge,
        xxlarge = xxlarge,
        svg = svg
    )
}

/**
 * Extension function to convert CountrySummaryDto to domain CountrySummary model
 */
fun CountrySummaryDto.toDomain(): CountrySummary {
    return CountrySummary(
        countryCode = countryCode,
        countryName = countryName,
        flagEmoji = flagEmoji,
        planCount = planCount,
        startingPrice = startingPrice,
        currency = currency,
        localizedName = localizedName,
        flagUrls = flagUrls?.toDomain()
    )
}

/**
 * Extension function to convert RegionSummaryDto to domain RegionSummary model
 */
fun RegionSummaryDto.toDomain(): RegionSummary {
    return RegionSummary(
        regionKey = regionKey,
        regionName = regionName,
        description = description,
        countryCount = countryCount,
        planCount = planCount,
        startingPrice = startingPrice,
        currency = currency,
        regionIso3 = regionIso3,
        localizedName = localizedName,
        iconUrl = iconUrl
    )
}

/**
 * Extension function to convert GlobalSummaryDto to domain GlobalSummary model
 */
fun GlobalSummaryDto.toDomain(): GlobalSummary {
    return GlobalSummary(
        totalPlans = planCount,
        startingPrice = startingPrice,
        currency = currency,
        coverageCount = countryCount,
        globalName = regionName,
        globalIso3 = null,
        iconUrl = iconUrl
    )
}
