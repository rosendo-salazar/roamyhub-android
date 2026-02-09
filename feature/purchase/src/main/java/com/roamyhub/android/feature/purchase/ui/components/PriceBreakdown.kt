package com.roamyhub.android.feature.purchase.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.roamyhub.android.core.common.util.CurrencyFormatter
import com.roamyhub.android.core.ui.theme.LocalSpacing

/**
 * Component displaying price breakdown with subtotal, discount, and total
 */
@Composable
fun PriceBreakdown(
    subtotal: Double,
    discount: Double,
    total: Double,
    currency: String,
    modifier: Modifier = Modifier
) {
    val spacing = LocalSpacing.current

    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(spacing.sm)
    ) {
        // Subtotal
        PriceRow(
            label = "Subtotal",
            amount = subtotal,
            currency = currency
        )

        // Discount (only show if > 0)
        if (discount > 0) {
            PriceRow(
                label = "Points Discount",
                amount = -discount,
                currency = currency,
                isDiscount = true
            )
        }

        // Divider
        HorizontalDivider(
            modifier = Modifier.padding(vertical = spacing.xs)
        )

        // Total
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Total",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = CurrencyFormatter.format(total, currency),
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )
        }
    }
}

/**
 * Single row in price breakdown
 */
@Composable
private fun PriceRow(
    label: String,
    amount: Double,
    currency: String,
    isDiscount: Boolean = false,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.bodyLarge,
            color = if (isDiscount) {
                MaterialTheme.colorScheme.primary
            } else {
                MaterialTheme.colorScheme.onSurface
            }
        )
        Text(
            text = CurrencyFormatter.format(amount, currency),
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = if (isDiscount) FontWeight.SemiBold else FontWeight.Normal,
            color = if (isDiscount) {
                MaterialTheme.colorScheme.primary
            } else {
                MaterialTheme.colorScheme.onSurface
            }
        )
    }
}
