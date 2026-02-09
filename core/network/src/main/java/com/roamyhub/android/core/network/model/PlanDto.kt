package com.roamyhub.android.core.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * DTO for plan data
 */
@Serializable
data class PlanDto(
    @SerialName("id") val id: String,
    @SerialName("name") val name: String,
    @SerialName("description") val description: String? = null,
    @SerialName("country_iso") val countryIso: String? = null,
    @SerialName("region_key") val regionKey: String? = null,
    @SerialName("is_global") val isGlobal: Boolean = false,
    @SerialName("data_amount") val dataAmount: Long,
    @SerialName("validity") val validity: Int,
    @SerialName("price") val price: Double,
    @SerialName("currency") val currency: String = "USD",
    @SerialName("coverage_type") val coverageType: String,
    @SerialName("features") val features: List<String> = emptyList(),
    @SerialName("is_active") val isActive: Boolean = true,
    @SerialName("badge") val badge: String? = null,
    @SerialName("unlimited_type") val unlimitedType: String? = null,
    @SerialName("max_redeemable_points") val maxRedeemablePoints: Int? = null,
    @SerialName("countries") val countries: List<String> = emptyList(),
    @SerialName("image_url") val imageUrl: String? = null,
    @SerialName("region_icon_url") val regionIconUrl: String? = null,
    @SerialName("currency_prices") val currencyPrices: Map<String, Double> = emptyMap(),
    @SerialName("created_at") val createdAt: String,
    @SerialName("updated_at") val updatedAt: String
)

/**
 * DTO for list of plans response
 */
@Serializable
data class PlansResponseDto(
    @SerialName("plans") val plans: List<PlanDto>,
    @SerialName("total") val total: Int
)

/**
 * DTO for single plan response
 */
@Serializable
data class PlanResponseDto(
    @SerialName("plan") val plan: PlanDto
)
