package com.roamyhub.android.core.domain.model.support

import kotlinx.datetime.Instant

/**
 * Domain model representing a message in a support ticket
 */
data class TicketMessage(
    val id: String,
    val ticketId: String,
    val senderId: String,
    val senderName: String,
    val senderType: SenderType,
    val message: String,
    val attachments: List<String> = emptyList(),
    val createdAt: Instant,
    val isRead: Boolean = false
) {
    /**
     * Returns true if this message is from support staff
     */
    val isFromSupport: Boolean
        get() = senderType == SenderType.SUPPORT

    /**
     * Returns true if this message is from the customer
     */
    val isFromCustomer: Boolean
        get() = senderType == SenderType.CUSTOMER

    /**
     * Returns true if the message has attachments
     */
    val hasAttachments: Boolean
        get() = attachments.isNotEmpty()
}

/**
 * Enum representing the type of message sender
 */
enum class SenderType {
    CUSTOMER,
    SUPPORT,
    SYSTEM
}
