package com.roamyhub.android.core.domain.model.support

import kotlinx.datetime.Instant

/**
 * Domain model representing a support ticket
 */
data class Ticket(
    val id: String,
    val userId: String,
    val subject: String,
    val category: String,
    val status: TicketStatus,
    val priority: TicketPriority = TicketPriority.NORMAL,
    val createdAt: Instant,
    val updatedAt: Instant,
    val closedAt: Instant? = null,
    val lastMessageAt: Instant? = null,
    val messageCount: Int = 0,
    val hasUnreadMessages: Boolean = false
) {
    /**
     * Returns true if the ticket is open
     */
    val isOpen: Boolean
        get() = status.isOpen()

    /**
     * Returns a time-ago string for the last activity
     */
    fun getLastActivityDescription(): String {
        return "Last updated ${updatedAt.toTimeAgo()}"
    }
}

/**
 * Enum representing ticket priority
 */
enum class TicketPriority {
    LOW,
    NORMAL,
    HIGH,
    URGENT;

    fun displayName(): String = when (this) {
        LOW -> "Low"
        NORMAL -> "Normal"
        HIGH -> "High"
        URGENT -> "Urgent"
    }
}

// Extension function placeholder
private fun Instant.toTimeAgo(): String = "recently"
