package com.roamyhub.android.feature.profile.support.viewmodel;

import com.roamyhub.android.core.domain.usecase.support.GetTicketsUseCase;
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
public final class SupportViewModel_Factory implements Factory<SupportViewModel> {
  private final Provider<GetTicketsUseCase> getTicketsUseCaseProvider;

  public SupportViewModel_Factory(Provider<GetTicketsUseCase> getTicketsUseCaseProvider) {
    this.getTicketsUseCaseProvider = getTicketsUseCaseProvider;
  }

  @Override
  public SupportViewModel get() {
    return newInstance(getTicketsUseCaseProvider.get());
  }

  public static SupportViewModel_Factory create(
      Provider<GetTicketsUseCase> getTicketsUseCaseProvider) {
    return new SupportViewModel_Factory(getTicketsUseCaseProvider);
  }

  public static SupportViewModel newInstance(GetTicketsUseCase getTicketsUseCase) {
    return new SupportViewModel(getTicketsUseCase);
  }
}
