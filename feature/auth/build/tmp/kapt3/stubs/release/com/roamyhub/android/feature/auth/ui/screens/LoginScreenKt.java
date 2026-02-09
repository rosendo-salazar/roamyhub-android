package com.roamyhub.android.feature.auth.ui.screens;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aD\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\u001a&\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0082@\u00a2\u0006\u0002\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"LoginScreen", "", "viewModel", "Lcom/roamyhub/android/feature/auth/viewmodel/LoginViewModel;", "onNavigateToSignup", "Lkotlin/Function0;", "onNavigateToForgotPassword", "onNavigateToHome", "modifier", "Landroidx/compose/ui/Modifier;", "handleGoogleSignIn", "context", "Landroid/content/Context;", "snackbarHostState", "Landroidx/compose/material3/SnackbarHostState;", "(Landroid/content/Context;Lcom/roamyhub/android/feature/auth/viewmodel/LoginViewModel;Landroidx/compose/material3/SnackbarHostState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "auth_release"})
public final class LoginScreenKt {
    
    /**
     * Login screen
     *
     * Allows users to sign in with email/password or Google.
     *
     * @param viewModel Login view model
     * @param onNavigateToSignup Callback to navigate to signup
     * @param onNavigateToForgotPassword Callback to navigate to forgot password
     * @param onNavigateToHome Callback to navigate to home after successful login
     */
    @androidx.compose.runtime.Composable()
    public static final void LoginScreen(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.feature.auth.viewmodel.LoginViewModel viewModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateToSignup, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateToForgotPassword, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateToHome, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    /**
     * Handle Google Sign-In using Credential Manager API
     */
    private static final java.lang.Object handleGoogleSignIn(android.content.Context context, com.roamyhub.android.feature.auth.viewmodel.LoginViewModel viewModel, androidx.compose.material3.SnackbarHostState snackbarHostState, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}