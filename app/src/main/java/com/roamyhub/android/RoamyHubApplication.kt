package com.roamyhub.android

import android.app.Application
import com.google.firebase.Firebase
import com.google.firebase.initialize
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

/**
 * RoamyHub Android Application class
 *
 * Initializes:
 * - Hilt for dependency injection
 * - Firebase services
 * - Timber for logging
 */
@HiltAndroidApp
class RoamyHubApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // Initialize Firebase
        Firebase.initialize(this)

        // Initialize Timber for logging
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
            Timber.d("RoamyHub Application started in DEBUG mode")
        } else {
            // In production, you might want to plant a custom tree for Crashlytics
            Timber.d("RoamyHub Application started in RELEASE mode")
        }

        Timber.d("API Base URL: ${BuildConfig.API_BASE_URL}")
    }
}
