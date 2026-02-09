package com.roamyhub.android.core.network.di;

import com.roamyhub.android.core.network.api.BrowseApiService;
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
public final class NetworkModule_ProvideBrowseApiServiceFactory implements Factory<BrowseApiService> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideBrowseApiServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public BrowseApiService get() {
    return provideBrowseApiService(retrofitProvider.get());
  }

  public static NetworkModule_ProvideBrowseApiServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideBrowseApiServiceFactory(retrofitProvider);
  }

  public static BrowseApiService provideBrowseApiService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideBrowseApiService(retrofit));
  }
}
