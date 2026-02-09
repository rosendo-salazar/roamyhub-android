package com.roamyhub.android.feature.plans.browse.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.roamyhub.android.core.ui.components.ErrorView
import com.roamyhub.android.core.ui.components.LoadingIndicator
import com.roamyhub.android.core.ui.theme.LocalSpacing
import com.roamyhub.android.feature.plans.browse.ui.components.PlanCard
import com.roamyhub.android.feature.plans.browse.viewmodel.RegionDetailViewModel

/**
 * Region detail screen showing plans for a specific region
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegionDetailScreen(
    regionKey: String,
    onNavigateBack: () -> Unit,
    onNavigateToPlan: (String) -> Unit,
    modifier: Modifier = Modifier,
    viewModel: RegionDetailViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    val spacing = LocalSpacing.current

    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = uiState.region?.displayName ?: regionKey,
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
            uiState.showEmptyState -> {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "No plans available for this region",
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
            else -> {
                LazyColumn(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(paddingValues),
                    contentPadding = PaddingValues(spacing.md),
                    verticalArrangement = Arrangement.spacedBy(spacing.sm)
                ) {
                    // Region info card
                    if (uiState.region != null) {
                        item {
                            RegionInfoCard(
                                region = uiState.region!!,
                                modifier = Modifier.fillMaxWidth()
                            )
                        }
                    }

                    // Plans header
                    item {
                        Text(
                            text = "Available Plans (${uiState.plans.size})",
                            style = MaterialTheme.typography.titleLarge,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(vertical = spacing.xs)
                        )
                    }

                    // Plan cards
                    items(uiState.plans) { plan ->
                        PlanCard(
                            plan = plan,
                            onClick = { onNavigateToPlan(plan.id) }
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun RegionInfoCard(
    region: com.roamyhub.android.core.domain.model.plan.RegionSummary,
    modifier: Modifier = Modifier
) {
    val spacing = LocalSpacing.current

    Card(
        modifier = modifier,
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.secondaryContainer
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(spacing.md)
        ) {
            region.description?.let { desc ->
                Text(
                    text = desc,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSecondaryContainer
                )
                Spacer(modifier = Modifier.height(spacing.xs))
            }
            Text(
                text = region.coverageDescription,
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onSecondaryContainer
            )
            Spacer(modifier = Modifier.height(spacing.xs))
            Text(
                text = "Starting from ${region.getFormattedPrice()}",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSecondaryContainer
            )
        }
    }
}
