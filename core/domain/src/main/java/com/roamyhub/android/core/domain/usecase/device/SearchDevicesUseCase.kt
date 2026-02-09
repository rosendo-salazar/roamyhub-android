package com.roamyhub.android.core.domain.usecase.device

import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.model.device.Device
import com.roamyhub.android.core.domain.repository.DeviceRepository
import javax.inject.Inject

/**
 * Use case to search for devices by name or model.
 *
 * Performs a search across device manufacturers, models, and names.
 */
class SearchDevicesUseCase @Inject constructor(
    private val deviceRepository: DeviceRepository
) {
    suspend operator fun invoke(query: String): Resource<List<Device>> {
        if (query.isBlank()) {
            return Resource.Success(emptyList())
        }

        if (query.length < 2) {
            return Resource.Error("Search query must be at least 2 characters")
        }

        return deviceRepository.searchDevices(query.trim())
    }
}
