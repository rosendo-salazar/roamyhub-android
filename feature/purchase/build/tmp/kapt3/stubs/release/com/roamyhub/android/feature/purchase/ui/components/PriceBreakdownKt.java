package com.roamyhub.android.feature.purchase.ui.components;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u001a2\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\u001a4\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\b\u001a\u00020\tH\u0003\u00a8\u0006\u000f"}, d2 = {"PriceBreakdown", "", "subtotal", "", "discount", "total", "currency", "", "modifier", "Landroidx/compose/ui/Modifier;", "PriceRow", "label", "amount", "isDiscount", "", "purchase_release"})
public final class PriceBreakdownKt {
    
    /**
     * Component displaying price breakdown with subtotal, discount, and total
     */
    @androidx.compose.runtime.Composable()
    public static final void PriceBreakdown(double subtotal, double discount, double total, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    /**
     * Single row in price breakdown
     */
    @androidx.compose.runtime.Composable()
    private static final void PriceRow(java.lang.String label, double amount, java.lang.String currency, boolean isDiscount, androidx.compose.ui.Modifier modifier) {
    }
}