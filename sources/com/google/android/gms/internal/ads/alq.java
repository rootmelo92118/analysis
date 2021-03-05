package com.google.android.gms.internal.ads;

public enum alq implements aqq {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private static final aqr<alq> f2007f = null;

    /* renamed from: g */
    private final int f2009g;

    /* renamed from: a */
    public final int mo10648a() {
        if (this != UNRECOGNIZED) {
            return this.f2009g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: a */
    public static alq m2685a(int i) {
        if (i == 0) {
            return UNKNOWN_CURVE;
        }
        switch (i) {
            case 2:
                return NIST_P256;
            case 3:
                return NIST_P384;
            case 4:
                return NIST_P521;
            default:
                return null;
        }
    }

    private alq(int i) {
        this.f2009g = i;
    }

    static {
        f2007f = new alr();
    }
}
