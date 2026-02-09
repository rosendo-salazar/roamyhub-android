package com.roamyhub.android.core.data.mapper;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0002\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\f\u001a\n\u0010\n\u001a\u00020\r*\u00020\u000e\u00a8\u0006\u000f"}, d2 = {"parseSenderType", "Lcom/roamyhub/android/core/domain/model/support/SenderType;", "type", "", "parseTicketPriority", "Lcom/roamyhub/android/core/domain/model/support/TicketPriority;", "priority", "parseTicketStatus", "Lcom/roamyhub/android/core/domain/model/support/TicketStatus;", "status", "toDomain", "Lcom/roamyhub/android/core/domain/model/support/Ticket;", "Lcom/roamyhub/android/core/network/model/TicketDto;", "Lcom/roamyhub/android/core/domain/model/support/TicketMessage;", "Lcom/roamyhub/android/core/network/model/TicketMessageDto;", "data_debug"})
public final class SupportMapperKt {
    
    /**
     * Extension function to convert TicketDto to domain Ticket model
     */
    @org.jetbrains.annotations.NotNull()
    public static final com.roamyhub.android.core.domain.model.support.Ticket toDomain(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.network.model.TicketDto $this$toDomain) {
        return null;
    }
    
    /**
     * Parse ticket status string to enum
     */
    private static final com.roamyhub.android.core.domain.model.support.TicketStatus parseTicketStatus(java.lang.String status) {
        return null;
    }
    
    /**
     * Parse ticket priority string to enum
     */
    private static final com.roamyhub.android.core.domain.model.support.TicketPriority parseTicketPriority(java.lang.String priority) {
        return null;
    }
    
    /**
     * Extension function to convert TicketMessageDto to domain TicketMessage model
     */
    @org.jetbrains.annotations.NotNull()
    public static final com.roamyhub.android.core.domain.model.support.TicketMessage toDomain(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.network.model.TicketMessageDto $this$toDomain) {
        return null;
    }
    
    /**
     * Parse sender type string to enum
     */
    private static final com.roamyhub.android.core.domain.model.support.SenderType parseSenderType(java.lang.String type) {
        return null;
    }
}