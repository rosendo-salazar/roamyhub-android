package com.roamyhub.android.core.network.api

import com.roamyhub.android.core.network.model.DeleteESimResponseDto
import com.roamyhub.android.core.network.model.ESimResponseDto
import com.roamyhub.android.core.network.model.ESimsResponseDto
import com.roamyhub.android.core.network.model.QrCodeResponseDto
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Retrofit API service for eSIM endpoints
 */
interface ESimApiService {

    /**
     * Get all eSIMs for a user
     */
    @GET("esims/user/{userId}")
    suspend fun getUserESims(@Path("userId") userId: String): ESimsResponseDto

    /**
     * Get a specific eSIM by ID
     */
    @GET("esims/{id}")
    suspend fun getESimById(@Path("id") esimId: String): ESimResponseDto

    /**
     * Delete an eSIM
     */
    @DELETE("esims/{id}")
    suspend fun deleteESim(@Path("id") esimId: String): DeleteESimResponseDto

    /**
     * Get QR code for an eSIM
     */
    @GET("esims/{esimId}/qrcode")
    suspend fun getESimQrCode(@Path("esimId") esimId: String): QrCodeResponseDto

    /**
     * Get QR code data (alternative endpoint)
     */
    @GET("qrcode/data")
    suspend fun getQrCodeData(): QrCodeResponseDto
}
