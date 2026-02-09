package com.roamyhub.android.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Explore
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.SimCard
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.roamyhub.android.core.domain.model.user.AuthState
import com.roamyhub.android.feature.plans.browse.navigation.browseNavGraph
import com.roamyhub.android.feature.plans.home.navigation.homeNavGraph
import com.roamyhub.android.navigation.Route
import com.roamyhub.android.version.ForceUpdateDialog
import com.roamyhub.android.version.VersionStatus
import com.roamyhub.android.viewmodel.MainViewModel

/**
 * Main screen with bottom navigation
 */
@Composable
fun MainScreen(
    onNavigateToAuth: () -> Unit,
    onSignOut: () -> Unit,
    modifier: Modifier = Modifier,
    initialDeepLink: String? = null,
    viewModel: MainViewModel = hiltViewModel()
) {
    val navController = rememberNavController()
    var selectedTab by rememberSaveable { mutableIntStateOf(0) }
    val authState by viewModel.authState.collectAsState()
    val versionStatus by viewModel.versionStatus.collectAsState()

    // TODO: Handle deep link navigation when implemented
    // LaunchedEffect(initialDeepLink) {
    //     initialDeepLink?.let { route ->
    //         navController.navigate(route)
    //     }
    // }

    // Show version update dialog if needed
    if (versionStatus !is VersionStatus.UpToDate) {
        ForceUpdateDialog(
            versionStatus = versionStatus,
            onDismiss = { viewModel.dismissVersionDialog() }
        )
    }

    Scaffold(
        modifier = modifier,
        bottomBar = {
            BottomNavigationBar(
                selectedTab = selectedTab,
                onTabSelected = { index ->
                    selectedTab = index
                    when (index) {
                        0 -> navController.navigate(Route.Main.Home.route) {
                            popUpTo(Route.Main.Home.route) { inclusive = true }
                        }
                        1 -> navController.navigate(Route.Main.Browse.route) {
                            popUpTo(Route.Main.Home.route)
                        }
                        2 -> navController.navigate(Route.Main.MyESims.route) {
                            popUpTo(Route.Main.Home.route)
                        }
                        3 -> navController.navigate(Route.Main.Profile.route) {
                            popUpTo(Route.Main.Home.route)
                        }
                    }
                }
            )
        }
    ) { paddingValues ->
        MainNavHost(
            navController = navController,
            authState = authState,
            onNavigateToAuth = onNavigateToAuth,
            onSignOut = onSignOut,
            modifier = Modifier.padding(paddingValues)
        )
    }
}

@Composable
private fun BottomNavigationBar(
    selectedTab: Int,
    onTabSelected: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    NavigationBar(
        modifier = modifier,
        containerColor = MaterialTheme.colorScheme.surface,
        tonalElevation = 3.dp
    ) {
        BottomNavItem.entries.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = selectedTab == index,
                onClick = { onTabSelected(index) },
                icon = {
                    Icon(
                        imageVector = if (selectedTab == index) item.selectedIcon else item.icon,
                        contentDescription = item.title
                    )
                },
                label = { Text(item.title) }
            )
        }
    }
}

@Composable
private fun MainNavHost(
    navController: NavHostController,
    authState: AuthState,
    onNavigateToAuth: () -> Unit,
    onSignOut: () -> Unit,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Route.Main.Home.route,
        modifier = modifier
    ) {
        // Home tab - always accessible
        composable(Route.Main.Home.route) {
            val homeNavController = rememberNavController()
            NavHost(
                navController = homeNavController,
                startDestination = "home",
                modifier = Modifier.fillMaxSize()
            ) {
                homeNavGraph(homeNavController)
                // Also add browse nav graph for navigation from home
                browseNavGraph(
                    navController = homeNavController,
                    onNavigateToCheckout = { planId ->
                        // TODO: Navigate to checkout with auth check
                    },
                    onNavigateToAuth = onNavigateToAuth
                )
            }
        }

        // Browse tab - always accessible
        composable(Route.Main.Browse.route) {
            val browseNavController = rememberNavController()
            NavHost(
                navController = browseNavController,
                startDestination = "browse_home",
                modifier = Modifier.fillMaxSize()
            ) {
                browseNavGraph(
                    navController = browseNavController,
                    onNavigateToCheckout = { planId ->
                        // TODO: Navigate to checkout with auth check
                    },
                    onNavigateToAuth = onNavigateToAuth
                )
            }
        }

        // My eSIMs tab - auth required
        composable(Route.Main.MyESims.route) {
            com.roamyhub.android.feature.esims.ui.ESimListScreenWrapper(
                authState = authState,
                onNavigateToAuth = onNavigateToAuth
            )
        }

        // Profile tab - guest content available
        composable(Route.Main.Profile.route) {
            com.roamyhub.android.feature.profile.ui.ProfileScreenWrapper(
                authState = authState,
                onNavigateToAuth = onNavigateToAuth,
                onSignOut = onSignOut
            )
        }
    }
}

private enum class BottomNavItem(
    val title: String,
    val icon: ImageVector,
    val selectedIcon: ImageVector
) {
    HOME(
        title = "Home",
        icon = Icons.Outlined.Home,
        selectedIcon = Icons.Filled.Home
    ),
    BROWSE(
        title = "Browse",
        icon = Icons.Outlined.Explore,
        selectedIcon = Icons.Outlined.Explore
    ),
    MY_ESIMS(
        title = "My eSIMs",
        icon = Icons.Outlined.SimCard,
        selectedIcon = Icons.Outlined.SimCard
    ),
    PROFILE(
        title = "Profile",
        icon = Icons.Outlined.Person,
        selectedIcon = Icons.Filled.Person
    )
}
