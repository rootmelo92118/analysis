package com.google.android.gms.internal.ads;

public enum amd implements aqq {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private static final aqr<amd> f2037f = null;

    /* renamed from: g */
    private final int f2039g;

    /* renamed from: a */
    public final int mo10648a() {
        if (this != UNRECOGNIZED) {
            return this.f2039g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: a */
    public static amd m2736a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_STATUS;
            case 1:
                return ENABLED;
            case 2:
                return DISABLED;
            case 3:
                return DESTROYED;
            default:
                return null;
        }
    }

    private amd(int i) {
        this.f2039g = i;
    }

    static {
        f2037f = new ame();
    }
}
