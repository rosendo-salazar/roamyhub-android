package com.roamyhub.android.feature.plans.home.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ad\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0003\u001aR\u0010\u000f\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007\u001a \u0010\u0012\u001a\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0003\u001a*\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u000b2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0003\u00a8\u0006\u0017"}, d2 = {"HomeContent", "", "popularCountries", "", "Lcom/roamyhub/android/core/domain/model/plan/CountrySummary;", "regions", "Lcom/roamyhub/android/core/domain/model/plan/RegionSummary;", "onNavigateToSearch", "Lkotlin/Function0;", "onNavigateToCountry", "Lkotlin/Function1;", "", "onNavigateToRegion", "modifier", "Landroidx/compose/ui/Modifier;", "HomeScreen", "viewModel", "Lcom/roamyhub/android/feature/plans/home/viewmodel/HomeViewModel;", "SearchPrompt", "onClick", "SectionHeader", "title", "onSeeAllClick", "plans_debug"})
public final class HomeScreenKt {
    
    /**
     * Home screen - main entry point for the app
     *
     * Displays search prompt, popular destinations, and regions.
     */
    @androidx.compose.runtime.Composable()
    public static final void HomeScreen(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateToSearch, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onNavigateToCountry, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onNavigateToRegion, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.feature.plans.home.viewmodel.HomeViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void HomeContent(java.util.List<com.roamyhub.android.core.domain.model.plan.CountrySummary> popularCountries, java.util.List<com.roamyhub.android.core.domain.model.plan.RegionSummary> regions, kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateToSearch, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onNavigateToCountry, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onNavigateToRegion, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void SearchPrompt(kotlin.jvm.functions.Function0<kotlin.Unit> onClick, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void SectionHeader(java.lang.String title, kotlin.jvm.functions.Function0<kotlin.Unit> onSeeAllClick, androidx.compose.ui.Modifier modifier) {
    }
}