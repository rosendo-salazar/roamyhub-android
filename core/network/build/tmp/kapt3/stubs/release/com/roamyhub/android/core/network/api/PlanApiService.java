package com.roamyhub.android.core.network.api;

/**
 * Retrofit API service for plan endpoints
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\r\u001a\u00020\u00032\b\b\u0001\u0010\u000e\u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lcom/roamyhub/android/core/network/api/PlanApiService;", "", "getGlobalPlans", "Lcom/roamyhub/android/core/network/model/PlansResponseDto;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPlanById", "Lcom/roamyhub/android/core/network/model/PlanResponseDto;", "planId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPlans", "getPlansByCountry", "countryIso", "getPlansByRegion", "regionKey", "network_release"})
public abstract interface PlanApiService {
    
    /**
     * Get all available plans
     */
    @retrofit2.http.GET(value = "plans")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPlans(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.PlansResponseDto> $completion);
    
    /**
     * Get a specific plan by ID
     */
    @retrofit2.http.GET(value = "plans/{id}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPlanById(@retrofit2.http.Path(value = "id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String planId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.PlanResponseDto> $completion);
    
    /**
     * Get plans for a specific country
     */
    @retrofit2.http.GET(value = "plans/country/{iso}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPlansByCountry(@retrofit2.http.Path(value = "iso")
    @org.jetbrains.annotations.NotNull()
    java.lang.String countryIso, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.PlansResponseDto> $completion);
    
    /**
     * Get plans for a specific region
     */
    @retrofit2.http.GET(value = "plans/region/{key}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPlansByRegion(@retrofit2.http.Path(value = "key")
    @org.jetbrains.annotations.NotNull()
    java.lang.String regionKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.PlansResponseDto> $completion);
    
    /**
     * Get global plans
     */
    @retrofit2.http.GET(value = "plans/global")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getGlobalPlans(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.PlansResponseDto> $completion);
}