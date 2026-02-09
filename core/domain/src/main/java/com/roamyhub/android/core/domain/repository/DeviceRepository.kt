package com.roamyhub.android.core.domain.repository

import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.model.device.Device

/**
 * Repository interface for device compatibility operations.
 *
 * Provides information about devices that are compatible with eSIM technology.
 * Helps users verify if their device supports eSIM before purchasing.
 */
interface DeviceRepository {

    /**
     * Get all compatible devices
     *
     * Returns a list of all devices known to support eSIM functionality.
     * Results can be optionally filtered by manufacturer or operating system.
     *
     * @param manufacturer Optional manufacturer filter (e.g., "Apple", "Samsung", "Google")
     * @param operatingSystem Optional OS filter (e.g., "iOS", "Android")
     * @return Resource containing list of compatible Devices
     */
    suspend fun getCompatibleDevices(
        manufacturer: String? = null,
        operatingSystem: String? = null
    ): Resource<List<Device>>

    /**
     * Search for devices by name or model
     *
     * Performs a search across device manufacturers, models, and names
     * to find matching compatible devices.
     *
     * @param query Search query string (minimum 2 characters)
     * @return Resource containing list of matching Devices
     */
    suspend fun searchDevices(query: String): Resource<List<Device>>
}
