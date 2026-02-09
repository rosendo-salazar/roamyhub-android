package com.roamyhub.android.core.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

/**
 * RoamyHub shape tokens
 */
val RoamyHubShapes = Shapes(
    extraSmall = RoundedCornerShape(4.dp),
    small = RoundedCornerShape(8.dp),
    medium = RoundedCornerShape(12.dp),
    large = RoundedCornerShape(16.dp),
    extraLarge = RoundedCornerShape(24.dp)
)

/**
 * Additional custom shapes
 */
object CustomShapes {
    val topRounded = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)
    val bottomRounded = RoundedCornerShape(bottomStart = 16.dp, bottomEnd = 16.dp)
    val pill = RoundedCornerShape(50) // Fully rounded (pill shape)
}
