package com.roamyhub.android.core.data.repository;

import com.roamyhub.android.core.network.api.PublicApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class DeviceRepositoryImpl_Factory implements Factory<DeviceRepositoryImpl> {
  private final Provider<PublicApiService> publicApiServiceProvider;

  public DeviceRepositoryImpl_Factory(Provider<PublicApiService> publicApiServiceProvider) {
    this.publicApiServiceProvider = publicApiServiceProvider;
  }

  @Override
  public DeviceRepositoryImpl get() {
    return newInstance(publicApiServiceProvider.get());
  }

  public static DeviceRepositoryImpl_Factory create(
      Provider<PublicApiService> publicApiServiceProvider) {
    return new DeviceRepositoryImpl_Factory(publicApiServiceProvider);
  }

  public static DeviceRepositoryImpl newInstance(PublicApiService publicApiService) {
    return new DeviceRepositoryImpl(publicApiService);
  }
}
