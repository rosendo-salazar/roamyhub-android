package com.roamyhub.android.core.domain.model.support

/**
 * Enum representing the status of a support ticket
 */
enum class TicketStatus {
    /**
     * Ticket has been opened
     */
    OPEN,

    /**
     * Support team is working on the ticket
     */
    IN_PROGRESS,

    /**
     * Waiting for customer response
     */
    AWAITING_CUSTOMER,

    /**
     * Ticket has been resolved
     */
    RESOLVED,

    /**
     * Ticket has been closed
     */
    CLOSED;

    /**
     * Returns true if the ticket is open (not resolved or closed)
     */
    fun isOpen(): Boolean = this in listOf(OPEN, IN_PROGRESS, AWAITING_CUSTOMER)

    /**
     * Returns true if the ticket is closed or resolved
     */
    fun isClosed(): Boolean = this in listOf(RESOLVED, CLOSED)

    /**
     * Returns a user-friendly display name
     */
    fun displayName(): String = when (this) {
        OPEN -> "Open"
        IN_PROGRESS -> "In Progress"
        AWAITING_CUSTOMER -> "Awaiting Response"
        RESOLVED -> "Resolved"
        CLOSED -> "Closed"
    }
}
