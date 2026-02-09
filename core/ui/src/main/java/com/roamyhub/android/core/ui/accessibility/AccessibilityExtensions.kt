package com.roamyhub.android.core.ui.accessibility

import androidx.compose.foundation.clickable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.stateDescription

/**
 * Extension functions for improved accessibility in Compose
 */

/**
 * Make an element clickable with an accessible label
 * Combines clickable behavior with semantic content description
 *
 * @param label The accessibility label describing the action
 * @param onClick The click handler
 */
fun Modifier.accessibleClickable(
    label: String,
    onClick: () -> Unit
) = this
    .semantics { contentDescription = label }
    .clickable(onClick = onClick)

/**
 * Add an accessibility action description
 * Used to describe dynamic state or available actions
 *
 * @param action The description of the action or state
 */
fun Modifier.accessibleAction(action: String) = this.semantics {
    stateDescription = action
}

/**
 * Add semantic content description for screen readers
 *
 * @param description The content description
 */
fun Modifier.accessibleDescription(description: String) = this.semantics {
    contentDescription = description
}

/**
 * Add semantic state description for dynamic content
 *
 * @param state The state description
 */
fun Modifier.accessibleState(state: String) = this.semantics {
    stateDescription = state
}
