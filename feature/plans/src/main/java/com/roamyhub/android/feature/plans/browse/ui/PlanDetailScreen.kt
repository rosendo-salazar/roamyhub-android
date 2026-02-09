package com.roamyhub.android.feature.plans.browse.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import coil.compose.AsyncImage
import com.roamyhub.android.core.domain.model.plan.CoverageType
import com.roamyhub.android.core.domain.model.user.AuthState
import com.roamyhub.android.core.domain.repository.AuthRepository
import com.roamyhub.android.core.ui.components.ErrorView
import com.roamyhub.android.core.ui.components.LoadingIndicator
import com.roamyhub.android.core.ui.theme.LocalSpacing
import com.roamyhub.android.feature.plans.browse.ui.components.PlanBadge
import com.roamyhub.android.feature.plans.browse.viewmodel.PlanDetailViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.first
import javax.inject.Inject

/**
 * Plan detail screen showing complete information about a plan
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlanDetailScreen(
    planId: String,
    onNavigateBack: () -> Unit,
    onNavigateToCheckout: () -> Unit,
    onNavigateToAuth: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: PlanDetailViewModel = hiltViewModel(),
    authViewModel: PlanDetailAuthViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    val authState by authViewModel.authState.collectAsStateWithLifecycle(
        initialValue = AuthState.Unauthenticated
    )
    val spacing = LocalSpacing.current

    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = uiState.plan?.name ?: "Plan Details",
                        fontWeight = FontWeight.Bold
                    )
                },
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
        bottomBar = {
            if (uiState.plan != null) {
                BuyNowButton(
                    plan = uiState.plan!!,
                    isAuthenticated = authState is AuthState.Authenticated,
                    onBuyNow = {
                        if (authState is AuthState.Authenticated) {
                            onNavigateToCheckout()
                        } else {
                            onNavigateToAuth()
                        }
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(spacing.md)
                )
            }
        }
    ) { paddingValues ->
        when {
            uiState.isLoading -> {
                LoadingIndicator()
            }
            uiState.error != null -> {
                ErrorView(
                    message = uiState.error ?: "An error occurred",
                    onRetry = { viewModel.refresh() }
                )
            }
            uiState.plan == null -> {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Plan not found",
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
            else -> {
                val plan = uiState.plan!!
                LazyColumn(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(paddingValues),
                    contentPadding = PaddingValues(spacing.md),
                    verticalArrangement = Arrangement.spacedBy(spacing.md)
                ) {
                    // Plan image (if available)
                    if (plan.imageUrl != null) {
                        item {
                            AsyncImage(
                                model = plan.imageUrl,
                                contentDescription = plan.name,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(200.dp),
                                contentScale = ContentScale.Crop
                            )
                        }
                    }

                    // Data and validity badges
                    item {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(spacing.sm)
                        ) {
                            PlanBadge(
                                text = plan.dataFormatted,
                                containerColor = MaterialTheme.colorScheme.primaryContainer,
                                contentColor = MaterialTheme.colorScheme.onPrimaryContainer
                            )
                            PlanBadge(
                                text = plan.validityDescription,
                                containerColor = MaterialTheme.colorScheme.secondaryContainer,
                                contentColor = MaterialTheme.colorScheme.onSecondaryContainer
                            )
                            plan.badge?.let { badge ->
                                PlanBadge(
                                    text = badge,
                                    containerColor = MaterialTheme.colorScheme.tertiaryContainer,
                                    contentColor = MaterialTheme.colorScheme.onTertiaryContainer
                                )
                            }
                        }
                    }

                    // Price
                    item {
                        Card(
                            modifier = Modifier.fillMaxWidth(),
                            colors = CardDefaults.cardColors(
                                containerColor = MaterialTheme.colorScheme.primaryContainer
                            )
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(spacing.md)
                            ) {
                                Text(
                                    text = "Price",
                                    style = MaterialTheme.typography.labelLarge,
                                    color = MaterialTheme.colorScheme.onPrimaryContainer
                                )
                                Text(
                                    text = plan.getFormattedPrice(),
                                    style = MaterialTheme.typography.displaySmall,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onPrimaryContainer
                                )
                            }
                        }
                    }

                    // Description (if available)
                    plan.description?.let { description ->
                        if (description.isNotBlank()) {
                            item {
                                PlanSection(title = "Description") {
                                    Text(
                                        text = description,
                                        style = MaterialTheme.typography.bodyMedium
                                    )
                                }
                            }
                        }
                    }

                    // Coverage section
                    item {
                        PlanSection(title = "Coverage") {
                            when (plan.coverageType) {
                                CoverageType.SINGLE_COUNTRY -> {
                                    Text(
                                        text = "This plan covers a single country.",
                                        style = MaterialTheme.typography.bodyMedium
                                    )
                                }
                                CoverageType.REGIONAL -> {
                                    Text(
                                        text = "This plan covers ${plan.countries.size} countries in the region.",
                                        style = MaterialTheme.typography.bodyMedium
                                    )
                                    if (plan.countries.isNotEmpty()) {
                                        Spacer(modifier = Modifier.height(spacing.xs))
                                        Text(
                                            text = "Countries: ${plan.countries.joinToString(", ")}",
                                            style = MaterialTheme.typography.bodySmall,
                                            color = MaterialTheme.colorScheme.onSurfaceVariant
                                        )
                                    }
                                }
                                CoverageType.GLOBAL -> {
                                    Text(
                                        text = "This plan provides global coverage across ${plan.countries.size} countries worldwide.",
                                        style = MaterialTheme.typography.bodyMedium
                                    )
                                }
                            }
                        }
                    }

                    // Features section
                    if (plan.features.isNotEmpty()) {
                        item {
                            PlanSection(title = "Features") {
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(spacing.xs)
                                ) {
                                    plan.features.forEach { feature ->
                                        FeatureItem(feature = feature)
                                    }
                                }
                            }
                        }
                    }

                    // Bottom padding for button
                    item {
                        Spacer(modifier = Modifier.height(spacing.xl))
                    }
                }
            }
        }
    }
}

@Composable
private fun PlanSection(
    title: String,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    val spacing = LocalSpacing.current

    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(spacing.xs))
        HorizontalDivider()
        Spacer(modifier = Modifier.height(spacing.sm))
        content()
    }
}

@Composable
private fun FeatureItem(
    feature: String,
    modifier: Modifier = Modifier
) {
    val spacing = LocalSpacing.current

    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.xs),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Default.CheckCircle,
            contentDescription = null,
            tint = MaterialTheme.colorScheme.primary
        )
        Text(
            text = feature,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

@Composable
private fun BuyNowButton(
    plan: com.roamyhub.android.core.domain.model.plan.Plan,
    isAuthenticated: Boolean,
    onBuyNow: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onBuyNow,
        modifier = modifier
    ) {
        Text(
            text = if (isAuthenticated) {
                "Buy Now - ${plan.getFormattedPrice()}"
            } else {
                "Sign In to Purchase"
            }
        )
    }
}

/**
 * ViewModel for authentication state in Plan Detail screen
 */
@HiltViewModel
class PlanDetailAuthViewModel @Inject constructor(
    authRepository: AuthRepository
) : androidx.lifecycle.ViewModel() {
    val authState = authRepository.getCurrentUser()
}
