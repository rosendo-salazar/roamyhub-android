package com.roamyhub.android.error

import retrofit2.HttpException
import java.io.IOException
import java.net.ConnectException
import java.net.SocketTimeoutException
import java.net.UnknownHostException

/**
 * Global error handler for mapping exceptions to user-friendly messages
 */
object GlobalErrorHandler {

    /**
     * Map a throwable to a user-friendly error message
     * @param throwable The exception to map
     * @return A user-friendly error message
     */
    fun mapToUserMessage(throwable: Throwable): String {
        return when (throwable) {
            is HttpException -> handleHttpException(throwable)
            is UnknownHostException -> "No internet connection. Please check your network."
            is ConnectException -> "Unable to connect to server. Please try again later."
            is SocketTimeoutException -> "Connection timed out. Please try again."
            is IOException -> "Network error. Please check your connection."
            is kotlinx.serialization.SerializationException -> "Data parsing error. Please try again."
            else -> "An unexpected error occurred: ${throwable.message ?: "Unknown error"}"
        }
    }

    /**
     * Handle HTTP exceptions based on status code
     */
    private fun handleHttpException(exception: HttpException): String {
        return when (exception.code()) {
            400 -> "Invalid request. Please check your input."
            401 -> "Authentication required. Please log in again."
            403 -> "Access denied. You don't have permission to access this resource."
            404 -> "Resource not found."
            408 -> "Request timed out. Please try again."
            429 -> "Too many requests. Please slow down."
            500 -> "Server error. Please try again later."
            502 -> "Bad gateway. Please try again later."
            503 -> "Service unavailable. Please try again later."
            504 -> "Gateway timeout. Please try again later."
            else -> "Network error (${exception.code()}): ${exception.message()}"
        }
    }

    /**
     * Check if an error is a network error
     */
    fun isNetworkError(throwable: Throwable): Boolean {
        return throwable is IOException ||
                throwable is UnknownHostException ||
                throwable is ConnectException ||
                throwable is SocketTimeoutException
    }

    /**
     * Check if an error is an authentication error
     */
    fun isAuthError(throwable: Throwable): Boolean {
        return throwable is HttpException && (throwable.code() == 401 || throwable.code() == 403)
    }
}
