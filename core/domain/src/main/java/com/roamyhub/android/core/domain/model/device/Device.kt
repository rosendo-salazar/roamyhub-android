package com.roamyhub.android.core.domain.model.device

/**
 * Domain model representing a device that supports eSIM
 */
data class Device(
    val id: String,
    val brand: String,
    val model: String,
    val releaseYear: Int? = null,
    val isCompatible: Boolean,
    val notes: String? = null,
    val imageUrl: String? = null
) {
    /**
     * Returns the full device name (brand + model)
     */
    val fullName: String
        get() = "$brand $model"

    /**
     * Returns the display name with release year if available
     */
    val displayName: String
        get() = if (releaseYear != null) {
            "$fullName ($releaseYear)"
        } else {
            fullName
        }
}
