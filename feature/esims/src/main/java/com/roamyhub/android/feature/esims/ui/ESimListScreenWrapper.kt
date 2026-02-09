package com.roamyhub.android.feature.esims.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.roamyhub.android.core.domain.model.user.AuthState
import com.roamyhub.android.core.ui.components.GuestPromptView
import com.roamyhub.android.feature.esims.navigation.ESimRoutes
import com.roamyhub.android.feature.esims.navigation.esimNavGraph

/**
 * Wrapper for eSIM list screen that handles authentication state
 * Shows guest prompt if not authenticated, otherwise shows normal eSIM list
 */
@Composable
fun ESimListScreenWrapper(
    authState: AuthState,
    onNavigateToAuth: () -> Unit,
    modifier: Modifier = Modifier
) {
    if (authState is AuthState.Authenticated) {
        // Show normal eSIM list screen
        val navController = rememberNavController()
        NavHost(
            navController = navController,
            startDestination = ESimRoutes.LIST,
            modifier = modifier
        ) {
            esimNavGraph(navController)
        }
    } else {
        // Show guest prompt
        GuestPromptView(
            title = "Sign in to view your eSIMs",
            message = "Create an account or sign in to manage your eSIM plans and access your QR codes.",
            benefits = listOf(
                "View all your active eSIMs",
                "Access QR codes anytime",
                "Track data usage",
                "Manage your plans"
            ),
            onGetStarted = onNavigateToAuth,
            modifier = modifier
        )
    }
}
