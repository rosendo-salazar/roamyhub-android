package com.roamyhub.android.core.network.di;

import com.roamyhub.android.core.network.api.PlanApiService;
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
public final class NetworkModule_ProvidePlanApiServiceFactory implements Factory<PlanApiService> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvidePlanApiServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public PlanApiService get() {
    return providePlanApiService(retrofitProvider.get());
  }

  public static NetworkModule_ProvidePlanApiServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvidePlanApiServiceFactory(retrofitProvider);
  }

  public static PlanApiService providePlanApiService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.providePlanApiService(retrofit));
  }
}
