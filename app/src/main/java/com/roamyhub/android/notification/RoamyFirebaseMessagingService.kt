package com.roamyhub.android.notification

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber
import javax.inject.Inject

/**
 * Firebase Cloud Messaging service for handling push notifications
 */
@AndroidEntryPoint
class RoamyFirebaseMessagingService : FirebaseMessagingService() {

    @Inject
    lateinit var notificationHelper: NotificationHelper

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)

        Timber.d("FCM message received from: ${remoteMessage.from}")

        // Extract notification data
        val data = remoteMessage.data
        val notificationType = data["type"] ?: "promotional"
        val title = remoteMessage.notification?.title ?: data["title"] ?: "RoamyHub"
        val message = remoteMessage.notification?.body ?: data["message"] ?: ""

        // Handle different notification types
        when (notificationType) {
            "esim_ready" -> {
                val esimId = data["esim_id"] ?: return
                notificationHelper.showESimNotification(esimId, title, message)
            }
            "esim_activated" -> {
                val esimId = data["esim_id"] ?: return
                notificationHelper.showESimNotification(esimId, title, message)
            }
            "order_complete" -> {
                val orderId = data["order_id"] ?: return
                notificationHelper.showOrderNotification(orderId, title, message)
            }
            "order_processing" -> {
                val orderId = data["order_id"] ?: return
                notificationHelper.showOrderNotification(orderId, title, message)
            }
            "support_reply" -> {
                val ticketId = data["ticket_id"] ?: return
                notificationHelper.showSupportNotification(ticketId, title, message)
            }
            "support_status_changed" -> {
                val ticketId = data["ticket_id"] ?: return
                notificationHelper.showSupportNotification(ticketId, title, message)
            }
            "promotional" -> {
                val deepLink = data["deep_link"]
                notificationHelper.showPromotionalNotification(title, message, deepLink)
            }
            else -> {
                Timber.w("Unknown notification type: $notificationType")
                notificationHelper.showPromotionalNotification(title, message)
            }
        }
    }

    override fun onNewToken(token: String) {
        super.onNewToken(token)
        Timber.d("FCM token refreshed: $token")

        // TODO: Send token to backend via ProfileRepository
        // This should be implemented when the backend endpoint is ready
        // Example: profileRepository.updateFcmToken(token)
    }
}
