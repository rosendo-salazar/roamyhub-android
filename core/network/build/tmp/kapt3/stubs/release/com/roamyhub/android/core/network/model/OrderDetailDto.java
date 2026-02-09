package com.roamyhub.android.core.network.model;

/**
 * DTO for order detail
 */
@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bd\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u009a\u00012\u00020\u0001:\u0004\u0099\u0001\u009a\u0001B\u00f5\u0002\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0013\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\'\u001a\u0004\u0018\u00010(\u00a2\u0006\u0002\u0010)B\u00ab\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!\u0012\u0006\u0010#\u001a\u00020\u0005\u0012\u0006\u0010$\u001a\u00020\u0005\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010*J\t\u0010m\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010q\u001a\u00020\u0013H\u00c6\u0003J\t\u0010r\u001a\u00020\u0013H\u00c6\u0003J\t\u0010s\u001a\u00020\u0013H\u00c6\u0003J\t\u0010t\u001a\u00020\u0013H\u00c6\u0003J\t\u0010u\u001a\u00020\u0005H\u00c6\u0003J\t\u0010v\u001a\u00020\u0003H\u00c6\u0003J\t\u0010w\u001a\u00020\u0013H\u00c6\u0003J\t\u0010x\u001a\u00020\u0005H\u00c6\u0003J\t\u0010y\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010}\u001a\u00020\u0005H\u00c6\u0003J\t\u0010~\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\"0!H\u00c6\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0005H\u00c6\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0005H\u00c6\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0005H\u00c6\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\n\u0010\u0088\u0001\u001a\u00020\fH\u00c6\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0005H\u00c6\u0003J\u00ce\u0002\u0010\u008b\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00052\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010$\u001a\u00020\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0016\u0010\u008c\u0001\u001a\u00030\u008d\u00012\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0003H\u00d6\u0001J\n\u0010\u0090\u0001\u001a\u00020\u0005H\u00d6\u0001J.\u0010\u0091\u0001\u001a\u00030\u0092\u00012\u0007\u0010\u0093\u0001\u001a\u00020\u00002\b\u0010\u0094\u0001\u001a\u00030\u0095\u00012\b\u0010\u0096\u0001\u001a\u00030\u0097\u0001H\u00c1\u0001\u00a2\u0006\u0003\b\u0098\u0001R\u001e\u0010&\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u001e\u0010%\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b1\u0010,\u001a\u0004\b2\u0010.R\u001c\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b3\u0010,\u001a\u0004\b4\u0010.R\u001c\u0010#\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b5\u0010,\u001a\u0004\b6\u0010.R\u001c\u0010\u0017\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b7\u0010,\u001a\u0004\b8\u0010.R\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b9\u0010,\u001a\u0004\b:\u0010;R\u001c\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b<\u0010,\u001a\u0004\b=\u0010>R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b?\u0010,\u001a\u0004\b@\u0010.R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bA\u0010,\u001a\u0004\bB\u0010.R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bC\u0010,\u001a\u0004\bD\u0010.R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bE\u0010,\u001a\u0004\bF\u0010.R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bG\u0010,\u001a\u0004\bH\u0010.R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bI\u0010,\u001a\u0004\bJ\u0010.R\u001c\u0010\u001f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bK\u0010,\u001a\u0004\bL\u0010.R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bM\u0010,\u001a\u0004\bN\u0010.R\u001c\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bO\u0010,\u001a\u0004\bP\u0010.R\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bQ\u0010,\u001a\u0004\bR\u0010.R\u001c\u0010\u001a\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bS\u0010,\u001a\u0004\bT\u0010UR\u001c\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bV\u0010,\u001a\u0004\bW\u0010UR\u001c\u0010\u0019\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bX\u0010,\u001a\u0004\bY\u0010>R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bZ\u0010,\u001a\u0004\b[\u0010.R\u001c\u0010\u001e\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\\\u0010,\u001a\u0004\b]\u0010.R\"\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b^\u0010,\u001a\u0004\b_\u0010`R\u001c\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\ba\u0010,\u001a\u0004\bb\u0010>R\u001c\u0010\u0015\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bc\u0010,\u001a\u0004\bd\u0010>R\u001c\u0010\u0016\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\be\u0010,\u001a\u0004\bf\u0010>R\u001c\u0010$\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bg\u0010,\u001a\u0004\bh\u0010.R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bi\u0010,\u001a\u0004\bj\u0010.R\u001c\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bk\u0010,\u001a\u0004\bl\u0010U\u00a8\u0006\u009b\u0001"}, d2 = {"Lcom/roamyhub/android/core/network/model/OrderDetailDto;", "", "seen1", "", "id", "", "userId", "checkoutId", "planId", "planName", "planDescription", "dataAmount", "", "validityDays", "coverageDescription", "esimId", "iccid", "esimStatus", "subtotal", "", "discount", "tax", "total", "currency", "pointsRedeemed", "pointsValue", "pointsEarned", "paymentMethod", "paymentIntentId", "receiptUrl", "status", "paymentStatus", "statusHistory", "", "Lcom/roamyhub/android/core/network/model/OrderStatusUpdateDto;", "createdAt", "updatedAt", "completedAt", "cancelledAt", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDLjava/lang/String;IDILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDLjava/lang/String;IDILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCancelledAt$annotations", "()V", "getCancelledAt", "()Ljava/lang/String;", "getCheckoutId$annotations", "getCheckoutId", "getCompletedAt$annotations", "getCompletedAt", "getCoverageDescription$annotations", "getCoverageDescription", "getCreatedAt$annotations", "getCreatedAt", "getCurrency$annotations", "getCurrency", "getDataAmount$annotations", "getDataAmount", "()J", "getDiscount$annotations", "getDiscount", "()D", "getEsimId$annotations", "getEsimId", "getEsimStatus$annotations", "getEsimStatus", "getIccid$annotations", "getIccid", "getId$annotations", "getId", "getPaymentIntentId$annotations", "getPaymentIntentId", "getPaymentMethod$annotations", "getPaymentMethod", "getPaymentStatus$annotations", "getPaymentStatus", "getPlanDescription$annotations", "getPlanDescription", "getPlanId$annotations", "getPlanId", "getPlanName$annotations", "getPlanName", "getPointsEarned$annotations", "getPointsEarned", "()I", "getPointsRedeemed$annotations", "getPointsRedeemed", "getPointsValue$annotations", "getPointsValue", "getReceiptUrl$annotations", "getReceiptUrl", "getStatus$annotations", "getStatus", "getStatusHistory$annotations", "getStatusHistory", "()Ljava/util/List;", "getSubtotal$annotations", "getSubtotal", "getTax$annotations", "getTax", "getTotal$annotations", "getTotal", "getUpdatedAt$annotations", "getUpdatedAt", "getUserId$annotations", "getUserId", "getValidityDays$annotations", "getValidityDays", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$network_release", "$serializer", "Companion", "network_release"})
public final class OrderDetailDto {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String userId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String checkoutId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String planId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String planName = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String planDescription = null;
    private final long dataAmount = 0L;
    private final int validityDays = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String coverageDescription = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String esimId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String iccid = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String esimStatus = null;
    private final double subtotal = 0.0;
    private final double discount = 0.0;
    private final double tax = 0.0;
    private final double total = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String currency = null;
    private final int pointsRedeemed = 0;
    private final double pointsValue = 0.0;
    private final int pointsEarned = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String paymentMethod = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String paymentIntentId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String receiptUrl = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String status = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String paymentStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.roamyhub.android.core.network.model.OrderStatusUpdateDto> statusHistory = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String createdAt = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String updatedAt = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String completedAt = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String cancelledAt = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.roamyhub.android.core.network.model.OrderDetailDto.Companion Companion = null;
    
