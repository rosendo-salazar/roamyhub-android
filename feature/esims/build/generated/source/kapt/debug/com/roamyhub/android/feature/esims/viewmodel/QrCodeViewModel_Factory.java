package com.roamyhub.android.feature.esims.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import com.roamyhub.android.core.domain.repository.ESimRepository;
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
public final class QrCodeViewModel_Factory implements Factory<QrCodeViewModel> {
  private final Provider<ESimRepository> eSimRepositoryProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public QrCodeViewModel_Factory(Provider<ESimRepository> eSimRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.eSimRepositoryProvider = eSimRepositoryProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public QrCodeViewModel get() {
    return newInstance(eSimRepositoryProvider.get(), savedStateHandleProvider.get());
  }

  public static QrCodeViewModel_Factory create(Provider<ESimRepository> eSimRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new QrCodeViewModel_Factory(eSimRepositoryProvider, savedStateHandleProvider);
  }

  public static QrCodeViewModel newInstance(ESimRepository eSimRepository,
      SavedStateHandle savedStateHandle) {
    return new QrCodeViewModel(eSimRepository, savedStateHandle);
  }
}
