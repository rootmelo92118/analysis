package com.google.android.gms.internal.ads;

import java.lang.reflect.Type;

public enum aqg {
    DOUBLE(0, aqi.SCALAR, aqx.DOUBLE),
    FLOAT(1, aqi.SCALAR, aqx.FLOAT),
    INT64(2, aqi.SCALAR, aqx.LONG),
    UINT64(3, aqi.SCALAR, aqx.LONG),
    INT32(4, aqi.SCALAR, aqx.INT),
    FIXED64(5, aqi.SCALAR, aqx.LONG),
    FIXED32(6, aqi.SCALAR, aqx.INT),
    BOOL(7, aqi.SCALAR, aqx.BOOLEAN),
    STRING(8, aqi.SCALAR, aqx.STRING),
    MESSAGE(9, aqi.SCALAR, aqx.MESSAGE),
    BYTES(10, aqi.SCALAR, aqx.BYTE_STRING),
    UINT32(11, aqi.SCALAR, aqx.INT),
    ENUM(12, aqi.SCALAR, aqx.ENUM),
    SFIXED32(13, aqi.SCALAR, aqx.INT),
    SFIXED64(14, aqi.SCALAR, aqx.LONG),
    SINT32(15, aqi.SCALAR, aqx.INT),
    SINT64(16, aqi.SCALAR, aqx.LONG),
    GROUP(17, aqi.SCALAR, aqx.MESSAGE),
    DOUBLE_LIST(18, aqi.VECTOR, aqx.DOUBLE),
    FLOAT_LIST(19, aqi.VECTOR, aqx.FLOAT),
    INT64_LIST(20, aqi.VECTOR, aqx.LONG),
    UINT64_LIST(21, aqi.VECTOR, aqx.LONG),
    INT32_LIST(22, aqi.VECTOR, aqx.INT),
    FIXED64_LIST(23, aqi.VECTOR, aqx.LONG),
    FIXED32_LIST(24, aqi.VECTOR, aqx.INT),
    BOOL_LIST(25, aqi.VECTOR, aqx.BOOLEAN),
    STRING_LIST(26, aqi.VECTOR, aqx.STRING),
    MESSAGE_LIST(27, aqi.VECTOR, aqx.MESSAGE),
    BYTES_LIST(28, aqi.VECTOR, aqx.BYTE_STRING),
    UINT32_LIST(29, aqi.VECTOR, aqx.INT),
    ENUM_LIST(30, aqi.VECTOR, aqx.ENUM),
    SFIXED32_LIST(31, aqi.VECTOR, aqx.INT),
    SFIXED64_LIST(32, aqi.VECTOR, aqx.LONG),
    SINT32_LIST(33, aqi.VECTOR, aqx.INT),
    SINT64_LIST(34, aqi.VECTOR, aqx.LONG),
    DOUBLE_LIST_PACKED(35, aqi.PACKED_VECTOR, aqx.DOUBLE),
    FLOAT_LIST_PACKED(36, aqi.PACKED_VECTOR, aqx.FLOAT),
    INT64_LIST_PACKED(37, aqi.PACKED_VECTOR, aqx.LONG),
    UINT64_LIST_PACKED(38, aqi.PACKED_VECTOR, aqx.LONG),
    INT32_LIST_PACKED(39, aqi.PACKED_VECTOR, aqx.INT),
    FIXED64_LIST_PACKED(40, aqi.PACKED_VECTOR, aqx.LONG),
    FIXED32_LIST_PACKED(41, aqi.PACKED_VECTOR, aqx.INT),
    BOOL_LIST_PACKED(42, aqi.PACKED_VECTOR, aqx.BOOLEAN),
    UINT32_LIST_PACKED(43, aqi.PACKED_VECTOR, aqx.INT),
    ENUM_LIST_PACKED(44, aqi.PACKED_VECTOR, aqx.ENUM),
    SFIXED32_LIST_PACKED(45, aqi.PACKED_VECTOR, aqx.INT),
    SFIXED64_LIST_PACKED(46, aqi.PACKED_VECTOR, aqx.LONG),
    SINT32_LIST_PACKED(47, aqi.PACKED_VECTOR, aqx.INT),
    SINT64_LIST_PACKED(48, aqi.PACKED_VECTOR, aqx.LONG),
    GROUP_LIST(49, aqi.VECTOR, aqx.MESSAGE),
    MAP(50, aqi.MAP, aqx.VOID);
    

    /* renamed from: ae */
    private static final aqg[] f2278ae = null;

    /* renamed from: af */
    private static final Type[] f2279af = null;

    /* renamed from: Z */
    private final aqx f2306Z;

    /* renamed from: aa */
    private final int f2307aa;

    /* renamed from: ab */
    private final aqi f2308ab;

    /* renamed from: ac */
    private final Class<?> f2309ac;

    /* renamed from: ad */
    private final boolean f2310ad;

    private aqg(int i, aqi aqi, aqx aqx) {
        this.f2307aa = i;
        this.f2308ab = aqi;
        this.f2306Z = aqx;
        switch (aqi) {
            case MAP:
                this.f2309ac = aqx.mo11039a();
                break;
            case VECTOR:
                this.f2309ac = aqx.mo11039a();
                break;
            default:
                this.f2309ac = null;
                break;
        }
        boolean z = false;
        if (aqi == aqi.SCALAR) {
            switch (aqx) {
                case BYTE_STRING:
                case MESSAGE:
                case STRING:
                    break;
                default:
                    z = true;
                    break;
            }
        }
        this.f2310ad = z;
    }

    /* renamed from: a */
    public final int mo11008a() {
        return this.f2307aa;
    }

    static {
        int i;
        f2279af = new Type[0];
        aqg[] values = values();
        f2278ae = new aqg[values.length];
        for (aqg aqg : values) {
            f2278ae[aqg.f2307aa] = aqg;
        }
    }
}
