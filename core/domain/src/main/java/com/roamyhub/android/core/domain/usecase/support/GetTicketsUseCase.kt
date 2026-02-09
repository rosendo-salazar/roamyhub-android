package com.roamyhub.android.core.domain.usecase.support

import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.model.support.Ticket
import com.roamyhub.android.core.domain.repository.SupportRepository
import javax.inject.Inject

/**
 * Use case to retrieve all support tickets for the current user.
 *
 * Returns tickets in all states, ordered by last update (newest first).
 */
class GetTicketsUseCase @Inject constructor(
    private val supportRepository: SupportRepository
) {
    suspend operator fun invoke(): Resource<List<Ticket>> {
        return supportRepository.getUserTickets()
    }
}
