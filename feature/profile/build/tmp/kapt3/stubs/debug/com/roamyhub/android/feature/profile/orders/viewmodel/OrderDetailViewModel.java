package com.roamyhub.android.feature.profile.orders.viewmodel;

/**
 * ViewModel for Order Detail screen
 *
 * Displays comprehensive order information including line items and payment details.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0006\u0010\u0013\u001a\u00020\u0011R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0014"}, d2 = {"Lcom/roamyhub/android/feature/profile/orders/viewmodel/OrderDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "getOrderDetailUseCase", "Lcom/roamyhub/android/core/domain/usecase/order/GetOrderDetailUseCase;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/roamyhub/android/core/domain/usecase/order/GetOrderDetailUseCase;Landroidx/lifecycle/SavedStateHandle;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/roamyhub/android/feature/profile/orders/state/OrderDetailUiState;", "orderId", "", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "clearError", "", "loadOrderDetail", "retry", "profile_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class OrderDetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.domain.usecase.order.GetOrderDetailUseCase getOrderDetailUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String orderId = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.roamyhub.android.feature.profile.orders.state.OrderDetailUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.profile.orders.state.OrderDetailUiState> uiState = null;
    
    @javax.inject.Inject()
    public OrderDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.domain.usecase.order.GetOrderDetailUseCase getOrderDetailUseCase, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.profile.orders.state.OrderDetailUiState> getUiState() {
        return null;
    }
    
    /**
     * Load order detail
     */
    private final void loadOrderDetail() {
    }
    
    /**
     * Retry loading order detail
     */
    public final void retry() {
    }
    
    /**
     * Clear error message
     */
    public final void clearError() {
    }
}