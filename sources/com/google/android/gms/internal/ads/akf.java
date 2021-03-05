package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;

public final class akf extends aqn<akf, C1028a> implements ary {
    private static volatile ash<akf> zzcas;
    /* access modifiers changed from: private */
    public static final akf zzfed = new akf();
    private int zzfea;
    private akj zzfeb;
    private alu zzfec;

    private akf() {
    }

    /* renamed from: com.google.android.gms.internal.ads.akf$a */
    public static final class C1028a extends aqn.C1078a<akf, C1028a> implements ary {
        private C1028a() {
            super(akf.zzfed);
        }

        /* renamed from: a */
        public final C1028a mo10616a(int i) {
            mo11026b();
            ((akf) this.f2326a).m2525b(i);
            return this;
        }

        /* renamed from: a */
        public final C1028a mo10617a(akj akj) {
            mo11026b();
            ((akf) this.f2326a).m2523a(akj);
            return this;
        }

        /* renamed from: a */
        public final C1028a mo10618a(alu alu) {
            mo11026b();
            ((akf) this.f2326a).m2524a(alu);
            return this;
        }

        /* synthetic */ C1028a(akg akg) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo10612a() {
        return this.zzfea;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m2525b(int i) {
        this.zzfea = i;
    }

    /* renamed from: b */
    public final akj mo10614b() {
        return this.zzfeb == null ? akj.m2548e() : this.zzfeb;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m2523a(akj akj) {
        if (akj != null) {
            this.zzfeb = akj;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: c */
    public final alu mo10615c() {
        return this.zzfec == null ? alu.m2697e() : this.zzfec;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m2524a(alu alu) {
        if (alu != null) {
            this.zzfec = alu;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static akf m2519a(apc apc) {
        return (akf) aqn.m3451a(zzfed, apc);
    }

    /* renamed from: d */
    public static C1028a m2526d() {
        return (C1028a) ((aqn.C1078a) zzfed.mo10613a(aqn.C1082e.f2334e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo10613a(int i, Object obj, Object obj2) {
        switch (akg.f1955a[i - 1]) {
            case 1:
                return new akf();
            case 2:
                return new C1028a((akg) null);
            case 3:
                return m3456a((arw) zzfed, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzfea", "zzfeb", "zzfec"});
            case 4:
                return zzfed;
            case 5:
                ash<akf> ash = zzcas;
                if (ash == null) {
                    synchronized (akf.class) {
                        ash = zzcas;
                        if (ash == null) {
                            ash = new aqn.C1079b<>(zzfed);
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
        aqn.m3458a(akf.class, zzfed);
    }
}
