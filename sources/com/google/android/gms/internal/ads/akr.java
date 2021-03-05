package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;

public final class akr extends aqn<akr, C1034a> implements ary {
    private static volatile ash<akr> zzcas;
    /* access modifiers changed from: private */
    public static final akr zzfeq = new akr();
    private int zzfek;
    private akt zzfeo;

    private akr() {
    }

    /* renamed from: com.google.android.gms.internal.ads.akr$a */
    public static final class C1034a extends aqn.C1078a<akr, C1034a> implements ary {
        private C1034a() {
            super(akr.zzfeq);
        }

        /* synthetic */ C1034a(aks aks) {
            this();
        }
    }

    /* renamed from: a */
    public final akt mo10636a() {
        return this.zzfeo == null ? akt.m2588b() : this.zzfeo;
    }

    /* renamed from: b */
    public final int mo10637b() {
        return this.zzfek;
    }

    /* renamed from: a */
    public static akr m2583a(apc apc) {
        return (akr) aqn.m3451a(zzfeq, apc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo10613a(int i, Object obj, Object obj2) {
        switch (aks.f1961a[i - 1]) {
            case 1:
                return new akr();
            case 2:
                return new C1034a((aks) null);
            case 3:
                return m3456a((arw) zzfeq, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzfeo", "zzfek"});
            case 4:
                return zzfeq;
            case 5:
                ash<akr> ash = zzcas;
                if (ash == null) {
                    synchronized (akr.class) {
                        ash = zzcas;
                        if (ash == null) {
                            ash = new aqn.C1079b<>(zzfeq);
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
        aqn.m3458a(akr.class, zzfeq);
    }
}
