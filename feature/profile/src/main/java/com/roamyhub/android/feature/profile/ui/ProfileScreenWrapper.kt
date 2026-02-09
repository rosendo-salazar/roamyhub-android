package com.roamyhub.android.feature.profile.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Description
import androidx.compose.material.icons.filled.HelpOutline
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PhoneAndroid
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.roamyhub.android.core.domain.model.user.AuthState
import com.roamyhub.android.feature.profile.navigation.ProfileRoutes
import com.roamyhub.android.feature.profile.navigation.profileNavGraph
import com.roamyhub.android.feature.profile.ui.components.ProfileMenuItem

/**
 * Wrapper for profile screen that handles authentication state
 * Shows guest content if not authenticated, otherwise shows normal profile
 */
@Composable
fun ProfileScreenWrapper(
    authState: AuthState,
    onNavigateToAuth: () -> Unit,
    onSignOut: () -> Unit,
    modifier: Modifier = Modifier
) {
    if (authState is AuthState.Authenticated) {
        // Show normal profile screen with navigation
        val navController = rememberNavController()
        NavHost(
            navController = navController,
            startDestination = ProfileRoutes.PROFILE,
            modifier = modifier
        ) {
            profileNavGraph(
                navController = navController,
                onSignOut = onSignOut
            )
        }
    } else {
        // Show guest profile content
        GuestProfileContent(
            onNavigateToAuth = onNavigateToAuth,
            modifier = modifier
        )
    }
}

/**
 * Guest profile content showing limited functionality with sign-in prompt
 */
@Composable
private fun GuestProfileContent(
    onNavigateToAuth: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {
        // Guest prompt at top
        Card(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = null,
                    modifier = Modifier.size(64.dp),
                    tint = MaterialTheme.colorScheme.primary
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Sign in to access your profile",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Track orders, manage rewards, and get support",
                    style = MaterialTheme.typography.bodyMedium,
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                Spacer(modifier = Modifier.height(24.dp))
                Button(
                    onClick = onNavigateToAuth,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Sign In / Sign Up")
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Public sections still accessible
        Text(
            text = "Resources",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(12.dp))

        // FAQ (always accessible)
        ProfileMenuItem(
            icon = Icons.Default.HelpOutline,
            title = "FAQ",
            onClick = { /* TODO: Navigate to FAQ */ }
        )

        // Device Compatibility (always accessible)
        ProfileMenuItem(
            icon = Icons.Default.PhoneAndroid,
            title = "Device Compatibility",
            onClick = { /* TODO: Navigate to devices */ }
        )

        // Legal links (always accessible)
        ProfileMenuItem(
            icon = Icons.Default.Description,
            title = "Terms & Privacy",
            onClick = { /* TODO: Navigate to legal */ }
        )
    }
}
