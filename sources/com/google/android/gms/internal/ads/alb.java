package com.google.android.gms.internal.ads;

public enum alb implements aqq {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    DO_NOT_USE_CRUNCHY_UNCOMPRESSED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private static final aqr<alb> f1971f = null;

    /* renamed from: g */
    private final int f1973g;

    /* renamed from: a */
    public final int mo10648a() {
        if (this != UNRECOGNIZED) {
            return this.f1973g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: a */
    public static alb m2621a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_FORMAT;
            case 1:
                return UNCOMPRESSED;
            case 2:
                return COMPRESSED;
            case 3:
                return DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
            default:
                return null;
        }
    }

    private alb(int i) {
        this.f1973g = i;
    }

    static {
        f1971f = new alc();
    }
}
