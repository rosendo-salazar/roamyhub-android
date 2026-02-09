package com.roamyhub.android.core.network.model;

/**
 * DTO for country summary
 */
@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002>?Bu\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0011BO\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u0012J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\nH\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J]\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00104\u001a\u00020\u0003H\u00d6\u0001J\t\u00105\u001a\u00020\u0005H\u00d6\u0001J&\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u00c1\u0001\u00a2\u0006\u0002\b=R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0014\u001a\u0004\b!\u0010\u0016R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0014\u001a\u0004\b#\u0010$R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0014\u001a\u0004\b&\u0010\'\u00a8\u0006@"}, d2 = {"Lcom/roamyhub/android/core/network/model/CountrySummaryDto;", "", "seen1", "", "countryCode", "", "countryName", "flagEmoji", "planCount", "startingPrice", "", "currency", "localizedName", "flagUrls", "Lcom/roamyhub/android/core/network/model/CountryFlagUrlsDto;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;Lcom/roamyhub/android/core/network/model/CountryFlagUrlsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;Lcom/roamyhub/android/core/network/model/CountryFlagUrlsDto;)V", "getCountryCode$annotations", "()V", "getCountryCode", "()Ljava/lang/String;", "getCountryName$annotations", "getCountryName", "getCurrency$annotations", "getCurrency", "getFlagEmoji$annotations", "getFlagEmoji", "getFlagUrls$annotations", "getFlagUrls", "()Lcom/roamyhub/android/core/network/model/CountryFlagUrlsDto;", "getLocalizedName$annotations", "getLocalizedName", "getPlanCount$annotations", "getPlanCount", "()I", "getStartingPrice$annotations", "getStartingPrice", "()D", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$network_debug", "$serializer", "Companion", "network_debug"})
public final class CountrySummaryDto {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String countryCode = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String countryName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String flagEmoji = null;
    private final int planCount = 0;
    private final double startingPrice = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String currency = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String localizedName = null;
    @org.jetbrains.annotations.Nullable()
    private final com.roamyhub.android.core.network.model.CountryFlagUrlsDto flagUrls = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.roamyhub.android.core.network.model.CountrySummaryDto.Companion Companion = null;
    
    public CountrySummaryDto(@org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    java.lang.String countryName, @org.jetbrains.annotations.NotNull()
    java.lang.String flagEmoji, int planCount, double startingPrice, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, @org.jetbrains.annotations.Nullable()
    java.lang.String localizedName, @org.jetbrains.annotations.Nullable()
    com.roamyhub.android.core.network.model.CountryFlagUrlsDto flagUrls) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCountryCode() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "country_code")
    @java.lang.Deprecated()
    public static void getCountryCode$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCountryName() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "country_name")
    @java.lang.Deprecated()
    public static void getCountryName$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFlagEmoji() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "flag_emoji")
    @java.lang.Deprecated()
    public static void getFlagEmoji$annotations() {
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
    public final com.roamyhub.android.core.network.model.CountryFlagUrlsDto getFlagUrls() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "flag_urls")
    @java.lang.Deprecated()
    public static void getFlagUrls$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
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
    
    public final int component4() {
        return 0;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.roamyhub.android.core.network.model.CountryFlagUrlsDto component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.roamyhub.android.core.network.model.CountrySummaryDto copy(@org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    java.lang.String countryName, @org.jetbrains.annotations.NotNull()
    java.lang.String flagEmoji, int planCount, double startingPrice, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, @org.jetbrains.annotations.Nullable()
    java.lang.String localizedName, @org.jetbrains.annotations.Nullable()
    com.roamyhub.android.core.network.model.CountryFlagUrlsDto flagUrls) {
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
    com.roamyhub.android.core.network.model.CountrySummaryDto self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    /**
     * DTO for country summary
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"com/roamyhub/android/core/network/model/CountrySummaryDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/roamyhub/android/core/network/model/CountrySummaryDto;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "network_debug"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.roamyhub.android.core.network.model.CountrySummaryDto> {
        @org.jetbrains.annotations.NotNull()
        public static final com.roamyhub.android.core.network.model.CountrySummaryDto.$serializer INSTANCE = null;
        
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
        public com.roamyhub.android.core.network.model.CountrySummaryDto deserialize(@org.jetbrains.annotations.NotNull()
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
        com.roamyhub.android.core.network.model.CountrySummaryDto value) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
    
    /**
     * DTO for country summary
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/roamyhub/android/core/network/model/CountrySummaryDto$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/roamyhub/android/core/network/model/CountrySummaryDto;", "network_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<com.roamyhub.android.core.network.model.CountrySummaryDto> serializer() {
            return null;
        }
    }
}