package com.roamyhub.android.feature.profile.settings.state

import com.roamyhub.android.core.domain.model.user.User

/**
 * UI state for Settings screen
 */
data class SettingsUiState(
    val user: User? = null,
    val selectedLanguage: String = "en",
    val selectedCurrency: String = "USD",
    val isDarkMode: Boolean = false,
    val notificationsEnabled: Boolean = true,
    val isLoading: Boolean = false,
    val error: String? = null,
    val showLanguageBottomSheet: Boolean = false,
    val showCurrencyBottomSheet: Boolean = false
)

/**
 * Available languages
 */
data class Language(
    val code: String,
    val name: String,
    val nativeName: String
)

val availableLanguages = listOf(
    Language("en", "English", "English"),
    Language("es", "Spanish", "Español"),
    Language("fr", "French", "Français")
)

/**
 * Available currencies
 */
data class Currency(
    val code: String,
    val name: String,
    val symbol: String
)

val availableCurrencies = listOf(
    Currency("USD", "US Dollar", "$"),
    Currency("EUR", "Euro", "€"),
    Currency("GBP", "British Pound", "£"),
    Currency("CAD", "Canadian Dollar", "CA$"),
    Currency("AUD", "Australian Dollar", "A$"),
    Currency("JPY", "Japanese Yen", "¥"),
    Currency("MXN", "Mexican Peso", "MX$")
)
