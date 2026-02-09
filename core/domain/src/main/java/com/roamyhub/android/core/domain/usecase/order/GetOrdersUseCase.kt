package com.roamyhub.android.core.domain.usecase.order

import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.model.order.Order
import com.roamyhub.android.core.domain.repository.OrderRepository
import javax.inject.Inject

/**
 * Use case to retrieve paginated order history for the current user.
 *
 * Orders are returned in reverse chronological order (newest first).
 */
class GetOrdersUseCase @Inject constructor(
    private val orderRepository: OrderRepository
) {
    suspend operator fun invoke(
        page: Int = 0,
        pageSize: Int = 20
    ): Resource<List<Order>> {
        if (page < 0) {
            return Resource.Error("Invalid page number")
        }

        if (pageSize < 1 || pageSize > 100) {
            return Resource.Error("Page size must be between 1 and 100")
        }

        return orderRepository.getUserOrders(page, pageSize)
    }
}
