package com.roamyhub.android.core.data.repository

import android.util.Log
import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.data.mapper.toDomain
import com.roamyhub.android.core.domain.model.device.Device
import com.roamyhub.android.core.domain.repository.DeviceRepository
import com.roamyhub.android.core.network.api.PublicApiService
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Implementation of DeviceRepository.
 *
 * Handles device compatibility information.
 */
@Singleton
class DeviceRepositoryImpl @Inject constructor(
    private val publicApiService: PublicApiService
) : DeviceRepository {

    companion object {
        private const val TAG = "DeviceRepositoryImpl"
    }

    override suspend fun getCompatibleDevices(
        manufacturer: String?,
        operatingSystem: String?
    ): Resource<List<Device>> {
        return try {
            val response = publicApiService.getCompatibleDevices()
            val devices = response.devices.map { it.toDomain() }
            Resource.Success(devices)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to fetch compatible devices", e)
            Resource.Error(e.message ?: "Failed to fetch compatible devices")
        }
    }

    override suspend fun searchDevices(query: String): Resource<List<Device>> {
        return try {
            val response = publicApiService.searchDevices(query)
            val devices = response.devices.map { it.toDomain() }
            Resource.Success(devices)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to search devices with query: $query", e)
            Resource.Error(e.message ?: "Failed to search devices")
        }
    }
}
