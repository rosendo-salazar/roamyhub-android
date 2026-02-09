package com.roamyhub.android.review

import android.app.Activity
import android.content.Context
import com.google.android.play.core.review.ReviewManagerFactory
import com.roamyhub.android.core.data.local.PreferencesManager
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext
import timber.log.Timber
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Manager for requesting in-app reviews
 * Uses Google Play In-App Review API to prompt users for ratings
 */
@Singleton
class InAppReviewManager @Inject constructor(
    @ApplicationContext private val context: Context,
    private val preferencesManager: PreferencesManager
) {
    private val reviewManager = ReviewManagerFactory.create(context)

    companion object {
        private const val MIN_PURCHASES_FOR_REVIEW = 3
        private const val MIN_DAYS_BETWEEN_PROMPTS = 90
        private const val KEY_LAST_REVIEW_PROMPT = "last_review_prompt"
        private const val KEY_PURCHASE_COUNT = "purchase_count"
    }

    /**
     * Request an in-app review
     * Only prompts if conditions are met:
     * - User has made at least 3 successful purchases
     * - User hasn't been prompted in the last 90 days
     * - The API returns a successful review info
     *
     * @param activity The current activity (required by Play Core API)
     */
    suspend fun requestReview(activity: Activity) {
        try {
            // Check if enough time has passed since last prompt
            if (!shouldPromptReview()) {
                Timber.d("Not enough time has passed since last review prompt")
                return
            }

            // Request the review flow
            val reviewInfo = withContext(Dispatchers.IO) {
                reviewManager.requestReviewFlow().await()
            }

            // Launch the review flow
            withContext(Dispatchers.Main) {
                reviewManager.launchReviewFlow(activity, reviewInfo).await()
            }

            // Update last prompt time
            preferencesManager.putLong(KEY_LAST_REVIEW_PROMPT, System.currentTimeMillis())
            Timber.d("In-app review flow completed")
        } catch (e: Exception) {
            // Review flow failed, but this is not critical
            Timber.e(e, "Failed to launch in-app review flow")
        }
    }

    /**
     * Increment the purchase count
     * Should be called after each successful purchase
     */
    suspend fun incrementPurchaseCount() {
        val currentCount = preferencesManager.getInt(KEY_PURCHASE_COUNT, 0).first()
        preferencesManager.putInt(KEY_PURCHASE_COUNT, currentCount + 1)
        Timber.d("Purchase count incremented to ${currentCount + 1}")
    }

    /**
     * Check if we should prompt for a review
     */
    private suspend fun shouldPromptReview(): Boolean {
        // Check purchase count
        val purchaseCount = preferencesManager.getInt(KEY_PURCHASE_COUNT, 0).first()
        if (purchaseCount < MIN_PURCHASES_FOR_REVIEW) {
            Timber.d("Not enough purchases ($purchaseCount < $MIN_PURCHASES_FOR_REVIEW)")
            return false
        }

        // Check time since last prompt
        val lastPromptTime = preferencesManager.getLong(KEY_LAST_REVIEW_PROMPT, 0).first()
        val daysSinceLastPrompt = (System.currentTimeMillis() - lastPromptTime) / (1000 * 60 * 60 * 24)
        if (daysSinceLastPrompt < MIN_DAYS_BETWEEN_PROMPTS) {
            Timber.d("Not enough time since last prompt ($daysSinceLastPrompt < $MIN_DAYS_BETWEEN_PROMPTS days)")
            return false
        }

        return true
    }
}
