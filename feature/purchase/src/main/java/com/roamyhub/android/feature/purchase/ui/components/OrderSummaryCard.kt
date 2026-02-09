package com.roamyhub.android.feature.purchase.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.roamyhub.android.core.common.util.CurrencyFormatter
import com.roamyhub.android.core.ui.theme.LocalSpacing

/**
 * Card displaying order summary information
 */
@Composable
fun OrderSummaryCard(
    planName: String,
    dataAmount: String,
    validity: String,
    coverage: String,
    price: Double,
    currency: String,
    modifier: Modifier = Modifier
) {
    val spacing = LocalSpacing.current

    Card(
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(spacing.md),
            verticalArrangement = Arrangement.spacedBy(spacing.sm)
        ) {
            // Plan name
            Text(
                text = planName,
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
            )

            // Plan details
            OrderDetailRow(label = "Data", value = dataAmount)
            OrderDetailRow(label = "Validity", value = validity)
            OrderDetailRow(label = "Coverage", value = coverage)
            OrderDetailRow(
                label = "Price",
                value = CurrencyFormatter.format(price, currency),
                isHighlighted = true
            )
        }
    }
}

/**
 * Single row in order summary
 */
@Composable
private fun OrderDetailRow(
    label: String,
    value: String,
    isHighlighted: Boolean = false,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
        Text(
            text = value,
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = if (isHighlighted) FontWeight.SemiBold else FontWeight.Normal,
            color = if (isHighlighted) {
                MaterialTheme.colorScheme.primary
            } else {
                MaterialTheme.colorScheme.onSurfaceVariant
            }
        )
    }
}
