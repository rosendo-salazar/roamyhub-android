package com.roamyhub.android.feature.profile.support.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import com.roamyhub.android.core.domain.usecase.support.CloseTicketUseCase;
import com.roamyhub.android.core.domain.usecase.support.GetTicketDetailUseCase;
import com.roamyhub.android.core.domain.usecase.support.SendTicketMessageUseCase;
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
public final class TicketDetailViewModel_Factory implements Factory<TicketDetailViewModel> {
  private final Provider<GetTicketDetailUseCase> getTicketDetailUseCaseProvider;

  private final Provider<SendTicketMessageUseCase> sendTicketMessageUseCaseProvider;

  private final Provider<CloseTicketUseCase> closeTicketUseCaseProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public TicketDetailViewModel_Factory(
      Provider<GetTicketDetailUseCase> getTicketDetailUseCaseProvider,
      Provider<SendTicketMessageUseCase> sendTicketMessageUseCaseProvider,
      Provider<CloseTicketUseCase> closeTicketUseCaseProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.getTicketDetailUseCaseProvider = getTicketDetailUseCaseProvider;
    this.sendTicketMessageUseCaseProvider = sendTicketMessageUseCaseProvider;
    this.closeTicketUseCaseProvider = closeTicketUseCaseProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public TicketDetailViewModel get() {
    return newInstance(getTicketDetailUseCaseProvider.get(), sendTicketMessageUseCaseProvider.get(), closeTicketUseCaseProvider.get(), savedStateHandleProvider.get());
  }

  public static TicketDetailViewModel_Factory create(
      Provider<GetTicketDetailUseCase> getTicketDetailUseCaseProvider,
      Provider<SendTicketMessageUseCase> sendTicketMessageUseCaseProvider,
      Provider<CloseTicketUseCase> closeTicketUseCaseProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new TicketDetailViewModel_Factory(getTicketDetailUseCaseProvider, sendTicketMessageUseCaseProvider, closeTicketUseCaseProvider, savedStateHandleProvider);
  }

  public static TicketDetailViewModel newInstance(GetTicketDetailUseCase getTicketDetailUseCase,
      SendTicketMessageUseCase sendTicketMessageUseCase, CloseTicketUseCase closeTicketUseCase,
      SavedStateHandle savedStateHandle) {
    return new TicketDetailViewModel(getTicketDetailUseCase, sendTicketMessageUseCase, closeTicketUseCase, savedStateHandle);
  }
}
