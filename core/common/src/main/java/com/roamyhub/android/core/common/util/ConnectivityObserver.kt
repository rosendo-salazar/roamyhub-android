package com.roamyhub.android.core.common.util

import kotlinx.coroutines.flow.Flow

/**
 * Interface for observing network connectivity state
 */
interface ConnectivityObserver {
    /**
     * Observes the current network connectivity status
     * @return Flow of NetworkStatus updates
     */
    fun observe(): Flow<NetworkStatus>

    /**
     * Gets the current network status synchronously
     * @return Current NetworkStatus
     */
    fun currentStatus(): NetworkStatus

    enum class NetworkStatus {
        /**
         * Network is available and connected
         */
        Available,

        /**
         * Network is unavailable or disconnected
         */
        Unavailable,

        /**
         * Network connection is being established
         */
        Connecting,

        /**
         * Network connection was lost
         */
        Lost
    }
}
