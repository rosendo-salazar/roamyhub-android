package com.roamyhub.android.core.data.di;

import com.roamyhub.android.core.data.local.TokenManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class DataStoreModule_ProvideTokenManagerFactory implements Factory<TokenManager> {
  @Override
  public TokenManager get() {
    return provideTokenManager();
  }

  public static DataStoreModule_ProvideTokenManagerFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static TokenManager provideTokenManager() {
    return Preconditions.checkNotNullFromProvides(DataStoreModule.INSTANCE.provideTokenManager());
  }

  private static final class InstanceHolder {
    private static final DataStoreModule_ProvideTokenManagerFactory INSTANCE = new DataStoreModule_ProvideTokenManagerFactory();
  }
}
