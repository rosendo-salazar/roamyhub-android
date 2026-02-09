package com.roamyhub.android.feature.esims.state

import com.roamyhub.android.core.domain.model.esim.QrCodeData

/**
 * UI state for QR code screen
 */
data class QrCodeUiState(
    val qrCodeData: QrCodeData? = null,
    val isLoading: Boolean = false,
    val error: String? = null,
    val copiedField: CopiedField? = null
) {
    /**
     * Returns true if QR code data is available and valid
     */
    val hasValidQrCode: Boolean
        get() = qrCodeData?.isComplete() == true

    /**
     * Enum for tracking which field was copied
     */
    enum class CopiedField {
        SMDP_ADDRESS,
        ACTIVATION_CODE,
        FULL_STRING
    }
}
