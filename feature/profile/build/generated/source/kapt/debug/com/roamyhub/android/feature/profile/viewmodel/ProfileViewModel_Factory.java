package com.roamyhub.android.feature.profile.viewmodel;

import com.roamyhub.android.core.domain.usecase.profile.GetProfileUseCase;
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
public final class ProfileViewModel_Factory implements Factory<ProfileViewModel> {
  private final Provider<GetProfileUseCase> getProfileUseCaseProvider;

  public ProfileViewModel_Factory(Provider<GetProfileUseCase> getProfileUseCaseProvider) {
    this.getProfileUseCaseProvider = getProfileUseCaseProvider;
  }

  @Override
  public ProfileViewModel get() {
    return newInstance(getProfileUseCaseProvider.get());
  }

  public static ProfileViewModel_Factory create(
      Provider<GetProfileUseCase> getProfileUseCaseProvider) {
    return new ProfileViewModel_Factory(getProfileUseCaseProvider);
  }

  public static ProfileViewModel newInstance(GetProfileUseCase getProfileUseCase) {
    return new ProfileViewModel(getProfileUseCase);
  }
}
