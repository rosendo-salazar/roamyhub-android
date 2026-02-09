package com.roamyhub.android.core.data.repository;

import com.roamyhub.android.core.data.local.TokenManager;
import com.roamyhub.android.core.network.api.AuthApiService;
import com.roamyhub.android.core.network.api.ProfileApiService;
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
public final class AuthRepositoryImpl_Factory implements Factory<AuthRepositoryImpl> {
  private final Provider<AuthApiService> authApiServiceProvider;

  private final Provider<ProfileApiService> profileApiServiceProvider;

  private final Provider<TokenManager> tokenManagerProvider;

  public AuthRepositoryImpl_Factory(Provider<AuthApiService> authApiServiceProvider,
      Provider<ProfileApiService> profileApiServiceProvider,
      Provider<TokenManager> tokenManagerProvider) {
    this.authApiServiceProvider = authApiServiceProvider;
    this.profileApiServiceProvider = profileApiServiceProvider;
    this.tokenManagerProvider = tokenManagerProvider;
  }

  @Override
  public AuthRepositoryImpl get() {
    return newInstance(authApiServiceProvider.get(), profileApiServiceProvider.get(), tokenManagerProvider.get());
  }

  public static AuthRepositoryImpl_Factory create(Provider<AuthApiService> authApiServiceProvider,
      Provider<ProfileApiService> profileApiServiceProvider,
      Provider<TokenManager> tokenManagerProvider) {
    return new AuthRepositoryImpl_Factory(authApiServiceProvider, profileApiServiceProvider, tokenManagerProvider);
  }

  public static AuthRepositoryImpl newInstance(AuthApiService authApiService,
      ProfileApiService profileApiService, TokenManager tokenManager) {
    return new AuthRepositoryImpl(authApiService, profileApiService, tokenManager);
  }
}
