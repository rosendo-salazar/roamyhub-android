package com.roamyhub.android.feature.profile.devices.state

import com.roamyhub.android.core.domain.model.device.Device

/**
 * UI state for Devices screen
 */
data class DevicesUiState(
    val devices: List<Device> = emptyList(),
    val searchQuery: String = "",
    val selectedBrand: String? = null,
    val isLoading: Boolean = false,
    val error: String? = null
) {
    /**
     * Returns devices grouped by brand
     */
    val devicesByBrand: Map<String, List<Device>>
        get() = devices.groupBy { it.brand }.toSortedMap()

    /**
     * Returns filtered devices based on search query
     */
    val filteredDevices: List<Device>
        get() = if (searchQuery.isBlank()) {
            devices
        } else {
            devices.filter {
                it.fullName.contains(searchQuery, ignoreCase = true) ||
                it.brand.contains(searchQuery, ignoreCase = true) ||
                it.model.contains(searchQuery, ignoreCase = true)
            }
        }

    /**
     * Returns true if there are no devices
     */
    val isEmpty: Boolean
        get() = devices.isEmpty() && !isLoading
}
