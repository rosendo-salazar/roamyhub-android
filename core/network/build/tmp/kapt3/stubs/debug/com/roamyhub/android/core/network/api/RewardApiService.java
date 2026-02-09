package com.roamyhub.android.core.network.api;

/**
 * Retrofit API service for rewards and points endpoints
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u00a7@\u00a2\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/roamyhub/android/core/network/api/RewardApiService;", "", "calculateDiscount", "Lcom/roamyhub/android/core/network/model/CalculateDiscountResponseDto;", "request", "Lcom/roamyhub/android/core/network/model/CalculateDiscountRequestDto;", "(Lcom/roamyhub/android/core/network/model/CalculateDiscountRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMaxRedeemablePoints", "Lcom/roamyhub/android/core/network/model/MaxRedeemablePointsResponseDto;", "userId", "", "amount", "", "(Ljava/lang/String;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRewardsSummary", "Lcom/roamyhub/android/core/network/model/RewardsSummaryResponseDto;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "network_debug"})
public abstract interface RewardApiService {
    
    /**
     * Get rewards summary for a user
     */
    @retrofit2.http.GET(value = "rewards/{userId}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRewardsSummary(@retrofit2.http.Path(value = "userId")
    @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.RewardsSummaryResponseDto> $completion);
    
    /**
     * Get maximum redeemable points for a purchase amount
     */
    @retrofit2.http.GET(value = "profile/points/max-redeemable")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMaxRedeemablePoints(@retrofit2.http.Query(value = "userId")
    @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @retrofit2.http.Query(value = "amount")
    double amount, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.MaxRedeemablePointsResponseDto> $completion);
    
    /**
     * Calculate discount based on points redemption
     */
    @retrofit2.http.POST(value = "profile/points/calculate-discount")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object calculateDiscount(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.network.model.CalculateDiscountRequestDto request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.roamyhub.android.core.network.model.CalculateDiscountResponseDto> $completion);
}