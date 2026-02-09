package com.roamyhub.android.feature.plans.browse.ui;

import com.roamyhub.android.core.domain.repository.AuthRepository;
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
public final class PlanDetailAuthViewModel_Factory implements Factory<PlanDetailAuthViewModel> {
  private final Provider<AuthRepository> authRepositoryProvider;

  public PlanDetailAuthViewModel_Factory(Provider<AuthRepository> authRepositoryProvider) {
    this.authRepositoryProvider = authRepositoryProvider;
  }

  @Override
  public PlanDetailAuthViewModel get() {
    return newInstance(authRepositoryProvider.get());
  }

  public static PlanDetailAuthViewModel_Factory create(
      Provider<AuthRepository> authRepositoryProvider) {
    return new PlanDetailAuthViewModel_Factory(authRepositoryProvider);
  }

  public static PlanDetailAuthViewModel newInstance(AuthRepository authRepository) {
    return new PlanDetailAuthViewModel(authRepository);
  }
}
