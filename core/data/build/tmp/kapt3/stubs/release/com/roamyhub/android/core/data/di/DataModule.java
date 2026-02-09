package com.roamyhub.android.core.data.di;

/**
 * Hilt module that binds repository interfaces to their implementations.
 *
 * This module is installed in the SingletonComponent, making all repositories
 * available as singletons throughout the application lifecycle.
 */
@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\'J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\'J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\'J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\'J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\'J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\'J\u0010\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\'J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\'\u00a8\u0006/"}, d2 = {"Lcom/roamyhub/android/core/data/di/DataModule;", "", "()V", "bindAuthRepository", "Lcom/roamyhub/android/core/domain/repository/AuthRepository;", "authRepositoryImpl", "Lcom/roamyhub/android/core/data/repository/AuthRepositoryImpl;", "bindCheckoutRepository", "Lcom/roamyhub/android/core/domain/repository/CheckoutRepository;", "checkoutRepositoryImpl", "Lcom/roamyhub/android/core/data/repository/CheckoutRepositoryImpl;", "bindConfigRepository", "Lcom/roamyhub/android/core/domain/repository/ConfigRepository;", "configRepositoryImpl", "Lcom/roamyhub/android/core/data/repository/ConfigRepositoryImpl;", "bindDeviceRepository", "Lcom/roamyhub/android/core/domain/repository/DeviceRepository;", "deviceRepositoryImpl", "Lcom/roamyhub/android/core/data/repository/DeviceRepositoryImpl;", "bindESimRepository", "Lcom/roamyhub/android/core/domain/repository/ESimRepository;", "eSimRepositoryImpl", "Lcom/roamyhub/android/core/data/repository/ESimRepositoryImpl;", "bindOrderRepository", "Lcom/roamyhub/android/core/domain/repository/OrderRepository;", "orderRepositoryImpl", "Lcom/roamyhub/android/core/data/repository/OrderRepositoryImpl;", "bindPaymentRepository", "Lcom/roamyhub/android/core/domain/repository/PaymentRepository;", "paymentRepositoryImpl", "Lcom/roamyhub/android/core/data/repository/PaymentRepositoryImpl;", "bindPlanRepository", "Lcom/roamyhub/android/core/domain/repository/PlanRepository;", "planRepositoryImpl", "Lcom/roamyhub/android/core/data/repository/PlanRepositoryImpl;", "bindProfileRepository", "Lcom/roamyhub/android/core/domain/repository/ProfileRepository;", "profileRepositoryImpl", "Lcom/roamyhub/android/core/data/repository/ProfileRepositoryImpl;", "bindRewardRepository", "Lcom/roamyhub/android/core/domain/repository/RewardRepository;", "rewardRepositoryImpl", "Lcom/roamyhub/android/core/data/repository/RewardRepositoryImpl;", "bindSupportRepository", "Lcom/roamyhub/android/core/domain/repository/SupportRepository;", "supportRepositoryImpl", "Lcom/roamyhub/android/core/data/repository/SupportRepositoryImpl;", "data_release"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract class DataModule {
    
    public DataModule() {
        super();
    }
    
    @dagger.Binds()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public abstract com.roamyhub.android.core.domain.repository.AuthRepository bindAuthRepository(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.data.repository.AuthRepositoryImpl authRepositoryImpl);
    
    @dagger.Binds()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public abstract com.roamyhub.android.core.domain.repository.PlanRepository bindPlanRepository(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.data.repository.PlanRepositoryImpl planRepositoryImpl);
    
    @dagger.Binds()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public abstract com.roamyhub.android.core.domain.repository.ESimRepository bindESimRepository(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.data.repository.ESimRepositoryImpl eSimRepositoryImpl);
    
    @dagger.Binds()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public abstract com.roamyhub.android.core.domain.repository.CheckoutRepository bindCheckoutRepository(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.data.repository.CheckoutRepositoryImpl checkoutRepositoryImpl);
    
    @dagger.Binds()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public abstract com.roamyhub.android.core.domain.repository.OrderRepository bindOrderRepository(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.data.repository.OrderRepositoryImpl orderRepositoryImpl);
    
    @dagger.Binds()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public abstract com.roamyhub.android.core.domain.repository.PaymentRepository bindPaymentRepository(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.data.repository.PaymentRepositoryImpl paymentRepositoryImpl);
    
    @dagger.Binds()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public abstract com.roamyhub.android.core.domain.repository.RewardRepository bindRewardRepository(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.data.repository.RewardRepositoryImpl rewardRepositoryImpl);
    
    @dagger.Binds()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public abstract com.roamyhub.android.core.domain.repository.ProfileRepository bindProfileRepository(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.data.repository.ProfileRepositoryImpl profileRepositoryImpl);
    
    @dagger.Binds()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public abstract com.roamyhub.android.core.domain.repository.SupportRepository bindSupportRepository(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.data.repository.SupportRepositoryImpl supportRepositoryImpl);
    
    @dagger.Binds()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public abstract com.roamyhub.android.core.domain.repository.DeviceRepository bindDeviceRepository(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.data.repository.DeviceRepositoryImpl deviceRepositoryImpl);
    
    @dagger.Binds()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public abstract com.roamyhub.android.core.domain.repository.ConfigRepository bindConfigRepository(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.data.repository.ConfigRepositoryImpl configRepositoryImpl);
}