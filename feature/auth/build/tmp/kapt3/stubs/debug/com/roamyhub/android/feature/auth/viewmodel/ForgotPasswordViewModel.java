package com.roamyhub.android.feature.auth.viewmodel;

/**
 * ViewModel for forgot password screen
 *
 * Handles password reset email functionality.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\rJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0014"}, d2 = {"Lcom/roamyhub/android/feature/auth/viewmodel/ForgotPasswordViewModel;", "Landroidx/lifecycle/ViewModel;", "authRepository", "Lcom/roamyhub/android/core/domain/repository/AuthRepository;", "(Lcom/roamyhub/android/core/domain/repository/AuthRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/roamyhub/android/feature/auth/state/ForgotPasswordUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "onEmailChange", "", "email", "", "onSendResetLink", "validateEmail", "", "validateForm", "auth_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class ForgotPasswordViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.domain.repository.AuthRepository authRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.roamyhub.android.feature.auth.state.ForgotPasswordUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.auth.state.ForgotPasswordUiState> uiState = null;
    
    @javax.inject.Inject()
    public ForgotPasswordViewModel(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.domain.repository.AuthRepository authRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.auth.state.ForgotPasswordUiState> getUiState() {
        return null;
    }
    
    /**
     * Update email and validate
     */
    public final void onEmailChange(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
    
    /**
     * Send password reset link
     */
    public final void onSendResetLink() {
    }
    
    /**
     * Validate the form
     */
    private final boolean validateForm() {
        return false;
    }
    
    /**
     * Validate email format
     */
    private final boolean validateEmail(java.lang.String email) {
        return false;
    }
}