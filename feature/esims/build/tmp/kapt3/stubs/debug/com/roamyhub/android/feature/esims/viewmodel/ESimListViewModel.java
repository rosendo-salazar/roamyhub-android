package com.roamyhub.android.feature.esims.viewmodel;

/**
 * ViewModel for eSIM list screen
 *
 * Manages the user's eSIM collection with filtering by status.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\rR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lcom/roamyhub/android/feature/esims/viewmodel/ESimListViewModel;", "Landroidx/lifecycle/ViewModel;", "eSimRepository", "Lcom/roamyhub/android/core/domain/repository/ESimRepository;", "(Lcom/roamyhub/android/core/domain/repository/ESimRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/roamyhub/android/feature/esims/state/ESimListUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "deleteESim", "", "esimId", "", "loadESims", "onTabChange", "tab", "Lcom/roamyhub/android/feature/esims/state/ESimTab;", "refresh", "esims_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class ESimListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.domain.repository.ESimRepository eSimRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.roamyhub.android.feature.esims.state.ESimListUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.esims.state.ESimListUiState> uiState = null;
    
    @javax.inject.Inject()
    public ESimListViewModel(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.domain.repository.ESimRepository eSimRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.esims.state.ESimListUiState> getUiState() {
        return null;
    }
    
    /**
     * Load user's eSIMs
     */
    public final void loadESims() {
    }
    
    /**
     * Refresh eSIMs (pull-to-refresh)
     */
    public final void refresh() {
    }
    
    /**
     * Change selected tab
     */
    public final void onTabChange(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.feature.esims.state.ESimTab tab) {
    }
    
    /**
     * Delete an eSIM
     */
    public final void deleteESim(@org.jetbrains.annotations.NotNull()
    java.lang.String esimId) {
    }
}