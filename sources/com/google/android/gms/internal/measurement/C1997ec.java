package com.google.android.gms.internal.measurement;

import java.lang.reflect.Type;

/* renamed from: com.google.android.gms.internal.measurement.ec */
public enum C1997ec {
    DOUBLE(0, C1999ee.SCALAR, C2017er.DOUBLE),
    FLOAT(1, C1999ee.SCALAR, C2017er.FLOAT),
    INT64(2, C1999ee.SCALAR, C2017er.LONG),
    UINT64(3, C1999ee.SCALAR, C2017er.LONG),
    INT32(4, C1999ee.SCALAR, C2017er.INT),
    FIXED64(5, C1999ee.SCALAR, C2017er.LONG),
    FIXED32(6, C1999ee.SCALAR, C2017er.INT),
    BOOL(7, C1999ee.SCALAR, C2017er.BOOLEAN),
    STRING(8, C1999ee.SCALAR, C2017er.STRING),
    MESSAGE(9, C1999ee.SCALAR, C2017er.MESSAGE),
    BYTES(10, C1999ee.SCALAR, C2017er.BYTE_STRING),
    UINT32(11, C1999ee.SCALAR, C2017er.INT),
    ENUM(12, C1999ee.SCALAR, C2017er.ENUM),
    SFIXED32(13, C1999ee.SCALAR, C2017er.INT),
    SFIXED64(14, C1999ee.SCALAR, C2017er.LONG),
    SINT32(15, C1999ee.SCALAR, C2017er.INT),
    SINT64(16, C1999ee.SCALAR, C2017er.LONG),
    GROUP(17, C1999ee.SCALAR, C2017er.MESSAGE),
    DOUBLE_LIST(18, C1999ee.VECTOR, C2017er.DOUBLE),
    FLOAT_LIST(19, C1999ee.VECTOR, C2017er.FLOAT),
    INT64_LIST(20, C1999ee.VECTOR, C2017er.LONG),
    UINT64_LIST(21, C1999ee.VECTOR, C2017er.LONG),
    INT32_LIST(22, C1999ee.VECTOR, C2017er.INT),
    FIXED64_LIST(23, C1999ee.VECTOR, C2017er.LONG),
    FIXED32_LIST(24, C1999ee.VECTOR, C2017er.INT),
    BOOL_LIST(25, C1999ee.VECTOR, C2017er.BOOLEAN),
    STRING_LIST(26, C1999ee.VECTOR, C2017er.STRING),
    MESSAGE_LIST(27, C1999ee.VECTOR, C2017er.MESSAGE),
    BYTES_LIST(28, C1999ee.VECTOR, C2017er.BYTE_STRING),
    UINT32_LIST(29, C1999ee.VECTOR, C2017er.INT),
    ENUM_LIST(30, C1999ee.VECTOR, C2017er.ENUM),
    SFIXED32_LIST(31, C1999ee.VECTOR, C2017er.INT),
    SFIXED64_LIST(32, C1999ee.VECTOR, C2017er.LONG),
    SINT32_LIST(33, C1999ee.VECTOR, C2017er.INT),
    SINT64_LIST(34, C1999ee.VECTOR, C2017er.LONG),
    DOUBLE_LIST_PACKED(35, C1999ee.PACKED_VECTOR, C2017er.DOUBLE),
    FLOAT_LIST_PACKED(36, C1999ee.PACKED_VECTOR, C2017er.FLOAT),
    INT64_LIST_PACKED(37, C1999ee.PACKED_VECTOR, C2017er.LONG),
    UINT64_LIST_PACKED(38, C1999ee.PACKED_VECTOR, C2017er.LONG),
    INT32_LIST_PACKED(39, C1999ee.PACKED_VECTOR, C2017er.INT),
    FIXED64_LIST_PACKED(40, C1999ee.PACKED_VECTOR, C2017er.LONG),
    FIXED32_LIST_PACKED(41, C1999ee.PACKED_VECTOR, C2017er.INT),
    BOOL_LIST_PACKED(42, C1999ee.PACKED_VECTOR, C2017er.BOOLEAN),
    UINT32_LIST_PACKED(43, C1999ee.PACKED_VECTOR, C2017er.INT),
    ENUM_LIST_PACKED(44, C1999ee.PACKED_VECTOR, C2017er.ENUM),
    SFIXED32_LIST_PACKED(45, C1999ee.PACKED_VECTOR, C2017er.INT),
    SFIXED64_LIST_PACKED(46, C1999ee.PACKED_VECTOR, C2017er.LONG),
    SINT32_LIST_PACKED(47, C1999ee.PACKED_VECTOR, C2017er.INT),
    SINT64_LIST_PACKED(48, C1999ee.PACKED_VECTOR, C2017er.LONG),
    GROUP_LIST(49, C1999ee.VECTOR, C2017er.MESSAGE),
    MAP(50, C1999ee.MAP, C2017er.VOID);
    

    /* renamed from: ae */
    private static final C1997ec[] f7679ae = null;

    /* renamed from: af */
    private static final Type[] f7680af = null;

    /* renamed from: Z */
    private final C2017er f7707Z;

    /* renamed from: aa */
    private final int f7708aa;

    /* renamed from: ab */
    private final C1999ee f7709ab;

    /* renamed from: ac */
    private final Class<?> f7710ac;

    /* renamed from: ad */
    private final boolean f7711ad;

    private C1997ec(int i, C1999ee eeVar, C2017er erVar) {
        this.f7708aa = i;
        this.f7709ab = eeVar;
        this.f7707Z = erVar;
        switch (C1998ed.f7712a[eeVar.ordinal()]) {
            case 1:
                this.f7710ac = erVar.mo13836a();
                break;
            case 2:
                this.f7710ac = erVar.mo13836a();
                break;
            default:
                this.f7710ac = null;
                break;
        }
        boolean z = false;
        if (eeVar == C1999ee.SCALAR) {
            switch (C1998ed.f7713b[erVar.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    break;
                default:
                    z = true;
                    break;
            }
        }
        this.f7711ad = z;
    }

    /* renamed from: a */
    public final int mo13805a() {
        return this.f7708aa;
    }

    static {
        int i;
        f7680af = new Type[0];
        C1997ec[] values = values();
        f7679ae = new C1997ec[values.length];
        for (C1997ec ecVar : values) {
            f7679ae[ecVar.f7708aa] = ecVar;
        }
    }
}
