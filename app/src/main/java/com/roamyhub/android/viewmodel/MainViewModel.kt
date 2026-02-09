package com.roamyhub.android.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.roamyhub.android.analytics.AnalyticsEvents
import com.roamyhub.android.analytics.AnalyticsManager
import com.roamyhub.android.core.domain.model.user.AuthState
import com.roamyhub.android.core.domain.repository.AuthRepository
import com.roamyhub.android.version.VersionManager
import com.roamyhub.android.version.VersionStatus
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

/**
 * ViewModel for the main app screen
 * Manages auth state, version checking, and analytics
 */
@HiltViewModel
class MainViewModel @Inject constructor(
    private val authRepository: AuthRepository,
    private val versionManager: VersionManager,
    private val analyticsManager: AnalyticsManager
) : ViewModel() {

    /**
     * Current authentication state
     */
    val authState: StateFlow<AuthState> = authRepository.getCurrentUser()
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = AuthState.Loading
        )

    /**
     * Current version status
     */
    private val _versionStatus = MutableStateFlow<VersionStatus>(VersionStatus.UpToDate)
    val versionStatus: StateFlow<VersionStatus> = _versionStatus.asStateFlow()

    init {
        // Log app opened event
        analyticsManager.logEvent(AnalyticsEvents.APP_OPENED)

        // Check for app updates
        checkForUpdates()
    }

    /**
     * Check for app updates
     */
    private fun checkForUpdates() {
        viewModelScope.launch {
            try {
                val status = versionManager.checkForUpdate()
                _versionStatus.value = status
                Timber.d("Version check completed: $status")
            } catch (e: Exception) {
                Timber.e(e, "Failed to check for updates")
                // Don't block user on version check failure
            }
        }
    }

    /**
     * Dismiss version update dialog
     */
    fun dismissVersionDialog() {
        _versionStatus.value = VersionStatus.UpToDate
    }

    /**
     * Sign out the current user
     */
    fun signOut() {
        viewModelScope.launch {
            try {
                authRepository.signOut()
                analyticsManager.logEvent(AnalyticsEvents.LOGOUT)
                analyticsManager.setUserId(null)
                Timber.d("User signed out successfully")
            } catch (e: Exception) {
                Timber.e(e, "Error signing out")
            }
        }
    }
}
