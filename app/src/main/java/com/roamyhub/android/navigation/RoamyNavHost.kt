package com.roamyhub.android.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.roamyhub.android.core.domain.model.user.AuthState
import com.roamyhub.android.core.ui.components.LoadingIndicator
import com.roamyhub.android.feature.auth.navigation.authNavGraph
import com.roamyhub.android.ui.MainScreen
import com.roamyhub.android.viewmodel.MainViewModel

/**
 * Root navigation host for the RoamyHub app
 * Allows guest browsing with authentication for specific features
 */
@Composable
fun RoamyNavHost(
    modifier: Modifier = Modifier,
    initialDeepLink: String? = null,
    viewModel: MainViewModel = hiltViewModel()
) {
    val navController = rememberNavController()
    val authState by viewModel.authState.collectAsState()

    // Show loading indicator during initial auth check
    if (authState is AuthState.Loading) {
        LoadingIndicator()
        return
    }

    // Always show main app - no auth gate
    NavHost(
        navController = navController,
        startDestination = Route.Main.Graph.route,
        modifier = modifier
    ) {
        // Main app graph - always accessible
        composable(Route.Main.Graph.route) {
            MainScreen(
                initialDeepLink = initialDeepLink,
                onNavigateToAuth = {
                    navController.navigate("auth_graph")
                },
                onSignOut = {
                    viewModel.signOut()
                    // Stay on main screen, but views will show guest content
                }
            )
        }

        // Auth graph - accessible from guest prompts
        authNavGraph(
            navController = navController,
            onNavigateToHome = {
                navController.navigate(Route.Main.Graph.route) {
                    popUpTo("auth_graph") { inclusive = true }
                }
            }
        )
    }
}
