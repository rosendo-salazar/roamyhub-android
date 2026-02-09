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
 * Handles navigation between auth and main screens based on authentication state
 */
@Composable
fun RoamyNavHost(
    modifier: Modifier = Modifier,
    viewModel: MainViewModel = hiltViewModel()
) {
    val navController = rememberNavController()
    val authState by viewModel.authState.collectAsState()

    when (authState) {
        is AuthState.Loading -> {
            LoadingIndicator()
        }
        is AuthState.Unauthenticated -> {
            NavHost(
                navController = navController,
                startDestination = "auth_graph",
                modifier = modifier
            ) {
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
        is AuthState.Authenticated -> {
            NavHost(
                navController = navController,
                startDestination = Route.Main.Graph.route,
                modifier = modifier
            ) {
                composable(Route.Main.Graph.route) {
                    MainScreen(
                        onNavigateToAuth = {
                            viewModel.signOut()
                        }
                    )
                }
            }
        }
    }
}
