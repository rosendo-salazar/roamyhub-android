package com.roamyhub.android.feature.profile.settings.viewmodel;

import com.roamyhub.android.core.domain.usecase.profile.DeleteAccountUseCase;
import com.roamyhub.android.core.domain.usecase.profile.GetProfileUseCase;
import com.roamyhub.android.core.domain.usecase.profile.UpdateProfileUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class SettingsViewModel_Factory implements Factory<SettingsViewModel> {
  private final Provider<GetProfileUseCase> getProfileUseCaseProvider;

  private final Provider<UpdateProfileUseCase> updateProfileUseCaseProvider;

  private final Provider<DeleteAccountUseCase> deleteAccountUseCaseProvider;

  public SettingsViewModel_Factory(Provider<GetProfileUseCase> getProfileUseCaseProvider,
      Provider<UpdateProfileUseCase> updateProfileUseCaseProvider,
      Provider<DeleteAccountUseCase> deleteAccountUseCaseProvider) {
    this.getProfileUseCaseProvider = getProfileUseCaseProvider;
    this.updateProfileUseCaseProvider = updateProfileUseCaseProvider;
    this.deleteAccountUseCaseProvider = deleteAccountUseCaseProvider;
  }

  @Override
  public SettingsViewModel get() {
    return newInstance(getProfileUseCaseProvider.get(), updateProfileUseCaseProvider.get(), deleteAccountUseCaseProvider.get());
  }

  public static SettingsViewModel_Factory create(
      Provider<GetProfileUseCase> getProfileUseCaseProvider,
      Provider<UpdateProfileUseCase> updateProfileUseCaseProvider,
      Provider<DeleteAccountUseCase> deleteAccountUseCaseProvider) {
    return new SettingsViewModel_Factory(getProfileUseCaseProvider, updateProfileUseCaseProvider, deleteAccountUseCaseProvider);
  }

  public static SettingsViewModel newInstance(GetProfileUseCase getProfileUseCase,
      UpdateProfileUseCase updateProfileUseCase, DeleteAccountUseCase deleteAccountUseCase) {
    return new SettingsViewModel(getProfileUseCase, updateProfileUseCase, deleteAccountUseCase);
  }
}
