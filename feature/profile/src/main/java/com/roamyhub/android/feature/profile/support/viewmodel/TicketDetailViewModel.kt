package com.roamyhub.android.feature.profile.support.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.usecase.support.CloseTicketUseCase
import com.roamyhub.android.core.domain.usecase.support.GetTicketDetailUseCase
import com.roamyhub.android.core.domain.usecase.support.SendTicketMessageUseCase
import com.roamyhub.android.feature.profile.support.state.TicketDetailUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel for Ticket Detail screen
 *
 * Manages ticket conversation display, message sending, and ticket closure.
 */
@HiltViewModel
class TicketDetailViewModel @Inject constructor(
    private val getTicketDetailUseCase: GetTicketDetailUseCase,
    private val sendTicketMessageUseCase: SendTicketMessageUseCase,
    private val closeTicketUseCase: CloseTicketUseCase,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val ticketId: String = checkNotNull(savedStateHandle["ticketId"])

    private val _uiState = MutableStateFlow(TicketDetailUiState())
    val uiState: StateFlow<TicketDetailUiState> = _uiState.asStateFlow()

    init {
        loadTicketDetail()
    }

    /**
     * Load ticket detail with messages
     */
    private fun loadTicketDetail() {
        viewModelScope.launch {
            _uiState.update {
                it.copy(
                    isLoading = true,
                    error = null
                )
            }

            when (val result = getTicketDetailUseCase(ticketId)) {
                is Resource.Success -> {
                    // Note: In a real implementation, messages would be part of the ticket
                    // or fetched separately. For now, we'll just store the ticket.
                    _uiState.update {
                        it.copy(
                            ticket = result.data,
                            isLoading = false,
                            error = null
                        )
                    }
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
     * Update reply message
     */
    fun onReplyMessageChange(message: String) {
        _uiState.update { it.copy(replyMessage = message) }
    }

    /**
     * Send reply message
     */
    fun sendReply() {
        val currentState = _uiState.value
        if (!currentState.canSendReply()) return

        viewModelScope.launch {
            _uiState.update {
                it.copy(
                    isSendingMessage = true,
                    error = null
                )
            }

            when (val result = sendTicketMessageUseCase(
                ticketId = ticketId,
                message = currentState.replyMessage
            )) {
                is Resource.Success -> {
                    // Clear reply message and add the new message to the list
                    _uiState.update {
                        it.copy(
                            messages = it.messages + result.data,
                            replyMessage = "",
                            isSendingMessage = false,
                            error = null
                        )
                    }
                    // Reload ticket to get updated status
                    loadTicketDetail()
                }
                is Resource.Error -> {
                    _uiState.update {
                        it.copy(
                            error = result.message,
                            isSendingMessage = false
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
     * Close ticket
     */
    fun closeTicket() {
        val currentState = _uiState.value
        if (!currentState.canCloseTicket()) return

        viewModelScope.launch {
            _uiState.update {
                it.copy(
                    isClosingTicket = true,
                    error = null
                )
            }

            when (val result = closeTicketUseCase(ticketId)) {
                is Resource.Success -> {
                    _uiState.update {
                        it.copy(isClosingTicket = false)
                    }
                    // Reload ticket to get updated status
                    loadTicketDetail()
                }
                is Resource.Error -> {
                    _uiState.update {
                        it.copy(
                            error = result.message,
                            isClosingTicket = false
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
     * Retry loading ticket detail
     */
    fun retry() {
        loadTicketDetail()
    }

    /**
     * Clear error message
     */
    fun clearError() {
        _uiState.update { it.copy(error = null) }
    }
}
