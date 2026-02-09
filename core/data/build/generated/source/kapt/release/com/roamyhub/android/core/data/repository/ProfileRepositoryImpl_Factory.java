package com.roamyhub.android.core.data.repository;

import com.roamyhub.android.core.network.api.ProfileApiService;
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
public final class ProfileRepositoryImpl_Factory implements Factory<ProfileRepositoryImpl> {
  private final Provider<ProfileApiService> profileApiServiceProvider;

  public ProfileRepositoryImpl_Factory(Provider<ProfileApiService> profileApiServiceProvider) {
    this.profileApiServiceProvider = profileApiServiceProvider;
  }

  @Override
  public ProfileRepositoryImpl get() {
    return newInstance(profileApiServiceProvider.get());
  }

  public static ProfileRepositoryImpl_Factory create(
      Provider<ProfileApiService> profileApiServiceProvider) {
    return new ProfileRepositoryImpl_Factory(profileApiServiceProvider);
  }

  public static ProfileRepositoryImpl newInstance(ProfileApiService profileApiService) {
    return new ProfileRepositoryImpl(profileApiService);
  }
}
