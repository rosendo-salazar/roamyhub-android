package com.roamyhub.android.core.network.api;

/**
 * Retrofit API service for public endpoints (no auth required)
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/roamyhub/android/core/network/api/PublicApiService;", "", "checkVersion", "Lcom/roamyhub/android/core/network/model/VersionCheckResponseDto;", "currentVersion", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCompatibleDevices", "Lcom/roamyhub/android/core/network/model/CompatibleDevicesResponseDto;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLegalLinks", "Lcom/roamyhub/android/core/network/model/LegalLinksResponseDto;", "searchDevices", "Lcom/roamyhub/android/core/network/model/DeviceSearchResponseDto;", "query", "network_release"})
public abstract interface PublicApiService {
    
    /**
     * Check app version and get update information
     */
    @retrofit2.http.GET(value = "public/version/check")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object checkVersion(@retrofit2.http.Query(value = "currentVersion")
    @org.jetbrains.annotations.NotNull()
    java.lang.String currentVersion, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.VersionCheckResponseDto> $completion);
    
    /**
     * Get list of compatible devices
     */
    @retrofit2.http.GET(value = "public/devices/compatible")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCompatibleDevices(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.CompatibleDevicesResponseDto> $completion);
    
    /**
     * Search for devices by query
     */
    @retrofit2.http.GET(value = "public/devices/search")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object searchDevices(@retrofit2.http.Query(value = "query")
    @org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.DeviceSearchResponseDto> $completion);
    
    /**
     * Get legal document links
     */
    @retrofit2.http.GET(value = "public/config/legal-links")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLegalLinks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.LegalLinksResponseDto> $completion);
}