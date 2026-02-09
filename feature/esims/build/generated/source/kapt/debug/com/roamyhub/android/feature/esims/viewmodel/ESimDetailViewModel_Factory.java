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
public final class ESimDetailViewModel_Factory implements Factory<ESimDetailViewModel> {
  private final Provider<ESimRepository> eSimRepositoryProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public ESimDetailViewModel_Factory(Provider<ESimRepository> eSimRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.eSimRepositoryProvider = eSimRepositoryProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public ESimDetailViewModel get() {
    return newInstance(eSimRepositoryProvider.get(), savedStateHandleProvider.get());
  }

  public static ESimDetailViewModel_Factory create(Provider<ESimRepository> eSimRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new ESimDetailViewModel_Factory(eSimRepositoryProvider, savedStateHandleProvider);
  }

  public static ESimDetailViewModel newInstance(ESimRepository eSimRepository,
      SavedStateHandle savedStateHandle) {
    return new ESimDetailViewModel(eSimRepository, savedStateHandle);
  }
}
