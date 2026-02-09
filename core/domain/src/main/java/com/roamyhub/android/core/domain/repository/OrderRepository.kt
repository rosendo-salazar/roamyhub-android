package com.roamyhub.android.core.domain.repository

import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.model.order.Order
import com.roamyhub.android.core.domain.model.order.OrderDetail

/**
 * Repository interface for order history operations.
 *
 * Provides access to completed orders and purchase history.
 * Orders are created after successful payment completion.
 */
interface OrderRepository {

    /**
     * Get paginated order history for the current user
     *
     * Returns completed orders ordered by creation date (newest first).
     * Supports pagination for efficient loading of large order histories.
     *
     * @param page Page number (0-based index)
     * @param pageSize Number of orders per page (default: 20)
     * @return Resource containing list of Orders for the requested page
     */
    suspend fun getUserOrders(
        page: Int = 0,
        pageSize: Int = 20
    ): Resource<List<Order>>

    /**
     * Get detailed information about a specific order
     *
     * Returns comprehensive order details including line items,
     * payment information, and associated eSIM data.
     *
     * @param orderId Unique identifier of the order
     * @return Resource containing OrderDetail or error if not found
     */
    suspend fun getOrderById(orderId: String): Resource<OrderDetail>
}
