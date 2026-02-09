package com.roamyhub.android.core.data.repository;

import com.roamyhub.android.core.network.api.SupportApiService;
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
public final class SupportRepositoryImpl_Factory implements Factory<SupportRepositoryImpl> {
  private final Provider<SupportApiService> supportApiServiceProvider;

  public SupportRepositoryImpl_Factory(Provider<SupportApiService> supportApiServiceProvider) {
    this.supportApiServiceProvider = supportApiServiceProvider;
  }

  @Override
  public SupportRepositoryImpl get() {
    return newInstance(supportApiServiceProvider.get());
  }

  public static SupportRepositoryImpl_Factory create(
      Provider<SupportApiService> supportApiServiceProvider) {
    return new SupportRepositoryImpl_Factory(supportApiServiceProvider);
  }

  public static SupportRepositoryImpl newInstance(SupportApiService supportApiService) {
    return new SupportRepositoryImpl(supportApiService);
  }
}
