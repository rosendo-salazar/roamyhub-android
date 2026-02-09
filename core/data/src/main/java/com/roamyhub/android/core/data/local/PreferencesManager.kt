package com.roamyhub.android.core.data.local

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.longPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Manager for application preferences using DataStore.
 *
 * Handles storage and retrieval of user preferences including:
 * - Language preference
 * - Currency preference
 * - Onboarding completion status
 * - Dark mode preference
 */
@Singleton
class PreferencesManager @Inject constructor(
    private val dataStore: DataStore<Preferences>
) {
    companion object {
        private val LANGUAGE_KEY = stringPreferencesKey("language")
        private val CURRENCY_KEY = stringPreferencesKey("currency")
        private val ONBOARDING_COMPLETED_KEY = booleanPreferencesKey("onboarding_completed")
        private val DARK_MODE_KEY = booleanPreferencesKey("dark_mode")

        const val DEFAULT_LANGUAGE = "en"
        const val DEFAULT_CURRENCY = "USD"
    }

    /**
     * Flow of current language preference
     */
    val language: Flow<String> = dataStore.data.map { preferences ->
        preferences[LANGUAGE_KEY] ?: DEFAULT_LANGUAGE
    }

    /**
     * Flow of current currency preference
     */
    val currency: Flow<String> = dataStore.data.map { preferences ->
        preferences[CURRENCY_KEY] ?: DEFAULT_CURRENCY
    }

    /**
     * Flow of onboarding completion status
     */
    val isOnboardingCompleted: Flow<Boolean> = dataStore.data.map { preferences ->
        preferences[ONBOARDING_COMPLETED_KEY] ?: false
    }

    /**
     * Flow of dark mode preference
     */
    val isDarkModeEnabled: Flow<Boolean> = dataStore.data.map { preferences ->
        preferences[DARK_MODE_KEY] ?: false
    }

    /**
     * Set language preference
     *
     * @param language Language code (e.g., "en", "es", "fr")
     */
    suspend fun setLanguage(language: String) {
        dataStore.edit { preferences ->
            preferences[LANGUAGE_KEY] = language
        }
    }

    /**
     * Set currency preference
     *
     * @param currency Currency code (e.g., "USD", "EUR", "GBP")
     */
    suspend fun setCurrency(currency: String) {
        dataStore.edit { preferences ->
            preferences[CURRENCY_KEY] = currency
        }
    }

    /**
     * Mark onboarding as completed
     */
    suspend fun setOnboardingCompleted() {
        dataStore.edit { preferences ->
            preferences[ONBOARDING_COMPLETED_KEY] = true
        }
    }

    /**
     * Set dark mode preference
     *
     * @param enabled True to enable dark mode, false to disable
     */
    suspend fun setDarkMode(enabled: Boolean) {
        dataStore.edit { preferences ->
            preferences[DARK_MODE_KEY] = enabled
        }
    }

    /**
     * Clear all preferences
     */
    suspend fun clear() {
        dataStore.edit { preferences ->
            preferences.clear()
        }
    }

    /**
     * Get an integer preference value
     * @param key The preference key
     * @param defaultValue The default value if not found
     * @return Flow of the integer value
     */
    fun getInt(key: String, defaultValue: Int): Flow<Int> = dataStore.data.map { preferences ->
        preferences[intPreferencesKey(key)] ?: defaultValue
    }

    /**
     * Set an integer preference value
     * @param key The preference key
     * @param value The value to set
     */
    suspend fun putInt(key: String, value: Int) {
        dataStore.edit { preferences ->
            preferences[intPreferencesKey(key)] = value
        }
    }

    /**
     * Get a long preference value
     * @param key The preference key
     * @param defaultValue The default value if not found
     * @return Flow of the long value
     */
    fun getLong(key: String, defaultValue: Long): Flow<Long> = dataStore.data.map { preferences ->
        preferences[longPreferencesKey(key)] ?: defaultValue
    }

    /**
     * Set a long preference value
     * @param key The preference key
     * @param value The value to set
     */
    suspend fun putLong(key: String, value: Long) {
        dataStore.edit { preferences ->
            preferences[longPreferencesKey(key)] = value
        }
    }
}
