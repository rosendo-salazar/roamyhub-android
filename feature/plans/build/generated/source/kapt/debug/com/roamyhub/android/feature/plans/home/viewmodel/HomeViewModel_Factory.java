package com.roamyhub.android.feature.plans.home.viewmodel;

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
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<PlanRepository> planRepositoryProvider;

  public HomeViewModel_Factory(Provider<PlanRepository> planRepositoryProvider) {
    this.planRepositoryProvider = planRepositoryProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(planRepositoryProvider.get());
  }

  public static HomeViewModel_Factory create(Provider<PlanRepository> planRepositoryProvider) {
    return new HomeViewModel_Factory(planRepositoryProvider);
  }

  public static HomeViewModel newInstance(PlanRepository planRepository) {
    return new HomeViewModel(planRepository);
  }
}
