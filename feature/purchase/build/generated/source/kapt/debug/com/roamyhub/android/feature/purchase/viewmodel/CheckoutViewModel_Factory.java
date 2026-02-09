package com.roamyhub.android.feature.purchase.viewmodel;

import com.roamyhub.android.core.domain.repository.CheckoutRepository;
import com.roamyhub.android.core.domain.repository.OrderRepository;
import com.roamyhub.android.core.domain.repository.PaymentRepository;
import com.roamyhub.android.core.domain.repository.PlanRepository;
import com.roamyhub.android.core.domain.repository.RewardRepository;
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
public final class CheckoutViewModel_Factory implements Factory<CheckoutViewModel> {
  private final Provider<PlanRepository> planRepositoryProvider;

  private final Provider<CheckoutRepository> checkoutRepositoryProvider;

  private final Provider<PaymentRepository> paymentRepositoryProvider;

  private final Provider<RewardRepository> rewardRepositoryProvider;

  private final Provider<OrderRepository> orderRepositoryProvider;

  public CheckoutViewModel_Factory(Provider<PlanRepository> planRepositoryProvider,
      Provider<CheckoutRepository> checkoutRepositoryProvider,
      Provider<PaymentRepository> paymentRepositoryProvider,
      Provider<RewardRepository> rewardRepositoryProvider,
      Provider<OrderRepository> orderRepositoryProvider) {
    this.planRepositoryProvider = planRepositoryProvider;
    this.checkoutRepositoryProvider = checkoutRepositoryProvider;
    this.paymentRepositoryProvider = paymentRepositoryProvider;
    this.rewardRepositoryProvider = rewardRepositoryProvider;
    this.orderRepositoryProvider = orderRepositoryProvider;
  }

  @Override
  public CheckoutViewModel get() {
    return newInstance(planRepositoryProvider.get(), checkoutRepositoryProvider.get(), paymentRepositoryProvider.get(), rewardRepositoryProvider.get(), orderRepositoryProvider.get());
  }

  public static CheckoutViewModel_Factory create(Provider<PlanRepository> planRepositoryProvider,
      Provider<CheckoutRepository> checkoutRepositoryProvider,
      Provider<PaymentRepository> paymentRepositoryProvider,
      Provider<RewardRepository> rewardRepositoryProvider,
      Provider<OrderRepository> orderRepositoryProvider) {
    return new CheckoutViewModel_Factory(planRepositoryProvider, checkoutRepositoryProvider, paymentRepositoryProvider, rewardRepositoryProvider, orderRepositoryProvider);
  }

  public static CheckoutViewModel newInstance(PlanRepository planRepository,
      CheckoutRepository checkoutRepository, PaymentRepository paymentRepository,
      RewardRepository rewardRepository, OrderRepository orderRepository) {
    return new CheckoutViewModel(planRepository, checkoutRepository, paymentRepository, rewardRepository, orderRepository);
  }
}
