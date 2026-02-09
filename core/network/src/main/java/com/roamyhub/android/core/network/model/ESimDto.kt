package com.roamyhub.android.core.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * DTO for eSIM data
 */
@Serializable
data class ESimDto(
    @SerialName("id") val id: String,
    @SerialName("user_id") val userId: String,
    @SerialName("order_id") val orderId: String,
    @SerialName("plan_id") val planId: String,
    @SerialName("plan_name") val planName: String,
    @SerialName("iccid") val iccid: String,
    @SerialName("status") val status: String,
    @SerialName("smdp_address") val smdpAddress: String? = null,
    @SerialName("activation_code") val activationCode: String? = null,
    @SerialName("qr_code_url") val qrCodeUrl: String? = null,
    @SerialName("data_amount") val dataAmount: Long,
    @SerialName("data_used") val dataUsed: Long = 0L,
    @SerialName("data_remaining") val dataRemaining: Long,
    @SerialName("validity_days") val validityDays: Int,
    @SerialName("activated_at") val activatedAt: String? = null,
    @SerialName("expires_at") val expiresAt: String? = null,
    @SerialName("country_iso") val countryIso: String? = null,
    @SerialName("country_name") val countryName: String? = null,
    @SerialName("region_key") val regionKey: String? = null,
    @SerialName("is_global") val isGlobal: Boolean = false,
    @SerialName("created_at") val createdAt: String,
    @SerialName("updated_at") val updatedAt: String
)

/**
 * DTO for list of eSIMs response
 */
@Serializable
data class ESimsResponseDto(
    @SerialName("esims") val esims: List<ESimDto>,
    @SerialName("total") val total: Int
)

/**
 * DTO for single eSIM response
 */
@Serializable
data class ESimResponseDto(
    @SerialName("esim") val esim: ESimDto
)

/**
 * DTO for QR code data
 */
@Serializable
data class QrCodeDataDto(
    @SerialName("esim_id") val esimId: String,
    @SerialName("qr_code_url") val qrCodeUrl: String,
    @SerialName("activation_code") val activationCode: String,
    @SerialName("smdp_address") val smdpAddress: String,
    @SerialName("iccid") val iccid: String
)

/**
 * DTO for QR code response
 */
@Serializable
data class QrCodeResponseDto(
    @SerialName("qr_code") val qrCode: QrCodeDataDto
)

/**
 * DTO for delete eSIM response
 */
@Serializable
data class DeleteESimResponseDto(
    @SerialName("success") val success: Boolean,
    @SerialName("message") val message: String
)
