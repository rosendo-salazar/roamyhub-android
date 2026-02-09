package com.roamyhub.android.feature.plans.browse.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a`\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u001a4\u0010\r\u001a\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u0003\u001a(\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\nH\u0003\u001aL\u0010\u0015\u001a\u00020\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\t\u001a\u00020\nH\u0003\u00a8\u0006\u0018"}, d2 = {"BrowseScreen", "", "onNavigateToSearch", "Lkotlin/Function0;", "onNavigateToCountry", "Lkotlin/Function1;", "", "onNavigateToRegion", "onNavigateToGlobal", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/roamyhub/android/feature/plans/browse/viewmodel/BrowseViewModel;", "CountriesTab", "countries", "", "Lcom/roamyhub/android/core/domain/model/plan/CountrySummary;", "GlobalPlanCard", "globalSummary", "Lcom/roamyhub/android/core/domain/model/plan/GlobalSummary;", "onClick", "RegionsTab", "regions", "Lcom/roamyhub/android/core/domain/model/plan/RegionSummary;", "plans_debug"})
public final class BrowseScreenKt {
    
    /**
     * Main Browse screen for discovering plans by country or region
     */
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void BrowseScreen(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateToSearch, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onNavigateToCountry, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onNavigateToRegion, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateToGlobal, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.feature.plans.browse.viewmodel.BrowseViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void CountriesTab(java.util.List<com.roamyhub.android.core.domain.model.plan.CountrySummary> countries, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onNavigateToCountry, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void RegionsTab(java.util.List<com.roamyhub.android.core.domain.model.plan.RegionSummary> regions, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onNavigateToRegion, kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateToGlobal, com.roamyhub.android.core.domain.model.plan.GlobalSummary globalSummary, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void GlobalPlanCard(com.roamyhub.android.core.domain.model.plan.GlobalSummary globalSummary, kotlin.jvm.functions.Function0<kotlin.Unit> onClick, androidx.compose.ui.Modifier modifier) {
    }
}