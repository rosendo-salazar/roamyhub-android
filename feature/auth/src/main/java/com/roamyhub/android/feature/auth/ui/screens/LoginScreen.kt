package com.roamyhub.android.feature.auth.ui.screens

import android.content.Context
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.credentials.CredentialManager
import androidx.credentials.GetCredentialRequest
import androidx.credentials.exceptions.GetCredentialException
import com.google.android.libraries.identity.googleid.GetGoogleIdOption
import com.google.android.libraries.identity.googleid.GoogleIdTokenCredential
import com.roamyhub.android.core.ui.R
import com.roamyhub.android.feature.auth.ui.components.AuthHeader
import com.roamyhub.android.feature.auth.ui.components.SocialLoginButton
import com.roamyhub.android.feature.auth.viewmodel.LoginViewModel
import kotlinx.coroutines.launch

/**
 * Login screen
 *
 * Allows users to sign in with email/password or Google.
 *
 * @param viewModel Login view model
 * @param onNavigateToSignup Callback to navigate to signup
 * @param onNavigateToForgotPassword Callback to navigate to forgot password
 * @param onNavigateToHome Callback to navigate to home after successful login
 */
@Composable
fun LoginScreen(
    viewModel: LoginViewModel,
    onNavigateToSignup: () -> Unit,
    onNavigateToForgotPassword: () -> Unit,
    onNavigateToHome: () -> Unit,
    modifier: Modifier = Modifier
) {
    val uiState by viewModel.uiState.collectAsState()
    val focusManager = LocalFocusManager.current
    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()
    val context = LocalContext.current

    var passwordVisible by remember { mutableStateOf(false) }

    // Handle navigation events
    LaunchedEffect(Unit) {
        viewModel.navigationEvents.collect { event ->
            when (event) {
                is LoginViewModel.NavigationEvent.NavigateToHome -> onNavigateToHome()
                is LoginViewModel.NavigationEvent.NavigateToForgotPassword -> onNavigateToForgotPassword()
            }
        }
    }

    // Show error messages
    LaunchedEffect(uiState.error) {
        uiState.error?.let { error ->
            snackbarHostState.showSnackbar(error)
        }
    }

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },
        modifier = modifier
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(horizontal = 24.dp)
                .verticalScroll(rememberScrollState())
                .imePadding(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Spacer(modifier = Modifier.height(48.dp))

            AuthHeader(
                title = stringResource(R.string.login_title),
                subtitle = stringResource(R.string.login_subtitle)
            )

            Spacer(modifier = Modifier.height(32.dp))

            // Email field
            OutlinedTextField(
                value = uiState.email,
                onValueChange = viewModel::onEmailChange,
                label = { Text(stringResource(R.string.email)) },
                enabled = uiState.inputsEnabled,
                isError = !uiState.isEmailValid,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email,
                    imeAction = ImeAction.Next
                ),
                keyboardActions = KeyboardActions(
                    onNext = { focusManager.moveFocus(FocusDirection.Down) }
                ),
                singleLine = true,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Password field
            OutlinedTextField(
                value = uiState.password,
                onValueChange = viewModel::onPasswordChange,
                label = { Text(stringResource(R.string.password)) },
                enabled = uiState.inputsEnabled,
                isError = !uiState.isPasswordValid,
                visualTransformation = if (passwordVisible) {
                    VisualTransformation.None
                } else {
                    PasswordVisualTransformation()
                },
                trailingIcon = {
                    IconButton(onClick = { passwordVisible = !passwordVisible }) {
                        Icon(
                            imageVector = if (passwordVisible) {
                                Icons.Default.VisibilityOff
                            } else {
                                Icons.Default.Visibility
                            },
                            contentDescription = if (passwordVisible) {
                                "Hide password"
                            } else {
                                "Show password"
                            }
                        )
                    }
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password,
                    imeAction = ImeAction.Done
                ),
                keyboardActions = KeyboardActions(
                    onDone = {
                        focusManager.clearFocus()
                        if (uiState.isFormValid) {
                            viewModel.onLoginClick()
                        }
                    }
                ),
                singleLine = true,
                modifier = Modifier.fillMaxWidth()
            )

            // Forgot password link
            TextButton(
                onClick = { viewModel.onForgotPasswordClick() },
                enabled = uiState.inputsEnabled,
                modifier = Modifier.align(Alignment.End)
            ) {
                Text(stringResource(R.string.forgot_password))
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Sign in button
            Button(
                onClick = {
                    focusManager.clearFocus()
                    viewModel.onLoginClick()
                },
                enabled = uiState.isFormValid && uiState.inputsEnabled,
                modifier = Modifier.fillMaxWidth()
            ) {
                if (uiState.isLoading) {
                    CircularProgressIndicator(
                        color = MaterialTheme.colorScheme.onPrimary,
                        modifier = Modifier.padding(vertical = 4.dp)
                    )
                } else {
                    Text(
                        text = stringResource(R.string.sign_in),
                        modifier = Modifier.padding(vertical = 4.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Divider with "or"
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                HorizontalDivider(modifier = Modifier.weight(1f))
                Text(
                    text = stringResource(R.string.or),
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                HorizontalDivider(modifier = Modifier.weight(1f))
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Google Sign-In button
            SocialLoginButton(
                onClick = {
                    scope.launch {
                        handleGoogleSignIn(context, viewModel, snackbarHostState)
                    }
                },
                isLoading = uiState.isLoading
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Sign up link
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = stringResource(R.string.dont_have_account),
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                TextButton(
                    onClick = onNavigateToSignup,
                    enabled = uiState.inputsEnabled
                ) {
                    Text(stringResource(R.string.sign_up))
                }
            }

            Spacer(modifier = Modifier.height(48.dp))
        }
    }
}

/**
 * Handle Google Sign-In using Credential Manager API
 */
private suspend fun handleGoogleSignIn(
    context: Context,
    viewModel: LoginViewModel,
    snackbarHostState: SnackbarHostState
) {
    try {
        val credentialManager = CredentialManager.create(context)

        // Configure Google ID option
        val googleIdOption = GetGoogleIdOption.Builder()
            .setFilterByAuthorizedAccounts(false)
            .setServerClientId("YOUR_WEB_CLIENT_ID") // TODO: Replace with actual web client ID
            .build()

        val request = GetCredentialRequest.Builder()
            .addCredentialOption(googleIdOption)
            .build()

        val result = credentialManager.getCredential(
            context = context,
            request = request
        )

        val credential = result.credential
        if (credential is GoogleIdTokenCredential) {
            viewModel.onGoogleSignInClick(credential.idToken)
        } else {
            snackbarHostState.showSnackbar("Failed to sign in with Google")
        }
    } catch (e: GetCredentialException) {
        snackbarHostState.showSnackbar("Google Sign-In cancelled or failed")
    } catch (e: Exception) {
        snackbarHostState.showSnackbar("An error occurred during sign in")
    }
}
