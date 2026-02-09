package com.roamyhub.android.core.domain.usecase.device

import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.model.device.Device
import com.roamyhub.android.core.domain.repository.DeviceRepository
import javax.inject.Inject

/**
 * Use case to retrieve all devices compatible with eSIM.
 *
 * Can optionally filter by manufacturer or operating system.
 */
class GetCompatibleDevicesUseCase @Inject constructor(
    private val deviceRepository: DeviceRepository
) {
    suspend operator fun invoke(
        manufacturer: String? = null,
        operatingSystem: String? = null
    ): Resource<List<Device>> {
        return deviceRepository.getCompatibleDevices(
            manufacturer = manufacturer,
            operatingSystem = operatingSystem
        )
    }
}
