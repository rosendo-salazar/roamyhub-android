package com.roamyhub.android.feature.esims.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.roamyhub.android.core.common.extensions.toReadableDate
import com.roamyhub.android.core.domain.model.esim.ESim
import com.roamyhub.android.core.domain.model.esim.ESimStatus
import com.roamyhub.android.core.ui.components.ErrorView
import com.roamyhub.android.core.ui.components.LoadingIndicator
import com.roamyhub.android.core.ui.theme.LocalSpacing
import com.roamyhub.android.core.ui.theme.RoamyHubTheme
import com.roamyhub.android.core.ui.theme.StatusError
import com.roamyhub.android.feature.esims.ui.components.DataUsageBar
import com.roamyhub.android.feature.esims.ui.components.ESimStatusBadge
import com.roamyhub.android.feature.esims.viewmodel.ESimDetailViewModel
import kotlinx.datetime.Clock

/**
 * eSIM detail screen with full information and actions
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ESimDetailScreen(
    onNavigateBack: () -> Unit,
    onNavigateToQrCode: (String) -> Unit,
    onESimDeleted: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: ESimDetailViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsState()
    val spacing = LocalSpacing.current
    val snackbarHostState = remember { SnackbarHostState() }
    var showDeleteDialog by remember { mutableStateOf(false) }

    // Show error snackbar
    LaunchedEffect(uiState.error) {
        uiState.error?.let { error ->
            snackbarHostState.showSnackbar(error)
        }
    }

    LaunchedEffect(uiState.deleteError) {
        uiState.deleteError?.let { error ->
            snackbarHostState.showSnackbar(error)
        }
    }

    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = { Text(uiState.esim?.planName ?: "eSIM Details") },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                }
            )
        },
        snackbarHost = { SnackbarHost(snackbarHostState) }
    ) { paddingValues ->
        when {
            uiState.isLoading -> {
                LoadingIndicator()
            }
            uiState.error != null && uiState.esim == null -> {
                ErrorView(
                    message = uiState.error ?: "Unknown error",
                    onRetry = { viewModel.loadESim() }
                )
            }
            uiState.esim != null -> {
                val esim = uiState.esim!!

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(paddingValues)
                        .verticalScroll(rememberScrollState())
                        .padding(spacing.md),
                    verticalArrangement = Arrangement.spacedBy(spacing.md)
                ) {
                    // Status Badge
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        ESimStatusBadge(status = esim.status)
                    }

                    // Data Usage Section
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(spacing.md)
                        ) {
                            Text(
                                text = "Data Usage",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.SemiBold
                            )

                            Spacer(modifier = Modifier.height(spacing.md))

                            DataUsageBar(
                                dataUsed = esim.dataUsed,
                                dataTotal = esim.dataAmount,
                                showPercentage = true,
                                modifier = Modifier.fillMaxWidth()
                            )

                            Spacer(modifier = Modifier.height(spacing.sm))

                            Text(
                                text = "${esim.getFormattedDataRemaining()} remaining of ${esim.getFormattedDataAmount()}",
                                style = MaterialTheme.typography.bodyLarge,
                                fontWeight = FontWeight.Medium
                            )
                        }
                    }

                    // Plan Information
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(spacing.md),
                            verticalArrangement = Arrangement.spacedBy(spacing.sm)
                        ) {
                            Text(
                                text = "Plan Information",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.SemiBold
                            )

                            HorizontalDivider(modifier = Modifier.padding(vertical = spacing.xs))

                            DetailRow(label = "Plan Name", value = esim.planName)
                            DetailRow(label = "Data Amount", value = esim.getFormattedDataAmount())
                            DetailRow(label = "Validity", value = "${esim.validityDays} days")
                            DetailRow(label = "Coverage", value = esim.getCoverageDescription())

                            esim.activatedAt?.let { activatedAt ->
                                DetailRow(
                                    label = "Activated",
                                    value = activatedAt.toReadableDate()
                                )
                            }

                            esim.expiresAt?.let { expiresAt ->
                                DetailRow(
                                    label = "Expires",
                                    value = expiresAt.toReadableDate()
                                )
                            }

                            DetailRow(label = "ICCID", value = esim.iccid)
                        }
                    }

                    // Action Buttons
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(spacing.sm)
                    ) {
                        Button(
                            onClick = { onNavigateToQrCode(esim.id) },
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text("View QR Code")
                        }

                        OutlinedButton(
                            onClick = { showDeleteDialog = true },
                            modifier = Modifier.fillMaxWidth(),
                            enabled = !uiState.isDeleting
                        ) {
                            Text(
                                text = if (uiState.isDeleting) "Deleting..." else "Delete eSIM",
                                color = StatusError
                            )
                        }
                    }
                }
            }
        }
    }

    // Delete Confirmation Dialog
    if (showDeleteDialog) {
        AlertDialog(
            onDismissRequest = { showDeleteDialog = false },
            title = { Text("Delete eSIM?") },
            text = {
                Text(
                    if (uiState.isActiveESim) {
                        "This eSIM is currently active. Are you sure you want to delete it? This action cannot be undone."
                    } else {
                        "Are you sure you want to delete this eSIM? This action cannot be undone."
                    }
                )
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        showDeleteDialog = false
                        viewModel.deleteESim(onSuccess = onESimDeleted)
                    }
                ) {
                    Text("Delete", color = StatusError)
                }
            },
            dismissButton = {
                TextButton(onClick = { showDeleteDialog = false }) {
                    Text("Cancel")
                }
            }
        )
    }
}

@Composable
private fun DetailRow(
    label: String,
    value: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
        Text(
            text = value,
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.Medium
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DetailRowPreview() {
    RoamyHubTheme {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            DetailRow(label = "Plan Name", value = "USA 5GB - 30 Days")
            DetailRow(label = "Data Amount", value = "5 GB")
            DetailRow(label = "Validity", value = "30 days")
        }
    }
}
