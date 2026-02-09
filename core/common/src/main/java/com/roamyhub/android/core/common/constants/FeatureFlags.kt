package com.roamyhub.android.core.common.constants

/**
 * Feature flags for controlling feature availability.
 * Values match iOS app configuration.
 */
object FeatureFlags {
    // Points & Rewards
    const val POINTS_HISTORY_ENABLED = false // OFF - Not implemented yet
    const val REFERRAL_PROGRAM_ENABLED = false // OFF - Not implemented yet

    // Payments
    const val MULTI_CURRENCY_ENABLED = true // ON - Support multiple currencies

    // Notifications
    const val PUSH_NOTIFICATIONS_ENABLED = true // ON - Firebase Cloud Messaging

    // App features
    const val IN_APP_REVIEWS_ENABLED = true // ON - Google Play In-App Review
    const val ESIM_TOP_UP_ENABLED = true // ON - Allow topping up existing eSIMs

    // Social Auth
    const val GOOGLE_SIGN_IN_ENABLED = true // ON - Google Sign-In via Credential Manager
    const val APPLE_SIGN_IN_ENABLED = false // OFF - Not available on Android

    // Debug/Development
    const val DEBUG_LOGGING_ENABLED = true // Enable verbose logging in debug builds
    const val MOCK_DATA_ENABLED = false // Use mock data instead of API calls (for testing)
}
