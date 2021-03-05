package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;

public final class alk extends aqn<alk, C1043a> implements ary {
    private static volatile ash<alk> zzcas;
    /* access modifiers changed from: private */
    public static final alk zzffk = new alk();
    private int zzfea;
    private apc zzfei = apc.f2174a;
    private alm zzffj;

    private alk() {
    }

    /* renamed from: com.google.android.gms.internal.ads.alk$a */
    public static final class C1043a extends aqn.C1078a<alk, C1043a> implements ary {
        private C1043a() {
            super(alk.zzffk);
        }

        /* renamed from: a */
        public final C1043a mo10657a(int i) {
            mo11026b();
            ((alk) this.f2326a).m2647b(0);
            return this;
        }

        /* renamed from: a */
        public final C1043a mo10658a(alm alm) {
            mo11026b();
            ((alk) this.f2326a).m2646a(alm);
            return this;
        }

        /* renamed from: a */
        public final C1043a mo10659a(apc apc) {
            mo11026b();
            ((alk) this.f2326a).m2648b(apc);
            return this;
        }

        /* synthetic */ C1043a(all all) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo10654a() {
        return this.zzfea;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m2647b(int i) {
        this.zzfea = i;
    }

    /* renamed from: b */
    public final alm mo10655b() {
        return this.zzffj == null ? alm.m2668f() : this.zzffj;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m2646a(alm alm) {
        if (alm != null) {
            this.zzffj = alm;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: c */
    public final apc mo10656c() {
        return this.zzfei;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m2648b(apc apc) {
        if (apc != null) {
            this.zzfei = apc;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static alk m2642a(apc apc) {
        return (alk) aqn.m3451a(zzffk, apc);
    }

    /* renamed from: d */
    public static C1043a m2649d() {
        return (C1043a) ((aqn.C1078a) zzffk.mo10613a(aqn.C1082e.f2334e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo10613a(int i, Object obj, Object obj2) {
        switch (all.f1999a[i - 1]) {
            case 1:
                return new alk();
            case 2:
                return new C1043a((all) null);
            case 3:
                return m3456a((arw) zzffk, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzfea", "zzffj", "zzfei"});
            case 4:
                return zzffk;
            case 5:
                ash<alk> ash = zzcas;
                if (ash == null) {
                    synchronized (alk.class) {
                        ash = zzcas;
                        if (ash == null) {
                            ash = new aqn.C1079b<>(zzffk);
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
        aqn.m3458a(alk.class, zzffk);
    }
}
