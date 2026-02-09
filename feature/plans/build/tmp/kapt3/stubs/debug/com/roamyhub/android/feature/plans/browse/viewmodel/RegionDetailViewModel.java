package com.roamyhub.android.feature.plans.browse.viewmodel;

/**
 * ViewModel for the Region Detail screen
 *
 * Displays region information and available plans for a specific region.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0013"}, d2 = {"Lcom/roamyhub/android/feature/plans/browse/viewmodel/RegionDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "planRepository", "Lcom/roamyhub/android/core/domain/repository/PlanRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/roamyhub/android/core/domain/repository/PlanRepository;Landroidx/lifecycle/SavedStateHandle;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/roamyhub/android/feature/plans/browse/state/RegionDetailUiState;", "regionKey", "", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "loadRegionData", "", "refresh", "plans_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class RegionDetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.domain.repository.PlanRepository planRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String regionKey = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.roamyhub.android.feature.plans.browse.state.RegionDetailUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.plans.browse.state.RegionDetailUiState> uiState = null;
    
    @javax.inject.Inject()
    public RegionDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.domain.repository.PlanRepository planRepository, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.plans.browse.state.RegionDetailUiState> getUiState() {
        return null;
    }
    
    /**
     * Load region data and plans
     */
    public final void loadRegionData() {
    }
    
    /**
     * Refresh region data
     */
    public final void refresh() {
    }
}