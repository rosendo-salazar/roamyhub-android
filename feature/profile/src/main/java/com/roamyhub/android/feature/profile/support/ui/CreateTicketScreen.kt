package com.roamyhub.android.feature.profile.support.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.roamyhub.android.feature.profile.support.viewmodel.CreateTicketViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateTicketScreen(
    onNavigateBack: () -> Unit,
    onTicketCreated: (String) -> Unit,
    modifier: Modifier = Modifier,
    viewModel: CreateTicketViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsState()
    val ticketCreatedEvent by viewModel.ticketCreatedEvent.collectAsState()
    val snackbarHostState = remember { SnackbarHostState() }

    LaunchedEffect(uiState.error) {
        uiState.error?.let {
            snackbarHostState.showSnackbar(it)
            viewModel.clearError()
        }
    }

    LaunchedEffect(ticketCreatedEvent) {
        ticketCreatedEvent?.let {
            viewModel.clearTicketCreatedEvent()
            onTicketCreated(it)
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Create Support Ticket") },
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
            OutlinedTextField(
                value = uiState.subject,
                onValueChange = viewModel::onSubjectChange,
                label = { Text("Subject") },
                modifier = Modifier.fillMaxWidth(),
                singleLine = true,
                enabled = !uiState.isSubmitting,
                supportingText = { Text("Minimum 5 characters") }
            )

            OutlinedTextField(
                value = uiState.message,
                onValueChange = viewModel::onMessageChange,
                label = { Text("Message") },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                enabled = !uiState.isSubmitting,
                supportingText = { Text("Describe your issue in detail (minimum 10 characters)") }
            )

            Button(
                onClick = viewModel::submitTicket,
                modifier = Modifier.fillMaxWidth(),
                enabled = uiState.isValid() && !uiState.isSubmitting
            ) {
                if (uiState.isSubmitting) {
                    CircularProgressIndicator(modifier = Modifier.padding(end = 8.dp))
                }
                Text(if (uiState.isSubmitting) "Creating..." else "Create Ticket")
            }
        }
    }
}
