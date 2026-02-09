package com.roamyhub.android.feature.profile.support.viewmodel;

/**
 * ViewModel for Ticket Detail screen
 *
 * Manages ticket conversation display, message sending, and ticket closure.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u000fJ\u0006\u0010\u001a\u001a\u00020\u0015J\u0006\u0010\u001b\u001a\u00020\u0015R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001c"}, d2 = {"Lcom/roamyhub/android/feature/profile/support/viewmodel/TicketDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "getTicketDetailUseCase", "Lcom/roamyhub/android/core/domain/usecase/support/GetTicketDetailUseCase;", "sendTicketMessageUseCase", "Lcom/roamyhub/android/core/domain/usecase/support/SendTicketMessageUseCase;", "closeTicketUseCase", "Lcom/roamyhub/android/core/domain/usecase/support/CloseTicketUseCase;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/roamyhub/android/core/domain/usecase/support/GetTicketDetailUseCase;Lcom/roamyhub/android/core/domain/usecase/support/SendTicketMessageUseCase;Lcom/roamyhub/android/core/domain/usecase/support/CloseTicketUseCase;Landroidx/lifecycle/SavedStateHandle;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/roamyhub/android/feature/profile/support/state/TicketDetailUiState;", "ticketId", "", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "clearError", "", "closeTicket", "loadTicketDetail", "onReplyMessageChange", "message", "retry", "sendReply", "profile_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class TicketDetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.domain.usecase.support.GetTicketDetailUseCase getTicketDetailUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.domain.usecase.support.SendTicketMessageUseCase sendTicketMessageUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.domain.usecase.support.CloseTicketUseCase closeTicketUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ticketId = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.roamyhub.android.feature.profile.support.state.TicketDetailUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.profile.support.state.TicketDetailUiState> uiState = null;
    
    @javax.inject.Inject()
    public TicketDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.domain.usecase.support.GetTicketDetailUseCase getTicketDetailUseCase, @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.domain.usecase.support.SendTicketMessageUseCase sendTicketMessageUseCase, @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.domain.usecase.support.CloseTicketUseCase closeTicketUseCase, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.profile.support.state.TicketDetailUiState> getUiState() {
        return null;
    }
    
    /**
     * Load ticket detail with messages
     */
    private final void loadTicketDetail() {
    }
    
    /**
     * Update reply message
     */
    public final void onReplyMessageChange(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    /**
     * Send reply message
     */
    public final void sendReply() {
    }
    
    /**
     * Close ticket
     */
    public final void closeTicket() {
    }
    
    /**
     * Retry loading ticket detail
     */
    public final void retry() {
    }
    
    /**
     * Clear error message
     */
    public final void clearError() {
    }
}