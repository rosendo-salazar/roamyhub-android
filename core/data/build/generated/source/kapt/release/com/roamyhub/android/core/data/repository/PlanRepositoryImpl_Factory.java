package com.roamyhub.android.core.data.repository;

import com.roamyhub.android.core.network.api.BrowseApiService;
import com.roamyhub.android.core.network.api.PlanApiService;
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
public final class PlanRepositoryImpl_Factory implements Factory<PlanRepositoryImpl> {
  private final Provider<PlanApiService> planApiServiceProvider;

  private final Provider<BrowseApiService> browseApiServiceProvider;

  public PlanRepositoryImpl_Factory(Provider<PlanApiService> planApiServiceProvider,
      Provider<BrowseApiService> browseApiServiceProvider) {
    this.planApiServiceProvider = planApiServiceProvider;
    this.browseApiServiceProvider = browseApiServiceProvider;
  }

  @Override
  public PlanRepositoryImpl get() {
    return newInstance(planApiServiceProvider.get(), browseApiServiceProvider.get());
  }

  public static PlanRepositoryImpl_Factory create(Provider<PlanApiService> planApiServiceProvider,
      Provider<BrowseApiService> browseApiServiceProvider) {
    return new PlanRepositoryImpl_Factory(planApiServiceProvider, browseApiServiceProvider);
  }

  public static PlanRepositoryImpl newInstance(PlanApiService planApiService,
      BrowseApiService browseApiService) {
    return new PlanRepositoryImpl(planApiService, browseApiService);
  }
}
