package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;

public final class amg extends aqn<amg, C1052a> implements ary {
    private static volatile ash<amg> zzcas;
    /* access modifiers changed from: private */
    public static final amg zzfhc = new amg();
    private String zzfgk = "";
    private apc zzfgl = apc.f2174a;
    private int zzfhb;

    private amg() {
    }

    /* renamed from: com.google.android.gms.internal.ads.amg$a */
    public static final class C1052a extends aqn.C1078a<amg, C1052a> implements ary {
        private C1052a() {
            super(amg.zzfhc);
        }

        /* synthetic */ C1052a(amh amh) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo10687a() {
        return this.zzfgk;
    }

    /* renamed from: b */
    public final apc mo10688b() {
        return this.zzfgl;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo10613a(int i, Object obj, Object obj2) {
        switch (amh.f2045a[i - 1]) {
            case 1:
                return new amg();
            case 2:
                return new C1052a((amh) null);
            case 3:
                return m3456a((arw) zzfhc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzfgk", "zzfgl", "zzfhb"});
            case 4:
                return zzfhc;
            case 5:
                ash<amg> ash = zzcas;
                if (ash == null) {
                    synchronized (amg.class) {
                        ash = zzcas;
                        if (ash == null) {
                            ash = new aqn.C1079b<>(zzfhc);
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
    public static amg m2741c() {
        return zzfhc;
    }

    static {
        aqn.m3458a(amg.class, zzfhc);
    }
}
