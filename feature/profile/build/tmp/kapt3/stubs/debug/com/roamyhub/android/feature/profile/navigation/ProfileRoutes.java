package com.roamyhub.android.feature.profile.navigation;

/**
 * Navigation routes for profile feature
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/roamyhub/android/feature/profile/navigation/ProfileRoutes;", "", "()V", "CREATE_TICKET", "", "DELETE_ACCOUNT", "DEVICES", "EDIT_PROFILE", "FAQ", "ORDERS", "ORDER_DETAIL", "PROFILE", "REWARDS", "SETTINGS", "SUPPORT", "TICKET_DETAIL", "orderDetail", "orderId", "ticketDetail", "ticketId", "profile_debug"})
public final class ProfileRoutes {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PROFILE = "profile";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EDIT_PROFILE = "profile/edit";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ORDERS = "profile/orders";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ORDER_DETAIL = "profile/orders/{orderId}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REWARDS = "profile/rewards";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SUPPORT = "profile/support";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CREATE_TICKET = "profile/support/create";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TICKET_DETAIL = "profile/support/{ticketId}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEVICES = "profile/devices";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FAQ = "profile/faq";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SETTINGS = "profile/settings";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DELETE_ACCOUNT = "profile/settings/delete-account";
    @org.jetbrains.annotations.NotNull()
    public static final com.roamyhub.android.feature.profile.navigation.ProfileRoutes INSTANCE = null;
    
    private ProfileRoutes() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String orderDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String ticketDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String ticketId) {
        return null;
    }
}