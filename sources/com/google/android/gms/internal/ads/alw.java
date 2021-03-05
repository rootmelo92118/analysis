package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;

public final class alw extends aqn<alw, C1047a> implements ary {
    private static volatile ash<alw> zzcas;
    /* access modifiers changed from: private */
    public static final alw zzfgg = new alw();
    private int zzfek;
    private aly zzfge;

    private alw() {
    }

    /* renamed from: com.google.android.gms.internal.ads.alw$a */
    public static final class C1047a extends aqn.C1078a<alw, C1047a> implements ary {
        private C1047a() {
            super(alw.zzfgg);
        }

        /* synthetic */ C1047a(alx alx) {
            this();
        }
    }

    /* renamed from: a */
    public final aly mo10677a() {
        return this.zzfge == null ? aly.m2712c() : this.zzfge;
    }

    /* renamed from: b */
    public final int mo10678b() {
        return this.zzfek;
    }

    /* renamed from: a */
    public static alw m2706a(apc apc) {
        return (alw) aqn.m3451a(zzfgg, apc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo10613a(int i, Object obj, Object obj2) {
        switch (alx.f2019a[i - 1]) {
            case 1:
                return new alw();
            case 2:
                return new C1047a((alx) null);
            case 3:
                return m3456a((arw) zzfgg, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzfge", "zzfek"});
            case 4:
                return zzfgg;
            case 5:
                ash<alw> ash = zzcas;
                if (ash == null) {
                    synchronized (alw.class) {
                        ash = zzcas;
                        if (ash == null) {
                            ash = new aqn.C1079b<>(zzfgg);
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
    public static alw m2707c() {
        return zzfgg;
    }

    static {
        aqn.m3458a(alw.class, zzfgg);
    }
}
