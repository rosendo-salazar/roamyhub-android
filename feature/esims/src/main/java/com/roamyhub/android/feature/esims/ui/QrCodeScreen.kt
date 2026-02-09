package com.roamyhub.android.feature.esims.ui

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.roamyhub.android.core.ui.components.ErrorView
import com.roamyhub.android.core.ui.components.LoadingIndicator
import com.roamyhub.android.core.ui.theme.LocalSpacing
import com.roamyhub.android.core.ui.theme.MonospaceStyle
import com.roamyhub.android.core.ui.theme.RoamyHubTheme
import com.roamyhub.android.feature.esims.state.QrCodeUiState
import com.roamyhub.android.feature.esims.viewmodel.QrCodeViewModel

/**
 * QR code screen for eSIM activation
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QrCodeScreen(
    onNavigateBack: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: QrCodeViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsState()
    val spacing = LocalSpacing.current
    val snackbarHostState = remember { SnackbarHostState() }
    val context = LocalContext.current

    // Show copied feedback
    LaunchedEffect(uiState.copiedField) {
        uiState.copiedField?.let { field ->
            val message = when (field) {
                QrCodeUiState.CopiedField.SMDP_ADDRESS -> "SM-DP+ Address copied"
                QrCodeUiState.CopiedField.ACTIVATION_CODE -> "Activation code copied"
                QrCodeUiState.CopiedField.FULL_STRING -> "Activation string copied"
            }
            snackbarHostState.showSnackbar(message)
            viewModel.clearCopiedState()
        }
    }

    // Show error snackbar
    LaunchedEffect(uiState.error) {
        uiState.error?.let { error ->
            snackbarHostState.showSnackbar(error)
        }
    }

    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = { Text("QR Code") },
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
            uiState.error != null && uiState.qrCodeData == null -> {
                ErrorView(
                    message = uiState.error ?: "Unknown error",
                    onRetry = { viewModel.loadQrCode() }
                )
            }
            uiState.qrCodeData != null -> {
                val qrCodeData = uiState.qrCodeData!!

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(paddingValues)
                        .verticalScroll(rememberScrollState())
                        .padding(spacing.md),
                    verticalArrangement = Arrangement.spacedBy(spacing.lg),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // QR Code Image
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                    ) {
                        AsyncImage(
                            model = ImageRequest.Builder(context)
                                .data(qrCodeData.qrCodeImageUrl)
                                .crossfade(true)
                                .build(),
                            contentDescription = "QR Code for eSIM activation",
                            modifier = Modifier
                                .fillMaxWidth()
                                .size(300.dp)
                                .padding(spacing.md),
                            contentScale = ContentScale.Fit
                        )
                    }

                    // Instructions
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
                                text = "How to Install",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.SemiBold
                            )

                            Spacer(modifier = Modifier.height(spacing.sm))

                            Text(
                                text = "1. Open your device's Settings\n" +
                                       "2. Go to Cellular/Mobile Data\n" +
                                       "3. Select Add eSIM\n" +
                                       "4. Scan this QR code or enter details manually",
                                style = MaterialTheme.typography.bodyMedium,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }

                    // Manual Activation Details
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(spacing.md),
                            verticalArrangement = Arrangement.spacedBy(spacing.md)
                        ) {
                            Text(
                                text = "Manual Activation",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.SemiBold
                            )

                            HorizontalDivider(modifier = Modifier.padding(vertical = spacing.xs))

                            // SM-DP+ Address
                            CopyableField(
                                label = "SM-DP+ Address",
                                value = qrCodeData.smdpAddress,
                                onCopy = {
                                    copyToClipboard(
                                        context = context,
                                        text = qrCodeData.smdpAddress,
                                        label = "SM-DP+ Address"
                                    )
                                    viewModel.onFieldCopied(QrCodeUiState.CopiedField.SMDP_ADDRESS)
                                }
                            )

                            // Activation Code
                            CopyableField(
                                label = "Activation Code",
                                value = qrCodeData.activationCode,
                                onCopy = {
                                    copyToClipboard(
                                        context = context,
                                        text = qrCodeData.activationCode,
                                        label = "Activation Code"
                                    )
                                    viewModel.onFieldCopied(QrCodeUiState.CopiedField.ACTIVATION_CODE)
                                }
                            )

                            // Full LPA String
                            CopyableField(
                                label = "Full Activation String",
                                value = qrCodeData.qrCodeString,
                                onCopy = {
                                    copyToClipboard(
                                        context = context,
                                        text = qrCodeData.qrCodeString,
                                        label = "Activation String"
                                    )
                                    viewModel.onFieldCopied(QrCodeUiState.CopiedField.FULL_STRING)
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun CopyableField(
    label: String,
    value: String,
    onCopy: () -> Unit,
    modifier: Modifier = Modifier
) {
    val spacing = LocalSpacing.current

    Column(modifier = modifier.fillMaxWidth()) {
        Text(
            text = label,
            style = MaterialTheme.typography.labelMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )

        Spacer(modifier = Modifier.height(spacing.xs))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = value,
                style = MonospaceStyle.copy(
                    fontSize = MaterialTheme.typography.bodySmall.fontSize,
                    color = MaterialTheme.colorScheme.onSurface
                ),
                modifier = Modifier.weight(1f)
            )

            IconButton(onClick = onCopy) {
                Icon(
                    imageVector = Icons.Default.ContentCopy,
                    contentDescription = "Copy $label",
                    tint = MaterialTheme.colorScheme.primary
                )
            }
        }

        HorizontalDivider(modifier = Modifier.padding(top = spacing.xs))
    }
}

private fun copyToClipboard(context: Context, text: String, label: String) {
    val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
    val clip = ClipData.newPlainText(label, text)
    clipboard.setPrimaryClip(clip)
}

@Preview(showBackground = true)
@Composable
private fun CopyableFieldPreview() {
    RoamyHubTheme {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            CopyableField(
                label = "SM-DP+ Address",
                value = "smdp.example.com",
                onCopy = {}
            )
            CopyableField(
                label = "Activation Code",
                value = "ABC123-DEF456-GHI789",
                onCopy = {}
            )
        }
    }
}
