package com.google.android.gms.internal.ads;

public enum als implements aqq {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private static final aqr<als> f2015f = null;

    /* renamed from: g */
    private final int f2017g;

    /* renamed from: a */
    public final int mo10648a() {
        if (this != UNRECOGNIZED) {
            return this.f2017g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: a */
    public static als m2687a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_HASH;
            case 1:
                return SHA1;
            case 3:
                return SHA256;
            case 4:
                return SHA512;
            default:
                return null;
        }
    }

    private als(int i) {
        this.f2017g = i;
    }

    static {
        f2015f = new alt();
    }
}
