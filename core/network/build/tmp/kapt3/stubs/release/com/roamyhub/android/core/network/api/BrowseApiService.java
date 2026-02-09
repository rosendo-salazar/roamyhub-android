package com.roamyhub.android.core.network.api;

/**
 * Retrofit API service for browse/discovery endpoints
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u000b"}, d2 = {"Lcom/roamyhub/android/core/network/api/BrowseApiService;", "", "getCountries", "Lcom/roamyhub/android/core/network/model/CountriesResponseDto;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCountrySummaries", "Lcom/roamyhub/android/core/network/model/CountrySummariesResponseDto;", "getGlobalSummary", "Lcom/roamyhub/android/core/network/model/GlobalSummaryResponseDto;", "getRegionSummaries", "Lcom/roamyhub/android/core/network/model/RegionSummariesResponseDto;", "network_release"})
public abstract interface BrowseApiService {
    
    /**
     * Get all available countries with eSIM coverage
     */
    @retrofit2.http.GET(value = "countries")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCountries(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.CountriesResponseDto> $completion);
    
    /**
     * Get country summaries for browsing
     */
    @retrofit2.http.GET(value = "browse/country-summaries")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCountrySummaries(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.CountrySummariesResponseDto> $completion);
    
    /**
     * Get region summaries for browsing
     */
    @retrofit2.http.GET(value = "browse/region-summaries")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRegionSummaries(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.RegionSummariesResponseDto> $completion);
    
    /**
     * Get global plan summary
     */
    @retrofit2.http.GET(value = "browse/global-summary")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getGlobalSummary(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.GlobalSummaryResponseDto> $completion);
}