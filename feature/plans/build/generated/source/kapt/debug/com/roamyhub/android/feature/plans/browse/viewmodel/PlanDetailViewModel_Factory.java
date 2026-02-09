package com.roamyhub.android.feature.plans.browse.viewmodel;

import androidx.lifecycle.SavedStateHandle;
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
public final class PlanDetailViewModel_Factory implements Factory<PlanDetailViewModel> {
  private final Provider<PlanRepository> planRepositoryProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public PlanDetailViewModel_Factory(Provider<PlanRepository> planRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.planRepositoryProvider = planRepositoryProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public PlanDetailViewModel get() {
    return newInstance(planRepositoryProvider.get(), savedStateHandleProvider.get());
  }

  public static PlanDetailViewModel_Factory create(Provider<PlanRepository> planRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new PlanDetailViewModel_Factory(planRepositoryProvider, savedStateHandleProvider);
  }

  public static PlanDetailViewModel newInstance(PlanRepository planRepository,
      SavedStateHandle savedStateHandle) {
    return new PlanDetailViewModel(planRepository, savedStateHandle);
  }
}
