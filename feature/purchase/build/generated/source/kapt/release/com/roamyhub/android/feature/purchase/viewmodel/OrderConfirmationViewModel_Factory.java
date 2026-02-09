package com.roamyhub.android.feature.purchase.viewmodel;

import com.roamyhub.android.core.domain.repository.ESimRepository;
import com.roamyhub.android.core.domain.repository.OrderRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class OrderConfirmationViewModel_Factory implements Factory<OrderConfirmationViewModel> {
  private final Provider<OrderRepository> orderRepositoryProvider;

  private final Provider<ESimRepository> eSimRepositoryProvider;

  public OrderConfirmationViewModel_Factory(Provider<OrderRepository> orderRepositoryProvider,
      Provider<ESimRepository> eSimRepositoryProvider) {
    this.orderRepositoryProvider = orderRepositoryProvider;
    this.eSimRepositoryProvider = eSimRepositoryProvider;
  }

  @Override
  public OrderConfirmationViewModel get() {
    return newInstance(orderRepositoryProvider.get(), eSimRepositoryProvider.get());
  }

  public static OrderConfirmationViewModel_Factory create(
      Provider<OrderRepository> orderRepositoryProvider,
      Provider<ESimRepository> eSimRepositoryProvider) {
    return new OrderConfirmationViewModel_Factory(orderRepositoryProvider, eSimRepositoryProvider);
  }

  public static OrderConfirmationViewModel newInstance(OrderRepository orderRepository,
      ESimRepository eSimRepository) {
    return new OrderConfirmationViewModel(orderRepository, eSimRepository);
  }
}
