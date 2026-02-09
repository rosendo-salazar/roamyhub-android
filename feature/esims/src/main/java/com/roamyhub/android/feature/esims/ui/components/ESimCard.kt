package com.roamyhub.android.feature.esims.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.roamyhub.android.core.common.extensions.toReadableDate
import com.roamyhub.android.core.domain.model.esim.ESim
import com.roamyhub.android.core.domain.model.esim.ESimStatus
import com.roamyhub.android.core.ui.theme.LocalSpacing
import com.roamyhub.android.core.ui.theme.RoamyHubTheme
import kotlinx.datetime.Clock

/**
 * Card component for displaying eSIM summary
 */
@Composable
fun ESimCard(
    esim: ESim,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val spacing = LocalSpacing.current

    Card(
        onClick = onClick,
        modifier = modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(spacing.md)
        ) {
            // Status badge and plan name
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = esim.planName,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.weight(1f)
                )

                ESimStatusBadge(status = esim.status)
            }

            Spacer(modifier = Modifier.height(spacing.sm))

            // Data usage bar
            DataUsageBar(
                dataUsed = esim.dataUsed,
                dataTotal = esim.dataAmount,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(spacing.xs))

            // Data remaining text
            Text(
                text = "${esim.getFormattedDataRemaining()} remaining of ${esim.getFormattedDataAmount()}",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            Spacer(modifier = Modifier.height(spacing.sm))

            // Valid until date and coverage
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = esim.expiresAt?.let { "Valid until ${it.toReadableDate()}" }
                        ?: "Not activated",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )

                Text(
                    text = esim.getCoverageDescription(),
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.primary,
                    fontWeight = FontWeight.Medium
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ESimCardPreview() {
    RoamyHubTheme {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            ESimCard(
                esim = ESim(
                    id = "1",
                    userId = "user1",
                    orderId = "order1",
                    planId = "plan1",
                    planName = "USA 5GB - 30 Days",
                    iccid = "123456789",
                    status = ESimStatus.ACTIVE,
                    dataAmount = 5120,
                    dataUsed = 1536,
                    validityDays = 30,
                    expiresAt = Clock.System.now(),
                    countryName = "USA",
                    createdAt = Clock.System.now(),
                    updatedAt = Clock.System.now()
                ),
                onClick = {}
            )

            ESimCard(
                esim = ESim(
                    id = "2",
                    userId = "user1",
                    orderId = "order2",
                    planId = "plan2",
                    planName = "Europe 10GB - 14 Days",
                    iccid = "987654321",
                    status = ESimStatus.DEPLETED,
                    dataAmount = 10240,
                    dataUsed = 10240,
                    validityDays = 14,
                    expiresAt = Clock.System.now(),
                    regionKey = "europe",
                    createdAt = Clock.System.now(),
                    updatedAt = Clock.System.now()
                ),
                onClick = {}
            )
        }
    }
}
