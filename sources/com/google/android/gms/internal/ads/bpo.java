package com.google.android.gms.internal.ads;

public enum bpo implements aqq {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(1000);
    

    /* renamed from: d */
    private static final aqr<bpo> f5029d = null;

    /* renamed from: e */
    private final int f5031e;

    /* renamed from: a */
    public final int mo10648a() {
        return this.f5031e;
    }

    /* renamed from: a */
    public static bpo m6214a(int i) {
        if (i == 1000) {
            return ENUM_UNKNOWN;
        }
        switch (i) {
            case 0:
                return ENUM_FALSE;
            case 1:
                return ENUM_TRUE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static aqs m6215b() {
        return bpq.f5032a;
    }

    private bpo(int i) {
        this.f5031e = i;
    }

    static {
        f5029d = new bpp();
    }
}
