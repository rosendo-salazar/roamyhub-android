package com.roamyhub.android.feature.profile.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DeviceHub
import androidx.compose.material.icons.filled.HelpOutline
import androidx.compose.material.icons.filled.Logout
import androidx.compose.material.icons.filled.Receipt
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Support
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.roamyhub.android.core.domain.model.user.User
import com.roamyhub.android.feature.profile.state.ProfileUiState
import com.roamyhub.android.feature.profile.ui.components.PointsWidget
import com.roamyhub.android.feature.profile.ui.components.ProfileHeader
import com.roamyhub.android.feature.profile.ui.components.ProfileMenuItem
import com.roamyhub.android.feature.profile.viewmodel.ProfileViewModel
import kotlinx.datetime.Clock

/**
 * Profile screen showing user information and menu options
 */
@Composable
fun ProfileScreen(
    onNavigateToEditProfile: () -> Unit,
    onNavigateToOrders: () -> Unit,
    onNavigateToRewards: () -> Unit,
    onNavigateToSupport: () -> Unit,
    onNavigateToDevices: () -> Unit,
    onNavigateToFaq: () -> Unit,
    onNavigateToSettings: () -> Unit,
    onSignOut: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: ProfileViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsState()
    val snackbarHostState = remember { SnackbarHostState() }

    var showSignOutDialog by remember { mutableStateOf(false) }

    // Show error snackbar
    LaunchedEffect(uiState.error) {
        uiState.error?.let { error ->
            snackbarHostState.showSnackbar(error)
            viewModel.clearError()
        }
    }

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) }
    ) { paddingValues ->
        Box(
            modifier = modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            when {
                uiState.isLoading && uiState.user == null -> {
                    CircularProgressIndicator(
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
                uiState.user != null -> {
                    ProfileContent(
                        user = uiState.user!!,
                        onNavigateToEditProfile = onNavigateToEditProfile,
                        onNavigateToOrders = onNavigateToOrders,
                        onNavigateToRewards = onNavigateToRewards,
                        onNavigateToSupport = onNavigateToSupport,
                        onNavigateToDevices = onNavigateToDevices,
                        onNavigateToFaq = onNavigateToFaq,
                        onNavigateToSettings = onNavigateToSettings,
                        onSignOutClick = { showSignOutDialog = true }
                    )
                }
            }

            // Sign out confirmation dialog
            if (showSignOutDialog) {
                AlertDialog(
                    onDismissRequest = { showSignOutDialog = false },
                    title = { Text("Sign Out") },
                    text = { Text("Are you sure you want to sign out?") },
                    confirmButton = {
                        TextButton(
                            onClick = {
                                showSignOutDialog = false
                                onSignOut()
                            }
                        ) {
                            Text("Sign Out")
                        }
                    },
                    dismissButton = {
                        TextButton(onClick = { showSignOutDialog = false }) {
                            Text("Cancel")
                        }
                    }
                )
            }
        }
    }
}

@Composable
private fun ProfileContent(
    user: User,
    onNavigateToEditProfile: () -> Unit,
    onNavigateToOrders: () -> Unit,
    onNavigateToRewards: () -> Unit,
    onNavigateToSupport: () -> Unit,
    onNavigateToDevices: () -> Unit,
    onNavigateToFaq: () -> Unit,
    onNavigateToSettings: () -> Unit,
    onSignOutClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Profile Header
        ProfileHeader(
            user = user,
            onEditClick = onNavigateToEditProfile
        )

        // Points Widget
        PointsWidget(
            points = user.points,
            onClick = onNavigateToRewards
        )

        // Menu Section
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Account",
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )

            ProfileMenuItem(
                icon = Icons.Default.Receipt,
                title = "Order History",
                onClick = onNavigateToOrders
            )

            HorizontalDivider(modifier = Modifier.padding(horizontal = 16.dp))

            ProfileMenuItem(
                icon = Icons.Default.Star,
                title = "Rewards",
                onClick = onNavigateToRewards
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Support Section
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Support",
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )

            ProfileMenuItem(
                icon = Icons.Default.Support,
                title = "Customer Support",
                onClick = onNavigateToSupport
            )

            HorizontalDivider(modifier = Modifier.padding(horizontal = 16.dp))

            ProfileMenuItem(
                icon = Icons.Default.DeviceHub,
                title = "Device Compatibility",
                onClick = onNavigateToDevices
            )

            HorizontalDivider(modifier = Modifier.padding(horizontal = 16.dp))

            ProfileMenuItem(
                icon = Icons.Default.HelpOutline,
                title = "FAQ",
                onClick = onNavigateToFaq
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Settings Section
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Settings",
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )

            ProfileMenuItem(
                icon = Icons.Default.Settings,
                title = "Settings",
                onClick = onNavigateToSettings
            )

            HorizontalDivider(modifier = Modifier.padding(horizontal = 16.dp))

            ProfileMenuItem(
                icon = Icons.Default.Logout,
                title = "Sign Out",
                onClick = onSignOutClick
            )
        }

        Spacer(modifier = Modifier.height(16.dp))
    }
}

@Preview(showBackground = true)
@Composable
private fun ProfileScreenPreview() {
    MaterialTheme {
        ProfileContent(
            user = User(
                id = "1",
                email = "john.doe@example.com",
                firstName = "John",
                lastName = "Doe",
                points = 500,
                createdAt = Clock.System.now(),
                updatedAt = Clock.System.now()
            ),
            onNavigateToEditProfile = {},
            onNavigateToOrders = {},
            onNavigateToRewards = {},
            onNavigateToSupport = {},
            onNavigateToDevices = {},
            onNavigateToFaq = {},
            onNavigateToSettings = {},
            onSignOutClick = {}
        )
    }
}
