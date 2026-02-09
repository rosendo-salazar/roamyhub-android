package com.roamyhub.android.feature.plans.browse.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0003\u001a\u001a\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\b\u001a\u00020\tH\u0003\u001aX\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007\u001a-\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\b\u001a\u00020\t2\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007\u00a2\u0006\u0002\b\u0019H\u0003\u00a8\u0006\u001a"}, d2 = {"BuyNowButton", "", "plan", "Lcom/roamyhub/android/core/domain/model/plan/Plan;", "isAuthenticated", "", "onBuyNow", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "FeatureItem", "feature", "", "PlanDetailScreen", "planId", "onNavigateBack", "onNavigateToCheckout", "onNavigateToAuth", "viewModel", "Lcom/roamyhub/android/feature/plans/browse/viewmodel/PlanDetailViewModel;", "authViewModel", "Lcom/roamyhub/android/feature/plans/browse/ui/PlanDetailAuthViewModel;", "PlanSection", "title", "content", "Landroidx/compose/runtime/Composable;", "plans_debug"})
public final class PlanDetailScreenKt {
    
    /**
     * Plan detail screen showing complete information about a plan
     */
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void PlanDetailScreen(@org.jetbrains.annotations.NotNull()
    java.lang.String planId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateBack, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateToCheckout, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateToAuth, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.feature.plans.browse.viewmodel.PlanDetailViewModel viewModel, @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.feature.plans.browse.ui.PlanDetailAuthViewModel authViewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void PlanSection(java.lang.String title, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void FeatureItem(java.lang.String feature, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void BuyNowButton(com.roamyhub.android.core.domain.model.plan.Plan plan, boolean isAuthenticated, kotlin.jvm.functions.Function0<kotlin.Unit> onBuyNow, androidx.compose.ui.Modifier modifier) {
    }
}