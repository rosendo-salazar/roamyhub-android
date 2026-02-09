package com.roamyhub.android.core.data.di

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import com.roamyhub.android.core.data.local.PreferencesManager
import com.roamyhub.android.core.data.local.TokenManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Extension property for DataStore Preferences
 */
private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "roamyhub_preferences")

/**
 * Hilt module that provides DataStore and related managers.
 *
 * Provides:
 * - DataStore<Preferences> for persistent key-value storage
 * - PreferencesManager for managing app preferences
 * - TokenManager for Firebase token caching and refresh
 */
@Module
@InstallIn(SingletonComponent::class)
object DataStoreModule {

    @Provides
    @Singleton
    fun provideDataStore(
        @ApplicationContext context: Context
    ): DataStore<Preferences> = context.dataStore

    @Provides
    @Singleton
    fun providePreferencesManager(
        dataStore: DataStore<Preferences>
    ): PreferencesManager = PreferencesManager(dataStore)

    @Provides
    @Singleton
    fun provideTokenManager(): TokenManager = TokenManager()
}
