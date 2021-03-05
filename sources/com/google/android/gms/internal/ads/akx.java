package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;

public final class akx extends aqn<akx, C1037a> implements ary {
    private static volatile ash<akx> zzcas;
    /* access modifiers changed from: private */
    public static final akx zzfet = new akx();
    private int zzfek;

    private akx() {
    }

    /* renamed from: com.google.android.gms.internal.ads.akx$a */
    public static final class C1037a extends aqn.C1078a<akx, C1037a> implements ary {
        private C1037a() {
            super(akx.zzfet);
        }

        /* synthetic */ C1037a(aky aky) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo10643a() {
        return this.zzfek;
    }

    /* renamed from: a */
    public static akx m2604a(apc apc) {
        return (akx) aqn.m3451a(zzfet, apc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo10613a(int i, Object obj, Object obj2) {
        switch (aky.f1964a[i - 1]) {
            case 1:
                return new akx();
            case 2:
                return new C1037a((aky) null);
            case 3:
                return m3456a((arw) zzfet, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u000b", new Object[]{"zzfek"});
            case 4:
                return zzfet;
            case 5:
                ash<akx> ash = zzcas;
                if (ash == null) {
                    synchronized (akx.class) {
                        ash = zzcas;
                        if (ash == null) {
                            ash = new aqn.C1079b<>(zzfet);
                            zzcas = ash;
                        }
                    }
                }
                return ash;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqn.m3458a(akx.class, zzfet);
    }
}
