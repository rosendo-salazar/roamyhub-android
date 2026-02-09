package com.roamyhub.android.core.network.di;

/**
 * Hilt module providing networking dependencies
 */
@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0007J \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010#\u001a\u00020$2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010%\u001a\u00020&2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\'\u001a\u00020(2\u0006\u0010\t\u001a\u00020\nH\u0007J \u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\fH\u0007J\u0010\u0010-\u001a\u00020.2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010/\u001a\u0002002\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/roamyhub/android/core/network/di/NetworkModule;", "", "()V", "CONNECT_TIMEOUT_SECONDS", "", "READ_TIMEOUT_SECONDS", "WRITE_TIMEOUT_SECONDS", "provideAuthApiService", "Lcom/roamyhub/android/core/network/api/AuthApiService;", "retrofit", "Lretrofit2/Retrofit;", "provideBaseUrl", "", "provideBrowseApiService", "Lcom/roamyhub/android/core/network/api/BrowseApiService;", "provideCheckoutApiService", "Lcom/roamyhub/android/core/network/api/CheckoutApiService;", "provideESimApiService", "Lcom/roamyhub/android/core/network/api/ESimApiService;", "provideFirebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "provideJson", "Lkotlinx/serialization/json/Json;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "authInterceptor", "Lcom/roamyhub/android/core/network/interceptor/AuthInterceptor;", "connectivityInterceptor", "Lcom/roamyhub/android/core/network/interceptor/ConnectivityInterceptor;", "loggingInterceptorFactory", "Lcom/roamyhub/android/core/network/interceptor/LoggingInterceptorFactory;", "provideOrderApiService", "Lcom/roamyhub/android/core/network/api/OrderApiService;", "providePaymentApiService", "Lcom/roamyhub/android/core/network/api/PaymentApiService;", "providePlanApiService", "Lcom/roamyhub/android/core/network/api/PlanApiService;", "provideProfileApiService", "Lcom/roamyhub/android/core/network/api/ProfileApiService;", "providePublicApiService", "Lcom/roamyhub/android/core/network/api/PublicApiService;", "provideRetrofit", "okHttpClient", "json", "baseUrl", "provideRewardApiService", "Lcom/roamyhub/android/core/network/api/RewardApiService;", "provideSupportApiService", "Lcom/roamyhub/android/core/network/api/SupportApiService;", "network_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class NetworkModule {
    private static final long CONNECT_TIMEOUT_SECONDS = 30L;
    private static final long READ_TIMEOUT_SECONDS = 30L;
    private static final long WRITE_TIMEOUT_SECONDS = 30L;
    @org.jetbrains.annotations.NotNull()
    public static final com.roamyhub.android.core.network.di.NetworkModule INSTANCE = null;
    
    private NetworkModule() {
        super();
    }
    
    /**
     * Provides the base URL for API requests
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String provideBaseUrl() {
        return null;
    }
    
    /**
     * Provides the JSON serializer with configuration
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.serialization.json.Json provideJson() {
        return null;
    }
    
    /**
     * Provides Firebase Auth instance
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.auth.FirebaseAuth provideFirebaseAuth() {
        return null;
    }
    
    /**
     * Provides OkHttpClient with all interceptors
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.OkHttpClient provideOkHttpClient(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.network.interceptor.AuthInterceptor authInterceptor, @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.network.interceptor.ConnectivityInterceptor connectivityInterceptor, @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.network.interceptor.LoggingInterceptorFactory loggingInterceptorFactory) {
        return null;
    }
    
    /**
     * Provides Retrofit instance
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @kotlin.OptIn(markerClass = {kotlinx.serialization.ExperimentalSerializationApi.class})
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.json.Json json, @org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl) {
        return null;
    }
    
    /**
     * Provides AuthApiService
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.roamyhub.android.core.network.api.AuthApiService provideAuthApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    /**
     * Provides PlanApiService
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.roamyhub.android.core.network.api.PlanApiService providePlanApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    /**
     * Provides BrowseApiService
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.roamyhub.android.core.network.api.BrowseApiService provideBrowseApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    /**
     * Provides ESimApiService
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.roamyhub.android.core.network.api.ESimApiService provideESimApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    /**
     * Provides CheckoutApiService
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.roamyhub.android.core.network.api.CheckoutApiService provideCheckoutApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    /**
     * Provides PaymentApiService
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.roamyhub.android.core.network.api.PaymentApiService providePaymentApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    /**
     * Provides OrderApiService
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.roamyhub.android.core.network.api.OrderApiService provideOrderApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    /**
     * Provides RewardApiService
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.roamyhub.android.core.network.api.RewardApiService provideRewardApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    /**
     * Provides ProfileApiService
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.roamyhub.android.core.network.api.ProfileApiService provideProfileApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    /**
     * Provides SupportApiService
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.roamyhub.android.core.network.api.SupportApiService provideSupportApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    /**
     * Provides PublicApiService
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.roamyhub.android.core.network.api.PublicApiService providePublicApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
}