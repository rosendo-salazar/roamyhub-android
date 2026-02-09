package com.roamyhub.android.feature.profile.devices.viewmodel;

import com.roamyhub.android.core.domain.usecase.device.GetCompatibleDevicesUseCase;
import com.roamyhub.android.core.domain.usecase.device.SearchDevicesUseCase;
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
public final class DevicesViewModel_Factory implements Factory<DevicesViewModel> {
  private final Provider<GetCompatibleDevicesUseCase> getCompatibleDevicesUseCaseProvider;

  private final Provider<SearchDevicesUseCase> searchDevicesUseCaseProvider;

  public DevicesViewModel_Factory(
      Provider<GetCompatibleDevicesUseCase> getCompatibleDevicesUseCaseProvider,
      Provider<SearchDevicesUseCase> searchDevicesUseCaseProvider) {
    this.getCompatibleDevicesUseCaseProvider = getCompatibleDevicesUseCaseProvider;
    this.searchDevicesUseCaseProvider = searchDevicesUseCaseProvider;
  }

  @Override
  public DevicesViewModel get() {
    return newInstance(getCompatibleDevicesUseCaseProvider.get(), searchDevicesUseCaseProvider.get());
  }

  public static DevicesViewModel_Factory create(
      Provider<GetCompatibleDevicesUseCase> getCompatibleDevicesUseCaseProvider,
      Provider<SearchDevicesUseCase> searchDevicesUseCaseProvider) {
    return new DevicesViewModel_Factory(getCompatibleDevicesUseCaseProvider, searchDevicesUseCaseProvider);
  }

  public static DevicesViewModel newInstance(
      GetCompatibleDevicesUseCase getCompatibleDevicesUseCase,
      SearchDevicesUseCase searchDevicesUseCase) {
    return new DevicesViewModel(getCompatibleDevicesUseCase, searchDevicesUseCase);
  }
}
