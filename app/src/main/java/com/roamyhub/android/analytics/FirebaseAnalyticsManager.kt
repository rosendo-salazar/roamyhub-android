package com.roamyhub.android.analytics

import android.os.Bundle
import com.google.firebase.analytics.FirebaseAnalytics
import timber.log.Timber
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Firebase implementation of AnalyticsManager
 * Logs events to Firebase Analytics for tracking user behavior
 */
@Singleton
class FirebaseAnalyticsManager @Inject constructor(
    private val firebaseAnalytics: FirebaseAnalytics
) : AnalyticsManager {

    override fun logEvent(event: String, params: Map<String, Any?>?) {
        try {
            val bundle = Bundle().apply {
                params?.forEach { (key, value) ->
                    when (value) {
                        is String -> putString(key, value)
                        is Int -> putInt(key, value)
                        is Long -> putLong(key, value)
                        is Double -> putDouble(key, value)
                        is Boolean -> putBoolean(key, value)
                        is Float -> putDouble(key, value.toDouble())
                        null -> putString(key, "null")
                        else -> putString(key, value.toString())
                    }
                }
            }

            firebaseAnalytics.logEvent(event, bundle)
            Timber.d("Analytics event logged: $event with params: $params")
        } catch (e: Exception) {
            Timber.e(e, "Failed to log analytics event: $event")
        }
    }

    override fun setUserId(userId: String?) {
        try {
            firebaseAnalytics.setUserId(userId)
            Timber.d("Analytics user ID set: $userId")
        } catch (e: Exception) {
            Timber.e(e, "Failed to set analytics user ID")
        }
    }

    override fun setUserProperty(property: String, value: String) {
        try {
            firebaseAnalytics.setUserProperty(property, value)
            Timber.d("Analytics user property set: $property = $value")
        } catch (e: Exception) {
            Timber.e(e, "Failed to set analytics user property: $property")
        }
    }
}
