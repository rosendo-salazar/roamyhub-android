package com.roamyhub.android.core.data.repository;

/**
 * Implementation of PlanRepository.
 *
 * Handles retrieval of eSIM plans from the backend API.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0096@\u00a2\u0006\u0002\u0010\u000bJ\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0002\u0010\u0010J\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\bH\u0096@\u00a2\u0006\u0002\u0010\u000bJ\"\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\t0\b2\u0006\u0010\u0014\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0002\u0010\u0010J$\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\t0\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000fH\u0096@\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/roamyhub/android/core/data/repository/PlanRepositoryImpl;", "Lcom/roamyhub/android/core/domain/repository/PlanRepository;", "planApiService", "Lcom/roamyhub/android/core/network/api/PlanApiService;", "browseApiService", "Lcom/roamyhub/android/core/network/api/BrowseApiService;", "(Lcom/roamyhub/android/core/network/api/PlanApiService;Lcom/roamyhub/android/core/network/api/BrowseApiService;)V", "getGlobalPlans", "Lcom/roamyhub/android/core/common/result/Resource;", "", "Lcom/roamyhub/android/core/domain/model/plan/GlobalSummary;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPlanById", "Lcom/roamyhub/android/core/domain/model/plan/Plan;", "planId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPlans", "getPlansByCountry", "Lcom/roamyhub/android/core/domain/model/plan/CountrySummary;", "countryIso", "getPlansByRegion", "Lcom/roamyhub/android/core/domain/model/plan/RegionSummary;", "regionKey", "Companion", "data_release"})
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/roamyhub/android/core/data/repository/PlanRepositoryImpl$Companion;", "", "()V", "TAG", "", "data_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}