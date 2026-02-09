package com.roamyhub.android

import android.app.Application
import android.util.Log
import com.google.firebase.Firebase
import com.google.firebase.crashlytics.FirebaseCrashlytics
import com.google.firebase.initialize
import com.roamyhub.android.notification.NotificationChannelManager
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

/**
 * RoamyHub Android Application class
 *
 * Initializes:
 * - Hilt for dependency injection
 * - Firebase services (Analytics, Crashlytics)
 * - Timber for logging
 * - Notification channels
 */
@HiltAndroidApp
class RoamyHubApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // Initialize Firebase
        Firebase.initialize(this)

        // Initialize Firebase Crashlytics
        FirebaseCrashlytics.getInstance().apply {
            setCrashlyticsCollectionEnabled(!BuildConfig.DEBUG)
        }

        // Initialize Timber for logging
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
            Timber.d("RoamyHub Application started in DEBUG mode")
        } else {
            // In production, plant Crashlytics tree for remote logging
            Timber.plant(CrashlyticsTree())
            Timber.d("RoamyHub Application started in RELEASE mode")
        }

        // Create notification channels
        NotificationChannelManager.createChannels(this)

        // Log API base URL if available
        try {
            Timber.d("API Base URL: ${BuildConfig.API_BASE_URL}")
        } catch (e: Exception) {
            Timber.w("API_BASE_URL not configured in BuildConfig")
        }
    }

    /**
     * Timber tree for logging to Firebase Crashlytics
     */
    private class CrashlyticsTree : Timber.Tree() {
        override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
            if (priority == Log.ERROR || priority == Log.WARN) {
                FirebaseCrashlytics.getInstance().log("$tag: $message")
                t?.let { FirebaseCrashlytics.getInstance().recordException(it) }
            }
        }
    }
}
