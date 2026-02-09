package com.roamyhub.android.feature.profile.orders.viewmodel;

/**
 * ViewModel for Orders screen
 *
 * Manages paginated order history with pull-to-refresh.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\rR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0011"}, d2 = {"Lcom/roamyhub/android/feature/profile/orders/viewmodel/OrdersViewModel;", "Landroidx/lifecycle/ViewModel;", "getOrdersUseCase", "Lcom/roamyhub/android/core/domain/usecase/order/GetOrdersUseCase;", "(Lcom/roamyhub/android/core/domain/usecase/order/GetOrdersUseCase;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/roamyhub/android/feature/profile/orders/state/OrdersUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "clearError", "", "loadMore", "loadOrders", "refresh", "profile_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class OrdersViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.domain.usecase.order.GetOrdersUseCase getOrdersUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.roamyhub.android.feature.profile.orders.state.OrdersUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.profile.orders.state.OrdersUiState> uiState = null;
    
    @javax.inject.Inject()
    public OrdersViewModel(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.domain.usecase.order.GetOrdersUseCase getOrdersUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.profile.orders.state.OrdersUiState> getUiState() {
        return null;
    }
    
    /**
     * Load orders (initial page)
     */
    public final void loadOrders() {
    }
    
    /**
     * Refresh orders (pull-to-refresh)
     */
    public final void refresh() {
    }
    
    /**
     * Load more orders (pagination)
     */
    public final void loadMore() {
    }
    
    /**
     * Clear error message
     */
    public final void clearError() {
    }
}