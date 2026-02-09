package com.roamyhub.android.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.roamyhub.android.core.domain.model.user.AuthState
import com.roamyhub.android.core.domain.repository.AuthRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

/**
 * ViewModel for the main app screen
 * Manages auth state and navigation between main tabs
 */
@HiltViewModel
class MainViewModel @Inject constructor(
    private val authRepository: AuthRepository
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
     * Sign out the current user
     */
    fun signOut() {
        viewModelScope.launch {
            try {
                authRepository.signOut()
                Timber.d("User signed out successfully")
            } catch (e: Exception) {
                Timber.e(e, "Error signing out")
            }
        }
    }
}
