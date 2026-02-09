package com.roamyhub.android.core.data.repository;

import com.roamyhub.android.core.network.api.ESimApiService;
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
public final class ESimRepositoryImpl_Factory implements Factory<ESimRepositoryImpl> {
  private final Provider<ESimApiService> eSimApiServiceProvider;

  public ESimRepositoryImpl_Factory(Provider<ESimApiService> eSimApiServiceProvider) {
    this.eSimApiServiceProvider = eSimApiServiceProvider;
  }

  @Override
  public ESimRepositoryImpl get() {
    return newInstance(eSimApiServiceProvider.get());
  }

  public static ESimRepositoryImpl_Factory create(Provider<ESimApiService> eSimApiServiceProvider) {
    return new ESimRepositoryImpl_Factory(eSimApiServiceProvider);
  }

  public static ESimRepositoryImpl newInstance(ESimApiService eSimApiService) {
    return new ESimRepositoryImpl(eSimApiService);
  }
}
