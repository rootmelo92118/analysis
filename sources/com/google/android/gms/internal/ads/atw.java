package com.google.android.gms.internal.ads;

public enum atw {
    DOUBLE(aub.DOUBLE, 1),
    FLOAT(aub.FLOAT, 5),
    INT64(aub.LONG, 0),
    UINT64(aub.LONG, 0),
    INT32(aub.INT, 0),
    FIXED64(aub.LONG, 1),
    FIXED32(aub.INT, 5),
    BOOL(aub.BOOLEAN, 0),
    STRING(aub.STRING, 2),
    GROUP(aub.MESSAGE, 3),
    MESSAGE(aub.MESSAGE, 2),
    BYTES(aub.BYTE_STRING, 2),
    UINT32(aub.INT, 0),
    ENUM(aub.ENUM, 0),
    SFIXED32(aub.INT, 5),
    SFIXED64(aub.LONG, 1),
    SINT32(aub.INT, 0),
    SINT64(aub.LONG, 0);
    

    /* renamed from: s */
    private final aub f2525s;

    /* renamed from: t */
    private final int f2526t;

    private atw(aub aub, int i) {
        this.f2525s = aub;
        this.f2526t = i;
    }

    /* renamed from: a */
    public final aub mo11230a() {
        return this.f2525s;
    }

    /* renamed from: b */
    public final int mo11231b() {
        return this.f2526t;
    }
}
