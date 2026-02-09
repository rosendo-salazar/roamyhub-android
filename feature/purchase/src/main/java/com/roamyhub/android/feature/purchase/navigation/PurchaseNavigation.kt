package com.roamyhub.android.feature.purchase.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.roamyhub.android.feature.purchase.ui.CheckoutScreen
import com.roamyhub.android.feature.purchase.ui.OrderConfirmationScreen

/**
 * Navigation routes for the Purchase feature
 */
object PurchaseRoutes {
    const val CHECKOUT = "purchase_checkout/{planId}"
    const val ORDER_CONFIRMATION = "purchase_confirmation/{orderId}"

    fun checkout(planId: String) = "purchase_checkout/$planId"
    fun orderConfirmation(orderId: String) = "purchase_confirmation/$orderId"
}

/**
 * NavGraphBuilder extension to add Purchase navigation graph
 */
fun NavGraphBuilder.purchaseNavGraph(
    navController: NavController,
    onNavigateToESimDetail: (esimId: String) -> Unit,
    onNavigateToHome: () -> Unit
) {
    // Checkout Screen
    composable(
        route = PurchaseRoutes.CHECKOUT,
        arguments = listOf(
            navArgument("planId") { type = NavType.StringType }
        )
    ) { backStackEntry ->
        val planId = backStackEntry.arguments?.getString("planId") ?: return@composable
        CheckoutScreen(
            planId = planId,
            onNavigateBack = {
                navController.popBackStack()
            },
            onNavigateToOrderConfirmation = { orderId ->
                navController.navigate(PurchaseRoutes.orderConfirmation(orderId)) {
                    // Clear checkout from back stack
                    popUpTo(PurchaseRoutes.checkout(planId)) {
                        inclusive = true
                    }
                }
            }
        )
    }

    // Order Confirmation Screen
    composable(
        route = PurchaseRoutes.ORDER_CONFIRMATION,
        arguments = listOf(
            navArgument("orderId") { type = NavType.StringType }
        )
    ) { backStackEntry ->
        val orderId = backStackEntry.arguments?.getString("orderId") ?: return@composable
        OrderConfirmationScreen(
            orderId = orderId,
            onNavigateToESimDetail = onNavigateToESimDetail,
            onNavigateToHome = {
                onNavigateToHome()
                // Clear confirmation from back stack
                navController.popBackStack(PurchaseRoutes.orderConfirmation(orderId), true)
            }
        )
    }
}
