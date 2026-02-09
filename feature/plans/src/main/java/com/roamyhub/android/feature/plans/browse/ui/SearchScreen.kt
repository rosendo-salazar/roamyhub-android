package com.roamyhub.android.feature.plans.browse.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
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
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.roamyhub.android.core.ui.theme.LocalSpacing
import com.roamyhub.android.feature.plans.browse.ui.components.CountryCard
import com.roamyhub.android.feature.plans.browse.ui.components.RegionCard
import com.roamyhub.android.feature.plans.browse.ui.components.SearchBar
import com.roamyhub.android.feature.plans.browse.viewmodel.BrowseViewModel

/**
 * Search screen for filtering countries and regions
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(
    onNavigateBack: () -> Unit,
    onNavigateToCountry: (String) -> Unit,
    onNavigateToRegion: (String) -> Unit,
    modifier: Modifier = Modifier,
    viewModel: BrowseViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    val spacing = LocalSpacing.current

    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = { Text("Search Plans") },
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
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(horizontal = spacing.md)
        ) {
            // Search bar
            SearchBar(
                query = uiState.searchQuery,
                onQueryChange = { viewModel.onSearchQueryChange(it) },
                onClear = { viewModel.clearSearch() },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = spacing.md)
            )

            // Results
            val filteredCountries = uiState.filteredCountries
            val filteredRegions = uiState.filteredRegions

            when {
                uiState.searchQuery.isEmpty() -> {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Search for countries or regions",
                            style = MaterialTheme.typography.bodyLarge,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
                filteredCountries.isEmpty() && filteredRegions.isEmpty() -> {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "No results found",
                            style = MaterialTheme.typography.bodyLarge,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
                else -> {
                    LazyColumn(
                        modifier = Modifier.fillMaxSize(),
                        contentPadding = PaddingValues(bottom = spacing.md),
                        verticalArrangement = Arrangement.spacedBy(spacing.sm)
                    ) {
                        // Countries section
                        if (filteredCountries.isNotEmpty()) {
                            item {
                                Text(
                                    text = "Countries (${filteredCountries.size})",
                                    style = MaterialTheme.typography.titleMedium,
                                    modifier = Modifier.padding(vertical = spacing.xs)
                                )
                            }
                            items(filteredCountries) { country ->
                                CountryCard(
                                    country = country,
                                    onClick = { onNavigateToCountry(country.countryCode) }
                                )
                            }
                        }

                        // Regions section
                        if (filteredRegions.isNotEmpty()) {
                            item {
                                Text(
                                    text = "Regions (${filteredRegions.size})",
                                    style = MaterialTheme.typography.titleMedium,
                                    modifier = Modifier.padding(
                                        top = if (filteredCountries.isNotEmpty()) spacing.md else 0.dp,
                                        bottom = spacing.xs
                                    )
                                )
                            }
                            items(filteredRegions) { region ->
                                RegionCard(
                                    region = region,
                                    onClick = { onNavigateToRegion(region.regionKey) }
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
