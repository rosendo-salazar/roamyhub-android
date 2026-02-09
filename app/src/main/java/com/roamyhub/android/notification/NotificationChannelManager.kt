package com.roamyhub.android.notification

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import timber.log.Timber

/**
 * Manager for creating and managing notification channels
 * Notification channels are required for Android 8.0 (API 26) and higher
 */
object NotificationChannelManager {

    const val CHANNEL_ORDERS = "orders"
    const val CHANNEL_ESIMS = "esims"
    const val CHANNEL_SUPPORT = "support"
    const val CHANNEL_PROMOTIONAL = "promotional"

    /**
     * Create all notification channels
     * Should be called on app startup
     */
    fun createChannels(context: Context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

            // Orders channel - High importance
            val ordersChannel = NotificationChannel(
                CHANNEL_ORDERS,
                "Orders",
                NotificationManager.IMPORTANCE_HIGH
            ).apply {
                description = "Notifications about order status and confirmations"
                enableVibration(true)
                setShowBadge(true)
            }

            // eSIMs channel - High importance
            val esimsChannel = NotificationChannel(
                CHANNEL_ESIMS,
                "eSIMs",
                NotificationManager.IMPORTANCE_HIGH
            ).apply {
                description = "Notifications about eSIM activation and status"
                enableVibration(true)
                setShowBadge(true)
            }

            // Support channel - Default importance
            val supportChannel = NotificationChannel(
                CHANNEL_SUPPORT,
                "Support",
                NotificationManager.IMPORTANCE_DEFAULT
            ).apply {
                description = "Notifications about support ticket updates"
                setShowBadge(true)
            }

            // Promotional channel - Low importance
            val promotionalChannel = NotificationChannel(
                CHANNEL_PROMOTIONAL,
                "Promotions",
                NotificationManager.IMPORTANCE_LOW
            ).apply {
                description = "Promotional offers and updates"
                setShowBadge(false)
            }

            notificationManager.createNotificationChannels(
                listOf(ordersChannel, esimsChannel, supportChannel, promotionalChannel)
            )

            Timber.d("Notification channels created successfully")
        }
    }
}
