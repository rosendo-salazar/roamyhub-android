package com.roamyhub.android.feature.purchase.payment

import android.content.Context
import androidx.activity.ComponentActivity
import com.roamyhub.android.core.domain.model.payment.PaymentConfig
import com.roamyhub.android.core.domain.model.payment.StripeSession
import com.stripe.android.PaymentConfiguration
import com.stripe.android.paymentsheet.PaymentSheet
import com.stripe.android.paymentsheet.PaymentSheetResult
import javax.inject.Inject

/**
 * Manager class for Stripe payment integration.
 *
 * Handles initialization and presentation of Stripe PaymentSheet
 * for collecting payment from users.
 */
class StripePaymentManager @Inject constructor() {

    private var paymentSheet: PaymentSheet? = null
    private var isInitialized = false

    /**
     * Initialize Stripe with payment configuration
     *
     * @param context Application or activity context
     * @param paymentConfig Configuration containing Stripe publishable key
     */
    fun initialize(context: Context, paymentConfig: PaymentConfig) {
        if (isInitialized) return

        PaymentConfiguration.init(
            context = context,
            publishableKey = paymentConfig.stripePublishableKey
        )

        isInitialized = true
    }

    /**
     * Create PaymentSheet instance for an activity
     *
     * @param activity The activity that will present the payment sheet
     * @param onResult Callback invoked with the payment result
     */
    fun createPaymentSheet(
        activity: ComponentActivity,
        onResult: (PaymentResult) -> Unit
    ) {
        paymentSheet = PaymentSheet(activity) { result ->
            handlePaymentSheetResult(result, onResult)
        }
    }

    /**
     * Present the payment sheet to collect payment
     *
     * @param stripeSession Session data from backend containing client secret
     */
    fun presentPaymentSheet(stripeSession: StripeSession) {
        if (!stripeSession.isComplete()) {
            throw IllegalStateException("Stripe session is incomplete")
        }

        val paymentSheet = this.paymentSheet
            ?: throw IllegalStateException("PaymentSheet not created. Call createPaymentSheet first.")

        val configuration = PaymentSheet.Configuration(
            merchantDisplayName = "RoamyHub",
            customer = stripeSession.customerId?.let { customerId ->
                PaymentSheet.CustomerConfiguration(
                    id = customerId,
                    ephemeralKeySecret = stripeSession.ephemeralKey ?: ""
                )
            },
            allowsDelayedPaymentMethods = false
        )

        paymentSheet.presentWithPaymentIntent(
            paymentIntentClientSecret = stripeSession.clientSecret,
            configuration = configuration
        )
    }

    /**
     * Handle PaymentSheet result and convert to PaymentResult
     */
    private fun handlePaymentSheetResult(
        result: PaymentSheetResult,
        onResult: (PaymentResult) -> Unit
    ) {
        when (result) {
            is PaymentSheetResult.Completed -> {
                // Payment successful - orderId will be set by backend webhook
                // For now, we need to poll or wait for backend to confirm
                onResult(PaymentResult.Success(orderId = "pending"))
            }

            is PaymentSheetResult.Canceled -> {
                onResult(PaymentResult.Cancelled)
            }

            is PaymentSheetResult.Failed -> {
                val errorMessage = result.error.message ?: "Payment failed"
                onResult(PaymentResult.Failed(errorMessage, result.error))
            }
        }
    }

    /**
     * Clean up resources
     */
    fun cleanup() {
        paymentSheet = null
    }
}
