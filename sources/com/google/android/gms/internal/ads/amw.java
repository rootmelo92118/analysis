package com.google.android.gms.internal.ads;

public enum amw implements aqq {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private static final aqr<amw> f2059g = null;

    /* renamed from: h */
    private final int f2061h;

    /* renamed from: a */
    public final int mo10648a() {
        if (this != UNRECOGNIZED) {
            return this.f2061h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: a */
    public static amw m2841a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_PREFIX;
            case 1:
                return TINK;
            case 2:
                return LEGACY;
            case 3:
                return RAW;
            case 4:
                return CRUNCHY;
            default:
                return null;
        }
    }

    private amw(int i) {
        this.f2061h = i;
    }

    static {
        f2059g = new amx();
    }
}
