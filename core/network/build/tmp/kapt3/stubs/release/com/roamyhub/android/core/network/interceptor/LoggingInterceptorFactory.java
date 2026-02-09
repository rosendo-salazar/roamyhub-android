package com.roamyhub.android.core.network.interceptor;

/**
 * Factory for creating HTTP logging interceptor
 *
 * Provides different logging levels based on build configuration:
 * - Debug builds: BODY level (logs headers and body)
 * - Release builds: NONE (no logging for production)
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/roamyhub/android/core/network/interceptor/LoggingInterceptorFactory;", "", "()V", "create", "Lokhttp3/logging/HttpLoggingInterceptor;", "isDebug", "", "network_release"})
public final class LoggingInterceptorFactory {
    
    @javax.inject.Inject()
    public LoggingInterceptorFactory() {
        super();
    }
    
    /**
     * Creates a logging interceptor with appropriate level
     */
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.logging.HttpLoggingInterceptor create(boolean isDebug) {
        return null;
    }
}