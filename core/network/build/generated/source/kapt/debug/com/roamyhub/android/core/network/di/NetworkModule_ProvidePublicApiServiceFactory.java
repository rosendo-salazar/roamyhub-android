package com.roamyhub.android.core.network.di;

import com.roamyhub.android.core.network.api.PublicApiService;
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
public final class NetworkModule_ProvidePublicApiServiceFactory implements Factory<PublicApiService> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvidePublicApiServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public PublicApiService get() {
    return providePublicApiService(retrofitProvider.get());
  }

  public static NetworkModule_ProvidePublicApiServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvidePublicApiServiceFactory(retrofitProvider);
  }

  public static PublicApiService providePublicApiService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.providePublicApiService(retrofit));
  }
}
