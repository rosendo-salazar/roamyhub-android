package com.roamyhub.android.core.network.model;

/**
 * DTO for plan data
 */
@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bS\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 }2\u00020\u0001:\u0002|}B\u00af\u0002\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0014\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0001\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001d\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u00a2\u0006\u0002\u0010\"B\u00f9\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u00a2\u0006\u0002\u0010#J\t\u0010X\u001a\u00020\u0005H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0005H\u00c6\u0003J\t\u0010Z\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\u00c6\u0003J\t\u0010\\\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010_\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010FJ\u000f\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\u00c6\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010c\u001a\u00020\u0005H\u00c6\u0003J\u0015\u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u001dH\u00c6\u0003J\t\u0010e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010f\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010j\u001a\u00020\u000bH\u00c6\u0003J\t\u0010k\u001a\u00020\rH\u00c6\u0003J\t\u0010l\u001a\u00020\u0003H\u00c6\u0003J\t\u0010m\u001a\u00020\u0010H\u00c6\u0003J\u0092\u0002\u0010n\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00142\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010oJ\u0013\u0010p\u001a\u00020\u000b2\b\u0010q\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010s\u001a\u00020\u0005H\u00d6\u0001J&\u0010t\u001a\u00020u2\u0006\u0010v\u001a\u00020\u00002\u0006\u0010w\u001a\u00020x2\u0006\u0010y\u001a\u00020zH\u00c1\u0001\u00a2\u0006\u0002\b{R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b$\u0010%\u001a\u0004\b&\u0010\'R\"\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00148\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b(\u0010%\u001a\u0004\b)\u0010*R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b+\u0010%\u001a\u0004\b,\u0010\'R\u001c\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b-\u0010%\u001a\u0004\b.\u0010\'R\u001c\u0010\u001e\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b/\u0010%\u001a\u0004\b0\u0010\'R\u001c\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b1\u0010%\u001a\u0004\b2\u0010\'R(\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u001d8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b3\u0010%\u001a\u0004\b4\u00105R\u001c\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b6\u0010%\u001a\u0004\b7\u00108R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b9\u0010%\u001a\u0004\b:\u0010\'R\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00148\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b;\u0010%\u001a\u0004\b<\u0010*R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b=\u0010%\u001a\u0004\b>\u0010\'R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b?\u0010%\u001a\u0004\b@\u0010\'R\u001c\u0010\u0015\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bA\u0010%\u001a\u0004\b\u0015\u0010BR\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bC\u0010%\u001a\u0004\b\n\u0010BR \u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010G\u0012\u0004\bD\u0010%\u001a\u0004\bE\u0010FR\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bH\u0010%\u001a\u0004\bI\u0010\'R\u001c\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bJ\u0010%\u001a\u0004\bK\u0010LR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bM\u0010%\u001a\u0004\bN\u0010\'R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bO\u0010%\u001a\u0004\bP\u0010\'R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bQ\u0010%\u001a\u0004\bR\u0010\'R\u001c\u0010\u001f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bS\u0010%\u001a\u0004\bT\u0010\'R\u001c\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bU\u0010%\u001a\u0004\bV\u0010W\u00a8\u0006~"}, d2 = {"Lcom/roamyhub/android/core/network/model/PlanDto;", "", "seen1", "", "id", "", "name", "description", "countryIso", "regionKey", "isGlobal", "", "dataAmount", "", "validity", "price", "", "currency", "coverageType", "features", "", "isActive", "badge", "unlimitedType", "maxRedeemablePoints", "countries", "imageUrl", "regionIconUrl", "currencyPrices", "", "createdAt", "updatedAt", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJIDLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJIDLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "getBadge$annotations", "()V", "getBadge", "()Ljava/lang/String;", "getCountries$annotations", "getCountries", "()Ljava/util/List;", "getCountryIso$annotations", "getCountryIso", "getCoverageType$annotations", "getCoverageType", "getCreatedAt$annotations", "getCreatedAt", "getCurrency$annotations", "getCurrency", "getCurrencyPrices$annotations", "getCurrencyPrices", "()Ljava/util/Map;", "getDataAmount$annotations", "getDataAmount", "()J", "getDescription$annotations", "getDescription", "getFeatures$annotations", "getFeatures", "getId$annotations", "getId", "getImageUrl$annotations", "getImageUrl", "isActive$annotations", "()Z", "isGlobal$annotations", "getMaxRedeemablePoints$annotations", "getMaxRedeemablePoints", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName$annotations", "getName", "getPrice$annotations", "getPrice", "()D", "getRegionIconUrl$annotations", "getRegionIconUrl", "getRegionKey$annotations", "getRegionKey", "getUnlimitedType$annotations", "getUnlimitedType", "getUpdatedAt$annotations", "getUpdatedAt", "getValidity$annotations", "getValidity", "()I", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJIDLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/roamyhub/android/core/network/model/PlanDto;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$network_release", "$serializer", "Companion", "network_release"})
public final class PlanDto {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String description = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String countryIso = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String regionKey = null;
    private final boolean isGlobal = false;
    private final long dataAmount = 0L;
    private final int validity = 0;
    private final double price = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String currency = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String coverageType = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> features = null;
    private final boolean isActive = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String badge = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String unlimitedType = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer maxRedeemablePoints = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> countries = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String imageUrl = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String regionIconUrl = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, java.lang.Double> currencyPrices = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String createdAt = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String updatedAt = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.roamyhub.android.core.network.model.PlanDto.Companion Companion = null;
    
