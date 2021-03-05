package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;

public final class alu extends aqn<alu, C1046a> implements ary {
    private static volatile ash<alu> zzcas;
    /* access modifiers changed from: private */
    public static final alu zzfgf = new alu();
    private int zzfea;
    private apc zzfei = apc.f2174a;
    private aly zzfge;

    private alu() {
    }

    /* renamed from: com.google.android.gms.internal.ads.alu$a */
    public static final class C1046a extends aqn.C1078a<alu, C1046a> implements ary {
        private C1046a() {
            super(alu.zzfgf);
        }

        /* renamed from: a */
        public final C1046a mo10674a(int i) {
            mo11026b();
            ((alu) this.f2326a).m2694b(0);
            return this;
        }

        /* renamed from: a */
        public final C1046a mo10675a(aly aly) {
            mo11026b();
            ((alu) this.f2326a).m2693a(aly);
            return this;
        }

        /* renamed from: a */
        public final C1046a mo10676a(apc apc) {
            mo11026b();
            ((alu) this.f2326a).m2695b(apc);
            return this;
        }

        /* synthetic */ C1046a(alv alv) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo10671a() {
        return this.zzfea;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m2694b(int i) {
        this.zzfea = i;
    }

    /* renamed from: b */
    public final aly mo10672b() {
        return this.zzfge == null ? aly.m2712c() : this.zzfge;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m2693a(aly aly) {
        if (aly != null) {
            this.zzfge = aly;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: c */
    public final apc mo10673c() {
        return this.zzfei;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m2695b(apc apc) {
        if (apc != null) {
            this.zzfei = apc;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static alu m2689a(apc apc) {
        return (alu) aqn.m3451a(zzfgf, apc);
    }

    /* renamed from: d */
    public static C1046a m2696d() {
        return (C1046a) ((aqn.C1078a) zzfgf.mo10613a(aqn.C1082e.f2334e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo10613a(int i, Object obj, Object obj2) {
        switch (alv.f2018a[i - 1]) {
            case 1:
                return new alu();
            case 2:
                return new C1046a((alv) null);
            case 3:
                return m3456a((arw) zzfgf, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzfea", "zzfge", "zzfei"});
            case 4:
                return zzfgf;
            case 5:
                ash<alu> ash = zzcas;
                if (ash == null) {
                    synchronized (alu.class) {
                        ash = zzcas;
                        if (ash == null) {
                            ash = new aqn.C1079b<>(zzfgf);
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

    /* renamed from: e */
    public static alu m2697e() {
        return zzfgf;
    }

    static {
        aqn.m3458a(alu.class, zzfgf);
    }
}
