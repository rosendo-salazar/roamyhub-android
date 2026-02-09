package com.roamyhub.android.ui

import androidx.compose.foundation.layout.Box
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.roamyhub.android.navigation.Route

/**
 * Main screen with bottom navigation
 */
@Composable
fun MainScreen(
    onNavigateToAuth: () -> Unit,
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()
    var selectedTab by rememberSaveable { mutableIntStateOf(0) }

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
            onNavigateToAuth = onNavigateToAuth,
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
    onNavigateToAuth: () -> Unit,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Route.Main.Home.route,
        modifier = modifier
    ) {
        composable(Route.Main.Home.route) {
            PlaceholderScreen("Home")
        }
        composable(Route.Main.Browse.route) {
            PlaceholderScreen("Browse")
        }
        composable(Route.Main.MyESims.route) {
            PlaceholderScreen("My eSIMs")
        }
        composable(Route.Main.Profile.route) {
            PlaceholderScreen("Profile")
        }
    }
}

@Composable
private fun PlaceholderScreen(name: String) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "$name Screen\n(Coming in Phase 5-8)",
            style = MaterialTheme.typography.headlineMedium
        )
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
