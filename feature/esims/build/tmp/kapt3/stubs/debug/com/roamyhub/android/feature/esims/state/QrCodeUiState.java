package com.roamyhub.android.feature.esims.state;

/**
 * UI state for QR code screen
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u00c6\u0003J7\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0007H\u00d6\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001f"}, d2 = {"Lcom/roamyhub/android/feature/esims/state/QrCodeUiState;", "", "qrCodeData", "Lcom/roamyhub/android/core/domain/model/esim/QrCodeData;", "isLoading", "", "error", "", "copiedField", "Lcom/roamyhub/android/feature/esims/state/QrCodeUiState$CopiedField;", "(Lcom/roamyhub/android/core/domain/model/esim/QrCodeData;ZLjava/lang/String;Lcom/roamyhub/android/feature/esims/state/QrCodeUiState$CopiedField;)V", "getCopiedField", "()Lcom/roamyhub/android/feature/esims/state/QrCodeUiState$CopiedField;", "getError", "()Ljava/lang/String;", "hasValidQrCode", "getHasValidQrCode", "()Z", "getQrCodeData", "()Lcom/roamyhub/android/core/domain/model/esim/QrCodeData;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "CopiedField", "esims_debug"})
public final class QrCodeUiState {
    @org.jetbrains.annotations.Nullable()
    private final com.roamyhub.android.core.domain.model.esim.QrCodeData qrCodeData = null;
    private final boolean isLoading = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String error = null;
    @org.jetbrains.annotations.Nullable()
    private final com.roamyhub.android.feature.esims.state.QrCodeUiState.CopiedField copiedField = null;
    
    public QrCodeUiState(@org.jetbrains.annotations.Nullable()
    com.roamyhub.android.core.domain.model.esim.QrCodeData qrCodeData, boolean isLoading, @org.jetbrains.annotations.Nullable()
    java.lang.String error, @org.jetbrains.annotations.Nullable()
    com.roamyhub.android.feature.esims.state.QrCodeUiState.CopiedField copiedField) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.roamyhub.android.core.domain.model.esim.QrCodeData getQrCodeData() {
        return null;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getError() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.roamyhub.android.feature.esims.state.QrCodeUiState.CopiedField getCopiedField() {
        return null;
    }
    
    public final boolean getHasValidQrCode() {
        return false;
    }
    
    public QrCodeUiState() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.roamyhub.android.core.domain.model.esim.QrCodeData component1() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.roamyhub.android.feature.esims.state.QrCodeUiState.CopiedField component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.roamyhub.android.feature.esims.state.QrCodeUiState copy(@org.jetbrains.annotations.Nullable()
    com.roamyhub.android.core.domain.model.esim.QrCodeData qrCodeData, boolean isLoading, @org.jetbrains.annotations.Nullable()
    java.lang.String error, @org.jetbrains.annotations.Nullable()
    com.roamyhub.android.feature.esims.state.QrCodeUiState.CopiedField copiedField) {
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
    
    /**
     * Enum for tracking which field was copied
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/roamyhub/android/feature/esims/state/QrCodeUiState$CopiedField;", "", "(Ljava/lang/String;I)V", "SMDP_ADDRESS", "ACTIVATION_CODE", "FULL_STRING", "esims_debug"})
    public static enum CopiedField {
        /*public static final*/ SMDP_ADDRESS /* = new SMDP_ADDRESS() */,
        /*public static final*/ ACTIVATION_CODE /* = new ACTIVATION_CODE() */,
        /*public static final*/ FULL_STRING /* = new FULL_STRING() */;
        
        CopiedField() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.roamyhub.android.feature.esims.state.QrCodeUiState.CopiedField> getEntries() {
            return null;
        }
    }
}