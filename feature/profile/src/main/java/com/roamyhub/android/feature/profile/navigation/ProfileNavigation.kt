package com.roamyhub.android.feature.profile.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.roamyhub.android.feature.profile.devices.ui.DevicesScreen
import com.roamyhub.android.feature.profile.faq.ui.FaqScreen
import com.roamyhub.android.feature.profile.orders.ui.OrderDetailScreen
import com.roamyhub.android.feature.profile.orders.ui.OrdersScreen
import com.roamyhub.android.feature.profile.rewards.ui.RewardsScreen
import com.roamyhub.android.feature.profile.settings.ui.DeleteAccountScreen
import com.roamyhub.android.feature.profile.settings.ui.SettingsScreen
import com.roamyhub.android.feature.profile.support.ui.CreateTicketScreen
import com.roamyhub.android.feature.profile.support.ui.SupportScreen
import com.roamyhub.android.feature.profile.support.ui.TicketDetailScreen
import com.roamyhub.android.feature.profile.ui.EditProfileScreen
import com.roamyhub.android.feature.profile.ui.ProfileScreen

/**
 * Navigation routes for profile feature
 */
object ProfileRoutes {
    const val PROFILE = "profile"
    const val EDIT_PROFILE = "profile/edit"
    const val ORDERS = "profile/orders"
    const val ORDER_DETAIL = "profile/orders/{orderId}"
    const val REWARDS = "profile/rewards"
    const val SUPPORT = "profile/support"
    const val CREATE_TICKET = "profile/support/create"
    const val TICKET_DETAIL = "profile/support/{ticketId}"
    const val DEVICES = "profile/devices"
    const val FAQ = "profile/faq"
    const val SETTINGS = "profile/settings"
    const val DELETE_ACCOUNT = "profile/settings/delete-account"

    fun orderDetail(orderId: String) = "profile/orders/$orderId"
    fun ticketDetail(ticketId: String) = "profile/support/$ticketId"
}

/**
 * NavGraphBuilder extension to add profile navigation graph
 */
fun NavGraphBuilder.profileNavGraph(
    navController: NavHostController,
    onSignOut: () -> Unit
) {
    // Profile Screen
    composable(route = ProfileRoutes.PROFILE) {
        ProfileScreen(
            onNavigateToEditProfile = {
                navController.navigate(ProfileRoutes.EDIT_PROFILE)
            },
            onNavigateToOrders = {
                navController.navigate(ProfileRoutes.ORDERS)
            },
            onNavigateToRewards = {
                navController.navigate(ProfileRoutes.REWARDS)
            },
            onNavigateToSupport = {
                navController.navigate(ProfileRoutes.SUPPORT)
            },
            onNavigateToDevices = {
                navController.navigate(ProfileRoutes.DEVICES)
            },
            onNavigateToFaq = {
                navController.navigate(ProfileRoutes.FAQ)
            },
            onNavigateToSettings = {
                navController.navigate(ProfileRoutes.SETTINGS)
            },
            onSignOut = onSignOut
        )
    }

    // Edit Profile Screen
    composable(route = ProfileRoutes.EDIT_PROFILE) {
        EditProfileScreen(
            onNavigateBack = { navController.popBackStack() }
        )
    }

    // Orders Screen
    composable(route = ProfileRoutes.ORDERS) {
        OrdersScreen(
            onNavigateBack = { navController.popBackStack() },
            onNavigateToOrderDetail = { orderId ->
                navController.navigate(ProfileRoutes.orderDetail(orderId))
            }
        )
    }

    // Order Detail Screen
    composable(
        route = ProfileRoutes.ORDER_DETAIL,
        arguments = listOf(
            navArgument("orderId") { type = NavType.StringType }
        )
    ) {
        OrderDetailScreen(
            onNavigateBack = { navController.popBackStack() }
        )
    }

    // Rewards Screen
    composable(route = ProfileRoutes.REWARDS) {
        RewardsScreen(
            onNavigateBack = { navController.popBackStack() }
        )
    }

    // Support Screen
    composable(route = ProfileRoutes.SUPPORT) {
        SupportScreen(
            onNavigateBack = { navController.popBackStack() },
            onNavigateToCreateTicket = {
                navController.navigate(ProfileRoutes.CREATE_TICKET)
            },
            onNavigateToTicketDetail = { ticketId ->
                navController.navigate(ProfileRoutes.ticketDetail(ticketId))
            }
        )
    }

    // Create Ticket Screen
    composable(route = ProfileRoutes.CREATE_TICKET) {
        CreateTicketScreen(
            onNavigateBack = { navController.popBackStack() },
            onTicketCreated = { ticketId ->
                navController.popBackStack()
                navController.navigate(ProfileRoutes.ticketDetail(ticketId))
            }
        )
    }

    // Ticket Detail Screen
    composable(
        route = ProfileRoutes.TICKET_DETAIL,
        arguments = listOf(
            navArgument("ticketId") { type = NavType.StringType }
        )
    ) {
        TicketDetailScreen(
            onNavigateBack = { navController.popBackStack() }
        )
    }

    // Devices Screen
    composable(route = ProfileRoutes.DEVICES) {
        DevicesScreen(
            onNavigateBack = { navController.popBackStack() }
        )
    }

    // FAQ Screen
    composable(route = ProfileRoutes.FAQ) {
        FaqScreen(
            onNavigateBack = { navController.popBackStack() }
        )
    }

    // Settings Screen
    composable(route = ProfileRoutes.SETTINGS) {
        SettingsScreen(
            onNavigateBack = { navController.popBackStack() },
            onNavigateToDeleteAccount = {
                navController.navigate(ProfileRoutes.DELETE_ACCOUNT)
            },
            onSignOut = onSignOut
        )
    }

    // Delete Account Screen
    composable(route = ProfileRoutes.DELETE_ACCOUNT) {
        DeleteAccountScreen(
            onNavigateBack = { navController.popBackStack() },
            onAccountDeleted = onSignOut
        )
    }
}
