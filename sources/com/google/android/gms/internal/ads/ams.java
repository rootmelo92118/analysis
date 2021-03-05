package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;

public final class ams extends aqn<ams, C1062a> implements ary {
    private static volatile ash<ams> zzcas;
    /* access modifiers changed from: private */
    public static final ams zzfhx = new ams();
    private int zzfea;
    private amu zzfhw;

    private ams() {
    }

    /* renamed from: com.google.android.gms.internal.ads.ams$a */
    public static final class C1062a extends aqn.C1078a<ams, C1062a> implements ary {
        private C1062a() {
            super(ams.zzfhx);
        }

        /* renamed from: a */
        public final C1062a mo10720a(int i) {
            mo11026b();
            ((ams) this.f2326a).m2827b(0);
            return this;
        }

        /* renamed from: a */
        public final C1062a mo10721a(amu amu) {
            mo11026b();
            ((ams) this.f2326a).m2826a(amu);
            return this;
        }

        /* synthetic */ C1062a(amt amt) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo10718a() {
        return this.zzfea;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m2827b(int i) {
        this.zzfea = i;
    }

    /* renamed from: b */
    public final amu mo10719b() {
        return this.zzfhw == null ? amu.m2836c() : this.zzfhw;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m2826a(amu amu) {
        if (amu != null) {
            this.zzfhw = amu;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static ams m2823a(apc apc) {
        return (ams) aqn.m3451a(zzfhx, apc);
    }

    /* renamed from: c */
    public static C1062a m2828c() {
        return (C1062a) ((aqn.C1078a) zzfhx.mo10613a(aqn.C1082e.f2334e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo10613a(int i, Object obj, Object obj2) {
        switch (amt.f2051a[i - 1]) {
            case 1:
                return new ams();
            case 2:
                return new C1062a((amt) null);
            case 3:
                return m3456a((arw) zzfhx, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzfea", "zzfhw"});
            case 4:
                return zzfhx;
            case 5:
                ash<ams> ash = zzcas;
                if (ash == null) {
                    synchronized (ams.class) {
                        ash = zzcas;
                        if (ash == null) {
                            ash = new aqn.C1079b<>(zzfhx);
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
        aqn.m3458a(ams.class, zzfhx);
    }
}
