package com.roamyhub.android.feature.profile.viewmodel;

/**
 * ViewModel for Edit Profile screen
 *
 * Manages profile editing form state and validation.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0013J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0013J\u0006\u0010\u0018\u001a\u00020\u000fR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/roamyhub/android/feature/profile/viewmodel/EditProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "getProfileUseCase", "Lcom/roamyhub/android/core/domain/usecase/profile/GetProfileUseCase;", "updateProfileUseCase", "Lcom/roamyhub/android/core/domain/usecase/profile/UpdateProfileUseCase;", "(Lcom/roamyhub/android/core/domain/usecase/profile/GetProfileUseCase;Lcom/roamyhub/android/core/domain/usecase/profile/UpdateProfileUseCase;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/roamyhub/android/feature/profile/state/EditProfileUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "clearMessages", "", "loadProfile", "onFirstNameChange", "firstName", "", "onLastNameChange", "lastName", "onPhoneNumberChange", "phoneNumber", "saveProfile", "profile_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class EditProfileViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.domain.usecase.profile.GetProfileUseCase getProfileUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.domain.usecase.profile.UpdateProfileUseCase updateProfileUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.roamyhub.android.feature.profile.state.EditProfileUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.profile.state.EditProfileUiState> uiState = null;
    
    @javax.inject.Inject()
    public EditProfileViewModel(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.domain.usecase.profile.GetProfileUseCase getProfileUseCase, @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.domain.usecase.profile.UpdateProfileUseCase updateProfileUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.roamyhub.android.feature.profile.state.EditProfileUiState> getUiState() {
        return null;
    }
    
    /**
     * Load user profile
     */
    private final void loadProfile() {
    }
    
    /**
     * Update first name
     */
    public final void onFirstNameChange(@org.jetbrains.annotations.NotNull()
    java.lang.String firstName) {
    }
    
    /**
     * Update last name
     */
    public final void onLastNameChange(@org.jetbrains.annotations.NotNull()
    java.lang.String lastName) {
    }
    
    /**
     * Update phone number
     */
    public final void onPhoneNumberChange(@org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumber) {
    }
    
    /**
     * Save profile changes
     */
    public final void saveProfile() {
    }
    
    /**
     * Clear messages
     */
    public final void clearMessages() {
    }
}