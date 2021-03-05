package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;

public final class amq extends aqn<amq, C1061a> implements ary {
    private static volatile ash<amq> zzcas;
    /* access modifiers changed from: private */
    public static final amq zzfhv = new amq();
    private String zzfhu = "";

    private amq() {
    }

    /* renamed from: com.google.android.gms.internal.ads.amq$a */
    public static final class C1061a extends aqn.C1078a<amq, C1061a> implements ary {
        private C1061a() {
            super(amq.zzfhv);
        }

        /* synthetic */ C1061a(amr amr) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo10717a() {
        return this.zzfhu;
    }

    /* renamed from: a */
    public static amq m2818a(apc apc) {
        return (amq) aqn.m3451a(zzfhv, apc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo10613a(int i, Object obj, Object obj2) {
        switch (amr.f2050a[i - 1]) {
            case 1:
                return new amq();
            case 2:
                return new C1061a((amr) null);
            case 3:
                return m3456a((arw) zzfhv, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzfhu"});
            case 4:
                return zzfhv;
            case 5:
                ash<amq> ash = zzcas;
                if (ash == null) {
                    synchronized (amq.class) {
                        ash = zzcas;
                        if (ash == null) {
                            ash = new aqn.C1079b<>(zzfhv);
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

    /* renamed from: b */
    public static amq m2819b() {
        return zzfhv;
    }

    static {
        aqn.m3458a(amq.class, zzfhv);
    }
}
