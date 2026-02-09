package com.roamyhub.android.feature.profile.orders.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003\u001a(\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003\u001a>\u0010\t\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007\u001a\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u00a8\u0006\u0013"}, d2 = {"EmptyOrdersState", "", "modifier", "Landroidx/compose/ui/Modifier;", "OrderCard", "order", "Lcom/roamyhub/android/core/domain/model/order/Order;", "onClick", "Lkotlin/Function0;", "OrdersScreen", "onNavigateBack", "onNavigateToOrderDetail", "Lkotlin/Function1;", "", "viewModel", "Lcom/roamyhub/android/feature/profile/orders/viewmodel/OrdersViewModel;", "formatDate", "instant", "Lkotlinx/datetime/Instant;", "profile_debug"})
public final class OrdersScreenKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void OrdersScreen(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateBack, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onNavigateToOrderDetail, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.feature.profile.orders.viewmodel.OrdersViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void OrderCard(com.roamyhub.android.core.domain.model.order.Order order, kotlin.jvm.functions.Function0<kotlin.Unit> onClick, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void EmptyOrdersState(androidx.compose.ui.Modifier modifier) {
    }
    
    private static final java.lang.String formatDate(kotlinx.datetime.Instant instant) {
        return null;
    }
}