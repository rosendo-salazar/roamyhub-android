package com.roamyhub.android.feature.plans.home.state;

/**
 * UI state for the Home screen
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lcom/roamyhub/android/feature/plans/home/state/HomeUiState;", "", "Error", "Loading", "Success", "Lcom/roamyhub/android/feature/plans/home/state/HomeUiState$Error;", "Lcom/roamyhub/android/feature/plans/home/state/HomeUiState$Loading;", "Lcom/roamyhub/android/feature/plans/home/state/HomeUiState$Success;", "plans_debug"})
public abstract interface HomeUiState {
    
    /**
     * Error loading home data
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/roamyhub/android/feature/plans/home/state/HomeUiState$Error;", "Lcom/roamyhub/android/feature/plans/home/state/HomeUiState;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "plans_debug"})
    public static final class Error implements com.roamyhub.android.feature.plans.home.state.HomeUiState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String message = null;
        
        public Error(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.roamyhub.android.feature.plans.home.state.HomeUiState.Error copy(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
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
    
    /**
     * Initial loading state
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c7\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/roamyhub/android/feature/plans/home/state/HomeUiState$Loading;", "Lcom/roamyhub/android/feature/plans/home/state/HomeUiState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "plans_debug"})
    public static final class Loading implements com.roamyhub.android.feature.plans.home.state.HomeUiState {
        @org.jetbrains.annotations.NotNull()
        public static final com.roamyhub.android.feature.plans.home.state.HomeUiState.Loading INSTANCE = null;
        
        private Loading() {
            super();
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
    
    /**
     * Successfully loaded home data
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t\u00a8\u0006\u0016"}, d2 = {"Lcom/roamyhub/android/feature/plans/home/state/HomeUiState$Success;", "Lcom/roamyhub/android/feature/plans/home/state/HomeUiState;", "popularCountries", "", "Lcom/roamyhub/android/core/domain/model/plan/CountrySummary;", "regions", "Lcom/roamyhub/android/core/domain/model/plan/RegionSummary;", "(Ljava/util/List;Ljava/util/List;)V", "getPopularCountries", "()Ljava/util/List;", "getRegions", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "plans_debug"})
    public static final class Success implements com.roamyhub.android.feature.plans.home.state.HomeUiState {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.roamyhub.android.core.domain.model.plan.CountrySummary> popularCountries = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.roamyhub.android.core.domain.model.plan.RegionSummary> regions = null;
        
        public Success(@org.jetbrains.annotations.NotNull()
        java.util.List<com.roamyhub.android.core.domain.model.plan.CountrySummary> popularCountries, @org.jetbrains.annotations.NotNull()
        java.util.List<com.roamyhub.android.core.domain.model.plan.RegionSummary> regions) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.roamyhub.android.core.domain.model.plan.CountrySummary> getPopularCountries() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.roamyhub.android.core.domain.model.plan.RegionSummary> getRegions() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.roamyhub.android.core.domain.model.plan.CountrySummary> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.roamyhub.android.core.domain.model.plan.RegionSummary> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.roamyhub.android.feature.plans.home.state.HomeUiState.Success copy(@org.jetbrains.annotations.NotNull()
        java.util.List<com.roamyhub.android.core.domain.model.plan.CountrySummary> popularCountries, @org.jetbrains.annotations.NotNull()
        java.util.List<com.roamyhub.android.core.domain.model.plan.RegionSummary> regions) {
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
}