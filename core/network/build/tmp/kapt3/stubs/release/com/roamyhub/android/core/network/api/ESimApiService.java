package com.roamyhub.android.core.network.api;

/**
 * Retrofit API service for eSIM endpoints
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/roamyhub/android/core/network/api/ESimApiService;", "", "deleteESim", "Lcom/roamyhub/android/core/network/model/DeleteESimResponseDto;", "esimId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getESimById", "Lcom/roamyhub/android/core/network/model/ESimResponseDto;", "getESimQrCode", "Lcom/roamyhub/android/core/network/model/QrCodeResponseDto;", "getQrCodeData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserESims", "Lcom/roamyhub/android/core/network/model/ESimsResponseDto;", "userId", "network_release"})
public abstract interface ESimApiService {
    
    /**
     * Get all eSIMs for a user
     */
    @retrofit2.http.GET(value = "esims/user/{userId}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUserESims(@retrofit2.http.Path(value = "userId")
    @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.ESimsResponseDto> $completion);
    
    /**
     * Get a specific eSIM by ID
     */
    @retrofit2.http.GET(value = "esims/{id}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getESimById(@retrofit2.http.Path(value = "id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String esimId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.ESimResponseDto> $completion);
    
    /**
     * Delete an eSIM
     */
    @retrofit2.http.DELETE(value = "esims/{id}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteESim(@retrofit2.http.Path(value = "id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String esimId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.DeleteESimResponseDto> $completion);
    
    /**
     * Get QR code for an eSIM
     */
    @retrofit2.http.GET(value = "esims/{esimId}/qrcode")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getESimQrCode(@retrofit2.http.Path(value = "esimId")
    @org.jetbrains.annotations.NotNull()
    java.lang.String esimId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.QrCodeResponseDto> $completion);
    
    /**
     * Get QR code data (alternative endpoint)
     */
    @retrofit2.http.GET(value = "qrcode/data")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getQrCodeData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.QrCodeResponseDto> $completion);
}