package com.roamyhub.android.feature.auth.viewmodel;

import com.roamyhub.android.core.domain.repository.AuthRepository;
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
public final class SignupViewModel_Factory implements Factory<SignupViewModel> {
  private final Provider<AuthRepository> authRepositoryProvider;

  public SignupViewModel_Factory(Provider<AuthRepository> authRepositoryProvider) {
    this.authRepositoryProvider = authRepositoryProvider;
  }

  @Override
  public SignupViewModel get() {
    return newInstance(authRepositoryProvider.get());
  }

  public static SignupViewModel_Factory create(Provider<AuthRepository> authRepositoryProvider) {
    return new SignupViewModel_Factory(authRepositoryProvider);
  }

  public static SignupViewModel newInstance(AuthRepository authRepository) {
    return new SignupViewModel(authRepository);
  }
}
