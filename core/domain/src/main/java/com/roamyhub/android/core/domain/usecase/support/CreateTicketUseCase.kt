package com.roamyhub.android.core.domain.usecase.support

import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.model.support.Ticket
import com.roamyhub.android.core.domain.repository.SupportRepository
import javax.inject.Inject

/**
 * Use case to create a new support ticket.
 *
 * Validates input and initiates a new support conversation.
 */
class CreateTicketUseCase @Inject constructor(
    private val supportRepository: SupportRepository
) {
    suspend operator fun invoke(
        subject: String,
        message: String,
        category: String? = null,
        eSimId: String? = null
    ): Resource<Ticket> {
        // Validate subject
        if (subject.isBlank()) {
            return Resource.Error("Subject is required")
        }

        if (subject.length < 5) {
            return Resource.Error("Subject must be at least 5 characters")
        }

        if (subject.length > 200) {
            return Resource.Error("Subject must not exceed 200 characters")
        }

        // Validate message
        if (message.isBlank()) {
            return Resource.Error("Message is required")
        }

        if (message.length < 10) {
            return Resource.Error("Message must be at least 10 characters")
        }

        if (message.length > 5000) {
            return Resource.Error("Message must not exceed 5000 characters")
        }

        return supportRepository.createTicket(
            subject = subject,
            message = message,
            category = category,
            eSimId = eSimId
        )
    }
}
