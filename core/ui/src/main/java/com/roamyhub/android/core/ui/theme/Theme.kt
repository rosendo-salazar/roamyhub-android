package com.roamyhub.android.core.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

/**
 * Light color scheme for RoamyHub app
 */
private val LightColorScheme = lightColorScheme(
    primary = BrandPrimary,
    onPrimary = Color.White,
    primaryContainer = BrandPrimary.copy(alpha = 0.1f),
    onPrimaryContainer = BrandDark,

    secondary = BrandSecondary,
    onSecondary = Color.White,
    secondaryContainer = BrandSecondary.copy(alpha = 0.1f),
    onSecondaryContainer = BrandDark,

    tertiary = AccentGreen,
    onTertiary = Color.White,
    tertiaryContainer = AccentGreen.copy(alpha = 0.1f),
    onTertiaryContainer = BrandDark,

    error = StatusError,
    onError = Color.White,
    errorContainer = StatusError.copy(alpha = 0.1f),
    onErrorContainer = StatusError,

    background = BackgroundLight,
    onBackground = OnBackgroundLight,
    surface = SurfaceLight,
    onSurface = OnSurfaceLight,
    surfaceVariant = Gray100,
    onSurfaceVariant = Gray700,

    outline = BorderLight,
    outlineVariant = DividerLight,
    scrim = Gray900.copy(alpha = 0.32f),

    inverseSurface = Gray800,
    inverseOnSurface = Gray50,
    inversePrimary = BrandPrimary.copy(alpha = 0.8f)
)

/**
 * Dark color scheme for RoamyHub app
 */
private val DarkColorScheme = darkColorScheme(
    primary = BrandPrimary,
    onPrimary = Color.Black,
    primaryContainer = BrandPrimary.copy(alpha = 0.2f),
    onPrimaryContainer = BrandPrimary.copy(alpha = 0.9f),

    secondary = BrandSecondary,
    onSecondary = Color.Black,
    secondaryContainer = BrandSecondary.copy(alpha = 0.2f),
    onSecondaryContainer = BrandSecondary.copy(alpha = 0.9f),

    tertiary = AccentGreen,
    onTertiary = Color.Black,
    tertiaryContainer = AccentGreen.copy(alpha = 0.2f),
    onTertiaryContainer = AccentGreen.copy(alpha = 0.9f),

    error = StatusError.copy(alpha = 0.9f),
    onError = Color.Black,
    errorContainer = StatusError.copy(alpha = 0.2f),
    onErrorContainer = StatusError.copy(alpha = 0.9f),

    background = BackgroundDark,
    onBackground = OnBackgroundDark,
    surface = SurfaceDark,
    onSurface = OnSurfaceDark,
    surfaceVariant = Gray800,
    onSurfaceVariant = Gray300,

    outline = BorderDark,
    outlineVariant = DividerDark,
    scrim = Color.Black.copy(alpha = 0.5f),

    inverseSurface = Gray100,
    inverseOnSurface = Gray900,
    inversePrimary = BrandDark
)

/**
 * RoamyHub app theme composable
 *
 * @param darkTheme Whether to use dark theme. Defaults to system setting.
 * @param dynamicColor Whether to use dynamic color (Android 12+). Defaults to false to maintain brand consistency.
 * @param content The content to be themed
 */
@Composable
fun RoamyHubTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false, // Set to false by default for brand consistency
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    // Update system bars
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.surface.toArgb()
            window.navigationBarColor = colorScheme.surface.toArgb()
            WindowCompat.getInsetsController(window, view).apply {
                isAppearanceLightStatusBars = !darkTheme
                isAppearanceLightNavigationBars = !darkTheme
            }
        }
    }

    CompositionLocalProvider(
        LocalSpacing provides Spacing()
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = RoamyHubTypography,
            shapes = RoamyHubShapes,
            content = content
        )
    }
}
