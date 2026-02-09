package com.roamyhub.android.feature.profile.viewmodel;

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
public final class EditProfileViewModel_Factory implements Factory<EditProfileViewModel> {
  private final Provider<GetProfileUseCase> getProfileUseCaseProvider;

  private final Provider<UpdateProfileUseCase> updateProfileUseCaseProvider;

  public EditProfileViewModel_Factory(Provider<GetProfileUseCase> getProfileUseCaseProvider,
      Provider<UpdateProfileUseCase> updateProfileUseCaseProvider) {
    this.getProfileUseCaseProvider = getProfileUseCaseProvider;
    this.updateProfileUseCaseProvider = updateProfileUseCaseProvider;
  }

  @Override
  public EditProfileViewModel get() {
    return newInstance(getProfileUseCaseProvider.get(), updateProfileUseCaseProvider.get());
  }

  public static EditProfileViewModel_Factory create(
      Provider<GetProfileUseCase> getProfileUseCaseProvider,
      Provider<UpdateProfileUseCase> updateProfileUseCaseProvider) {
    return new EditProfileViewModel_Factory(getProfileUseCaseProvider, updateProfileUseCaseProvider);
  }

  public static EditProfileViewModel newInstance(GetProfileUseCase getProfileUseCase,
      UpdateProfileUseCase updateProfileUseCase) {
    return new EditProfileViewModel(getProfileUseCase, updateProfileUseCase);
  }
}
