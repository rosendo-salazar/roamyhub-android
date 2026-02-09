package com.roamyhub.android.feature.profile.support.viewmodel;

import com.roamyhub.android.core.domain.usecase.support.CreateTicketUseCase;
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
public final class CreateTicketViewModel_Factory implements Factory<CreateTicketViewModel> {
  private final Provider<CreateTicketUseCase> createTicketUseCaseProvider;

  public CreateTicketViewModel_Factory(Provider<CreateTicketUseCase> createTicketUseCaseProvider) {
    this.createTicketUseCaseProvider = createTicketUseCaseProvider;
  }

  @Override
  public CreateTicketViewModel get() {
    return newInstance(createTicketUseCaseProvider.get());
  }

  public static CreateTicketViewModel_Factory create(
      Provider<CreateTicketUseCase> createTicketUseCaseProvider) {
    return new CreateTicketViewModel_Factory(createTicketUseCaseProvider);
  }

  public static CreateTicketViewModel newInstance(CreateTicketUseCase createTicketUseCase) {
    return new CreateTicketViewModel(createTicketUseCase);
  }
}
