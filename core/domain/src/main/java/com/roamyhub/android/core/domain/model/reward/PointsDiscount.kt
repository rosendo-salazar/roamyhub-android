package com.roamyhub.android.core.domain.model.reward

/**
 * Domain model representing a points discount calculation
 */
data class PointsDiscount(
    val pointsToRedeem: Int,
    val discountAmount: Double,
    val originalAmount: Double,
    val finalAmount: Double,
    val currency: String
) {
    /**
     * Returns the discount percentage
     */
    val discountPercentage: Int
        get() = if (originalAmount > 0) {
            ((discountAmount / originalAmount) * 100).toInt()
        } else {
            0
        }

    /**
     * Returns true if this is a full discount (final amount is 0)
     */
    val isFullDiscount: Boolean
        get() = finalAmount == 0.0

    /**
     * Returns true if points can be applied
     */
    val isValid: Boolean
        get() = pointsToRedeem > 0 && discountAmount > 0
}
