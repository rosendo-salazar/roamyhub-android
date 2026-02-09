package com.roamyhub.android.feature.auth.viewmodel;

/**
 * ViewModel for login screen
 *
 * Handles user authentication via email/password and Google Sign-In.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001!B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0014J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0016J\u0006\u0010\u001a\u001a\u00020\u0014J\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0002J\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u0016H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\""}, d2 = {"Lcom/roamyhub/android/feature/auth/viewmodel/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "authRepository", "Lcom/roamyhub/android/core/domain/repository/AuthRepository;", "(Lcom/roamyhub/android/core/domain/repository/AuthRepository;)V", "_navigationEvents", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/roamyhub/android/feature/auth/viewmodel/LoginViewModel$NavigationEvent;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/roamyhub/android/feature/auth/state/LoginUiState;", "navigationEvents", "Lkotlinx/coroutines/flow/SharedFlow;", "getNavigationEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "onEmailChange", "", "email", "", "onForgotPasswordClick", "onGoogleSignInClick", "idToken", "onLoginClick", "onPasswordChange", "password", "validateEmail", "", "validateForm", "validatePassword", "NavigationEvent", "auth_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.domain.repository.AuthRepository authRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.roamyhub.android.feature.auth.state.LoginUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.auth.state.LoginUiState> uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.roamyhub.android.feature.auth.viewmodel.LoginViewModel.NavigationEvent> _navigationEvents = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<com.roamyhub.android.feature.auth.viewmodel.LoginViewModel.NavigationEvent> navigationEvents = null;
    
    @javax.inject.Inject()
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.domain.repository.AuthRepository authRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.auth.state.LoginUiState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<com.roamyhub.android.feature.auth.viewmodel.LoginViewModel.NavigationEvent> getNavigationEvents() {
        return null;
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
     * Handle login button click
     */
    public final void onLoginClick() {
    }
    
    /**
     * Handle Google Sign-In
     */
    public final void onGoogleSignInClick(@org.jetbrains.annotations.NotNull()
    java.lang.String idToken) {
    }
    
    /**
     * Handle forgot password link click
     */
    public final void onForgotPasswordClick() {
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
     * Validate password requirements
     */
    private final boolean validatePassword(java.lang.String password) {
        return false;
    }
    
    /**
     * Navigation events
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/roamyhub/android/feature/auth/viewmodel/LoginViewModel$NavigationEvent;", "", "()V", "NavigateToForgotPassword", "NavigateToHome", "Lcom/roamyhub/android/feature/auth/viewmodel/LoginViewModel$NavigationEvent$NavigateToForgotPassword;", "Lcom/roamyhub/android/feature/auth/viewmodel/LoginViewModel$NavigationEvent$NavigateToHome;", "auth_debug"})
    public static abstract class NavigationEvent {
        
        private NavigationEvent() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c7\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/roamyhub/android/feature/auth/viewmodel/LoginViewModel$NavigationEvent$NavigateToForgotPassword;", "Lcom/roamyhub/android/feature/auth/viewmodel/LoginViewModel$NavigationEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "auth_debug"})
        public static final class NavigateToForgotPassword extends com.roamyhub.android.feature.auth.viewmodel.LoginViewModel.NavigationEvent {
            @org.jetbrains.annotations.NotNull()
            public static final com.roamyhub.android.feature.auth.viewmodel.LoginViewModel.NavigationEvent.NavigateToForgotPassword INSTANCE = null;
            
            private NavigateToForgotPassword() {
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
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c7\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/roamyhub/android/feature/auth/viewmodel/LoginViewModel$NavigationEvent$NavigateToHome;", "Lcom/roamyhub/android/feature/auth/viewmodel/LoginViewModel$NavigationEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "auth_debug"})
        public static final class NavigateToHome extends com.roamyhub.android.feature.auth.viewmodel.LoginViewModel.NavigationEvent {
            @org.jetbrains.annotations.NotNull()
            public static final com.roamyhub.android.feature.auth.viewmodel.LoginViewModel.NavigationEvent.NavigateToHome INSTANCE = null;
            
            private NavigateToHome() {
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