package com.roamyhub.android.feature.auth.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.roamyhub.android.core.ui.theme.StatusError
import com.roamyhub.android.core.ui.theme.StatusSuccess
import com.roamyhub.android.core.ui.theme.StatusWarning
import com.roamyhub.android.feature.auth.state.PasswordStrength

/**
 * Visual indicator for password strength
 *
 * Shows a color-coded bar and label indicating password strength.
 *
 * @param strength Password strength level
 * @param modifier Optional modifier
 */
@Composable
fun PasswordStrengthIndicator(
    strength: PasswordStrength,
    modifier: Modifier = Modifier
) {
    if (strength == PasswordStrength.NONE) {
        return
    }

    val (color, label) = when (strength) {
        PasswordStrength.WEAK -> StatusError to "Weak"
        PasswordStrength.MEDIUM -> StatusWarning to "Medium"
        PasswordStrength.STRONG -> StatusSuccess to "Strong"
        PasswordStrength.NONE -> Color.Transparent to ""
    }

    val animatedColor by animateColorAsState(
        targetValue = color,
        label = "passwordStrengthColor"
    )

    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            // Three segments for weak, medium, strong
            repeat(3) { index ->
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .height(4.dp)
                        .clip(RoundedCornerShape(2.dp))
                        .background(
                            if (index < strength.ordinal) animatedColor
                            else MaterialTheme.colorScheme.surfaceVariant
                        )
                )
            }
        }

        Text(
            text = label,
            style = MaterialTheme.typography.bodySmall,
            color = animatedColor,
            modifier = Modifier.padding(top = 4.dp)
        )
    }
}
