package com.roamyhub.android.notification

import android.app.Notification
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.core.app.NotificationCompat
import com.roamyhub.android.MainActivity
import com.roamyhub.android.R
import dagger.hilt.android.qualifiers.ApplicationContext
import timber.log.Timber
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Helper class for creating and displaying notifications
 */
@Singleton
class NotificationHelper @Inject constructor(
    @ApplicationContext private val context: Context
) {
    private val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
    private var notificationId = 1000

    /**
     * Show a notification for an order update
     */
    fun showOrderNotification(orderId: String, title: String, message: String) {
        val deepLink = "roamyhub://app/order/$orderId"
        val notification = createNotification(
            channelId = NotificationChannelManager.CHANNEL_ORDERS,
            title = title,
            message = message,
            deepLink = deepLink
        )
        notificationManager.notify(notificationId++, notification)
        Timber.d("Order notification shown: $orderId")
    }

    /**
     * Show a notification for an eSIM update
     */
    fun showESimNotification(esimId: String, title: String, message: String) {
        val deepLink = "roamyhub://app/esim/$esimId"
        val notification = createNotification(
            channelId = NotificationChannelManager.CHANNEL_ESIMS,
            title = title,
            message = message,
            deepLink = deepLink
        )
        notificationManager.notify(notificationId++, notification)
        Timber.d("eSIM notification shown: $esimId")
    }

    /**
     * Show a notification for a support ticket update
     */
    fun showSupportNotification(ticketId: String, title: String, message: String) {
        val deepLink = "roamyhub://app/support/$ticketId"
        val notification = createNotification(
            channelId = NotificationChannelManager.CHANNEL_SUPPORT,
            title = title,
            message = message,
            deepLink = deepLink
        )
        notificationManager.notify(notificationId++, notification)
        Timber.d("Support notification shown: $ticketId")
    }

    /**
     * Show a promotional notification
     */
    fun showPromotionalNotification(title: String, message: String, deepLink: String? = null) {
        val notification = createNotification(
            channelId = NotificationChannelManager.CHANNEL_PROMOTIONAL,
            title = title,
            message = message,
            deepLink = deepLink ?: "roamyhub://app/browse"
        )
        notificationManager.notify(notificationId++, notification)
        Timber.d("Promotional notification shown")
    }

    /**
     * Create a notification with the given parameters
     */
    private fun createNotification(
        channelId: String,
        title: String,
        message: String,
        deepLink: String
    ): Notification {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(deepLink)).apply {
            setClass(context, MainActivity::class.java)
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
        }

        val pendingIntent = PendingIntent.getActivity(
            context,
            notificationId,
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )

        return NotificationCompat.Builder(context, channelId)
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .setContentTitle(title)
            .setContentText(message)
            .setStyle(NotificationCompat.BigTextStyle().bigText(message))
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setAutoCancel(true)
            .setContentIntent(pendingIntent)
            .build()
    }
}
