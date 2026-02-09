package com.roamyhub.android.core.data.repository

import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.data.mapper.toDomain
import com.roamyhub.android.core.domain.model.order.Order
import com.roamyhub.android.core.domain.model.order.OrderDetail
import com.roamyhub.android.core.domain.repository.OrderRepository
import com.roamyhub.android.core.network.api.OrderApiService
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Implementation of OrderRepository.
 *
 * Handles order retrieval and management.
 */
@Singleton
class OrderRepositoryImpl @Inject constructor(
    private val orderApiService: OrderApiService
) : OrderRepository {

    companion object {
        private const val TAG = "OrderRepositoryImpl"
    }

    private val auth: FirebaseAuth by lazy { FirebaseAuth.getInstance() }

    override suspend fun getUserOrders(page: Int, pageSize: Int): Resource<List<Order>> {
        return try {
            val userId = auth.currentUser?.uid
                ?: return Resource.Error("User not authenticated")

            val response = orderApiService.getUserOrders(
                userId = userId,
                page = page,
                pageSize = pageSize
            )
            val orders = response.orders.map { it.toDomain() }
            Resource.Success(orders)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to fetch user orders", e)
            Resource.Error(e.message ?: "Failed to fetch orders")
        }
    }

    override suspend fun getOrderById(orderId: String): Resource<OrderDetail> {
        return try {
            val userId = auth.currentUser?.uid
                ?: return Resource.Error("User not authenticated")

            val response = orderApiService.getOrderDetail(
                userId = userId,
                orderId = orderId
            )
            val orderDetail = response.order.toDomain()
            Resource.Success(orderDetail)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to fetch order: $orderId", e)
            Resource.Error(e.message ?: "Failed to fetch order details")
        }
    }
}
