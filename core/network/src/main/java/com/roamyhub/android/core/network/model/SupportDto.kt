package com.roamyhub.android.core.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * DTO for creating a ticket request
 */
@Serializable
data class CreateTicketRequestDto(
    @SerialName("user_id") val userId: String,
    @SerialName("subject") val subject: String,
    @SerialName("category") val category: String,
    @SerialName("message") val message: String,
    @SerialName("priority") val priority: String = "NORMAL"
)

/**
 * DTO for ticket data
 */
@Serializable
data class TicketDto(
    @SerialName("id") val id: String,
    @SerialName("user_id") val userId: String,
    @SerialName("subject") val subject: String,
    @SerialName("category") val category: String,
    @SerialName("status") val status: String,
    @SerialName("priority") val priority: String = "NORMAL",
    @SerialName("created_at") val createdAt: String,
    @SerialName("updated_at") val updatedAt: String,
    @SerialName("closed_at") val closedAt: String? = null,
    @SerialName("last_message_at") val lastMessageAt: String? = null,
    @SerialName("message_count") val messageCount: Int = 0,
    @SerialName("has_unread_messages") val hasUnreadMessages: Boolean = false
)

/**
 * DTO for create ticket response
 */
@Serializable
data class CreateTicketResponseDto(
    @SerialName("ticket") val ticket: TicketDto
)

/**
 * DTO for list of tickets response
 */
@Serializable
data class TicketsResponseDto(
    @SerialName("tickets") val tickets: List<TicketDto>,
    @SerialName("total") val total: Int
)

/**
 * DTO for single ticket response
 */
@Serializable
data class TicketResponseDto(
    @SerialName("ticket") val ticket: TicketDto,
    @SerialName("messages") val messages: List<TicketMessageDto> = emptyList()
)

/**
 * DTO for ticket message
 */
@Serializable
data class TicketMessageDto(
    @SerialName("id") val id: String,
    @SerialName("ticket_id") val ticketId: String,
    @SerialName("sender_id") val senderId: String,
    @SerialName("sender_name") val senderName: String,
    @SerialName("sender_type") val senderType: String,
    @SerialName("message") val message: String,
    @SerialName("attachments") val attachments: List<String> = emptyList(),
    @SerialName("created_at") val createdAt: String,
    @SerialName("is_read") val isRead: Boolean = false
)

/**
 * DTO for adding a message to a ticket request
 */
@Serializable
data class AddMessageRequestDto(
    @SerialName("message") val message: String,
    @SerialName("attachments") val attachments: List<String> = emptyList()
)

/**
 * DTO for add message response
 */
@Serializable
data class AddMessageResponseDto(
    @SerialName("message") val message: TicketMessageDto
)

/**
 * DTO for close ticket response
 */
@Serializable
data class CloseTicketResponseDto(
    @SerialName("success") val success: Boolean,
    @SerialName("message") val message: String
)
