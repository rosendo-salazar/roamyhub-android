package com.roamyhub.android.core.network.di;

import com.roamyhub.android.core.network.interceptor.AuthInterceptor;
import com.roamyhub.android.core.network.interceptor.ConnectivityInterceptor;
import com.roamyhub.android.core.network.interceptor.LoggingInterceptorFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

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
public final class NetworkModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final Provider<AuthInterceptor> authInterceptorProvider;

  private final Provider<ConnectivityInterceptor> connectivityInterceptorProvider;

  private final Provider<LoggingInterceptorFactory> loggingInterceptorFactoryProvider;

  public NetworkModule_ProvideOkHttpClientFactory(Provider<AuthInterceptor> authInterceptorProvider,
      Provider<ConnectivityInterceptor> connectivityInterceptorProvider,
      Provider<LoggingInterceptorFactory> loggingInterceptorFactoryProvider) {
    this.authInterceptorProvider = authInterceptorProvider;
    this.connectivityInterceptorProvider = connectivityInterceptorProvider;
    this.loggingInterceptorFactoryProvider = loggingInterceptorFactoryProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideOkHttpClient(authInterceptorProvider.get(), connectivityInterceptorProvider.get(), loggingInterceptorFactoryProvider.get());
  }

  public static NetworkModule_ProvideOkHttpClientFactory create(
      Provider<AuthInterceptor> authInterceptorProvider,
      Provider<ConnectivityInterceptor> connectivityInterceptorProvider,
      Provider<LoggingInterceptorFactory> loggingInterceptorFactoryProvider) {
    return new NetworkModule_ProvideOkHttpClientFactory(authInterceptorProvider, connectivityInterceptorProvider, loggingInterceptorFactoryProvider);
  }

  public static OkHttpClient provideOkHttpClient(AuthInterceptor authInterceptor,
      ConnectivityInterceptor connectivityInterceptor,
      LoggingInterceptorFactory loggingInterceptorFactory) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideOkHttpClient(authInterceptor, connectivityInterceptor, loggingInterceptorFactory));
  }
}
