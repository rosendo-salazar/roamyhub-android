package com.roamyhub.android.feature.profile.support.state;

/**
 * UI state for Ticket Detail screen
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\u000eJ\u0006\u0010\u0017\u001a\u00020\nJ\u0006\u0010\u0018\u001a\u00020\nJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\nH\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bH\u00c6\u0003JY\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020$H\u00d6\u0001J\t\u0010%\u001a\u00020\bH\u00d6\u0001R\u0013\u0010\r\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0011R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006&"}, d2 = {"Lcom/roamyhub/android/feature/profile/support/state/TicketDetailUiState;", "", "ticket", "Lcom/roamyhub/android/core/domain/model/support/Ticket;", "messages", "", "Lcom/roamyhub/android/core/domain/model/support/TicketMessage;", "replyMessage", "", "isLoading", "", "isSendingMessage", "isClosingTicket", "error", "(Lcom/roamyhub/android/core/domain/model/support/Ticket;Ljava/util/List;Ljava/lang/String;ZZZLjava/lang/String;)V", "getError", "()Ljava/lang/String;", "()Z", "getMessages", "()Ljava/util/List;", "getReplyMessage", "getTicket", "()Lcom/roamyhub/android/core/domain/model/support/Ticket;", "canCloseTicket", "canSendReply", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "profile_debug"})
public final class TicketDetailUiState {
    @org.jetbrains.annotations.Nullable()
    private final com.roamyhub.android.core.domain.model.support.Ticket ticket = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.roamyhub.android.core.domain.model.support.TicketMessage> messages = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String replyMessage = null;
    private final boolean isLoading = false;
    private final boolean isSendingMessage = false;
    private final boolean isClosingTicket = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String error = null;
    
    public TicketDetailUiState(@org.jetbrains.annotations.Nullable()
    com.roamyhub.android.core.domain.model.support.Ticket ticket, @org.jetbrains.annotations.NotNull()
    java.util.List<com.roamyhub.android.core.domain.model.support.TicketMessage> messages, @org.jetbrains.annotations.NotNull()
    java.lang.String replyMessage, boolean isLoading, boolean isSendingMessage, boolean isClosingTicket, @org.jetbrains.annotations.Nullable()
    java.lang.String error) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.roamyhub.android.core.domain.model.support.Ticket getTicket() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.roamyhub.android.core.domain.model.support.TicketMessage> getMessages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReplyMessage() {
        return null;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public final boolean isSendingMessage() {
        return false;
    }
    
    public final boolean isClosingTicket() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getError() {
        return null;
    }
    
    /**
     * Returns true if a reply can be sent
     */
    public final boolean canSendReply() {
        return false;
    }
    
    /**
     * Returns true if the ticket can be closed
     */
    public final boolean canCloseTicket() {
        return false;
    }
    
    public TicketDetailUiState() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.roamyhub.android.core.domain.model.support.Ticket component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.roamyhub.android.core.domain.model.support.TicketMessage> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean component6() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.roamyhub.android.feature.profile.support.state.TicketDetailUiState copy(@org.jetbrains.annotations.Nullable()
    com.roamyhub.android.core.domain.model.support.Ticket ticket, @org.jetbrains.annotations.NotNull()
    java.util.List<com.roamyhub.android.core.domain.model.support.TicketMessage> messages, @org.jetbrains.annotations.NotNull()
    java.lang.String replyMessage, boolean isLoading, boolean isSendingMessage, boolean isClosingTicket, @org.jetbrains.annotations.Nullable()
    java.lang.String error) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}