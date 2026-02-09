package com.roamyhub.android.core.common.extensions

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onStart
import com.roamyhub.android.core.common.result.Resource

/**
 * Wraps Flow emissions in Resource.Success, errors in Resource.Error,
 * and optionally emits Resource.Loading at the start
 */
fun <T> Flow<T>.asResource(emitLoading: Boolean = true): Flow<Resource<T>> {
    return this
        .map<T, Resource<T>> { Resource.Success(it) }
        .onStart { if (emitLoading) emit(Resource.Loading()) }
        .catch { emit(Resource.Error(it.message ?: "An unknown error occurred")) }
}

/**
 * Catches exceptions and emits a default value instead
 */
fun <T> Flow<T>.catchWithDefault(defaultValue: T): Flow<T> {
    return this.catch { emit(defaultValue) }
}

/**
 * Catches exceptions and emits null instead
 */
fun <T> Flow<T>.catchWithNull(): Flow<T?> {
    return this
        .map<T, T?> { it }
        .catch { emit(null) }
}
