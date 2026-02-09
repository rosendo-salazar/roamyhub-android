package com.roamyhub.android.core.domain.repository

import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.model.support.Ticket
import com.roamyhub.android.core.domain.model.support.TicketMessage

/**
 * Repository interface for customer support operations.
 *
 * Handles support ticket creation, messaging, and ticket management.
 */
interface SupportRepository {

    /**
     * Create a new support ticket
     *
     * Initiates a new support conversation with the specified subject and message.
     *
     * @param subject Brief description of the issue
     * @param message Detailed description of the problem or question
     * @param category Optional category for ticket routing (e.g., "technical", "billing")
     * @param eSimId Optional eSIM ID if the ticket relates to a specific eSIM
     * @return Resource containing the created Ticket
     */
    suspend fun createTicket(
        subject: String,
        message: String,
        category: String? = null,
        eSimId: String? = null
    ): Resource<Ticket>

    /**
     * Get all support tickets for the current user
     *
     * Returns tickets in all states (open, in progress, resolved, closed).
     *
     * @return Resource containing list of user's Tickets, ordered by last update (newest first)
     */
    suspend fun getUserTickets(): Resource<List<Ticket>>

    /**
     * Get a specific ticket by ID
     *
     * Returns the ticket with all associated messages.
     *
     * @param ticketId Unique identifier of the ticket
     * @return Resource containing the Ticket with messages or error if not found
     */
    suspend fun getTicketById(ticketId: String): Resource<Ticket>

    /**
     * Send a message on an existing ticket
     *
     * Adds a new message to the conversation thread.
     *
     * @param ticketId Unique identifier of the ticket
     * @param message Message content to send
     * @return Resource containing the created TicketMessage
     */
    suspend fun sendMessage(
        ticketId: String,
        message: String
    ): Resource<TicketMessage>

    /**
     * Close a support ticket
     *
     * Marks the ticket as resolved and prevents further messages.
     * Can only close tickets that are not already closed.
     *
     * @param ticketId Unique identifier of the ticket to close
     * @return Resource indicating success or error
     */
    suspend fun closeTicket(ticketId: String): Resource<Unit>
}
