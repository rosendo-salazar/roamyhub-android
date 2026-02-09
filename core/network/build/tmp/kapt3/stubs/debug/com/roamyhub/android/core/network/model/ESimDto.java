package com.roamyhub.android.core.network.model;

/**
 * DTO for eSIM data
 */
@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bN\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 u2\u00020\u0001:\u0002tuB\u0097\u0002\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u001a\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\u0002\u0010\u001fB\u00d9\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u00a2\u0006\u0002\u0010 J\t\u0010Q\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010S\u001a\u00020\u0010H\u00c6\u0003J\t\u0010T\u001a\u00020\u0010H\u00c6\u0003J\t\u0010U\u001a\u00020\u0010H\u00c6\u0003J\t\u0010V\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\\\u001a\u00020\u0005H\u00c6\u0003J\t\u0010]\u001a\u00020\u001aH\u00c6\u0003J\t\u0010^\u001a\u00020\u0005H\u00c6\u0003J\t\u0010_\u001a\u00020\u0005H\u00c6\u0003J\t\u0010`\u001a\u00020\u0005H\u00c6\u0003J\t\u0010a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010d\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u00f5\u0001\u0010g\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010h\u001a\u00020\u001a2\b\u0010i\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010j\u001a\u00020\u0003H\u00d6\u0001J\t\u0010k\u001a\u00020\u0005H\u00d6\u0001J&\u0010l\u001a\u00020m2\u0006\u0010n\u001a\u00020\u00002\u0006\u0010o\u001a\u00020p2\u0006\u0010q\u001a\u00020rH\u00c1\u0001\u00a2\u0006\u0002\bsR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\'\u0010\"\u001a\u0004\b(\u0010$R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\"\u001a\u0004\b*\u0010$R\u001c\u0010\u001b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\"\u001a\u0004\b,\u0010$R\u001c\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\"\u001a\u0004\b.\u0010/R\u001c\u0010\u0012\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\"\u001a\u0004\b1\u0010/R\u001c\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b2\u0010\"\u001a\u0004\b3\u0010/R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b4\u0010\"\u001a\u0004\b5\u0010$R\u001c\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b6\u0010\"\u001a\u0004\b7\u0010$R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b8\u0010\"\u001a\u0004\b9\u0010$R\u001c\u0010\u0019\u001a\u00020\u001a8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b:\u0010\"\u001a\u0004\b\u0019\u0010;R\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b<\u0010\"\u001a\u0004\b=\u0010$R\u001c\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b>\u0010\"\u001a\u0004\b?\u0010$R\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b@\u0010\"\u001a\u0004\bA\u0010$R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bB\u0010\"\u001a\u0004\bC\u0010$R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bD\u0010\"\u001a\u0004\bE\u0010$R\u001e\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bF\u0010\"\u001a\u0004\bG\u0010$R\u001c\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bH\u0010\"\u001a\u0004\bI\u0010$R\u001c\u0010\u001c\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bJ\u0010\"\u001a\u0004\bK\u0010$R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bL\u0010\"\u001a\u0004\bM\u0010$R\u001c\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bN\u0010\"\u001a\u0004\bO\u0010P\u00a8\u0006v"}, d2 = {"Lcom/roamyhub/android/core/network/model/ESimDto;", "", "seen1", "", "id", "", "userId", "orderId", "planId", "planName", "iccid", "status", "smdpAddress", "activationCode", "qrCodeUrl", "dataAmount", "", "dataUsed", "dataRemaining", "validityDays", "activatedAt", "expiresAt", "countryIso", "countryName", "regionKey", "isGlobal", "", "createdAt", "updatedAt", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getActivatedAt$annotations", "()V", "getActivatedAt", "()Ljava/lang/String;", "getActivationCode$annotations", "getActivationCode", "getCountryIso$annotations", "getCountryIso", "getCountryName$annotations", "getCountryName", "getCreatedAt$annotations", "getCreatedAt", "getDataAmount$annotations", "getDataAmount", "()J", "getDataRemaining$annotations", "getDataRemaining", "getDataUsed$annotations", "getDataUsed", "getExpiresAt$annotations", "getExpiresAt", "getIccid$annotations", "getIccid", "getId$annotations", "getId", "isGlobal$annotations", "()Z", "getOrderId$annotations", "getOrderId", "getPlanId$annotations", "getPlanId", "getPlanName$annotations", "getPlanName", "getQrCodeUrl$annotations", "getQrCodeUrl", "getRegionKey$annotations", "getRegionKey", "getSmdpAddress$annotations", "getSmdpAddress", "getStatus$annotations", "getStatus", "getUpdatedAt$annotations", "getUpdatedAt", "getUserId$annotations", "getUserId", "getValidityDays$annotations", "getValidityDays", "()I", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$network_debug", "$serializer", "Companion", "network_debug"})
public final class ESimDto {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String userId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String orderId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String planId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String planName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String iccid = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String status = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String smdpAddress = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String activationCode = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String qrCodeUrl = null;
    private final long dataAmount = 0L;
    private final long dataUsed = 0L;
    private final long dataRemaining = 0L;
    private final int validityDays = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String activatedAt = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String expiresAt = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String countryIso = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String countryName = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String regionKey = null;
    private final boolean isGlobal = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String createdAt = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String updatedAt = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.roamyhub.android.core.network.model.ESimDto.Companion Companion = null;
    
    public ESimDto(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String planId, @org.jetbrains.annotations.NotNull()
    java.lang.String planName, @org.jetbrains.annotations.NotNull()
    java.lang.String iccid, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.lang.String smdpAddress, @org.jetbrains.annotations.Nullable()
    java.lang.String activationCode, @org.jetbrains.annotations.Nullable()
    java.lang.String qrCodeUrl, long dataAmount, long dataUsed, long dataRemaining, int validityDays, @org.jetbrains.annotations.Nullable()
    java.lang.String activatedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String expiresAt, @org.jetbrains.annotations.Nullable()
    java.lang.String countryIso, @org.jetbrains.annotations.Nullable()
    java.lang.String countryName, @org.jetbrains.annotations.Nullable()
    java.lang.String regionKey, boolean isGlobal, @org.jetbrains.annotations.NotNull()
    java.lang.String createdAt, @org.jetbrains.annotations.NotNull()
    java.lang.String updatedAt) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "id")
    @java.lang.Deprecated()
    public static void getId$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserId() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "user_id")
    @java.lang.Deprecated()
    public static void getUserId$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrderId() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "order_id")
    @java.lang.Deprecated()
    public static void getOrderId$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPlanId() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "plan_id")
    @java.lang.Deprecated()
    public static void getPlanId$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPlanName() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "plan_name")
    @java.lang.Deprecated()
    public static void getPlanName$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIccid() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "iccid")
    @java.lang.Deprecated()
    public static void getIccid$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "status")
    @java.lang.Deprecated()
    public static void getStatus$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSmdpAddress() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "smdp_address")
    @java.lang.Deprecated()
    public static void getSmdpAddress$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getActivationCode() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "activation_code")
    @java.lang.Deprecated()
    public static void getActivationCode$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getQrCodeUrl() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "qr_code_url")
    @java.lang.Deprecated()
    public static void getQrCodeUrl$annotations() {
    }
    
    public final long getDataAmount() {
        return 0L;
    }
    
    @kotlinx.serialization.SerialName(value = "data_amount")
    @java.lang.Deprecated()
    public static void getDataAmount$annotations() {
    }
    
    public final long getDataUsed() {
        return 0L;
    }
    
    @kotlinx.serialization.SerialName(value = "data_used")
    @java.lang.Deprecated()
    public static void getDataUsed$annotations() {
    }
    
    public final long getDataRemaining() {
        return 0L;
    }
    
    @kotlinx.serialization.SerialName(value = "data_remaining")
    @java.lang.Deprecated()
    public static void getDataRemaining$annotations() {
    }
    
    public final int getValidityDays() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "validity_days")
    @java.lang.Deprecated()
    public static void getValidityDays$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getActivatedAt() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "activated_at")
    @java.lang.Deprecated()
    public static void getActivatedAt$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExpiresAt() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "expires_at")
    @java.lang.Deprecated()
    public static void getExpiresAt$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountryIso() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "country_iso")
    @java.lang.Deprecated()
    public static void getCountryIso$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountryName() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "country_name")
    @java.lang.Deprecated()
    public static void getCountryName$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRegionKey() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "region_key")
    @java.lang.Deprecated()
    public static void getRegionKey$annotations() {
    }
    
    public final boolean isGlobal() {
        return false;
    }
    
    @kotlinx.serialization.SerialName(value = "is_global")
    @java.lang.Deprecated()
    public static void isGlobal$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreatedAt() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "created_at")
    @java.lang.Deprecated()
    public static void getCreatedAt$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUpdatedAt() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "updated_at")
    @java.lang.Deprecated()
    public static void getUpdatedAt$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    public final long component11() {
        return 0L;
    }
    
    public final long component12() {
        return 0L;
    }
    
    public final long component13() {
        return 0L;
    }
    
    public final int component14() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final boolean component20() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.roamyhub.android.core.network.model.ESimDto copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String planId, @org.jetbrains.annotations.NotNull()
    java.lang.String planName, @org.jetbrains.annotations.NotNull()
    java.lang.String iccid, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.lang.String smdpAddress, @org.jetbrains.annotations.Nullable()
    java.lang.String activationCode, @org.jetbrains.annotations.Nullable()
    java.lang.String qrCodeUrl, long dataAmount, long dataUsed, long dataRemaining, int validityDays, @org.jetbrains.annotations.Nullable()
    java.lang.String activatedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String expiresAt, @org.jetbrains.annotations.Nullable()
    java.lang.String countryIso, @org.jetbrains.annotations.Nullable()
    java.lang.String countryName, @org.jetbrains.annotations.Nullable()
    java.lang.String regionKey, boolean isGlobal, @org.jetbrains.annotations.NotNull()
    java.lang.String createdAt, @org.jetbrains.annotations.NotNull()
    java.lang.String updatedAt) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void write$Self$network_debug(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.network.model.ESimDto self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    /**
     * DTO for eSIM data
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"com/roamyhub/android/core/network/model/ESimDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/roamyhub/android/core/network/model/ESimDto;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "network_debug"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.roamyhub.android.core.network.model.ESimDto> {
        @org.jetbrains.annotations.NotNull()
        public static final com.roamyhub.android.core.network.model.ESimDto.$serializer INSTANCE = null;
        
        private $serializer() {
            super();
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public com.roamyhub.android.core.network.model.ESimDto deserialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Decoder decoder) {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return null;
        }
        
        @java.lang.Override()
        public void serialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
        com.roamyhub.android.core.network.model.ESimDto value) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
    
    /**
     * DTO for eSIM data
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/roamyhub/android/core/network/model/ESimDto$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/roamyhub/android/core/network/model/ESimDto;", "network_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<com.roamyhub.android.core.network.model.ESimDto> serializer() {
            return null;
        }
    }
}