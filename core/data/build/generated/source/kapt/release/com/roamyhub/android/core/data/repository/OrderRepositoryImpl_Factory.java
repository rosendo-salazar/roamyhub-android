package com.roamyhub.android.core.data.repository;

import com.roamyhub.android.core.network.api.OrderApiService;
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
public final class OrderRepositoryImpl_Factory implements Factory<OrderRepositoryImpl> {
  private final Provider<OrderApiService> orderApiServiceProvider;

  public OrderRepositoryImpl_Factory(Provider<OrderApiService> orderApiServiceProvider) {
    this.orderApiServiceProvider = orderApiServiceProvider;
  }

  @Override
  public OrderRepositoryImpl get() {
    return newInstance(orderApiServiceProvider.get());
  }

  public static OrderRepositoryImpl_Factory create(
      Provider<OrderApiService> orderApiServiceProvider) {
    return new OrderRepositoryImpl_Factory(orderApiServiceProvider);
  }

  public static OrderRepositoryImpl newInstance(OrderApiService orderApiService) {
    return new OrderRepositoryImpl(orderApiService);
  }
}
