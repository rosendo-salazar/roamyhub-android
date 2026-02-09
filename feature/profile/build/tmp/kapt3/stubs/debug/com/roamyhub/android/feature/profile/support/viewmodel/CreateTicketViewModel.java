package com.roamyhub.android.feature.profile.support.viewmodel;

/**
 * ViewModel for Create Ticket screen
 *
 * Manages ticket creation form state and submission.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0007J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0007J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0007J\u0006\u0010\u0019\u001a\u00020\u0011R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u001a"}, d2 = {"Lcom/roamyhub/android/feature/profile/support/viewmodel/CreateTicketViewModel;", "Landroidx/lifecycle/ViewModel;", "createTicketUseCase", "Lcom/roamyhub/android/core/domain/usecase/support/CreateTicketUseCase;", "(Lcom/roamyhub/android/core/domain/usecase/support/CreateTicketUseCase;)V", "_ticketCreatedEvent", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_uiState", "Lcom/roamyhub/android/feature/profile/support/state/CreateTicketUiState;", "ticketCreatedEvent", "Lkotlinx/coroutines/flow/StateFlow;", "getTicketCreatedEvent", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "getUiState", "clearError", "", "clearTicketCreatedEvent", "onCategoryChange", "category", "onMessageChange", "message", "onSubjectChange", "subject", "submitTicket", "profile_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class CreateTicketViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.domain.usecase.support.CreateTicketUseCase createTicketUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.roamyhub.android.feature.profile.support.state.CreateTicketUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.profile.support.state.CreateTicketUiState> uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _ticketCreatedEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> ticketCreatedEvent = null;
    
    @javax.inject.Inject()
    public CreateTicketViewModel(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.domain.usecase.support.CreateTicketUseCase createTicketUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.profile.support.state.CreateTicketUiState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getTicketCreatedEvent() {
        return null;
    }
    
    /**
     * Update subject
     */
    public final void onSubjectChange(@org.jetbrains.annotations.NotNull()
    java.lang.String subject) {
    }
    
    /**
     * Update message
     */
    public final void onMessageChange(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    /**
     * Update category
     */
    public final void onCategoryChange(@org.jetbrains.annotations.NotNull()
    java.lang.String category) {
    }
    
    /**
     * Submit ticket
     */
    public final void submitTicket() {
    }
    
    /**
     * Clear error message
     */
    public final void clearError() {
    }
    
    /**
     * Clear ticket created event
     */
    public final void clearTicketCreatedEvent() {
    }
}