package com.roamyhub.android.core.domain.usecase.support

import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.model.support.Ticket
import com.roamyhub.android.core.domain.repository.SupportRepository
import javax.inject.Inject

/**
 * Use case to retrieve a specific support ticket by ID.
 *
 * Returns the ticket with all associated messages.
 */
class GetTicketDetailUseCase @Inject constructor(
    private val supportRepository: SupportRepository
) {
    suspend operator fun invoke(ticketId: String): Resource<Ticket> {
        if (ticketId.isBlank()) {
            return Resource.Error("Ticket ID is required")
        }

        return supportRepository.getTicketById(ticketId)
    }
}
