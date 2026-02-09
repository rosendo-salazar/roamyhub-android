package com.roamyhub.android.core.data.repository

import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.data.mapper.toDomain
import com.roamyhub.android.core.domain.model.support.Ticket
import com.roamyhub.android.core.domain.model.support.TicketMessage
import com.roamyhub.android.core.domain.repository.SupportRepository
import com.roamyhub.android.core.network.api.SupportApiService
import com.roamyhub.android.core.network.model.AddMessageRequestDto
import com.roamyhub.android.core.network.model.CreateTicketRequestDto
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Implementation of SupportRepository.
 *
 * Handles customer support ticket operations.
 */
@Singleton
class SupportRepositoryImpl @Inject constructor(
    private val supportApiService: SupportApiService
) : SupportRepository {

    companion object {
        private const val TAG = "SupportRepositoryImpl"
    }

    private val auth: FirebaseAuth by lazy { FirebaseAuth.getInstance() }

    override suspend fun createTicket(
        subject: String,
        message: String,
        category: String?,
        eSimId: String?
    ): Resource<Ticket> {
        return try {
            val userId = auth.currentUser?.uid
                ?: return Resource.Error("User not authenticated")

            val request = CreateTicketRequestDto(
                userId = userId,
                subject = subject,
                category = category ?: "general",
                message = message,
                priority = "NORMAL"
            )

            val response = supportApiService.createTicket(request)
            val ticket = response.ticket.toDomain()
            Resource.Success(ticket)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to create ticket", e)
            Resource.Error(e.message ?: "Failed to create support ticket")
        }
    }

    override suspend fun getUserTickets(): Resource<List<Ticket>> {
        return try {
            val userId = auth.currentUser?.uid
                ?: return Resource.Error("User not authenticated")

            val response = supportApiService.getUserTickets(userId)
            val tickets = response.tickets.map { it.toDomain() }
            Resource.Success(tickets)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to fetch user tickets", e)
            Resource.Error(e.message ?: "Failed to fetch support tickets")
        }
    }

    override suspend fun getTicketById(ticketId: String): Resource<Ticket> {
        return try {
            val response = supportApiService.getTicket(ticketId)
            val ticket = response.ticket.toDomain()
            Resource.Success(ticket)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to fetch ticket: $ticketId", e)
            Resource.Error(e.message ?: "Failed to fetch ticket details")
        }
    }

    override suspend fun sendMessage(
        ticketId: String,
        message: String
    ): Resource<TicketMessage> {
        return try {
            val request = AddMessageRequestDto(
                message = message,
                attachments = emptyList()
            )

            val response = supportApiService.addMessage(ticketId, request)
            val ticketMessage = response.message.toDomain()
            Resource.Success(ticketMessage)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to send message to ticket: $ticketId", e)
            Resource.Error(e.message ?: "Failed to send message")
        }
    }

    override suspend fun closeTicket(ticketId: String): Resource<Unit> {
        return try {
            val response = supportApiService.closeTicket(ticketId)
            if (response.success) {
                Resource.Success(Unit)
            } else {
                Resource.Error(response.message)
            }
        } catch (e: Exception) {
            Log.e(TAG, "Failed to close ticket: $ticketId", e)
            Resource.Error(e.message ?: "Failed to close ticket")
        }
    }
}
