package com.roamyhub.android.core.data.repository;

import com.roamyhub.android.core.network.api.RewardApiService;
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
public final class RewardRepositoryImpl_Factory implements Factory<RewardRepositoryImpl> {
  private final Provider<RewardApiService> rewardApiServiceProvider;

  public RewardRepositoryImpl_Factory(Provider<RewardApiService> rewardApiServiceProvider) {
    this.rewardApiServiceProvider = rewardApiServiceProvider;
  }

  @Override
  public RewardRepositoryImpl get() {
    return newInstance(rewardApiServiceProvider.get());
  }

  public static RewardRepositoryImpl_Factory create(
      Provider<RewardApiService> rewardApiServiceProvider) {
    return new RewardRepositoryImpl_Factory(rewardApiServiceProvider);
  }

  public static RewardRepositoryImpl newInstance(RewardApiService rewardApiService) {
    return new RewardRepositoryImpl(rewardApiService);
  }
}
