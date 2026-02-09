package com.roamyhub.android.core.common.extensions

import com.roamyhub.android.core.common.result.Resource
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.retryWhen
import java.io.IOException
import kotlin.math.pow

/**
 * Extension functions for Flow
 */

/**
 * Retry a flow with exponential backoff
 * Useful for network requests that may fail transiently
 *
 * @param retries Maximum number of retry attempts (default: 3)
 * @param initialDelay Initial delay in milliseconds (default: 1000ms)
 * @param maxDelay Maximum delay in milliseconds (default: 10000ms)
 * @param factor Multiplier for exponential backoff (default: 2.0)
 */
fun <T> Flow<Resource<T>>.withRetry(
    retries: Int = 3,
    initialDelay: Long = 1000,
    maxDelay: Long = 10000,
    factor: Double = 2.0
): Flow<Resource<T>> = this.retryWhen { cause, attempt ->
    if (attempt < retries && cause is IOException) {
        val delayTime = (initialDelay * factor.pow(attempt.toDouble())).toLong()
            .coerceAtMost(maxDelay)
        delay(delayTime)
        true
    } else {
        false
    }
}

/**
 * Retry any flow with exponential backoff on IOException
 *
 * @param retries Maximum number of retry attempts (default: 3)
 * @param initialDelay Initial delay in milliseconds (default: 1000ms)
 * @param maxDelay Maximum delay in milliseconds (default: 10000ms)
 * @param factor Multiplier for exponential backoff (default: 2.0)
 */
fun <T> Flow<T>.retryWithBackoff(
    retries: Int = 3,
    initialDelay: Long = 1000,
    maxDelay: Long = 10000,
    factor: Double = 2.0
): Flow<T> = this.retryWhen { cause, attempt ->
    if (attempt < retries && cause is IOException) {
        val delayTime = (initialDelay * factor.pow(attempt.toDouble())).toLong()
            .coerceAtMost(maxDelay)
        delay(delayTime)
        true
    } else {
        false
    }
}
