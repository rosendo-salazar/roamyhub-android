package com.roamyhub.android.core.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * DTO for device data
 */
@Serializable
data class DeviceDto(
    @SerialName("id") val id: String,
    @SerialName("brand") val brand: String,
    @SerialName("model") val model: String,
    @SerialName("release_year") val releaseYear: Int? = null,
    @SerialName("is_compatible") val isCompatible: Boolean,
    @SerialName("notes") val notes: String? = null,
    @SerialName("image_url") val imageUrl: String? = null
)

/**
 * DTO for list of compatible devices response
 */
@Serializable
data class CompatibleDevicesResponseDto(
    @SerialName("devices") val devices: List<DeviceDto>,
    @SerialName("total") val total: Int
)

/**
 * DTO for device search response
 */
@Serializable
data class DeviceSearchResponseDto(
    @SerialName("devices") val devices: List<DeviceDto>,
    @SerialName("total") val total: Int,
    @SerialName("query") val query: String
)
