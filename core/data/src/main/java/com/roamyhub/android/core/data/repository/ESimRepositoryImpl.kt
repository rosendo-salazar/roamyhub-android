package com.roamyhub.android.core.data.repository

import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.data.mapper.toDomain
import com.roamyhub.android.core.domain.model.esim.ESim
import com.roamyhub.android.core.domain.model.esim.QrCodeData
import com.roamyhub.android.core.domain.repository.ESimRepository
import com.roamyhub.android.core.network.api.ESimApiService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Implementation of ESimRepository.
 *
 * Handles eSIM management operations.
 */
@Singleton
class ESimRepositoryImpl @Inject constructor(
    private val eSimApiService: ESimApiService
) : ESimRepository {

    companion object {
        private const val TAG = "ESimRepositoryImpl"
    }

    private val auth: FirebaseAuth by lazy { FirebaseAuth.getInstance() }

    override fun getUserESims(): Flow<Resource<List<ESim>>> = flow {
        emit(Resource.Loading())

        try {
            val userId = auth.currentUser?.uid
                ?: throw IllegalStateException("User not authenticated")

            val response = eSimApiService.getUserESims(userId)
            val esims = response.esims.map { it.toDomain() }
            emit(Resource.Success(esims))
        } catch (e: Exception) {
            Log.e(TAG, "Failed to fetch user eSIMs", e)
            emit(Resource.Error(e.message ?: "Failed to fetch eSIMs"))
        }
    }

    override suspend fun getESimById(eSimId: String): Resource<ESim> {
        return try {
            val response = eSimApiService.getESimById(eSimId)
            val esim = response.esim.toDomain()
            Resource.Success(esim)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to fetch eSIM with ID: $eSimId", e)
            Resource.Error(e.message ?: "Failed to fetch eSIM")
        }
    }

    override suspend fun getESimQrCode(eSimId: String): Resource<QrCodeData> {
        return try {
            val response = eSimApiService.getESimQrCode(eSimId)
            val qrCodeData = response.qrCode.toDomain()
            Resource.Success(qrCodeData)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to fetch QR code for eSIM: $eSimId", e)
            Resource.Error(e.message ?: "Failed to fetch QR code")
        }
    }

    override suspend fun deleteESim(eSimId: String): Resource<Unit> {
        return try {
            val response = eSimApiService.deleteESim(eSimId)
            if (response.success) {
                Resource.Success(Unit)
            } else {
                Resource.Error(response.message)
            }
        } catch (e: Exception) {
            Log.e(TAG, "Failed to delete eSIM: $eSimId", e)
            Resource.Error(e.message ?: "Failed to delete eSIM")
        }
    }
}
