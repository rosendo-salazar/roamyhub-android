package com.roamyhub.android.feature.profile.support.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003\u001aL\u0010\u0004\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u001a(\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003\u00a8\u0006\u0011"}, d2 = {"EmptyTicketsState", "", "modifier", "Landroidx/compose/ui/Modifier;", "SupportScreen", "onNavigateBack", "Lkotlin/Function0;", "onNavigateToCreateTicket", "onNavigateToTicketDetail", "Lkotlin/Function1;", "", "viewModel", "Lcom/roamyhub/android/feature/profile/support/viewmodel/SupportViewModel;", "TicketCard", "ticket", "Lcom/roamyhub/android/core/domain/model/support/Ticket;", "onClick", "profile_debug"})
public final class SupportScreenKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void SupportScreen(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateBack, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateToCreateTicket, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onNavigateToTicketDetail, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.feature.profile.support.viewmodel.SupportViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void TicketCard(com.roamyhub.android.core.domain.model.support.Ticket ticket, kotlin.jvm.functions.Function0<kotlin.Unit> onClick, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void EmptyTicketsState(androidx.compose.ui.Modifier modifier) {
    }
}