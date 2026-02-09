package com.roamyhub.android.feature.purchase.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a<\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0003\u001a_\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\b2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007\u001a(\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0003\u00a8\u0006\u001a"}, d2 = {"CheckoutContent", "", "uiState", "Lcom/roamyhub/android/feature/purchase/state/CheckoutUiState;", "onPointsChange", "Lkotlin/Function1;", "", "onPaymentClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "CheckoutScreen", "planId", "", "onNavigateBack", "onNavigateToOrderConfirmation", "Lkotlin/ParameterName;", "name", "orderId", "viewModel", "Lcom/roamyhub/android/feature/purchase/viewmodel/CheckoutViewModel;", "stripePaymentManager", "Lcom/roamyhub/android/feature/purchase/payment/StripePaymentManager;", "ErrorContent", "error", "onRetry", "purchase_debug"})
public final class CheckoutScreenKt {
    
    /**
     * Checkout screen for purchasing an eSIM plan
     */
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void CheckoutScreen(@org.jetbrains.annotations.NotNull()
    java.lang.String planId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateBack, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onNavigateToOrderConfirmation, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.feature.purchase.viewmodel.CheckoutViewModel viewModel, @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.feature.purchase.payment.StripePaymentManager stripePaymentManager) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void CheckoutContent(com.roamyhub.android.feature.purchase.state.CheckoutUiState uiState, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onPointsChange, kotlin.jvm.functions.Function0<kotlin.Unit> onPaymentClick, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void ErrorContent(java.lang.String error, kotlin.jvm.functions.Function0<kotlin.Unit> onRetry, androidx.compose.ui.Modifier modifier) {
    }
}