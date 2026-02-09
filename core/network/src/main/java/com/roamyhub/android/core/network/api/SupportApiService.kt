package com.roamyhub.android.core.network.api

import com.roamyhub.android.core.network.model.AddMessageRequestDto
import com.roamyhub.android.core.network.model.AddMessageResponseDto
import com.roamyhub.android.core.network.model.CloseTicketResponseDto
import com.roamyhub.android.core.network.model.CreateTicketRequestDto
import com.roamyhub.android.core.network.model.CreateTicketResponseDto
import com.roamyhub.android.core.network.model.TicketResponseDto
import com.roamyhub.android.core.network.model.TicketsResponseDto
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

/**
 * Retrofit API service for customer support endpoints
 */
interface SupportApiService {

    /**
     * Create a new support ticket
     */
    @POST("tickets")
    suspend fun createTicket(@Body request: CreateTicketRequestDto): CreateTicketResponseDto

    /**
     * Get all tickets for a user
     */
    @GET("tickets/user/{userId}")
    suspend fun getUserTickets(@Path("userId") userId: String): TicketsResponseDto

    /**
     * Get a specific ticket with messages
     */
    @GET("tickets/{ticketId}")
    suspend fun getTicket(@Path("ticketId") ticketId: String): TicketResponseDto

    /**
     * Add a message to a ticket
     */
    @POST("tickets/{ticketId}/messages")
    suspend fun addMessage(
        @Path("ticketId") ticketId: String,
        @Body request: AddMessageRequestDto
    ): AddMessageResponseDto

    /**
     * Close a ticket
     */
    @POST("tickets/{ticketId}/close")
    suspend fun closeTicket(@Path("ticketId") ticketId: String): CloseTicketResponseDto
}
