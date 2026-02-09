package com.roamyhub.android.core.data.repository;

/**
 * Implementation of DeviceRepository.
 *
 * Handles device compatibility information.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J.\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@\u00a2\u0006\u0002\u0010\fJ\"\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u000e\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/roamyhub/android/core/data/repository/DeviceRepositoryImpl;", "Lcom/roamyhub/android/core/domain/repository/DeviceRepository;", "publicApiService", "Lcom/roamyhub/android/core/network/api/PublicApiService;", "(Lcom/roamyhub/android/core/network/api/PublicApiService;)V", "getCompatibleDevices", "Lcom/roamyhub/android/core/common/result/Resource;", "", "Lcom/roamyhub/android/core/domain/model/device/Device;", "manufacturer", "", "operatingSystem", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchDevices", "query", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "data_debug"})
public final class DeviceRepositoryImpl implements com.roamyhub.android.core.domain.repository.DeviceRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.network.api.PublicApiService publicApiService = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "DeviceRepositoryImpl";
    @org.jetbrains.annotations.NotNull()
    public static final com.roamyhub.android.core.data.repository.DeviceRepositoryImpl.Companion Companion = null;
    
    @javax.inject.Inject()
    public DeviceRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.network.api.PublicApiService publicApiService) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCompatibleDevices(@org.jetbrains.annotations.Nullable()
    java.lang.String manufacturer, @org.jetbrains.annotations.Nullable()
    java.lang.String operatingSystem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<? extends java.util.List<com.roamyhub.android.core.domain.model.device.Device>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object searchDevices(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.common.result.Resource<? extends java.util.List<com.roamyhub.android.core.domain.model.device.Device>>> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/roamyhub/android/core/data/repository/DeviceRepositoryImpl$Companion;", "", "()V", "TAG", "", "data_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}