package com.roamyhub.android.core.domain.usecase.support

import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.model.support.TicketMessage
import com.roamyhub.android.core.domain.repository.SupportRepository
import javax.inject.Inject

/**
 * Use case to send a message on an existing support ticket.
 *
 * Validates message content and adds it to the conversation thread.
 */
class SendTicketMessageUseCase @Inject constructor(
    private val supportRepository: SupportRepository
) {
    suspend operator fun invoke(
        ticketId: String,
        message: String
    ): Resource<TicketMessage> {
        if (ticketId.isBlank()) {
            return Resource.Error("Ticket ID is required")
        }

        if (message.isBlank()) {
            return Resource.Error("Message is required")
        }

        if (message.length < 2) {
            return Resource.Error("Message must be at least 2 characters")
        }

        if (message.length > 5000) {
            return Resource.Error("Message must not exceed 5000 characters")
        }

        return supportRepository.sendMessage(
            ticketId = ticketId,
            message = message
        )
    }
}
