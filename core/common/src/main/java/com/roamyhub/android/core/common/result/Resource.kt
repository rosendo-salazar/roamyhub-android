package com.roamyhub.android.core.common.result

/**
 * A generic sealed class for handling loading states, success, and errors with optional data.
 */
sealed class Resource<out T> {
    /**
     * Loading state, optionally carrying data from a previous successful state
     */
    data class Loading<T>(val data: T? = null) : Resource<T>()

    /**
     * Success state with data
     */
    data class Success<T>(val data: T) : Resource<T>()

    /**
     * Error state with message and optional data from a previous successful state
     */
    data class Error<T>(val message: String, val data: T? = null) : Resource<T>()
}

/**
 * Returns true if this Resource is in a Loading state
 */
fun <T> Resource<T>.isLoading(): Boolean = this is Resource.Loading

/**
 * Returns true if this Resource is in a Success state
 */
fun <T> Resource<T>.isSuccess(): Boolean = this is Resource.Success

/**
 * Returns true if this Resource is in an Error state
 */
fun <T> Resource<T>.isError(): Boolean = this is Resource.Error

/**
 * Returns the data if available, regardless of state
 */
fun <T> Resource<T>.dataOrNull(): T? = when (this) {
    is Resource.Success -> data
    is Resource.Loading -> data
    is Resource.Error -> data
}

/**
 * Maps the data of a Resource to a new type
 */
fun <T, R> Resource<T>.map(transform: (T) -> R): Resource<R> = when (this) {
    is Resource.Loading -> Resource.Loading(data?.let(transform))
    is Resource.Success -> Resource.Success(transform(data))
    is Resource.Error -> Resource.Error(message, data?.let(transform))
}
