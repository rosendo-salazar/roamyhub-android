package com.roamyhub.android.core.network.di;

import com.roamyhub.android.core.network.api.SupportApiService;
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
public final class NetworkModule_ProvideSupportApiServiceFactory implements Factory<SupportApiService> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideSupportApiServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public SupportApiService get() {
    return provideSupportApiService(retrofitProvider.get());
  }

  public static NetworkModule_ProvideSupportApiServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideSupportApiServiceFactory(retrofitProvider);
  }

  public static SupportApiService provideSupportApiService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideSupportApiService(retrofit));
  }
}