    public OrderDetailDto(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String checkoutId, @org.jetbrains.annotations.NotNull()
    java.lang.String planId, @org.jetbrains.annotations.NotNull()
    java.lang.String planName, @org.jetbrains.annotations.Nullable()
    java.lang.String planDescription, long dataAmount, int validityDays, @org.jetbrains.annotations.NotNull()
    java.lang.String coverageDescription, @org.jetbrains.annotations.Nullable()
    java.lang.String esimId, @org.jetbrains.annotations.Nullable()
    java.lang.String iccid, @org.jetbrains.annotations.Nullable()
    java.lang.String esimStatus, double subtotal, double discount, double tax, double total, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, int pointsRedeemed, double pointsValue, int pointsEarned, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethod, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentIntentId, @org.jetbrains.annotations.Nullable()
    java.lang.String receiptUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentStatus, @org.jetbrains.annotations.NotNull()
    java.util.List<com.roamyhub.android.core.network.model.OrderStatusUpdateDto> statusHistory, @org.jetbrains.annotations.NotNull()
    java.lang.String createdAt, @org.jetbrains.annotations.NotNull()
    java.lang.String updatedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String completedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String cancelledAt) {
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
    public final java.lang.String getCheckoutId() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "checkout_id")
    @java.lang.Deprecated()
    public static void getCheckoutId$annotations() {
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
    
    public final long getDataAmount() {
        return 0L;
    }
    
    @kotlinx.serialization.SerialName(value = "data_amount")
    @java.lang.Deprecated()
    public static void getDataAmount$annotations() {
    }
    
    public final int getValidityDays() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "validity_days")
    @java.lang.Deprecated()
    public static void getValidityDays$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCoverageDescription() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "coverage_description")
    @java.lang.Deprecated()
    public static void getCoverageDescription$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEsimId() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "esim_id")
    @java.lang.Deprecated()
    public static void getEsimId$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIccid() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "iccid")
    @java.lang.Deprecated()
    public static void getIccid$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEsimStatus() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "esim_status")
    @java.lang.Deprecated()
    public static void getEsimStatus$annotations() {
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
    
    public final double getTax() {
        return 0.0;
    }
    
    @kotlinx.serialization.SerialName(value = "tax")
    @java.lang.Deprecated()
    public static void getTax$annotations() {
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
    
    public final int getPointsEarned() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "points_earned")
    @java.lang.Deprecated()
    public static void getPointsEarned$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPaymentMethod() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "payment_method")
    @java.lang.Deprecated()
    public static void getPaymentMethod$annotations() {
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
    public final java.lang.String getReceiptUrl() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "receipt_url")
    @java.lang.Deprecated()
    public static void getReceiptUrl$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "status")
    @java.lang.Deprecated()
    public static void getStatus$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPaymentStatus() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "payment_status")
    @java.lang.Deprecated()
    public static void getPaymentStatus$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.roamyhub.android.core.network.model.OrderStatusUpdateDto> getStatusHistory() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "status_history")
    @java.lang.Deprecated()
    public static void getStatusHistory$annotations() {
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
    public final java.lang.String getCompletedAt() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "completed_at")
    @java.lang.Deprecated()
    public static void getCompletedAt$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCancelledAt() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "cancelled_at")
    @java.lang.Deprecated()
    public static void getCancelledAt$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    public final double component13() {
        return 0.0;
    }
    
    public final double component14() {
        return 0.0;
    }
    
    public final double component15() {
        return 0.0;
    }
    
    public final double component16() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    public final int component18() {
        return 0;
    }
    
    public final double component19() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final int component20() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.roamyhub.android.core.network.model.OrderStatusUpdateDto> component26() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component30() {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    public final long component7() {
        return 0L;
    }
    
    public final int component8() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.roamyhub.android.core.network.model.OrderDetailDto copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String checkoutId, @org.jetbrains.annotations.NotNull()
    java.lang.String planId, @org.jetbrains.annotations.NotNull()
    java.lang.String planName, @org.jetbrains.annotations.Nullable()
    java.lang.String planDescription, long dataAmount, int validityDays, @org.jetbrains.annotations.NotNull()
    java.lang.String coverageDescription, @org.jetbrains.annotations.Nullable()
    java.lang.String esimId, @org.jetbrains.annotations.Nullable()
    java.lang.String iccid, @org.jetbrains.annotations.Nullable()
    java.lang.String esimStatus, double subtotal, double discount, double tax, double total, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, int pointsRedeemed, double pointsValue, int pointsEarned, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethod, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentIntentId, @org.jetbrains.annotations.Nullable()
    java.lang.String receiptUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentStatus, @org.jetbrains.annotations.NotNull()
    java.util.List<com.roamyhub.android.core.network.model.OrderStatusUpdateDto> statusHistory, @org.jetbrains.annotations.NotNull()
    java.lang.String createdAt, @org.jetbrains.annotations.NotNull()
    java.lang.String updatedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String completedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String cancelledAt) {
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
    com.roamyhub.android.core.network.model.OrderDetailDto self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    /**
     * DTO for order detail
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"com/roamyhub/android/core/network/model/OrderDetailDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/roamyhub/android/core/network/model/OrderDetailDto;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "network_release"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.roamyhub.android.core.network.model.OrderDetailDto> {
        @org.jetbrains.annotations.NotNull()
        public static final com.roamyhub.android.core.network.model.OrderDetailDto.$serializer INSTANCE = null;
        
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
        public com.roamyhub.android.core.network.model.OrderDetailDto deserialize(@org.jetbrains.annotations.NotNull()
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
        com.roamyhub.android.core.network.model.OrderDetailDto value) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
    
    /**
     * DTO for order detail
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/roamyhub/android/core/network/model/OrderDetailDto$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/roamyhub/android/core/network/model/OrderDetailDto;", "network_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<com.roamyhub.android.core.network.model.OrderDetailDto> serializer() {
            return null;
        }
    }
}