package com.roamyhub.android.feature.esims.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.roamyhub.android.feature.esims.ui.ESimDetailScreen
import com.roamyhub.android.feature.esims.ui.ESimListScreen
import com.roamyhub.android.feature.esims.ui.QrCodeScreen

/**
 * Navigation routes for eSIM feature
 */
object ESimRoutes {
    const val LIST = "esim_list"
    const val DETAIL = "esim_detail/{esimId}"
    const val QR_CODE = "esim_qr_code/{esimId}"

    fun detail(esimId: String) = "esim_detail/$esimId"
    fun qrCode(esimId: String) = "esim_qr_code/$esimId"
}

/**
 * NavGraphBuilder extension to add eSIM navigation graph
 */
fun NavGraphBuilder.esimNavGraph(
    navController: NavHostController
) {
    // eSIM List Screen
    composable(route = ESimRoutes.LIST) {
        ESimListScreen(
            onNavigateToDetail = { esimId ->
                navController.navigate(ESimRoutes.detail(esimId))
            },
            onNavigateToBrowse = {
                // Navigate to browse plans
                navController.navigate("browse") {
                    popUpTo("esim_list") { inclusive = false }
                }
            }
        )
    }

    // eSIM Detail Screen
    composable(
        route = ESimRoutes.DETAIL,
        arguments = listOf(
            navArgument("esimId") { type = NavType.StringType }
        )
    ) {
        ESimDetailScreen(
            onNavigateBack = { navController.popBackStack() },
            onNavigateToQrCode = { esimId ->
                navController.navigate(ESimRoutes.qrCode(esimId))
            },
            onESimDeleted = {
                navController.popBackStack()
            }
        )
    }

    // QR Code Screen
    composable(
        route = ESimRoutes.QR_CODE,
        arguments = listOf(
            navArgument("esimId") { type = NavType.StringType }
        )
    ) {
        QrCodeScreen(
            onNavigateBack = { navController.popBackStack() }
        )
    }
}
