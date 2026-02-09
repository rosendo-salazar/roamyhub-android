package com.roamyhub.android.feature.profile.support.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.usecase.support.CreateTicketUseCase
import com.roamyhub.android.feature.profile.support.state.CreateTicketUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel for Create Ticket screen
 *
 * Manages ticket creation form state and submission.
 */
@HiltViewModel
class CreateTicketViewModel @Inject constructor(
    private val createTicketUseCase: CreateTicketUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(CreateTicketUiState())
    val uiState: StateFlow<CreateTicketUiState> = _uiState.asStateFlow()

    private val _ticketCreatedEvent = MutableStateFlow<String?>(null)
    val ticketCreatedEvent: StateFlow<String?> = _ticketCreatedEvent.asStateFlow()

    /**
     * Update subject
     */
    fun onSubjectChange(subject: String) {
        _uiState.update { it.copy(subject = subject) }
    }

    /**
     * Update message
     */
    fun onMessageChange(message: String) {
        _uiState.update { it.copy(message = message) }
    }

    /**
     * Update category
     */
    fun onCategoryChange(category: String) {
        _uiState.update { it.copy(category = category) }
    }

    /**
     * Submit ticket
     */
    fun submitTicket() {
        val currentState = _uiState.value

        if (!currentState.isValid()) {
            _uiState.update {
                it.copy(error = "Please fill in all required fields correctly")
            }
            return
        }

        viewModelScope.launch {
            _uiState.update {
                it.copy(
                    isSubmitting = true,
                    error = null
                )
            }

            when (val result = createTicketUseCase(
                subject = currentState.subject,
                message = currentState.message,
                category = currentState.category
            )) {
                is Resource.Success -> {
                    _uiState.update {
                        it.copy(isSubmitting = false)
                    }
                    _ticketCreatedEvent.value = result.data.id
                }
                is Resource.Error -> {
                    _uiState.update {
                        it.copy(
                            error = result.message,
                            isSubmitting = false
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
     * Clear ticket created event
     */
    fun clearTicketCreatedEvent() {
        _ticketCreatedEvent.value = null
    }
}
