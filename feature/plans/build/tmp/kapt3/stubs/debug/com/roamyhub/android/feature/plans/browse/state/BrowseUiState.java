package com.roamyhub.android.feature.plans.browse.state;

/**
 * UI state for the Browse screen
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\u0011J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010(\u001a\u00020\nH\u00c6\u0003J\t\u0010)\u001a\u00020\fH\u00c6\u0003J\t\u0010*\u001a\u00020\u000eH\u00c6\u0003J\t\u0010+\u001a\u00020\u000eH\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\fH\u00c6\u0003Ji\u0010-\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\fH\u00c6\u0001J\u0013\u0010.\u001a\u00020\u000e2\b\u0010/\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00100\u001a\u00020\nH\u00d6\u0001J\t\u00101\u001a\u00020\fH\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b$\u0010\u001e\u00a8\u00062"}, d2 = {"Lcom/roamyhub/android/feature/plans/browse/state/BrowseUiState;", "", "countries", "", "Lcom/roamyhub/android/core/domain/model/plan/CountrySummary;", "regions", "Lcom/roamyhub/android/core/domain/model/plan/RegionSummary;", "globalSummary", "Lcom/roamyhub/android/core/domain/model/plan/GlobalSummary;", "selectedTab", "", "searchQuery", "", "isLoading", "", "isRefreshing", "error", "(Ljava/util/List;Ljava/util/List;Lcom/roamyhub/android/core/domain/model/plan/GlobalSummary;ILjava/lang/String;ZZLjava/lang/String;)V", "getCountries", "()Ljava/util/List;", "getError", "()Ljava/lang/String;", "filteredCountries", "getFilteredCountries", "filteredRegions", "getFilteredRegions", "getGlobalSummary", "()Lcom/roamyhub/android/core/domain/model/plan/GlobalSummary;", "hasContent", "getHasContent", "()Z", "getRegions", "getSearchQuery", "getSelectedTab", "()I", "showEmptyState", "getShowEmptyState", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "plans_debug"})
public final class BrowseUiState {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.roamyhub.android.core.domain.model.plan.CountrySummary> countries = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.roamyhub.android.core.domain.model.plan.RegionSummary> regions = null;
    @org.jetbrains.annotations.Nullable()
    private final com.roamyhub.android.core.domain.model.plan.GlobalSummary globalSummary = null;
    private final int selectedTab = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String searchQuery = null;
    private final boolean isLoading = false;
    private final boolean isRefreshing = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String error = null;
    
    public BrowseUiState(@org.jetbrains.annotations.NotNull()
    java.util.List<com.roamyhub.android.core.domain.model.plan.CountrySummary> countries, @org.jetbrains.annotations.NotNull()
    java.util.List<com.roamyhub.android.core.domain.model.plan.RegionSummary> regions, @org.jetbrains.annotations.Nullable()
    com.roamyhub.android.core.domain.model.plan.GlobalSummary globalSummary, int selectedTab, @org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery, boolean isLoading, boolean isRefreshing, @org.jetbrains.annotations.Nullable()
    java.lang.String error) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.roamyhub.android.core.domain.model.plan.CountrySummary> getCountries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.roamyhub.android.core.domain.model.plan.RegionSummary> getRegions() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.roamyhub.android.core.domain.model.plan.GlobalSummary getGlobalSummary() {
        return null;
    }
    
    public final int getSelectedTab() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSearchQuery() {
        return null;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public final boolean isRefreshing() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.roamyhub.android.core.domain.model.plan.CountrySummary> getFilteredCountries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.roamyhub.android.core.domain.model.plan.RegionSummary> getFilteredRegions() {
        return null;
    }
    
    public final boolean getHasContent() {
        return false;
    }
    
    public final boolean getShowEmptyState() {
        return false;
    }
    
    public BrowseUiState() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.roamyhub.android.core.domain.model.plan.CountrySummary> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.roamyhub.android.core.domain.model.plan.RegionSummary> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.roamyhub.android.core.domain.model.plan.GlobalSummary component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean component7() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.roamyhub.android.feature.plans.browse.state.BrowseUiState copy(@org.jetbrains.annotations.NotNull()
    java.util.List<com.roamyhub.android.core.domain.model.plan.CountrySummary> countries, @org.jetbrains.annotations.NotNull()
    java.util.List<com.roamyhub.android.core.domain.model.plan.RegionSummary> regions, @org.jetbrains.annotations.Nullable()
    com.roamyhub.android.core.domain.model.plan.GlobalSummary globalSummary, int selectedTab, @org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery, boolean isLoading, boolean isRefreshing, @org.jetbrains.annotations.Nullable()
    java.lang.String error) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}