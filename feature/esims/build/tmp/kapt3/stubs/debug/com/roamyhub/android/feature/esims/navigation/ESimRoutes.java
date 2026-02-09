package com.roamyhub.android.feature.esims.navigation;

/**
 * Navigation routes for eSIM feature
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/roamyhub/android/feature/esims/navigation/ESimRoutes;", "", "()V", "DETAIL", "", "LIST", "QR_CODE", "detail", "esimId", "qrCode", "esims_debug"})
public final class ESimRoutes {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LIST = "esim_list";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DETAIL = "esim_detail/{esimId}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String QR_CODE = "esim_qr_code/{esimId}";
    @org.jetbrains.annotations.NotNull()
    public static final com.roamyhub.android.feature.esims.navigation.ESimRoutes INSTANCE = null;
    
    private ESimRoutes() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String detail(@org.jetbrains.annotations.NotNull()
    java.lang.String esimId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String qrCode(@org.jetbrains.annotations.NotNull()
    java.lang.String esimId) {
        return null;
    }
}