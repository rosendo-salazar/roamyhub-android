package com.roamyhub.android.core.network.api;

/**
 * Retrofit API service for customer support endpoints
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0006\u001a\u00020\u000eH\u00a7@\u00a2\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lcom/roamyhub/android/core/network/api/SupportApiService;", "", "addMessage", "Lcom/roamyhub/android/core/network/model/AddMessageResponseDto;", "ticketId", "", "request", "Lcom/roamyhub/android/core/network/model/AddMessageRequestDto;", "(Ljava/lang/String;Lcom/roamyhub/android/core/network/model/AddMessageRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "closeTicket", "Lcom/roamyhub/android/core/network/model/CloseTicketResponseDto;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createTicket", "Lcom/roamyhub/android/core/network/model/CreateTicketResponseDto;", "Lcom/roamyhub/android/core/network/model/CreateTicketRequestDto;", "(Lcom/roamyhub/android/core/network/model/CreateTicketRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTicket", "Lcom/roamyhub/android/core/network/model/TicketResponseDto;", "getUserTickets", "Lcom/roamyhub/android/core/network/model/TicketsResponseDto;", "userId", "network_debug"})
public abstract interface SupportApiService {
    
    /**
     * Create a new support ticket
     */
    @retrofit2.http.POST(value = "tickets")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createTicket(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.network.model.CreateTicketRequestDto request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.CreateTicketResponseDto> $completion);
    
    /**
     * Get all tickets for a user
     */
    @retrofit2.http.GET(value = "tickets/user/{userId}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUserTickets(@retrofit2.http.Path(value = "userId")
    @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.TicketsResponseDto> $completion);
    
    /**
     * Get a specific ticket with messages
     */
    @retrofit2.http.GET(value = "tickets/{ticketId}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTicket(@retrofit2.http.Path(value = "ticketId")
    @org.jetbrains.annotations.NotNull()
    java.lang.String ticketId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.TicketResponseDto> $completion);
    
    /**
     * Add a message to a ticket
     */
    @retrofit2.http.POST(value = "tickets/{ticketId}/messages")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addMessage(@retrofit2.http.Path(value = "ticketId")
    @org.jetbrains.annotations.NotNull()
    java.lang.String ticketId, @retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.network.model.AddMessageRequestDto request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.AddMessageResponseDto> $completion);
    
    /**
     * Close a ticket
     */
    @retrofit2.http.POST(value = "tickets/{ticketId}/close")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object closeTicket(@retrofit2.http.Path(value = "ticketId")
    @org.jetbrains.annotations.NotNull()
    java.lang.String ticketId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.CloseTicketResponseDto> $completion);
}