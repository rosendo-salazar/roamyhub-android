package com.roamyhub.android.core.network.model;

/**
 * DTO for global summary
 */
@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002@AB\u007f\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0011B_\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0012J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u000bH\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003Ji\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00106\u001a\u00020\u0003H\u00d6\u0001J\t\u00107\u001a\u00020\u0005H\u00d6\u0001J&\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u00c1\u0001\u00a2\u0006\u0002\b?R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0019R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0019R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0019R\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0014\u001a\u0004\b!\u0010\u0016R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0014\u001a\u0004\b#\u0010\u0019R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0014\u001a\u0004\b%\u0010\u0019R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0014\u001a\u0004\b\'\u0010(\u00a8\u0006B"}, d2 = {"Lcom/roamyhub/android/core/network/model/GlobalSummaryDto;", "", "seen1", "", "regionKey", "", "regionName", "description", "countryCount", "planCount", "startingPrice", "", "currency", "localizedName", "iconUrl", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCountryCount$annotations", "()V", "getCountryCount", "()I", "getCurrency$annotations", "getCurrency", "()Ljava/lang/String;", "getDescription$annotations", "getDescription", "getIconUrl$annotations", "getIconUrl", "getLocalizedName$annotations", "getLocalizedName", "getPlanCount$annotations", "getPlanCount", "getRegionKey$annotations", "getRegionKey", "getRegionName$annotations", "getRegionName", "getStartingPrice$annotations", "getStartingPrice", "()D", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$network_release", "$serializer", "Companion", "network_release"})
public final class GlobalSummaryDto {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String regionKey = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String regionName = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String description = null;
    private final int countryCount = 0;
    private final int planCount = 0;
    private final double startingPrice = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String currency = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String localizedName = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String iconUrl = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.roamyhub.android.core.network.model.GlobalSummaryDto.Companion Companion = null;
    
    public GlobalSummaryDto(@org.jetbrains.annotations.NotNull()
    java.lang.String regionKey, @org.jetbrains.annotations.NotNull()
    java.lang.String regionName, @org.jetbrains.annotations.Nullable()
    java.lang.String description, int countryCount, int planCount, double startingPrice, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, @org.jetbrains.annotations.Nullable()
    java.lang.String localizedName, @org.jetbrains.annotations.Nullable()
    java.lang.String iconUrl) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRegionKey() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "region_key")
    @java.lang.Deprecated()
    public static void getRegionKey$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRegionName() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "region_name")
    @java.lang.Deprecated()
    public static void getRegionName$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "description")
    @java.lang.Deprecated()
    public static void getDescription$annotations() {
    }
    
    public final int getCountryCount() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "country_count")
    @java.lang.Deprecated()
    public static void getCountryCount$annotations() {
    }
    
    public final int getPlanCount() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "plan_count")
    @java.lang.Deprecated()
    public static void getPlanCount$annotations() {
    }
    
    public final double getStartingPrice() {
        return 0.0;
    }
    
    @kotlinx.serialization.SerialName(value = "starting_price")
    @java.lang.Deprecated()
    public static void getStartingPrice$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrency() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "currency")
    @java.lang.Deprecated()
    public static void getCurrency$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLocalizedName() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "localized_name")
    @java.lang.Deprecated()
    public static void getLocalizedName$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIconUrl() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "icon_url")
    @java.lang.Deprecated()
    public static void getIconUrl$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final double component6() {
        return 0.0;
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
    public final com.roamyhub.android.core.network.model.GlobalSummaryDto copy(@org.jetbrains.annotations.NotNull()
    java.lang.String regionKey, @org.jetbrains.annotations.NotNull()
    java.lang.String regionName, @org.jetbrains.annotations.Nullable()
    java.lang.String description, int countryCount, int planCount, double startingPrice, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, @org.jetbrains.annotations.Nullable()
    java.lang.String localizedName, @org.jetbrains.annotations.Nullable()
    java.lang.String iconUrl) {
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
    com.roamyhub.android.core.network.model.GlobalSummaryDto self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    /**
     * DTO for global summary
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"com/roamyhub/android/core/network/model/GlobalSummaryDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/roamyhub/android/core/network/model/GlobalSummaryDto;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "network_release"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.roamyhub.android.core.network.model.GlobalSummaryDto> {
        @org.jetbrains.annotations.NotNull()
        public static final com.roamyhub.android.core.network.model.GlobalSummaryDto.$serializer INSTANCE = null;
        
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
        public com.roamyhub.android.core.network.model.GlobalSummaryDto deserialize(@org.jetbrains.annotations.NotNull()
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
        com.roamyhub.android.core.network.model.GlobalSummaryDto value) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
    
    /**
     * DTO for global summary
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/roamyhub/android/core/network/model/GlobalSummaryDto$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/roamyhub/android/core/network/model/GlobalSummaryDto;", "network_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<com.roamyhub.android.core.network.model.GlobalSummaryDto> serializer() {
            return null;
        }
    }
}