package com.roamyhub.android.core.network.interceptor

import okhttp3.logging.HttpLoggingInterceptor
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Factory for creating HTTP logging interceptor
 *
 * Provides different logging levels based on build configuration:
 * - Debug builds: BODY level (logs headers and body)
 * - Release builds: NONE (no logging for production)
 */
@Singleton
class LoggingInterceptorFactory @Inject constructor() {

    /**
     * Creates a logging interceptor with appropriate level
     */
    fun create(isDebug: Boolean): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().apply {
            level = if (isDebug) {
                HttpLoggingInterceptor.Level.BODY
            } else {
                HttpLoggingInterceptor.Level.NONE
            }
        }
    }
}
