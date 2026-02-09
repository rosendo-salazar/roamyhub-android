package com.roamyhub.android.feature.esims.viewmodel;

/**
 * ViewModel for QR code screen
 *
 * Manages QR code data and copy-to-clipboard feedback.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0016"}, d2 = {"Lcom/roamyhub/android/feature/esims/viewmodel/QrCodeViewModel;", "Landroidx/lifecycle/ViewModel;", "eSimRepository", "Lcom/roamyhub/android/core/domain/repository/ESimRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/roamyhub/android/core/domain/repository/ESimRepository;Landroidx/lifecycle/SavedStateHandle;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/roamyhub/android/feature/esims/state/QrCodeUiState;", "esimId", "", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "clearCopiedState", "", "loadQrCode", "onFieldCopied", "field", "Lcom/roamyhub/android/feature/esims/state/QrCodeUiState$CopiedField;", "esims_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class QrCodeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.domain.repository.ESimRepository eSimRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String esimId = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.roamyhub.android.feature.esims.state.QrCodeUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.esims.state.QrCodeUiState> uiState = null;
    
    @javax.inject.Inject()
    public QrCodeViewModel(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.domain.repository.ESimRepository eSimRepository, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.esims.state.QrCodeUiState> getUiState() {
        return null;
    }
    
    /**
     * Load QR code data
     */
    public final void loadQrCode() {
    }
    
    /**
     * Mark that a field was copied
     */
    public final void onFieldCopied(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.feature.esims.state.QrCodeUiState.CopiedField field) {
    }
    
    /**
     * Clear the copied field state
     */
    public final void clearCopiedState() {
    }
}