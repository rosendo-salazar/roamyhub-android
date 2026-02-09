package com.roamyhub.android.core.network.interceptor;

import com.google.firebase.auth.FirebaseAuth;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AuthInterceptor_Factory implements Factory<AuthInterceptor> {
  private final Provider<FirebaseAuth> firebaseAuthProvider;

  public AuthInterceptor_Factory(Provider<FirebaseAuth> firebaseAuthProvider) {
    this.firebaseAuthProvider = firebaseAuthProvider;
  }

  @Override
  public AuthInterceptor get() {
    return newInstance(firebaseAuthProvider.get());
  }

  public static AuthInterceptor_Factory create(Provider<FirebaseAuth> firebaseAuthProvider) {
    return new AuthInterceptor_Factory(firebaseAuthProvider);
  }

  public static AuthInterceptor newInstance(FirebaseAuth firebaseAuth) {
    return new AuthInterceptor(firebaseAuth);
  }
}
