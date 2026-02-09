package com.roamyhub.android.feature.profile.support.state

import com.roamyhub.android.core.domain.model.support.Ticket
import com.roamyhub.android.core.domain.model.support.TicketMessage

/**
 * UI state for Ticket Detail screen
 */
data class TicketDetailUiState(
    val ticket: Ticket? = null,
    val messages: List<TicketMessage> = emptyList(),
    val replyMessage: String = "",
    val isLoading: Boolean = false,
    val isSendingMessage: Boolean = false,
    val isClosingTicket: Boolean = false,
    val error: String? = null
) {
    /**
     * Returns true if a reply can be sent
     */
    fun canSendReply(): Boolean {
        return ticket?.isOpen == true &&
               replyMessage.isNotBlank() &&
               !isSendingMessage
    }

    /**
     * Returns true if the ticket can be closed
     */
    fun canCloseTicket(): Boolean {
        return ticket?.isOpen == true && !isClosingTicket
    }
}
