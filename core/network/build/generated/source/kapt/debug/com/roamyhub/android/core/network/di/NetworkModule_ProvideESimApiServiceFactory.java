package com.roamyhub.android.core.network.di;

import com.roamyhub.android.core.network.api.ESimApiService;
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
public final class NetworkModule_ProvideESimApiServiceFactory implements Factory<ESimApiService> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideESimApiServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ESimApiService get() {
    return provideESimApiService(retrofitProvider.get());
  }

  public static NetworkModule_ProvideESimApiServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideESimApiServiceFactory(retrofitProvider);
  }

  public static ESimApiService provideESimApiService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideESimApiService(retrofit));
  }
}
