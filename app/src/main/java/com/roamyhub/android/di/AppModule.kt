package com.roamyhub.android.di

import android.content.Context
import com.google.firebase.analytics.FirebaseAnalytics
import com.roamyhub.android.analytics.AnalyticsManager
import com.roamyhub.android.analytics.FirebaseAnalyticsManager
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Hilt module for app-level dependencies
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideFirebaseAnalytics(@ApplicationContext context: Context): FirebaseAnalytics =
        FirebaseAnalytics.getInstance(context)
}

@Module
@InstallIn(SingletonComponent::class)
abstract class AppBindsModule {

    @Binds
    @Singleton
    abstract fun bindAnalyticsManager(impl: FirebaseAnalyticsManager): AnalyticsManager
}
