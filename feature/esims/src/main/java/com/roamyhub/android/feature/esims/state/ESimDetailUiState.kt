package com.roamyhub.android.feature.esims.state

import com.roamyhub.android.core.domain.model.esim.ESim
import com.roamyhub.android.core.domain.model.esim.ESimStatus

/**
 * UI state for eSIM detail screen
 */
data class ESimDetailUiState(
    val esim: ESim? = null,
    val isLoading: Boolean = false,
    val error: String? = null,
    val isDeleting: Boolean = false,
    val deleteError: String? = null
) {
    /**
     * Returns true if the eSIM can be deleted
     * Business rule: Can delete any eSIM (even active ones, but we'll show a warning)
     */
    val canDelete: Boolean
        get() = esim != null

    /**
     * Returns true if the eSIM is expired
     */
    val isExpired: Boolean
        get() = esim?.isExpired == true

    /**
     * Returns data remaining percentage (0-100)
     */
    val dataRemainingPercentage: Int
        get() = esim?.let { 100 - it.dataUsagePercentage } ?: 0

    /**
     * Returns true if this is an active eSIM (show warning before deletion)
     */
    val isActiveESim: Boolean
        get() = esim?.status == ESimStatus.ACTIVE

    /**
     * Returns true if data is critically low (> 80% used)
     */
    val isDataCritical: Boolean
        get() = esim?.dataUsagePercentage?.let { it > 80 } ?: false

    /**
     * Returns true if data is in warning range (50-80% used)
     */
    val isDataWarning: Boolean
        get() = esim?.dataUsagePercentage?.let { it in 50..80 } ?: false
}
