package com.roamyhub.android.feature.esims.viewmodel;

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
public final class ESimListViewModel_Factory implements Factory<ESimListViewModel> {
  private final Provider<ESimRepository> eSimRepositoryProvider;

  public ESimListViewModel_Factory(Provider<ESimRepository> eSimRepositoryProvider) {
    this.eSimRepositoryProvider = eSimRepositoryProvider;
  }

  @Override
  public ESimListViewModel get() {
    return newInstance(eSimRepositoryProvider.get());
  }

  public static ESimListViewModel_Factory create(Provider<ESimRepository> eSimRepositoryProvider) {
    return new ESimListViewModel_Factory(eSimRepositoryProvider);
  }

  public static ESimListViewModel newInstance(ESimRepository eSimRepository) {
    return new ESimListViewModel(eSimRepository);
  }
}
