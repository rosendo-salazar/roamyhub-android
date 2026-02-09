package com.roamyhub.android.feature.plans.home.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.roamyhub.android.core.domain.model.plan.CountrySummary
import com.roamyhub.android.core.domain.model.plan.RegionSummary
import com.roamyhub.android.core.ui.components.ErrorView
import com.roamyhub.android.core.ui.components.LoadingIndicator
import com.roamyhub.android.core.ui.theme.LocalSpacing
import com.roamyhub.android.feature.plans.browse.ui.components.CountryCard
import com.roamyhub.android.feature.plans.browse.ui.components.RegionCard
import com.roamyhub.android.feature.plans.home.state.HomeUiState
import com.roamyhub.android.feature.plans.home.viewmodel.HomeViewModel

/**
 * Home screen - main entry point for the app
 *
 * Displays search prompt, popular destinations, and regions.
 */
@Composable
fun HomeScreen(
    onNavigateToSearch: () -> Unit,
    onNavigateToCountry: (String) -> Unit,
    onNavigateToRegion: (String) -> Unit,
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    when (val state = uiState) {
        is HomeUiState.Loading -> {
            LoadingIndicator(modifier = modifier.fillMaxSize())
        }
        is HomeUiState.Error -> {
            ErrorView(
                message = state.message,
                onRetry = { viewModel.retry() },
                modifier = modifier.fillMaxSize()
            )
        }
        is HomeUiState.Success -> {
            HomeContent(
                popularCountries = state.popularCountries,
                regions = state.regions,
                onNavigateToSearch = onNavigateToSearch,
                onNavigateToCountry = onNavigateToCountry,
                onNavigateToRegion = onNavigateToRegion,
                modifier = modifier
            )
        }
    }
}

@Composable
private fun HomeContent(
    popularCountries: List<CountrySummary>,
    regions: List<RegionSummary>,
    onNavigateToSearch: () -> Unit,
    onNavigateToCountry: (String) -> Unit,
    onNavigateToRegion: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val spacing = LocalSpacing.current

    LazyColumn(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(vertical = spacing.lg)
    ) {
        // Header
        item {
            Column(
                modifier = Modifier.padding(horizontal = spacing.lg)
            ) {
                Text(
                    text = "Find Your Perfect Plan",
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(spacing.sm))
                Text(
                    text = "Stay connected anywhere in the world",
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                Spacer(modifier = Modifier.height(spacing.lg))

                // Search prompt
                SearchPrompt(onClick = onNavigateToSearch)
            }
        }

        // Popular Destinations
        if (popularCountries.isNotEmpty()) {
            item {
                Spacer(modifier = Modifier.height(spacing.xl))
                SectionHeader(
                    title = "Popular Destinations",
                    onSeeAllClick = null
                )
                Spacer(modifier = Modifier.height(spacing.md))
            }

            item {
                LazyRow(
                    contentPadding = PaddingValues(horizontal = spacing.lg),
                    horizontalArrangement = Arrangement.spacedBy(spacing.md)
                ) {
                    items(popularCountries) { country ->
                        CountryCard(
                            country = country,
                            onClick = { onNavigateToCountry(country.countryCode) },
                            modifier = Modifier.width(160.dp)
                        )
                    }
                }
            }
        }

        // Regions
        if (regions.isNotEmpty()) {
            item {
                Spacer(modifier = Modifier.height(spacing.xxl))
                SectionHeader(
                    title = "Browse by Region",
                    onSeeAllClick = null
                )
                Spacer(modifier = Modifier.height(spacing.md))
            }

            items(regions) { region ->
                RegionCard(
                    region = region,
                    onClick = { onNavigateToRegion(region.regionKey) },
                    modifier = Modifier.padding(
                        horizontal = spacing.lg,
                        vertical = spacing.xs
                    )
                )
            }
        }
    }
}

@Composable
private fun SearchPrompt(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val spacing = LocalSpacing.current

    Card(
        onClick = onClick,
        modifier = modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.padding(spacing.lg),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurfaceVariant
            )
            Spacer(modifier = Modifier.width(spacing.md))
            Text(
                text = "Search countries or regions...",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}

@Composable
private fun SectionHeader(
    title: String,
    onSeeAllClick: (() -> Unit)?,
    modifier: Modifier = Modifier
) {
    val spacing = LocalSpacing.current

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = spacing.lg),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        if (onSeeAllClick != null) {
            TextButton(onClick = onSeeAllClick) {
                Text("See All")
            }
        }
    }
}
