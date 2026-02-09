package com.roamyhub.android.feature.profile.settings.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.usecase.profile.DeleteAccountUseCase
import com.roamyhub.android.core.domain.usecase.profile.GetProfileUseCase
import com.roamyhub.android.core.domain.usecase.profile.UpdateProfileUseCase
import com.roamyhub.android.feature.profile.settings.state.SettingsUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel for Settings screen
 *
 * Manages app settings, preferences, and account actions.
 */
@HiltViewModel
class SettingsViewModel @Inject constructor(
    private val getProfileUseCase: GetProfileUseCase,
    private val updateProfileUseCase: UpdateProfileUseCase,
    private val deleteAccountUseCase: DeleteAccountUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(SettingsUiState())
    val uiState: StateFlow<SettingsUiState> = _uiState.asStateFlow()

    private val _accountDeletedEvent = MutableStateFlow(false)
    val accountDeletedEvent: StateFlow<Boolean> = _accountDeletedEvent.asStateFlow()

    init {
        loadProfile()
    }

    /**
     * Load user profile
     */
    private fun loadProfile() {
        viewModelScope.launch {
            getProfileUseCase().collect { resource ->
                when (resource) {
                    is Resource.Loading -> {
                        _uiState.update {
                            it.copy(
                                isLoading = true,
                                error = null
                            )
                        }
                    }
                    is Resource.Success -> {
                        val user = resource.data
                        _uiState.update {
                            it.copy(
                                user = user,
                                selectedLanguage = user.preferredLanguage,
                                selectedCurrency = user.preferredCurrency,
                                isLoading = false,
                                error = null
                            )
                        }
                    }
                    is Resource.Error -> {
                        _uiState.update {
                            it.copy(
                                error = resource.message,
                                isLoading = false
                            )
                        }
                    }
                }
            }
        }
    }

    /**
     * Update language preference
     */
    fun updateLanguage(languageCode: String) {
        viewModelScope.launch {
            _uiState.update { it.copy(selectedLanguage = languageCode) }

            when (updateProfileUseCase(preferredLanguage = languageCode)) {
                is Resource.Success -> {
                    // Language updated successfully
                }
                is Resource.Error -> {
                    // Revert on error
                    _uiState.update {
                        it.copy(selectedLanguage = it.user?.preferredLanguage ?: "en")
                    }
                }
                is Resource.Loading -> {
                    // No-op
                }
            }
        }
    }

    /**
     * Update currency preference
     */
    fun updateCurrency(currencyCode: String) {
        viewModelScope.launch {
            _uiState.update { it.copy(selectedCurrency = currencyCode) }

            when (updateProfileUseCase(preferredCurrency = currencyCode)) {
                is Resource.Success -> {
                    // Currency updated successfully
                }
                is Resource.Error -> {
                    // Revert on error
                    _uiState.update {
                        it.copy(selectedCurrency = it.user?.preferredCurrency ?: "USD")
                    }
                }
                is Resource.Loading -> {
                    // No-op
                }
            }
        }
    }

    /**
     * Toggle dark mode
     */
    fun toggleDarkMode(enabled: Boolean) {
        _uiState.update { it.copy(isDarkMode = enabled) }
        // TODO: Persist dark mode preference
    }

    /**
     * Toggle notifications
     */
    fun toggleNotifications(enabled: Boolean) {
        _uiState.update { it.copy(notificationsEnabled = enabled) }
        // TODO: Update notification preferences
    }

    /**
     * Show language bottom sheet
     */
    fun showLanguageBottomSheet() {
        _uiState.update { it.copy(showLanguageBottomSheet = true) }
    }

    /**
     * Hide language bottom sheet
     */
    fun hideLanguageBottomSheet() {
        _uiState.update { it.copy(showLanguageBottomSheet = false) }
    }

    /**
     * Show currency bottom sheet
     */
    fun showCurrencyBottomSheet() {
        _uiState.update { it.copy(showCurrencyBottomSheet = true) }
    }

    /**
     * Hide currency bottom sheet
     */
    fun hideCurrencyBottomSheet() {
        _uiState.update { it.copy(showCurrencyBottomSheet = false) }
    }

    /**
     * Delete account
     */
    fun deleteAccount(password: String) {
        viewModelScope.launch {
            _uiState.update {
                it.copy(
                    isLoading = true,
                    error = null
                )
            }

            when (val result = deleteAccountUseCase(password)) {
                is Resource.Success -> {
                    _uiState.update { it.copy(isLoading = false) }
                    _accountDeletedEvent.value = true
                }
                is Resource.Error -> {
                    _uiState.update {
                        it.copy(
                            error = result.message,
                            isLoading = false
                        )
                    }
                }
                is Resource.Loading -> {
                    // No-op
                }
            }
        }
    }

    /**
     * Clear error message
     */
    fun clearError() {
        _uiState.update { it.copy(error = null) }
    }

    /**
     * Clear account deleted event
     */
    fun clearAccountDeletedEvent() {
        _accountDeletedEvent.value = false
    }
}
