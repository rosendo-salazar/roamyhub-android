package com.roamyhub.android.feature.profile.settings.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.roamyhub.android.feature.profile.settings.state.availableCurrencies
import com.roamyhub.android.feature.profile.settings.state.availableLanguages
import com.roamyhub.android.feature.profile.settings.viewmodel.SettingsViewModel
import com.roamyhub.android.feature.profile.ui.components.ProfileMenuItem
import androidx.compose.material.icons.filled.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(
    onNavigateBack: () -> Unit,
    onNavigateToDeleteAccount: () -> Unit,
    onSignOut: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: SettingsViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsState()
    val snackbarHostState = remember { SnackbarHostState() }
    var showSignOutDialog by remember { mutableStateOf(false) }

    LaunchedEffect(uiState.error) {
        uiState.error?.let {
            snackbarHostState.showSnackbar(it)
            viewModel.clearError()
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Settings") },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, "Back")
                    }
                }
            )
        },
        snackbarHost = { SnackbarHost(snackbarHostState) }
    ) { paddingValues ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Preferences
            Text(
                "Preferences",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )

            val selectedLanguage = availableLanguages.find { it.code == uiState.selectedLanguage }
            ProfileMenuItem(
                icon = Icons.Default.Language,
                title = "Language",
                subtitle = selectedLanguage?.nativeName,
                onClick = viewModel::showLanguageBottomSheet
            )

            val selectedCurrency = availableCurrencies.find { it.code == uiState.selectedCurrency }
            ProfileMenuItem(
                icon = Icons.Default.AttachMoney,
                title = "Currency",
                subtitle = "${selectedCurrency?.symbol} ${selectedCurrency?.code}",
                onClick = viewModel::showCurrencyBottomSheet
            )

            HorizontalDivider()

            // Appearance
            Text(
                "Appearance",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Dark Mode", style = MaterialTheme.typography.bodyLarge)
                Switch(
                    checked = uiState.isDarkMode,
                    onCheckedChange = viewModel::toggleDarkMode
                )
            }

            HorizontalDivider()

            // Legal
            Text(
                "Legal",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )

            ProfileMenuItem(
                icon = Icons.Default.Description,
                title = "Terms of Service",
                onClick = { /* TODO: Open terms */ }
            )

            ProfileMenuItem(
                icon = Icons.Default.PrivacyTip,
                title = "Privacy Policy",
                onClick = { /* TODO: Open privacy policy */ }
            )

            HorizontalDivider()

            // Account Actions
            Text(
                "Account",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )

            ProfileMenuItem(
                icon = Icons.Default.Logout,
                title = "Sign Out",
                onClick = { showSignOutDialog = true }
            )

            ProfileMenuItem(
                icon = Icons.Default.DeleteForever,
                title = "Delete Account",
                onClick = onNavigateToDeleteAccount
            )
        }

        // Dialogs
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

        // Language Bottom Sheet
        if (uiState.showLanguageBottomSheet) {
            LanguageBottomSheet(
                selectedLanguage = uiState.selectedLanguage,
                onLanguageSelected = {
                    viewModel.updateLanguage(it)
                    viewModel.hideLanguageBottomSheet()
                },
                onDismiss = viewModel::hideLanguageBottomSheet
            )
        }

        // Currency Bottom Sheet
        if (uiState.showCurrencyBottomSheet) {
            CurrencyBottomSheet(
                selectedCurrency = uiState.selectedCurrency,
                onCurrencySelected = {
                    viewModel.updateCurrency(it)
                    viewModel.hideCurrencyBottomSheet()
                },
                onDismiss = viewModel::hideCurrencyBottomSheet
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun LanguageBottomSheet(
    selectedLanguage: String,
    onLanguageSelected: (String) -> Unit,
    onDismiss: () -> Unit
) {
    ModalBottomSheet(onDismissRequest = onDismiss) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                "Select Language",
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            availableLanguages.forEach { language ->
                ListItem(
                    headlineContent = { Text(language.nativeName) },
                    supportingContent = { Text(language.name) },
                    trailingContent = {
                        RadioButton(
                            selected = language.code == selectedLanguage,
                            onClick = { onLanguageSelected(language.code) }
                        )
                    },
                    modifier = Modifier.clickable { onLanguageSelected(language.code) }
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun CurrencyBottomSheet(
    selectedCurrency: String,
    onCurrencySelected: (String) -> Unit,
    onDismiss: () -> Unit
) {
    ModalBottomSheet(onDismissRequest = onDismiss) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                "Select Currency",
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            availableCurrencies.forEach { currency ->
                ListItem(
                    headlineContent = { Text("${currency.symbol} ${currency.code}") },
                    supportingContent = { Text(currency.name) },
                    trailingContent = {
                        RadioButton(
                            selected = currency.code == selectedCurrency,
                            onClick = { onCurrencySelected(currency.code) }
                        )
                    },
                    modifier = Modifier.clickable { onCurrencySelected(currency.code) }
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}
