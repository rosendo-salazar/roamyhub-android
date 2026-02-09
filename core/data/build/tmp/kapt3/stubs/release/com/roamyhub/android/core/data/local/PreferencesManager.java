package com.roamyhub.android.core.data.local;

/**
 * Manager for application preferences using DataStore.
 *
 * Handles storage and retrieval of user preferences including:
 * - Language preference
 * - Currency preference
 * - Onboarding completion status
 * - Dark mode preference
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0015\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0010\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\u0014J\u000e\u0010\u0019\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0002\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n\u00a8\u0006\u001b"}, d2 = {"Lcom/roamyhub/android/core/data/local/PreferencesManager;", "", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "(Landroidx/datastore/core/DataStore;)V", "currency", "Lkotlinx/coroutines/flow/Flow;", "", "getCurrency", "()Lkotlinx/coroutines/flow/Flow;", "isDarkModeEnabled", "", "isOnboardingCompleted", "language", "getLanguage", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCurrency", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setDarkMode", "enabled", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setLanguage", "setOnboardingCompleted", "Companion", "data_release"})
public final class PreferencesManager {
    @org.jetbrains.annotations.NotNull()
    private final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> LANGUAGE_KEY = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> CURRENCY_KEY = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> ONBOARDING_COMPLETED_KEY = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> DARK_MODE_KEY = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEFAULT_LANGUAGE = "en";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEFAULT_CURRENCY = "USD";
    
    /**
     * Flow of current language preference
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.String> language = null;
    
    /**
     * Flow of current currency preference
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.String> currency = null;
    
    /**
     * Flow of onboarding completion status
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> isOnboardingCompleted = null;
    
    /**
     * Flow of dark mode preference
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> isDarkModeEnabled = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.roamyhub.android.core.data.local.PreferencesManager.Companion Companion = null;
    
    @javax.inject.Inject()
    public PreferencesManager(@org.jetbrains.annotations.NotNull()
    androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore) {
        super();
    }
    
    /**
     * Flow of current language preference
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.String> getLanguage() {
        return null;
    }
    
    /**
     * Flow of current currency preference
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.String> getCurrency() {
        return null;
    }
    
    /**
     * Flow of onboarding completion status
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> isOnboardingCompleted() {
        return null;
    }
    
    /**
     * Flow of dark mode preference
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> isDarkModeEnabled() {
        return null;
    }
    
    /**
     * Set language preference
     *
     * @param language Language code (e.g., "en", "es", "fr")
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setLanguage(@org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * Set currency preference
     *
     * @param currency Currency code (e.g., "USD", "EUR", "GBP")
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setCurrency(@org.jetbrains.annotations.NotNull()
    java.lang.String currency, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * Mark onboarding as completed
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setOnboardingCompleted(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * Set dark mode preference
     *
     * @param enabled True to enable dark mode, false to disable
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setDarkMode(boolean enabled, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * Clear all preferences
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object clear(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/roamyhub/android/core/data/local/PreferencesManager$Companion;", "", "()V", "CURRENCY_KEY", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "DARK_MODE_KEY", "", "DEFAULT_CURRENCY", "DEFAULT_LANGUAGE", "LANGUAGE_KEY", "ONBOARDING_COMPLETED_KEY", "data_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}