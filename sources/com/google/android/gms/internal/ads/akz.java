package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;

public final class akz extends aqn<akz, C1038a> implements ary {
    private static volatile ash<akz> zzcas;
    /* access modifiers changed from: private */
    public static final akz zzfeu = new akz();
    private int zzfea;
    private apc zzfei = apc.f2174a;

    private akz() {
    }

    /* renamed from: com.google.android.gms.internal.ads.akz$a */
    public static final class C1038a extends aqn.C1078a<akz, C1038a> implements ary {
        private C1038a() {
            super(akz.zzfeu);
        }

        /* renamed from: a */
        public final C1038a mo10646a(int i) {
            mo11026b();
            ((akz) this.f2326a).m2611b(0);
            return this;
        }

        /* renamed from: a */
        public final C1038a mo10647a(apc apc) {
            mo11026b();
            ((akz) this.f2326a).m2612b(apc);
            return this;
        }

        /* synthetic */ C1038a(ala ala) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo10644a() {
        return this.zzfea;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m2611b(int i) {
        this.zzfea = i;
    }

    /* renamed from: b */
    public final apc mo10645b() {
        return this.zzfei;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m2612b(apc apc) {
        if (apc != null) {
            this.zzfei = apc;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static akz m2608a(apc apc) {
        return (akz) aqn.m3451a(zzfeu, apc);
    }

    /* renamed from: c */
    public static C1038a m2613c() {
        return (C1038a) ((aqn.C1078a) zzfeu.mo10613a(aqn.C1082e.f2334e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo10613a(int i, Object obj, Object obj2) {
        switch (ala.f1965a[i - 1]) {
            case 1:
                return new akz();
            case 2:
                return new C1038a((ala) null);
            case 3:
                return m3456a((arw) zzfeu, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzfea", "zzfei"});
            case 4:
                return zzfeu;
            case 5:
                ash<akz> ash = zzcas;
                if (ash == null) {
                    synchronized (akz.class) {
                        ash = zzcas;
                        if (ash == null) {
                            ash = new aqn.C1079b<>(zzfeu);
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
        aqn.m3458a(akz.class, zzfeu);
    }
}
