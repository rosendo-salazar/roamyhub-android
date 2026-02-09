package com.roamyhub.android.core.data.repository;

import com.roamyhub.android.core.network.api.PaymentApiService;
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
public final class PaymentRepositoryImpl_Factory implements Factory<PaymentRepositoryImpl> {
  private final Provider<PaymentApiService> paymentApiServiceProvider;

  public PaymentRepositoryImpl_Factory(Provider<PaymentApiService> paymentApiServiceProvider) {
    this.paymentApiServiceProvider = paymentApiServiceProvider;
  }

  @Override
  public PaymentRepositoryImpl get() {
    return newInstance(paymentApiServiceProvider.get());
  }

  public static PaymentRepositoryImpl_Factory create(
      Provider<PaymentApiService> paymentApiServiceProvider) {
    return new PaymentRepositoryImpl_Factory(paymentApiServiceProvider);
  }

  public static PaymentRepositoryImpl newInstance(PaymentApiService paymentApiService) {
    return new PaymentRepositoryImpl(paymentApiService);
  }
}
