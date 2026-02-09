package com.roamyhub.android.core.data.repository;

import com.roamyhub.android.core.network.api.CheckoutApiService;
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
public final class CheckoutRepositoryImpl_Factory implements Factory<CheckoutRepositoryImpl> {
  private final Provider<CheckoutApiService> checkoutApiServiceProvider;

  public CheckoutRepositoryImpl_Factory(Provider<CheckoutApiService> checkoutApiServiceProvider) {
    this.checkoutApiServiceProvider = checkoutApiServiceProvider;
  }

  @Override
  public CheckoutRepositoryImpl get() {
    return newInstance(checkoutApiServiceProvider.get());
  }

  public static CheckoutRepositoryImpl_Factory create(
      Provider<CheckoutApiService> checkoutApiServiceProvider) {
    return new CheckoutRepositoryImpl_Factory(checkoutApiServiceProvider);
  }

  public static CheckoutRepositoryImpl newInstance(CheckoutApiService checkoutApiService) {
    return new CheckoutRepositoryImpl(checkoutApiService);
  }
}
