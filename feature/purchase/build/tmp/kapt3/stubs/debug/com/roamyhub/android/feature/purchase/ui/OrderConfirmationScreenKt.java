package com.roamyhub.android.feature.purchase.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003\u001aK\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003\u001aU\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00032!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007\u001a,\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003\u001a\u0015\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH\u0002\u00a2\u0006\u0002\u0010\u001d\u00a8\u0006\u001e"}, d2 = {"ErrorContent", "", "error", "", "onRetry", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "OrderConfirmationContent", "uiState", "Lcom/roamyhub/android/feature/purchase/state/OrderConfirmationUiState;", "onNavigateToESimDetail", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "esimId", "onNavigateToHome", "OrderConfirmationScreen", "orderId", "viewModel", "Lcom/roamyhub/android/feature/purchase/viewmodel/OrderConfirmationViewModel;", "OrderDetailRow", "label", "value", "isHighlighted", "", "formatDate", "instant", "error/NonExistentClass", "(Lerror/NonExistentClass;)Ljava/lang/String;", "purchase_debug"})
public final class OrderConfirmationScreenKt {
    
    /**
     * Order confirmation screen shown after successful payment
     */
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void OrderConfirmationScreen(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onNavigateToESimDetail, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateToHome, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.feature.purchase.viewmodel.OrderConfirmationViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void OrderConfirmationContent(com.roamyhub.android.feature.purchase.state.OrderConfirmationUiState uiState, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onNavigateToESimDetail, kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateToHome, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void OrderDetailRow(java.lang.String label, java.lang.String value, boolean isHighlighted, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void ErrorContent(java.lang.String error, kotlin.jvm.functions.Function0<kotlin.Unit> onRetry, androidx.compose.ui.Modifier modifier) {
    }
    
    /**
     * Format Instant to readable date
     */
    private static final java.lang.String formatDate(error.NonExistentClass instant) {
        return null;
    }
}