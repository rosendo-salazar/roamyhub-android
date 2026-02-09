package com.roamyhub.android.feature.profile.orders.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import com.roamyhub.android.core.domain.usecase.order.GetOrderDetailUseCase;
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
public final class OrderDetailViewModel_Factory implements Factory<OrderDetailViewModel> {
  private final Provider<GetOrderDetailUseCase> getOrderDetailUseCaseProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public OrderDetailViewModel_Factory(Provider<GetOrderDetailUseCase> getOrderDetailUseCaseProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.getOrderDetailUseCaseProvider = getOrderDetailUseCaseProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public OrderDetailViewModel get() {
    return newInstance(getOrderDetailUseCaseProvider.get(), savedStateHandleProvider.get());
  }

  public static OrderDetailViewModel_Factory create(
      Provider<GetOrderDetailUseCase> getOrderDetailUseCaseProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new OrderDetailViewModel_Factory(getOrderDetailUseCaseProvider, savedStateHandleProvider);
  }

  public static OrderDetailViewModel newInstance(GetOrderDetailUseCase getOrderDetailUseCase,
      SavedStateHandle savedStateHandle) {
    return new OrderDetailViewModel(getOrderDetailUseCase, savedStateHandle);
  }
}