    public PlanDto(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String countryIso, @org.jetbrains.annotations.Nullable()
    java.lang.String regionKey, boolean isGlobal, long dataAmount, int validity, double price, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, @org.jetbrains.annotations.NotNull()
    java.lang.String coverageType, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> features, boolean isActive, @org.jetbrains.annotations.Nullable()
    java.lang.String badge, @org.jetbrains.annotations.Nullable()
    java.lang.String unlimitedType, @org.jetbrains.annotations.Nullable()
    java.lang.Integer maxRedeemablePoints, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> countries, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String regionIconUrl, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Double> currencyPrices, @org.jetbrains.annotations.NotNull()
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
    public final java.lang.String getName() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "name")
    @java.lang.Deprecated()
    public static void getName$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "description")
    @java.lang.Deprecated()
    public static void getDescription$annotations() {
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
    
    public final long getDataAmount() {
        return 0L;
    }
    
    @kotlinx.serialization.SerialName(value = "data_amount")
    @java.lang.Deprecated()
    public static void getDataAmount$annotations() {
    }
    
    public final int getValidity() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "validity")
    @java.lang.Deprecated()
    public static void getValidity$annotations() {
    }
    
    public final double getPrice() {
        return 0.0;
    }
    
    @kotlinx.serialization.SerialName(value = "price")
    @java.lang.Deprecated()
    public static void getPrice$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrency() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "currency")
    @java.lang.Deprecated()
    public static void getCurrency$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCoverageType() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "coverage_type")
    @java.lang.Deprecated()
    public static void getCoverageType$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getFeatures() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "features")
    @java.lang.Deprecated()
    public static void getFeatures$annotations() {
    }
    
    public final boolean isActive() {
        return false;
    }
    
    @kotlinx.serialization.SerialName(value = "is_active")
    @java.lang.Deprecated()
    public static void isActive$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBadge() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "badge")
    @java.lang.Deprecated()
    public static void getBadge$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUnlimitedType() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "unlimited_type")
    @java.lang.Deprecated()
    public static void getUnlimitedType$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMaxRedeemablePoints() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "max_redeemable_points")
    @java.lang.Deprecated()
    public static void getMaxRedeemablePoints$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getCountries() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "countries")
    @java.lang.Deprecated()
    public static void getCountries$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImageUrl() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "image_url")
    @java.lang.Deprecated()
    public static void getImageUrl$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRegionIconUrl() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "region_icon_url")
    @java.lang.Deprecated()
    public static void getRegionIconUrl$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Double> getCurrencyPrices() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "currency_prices")
    @java.lang.Deprecated()
    public static void getCurrencyPrices$annotations() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component12() {
        return null;
    }
    
    public final boolean component13() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component17() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Double> component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final long component7() {
        return 0L;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final double component9() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.roamyhub.android.core.network.model.PlanDto copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String countryIso, @org.jetbrains.annotations.Nullable()
    java.lang.String regionKey, boolean isGlobal, long dataAmount, int validity, double price, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, @org.jetbrains.annotations.NotNull()
    java.lang.String coverageType, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> features, boolean isActive, @org.jetbrains.annotations.Nullable()
    java.lang.String badge, @org.jetbrains.annotations.Nullable()
    java.lang.String unlimitedType, @org.jetbrains.annotations.Nullable()
    java.lang.Integer maxRedeemablePoints, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> countries, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String regionIconUrl, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Double> currencyPrices, @org.jetbrains.annotations.NotNull()
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
    public static final void write$Self$network_release(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.network.model.PlanDto self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    /**
     * DTO for plan data
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"com/roamyhub/android/core/network/model/PlanDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/roamyhub/android/core/network/model/PlanDto;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "network_release"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.roamyhub.android.core.network.model.PlanDto> {
        @org.jetbrains.annotations.NotNull()
        public static final com.roamyhub.android.core.network.model.PlanDto.$serializer INSTANCE = null;
        
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
        public com.roamyhub.android.core.network.model.PlanDto deserialize(@org.jetbrains.annotations.NotNull()
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
        com.roamyhub.android.core.network.model.PlanDto value) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
    
    /**
     * DTO for plan data
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/roamyhub/android/core/network/model/PlanDto$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/roamyhub/android/core/network/model/PlanDto;", "network_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<com.roamyhub.android.core.network.model.PlanDto> serializer() {
            return null;
        }
    }
}