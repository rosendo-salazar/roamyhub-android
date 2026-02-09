package com.roamyhub.android.feature.plans.home.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.roamyhub.android.feature.plans.home.ui.HomeScreen

/**
 * Navigation routes for the Home feature
 */
object HomeRoutes {
    const val HOME = "home"
    const val HOME_GRAPH = "home_graph"
}

/**
 * NavGraphBuilder extension to add Home navigation
 */
fun NavGraphBuilder.homeNavGraph(
    navController: NavController
) {
    composable(HomeRoutes.HOME) {
        HomeScreen(
            onNavigateToSearch = {
                navController.navigate("browse_search")
            },
            onNavigateToCountry = { countryCode ->
                navController.navigate("browse_country/$countryCode")
            },
            onNavigateToRegion = { regionKey ->
                navController.navigate("browse_region/$regionKey")
            }
        )
    }
}
