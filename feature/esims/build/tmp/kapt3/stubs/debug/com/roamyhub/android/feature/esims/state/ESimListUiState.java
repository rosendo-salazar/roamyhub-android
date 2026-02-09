package com.roamyhub.android.feature.esims.state;

/**
 * UI state for eSIM list screen
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\bH\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003JC\u0010 \u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001J\u0013\u0010!\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020$H\u00d6\u0001J\t\u0010%\u001a\u00020\u000bH\u00d6\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0015R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006&"}, d2 = {"Lcom/roamyhub/android/feature/esims/state/ESimListUiState;", "", "esims", "", "Lcom/roamyhub/android/core/domain/model/esim/ESim;", "selectedTab", "Lcom/roamyhub/android/feature/esims/state/ESimTab;", "isLoading", "", "isRefreshing", "error", "", "(Ljava/util/List;Lcom/roamyhub/android/feature/esims/state/ESimTab;ZZLjava/lang/String;)V", "getError", "()Ljava/lang/String;", "getEsims", "()Ljava/util/List;", "filteredList", "getFilteredList", "hasActiveESims", "getHasActiveESims", "()Z", "hasNoESims", "getHasNoESims", "isEmpty", "getSelectedTab", "()Lcom/roamyhub/android/feature/esims/state/ESimTab;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "esims_debug"})
public final class ESimListUiState {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.roamyhub.android.core.domain.model.esim.ESim> esims = null;
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.feature.esims.state.ESimTab selectedTab = null;
    private final boolean isLoading = false;
    private final boolean isRefreshing = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String error = null;
    
    public ESimListUiState(@org.jetbrains.annotations.NotNull()
    java.util.List<com.roamyhub.android.core.domain.model.esim.ESim> esims, @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.feature.esims.state.ESimTab selectedTab, boolean isLoading, boolean isRefreshing, @org.jetbrains.annotations.Nullable()
    java.lang.String error) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.roamyhub.android.core.domain.model.esim.ESim> getEsims() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.roamyhub.android.feature.esims.state.ESimTab getSelectedTab() {
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
    public final java.util.List<com.roamyhub.android.core.domain.model.esim.ESim> getFilteredList() {
        return null;
    }
    
    public final boolean getHasActiveESims() {
        return false;
    }
    
    public final boolean isEmpty() {
        return false;
    }
    
    public final boolean getHasNoESims() {
        return false;
    }
    
    public ESimListUiState() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.roamyhub.android.core.domain.model.esim.ESim> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.roamyhub.android.feature.esims.state.ESimTab component2() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean component4() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.roamyhub.android.feature.esims.state.ESimListUiState copy(@org.jetbrains.annotations.NotNull()
    java.util.List<com.roamyhub.android.core.domain.model.esim.ESim> esims, @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.feature.esims.state.ESimTab selectedTab, boolean isLoading, boolean isRefreshing, @org.jetbrains.annotations.Nullable()
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