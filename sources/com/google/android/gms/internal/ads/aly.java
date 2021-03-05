package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;

public final class aly extends aqn<aly, C1048a> implements ary {
    private static volatile ash<aly> zzcas;
    /* access modifiers changed from: private */
    public static final aly zzfgj = new aly();
    private int zzfgh;
    private int zzfgi;

    private aly() {
    }

    /* renamed from: com.google.android.gms.internal.ads.aly$a */
    public static final class C1048a extends aqn.C1078a<aly, C1048a> implements ary {
        private C1048a() {
            super(aly.zzfgj);
        }

        /* synthetic */ C1048a(alz alz) {
            this();
        }
    }

    /* renamed from: a */
    public final als mo10679a() {
        als a = als.m2687a(this.zzfgh);
        return a == null ? als.UNRECOGNIZED : a;
    }

    /* renamed from: b */
    public final int mo10680b() {
        return this.zzfgi;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo10613a(int i, Object obj, Object obj2) {
        switch (alz.f2020a[i - 1]) {
            case 1:
                return new aly();
            case 2:
                return new C1048a((alz) null);
            case 3:
                return m3456a((arw) zzfgj, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzfgh", "zzfgi"});
            case 4:
                return zzfgj;
            case 5:
                ash<aly> ash = zzcas;
                if (ash == null) {
                    synchronized (aly.class) {
                        ash = zzcas;
                        if (ash == null) {
                            ash = new aqn.C1079b<>(zzfgj);
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

    /* renamed from: c */
    public static aly m2712c() {
        return zzfgj;
    }

    static {
        aqn.m3458a(aly.class, zzfgj);
    }
}
