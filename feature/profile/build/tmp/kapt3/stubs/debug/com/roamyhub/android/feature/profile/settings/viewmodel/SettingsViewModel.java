package com.roamyhub.android.feature.profile.settings.viewmodel;

/**
 * ViewModel for Settings screen
 *
 * Manages app settings, preferences, and account actions.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0015J\u0006\u0010\u001b\u001a\u00020\u0015J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\u0006\u0010\u001d\u001a\u00020\u0015J\u0006\u0010\u001e\u001a\u00020\u0015J\u000e\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u000bJ\u000e\u0010!\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u000bJ\u000e\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0019J\u000e\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0019R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/roamyhub/android/feature/profile/settings/viewmodel/SettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "getProfileUseCase", "Lcom/roamyhub/android/core/domain/usecase/profile/GetProfileUseCase;", "updateProfileUseCase", "Lcom/roamyhub/android/core/domain/usecase/profile/UpdateProfileUseCase;", "deleteAccountUseCase", "Lcom/roamyhub/android/core/domain/usecase/profile/DeleteAccountUseCase;", "(Lcom/roamyhub/android/core/domain/usecase/profile/GetProfileUseCase;Lcom/roamyhub/android/core/domain/usecase/profile/UpdateProfileUseCase;Lcom/roamyhub/android/core/domain/usecase/profile/DeleteAccountUseCase;)V", "_accountDeletedEvent", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_uiState", "Lcom/roamyhub/android/feature/profile/settings/state/SettingsUiState;", "accountDeletedEvent", "Lkotlinx/coroutines/flow/StateFlow;", "getAccountDeletedEvent", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "getUiState", "clearAccountDeletedEvent", "", "clearError", "deleteAccount", "password", "", "hideCurrencyBottomSheet", "hideLanguageBottomSheet", "loadProfile", "showCurrencyBottomSheet", "showLanguageBottomSheet", "toggleDarkMode", "enabled", "toggleNotifications", "updateCurrency", "currencyCode", "updateLanguage", "languageCode", "profile_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class SettingsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.domain.usecase.profile.GetProfileUseCase getProfileUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.domain.usecase.profile.UpdateProfileUseCase updateProfileUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.domain.usecase.profile.DeleteAccountUseCase deleteAccountUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.roamyhub.android.feature.profile.settings.state.SettingsUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.profile.settings.state.SettingsUiState> uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _accountDeletedEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> accountDeletedEvent = null;
    
    @javax.inject.Inject()
    public SettingsViewModel(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.domain.usecase.profile.GetProfileUseCase getProfileUseCase, @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.domain.usecase.profile.UpdateProfileUseCase updateProfileUseCase, @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.domain.usecase.profile.DeleteAccountUseCase deleteAccountUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.profile.settings.state.SettingsUiState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getAccountDeletedEvent() {
        return null;
    }
    
    /**
     * Load user profile
     */
    private final void loadProfile() {
    }
    
    /**
     * Update language preference
     */
    public final void updateLanguage(@org.jetbrains.annotations.NotNull()
    java.lang.String languageCode) {
    }
    
    /**
     * Update currency preference
     */
    public final void updateCurrency(@org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode) {
    }
    
    /**
     * Toggle dark mode
     */
    public final void toggleDarkMode(boolean enabled) {
    }
    
    /**
     * Toggle notifications
     */
    public final void toggleNotifications(boolean enabled) {
    }
    
    /**
     * Show language bottom sheet
     */
    public final void showLanguageBottomSheet() {
    }
    
    /**
     * Hide language bottom sheet
     */
    public final void hideLanguageBottomSheet() {
    }
    
    /**
     * Show currency bottom sheet
     */
    public final void showCurrencyBottomSheet() {
    }
    
    /**
     * Hide currency bottom sheet
     */
    public final void hideCurrencyBottomSheet() {
    }
    
    /**
     * Delete account
     */
    public final void deleteAccount(@org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    /**
     * Clear error message
     */
    public final void clearError() {
    }
    
    /**
     * Clear account deleted event
     */
    public final void clearAccountDeletedEvent() {
    }
}