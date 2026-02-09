package com.roamyhub.android.feature.purchase.ui

import android.app.Activity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.common.util.CurrencyFormatter
import com.roamyhub.android.core.ui.theme.BrandPrimary
import com.roamyhub.android.core.ui.theme.LocalSpacing
import com.roamyhub.android.feature.purchase.payment.PaymentResult
import com.roamyhub.android.feature.purchase.payment.StripePaymentManager
import com.roamyhub.android.feature.purchase.ui.components.OrderSummaryCard
import com.roamyhub.android.feature.purchase.ui.components.PointsRedemptionCard
import com.roamyhub.android.feature.purchase.ui.components.PriceBreakdown
import com.roamyhub.android.feature.purchase.viewmodel.CheckoutViewModel
import kotlinx.coroutines.launch

/**
 * Checkout screen for purchasing an eSIM plan
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CheckoutScreen(
    planId: String,
    onNavigateBack: () -> Unit,
    onNavigateToOrderConfirmation: (orderId: String) -> Unit,
    modifier: Modifier = Modifier,
    viewModel: CheckoutViewModel = hiltViewModel(),
    stripePaymentManager: StripePaymentManager = remember { StripePaymentManager() }
) {
    val uiState by viewModel.uiState.collectAsState()
    val spacing = LocalSpacing.current
    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()
    val context = LocalContext.current
    val activity = context as? Activity

    // Load checkout data
    LaunchedEffect(planId) {
        viewModel.loadCheckoutData(planId)
    }

    // Initialize Stripe when payment config is loaded
    LaunchedEffect(uiState.paymentConfig) {
        uiState.paymentConfig?.let { config ->
            stripePaymentManager.initialize(context, config)
            (activity as? androidx.activity.ComponentActivity)?.let {
                stripePaymentManager.createPaymentSheet(it) { result ->
                    viewModel.handlePaymentResult(result)
                }
            }
        }
    }

    // Handle payment result
    LaunchedEffect(uiState.checkout?.orderId) {
        val orderId = uiState.checkout?.orderId
        if (orderId != null && !uiState.isProcessingPayment) {
            onNavigateToOrderConfirmation(orderId)
        }
    }

    // Show payment errors
    LaunchedEffect(uiState.paymentError) {
        uiState.paymentError?.let { error ->
            snackbarHostState.showSnackbar(error)
            viewModel.clearPaymentError()
        }
    }

    // Cleanup
    DisposableEffect(Unit) {
        onDispose {
            stripePaymentManager.cleanup()
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Checkout") },
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
        Box(
            modifier = modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            when {
                uiState.isLoading -> {
                    CircularProgressIndicator(
                        modifier = Modifier.align(Alignment.Center)
                    )
                }

                uiState.error != null -> {
                    ErrorContent(
                        error = uiState.error!!,
                        onRetry = { viewModel.loadCheckoutData(planId) },
                        modifier = Modifier.align(Alignment.Center)
                    )
                }

                uiState.isReady -> {
                    CheckoutContent(
                        uiState = uiState,
                        onPointsChange = viewModel::onPointsChange,
                        onPaymentClick = {
                            if (uiState.checkout == null) {
                                viewModel.createCheckout()
                            }
                            viewModel.initiatePayment()

                            // Launch Stripe payment if required
                            if (uiState.requiresPayment && !uiState.isZeroCost) {
                                scope.launch {
                                    when (val result = viewModel.getStripeSession()) {
                                        is Resource.Success -> {
                                            stripePaymentManager.presentPaymentSheet(result.data)
                                        }
                                        is Resource.Error -> {
                                            snackbarHostState.showSnackbar(
                                                result.message ?: "Failed to initialize payment"
                                            )
                                        }
                                        is Resource.Loading -> {}
                                    }
                                }
                            }
                        },
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }

            // Processing overlay
            if (uiState.isProcessingPayment) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(paddingValues),
                    contentAlignment = Alignment.Center
                ) {
                    Card(
                        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(spacing.xl),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(spacing.md)
                        ) {
                            CircularProgressIndicator()
                            Text(
                                text = "Processing payment...",
                                style = MaterialTheme.typography.bodyLarge
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun CheckoutContent(
    uiState: com.roamyhub.android.feature.purchase.state.CheckoutUiState,
    onPointsChange: (Int) -> Unit,
    onPaymentClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val spacing = LocalSpacing.current
    val plan = uiState.plan ?: return

    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(spacing.md),
        verticalArrangement = Arrangement.spacedBy(spacing.md)
    ) {
        // Plan Summary
        OrderSummaryCard(
            planName = plan.name,
            dataAmount = plan.dataFormatted,
            validity = plan.validityDescription,
            coverage = when {
                plan.isGlobal -> "Global"
                plan.regionKey != null -> plan.regionKey ?: "Unknown"
                plan.countryIso != null -> plan.countryIso ?: "Unknown"
                else -> "Unknown"
            },
            price = plan.price,
            currency = plan.currency
        )

        // Points Redemption
        if (uiState.canRedeem) {
            PointsRedemptionCard(
                availablePoints = uiState.availablePoints,
                maxRedeemablePoints = uiState.maxRedeemablePoints,
                pointsToRedeem = uiState.pointsToRedeem,
                discountAmount = uiState.discountAmount,
                currency = uiState.currency,
                onPointsChange = onPointsChange
            )
        }

        // Price Breakdown
        Card(
            modifier = Modifier.fillMaxWidth()
        ) {
            PriceBreakdown(
                subtotal = uiState.subtotal,
                discount = uiState.discountAmount,
                total = uiState.finalTotal,
                currency = uiState.currency,
                modifier = Modifier.padding(spacing.md)
            )
        }

        // Payment Button
        Button(
            onClick = onPaymentClick,
            modifier = Modifier.fillMaxWidth(),
            enabled = uiState.canProceed
        ) {
            Text(
                text = if (uiState.isZeroCost) {
                    "Complete Order"
                } else {
                    "Pay ${CurrencyFormatter.format(uiState.finalTotal, uiState.currency)}"
                },
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
private fun ErrorContent(
    error: String,
    onRetry: () -> Unit,
    modifier: Modifier = Modifier
) {
    val spacing = LocalSpacing.current

    Column(
        modifier = modifier.padding(spacing.md),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(spacing.md)
    ) {
        Text(
            text = "Error",
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.error
        )
        Text(
            text = error,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurface
        )
        Button(onClick = onRetry) {
            Text("Retry")
        }
    }
}
