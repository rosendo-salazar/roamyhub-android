package com.roamyhub.android.feature.plans.browse.viewmodel;

/**
 * ViewModel for the Browse screen
 *
 * Manages country summaries, region summaries, and global summary for browsing plans.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\rH\u0082@\u00a2\u0006\u0002\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\rH\u0082@\u00a2\u0006\u0002\u0010\u000fJ\u000e\u0010\u0012\u001a\u00020\rH\u0082@\u00a2\u0006\u0002\u0010\u000fJ\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\rR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001a"}, d2 = {"Lcom/roamyhub/android/feature/plans/browse/viewmodel/BrowseViewModel;", "Landroidx/lifecycle/ViewModel;", "planRepository", "Lcom/roamyhub/android/core/domain/repository/PlanRepository;", "(Lcom/roamyhub/android/core/domain/repository/PlanRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/roamyhub/android/feature/plans/browse/state/BrowseUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "clearSearch", "", "loadCountrySummaries", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadData", "loadGlobalSummary", "loadRegionSummaries", "onSearchQueryChange", "query", "", "onTabChange", "tabIndex", "", "refresh", "plans_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class BrowseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.domain.repository.PlanRepository planRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.roamyhub.android.feature.plans.browse.state.BrowseUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.plans.browse.state.BrowseUiState> uiState = null;
    
    @javax.inject.Inject()
    public BrowseViewModel(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.domain.repository.PlanRepository planRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.plans.browse.state.BrowseUiState> getUiState() {
        return null;
    }
    
    /**
     * Load all browse data (countries, regions, global)
     */
    public final void loadData() {
    }
    
    /**
     * Refresh all data with pull-to-refresh
     */
    public final void refresh() {
    }
    
    /**
     * Change selected tab
     */
    public final void onTabChange(int tabIndex) {
    }
    
    /**
     * Update search query
     */
    public final void onSearchQueryChange(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    /**
     * Clear search query
     */
    public final void clearSearch() {
    }
    
    private final java.lang.Object loadCountrySummaries(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object loadRegionSummaries(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object loadGlobalSummary(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}