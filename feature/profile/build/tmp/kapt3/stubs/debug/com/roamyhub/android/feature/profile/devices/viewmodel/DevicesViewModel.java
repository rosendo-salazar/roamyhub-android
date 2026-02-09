package com.roamyhub.android.feature.profile.devices.viewmodel;

/**
 * ViewModel for Devices screen
 *
 * Manages device compatibility search and filtering.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\b\u0010\u0013\u001a\u00020\u000fH\u0002J\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0012J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0012H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0017"}, d2 = {"Lcom/roamyhub/android/feature/profile/devices/viewmodel/DevicesViewModel;", "Landroidx/lifecycle/ViewModel;", "getCompatibleDevicesUseCase", "Lcom/roamyhub/android/core/domain/usecase/device/GetCompatibleDevicesUseCase;", "searchDevicesUseCase", "Lcom/roamyhub/android/core/domain/usecase/device/SearchDevicesUseCase;", "(Lcom/roamyhub/android/core/domain/usecase/device/GetCompatibleDevicesUseCase;Lcom/roamyhub/android/core/domain/usecase/device/SearchDevicesUseCase;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/roamyhub/android/feature/profile/devices/state/DevicesUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "clearError", "", "filterByBrand", "brand", "", "loadDevices", "onSearchQueryChange", "query", "searchDevices", "profile_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class DevicesViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.domain.usecase.device.GetCompatibleDevicesUseCase getCompatibleDevicesUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.domain.usecase.device.SearchDevicesUseCase searchDevicesUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.roamyhub.android.feature.profile.devices.state.DevicesUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.profile.devices.state.DevicesUiState> uiState = null;
    
    @javax.inject.Inject()
    public DevicesViewModel(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.domain.usecase.device.GetCompatibleDevicesUseCase getCompatibleDevicesUseCase, @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.domain.usecase.device.SearchDevicesUseCase searchDevicesUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.profile.devices.state.DevicesUiState> getUiState() {
        return null;
    }
    
    /**
     * Load all compatible devices
     */
    private final void loadDevices() {
    }
    
    /**
     * Update search query
     */
    public final void onSearchQueryChange(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    /**
     * Search devices
     */
    private final void searchDevices(java.lang.String query) {
    }
    
    /**
     * Filter by brand
     */
    public final void filterByBrand(@org.jetbrains.annotations.Nullable()
    java.lang.String brand) {
    }
    
    /**
     * Clear error message
     */
    public final void clearError() {
    }
}