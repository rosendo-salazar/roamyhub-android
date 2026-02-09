package com.roamyhub.android.core.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * RoamyHub spacing tokens matching iOS app
 */
data class Spacing(
    val xxs: Dp = 4.dp,   // Extra extra small
    val xs: Dp = 8.dp,    // Extra small
    val sm: Dp = 12.dp,   // Small
    val md: Dp = 16.dp,   // Medium (default)
    val lg: Dp = 24.dp,   // Large
    val xl: Dp = 32.dp,   // Extra large
    val xxl: Dp = 48.dp,  // Extra extra large

    // Semantic spacing
    val screenPadding: Dp = 16.dp,
    val cardPadding: Dp = 16.dp,
    val sectionSpacing: Dp = 24.dp,
    val itemSpacing: Dp = 12.dp,
    val dividerSpacing: Dp = 8.dp
)

/**
 * CompositionLocal for accessing spacing throughout the app
 */
val LocalSpacing = staticCompositionLocalOf { Spacing() }
