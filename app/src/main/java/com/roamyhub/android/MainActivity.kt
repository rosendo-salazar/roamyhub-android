package com.roamyhub.android

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.roamyhub.android.core.ui.theme.RoamyHubTheme
import com.roamyhub.android.navigation.RoamyNavHost
import com.roamyhub.android.notification.DeepLinkHandler
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

/**
 * Main activity for RoamyHub Android app
 *
 * Uses single-activity architecture with Jetpack Compose
 */
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private var deepLinkRoute by mutableStateOf<String?>(null)

    override fun onCreate(savedInstanceState: Bundle?) {
        // Install splash screen
        installSplashScreen()

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Handle deep link from intent
        handleIntent(intent)

        setContent {
            RoamyHubTheme {
                RoamyNavHost(initialDeepLink = deepLinkRoute)
            }
        }
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        // Handle deep link when app is already running
        handleIntent(intent)
    }

    private fun handleIntent(intent: Intent?) {
        intent?.data?.let { uri ->
            Timber.d("Deep link received: $uri")
            val route = DeepLinkHandler.handleDeepLink(uri)
            if (route != null) {
                deepLinkRoute = route
                Timber.d("Navigating to: $route")
            } else {
                Timber.w("Invalid deep link: $uri")
            }
        }
    }
}
