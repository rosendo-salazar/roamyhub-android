package com.roamyhub.android.core.network.di;

import com.roamyhub.android.core.network.api.RewardApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

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
public final class NetworkModule_ProvideRewardApiServiceFactory implements Factory<RewardApiService> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideRewardApiServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public RewardApiService get() {
    return provideRewardApiService(retrofitProvider.get());
  }

  public static NetworkModule_ProvideRewardApiServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideRewardApiServiceFactory(retrofitProvider);
  }

  public static RewardApiService provideRewardApiService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideRewardApiService(retrofit));
  }
}
