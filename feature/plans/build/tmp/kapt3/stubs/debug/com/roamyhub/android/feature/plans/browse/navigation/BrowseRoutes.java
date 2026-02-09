package com.roamyhub.android.feature.plans.browse.navigation;

/**
 * Navigation routes for the Browse/Plans feature
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/roamyhub/android/feature/plans/browse/navigation/BrowseRoutes;", "", "()V", "BROWSE_HOME", "", "COUNTRY_DETAIL", "GLOBAL_PLANS", "PLAN_DETAIL", "REGION_DETAIL", "SEARCH", "countryDetail", "countryIso", "planDetail", "planId", "regionDetail", "regionKey", "plans_debug"})
public final class BrowseRoutes {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BROWSE_HOME = "browse_home";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SEARCH = "browse_search";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COUNTRY_DETAIL = "browse_country/{countryIso}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REGION_DETAIL = "browse_region/{regionKey}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GLOBAL_PLANS = "browse_global";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLAN_DETAIL = "browse_plan/{planId}";
    @org.jetbrains.annotations.NotNull()
    public static final com.roamyhub.android.feature.plans.browse.navigation.BrowseRoutes INSTANCE = null;
    
    private BrowseRoutes() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String countryDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String countryIso) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String regionDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String regionKey) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String planDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String planId) {
        return null;
    }
}