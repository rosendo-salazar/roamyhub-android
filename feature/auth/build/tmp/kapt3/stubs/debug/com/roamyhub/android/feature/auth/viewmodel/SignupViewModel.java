package com.roamyhub.android.feature.auth.viewmodel;

/**
 * ViewModel for signup screen
 *
 * Handles new user registration with form validation.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001&B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0016J\u000e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0016J\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0016J\u000e\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0016J\u0006\u0010\u001f\u001a\u00020\u0014J\u000e\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"J\u0010\u0010#\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020\u0016H\u0002J\b\u0010$\u001a\u00020\"H\u0002J\u0010\u0010%\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u0016H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\'"}, d2 = {"Lcom/roamyhub/android/feature/auth/viewmodel/SignupViewModel;", "Landroidx/lifecycle/ViewModel;", "authRepository", "Lcom/roamyhub/android/core/domain/repository/AuthRepository;", "(Lcom/roamyhub/android/core/domain/repository/AuthRepository;)V", "_navigationEvents", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/roamyhub/android/feature/auth/viewmodel/SignupViewModel$NavigationEvent;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/roamyhub/android/feature/auth/state/SignupUiState;", "navigationEvents", "Lkotlinx/coroutines/flow/SharedFlow;", "getNavigationEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "onConfirmPasswordChange", "", "confirmPassword", "", "onEmailChange", "email", "onFirstNameChange", "firstName", "onLastNameChange", "lastName", "onPasswordChange", "password", "onSignupClick", "onTermsAcceptedChange", "accepted", "", "validateEmail", "validateForm", "validatePassword", "NavigationEvent", "auth_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class SignupViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.domain.repository.AuthRepository authRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.roamyhub.android.feature.auth.state.SignupUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.auth.state.SignupUiState> uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.roamyhub.android.feature.auth.viewmodel.SignupViewModel.NavigationEvent> _navigationEvents = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<com.roamyhub.android.feature.auth.viewmodel.SignupViewModel.NavigationEvent> navigationEvents = null;
    
    @javax.inject.Inject()
    public SignupViewModel(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.domain.repository.AuthRepository authRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.auth.state.SignupUiState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<com.roamyhub.android.feature.auth.viewmodel.SignupViewModel.NavigationEvent> getNavigationEvents() {
        return null;
    }
    
    /**
     * Update first name and validate
     */
    public final void onFirstNameChange(@org.jetbrains.annotations.NotNull()
    java.lang.String firstName) {
    }
    
    /**
     * Update last name and validate
     */
    public final void onLastNameChange(@org.jetbrains.annotations.NotNull()
    java.lang.String lastName) {
    }
    
    /**
     * Update email and validate
     */
    public final void onEmailChange(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
    
    /**
     * Update password and validate
     */
    public final void onPasswordChange(@org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    /**
     * Update confirm password and validate
     */
    public final void onConfirmPasswordChange(@org.jetbrains.annotations.NotNull()
    java.lang.String confirmPassword) {
    }
    
    /**
     * Toggle terms acceptance
     */
    public final void onTermsAcceptedChange(boolean accepted) {
    }
    
    /**
     * Handle signup button click
     */
    public final void onSignupClick() {
    }
    
    /**
     * Validate the entire form
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
    
    /**
     * Validate password requirements (matching iOS):
     * - At least 6 characters
     */
    private final boolean validatePassword(java.lang.String password) {
        return false;
    }
    
    /**
     * Navigation events
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/roamyhub/android/feature/auth/viewmodel/SignupViewModel$NavigationEvent;", "", "()V", "NavigateToVerification", "Lcom/roamyhub/android/feature/auth/viewmodel/SignupViewModel$NavigationEvent$NavigateToVerification;", "auth_debug"})
    public static abstract class NavigationEvent {
        
        private NavigationEvent() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/roamyhub/android/feature/auth/viewmodel/SignupViewModel$NavigationEvent$NavigateToVerification;", "Lcom/roamyhub/android/feature/auth/viewmodel/SignupViewModel$NavigationEvent;", "email", "", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "auth_debug"})
        public static final class NavigateToVerification extends com.roamyhub.android.feature.auth.viewmodel.SignupViewModel.NavigationEvent {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String email = null;
            
            public NavigateToVerification(@org.jetbrains.annotations.NotNull()
            java.lang.String email) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getEmail() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.roamyhub.android.feature.auth.viewmodel.SignupViewModel.NavigationEvent.NavigateToVerification copy(@org.jetbrains.annotations.NotNull()
            java.lang.String email) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public java.lang.String toString() {
                return null;
            }
        }
    }
}