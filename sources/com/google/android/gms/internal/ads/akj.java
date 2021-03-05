package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;

public final class akj extends aqn<akj, C1030a> implements ary {
    private static volatile ash<akj> zzcas;
    /* access modifiers changed from: private */
    public static final akj zzfej = new akj();
    private int zzfea;
    private akn zzfeh;
    private apc zzfei = apc.f2174a;

    private akj() {
    }

    /* renamed from: com.google.android.gms.internal.ads.akj$a */
    public static final class C1030a extends aqn.C1078a<akj, C1030a> implements ary {
        private C1030a() {
            super(akj.zzfej);
        }

        /* renamed from: a */
        public final C1030a mo10624a(int i) {
            mo11026b();
            ((akj) this.f2326a).m2545b(0);
            return this;
        }

        /* renamed from: a */
        public final C1030a mo10625a(akn akn) {
            mo11026b();
            ((akj) this.f2326a).m2544a(akn);
            return this;
        }

        /* renamed from: a */
        public final C1030a mo10626a(apc apc) {
            mo11026b();
            ((akj) this.f2326a).m2546b(apc);
            return this;
        }

        /* synthetic */ C1030a(akk akk) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo10621a() {
        return this.zzfea;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m2545b(int i) {
        this.zzfea = i;
    }

    /* renamed from: b */
    public final akn mo10622b() {
        return this.zzfeh == null ? akn.m2563b() : this.zzfeh;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m2544a(akn akn) {
        if (akn != null) {
            this.zzfeh = akn;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: c */
    public final apc mo10623c() {
        return this.zzfei;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m2546b(apc apc) {
        if (apc != null) {
            this.zzfei = apc;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static akj m2540a(apc apc) {
        return (akj) aqn.m3451a(zzfej, apc);
    }

    /* renamed from: d */
    public static C1030a m2547d() {
        return (C1030a) ((aqn.C1078a) zzfej.mo10613a(aqn.C1082e.f2334e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo10613a(int i, Object obj, Object obj2) {
        switch (akk.f1957a[i - 1]) {
            case 1:
                return new akj();
            case 2:
                return new C1030a((akk) null);
            case 3:
                return m3456a((arw) zzfej, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzfea", "zzfeh", "zzfei"});
            case 4:
                return zzfej;
            case 5:
                ash<akj> ash = zzcas;
                if (ash == null) {
                    synchronized (akj.class) {
                        ash = zzcas;
                        if (ash == null) {
                            ash = new aqn.C1079b<>(zzfej);
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
    public static akj m2548e() {
        return zzfej;
    }

    static {
        aqn.m3458a(akj.class, zzfej);
    }
}
