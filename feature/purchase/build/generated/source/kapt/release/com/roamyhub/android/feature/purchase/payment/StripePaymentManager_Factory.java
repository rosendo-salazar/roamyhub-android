package com.roamyhub.android.feature.purchase.payment;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class StripePaymentManager_Factory implements Factory<StripePaymentManager> {
  @Override
  public StripePaymentManager get() {
    return newInstance();
  }

  public static StripePaymentManager_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static StripePaymentManager newInstance() {
    return new StripePaymentManager();
  }

  private static final class InstanceHolder {
    private static final StripePaymentManager_Factory INSTANCE = new StripePaymentManager_Factory();
  }
}
