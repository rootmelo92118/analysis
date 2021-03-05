package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;

public final class ama extends aqn<ama, C1050a> implements ary {
    private static volatile ash<ama> zzcas;
    /* access modifiers changed from: private */
    public static final ama zzfgn = new ama();
    private String zzfgk = "";
    private apc zzfgl = apc.f2174a;
    private int zzfgm;

    /* renamed from: com.google.android.gms.internal.ads.ama$b */
    public enum C1051b implements aqq {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        

        /* renamed from: g */
        private static final aqr<C1051b> f2028g = null;

        /* renamed from: h */
        private final int f2030h;

        /* renamed from: a */
        public final int mo10648a() {
            if (this != UNRECOGNIZED) {
                return this.f2030h;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        /* renamed from: a */
        public static C1051b m2734a(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_KEYMATERIAL;
                case 1:
                    return SYMMETRIC;
                case 2:
                    return ASYMMETRIC_PRIVATE;
                case 3:
                    return ASYMMETRIC_PUBLIC;
                case 4:
                    return REMOTE;
                default:
                    return null;
            }
        }

        private C1051b(int i) {
            this.f2030h = i;
        }

        static {
            f2028g = new amc();
        }
    }

    private ama() {
    }

    /* renamed from: com.google.android.gms.internal.ads.ama$a */
    public static final class C1050a extends aqn.C1078a<ama, C1050a> implements ary {
        private C1050a() {
            super(ama.zzfgn);
        }

        /* renamed from: a */
        public final C1050a mo10686a(String str) {
            mo11026b();
            ((ama) this.f2326a).m2723a(str);
            return this;
        }

        /* renamed from: a */
        public final C1050a mo10685a(apc apc) {
            mo11026b();
            ((ama) this.f2326a).m2722a(apc);
            return this;
        }

        /* renamed from: a */
        public final C1050a mo10684a(C1051b bVar) {
            mo11026b();
            ((ama) this.f2326a).m2718a(bVar);
            return this;
        }

        /* synthetic */ C1050a(amb amb) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo10681a() {
        return this.zzfgk;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m2723a(String str) {
        if (str != null) {
            this.zzfgk = str;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: b */
    public final apc mo10682b() {
        return this.zzfgl;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m2722a(apc apc) {
        if (apc != null) {
            this.zzfgl = apc;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: c */
    public final C1051b mo10683c() {
        C1051b a = C1051b.m2734a(this.zzfgm);
        return a == null ? C1051b.UNRECOGNIZED : a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m2718a(C1051b bVar) {
        if (bVar != null) {
            this.zzfgm = bVar.mo10648a();
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: d */
    public static C1050a m2724d() {
        return (C1050a) ((aqn.C1078a) zzfgn.mo10613a(aqn.C1082e.f2334e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo10613a(int i, Object obj, Object obj2) {
        switch (amb.f2031a[i - 1]) {
            case 1:
                return new ama();
            case 2:
                return new C1050a((amb) null);
            case 3:
                return m3456a((arw) zzfgn, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzfgk", "zzfgl", "zzfgm"});
            case 4:
                return zzfgn;
            case 5:
                ash<ama> ash = zzcas;
                if (ash == null) {
                    synchronized (ama.class) {
                        ash = zzcas;
                        if (ash == null) {
                            ash = new aqn.C1079b<>(zzfgn);
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
    public static ama m2725e() {
        return zzfgn;
    }

    static {
        aqn.m3458a(ama.class, zzfgn);
    }
}
