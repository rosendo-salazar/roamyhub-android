package com.roamyhub.android.core.data.mapper

import com.roamyhub.android.core.domain.model.device.Device
import com.roamyhub.android.core.network.model.DeviceDto

/**
 * Extension function to convert DeviceDto to domain Device model
 */
fun DeviceDto.toDomain(): Device {
    return Device(
        id = id,
        brand = brand,
        model = model,
        releaseYear = releaseYear,
        isCompatible = isCompatible,
        notes = notes,
        imageUrl = imageUrl
    )
}
