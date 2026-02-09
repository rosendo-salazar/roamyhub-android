package com.roamyhub.android.feature.plans.browse.viewmodel;

import com.roamyhub.android.core.domain.repository.PlanRepository;
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
public final class BrowseViewModel_Factory implements Factory<BrowseViewModel> {
  private final Provider<PlanRepository> planRepositoryProvider;

  public BrowseViewModel_Factory(Provider<PlanRepository> planRepositoryProvider) {
    this.planRepositoryProvider = planRepositoryProvider;
  }

  @Override
  public BrowseViewModel get() {
    return newInstance(planRepositoryProvider.get());
  }

  public static BrowseViewModel_Factory create(Provider<PlanRepository> planRepositoryProvider) {
    return new BrowseViewModel_Factory(planRepositoryProvider);
  }

  public static BrowseViewModel newInstance(PlanRepository planRepository) {
    return new BrowseViewModel(planRepository);
  }
}
