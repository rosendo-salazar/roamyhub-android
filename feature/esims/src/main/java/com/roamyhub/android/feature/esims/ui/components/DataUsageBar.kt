package com.roamyhub.android.feature.esims.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.roamyhub.android.core.ui.theme.DataUsageActive
import com.roamyhub.android.core.ui.theme.DataUsageCritical
import com.roamyhub.android.core.ui.theme.DataUsageWarning
import com.roamyhub.android.core.ui.theme.LocalSpacing
import com.roamyhub.android.core.ui.theme.RoamyHubTheme

/**
 * Data usage progress bar with color coding
 */
@Composable
fun DataUsageBar(
    dataUsed: Long,
    dataTotal: Long,
    modifier: Modifier = Modifier,
    showPercentage: Boolean = false
) {
    val spacing = LocalSpacing.current
    val percentage = if (dataTotal > 0) {
        (dataUsed.toFloat() / dataTotal.toFloat()).coerceIn(0f, 1f)
    } else {
        0f
    }

    val percentageInt = (percentage * 100).toInt()

    val color = when {
        percentageInt < 50 -> DataUsageActive
        percentageInt in 50..80 -> DataUsageWarning
        else -> DataUsageCritical
    }

    Column(modifier = modifier) {
        if (showPercentage) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Data Usage",
                    style = MaterialTheme.typography.labelMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                Text(
                    text = "$percentageInt%",
                    style = MaterialTheme.typography.labelMedium,
                    color = color
                )
            }
            Spacer(modifier = Modifier.height(spacing.xs))
        }

        LinearProgressIndicator(
            progress = { percentage },
            modifier = Modifier
                .fillMaxWidth()
                .height(8.dp),
            color = color,
            trackColor = MaterialTheme.colorScheme.surfaceVariant,
            strokeCap = StrokeCap.Round
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DataUsageBarPreview() {
    RoamyHubTheme {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            DataUsageBar(
                dataUsed = 1024,
                dataTotal = 5120,
                showPercentage = true
            )
            DataUsageBar(
                dataUsed = 3584,
                dataTotal = 5120,
                showPercentage = true
            )
            DataUsageBar(
                dataUsed = 4608,
                dataTotal = 5120,
                showPercentage = true
            )
        }
    }
}
