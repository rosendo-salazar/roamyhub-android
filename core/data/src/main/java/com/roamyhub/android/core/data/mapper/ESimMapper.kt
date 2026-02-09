package com.roamyhub.android.core.data.mapper

import com.roamyhub.android.core.domain.model.esim.ESim
import com.roamyhub.android.core.domain.model.esim.ESimStatus
import com.roamyhub.android.core.domain.model.esim.QrCodeData
import com.roamyhub.android.core.network.model.ESimDto
import com.roamyhub.android.core.network.model.QrCodeDataDto
import kotlinx.datetime.Instant

/**
 * Extension function to convert ESimDto to domain ESim model
 */
fun ESimDto.toDomain(): ESim {
    return ESim(
        id = id,
        userId = userId,
        orderId = orderId,
        planId = planId,
        planName = planName,
        iccid = iccid,
        status = parseESimStatus(status),
        smdpAddress = smdpAddress,
        activationCode = activationCode,
        qrCodeUrl = qrCodeUrl,
        dataAmount = dataAmount,
        dataUsed = dataUsed,
        dataRemaining = dataRemaining,
        validityDays = validityDays,
        activatedAt = activatedAt?.let { Instant.parse(it) },
        expiresAt = expiresAt?.let { Instant.parse(it) },
        countryIso = countryIso,
        countryName = countryName,
        regionKey = regionKey,
        isGlobal = isGlobal,
        createdAt = Instant.parse(createdAt),
        updatedAt = Instant.parse(updatedAt)
    )
}

/**
 * Parse eSIM status string to enum
 */
private fun parseESimStatus(status: String): ESimStatus {
    return when (status.uppercase()) {
        "PENDING" -> ESimStatus.PENDING
        "ACTIVE" -> ESimStatus.ACTIVE
        "EXPIRED" -> ESimStatus.EXPIRED
        "DEPLETED" -> ESimStatus.DEPLETED
        "CANCELLED" -> ESimStatus.CANCELLED
        else -> ESimStatus.PENDING
    }
}

/**
 * Extension function to convert QrCodeDataDto to domain QrCodeData model
 */
fun QrCodeDataDto.toDomain(): QrCodeData {
    return QrCodeData(
        esimId = esimId,
        iccid = iccid,
        smdpAddress = smdpAddress,
        activationCode = activationCode,
        qrCodeImageUrl = qrCodeUrl,
        qrCodeString = "LPA:1\$$smdpAddress\$$activationCode"
    )
}
