package com.roamyhub.android.core.domain.repository

import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.model.esim.ESim
import com.roamyhub.android.core.domain.model.esim.QrCodeData
import kotlinx.coroutines.flow.Flow

/**
 * Repository interface for eSIM management operations.
 *
 * Handles retrieval, activation, and deletion of user's eSIM profiles.
 */
interface ESimRepository {

    /**
     * Observe the current user's eSIMs
     *
     * Emits updates whenever the user's eSIM collection changes
     * (e.g., new eSIM purchased, eSIM deleted, data usage updated).
     *
     * @return Flow emitting list of user's ESims
     */
    fun getUserESims(): Flow<Resource<List<ESim>>>

    /**
     * Get a specific eSIM by ID
     *
     * @param eSimId Unique identifier of the eSIM
     * @return Resource containing the ESim or error if not found
     */
    suspend fun getESimById(eSimId: String): Resource<ESim>

    /**
     * Get QR code data for eSIM installation
     *
     * Retrieves the LPA (Local Profile Assistant) string and QR code image
     * required to install the eSIM profile on a device.
     *
     * @param eSimId Unique identifier of the eSIM
     * @return Resource containing QrCodeData with installation information
     */
    suspend fun getESimQrCode(eSimId: String): Resource<QrCodeData>

    /**
     * Delete an eSIM
     *
     * Permanently removes the eSIM from the user's account.
     * This operation cannot be undone.
     *
     * @param eSimId Unique identifier of the eSIM to delete
     * @return Resource indicating success or error
     */
    suspend fun deleteESim(eSimId: String): Resource<Unit>
}
