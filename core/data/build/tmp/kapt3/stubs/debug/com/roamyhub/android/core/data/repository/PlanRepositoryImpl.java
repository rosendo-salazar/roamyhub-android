package com.roamyhub.android.core.data.repository;

/**
 * Implementation of PlanRepository.
 *
 * Handles retrieval of eSIM plans from the backend API.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00a2\u0006\u0002\u0010\rJ\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\bH\u0096@\u00a2\u0006\u0002\u0010\u0010J\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t0\bH\u0096@\u00a2\u0006\u0002\u0010\u0010J\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\bH\u0096@\u00a2\u0006\u0002\u0010\u0010J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0015\u001a\u00020\fH\u0096@\u00a2\u0006\u0002\u0010\rJ\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0096@\u00a2\u0006\u0002\u0010\u0010J\"\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00a2\u0006\u0002\u0010\rJ$\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\t0\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\fH\u0096@\u00a2\u0006\u0002\u0010\rJ\"\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u001a\u001a\u00020\fH\u0096@\u00a2\u0006\u0002\u0010\rJ\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\t0\bH\u0096@\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/roamyhub/android/core/data/repository/PlanRepositoryImpl;", "Lcom/roamyhub/android/core/domain/repository/PlanRepository;", "planApiService", "Lcom/roamyhub/android/core/network/api/PlanApiService;", "browseApiService", "Lcom/roamyhub/android/core/network/api/BrowseApiService;", "(Lcom/roamyhub/android/core/network/api/PlanApiService;Lcom/roamyhub/android/core/network/api/BrowseApiService;)V", "getCountryPlans", "Lcom/roamyhub/android/core/common/result/Resource;", "", "Lcom/roamyhub/android/core/domain/model/plan/Plan;", "countryIso", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCountrySummaries", "Lcom/roamyhub/android/core/domain/model/plan/CountrySummary;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGlobalPlans", "Lcom/roamyhub/android/core/domain/model/plan/GlobalSummary;", "getGlobalSummary", "getPlanById", "planId", "getPlans", "getPlansByCountry", "getPlansByRegion", "Lcom/roamyhub/android/core/domain/model/plan/RegionSummary;", "regionKey", "getRegionPlans", "getRegionSummaries", "Companion", "data_debug"})
public final class PlanRepositoryImpl implements com.roamyhub.android.core.domain.repository.PlanRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.network.api.PlanApiService planApiService = null;
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.network.api.BrowseApiService browseApiService = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "PlanRepositoryImpl";
    @org.jetbrains.annotations.NotNull()
    public static final com.roamyhub.android.core.data.repository.PlanRepositoryImpl.Companion Companion = null;
    
    @javax.inject.Inject()
    public PlanRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.network.api.PlanApiService planApiService, @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.network.api.BrowseApiService browseApiService) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getPlans(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<? extends java.util.List<com.roamyhub.android.core.domain.model.plan.Plan>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getPlanById(@org.jetbrains.annotations.NotNull()
    java.lang.String planId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<com.roamyhub.android.core.domain.model.plan.Plan>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getPlansByCountry(@org.jetbrains.annotations.NotNull()
    java.lang.String countryIso, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<? extends java.util.List<com.roamyhub.android.core.domain.model.plan.CountrySummary>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getPlansByRegion(@org.jetbrains.annotations.Nullable()
    java.lang.String regionKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<? extends java.util.List<com.roamyhub.android.core.domain.model.plan.RegionSummary>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getGlobalPlans(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<? extends java.util.List<com.roamyhub.android.core.domain.model.plan.GlobalSummary>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCountrySummaries(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<? extends java.util.List<com.roamyhub.android.core.domain.model.plan.CountrySummary>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getRegionSummaries(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<? extends java.util.List<com.roamyhub.android.core.domain.model.plan.RegionSummary>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getGlobalSummary(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<com.roamyhub.android.core.domain.model.plan.GlobalSummary>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCountryPlans(@org.jetbrains.annotations.NotNull()
    java.lang.String countryIso, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<? extends java.util.List<com.roamyhub.android.core.domain.model.plan.Plan>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getRegionPlans(@org.jetbrains.annotations.NotNull()
    java.lang.String regionKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<? extends java.util.List<com.roamyhub.android.core.domain.model.plan.Plan>>> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/roamyhub/android/core/data/repository/PlanRepositoryImpl$Companion;", "", "()V", "TAG", "", "data_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}