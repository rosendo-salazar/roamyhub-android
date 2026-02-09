package com.roamyhub.android.core.data.repository;

/**
 * Implementation of ConfigRepository.
 *
 * Handles app configuration and legal information.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0096@\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u0096@\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/roamyhub/android/core/data/repository/ConfigRepositoryImpl;", "Lcom/roamyhub/android/core/domain/repository/ConfigRepository;", "publicApiService", "Lcom/roamyhub/android/core/network/api/PublicApiService;", "(Lcom/roamyhub/android/core/network/api/PublicApiService;)V", "checkVersion", "Lcom/roamyhub/android/core/common/result/Resource;", "Lcom/roamyhub/android/core/domain/model/config/AppVersion;", "currentVersion", "", "platform", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLegalLinks", "Lcom/roamyhub/android/core/domain/model/config/LegalLinks;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "data_debug"})
public final class ConfigRepositoryImpl implements com.roamyhub.android.core.domain.repository.ConfigRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.network.api.PublicApiService publicApiService = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "ConfigRepositoryImpl";
    @org.jetbrains.annotations.NotNull()
    public static final com.roamyhub.android.core.data.repository.ConfigRepositoryImpl.Companion Companion = null;
    
    @javax.inject.Inject()
    public ConfigRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.network.api.PublicApiService publicApiService) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object checkVersion(@org.jetbrains.annotations.NotNull()
    java.lang.String currentVersion, @org.jetbrains.annotations.NotNull()
    java.lang.String platform, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<com.roamyhub.android.core.domain.model.config.AppVersion>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getLegalLinks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<com.roamyhub.android.core.domain.model.config.LegalLinks>> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/roamyhub/android/core/data/repository/ConfigRepositoryImpl$Companion;", "", "()V", "TAG", "", "data_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}