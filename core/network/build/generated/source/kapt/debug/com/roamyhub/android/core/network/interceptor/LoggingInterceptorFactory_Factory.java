package com.roamyhub.android.core.network.interceptor;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class LoggingInterceptorFactory_Factory implements Factory<LoggingInterceptorFactory> {
  @Override
  public LoggingInterceptorFactory get() {
    return newInstance();
  }

  public static LoggingInterceptorFactory_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static LoggingInterceptorFactory newInstance() {
    return new LoggingInterceptorFactory();
  }

  private static final class InstanceHolder {
    private static final LoggingInterceptorFactory_Factory INSTANCE = new LoggingInterceptorFactory_Factory();
  }
}
