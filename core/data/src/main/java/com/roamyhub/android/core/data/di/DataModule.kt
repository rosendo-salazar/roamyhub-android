package com.roamyhub.android.core.data.di

import com.roamyhub.android.core.data.repository.AuthRepositoryImpl
import com.roamyhub.android.core.data.repository.CheckoutRepositoryImpl
import com.roamyhub.android.core.data.repository.ConfigRepositoryImpl
import com.roamyhub.android.core.data.repository.DeviceRepositoryImpl
import com.roamyhub.android.core.data.repository.ESimRepositoryImpl
import com.roamyhub.android.core.data.repository.OrderRepositoryImpl
import com.roamyhub.android.core.data.repository.PaymentRepositoryImpl
import com.roamyhub.android.core.data.repository.PlanRepositoryImpl
import com.roamyhub.android.core.data.repository.ProfileRepositoryImpl
import com.roamyhub.android.core.data.repository.RewardRepositoryImpl
import com.roamyhub.android.core.data.repository.SupportRepositoryImpl
import com.roamyhub.android.core.domain.repository.AuthRepository
import com.roamyhub.android.core.domain.repository.CheckoutRepository
import com.roamyhub.android.core.domain.repository.ConfigRepository
import com.roamyhub.android.core.domain.repository.DeviceRepository
import com.roamyhub.android.core.domain.repository.ESimRepository
import com.roamyhub.android.core.domain.repository.OrderRepository
import com.roamyhub.android.core.domain.repository.PaymentRepository
import com.roamyhub.android.core.domain.repository.PlanRepository
import com.roamyhub.android.core.domain.repository.ProfileRepository
import com.roamyhub.android.core.domain.repository.RewardRepository
import com.roamyhub.android.core.domain.repository.SupportRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Hilt module that binds repository interfaces to their implementations.
 *
 * This module is installed in the SingletonComponent, making all repositories
 * available as singletons throughout the application lifecycle.
 */
@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    @Singleton
    abstract fun bindAuthRepository(
        authRepositoryImpl: AuthRepositoryImpl
    ): AuthRepository

    @Binds
    @Singleton
    abstract fun bindPlanRepository(
        planRepositoryImpl: PlanRepositoryImpl
    ): PlanRepository

    @Binds
    @Singleton
    abstract fun bindESimRepository(
        eSimRepositoryImpl: ESimRepositoryImpl
    ): ESimRepository

    @Binds
    @Singleton
    abstract fun bindCheckoutRepository(
        checkoutRepositoryImpl: CheckoutRepositoryImpl
    ): CheckoutRepository

    @Binds
    @Singleton
    abstract fun bindOrderRepository(
        orderRepositoryImpl: OrderRepositoryImpl
    ): OrderRepository

    @Binds
    @Singleton
    abstract fun bindPaymentRepository(
        paymentRepositoryImpl: PaymentRepositoryImpl
    ): PaymentRepository

    @Binds
    @Singleton
    abstract fun bindRewardRepository(
        rewardRepositoryImpl: RewardRepositoryImpl
    ): RewardRepository

    @Binds
    @Singleton
    abstract fun bindProfileRepository(
        profileRepositoryImpl: ProfileRepositoryImpl
    ): ProfileRepository

    @Binds
    @Singleton
    abstract fun bindSupportRepository(
        supportRepositoryImpl: SupportRepositoryImpl
    ): SupportRepository

    @Binds
    @Singleton
    abstract fun bindDeviceRepository(
        deviceRepositoryImpl: DeviceRepositoryImpl
    ): DeviceRepository

    @Binds
    @Singleton
    abstract fun bindConfigRepository(
        configRepositoryImpl: ConfigRepositoryImpl
    ): ConfigRepository
}
