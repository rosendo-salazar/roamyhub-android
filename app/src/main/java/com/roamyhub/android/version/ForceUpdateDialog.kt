package com.roamyhub.android.version

import android.content.Intent
import android.net.Uri
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

/**
 * Dialog for displaying version update prompts
 */
@Composable
fun ForceUpdateDialog(
    versionStatus: VersionStatus,
    onDismiss: () -> Unit
) {
    val context = LocalContext.current

    when (versionStatus) {
        is VersionStatus.ForceUpdate -> {
            AlertDialog(
                onDismissRequest = { /* Not dismissible */ },
                title = {
                    Text(
                        text = "Update Required",
                        style = MaterialTheme.typography.headlineSmall
                    )
                },
                text = {
                    Text(
                        text = versionStatus.message,
                        style = MaterialTheme.typography.bodyMedium
                    )
                },
                confirmButton = {
                    Button(onClick = {
                        // Open Play Store
                        val intent = Intent(Intent.ACTION_VIEW).apply {
                            data = Uri.parse("https://play.google.com/store/apps/details?id=${context.packageName}")
                            setPackage("com.android.vending")
                        }
                        context.startActivity(intent)
                    }) {
                        Text("Update Now")
                    }
                }
            )
        }

        is VersionStatus.UpdateAvailable -> {
            AlertDialog(
                onDismissRequest = onDismiss,
                title = {
                    Text(
                        text = "Update Available",
                        style = MaterialTheme.typography.headlineSmall
                    )
                },
                text = {
                    Text(
                        text = "Version ${versionStatus.latestVersion} is now available.\n\n${versionStatus.releaseNotes}",
                        style = MaterialTheme.typography.bodyMedium
                    )
                },
                confirmButton = {
                    Button(onClick = {
                        // Open Play Store
                        val intent = Intent(Intent.ACTION_VIEW).apply {
                            data = Uri.parse("https://play.google.com/store/apps/details?id=${context.packageName}")
                            setPackage("com.android.vending")
                        }
                        context.startActivity(intent)
                        onDismiss()
                    }) {
                        Text("Update")
                    }
                },
                dismissButton = {
                    TextButton(onClick = onDismiss) {
                        Text("Later")
                    }
                }
            )
        }

        VersionStatus.UpToDate -> {
            // No dialog needed
        }
    }
}
