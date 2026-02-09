package com.roamyhub.android.analytics

/**
 * Analytics event names
 * Keep consistent with iOS app for cross-platform tracking
 */
object AnalyticsEvents {
    // Auth events
    const val LOGIN = "login"
    const val SIGNUP = "sign_up"
    const val LOGOUT = "logout"
    const val PASSWORD_RESET = "password_reset"
    const val GOOGLE_SIGN_IN = "google_sign_in"

    // Plans events
    const val PLAN_VIEWED = "plan_viewed"
    const val PLAN_SEARCHED = "plan_searched"
    const val COUNTRY_VIEWED = "country_viewed"
    const val REGION_VIEWED = "region_viewed"
    const val PLANS_FILTERED = "plans_filtered"

    // Purchase events
    const val CHECKOUT_STARTED = "checkout_started"
    const val CHECKOUT_PAYMENT_INFO_ENTERED = "checkout_payment_info_entered"
    const val PURCHASE_COMPLETED = "purchase_completed"
    const val PURCHASE_FAILED = "purchase_failed"
    const val POINTS_REDEEMED = "points_redeemed"

    // eSIM events
    const val ESIM_VIEWED = "esim_viewed"
    const val ESIM_LIST_VIEWED = "esim_list_viewed"
    const val QR_CODE_VIEWED = "qr_code_viewed"
    const val QR_CODE_DOWNLOADED = "qr_code_downloaded"
    const val ESIM_DELETED = "esim_deleted"
    const val INSTALLATION_GUIDE_VIEWED = "installation_guide_viewed"

    // Support events
    const val TICKET_CREATED = "ticket_created"
    const val TICKET_VIEWED = "ticket_viewed"
    const val TICKET_REPLIED = "ticket_replied"
    const val SUPPORT_LIST_VIEWED = "support_list_viewed"

    // Profile events
    const val PROFILE_VIEWED = "profile_viewed"
    const val PROFILE_UPDATED = "profile_updated"
    const val SETTINGS_VIEWED = "settings_viewed"
    const val SETTINGS_CHANGED = "settings_changed"
    const val ORDERS_VIEWED = "orders_viewed"
    const val ORDER_DETAIL_VIEWED = "order_detail_viewed"
    const val REWARDS_VIEWED = "rewards_viewed"
    const val DEVICES_VIEWED = "devices_viewed"
    const val DEVICE_DELETED = "device_deleted"

    // App events
    const val APP_OPENED = "app_opened"
    const val SCREEN_VIEWED = "screen_viewed"
    const val ERROR_OCCURRED = "error_occurred"
}
