package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ho */
public enum C2099ho {
    DOUBLE(C2104ht.DOUBLE, 1),
    FLOAT(C2104ht.FLOAT, 5),
    INT64(C2104ht.LONG, 0),
    UINT64(C2104ht.LONG, 0),
    INT32(C2104ht.INT, 0),
    FIXED64(C2104ht.LONG, 1),
    FIXED32(C2104ht.INT, 5),
    BOOL(C2104ht.BOOLEAN, 0),
    STRING(C2104ht.STRING, 2),
    GROUP(C2104ht.MESSAGE, 3),
    MESSAGE(C2104ht.MESSAGE, 2),
    BYTES(C2104ht.BYTE_STRING, 2),
    UINT32(C2104ht.INT, 0),
    ENUM(C2104ht.ENUM, 0),
    SFIXED32(C2104ht.INT, 5),
    SFIXED64(C2104ht.LONG, 1),
    SINT32(C2104ht.INT, 0),
    SINT64(C2104ht.LONG, 0);
    

    /* renamed from: s */
    private final C2104ht f7911s;

    /* renamed from: t */
    private final int f7912t;

    private C2099ho(C2104ht htVar, int i) {
        this.f7911s = htVar;
        this.f7912t = i;
    }

    /* renamed from: a */
    public final C2104ht mo14047a() {
        return this.f7911s;
    }

    /* renamed from: b */
    public final int mo14048b() {
        return this.f7912t;
    }
}
