package com.roamyhub.android.feature.esims.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.material3.pulltorefresh.rememberPullToRefreshState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.roamyhub.android.core.domain.model.esim.ESim
import com.roamyhub.android.core.domain.model.esim.ESimStatus
import com.roamyhub.android.core.ui.components.ErrorView
import com.roamyhub.android.core.ui.components.LoadingIndicator
import com.roamyhub.android.core.ui.theme.LocalSpacing
import com.roamyhub.android.core.ui.theme.RoamyHubTheme
import com.roamyhub.android.feature.esims.state.ESimTab
import com.roamyhub.android.feature.esims.ui.components.ESimCard
import com.roamyhub.android.feature.esims.ui.components.ESimEmptyState
import com.roamyhub.android.feature.esims.viewmodel.ESimListViewModel
import kotlinx.datetime.Clock

/**
 * eSIM list screen with tab filtering
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ESimListScreen(
    onNavigateToDetail: (String) -> Unit,
    onNavigateToBrowse: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: ESimListViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsState()
    val spacing = LocalSpacing.current
    val snackbarHostState = remember { SnackbarHostState() }
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()

    // Show error snackbar
    LaunchedEffect(uiState.error) {
        uiState.error?.let { error ->
            snackbarHostState.showSnackbar(error)
        }
    }

    Scaffold(
        modifier = modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            TopAppBar(
                title = { Text("My eSIMs") },
                scrollBehavior = scrollBehavior
            )
        },
        snackbarHost = { SnackbarHost(snackbarHostState) }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            // Tab Row
            TabRow(
                selectedTabIndex = when (uiState.selectedTab) {
                    ESimTab.ACTIVE -> 0
                    ESimTab.ALL -> 1
                }
            ) {
                Tab(
                    selected = uiState.selectedTab == ESimTab.ACTIVE,
                    onClick = { viewModel.onTabChange(ESimTab.ACTIVE) },
                    text = { Text("Active") }
                )
                Tab(
                    selected = uiState.selectedTab == ESimTab.ALL,
                    onClick = { viewModel.onTabChange(ESimTab.ALL) },
                    text = { Text("All") }
                )
            }

            // Content
            when {
                uiState.isLoading -> {
                    LoadingIndicator()
                }
                uiState.error != null && uiState.esims.isEmpty() -> {
                    ErrorView(
                        message = uiState.error ?: "Unknown error",
                        onRetry = { viewModel.loadESims() }
                    )
                }
                uiState.isEmpty -> {
                    // Show appropriate empty state
                    if (uiState.hasNoESims) {
                        // User has no eSIMs at all
                        ESimEmptyState(
                            title = "No eSIMs yet",
                            description = "Browse plans to get started!",
                            onActionClick = onNavigateToBrowse,
                            actionText = "Browse Plans"
                        )
                    } else {
                        // User has eSIMs, but none match the current filter
                        ESimEmptyState(
                            title = "No ${uiState.selectedTab.name.lowercase()} eSIMs",
                            description = "Your ${uiState.selectedTab.name.lowercase()} eSIMs will appear here"
                        )
                    }
                }
                else -> {
                    PullToRefreshBox(
                        isRefreshing = uiState.isRefreshing,
                        onRefresh = { viewModel.refresh() },
                        state = rememberPullToRefreshState(),
                        modifier = Modifier.fillMaxSize()
                    ) {
                        LazyColumn(
                            contentPadding = PaddingValues(spacing.md),
                            modifier = Modifier.fillMaxSize()
                        ) {
                            items(
                                items = uiState.filteredList,
                                key = { it.id }
                            ) { esim ->
                                ESimCard(
                                    esim = esim,
                                    onClick = { onNavigateToDetail(esim.id) }
                                )
                                Spacer(modifier = Modifier.height(spacing.sm))
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ESimListScreenPreview() {
    RoamyHubTheme {
        Box {
            // Preview would need mock ViewModel
        }
    }
}
