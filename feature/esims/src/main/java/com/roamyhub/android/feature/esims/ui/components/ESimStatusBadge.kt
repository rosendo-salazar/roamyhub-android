package com.roamyhub.android.feature.esims.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.roamyhub.android.core.domain.model.esim.ESimStatus
import com.roamyhub.android.core.ui.theme.ESimActive
import com.roamyhub.android.core.ui.theme.ESimDepleted
import com.roamyhub.android.core.ui.theme.ESimExpired
import com.roamyhub.android.core.ui.theme.ESimPending
import com.roamyhub.android.core.ui.theme.RoamyHubTheme

/**
 * Status badge for eSIM status
 */
@Composable
fun ESimStatusBadge(
    status: ESimStatus,
    modifier: Modifier = Modifier
) {
    val (backgroundColor, contentColor) = when (status) {
        ESimStatus.ACTIVE -> ESimActive to Color.White
        ESimStatus.EXPIRED -> ESimExpired to Color.White
        ESimStatus.DEPLETED -> ESimDepleted to Color.White
        ESimStatus.PENDING -> ESimPending to Color.White
        ESimStatus.CANCELLED -> ESimExpired to Color.White
    }

    FilterChip(
        selected = false,
        onClick = { /* Not clickable, display only */ },
        label = {
            Text(
                text = status.displayName(),
                style = MaterialTheme.typography.labelSmall
            )
        },
        enabled = false,
        colors = FilterChipDefaults.filterChipColors(
            disabledContainerColor = backgroundColor,
            disabledLabelColor = contentColor
        ),
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
private fun ESimStatusBadgePreview() {
    RoamyHubTheme {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            ESimStatusBadge(status = ESimStatus.ACTIVE)
            ESimStatusBadge(status = ESimStatus.EXPIRED)
            ESimStatusBadge(status = ESimStatus.DEPLETED)
            ESimStatusBadge(status = ESimStatus.PENDING)
            ESimStatusBadge(status = ESimStatus.CANCELLED)
        }
    }
}
