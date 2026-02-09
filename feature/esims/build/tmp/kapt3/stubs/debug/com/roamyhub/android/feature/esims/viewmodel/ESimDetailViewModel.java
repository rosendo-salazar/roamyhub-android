package com.roamyhub.android.feature.esims.viewmodel;

/**
 * ViewModel for eSIM detail screen
 *
 * Manages individual eSIM details and deletion.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013J\u0006\u0010\u0014\u001a\u00020\u0011R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0015"}, d2 = {"Lcom/roamyhub/android/feature/esims/viewmodel/ESimDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "eSimRepository", "Lcom/roamyhub/android/core/domain/repository/ESimRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/roamyhub/android/core/domain/repository/ESimRepository;Landroidx/lifecycle/SavedStateHandle;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/roamyhub/android/feature/esims/state/ESimDetailUiState;", "esimId", "", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "deleteESim", "", "onSuccess", "Lkotlin/Function0;", "loadESim", "esims_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class ESimDetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.domain.repository.ESimRepository eSimRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String esimId = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.roamyhub.android.feature.esims.state.ESimDetailUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.esims.state.ESimDetailUiState> uiState = null;
    
    @javax.inject.Inject()
    public ESimDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.domain.repository.ESimRepository eSimRepository, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.esims.state.ESimDetailUiState> getUiState() {
        return null;
    }
    
    /**
     * Load eSIM details
     */
    public final void loadESim() {
    }
    
    /**
     * Delete the current eSIM
     */
    public final void deleteESim(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSuccess) {
    }
}