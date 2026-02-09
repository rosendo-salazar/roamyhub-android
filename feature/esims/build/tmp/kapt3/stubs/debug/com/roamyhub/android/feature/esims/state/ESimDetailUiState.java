package com.roamyhub.android.feature.esims.state;

/**
 * UI state for eSIM detail screen
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003JA\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010!\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020\u000fH\u00d6\u0001J\t\u0010$\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u000b\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\rR\u0011\u0010\u0018\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\rR\u0011\u0010\u0019\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\rR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\rR\u0011\u0010\u001a\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\r\u00a8\u0006%"}, d2 = {"Lcom/roamyhub/android/feature/esims/state/ESimDetailUiState;", "", "esim", "Lcom/roamyhub/android/core/domain/model/esim/ESim;", "isLoading", "", "error", "", "isDeleting", "deleteError", "(Lcom/roamyhub/android/core/domain/model/esim/ESim;ZLjava/lang/String;ZLjava/lang/String;)V", "canDelete", "getCanDelete", "()Z", "dataRemainingPercentage", "", "getDataRemainingPercentage", "()I", "getDeleteError", "()Ljava/lang/String;", "getError", "getEsim", "()Lcom/roamyhub/android/core/domain/model/esim/ESim;", "isActiveESim", "isDataCritical", "isDataWarning", "isExpired", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "esims_debug"})
public final class ESimDetailUiState {
    @org.jetbrains.annotations.Nullable()
    private final com.roamyhub.android.core.domain.model.esim.ESim esim = null;
    private final boolean isLoading = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String error = null;
    private final boolean isDeleting = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String deleteError = null;
    
    public ESimDetailUiState(@org.jetbrains.annotations.Nullable()
    com.roamyhub.android.core.domain.model.esim.ESim esim, boolean isLoading, @org.jetbrains.annotations.Nullable()
    java.lang.String error, boolean isDeleting, @org.jetbrains.annotations.Nullable()
    java.lang.String deleteError) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.roamyhub.android.core.domain.model.esim.ESim getEsim() {
        return null;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getError() {
        return null;
    }
    
    public final boolean isDeleting() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeleteError() {
        return null;
    }
    
    public final boolean getCanDelete() {
        return false;
    }
    
    public final boolean isExpired() {
        return false;
    }
    
    public final int getDataRemainingPercentage() {
        return 0;
    }
    
    public final boolean isActiveESim() {
        return false;
    }
    
    public final boolean isDataCritical() {
        return false;
    }
    
    public final boolean isDataWarning() {
        return false;
    }
    
    public ESimDetailUiState() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.roamyhub.android.core.domain.model.esim.ESim component1() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.roamyhub.android.feature.esims.state.ESimDetailUiState copy(@org.jetbrains.annotations.Nullable()
    com.roamyhub.android.core.domain.model.esim.ESim esim, boolean isLoading, @org.jetbrains.annotations.Nullable()
    java.lang.String error, boolean isDeleting, @org.jetbrains.annotations.Nullable()
    java.lang.String deleteError) {
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