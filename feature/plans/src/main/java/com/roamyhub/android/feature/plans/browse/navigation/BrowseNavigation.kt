package com.roamyhub.android.feature.plans.browse.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.roamyhub.android.feature.plans.browse.ui.BrowseScreen
import com.roamyhub.android.feature.plans.browse.ui.CountryDetailScreen
import com.roamyhub.android.feature.plans.browse.ui.GlobalPlansScreen
import com.roamyhub.android.feature.plans.browse.ui.PlanDetailScreen
import com.roamyhub.android.feature.plans.browse.ui.RegionDetailScreen
import com.roamyhub.android.feature.plans.browse.ui.SearchScreen

/**
 * Navigation routes for the Browse/Plans feature
 */
object BrowseRoutes {
    const val BROWSE_HOME = "browse_home"
    const val SEARCH = "browse_search"
    const val COUNTRY_DETAIL = "browse_country/{countryIso}"
    const val REGION_DETAIL = "browse_region/{regionKey}"
    const val GLOBAL_PLANS = "browse_global"
    const val PLAN_DETAIL = "browse_plan/{planId}"

    fun countryDetail(countryIso: String) = "browse_country/$countryIso"
    fun regionDetail(regionKey: String) = "browse_region/$regionKey"
    fun planDetail(planId: String) = "browse_plan/$planId"
}

/**
 * NavGraphBuilder extension to add Browse/Plans navigation graph
 */
fun NavGraphBuilder.browseNavGraph(
    navController: NavController,
    onNavigateToCheckout: (planId: String) -> Unit,
    onNavigateToAuth: () -> Unit
) {
    // Browse Home Screen
    composable(BrowseRoutes.BROWSE_HOME) {
        BrowseScreen(
            onNavigateToSearch = {
                navController.navigate(BrowseRoutes.SEARCH)
            },
            onNavigateToCountry = { countryIso ->
                navController.navigate(BrowseRoutes.countryDetail(countryIso))
            },
            onNavigateToRegion = { regionKey ->
                navController.navigate(BrowseRoutes.regionDetail(regionKey))
            },
            onNavigateToGlobal = {
                navController.navigate(BrowseRoutes.GLOBAL_PLANS)
            }
        )
    }

    // Search Screen
    composable(BrowseRoutes.SEARCH) {
        SearchScreen(
            onNavigateBack = {
                navController.popBackStack()
            },
            onNavigateToCountry = { countryIso ->
                navController.navigate(BrowseRoutes.countryDetail(countryIso))
            },
            onNavigateToRegion = { regionKey ->
                navController.navigate(BrowseRoutes.regionDetail(regionKey))
            }
        )
    }

    // Country Detail Screen
    composable(
        route = BrowseRoutes.COUNTRY_DETAIL,
        arguments = listOf(
            navArgument("countryIso") { type = NavType.StringType }
        )
    ) { backStackEntry ->
        val countryIso = backStackEntry.arguments?.getString("countryIso") ?: return@composable
        CountryDetailScreen(
            countryIso = countryIso,
            onNavigateBack = {
                navController.popBackStack()
            },
            onNavigateToPlan = { planId ->
                navController.navigate(BrowseRoutes.planDetail(planId))
            }
        )
    }

    // Region Detail Screen
    composable(
        route = BrowseRoutes.REGION_DETAIL,
        arguments = listOf(
            navArgument("regionKey") { type = NavType.StringType }
        )
    ) { backStackEntry ->
        val regionKey = backStackEntry.arguments?.getString("regionKey") ?: return@composable
        RegionDetailScreen(
            regionKey = regionKey,
            onNavigateBack = {
                navController.popBackStack()
            },
            onNavigateToPlan = { planId ->
                navController.navigate(BrowseRoutes.planDetail(planId))
            }
        )
    }

    // Global Plans Screen
    composable(BrowseRoutes.GLOBAL_PLANS) {
        GlobalPlansScreen(
            onNavigateBack = {
                navController.popBackStack()
            },
            onNavigateToPlan = { planId ->
                navController.navigate(BrowseRoutes.planDetail(planId))
            }
        )
    }

    // Plan Detail Screen
    composable(
        route = BrowseRoutes.PLAN_DETAIL,
        arguments = listOf(
            navArgument("planId") { type = NavType.StringType }
        )
    ) { backStackEntry ->
        val planId = backStackEntry.arguments?.getString("planId") ?: return@composable
        PlanDetailScreen(
            planId = planId,
            onNavigateBack = {
                navController.popBackStack()
            },
            onNavigateToCheckout = { onNavigateToCheckout(planId) },
            onNavigateToAuth = onNavigateToAuth
        )
    }
}
