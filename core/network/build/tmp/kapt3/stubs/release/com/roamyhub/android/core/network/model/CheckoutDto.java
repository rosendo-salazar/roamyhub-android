package com.roamyhub.android.core.network.model;

/**
 * DTO for checkout data
 */
@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b>\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 e2\u00020\u0001:\u0002deB\u00e7\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000e\u001a\u00020\f\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0011\u001a\u00020\f\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0002\u0010\u001aB\u00af\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u001bJ\t\u0010D\u001a\u00020\u0005H\u00c6\u0003J\t\u0010E\u001a\u00020\u0005H\u00c6\u0003J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\fH\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010K\u001a\u00020\u0005H\u00c6\u0003J\t\u0010L\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010N\u001a\u00020\u0005H\u00c6\u0003J\t\u0010O\u001a\u00020\u0005H\u00c6\u0003J\t\u0010P\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010R\u001a\u00020\u0005H\u00c6\u0003J\t\u0010S\u001a\u00020\fH\u00c6\u0003J\t\u0010T\u001a\u00020\fH\u00c6\u0003J\t\u0010U\u001a\u00020\fH\u00c6\u0003J\u00c7\u0001\u0010V\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010W\u001a\u00020X2\b\u0010Y\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010Z\u001a\u00020\u0003H\u00d6\u0001J\t\u0010[\u001a\u00020\u0005H\u00d6\u0001J&\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020\u00002\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020bH\u00c1\u0001\u00a2\u0006\u0002\bcR\u001c\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001c\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\u001fR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\'\u0010\u001d\u001a\u0004\b(\u0010\u001fR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u001d\u001a\u0004\b*\u0010\u001fR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u001d\u001a\u0004\b,\u0010\u001fR\u001e\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u001d\u001a\u0004\b.\u0010\u001fR\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b/\u0010\u001d\u001a\u0004\b0\u0010\u001fR\u001c\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b1\u0010\u001d\u001a\u0004\b2\u0010\u001fR\u001c\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b3\u0010\u001d\u001a\u0004\b4\u00105R\u001c\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b6\u0010\u001d\u001a\u0004\b7\u0010$R\u001c\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b8\u0010\u001d\u001a\u0004\b9\u0010\u001fR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b:\u0010\u001d\u001a\u0004\b;\u0010\u001fR\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b<\u0010\u001d\u001a\u0004\b=\u0010$R\u001c\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b>\u0010\u001d\u001a\u0004\b?\u0010$R\u001c\u0010\u0016\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b@\u0010\u001d\u001a\u0004\bA\u0010\u001fR\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bB\u0010\u001d\u001a\u0004\bC\u0010\u001f\u00a8\u0006f"}, d2 = {"Lcom/roamyhub/android/core/network/model/CheckoutDto;", "", "seen1", "", "id", "", "userId", "planId", "planName", "planDescription", "status", "subtotal", "", "discount", "total", "currency", "pointsRedeemed", "pointsValue", "paymentIntentId", "stripeSessionId", "orderId", "createdAt", "updatedAt", "expiresAt", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDLjava/lang/String;IDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDLjava/lang/String;IDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreatedAt$annotations", "()V", "getCreatedAt", "()Ljava/lang/String;", "getCurrency$annotations", "getCurrency", "getDiscount$annotations", "getDiscount", "()D", "getExpiresAt$annotations", "getExpiresAt", "getId$annotations", "getId", "getOrderId$annotations", "getOrderId", "getPaymentIntentId$annotations", "getPaymentIntentId", "getPlanDescription$annotations", "getPlanDescription", "getPlanId$annotations", "getPlanId", "getPlanName$annotations", "getPlanName", "getPointsRedeemed$annotations", "getPointsRedeemed", "()I", "getPointsValue$annotations", "getPointsValue", "getStatus$annotations", "getStatus", "getStripeSessionId$annotations", "getStripeSessionId", "getSubtotal$annotations", "getSubtotal", "getTotal$annotations", "getTotal", "getUpdatedAt$annotations", "getUpdatedAt", "getUserId$annotations", "getUserId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$network_release", "$serializer", "Companion", "network_release"})
public final class CheckoutDto {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String userId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String planId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String planName = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String planDescription = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String status = null;
    private final double subtotal = 0.0;
    private final double discount = 0.0;
    private final double total = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String currency = null;
    private final int pointsRedeemed = 0;
    private final double pointsValue = 0.0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String paymentIntentId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String stripeSessionId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String orderId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String createdAt = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String updatedAt = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String expiresAt = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.roamyhub.android.core.network.model.CheckoutDto.Companion Companion = null;
    
    public CheckoutDto(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String planId, @org.jetbrains.annotations.NotNull()
    java.lang.String planName, @org.jetbrains.annotations.Nullable()
    java.lang.String planDescription, @org.jetbrains.annotations.NotNull()
    java.lang.String status, double subtotal, double discount, double total, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, int pointsRedeemed, double pointsValue, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentIntentId, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeSessionId, @org.jetbrains.annotations.Nullable()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String createdAt, @org.jetbrains.annotations.NotNull()
    java.lang.String updatedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String expiresAt) {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPlanDescription() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "plan_description")
    @java.lang.Deprecated()
    public static void getPlanDescription$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "status")
    @java.lang.Deprecated()
    public static void getStatus$annotations() {
    }
    
    public final double getSubtotal() {
        return 0.0;
    }
    
    @kotlinx.serialization.SerialName(value = "subtotal")
    @java.lang.Deprecated()
    public static void getSubtotal$annotations() {
    }
    
    public final double getDiscount() {
        return 0.0;
    }
    
    @kotlinx.serialization.SerialName(value = "discount")
    @java.lang.Deprecated()
    public static void getDiscount$annotations() {
    }
    
    public final double getTotal() {
        return 0.0;
    }
    
    @kotlinx.serialization.SerialName(value = "total")
    @java.lang.Deprecated()
    public static void getTotal$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrency() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "currency")
    @java.lang.Deprecated()
    public static void getCurrency$annotations() {
    }
    
    public final int getPointsRedeemed() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "points_redeemed")
    @java.lang.Deprecated()
    public static void getPointsRedeemed$annotations() {
    }
    
    public final double getPointsValue() {
        return 0.0;
    }
    
    @kotlinx.serialization.SerialName(value = "points_value")
    @java.lang.Deprecated()
    public static void getPointsValue$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPaymentIntentId() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "payment_intent_id")
    @java.lang.Deprecated()
    public static void getPaymentIntentId$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStripeSessionId() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "stripe_session_id")
    @java.lang.Deprecated()
    public static void getStripeSessionId$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrderId() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "order_id")
    @java.lang.Deprecated()
    public static void getOrderId$annotations() {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExpiresAt() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "expires_at")
    @java.lang.Deprecated()
    public static void getExpiresAt$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final double component12() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final double component8() {
        return 0.0;
    }
    
    public final double component9() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.roamyhub.android.core.network.model.CheckoutDto copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String planId, @org.jetbrains.annotations.NotNull()
    java.lang.String planName, @org.jetbrains.annotations.Nullable()
    java.lang.String planDescription, @org.jetbrains.annotations.NotNull()
    java.lang.String status, double subtotal, double discount, double total, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, int pointsRedeemed, double pointsValue, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentIntentId, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeSessionId, @org.jetbrains.annotations.Nullable()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String createdAt, @org.jetbrains.annotations.NotNull()
    java.lang.String updatedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String expiresAt) {
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
    com.roamyhub.android.core.network.model.CheckoutDto self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    /**
     * DTO for checkout data
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"com/roamyhub/android/core/network/model/CheckoutDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/roamyhub/android/core/network/model/CheckoutDto;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "network_release"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.roamyhub.android.core.network.model.CheckoutDto> {
        @org.jetbrains.annotations.NotNull()
        public static final com.roamyhub.android.core.network.model.CheckoutDto.$serializer INSTANCE = null;
        
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
        public com.roamyhub.android.core.network.model.CheckoutDto deserialize(@org.jetbrains.annotations.NotNull()
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
        com.roamyhub.android.core.network.model.CheckoutDto value) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
    
    /**
     * DTO for checkout data
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/roamyhub/android/core/network/model/CheckoutDto$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/roamyhub/android/core/network/model/CheckoutDto;", "network_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<com.roamyhub.android.core.network.model.CheckoutDto> serializer() {
            return null;
        }
    }
}