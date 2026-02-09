package com.roamyhub.android.core.data.mapper

import com.roamyhub.android.core.domain.model.support.SenderType
import com.roamyhub.android.core.domain.model.support.Ticket
import com.roamyhub.android.core.domain.model.support.TicketMessage
import com.roamyhub.android.core.domain.model.support.TicketPriority
import com.roamyhub.android.core.domain.model.support.TicketStatus
import com.roamyhub.android.core.network.model.TicketDto
import com.roamyhub.android.core.network.model.TicketMessageDto
import kotlinx.datetime.Instant

/**
 * Extension function to convert TicketDto to domain Ticket model
 */
fun TicketDto.toDomain(): Ticket {
    return Ticket(
        id = id,
        userId = userId,
        subject = subject,
        category = category,
        status = parseTicketStatus(status),
        priority = parseTicketPriority(priority),
        createdAt = Instant.parse(createdAt),
        updatedAt = Instant.parse(updatedAt),
        closedAt = closedAt?.let { Instant.parse(it) },
        lastMessageAt = lastMessageAt?.let { Instant.parse(it) },
        messageCount = messageCount,
        hasUnreadMessages = hasUnreadMessages
    )
}

/**
 * Parse ticket status string to enum
 */
private fun parseTicketStatus(status: String): TicketStatus {
    return when (status.uppercase()) {
        "OPEN" -> TicketStatus.OPEN
        "IN_PROGRESS" -> TicketStatus.IN_PROGRESS
        "AWAITING_CUSTOMER", "WAITING_FOR_CUSTOMER" -> TicketStatus.AWAITING_CUSTOMER
        "RESOLVED" -> TicketStatus.RESOLVED
        "CLOSED" -> TicketStatus.CLOSED
        else -> TicketStatus.OPEN
    }
}

/**
 * Parse ticket priority string to enum
 */
private fun parseTicketPriority(priority: String): TicketPriority {
    return when (priority.uppercase()) {
        "LOW" -> TicketPriority.LOW
        "NORMAL" -> TicketPriority.NORMAL
        "HIGH" -> TicketPriority.HIGH
        "URGENT" -> TicketPriority.URGENT
        else -> TicketPriority.NORMAL
    }
}

/**
 * Extension function to convert TicketMessageDto to domain TicketMessage model
 */
fun TicketMessageDto.toDomain(): TicketMessage {
    return TicketMessage(
        id = id,
        ticketId = ticketId,
        senderId = senderId,
        senderName = senderName,
        senderType = parseSenderType(senderType),
        message = message,
        attachments = attachments,
        createdAt = Instant.parse(createdAt),
        isRead = isRead
    )
}

/**
 * Parse sender type string to enum
 */
private fun parseSenderType(type: String): SenderType {
    return when (type.uppercase()) {
        "CUSTOMER" -> SenderType.CUSTOMER
        "SUPPORT" -> SenderType.SUPPORT
        "SYSTEM" -> SenderType.SYSTEM
        else -> SenderType.CUSTOMER
    }
}
