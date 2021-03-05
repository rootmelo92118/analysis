package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;

public final class akp extends aqn<akp, C1033a> implements ary {
    private static volatile ash<akp> zzcas;
    /* access modifiers changed from: private */
    public static final akp zzfep = new akp();
    private int zzfea;
    private apc zzfei = apc.f2174a;
    private akt zzfeo;

    private akp() {
    }

    /* renamed from: com.google.android.gms.internal.ads.akp$a */
    public static final class C1033a extends aqn.C1078a<akp, C1033a> implements ary {
        private C1033a() {
            super(akp.zzfep);
        }

        /* renamed from: a */
        public final C1033a mo10633a(int i) {
            mo11026b();
            ((akp) this.f2326a).m2572b(0);
            return this;
        }

        /* renamed from: a */
        public final C1033a mo10634a(akt akt) {
            mo11026b();
            ((akp) this.f2326a).m2571a(akt);
            return this;
        }

        /* renamed from: a */
        public final C1033a mo10635a(apc apc) {
            mo11026b();
            ((akp) this.f2326a).m2573b(apc);
            return this;
        }

        /* synthetic */ C1033a(akq akq) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo10630a() {
        return this.zzfea;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m2572b(int i) {
        this.zzfea = i;
    }

    /* renamed from: b */
    public final akt mo10631b() {
        return this.zzfeo == null ? akt.m2588b() : this.zzfeo;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m2571a(akt akt) {
        if (akt != null) {
            this.zzfeo = akt;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: c */
    public final apc mo10632c() {
        return this.zzfei;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m2573b(apc apc) {
        if (apc != null) {
            this.zzfei = apc;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static akp m2567a(apc apc) {
        return (akp) aqn.m3451a(zzfep, apc);
    }

    /* renamed from: d */
    public static C1033a m2574d() {
        return (C1033a) ((aqn.C1078a) zzfep.mo10613a(aqn.C1082e.f2334e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo10613a(int i, Object obj, Object obj2) {
        switch (akq.f1960a[i - 1]) {
            case 1:
                return new akp();
            case 2:
                return new C1033a((akq) null);
            case 3:
                return m3456a((arw) zzfep, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzfea", "zzfeo", "zzfei"});
            case 4:
                return zzfep;
            case 5:
                ash<akp> ash = zzcas;
                if (ash == null) {
                    synchronized (akp.class) {
                        ash = zzcas;
                        if (ash == null) {
                            ash = new aqn.C1079b<>(zzfep);
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
        aqn.m3458a(akp.class, zzfep);
    }
}
