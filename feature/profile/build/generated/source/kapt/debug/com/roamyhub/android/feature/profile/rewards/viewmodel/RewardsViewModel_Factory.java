package com.roamyhub.android.feature.profile.rewards.viewmodel;

import com.roamyhub.android.core.domain.usecase.reward.GetRewardsUseCase;
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
public final class RewardsViewModel_Factory implements Factory<RewardsViewModel> {
  private final Provider<GetRewardsUseCase> getRewardsUseCaseProvider;

  public RewardsViewModel_Factory(Provider<GetRewardsUseCase> getRewardsUseCaseProvider) {
    this.getRewardsUseCaseProvider = getRewardsUseCaseProvider;
  }

  @Override
  public RewardsViewModel get() {
    return newInstance(getRewardsUseCaseProvider.get());
  }

  public static RewardsViewModel_Factory create(
      Provider<GetRewardsUseCase> getRewardsUseCaseProvider) {
    return new RewardsViewModel_Factory(getRewardsUseCaseProvider);
  }

  public static RewardsViewModel newInstance(GetRewardsUseCase getRewardsUseCase) {
    return new RewardsViewModel(getRewardsUseCase);
  }
}
