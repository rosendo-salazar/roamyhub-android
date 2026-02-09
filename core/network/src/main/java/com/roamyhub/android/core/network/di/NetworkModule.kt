package com.roamyhub.android.core.network.di

import com.google.firebase.auth.FirebaseAuth
import com.roamyhub.android.core.network.BuildConfig
import com.roamyhub.android.core.network.api.AuthApiService
import com.roamyhub.android.core.network.api.BrowseApiService
import com.roamyhub.android.core.network.api.CheckoutApiService
import com.roamyhub.android.core.network.api.ESimApiService
import com.roamyhub.android.core.network.api.OrderApiService
import com.roamyhub.android.core.network.api.PaymentApiService
import com.roamyhub.android.core.network.api.PlanApiService
import com.roamyhub.android.core.network.api.ProfileApiService
import com.roamyhub.android.core.network.api.PublicApiService
import com.roamyhub.android.core.network.api.RewardApiService
import com.roamyhub.android.core.network.api.SupportApiService
import com.roamyhub.android.core.network.interceptor.AuthInterceptor
import com.roamyhub.android.core.network.interceptor.ConnectivityInterceptor
import com.roamyhub.android.core.network.interceptor.LoggingInterceptorFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.kotlinx.serialization.asConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/**
 * Hilt module providing networking dependencies
 */
@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    private const val CONNECT_TIMEOUT_SECONDS = 30L
    private const val READ_TIMEOUT_SECONDS = 30L
    private const val WRITE_TIMEOUT_SECONDS = 30L

    /**
     * Provides the base URL for API requests
     */
    @Provides
    @Singleton
    fun provideBaseUrl(): String = BuildConfig.API_BASE_URL

    /**
     * Provides the JSON serializer with configuration
     */
    @Provides
    @Singleton
    fun provideJson(): Json = Json {
        ignoreUnknownKeys = true
        isLenient = true
        encodeDefaults = true
        prettyPrint = false
        coerceInputValues = true
    }

    /**
     * Provides Firebase Auth instance
     */
    @Provides
    @Singleton
    fun provideFirebaseAuth(): FirebaseAuth = FirebaseAuth.getInstance()

    /**
     * Provides OkHttpClient with all interceptors
     */
    @Provides
    @Singleton
    fun provideOkHttpClient(
        authInterceptor: AuthInterceptor,
        connectivityInterceptor: ConnectivityInterceptor,
        loggingInterceptorFactory: LoggingInterceptorFactory
    ): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(connectivityInterceptor)
            .addInterceptor(authInterceptor)
            .addInterceptor(loggingInterceptorFactory.create(BuildConfig.DEBUG))
            .connectTimeout(CONNECT_TIMEOUT_SECONDS, TimeUnit.SECONDS)
            .readTimeout(READ_TIMEOUT_SECONDS, TimeUnit.SECONDS)
            .writeTimeout(WRITE_TIMEOUT_SECONDS, TimeUnit.SECONDS)
            .retryOnConnectionFailure(true)
            .build()
    }

    /**
     * Provides Retrofit instance
     */
    @OptIn(ExperimentalSerializationApi::class)
    @Provides
    @Singleton
    fun provideRetrofit(
        okHttpClient: OkHttpClient,
        json: Json,
        baseUrl: String
    ): Retrofit {
        val contentType = "application/json".toMediaType()
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(okHttpClient)
            .addConverterFactory(json.asConverterFactory(contentType))
            .build()
    }

    /**
     * Provides AuthApiService
     */
    @Provides
    @Singleton
    fun provideAuthApiService(retrofit: Retrofit): AuthApiService {
        return retrofit.create(AuthApiService::class.java)
    }

    /**
     * Provides PlanApiService
     */
    @Provides
    @Singleton
    fun providePlanApiService(retrofit: Retrofit): PlanApiService {
        return retrofit.create(PlanApiService::class.java)
    }

    /**
     * Provides BrowseApiService
     */
    @Provides
    @Singleton
    fun provideBrowseApiService(retrofit: Retrofit): BrowseApiService {
        return retrofit.create(BrowseApiService::class.java)
    }

    /**
     * Provides ESimApiService
     */
    @Provides
    @Singleton
    fun provideESimApiService(retrofit: Retrofit): ESimApiService {
        return retrofit.create(ESimApiService::class.java)
    }

    /**
     * Provides CheckoutApiService
     */
    @Provides
    @Singleton
    fun provideCheckoutApiService(retrofit: Retrofit): CheckoutApiService {
        return retrofit.create(CheckoutApiService::class.java)
    }

    /**
     * Provides PaymentApiService
     */
    @Provides
    @Singleton
    fun providePaymentApiService(retrofit: Retrofit): PaymentApiService {
        return retrofit.create(PaymentApiService::class.java)
    }

    /**
     * Provides OrderApiService
     */
    @Provides
    @Singleton
    fun provideOrderApiService(retrofit: Retrofit): OrderApiService {
        return retrofit.create(OrderApiService::class.java)
    }

    /**
     * Provides RewardApiService
     */
    @Provides
    @Singleton
    fun provideRewardApiService(retrofit: Retrofit): RewardApiService {
        return retrofit.create(RewardApiService::class.java)
    }

    /**
     * Provides ProfileApiService
     */
    @Provides
    @Singleton
    fun provideProfileApiService(retrofit: Retrofit): ProfileApiService {
        return retrofit.create(ProfileApiService::class.java)
    }

    /**
     * Provides SupportApiService
     */
    @Provides
    @Singleton
    fun provideSupportApiService(retrofit: Retrofit): SupportApiService {
        return retrofit.create(SupportApiService::class.java)
    }

    /**
     * Provides PublicApiService
     */
    @Provides
    @Singleton
    fun providePublicApiService(retrofit: Retrofit): PublicApiService {
        return retrofit.create(PublicApiService::class.java)
    }
}
