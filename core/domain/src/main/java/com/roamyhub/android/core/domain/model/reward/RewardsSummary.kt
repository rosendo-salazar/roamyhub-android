package com.roamyhub.android.core.domain.model.reward

/**
 * Domain model representing a user's rewards summary
 */
data class RewardsSummary(
    val userId: String,
    val totalPoints: Int,
    val availablePoints: Int, // Points that can be redeemed
    val pendingPoints: Int = 0, // Points from pending orders
    val lifetimePointsEarned: Int,
    val lifetimePointsRedeemed: Int,
    val maxRedeemablePoints: Int, // Maximum points that can be redeemed for next purchase
    val pointsValue: Double // Dollar value of available points
) {
    /**
     * Returns true if user has redeemable points
     */
    val hasRedeemablePoints: Boolean
        get() = availablePoints > 0

    /**
     * Returns true if user can redeem points (meets minimum threshold)
     */
    val canRedeemPoints: Boolean
        get() = maxRedeemablePoints > 0

    /**
     * Calculates the dollar value of a given number of points
     * @param points Number of points
     * @param pointsPerDollar Conversion rate (default: 100 points = $1)
     * @return Dollar value
     */
    fun calculatePointsValue(points: Int, pointsPerDollar: Int = 100): Double {
        return points.toDouble() / pointsPerDollar
    }

    /**
     * Calculates how many points are needed for a given dollar amount
     * @param dollarAmount Dollar amount
     * @param pointsPerDollar Conversion rate (default: 100 points = $1)
     * @return Required points
     */
    fun calculateRequiredPoints(dollarAmount: Double, pointsPerDollar: Int = 100): Int {
        return (dollarAmount * pointsPerDollar).toInt()
    }
}
