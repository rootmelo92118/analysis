package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;

public final class alm extends aqn<alm, C1044a> implements ary {
    private static volatile ash<alm> zzcas;
    /* access modifiers changed from: private */
    public static final alm zzffn = new alm();
    private int zzfea;
    private ali zzffd;
    private apc zzffl = apc.f2174a;
    private apc zzffm = apc.f2174a;

    private alm() {
    }

    /* renamed from: com.google.android.gms.internal.ads.alm$a */
    public static final class C1044a extends aqn.C1078a<alm, C1044a> implements ary {
        private C1044a() {
            super(alm.zzffn);
        }

        /* renamed from: a */
        public final C1044a mo10664a(int i) {
            mo11026b();
            ((alm) this.f2326a).m2663b(0);
            return this;
        }

        /* renamed from: a */
        public final C1044a mo10665a(ali ali) {
            mo11026b();
            ((alm) this.f2326a).m2659a(ali);
            return this;
        }

        /* renamed from: a */
        public final C1044a mo10666a(apc apc) {
            mo11026b();
            ((alm) this.f2326a).m2665b(apc);
            return this;
        }

        /* renamed from: b */
        public final C1044a mo10667b(apc apc) {
            mo11026b();
            ((alm) this.f2326a).m2666c(apc);
            return this;
        }

        /* synthetic */ C1044a(aln aln) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo10660a() {
        return this.zzfea;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m2663b(int i) {
        this.zzfea = i;
    }

    /* renamed from: b */
    public final ali mo10661b() {
        return this.zzffd == null ? ali.m2636d() : this.zzffd;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m2659a(ali ali) {
        if (ali != null) {
            this.zzffd = ali;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: c */
    public final apc mo10662c() {
        return this.zzffl;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m2665b(apc apc) {
        if (apc != null) {
            this.zzffl = apc;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: d */
    public final apc mo10663d() {
        return this.zzffm;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m2666c(apc apc) {
        if (apc != null) {
            this.zzffm = apc;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static alm m2658a(apc apc) {
        return (alm) aqn.m3451a(zzffn, apc);
    }

    /* renamed from: e */
    public static C1044a m2667e() {
        return (C1044a) ((aqn.C1078a) zzffn.mo10613a(aqn.C1082e.f2334e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo10613a(int i, Object obj, Object obj2) {
        switch (aln.f2000a[i - 1]) {
            case 1:
                return new alm();
            case 2:
                return new C1044a((aln) null);
            case 3:
                return m3456a((arw) zzffn, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzfea", "zzffd", "zzffl", "zzffm"});
            case 4:
                return zzffn;
            case 5:
                ash<alm> ash = zzcas;
                if (ash == null) {
                    synchronized (alm.class) {
                        ash = zzcas;
                        if (ash == null) {
                            ash = new aqn.C1079b<>(zzffn);
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

    /* renamed from: f */
    public static alm m2668f() {
        return zzffn;
    }

    static {
        aqn.m3458a(alm.class, zzffn);
    }
}
