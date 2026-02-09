package com.roamyhub.android.feature.plans.browse.ui;

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
public final class GlobalPlansViewModel_Factory implements Factory<GlobalPlansViewModel> {
  private final Provider<PlanRepository> planRepositoryProvider;

  public GlobalPlansViewModel_Factory(Provider<PlanRepository> planRepositoryProvider) {
    this.planRepositoryProvider = planRepositoryProvider;
  }

  @Override
  public GlobalPlansViewModel get() {
    return newInstance(planRepositoryProvider.get());
  }

  public static GlobalPlansViewModel_Factory create(
      Provider<PlanRepository> planRepositoryProvider) {
    return new GlobalPlansViewModel_Factory(planRepositoryProvider);
  }

  public static GlobalPlansViewModel newInstance(PlanRepository planRepository) {
    return new GlobalPlansViewModel(planRepository);
  }
}
