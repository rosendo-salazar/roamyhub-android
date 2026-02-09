package com.roamyhub.android.core.common.constants

object ApiConstants {
    // Base URLs - Note: BuildConfig.API_BASE_URL is used for actual API calls
    // These are fallback values
    const val BASE_URL_STAGING = "https://api-stage.flyroamy.com/api"
    const val BASE_URL_PRODUCTION = "https://api.flyroamy.com/api"

    // Timeouts
    const val CONNECT_TIMEOUT_SECONDS = 30L
    const val READ_TIMEOUT_SECONDS = 30L
    const val WRITE_TIMEOUT_SECONDS = 30L

    // Headers
    const val HEADER_AUTHORIZATION = "Authorization"
    const val HEADER_CONTENT_TYPE = "Content-Type"
    const val HEADER_ACCEPT = "Accept"
    const val HEADER_USER_AGENT = "User-Agent"

    // Content types
    const val CONTENT_TYPE_JSON = "application/json"

    // Cache
    const val CACHE_SIZE = 10 * 1024 * 1024L // 10 MB
    const val CACHE_MAX_AGE = 60 * 2 // 2 minutes
    const val CACHE_MAX_STALE = 60 * 60 * 24 * 7 // 1 week
}
