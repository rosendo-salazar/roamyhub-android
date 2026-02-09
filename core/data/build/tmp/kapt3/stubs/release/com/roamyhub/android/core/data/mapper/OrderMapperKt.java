package com.roamyhub.android.core.data.mapper;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\b\u001a\n\u0010\u0006\u001a\u00020\t*\u00020\n\u001a\n\u0010\u0006\u001a\u00020\u000b*\u00020\f\u00a8\u0006\r"}, d2 = {"parseOrderStatus", "Lcom/roamyhub/android/core/domain/model/order/OrderStatus;", "status", "", "parsePaymentStatus", "Lcom/roamyhub/android/core/domain/model/order/PaymentStatus;", "toDomain", "Lcom/roamyhub/android/core/domain/model/order/OrderDetail;", "Lcom/roamyhub/android/core/network/model/OrderDetailDto;", "Lcom/roamyhub/android/core/domain/model/order/Order;", "Lcom/roamyhub/android/core/network/model/OrderDto;", "Lcom/roamyhub/android/core/domain/model/order/OrderStatusUpdate;", "Lcom/roamyhub/android/core/network/model/OrderStatusUpdateDto;", "data_release"})
public final class OrderMapperKt {
    
    /**
     * Extension function to convert OrderDto to domain Order model
     */
    @org.jetbrains.annotations.NotNull()
    public static final com.roamyhub.android.core.domain.model.order.Order toDomain(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.network.model.OrderDto $this$toDomain) {
        return null;
    }
    
    /**
     * Extension function to convert OrderDetailDto to domain OrderDetail model
     */
    @org.jetbrains.annotations.NotNull()
    public static final com.roamyhub.android.core.domain.model.order.OrderDetail toDomain(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.network.model.OrderDetailDto $this$toDomain) {
        return null;
    }
    
    /**
     * Extension function to convert OrderStatusUpdateDto to domain OrderStatusUpdate model
     */
    @org.jetbrains.annotations.NotNull()
    public static final com.roamyhub.android.core.domain.model.order.OrderStatusUpdate toDomain(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.network.model.OrderStatusUpdateDto $this$toDomain) {
        return null;
    }
    
    /**
     * Parse order status string to enum
     */
    private static final com.roamyhub.android.core.domain.model.order.OrderStatus parseOrderStatus(java.lang.String status) {
        return null;
    }
    
    /**
     * Parse payment status string to enum
     */
    private static final com.roamyhub.android.core.domain.model.order.PaymentStatus parsePaymentStatus(java.lang.String status) {
        return null;
    }
}