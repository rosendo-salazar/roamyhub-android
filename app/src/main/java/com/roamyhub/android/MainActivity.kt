package com.roamyhub.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.roamyhub.android.core.ui.theme.RoamyHubTheme
import com.roamyhub.android.navigation.RoamyNavHost
import dagger.hilt.android.AndroidEntryPoint

/**
 * Main activity for RoamyHub Android app
 *
 * Uses single-activity architecture with Jetpack Compose
 */
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // Install splash screen
        installSplashScreen()

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            RoamyHubTheme {
                RoamyNavHost()
            }
        }
    }
}
