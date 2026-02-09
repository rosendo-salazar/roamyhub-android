package com.roamyhub.android.core.data.repository;

/**
 * Implementation of SupportRepository.
 *
 * Handles customer support ticket operations.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0002\u0010\u0010J8\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0096@\u00a2\u0006\u0002\u0010\u0017J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0002\u0010\u0010J\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001a0\fH\u0096@\u00a2\u0006\u0002\u0010\u001bJ$\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0002\u0010\u001eR\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/roamyhub/android/core/data/repository/SupportRepositoryImpl;", "Lcom/roamyhub/android/core/domain/repository/SupportRepository;", "supportApiService", "Lcom/roamyhub/android/core/network/api/SupportApiService;", "(Lcom/roamyhub/android/core/network/api/SupportApiService;)V", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "getAuth", "()Lcom/google/firebase/auth/FirebaseAuth;", "auth$delegate", "Lkotlin/Lazy;", "closeTicket", "Lcom/roamyhub/android/core/common/result/Resource;", "", "ticketId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createTicket", "Lcom/roamyhub/android/core/domain/model/support/Ticket;", "subject", "message", "category", "eSimId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTicketById", "getUserTickets", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMessage", "Lcom/roamyhub/android/core/domain/model/support/TicketMessage;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "data_release"})
public final class SupportRepositoryImpl implements com.roamyhub.android.core.domain.repository.SupportRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.network.api.SupportApiService supportApiService = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "SupportRepositoryImpl";
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy auth$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.roamyhub.android.core.data.repository.SupportRepositoryImpl.Companion Companion = null;
    
    @javax.inject.Inject()
    public SupportRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.network.api.SupportApiService supportApiService) {
        super();
    }
    
    private final com.google.firebase.auth.FirebaseAuth getAuth() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object createTicket(@org.jetbrains.annotations.NotNull()
    java.lang.String subject, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String category, @org.jetbrains.annotations.Nullable()
    java.lang.String eSimId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<com.roamyhub.android.core.domain.model.support.Ticket>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getUserTickets(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<? extends java.util.List<com.roamyhub.android.core.domain.model.support.Ticket>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getTicketById(@org.jetbrains.annotations.NotNull()
    java.lang.String ticketId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<com.roamyhub.android.core.domain.model.support.Ticket>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object sendMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String ticketId, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<com.roamyhub.android.core.domain.model.support.TicketMessage>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object closeTicket(@org.jetbrains.annotations.NotNull()
    java.lang.String ticketId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<kotlin.Unit>> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/roamyhub/android/core/data/repository/SupportRepositoryImpl$Companion;", "", "()V", "TAG", "", "data_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}