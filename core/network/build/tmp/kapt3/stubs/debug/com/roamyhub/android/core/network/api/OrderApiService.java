package com.roamyhub.android.core.network.api;

/**
 * Retrofit API service for order endpoints
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0007J,\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/roamyhub/android/core/network/api/OrderApiService;", "", "getOrderDetail", "Lcom/roamyhub/android/core/network/model/OrderDetailResponseDto;", "userId", "", "orderId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserOrders", "Lcom/roamyhub/android/core/network/model/OrdersResponseDto;", "page", "", "pageSize", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "network_debug"})
public abstract interface OrderApiService {
    
    /**
     * Get paginated orders for a user
     */
    @retrofit2.http.GET(value = "orders/{userId}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUserOrders(@retrofit2.http.Path(value = "userId")
    @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "pageSize")
    int pageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.OrdersResponseDto> $completion);
    
    /**
     * Get detailed order information
     */
    @retrofit2.http.GET(value = "orders/{userId}/{orderId}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getOrderDetail(@retrofit2.http.Path(value = "userId")
    @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @retrofit2.http.Path(value = "orderId")
    @org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.OrderDetailResponseDto> $completion);
    
    /**
     * Retrofit API service for order endpoints
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}