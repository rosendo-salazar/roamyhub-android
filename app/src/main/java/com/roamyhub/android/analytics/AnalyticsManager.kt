package com.roamyhub.android.analytics

/**
 * Analytics manager interface for tracking events and user properties
 */
interface AnalyticsManager {
    /**
     * Log an analytics event
     * @param event The event name
     * @param params Optional parameters for the event
     */
    fun logEvent(event: String, params: Map<String, Any?>? = null)

    /**
     * Set the user ID for analytics
     * @param userId The user ID, or null to clear
     */
    fun setUserId(userId: String?)

    /**
     * Set a user property
     * @param property The property name
     * @param value The property value
     */
    fun setUserProperty(property: String, value: String)
}
