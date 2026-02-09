package com.roamyhub.android.feature.purchase.viewmodel;

/**
 * ViewModel for the Order Confirmation screen.
 *
 * Displays order details and associated eSIM after successful payment.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0012J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0012R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0016"}, d2 = {"Lcom/roamyhub/android/feature/purchase/viewmodel/OrderConfirmationViewModel;", "Landroidx/lifecycle/ViewModel;", "orderRepository", "Lcom/roamyhub/android/core/domain/repository/OrderRepository;", "eSimRepository", "Lcom/roamyhub/android/core/domain/repository/ESimRepository;", "(Lcom/roamyhub/android/core/domain/repository/OrderRepository;Lcom/roamyhub/android/core/domain/repository/ESimRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/roamyhub/android/feature/purchase/state/OrderConfirmationUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "clearError", "", "loadESim", "esimId", "", "loadOrder", "orderId", "retryLoadOrder", "purchase_release"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class OrderConfirmationViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.domain.repository.OrderRepository orderRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.domain.repository.ESimRepository eSimRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.roamyhub.android.feature.purchase.state.OrderConfirmationUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.purchase.state.OrderConfirmationUiState> uiState = null;
    
    @javax.inject.Inject()
    public OrderConfirmationViewModel(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.domain.repository.OrderRepository orderRepository, @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.domain.repository.ESimRepository eSimRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.purchase.state.OrderConfirmationUiState> getUiState() {
        return null;
    }
    
    /**
     * Load order details
     */
    public final void loadOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId) {
    }
    
    /**
     * Load eSIM details
     */
    private final void loadESim(java.lang.String esimId) {
    }
    
    /**
     * Retry loading order
     */
    public final void retryLoadOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId) {
    }
    
    /**
     * Clear error
     */
    public final void clearError() {
    }
}