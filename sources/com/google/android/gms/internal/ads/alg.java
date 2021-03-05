package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;

public final class alg extends aqn<alg, C1041a> implements ary {
    private static volatile ash<alg> zzcas;
    /* access modifiers changed from: private */
    public static final alg zzffe = new alg();
    private ali zzffd;

    private alg() {
    }

    /* renamed from: com.google.android.gms.internal.ads.alg$a */
    public static final class C1041a extends aqn.C1078a<alg, C1041a> implements ary {
        private C1041a() {
            super(alg.zzffe);
        }

        /* synthetic */ C1041a(alh alh) {
            this();
        }
    }

    /* renamed from: a */
    public final ali mo10650a() {
        return this.zzffd == null ? ali.m2636d() : this.zzffd;
    }

    /* renamed from: a */
    public static alg m2632a(apc apc) {
        return (alg) aqn.m3451a(zzffe, apc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo10613a(int i, Object obj, Object obj2) {
        switch (alh.f1997a[i - 1]) {
            case 1:
                return new alg();
            case 2:
                return new C1041a((alh) null);
            case 3:
                return m3456a((arw) zzffe, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzffd"});
            case 4:
                return zzffe;
            case 5:
                ash<alg> ash = zzcas;
                if (ash == null) {
                    synchronized (alg.class) {
                        ash = zzcas;
                        if (ash == null) {
                            ash = new aqn.C1079b<>(zzffe);
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
        aqn.m3458a(alg.class, zzffe);
    }
}
