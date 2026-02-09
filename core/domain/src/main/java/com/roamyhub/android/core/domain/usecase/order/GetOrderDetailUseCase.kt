package com.roamyhub.android.core.domain.usecase.order

import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.model.order.OrderDetail
import com.roamyhub.android.core.domain.repository.OrderRepository
import javax.inject.Inject

/**
 * Use case to retrieve detailed information for a specific order.
 *
 * Returns comprehensive order details including line items and payment info.
 */
class GetOrderDetailUseCase @Inject constructor(
    private val orderRepository: OrderRepository
) {
    suspend operator fun invoke(orderId: String): Resource<OrderDetail> {
        if (orderId.isBlank()) {
            return Resource.Error("Order ID is required")
        }

        return orderRepository.getOrderById(orderId)
    }
}
