package com.roamyhub.android.core.domain.model.esim

import kotlinx.datetime.Instant

/**
 * Domain model representing an eSIM
 */
data class ESim(
    val id: String,
    val userId: String,
    val orderId: String,
    val planId: String,
    val planName: String,
    val iccid: String,
    val status: ESimStatus,
    val smdpAddress: String? = null,
    val activationCode: String? = null,
    val qrCodeUrl: String? = null,

    // Data usage
    val dataAmount: Long, // Total data in MB
    val dataUsed: Long = 0L, // Data used in MB
    val dataRemaining: Long = dataAmount - dataUsed,

    // Validity
    val validityDays: Int,
    val activatedAt: Instant? = null,
    val expiresAt: Instant? = null,

    // Coverage
    val countryIso: String? = null,
    val countryName: String? = null,
    val regionKey: String? = null,
    val isGlobal: Boolean = false,

    // Metadata
    val createdAt: Instant,
    val updatedAt: Instant
) {
    /**
     * Returns the data usage percentage (0-100)
     */
    val dataUsagePercentage: Int
        get() = if (dataAmount > 0) {
            ((dataUsed.toDouble() / dataAmount) * 100).toInt().coerceIn(0, 100)
        } else {
            0
        }

    /**
     * Returns true if the eSIM has data remaining
     */
    val hasDataRemaining: Boolean
        get() = dataRemaining > 0

    /**
     * Returns true if the eSIM is expired
     */
    val isExpired: Boolean
        get() = status == ESimStatus.EXPIRED

    /**
     * Returns true if the eSIM is active
     */
    val isActive: Boolean
        get() = status == ESimStatus.ACTIVE

    /**
     * Returns a formatted string of data remaining (e.g., "500 MB", "1.5 GB")
     */
    fun getFormattedDataRemaining(): String {
        return if (dataRemaining >= 1024) {
            "%.1f GB".format(dataRemaining / 1024.0)
        } else {
            "$dataRemaining MB"
        }
    }

    /**
     * Returns a formatted string of total data (e.g., "1 GB", "500 MB")
     */
    fun getFormattedDataAmount(): String {
        return if (dataAmount >= 1024) {
            "${dataAmount / 1024} GB"
        } else {
            "$dataAmount MB"
        }
    }

    /**
     * Returns the coverage description
     */
    fun getCoverageDescription(): String = when {
        isGlobal -> "Global"
        regionKey != null -> regionKey.replaceFirstChar { it.uppercase() }
        countryName != null -> countryName
        else -> "Unknown"
    }
}
