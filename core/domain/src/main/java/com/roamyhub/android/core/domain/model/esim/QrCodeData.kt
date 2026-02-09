package com.roamyhub.android.core.domain.model.esim

/**
 * Domain model representing QR code data for eSIM activation
 */
data class QrCodeData(
    val esimId: String,
    val iccid: String,
    val smdpAddress: String,
    val activationCode: String,
    val qrCodeImageUrl: String,
    val qrCodeString: String // The actual LPA:1$ string that can be scanned
) {
    /**
     * Returns true if all required data is available
     */
    fun isComplete(): Boolean {
        return smdpAddress.isNotBlank() &&
               activationCode.isNotBlank() &&
               qrCodeString.isNotBlank()
    }

    /**
     * Returns the manual activation string (for copying)
     */
    fun getManualActivationString(): String {
        return qrCodeString
    }
}
