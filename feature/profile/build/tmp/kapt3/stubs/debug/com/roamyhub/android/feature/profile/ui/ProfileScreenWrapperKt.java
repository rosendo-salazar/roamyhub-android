package com.roamyhub.android.feature.profile.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003\u001a6\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u00a8\u0006\n"}, d2 = {"GuestProfileContent", "", "onNavigateToAuth", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "ProfileScreenWrapper", "authState", "Lcom/roamyhub/android/core/domain/model/user/AuthState;", "onSignOut", "profile_debug"})
public final class ProfileScreenWrapperKt {
    
    /**
     * Wrapper for profile screen that handles authentication state
     * Shows guest content if not authenticated, otherwise shows normal profile
     */
    @androidx.compose.runtime.Composable()
    public static final void ProfileScreenWrapper(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.domain.model.user.AuthState authState, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateToAuth, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSignOut, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    /**
     * Guest profile content showing limited functionality with sign-in prompt
     */
    @androidx.compose.runtime.Composable()
    private static final void GuestProfileContent(kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateToAuth, androidx.compose.ui.Modifier modifier) {
    }
}