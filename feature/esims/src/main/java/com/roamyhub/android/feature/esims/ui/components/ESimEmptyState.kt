package com.roamyhub.android.feature.esims.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.SimCard
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.roamyhub.android.core.ui.theme.LocalSpacing
import com.roamyhub.android.core.ui.theme.RoamyHubTheme

/**
 * Empty state component for eSIM list
 */
@Composable
fun ESimEmptyState(
    title: String,
    description: String,
    modifier: Modifier = Modifier,
    onActionClick: (() -> Unit)? = null,
    actionText: String = "Browse Plans"
) {
    val spacing = LocalSpacing.current

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(spacing.lg),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = Icons.Outlined.SimCard,
            contentDescription = null,
            modifier = Modifier.size(80.dp),
            tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.4f)
        )

        Spacer(modifier = Modifier.height(spacing.md))

        Text(
            text = title,
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.onSurface,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(spacing.xs))

        Text(
            text = description,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            textAlign = TextAlign.Center
        )

        if (onActionClick != null) {
            Spacer(modifier = Modifier.height(spacing.lg))

            Button(onClick = onActionClick) {
                Text(text = actionText)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ESimEmptyStatePreview() {
    RoamyHubTheme {
        Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
            ESimEmptyState(
                title = "No active eSIMs",
                description = "Your active eSIMs will appear here"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ESimEmptyStateWithActionPreview() {
    RoamyHubTheme {
        ESimEmptyState(
            title = "No eSIMs yet",
            description = "Browse plans to get started!",
            onActionClick = {}
        )
    }
}
