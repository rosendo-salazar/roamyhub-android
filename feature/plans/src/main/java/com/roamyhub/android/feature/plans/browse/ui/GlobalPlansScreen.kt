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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.roamyhub.android.core.common.result.Resource
import com.roamyhub.android.core.domain.model.plan.Plan
import com.roamyhub.android.core.domain.repository.PlanRepository
import com.roamyhub.android.core.ui.components.ErrorView
import com.roamyhub.android.core.ui.components.LoadingIndicator
import com.roamyhub.android.core.ui.theme.LocalSpacing
import com.roamyhub.android.feature.plans.browse.ui.components.PlanCard
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Global plans screen showing worldwide coverage plans
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GlobalPlansScreen(
    onNavigateBack: () -> Unit,
    onNavigateToPlan: (String) -> Unit,
    modifier: Modifier = Modifier,
    viewModel: GlobalPlansViewModel = hiltViewModel()
) {
    val spacing = LocalSpacing.current
    var isLoading by remember { mutableStateOf(true) }
    var error by remember { mutableStateOf<String?>(null) }
    var plans by remember { mutableStateOf<List<Plan>>(emptyList()) }

    LaunchedEffect(Unit) {
        when (val result = viewModel.planRepository.getPlans()) {
            is Resource.Success -> {
                // Filter for global plans
                plans = result.data.filter { it.isGlobal }
                isLoading = false
            }
            is Resource.Error -> {
                error = result.message
                isLoading = false
            }
            is Resource.Loading -> {
                isLoading = true
            }
        }
    }

    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Global Plans",
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
            isLoading -> {
                LoadingIndicator()
            }
            error != null -> {
                ErrorView(
                    message = error ?: "An error occurred",
                    onRetry = {
                        // Retry logic could be added here
                    }
                )
            }
            plans.isEmpty() -> {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "No global plans available",
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
                    // Info card
                    item {
                        GlobalInfoCard(
                            modifier = Modifier.fillMaxWidth()
                        )
                    }

                    // Plans header
                    item {
                        Text(
                            text = "Available Plans (${plans.size})",
                            style = MaterialTheme.typography.titleLarge,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(vertical = spacing.xs)
                        )
                    }

                    // Plan cards
                    items(plans) { plan ->
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
private fun GlobalInfoCard(
    modifier: Modifier = Modifier
) {
    val spacing = LocalSpacing.current

    Card(
        modifier = modifier,
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.tertiaryContainer
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(spacing.md)
        ) {
            Text(
                text = "🌍 Worldwide Coverage",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onTertiaryContainer
            )
            Spacer(modifier = Modifier.height(spacing.xs))
            Text(
                text = "Stay connected across multiple countries with our global data plans. Perfect for frequent travelers.",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onTertiaryContainer
            )
        }
    }
}

/**
 * Simple ViewModel for Global Plans screen
 */
@HiltViewModel
class GlobalPlansViewModel @Inject constructor(
    val planRepository: PlanRepository
) : androidx.lifecycle.ViewModel()
