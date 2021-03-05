package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;

public final class amu extends aqn<amu, C1063a> implements ary {
    private static volatile ash<amu> zzcas;
    /* access modifiers changed from: private */
    public static final amu zzfia = new amu();
    private String zzfhy = "";
    private amg zzfhz;

    private amu() {
    }

    /* renamed from: com.google.android.gms.internal.ads.amu$a */
    public static final class C1063a extends aqn.C1078a<amu, C1063a> implements ary {
        private C1063a() {
            super(amu.zzfia);
        }

        /* synthetic */ C1063a(amv amv) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo10722a() {
        return this.zzfhy;
    }

    /* renamed from: b */
    public final amg mo10723b() {
        return this.zzfhz == null ? amg.m2741c() : this.zzfhz;
    }

    /* renamed from: a */
    public static amu m2835a(apc apc) {
        return (amu) aqn.m3451a(zzfia, apc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo10613a(int i, Object obj, Object obj2) {
        switch (amv.f2052a[i - 1]) {
            case 1:
                return new amu();
            case 2:
                return new C1063a((amv) null);
            case 3:
                return m3456a((arw) zzfia, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzfhy", "zzfhz"});
            case 4:
                return zzfia;
            case 5:
                ash<amu> ash = zzcas;
                if (ash == null) {
                    synchronized (amu.class) {
                        ash = zzcas;
                        if (ash == null) {
                            ash = new aqn.C1079b<>(zzfia);
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
    public static amu m2836c() {
        return zzfia;
    }

    static {
        aqn.m3458a(amu.class, zzfia);
    }
}
