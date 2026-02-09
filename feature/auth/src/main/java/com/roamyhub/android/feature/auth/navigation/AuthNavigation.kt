package com.roamyhub.android.feature.auth.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.roamyhub.android.feature.auth.ui.screens.ForgotPasswordScreen
import com.roamyhub.android.feature.auth.ui.screens.LoginScreen
import com.roamyhub.android.feature.auth.ui.screens.SignupScreen
import com.roamyhub.android.feature.auth.ui.screens.VerificationScreen
import com.roamyhub.android.feature.auth.viewmodel.ForgotPasswordViewModel
import com.roamyhub.android.feature.auth.viewmodel.LoginViewModel
import com.roamyhub.android.feature.auth.viewmodel.SignupViewModel

/**
 * Authentication navigation routes
 */
sealed class AuthRoute(val route: String) {
    data object Login : AuthRoute("auth/login")
    data object Signup : AuthRoute("auth/signup")
    data object ForgotPassword : AuthRoute("auth/forgot_password")
    data class Verification(val email: String) : AuthRoute("auth/verification/{email}") {
        companion object {
            const val ROUTE = "auth/verification/{email}"
            fun createRoute(email: String) = "auth/verification/$email"
        }
    }

    companion object {
        const val GRAPH = "auth_graph"
    }
}

/**
 * Extension function to add authentication navigation graph
 *
 * @param navController NavHostController for navigation
 * @param onNavigateToHome Callback when user successfully authenticates
 */
fun NavGraphBuilder.authNavGraph(
    navController: NavHostController,
    onNavigateToHome: () -> Unit
) {
    navigation(
        startDestination = AuthRoute.Login.route,
        route = AuthRoute.GRAPH
    ) {
        composable(AuthRoute.Login.route) {
            val viewModel: LoginViewModel = hiltViewModel()
            LoginScreen(
                viewModel = viewModel,
                onNavigateToSignup = {
                    navController.navigate(AuthRoute.Signup.route)
                },
                onNavigateToForgotPassword = {
                    navController.navigate(AuthRoute.ForgotPassword.route)
                },
                onNavigateToHome = onNavigateToHome
            )
        }

        composable(AuthRoute.Signup.route) {
            val viewModel: SignupViewModel = hiltViewModel()
            SignupScreen(
                viewModel = viewModel,
                onNavigateToLogin = {
                    navController.popBackStack()
                },
                onNavigateToVerification = { email ->
                    navController.navigate(AuthRoute.Verification.createRoute(email)) {
                        popUpTo(AuthRoute.Login.route) { inclusive = false }
                    }
                }
            )
        }

        composable(AuthRoute.ForgotPassword.route) {
            val viewModel: ForgotPasswordViewModel = hiltViewModel()
            ForgotPasswordScreen(
                viewModel = viewModel,
                onNavigateBack = {
                    navController.popBackStack()
                }
            )
        }

        composable(AuthRoute.Verification.ROUTE) { backStackEntry ->
            val email = backStackEntry.arguments?.getString("email") ?: ""
            VerificationScreen(
                email = email,
                onNavigateToLogin = {
                    navController.popBackStack(AuthRoute.Login.route, inclusive = false)
                }
            )
        }
    }
}
