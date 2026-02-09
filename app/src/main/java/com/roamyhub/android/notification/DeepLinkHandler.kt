package com.roamyhub.android.notification

import android.net.Uri
import timber.log.Timber

/**
 * Handler for deep link navigation
 * Parses deep link URIs and returns navigation routes
 */
object DeepLinkHandler {

    /**
     * Handle a deep link URI and return the navigation route
     * @param uri The deep link URI (e.g., roamyhub://app/order/123)
     * @return The navigation route, or null if the URI is invalid
     */
    fun handleDeepLink(uri: Uri): String? {
        if (uri.scheme != "roamyhub" || uri.host != "app") {
            Timber.w("Invalid deep link scheme or host: $uri")
            return null
        }

        val pathSegments = uri.pathSegments
        if (pathSegments.isEmpty()) {
            Timber.w("Empty path segments in deep link: $uri")
            return null
        }

        return when (pathSegments[0]) {
            "order" -> {
                val orderId = pathSegments.getOrNull(1)
                if (orderId != null) {
                    "orders/$orderId"
                } else {
                    "orders"
                }
            }
            "esim" -> {
                val esimId = pathSegments.getOrNull(1)
                if (esimId != null) {
                    "esims/$esimId"
                } else {
                    "esims"
                }
            }
            "support" -> {
                val ticketId = pathSegments.getOrNull(1)
                if (ticketId != null) {
                    "support/$ticketId"
                } else {
                    "support"
                }
            }
            "browse" -> {
                "browse"
            }
            "plan" -> {
                val planId = pathSegments.getOrNull(1)
                if (planId != null) {
                    "plan/$planId"
                } else {
                    "browse"
                }
            }
            "country" -> {
                val countryCode = pathSegments.getOrNull(1)
                if (countryCode != null) {
                    "country/$countryCode"
                } else {
                    "browse"
                }
            }
            "region" -> {
                val regionCode = pathSegments.getOrNull(1)
                if (regionCode != null) {
                    "region/$regionCode"
                } else {
                    "browse"
                }
            }
            "profile" -> {
                "profile"
            }
            "rewards" -> {
                "rewards"
            }
            "settings" -> {
                "settings"
            }
            else -> {
                Timber.w("Unknown deep link path: ${pathSegments[0]}")
                null
            }
        }
    }
}
