package com.roamyhub.android.core.common.constants

object AppConstants {
    // Points/Rewards System
    const val POINTS_PER_DOLLAR_RATIO = 100 // 100 points = $1
    const val MINIMUM_REDEEMABLE_POINTS = 25
    const val REFERRAL_POINTS_REWARD = 500

    // Pagination
    const val DEFAULT_PAGE_SIZE = 20
    const val DEFAULT_PAGE = 1

    // QR Code
    const val QR_CODE_SIZE = 512 // pixels

    // Support
    const val MAX_TICKET_MESSAGE_LENGTH = 1000
    const val MAX_TICKET_SUBJECT_LENGTH = 100

    // App Info
    const val APP_NAME = "RoamyHub"
    const val SUPPORT_EMAIL = "support@flyroamy.com"

    // Data Usage
    const val BYTES_PER_MB = 1024 * 1024L
    const val BYTES_PER_GB = 1024 * 1024 * 1024L

    // Date formats
    const val DATE_FORMAT_DISPLAY = "MMM dd, yyyy"
    const val DATE_FORMAT_FULL = "MMMM dd, yyyy"
    const val DATE_TIME_FORMAT = "MMM dd, yyyy HH:mm"
    const val TIME_FORMAT = "HH:mm"

    // Network
    const val MAX_RETRY_ATTEMPTS = 3
    const val RETRY_DELAY_MS = 1000L

    // Session
    const val TOKEN_REFRESH_BUFFER_MINUTES = 5
    const val SESSION_TIMEOUT_MINUTES = 30
}
