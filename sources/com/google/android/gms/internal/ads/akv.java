package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;

public final class akv extends aqn<akv, C1036a> implements ary {
    private static volatile ash<akv> zzcas;
    /* access modifiers changed from: private */
    public static final akv zzfes = new akv();
    private int zzfea;
    private apc zzfei = apc.f2174a;

    private akv() {
    }

    /* renamed from: com.google.android.gms.internal.ads.akv$a */
    public static final class C1036a extends aqn.C1078a<akv, C1036a> implements ary {
        private C1036a() {
            super(akv.zzfes);
        }

        /* renamed from: a */
        public final C1036a mo10641a(int i) {
            mo11026b();
            ((akv) this.f2326a).m2595b(0);
            return this;
        }

        /* renamed from: a */
        public final C1036a mo10642a(apc apc) {
            mo11026b();
            ((akv) this.f2326a).m2596b(apc);
            return this;
        }

        /* synthetic */ C1036a(akw akw) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo10639a() {
        return this.zzfea;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m2595b(int i) {
        this.zzfea = i;
    }

    /* renamed from: b */
    public final apc mo10640b() {
        return this.zzfei;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m2596b(apc apc) {
        if (apc != null) {
            this.zzfei = apc;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static akv m2592a(apc apc) {
        return (akv) aqn.m3451a(zzfes, apc);
    }

    /* renamed from: c */
    public static C1036a m2597c() {
        return (C1036a) ((aqn.C1078a) zzfes.mo10613a(aqn.C1082e.f2334e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo10613a(int i, Object obj, Object obj2) {
        switch (akw.f1963a[i - 1]) {
            case 1:
                return new akv();
            case 2:
                return new C1036a((akw) null);
            case 3:
                return m3456a((arw) zzfes, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzfea", "zzfei"});
            case 4:
                return zzfes;
            case 5:
                ash<akv> ash = zzcas;
                if (ash == null) {
                    synchronized (akv.class) {
                        ash = zzcas;
                        if (ash == null) {
                            ash = new aqn.C1079b<>(zzfes);
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
        aqn.m3458a(akv.class, zzfes);
    }
}
