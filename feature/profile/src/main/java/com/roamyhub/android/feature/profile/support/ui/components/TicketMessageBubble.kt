package com.roamyhub.android.feature.profile.support.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.roamyhub.android.core.domain.model.support.TicketMessage

/**
 * Message bubble component for displaying support ticket messages
 */
@Composable
fun TicketMessageBubble(
    message: TicketMessage,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = when {
                message.isFromSupport -> MaterialTheme.colorScheme.secondaryContainer
                message.isFromCustomer -> MaterialTheme.colorScheme.primaryContainer
                else -> MaterialTheme.colorScheme.surfaceVariant
            }
        )
    ) {
        Column(
            modifier = Modifier.padding(12.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = message.senderName,
                    style = MaterialTheme.typography.labelLarge,
                    fontWeight = FontWeight.Bold,
                    color = when {
                        message.isFromSupport -> MaterialTheme.colorScheme.onSecondaryContainer
                        message.isFromCustomer -> MaterialTheme.colorScheme.onPrimaryContainer
                        else -> MaterialTheme.colorScheme.onSurfaceVariant
                    }
                )

                Surface(
                    color = when {
                        message.isFromSupport -> MaterialTheme.colorScheme.secondary
                        message.isFromCustomer -> MaterialTheme.colorScheme.primary
                        else -> MaterialTheme.colorScheme.outline
                    },
                    shape = MaterialTheme.shapes.extraSmall
                ) {
                    Text(
                        text = message.senderType.name,
                        modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp),
                        style = MaterialTheme.typography.labelSmall,
                        color = when {
                            message.isFromSupport -> MaterialTheme.colorScheme.onSecondary
                            message.isFromCustomer -> MaterialTheme.colorScheme.onPrimary
                            else -> MaterialTheme.colorScheme.surface
                        }
                    )
                }
            }

            Text(
                text = message.message,
                style = MaterialTheme.typography.bodyMedium,
                color = when {
                    message.isFromSupport -> MaterialTheme.colorScheme.onSecondaryContainer
                    message.isFromCustomer -> MaterialTheme.colorScheme.onPrimaryContainer
                    else -> MaterialTheme.colorScheme.onSurfaceVariant
                }
            )

            if (message.hasAttachments) {
                Text(
                    text = "${message.attachments.size} attachment(s)",
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.primary
                )
            }
        }
    }
}
