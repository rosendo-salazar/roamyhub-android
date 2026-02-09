package com.roamyhub.android.core.domain.usecase.support

import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.repository.SupportRepository
import javax.inject.Inject

/**
 * Use case to close a support ticket.
 *
 * Marks the ticket as resolved and prevents further messages.
 */
class CloseTicketUseCase @Inject constructor(
    private val supportRepository: SupportRepository
) {
    suspend operator fun invoke(ticketId: String): Resource<Unit> {
        if (ticketId.isBlank()) {
            return Resource.Error("Ticket ID is required")
        }

        return supportRepository.closeTicket(ticketId)
    }
}
