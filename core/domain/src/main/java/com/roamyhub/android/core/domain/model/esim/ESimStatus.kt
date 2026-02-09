package com.roamyhub.android.core.domain.model.esim

/**
 * Enum representing the status of an eSIM
 */
enum class ESimStatus {
    /**
     * eSIM is active and can be used
     */
    ACTIVE,

    /**
     * eSIM has expired (validity period ended)
     */
    EXPIRED,

    /**
     * eSIM has depleted all its data
     */
    DEPLETED,

    /**
     * eSIM order is pending activation
     */
    PENDING,

    /**
     * eSIM has been cancelled
     */
    CANCELLED;

    /**
     * Returns true if the eSIM can be used
     */
    fun isUsable(): Boolean = this == ACTIVE

    /**
     * Returns a user-friendly display name
     */
    fun displayName(): String = when (this) {
        ACTIVE -> "Active"
        EXPIRED -> "Expired"
        DEPLETED -> "Data Used"
        PENDING -> "Pending"
        CANCELLED -> "Cancelled"
    }
}
