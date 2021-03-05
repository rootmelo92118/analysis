package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;

public final class bph {

    /* renamed from: com.google.android.gms.internal.ads.bph$a */
    public static final class C1146a extends aqn<C1146a, C1148b> implements ary {
        private static volatile ash<C1146a> zzcas;
        /* access modifiers changed from: private */
        public static final C1146a zzccj = new C1146a();
        private int zzccg;
        private int zzcch;
        private C1172l zzcci;

        /* renamed from: com.google.android.gms.internal.ads.bph$a$a */
        public enum C1147a implements aqq {
            AD_FORMAT_TYPE_UNSPECIFIED(0),
            BANNER(1),
            INTERSTITIAL(2),
            NATIVE_EXPRESS(3),
            NATIVE_CONTENT(4),
            NATIVE_APP_INSTALL(5),
            NATIVE_CUSTOM_TEMPLATE(6),
            DFP_BANNER(7),
            DFP_INTERSTITIAL(8),
            REWARD_BASED_VIDEO_AD(9),
            BANNER_SEARCH_ADS(10);
            

            /* renamed from: l */
            private static final aqr<C1147a> f4984l = null;

            /* renamed from: m */
            private final int f4986m;

            /* renamed from: a */
            public final int mo10648a() {
                return this.f4986m;
            }

            /* renamed from: a */
            public static C1147a m6137a(int i) {
                switch (i) {
                    case 0:
                        return AD_FORMAT_TYPE_UNSPECIFIED;
                    case 1:
                        return BANNER;
                    case 2:
                        return INTERSTITIAL;
                    case 3:
                        return NATIVE_EXPRESS;
                    case 4:
                        return NATIVE_CONTENT;
                    case 5:
                        return NATIVE_APP_INSTALL;
                    case 6:
                        return NATIVE_CUSTOM_TEMPLATE;
                    case 7:
                        return DFP_BANNER;
                    case 8:
                        return DFP_INTERSTITIAL;
                    case 9:
                        return REWARD_BASED_VIDEO_AD;
                    case 10:
                        return BANNER_SEARCH_ADS;
                    default:
                        return null;
                }
            }

            /* renamed from: b */
            public static aqs m6138b() {
                return bpk.f5014a;
            }

            private C1147a(int i) {
                this.f4986m = i;
            }

            static {
                f4984l = new bpj();
            }
        }

        private C1146a() {
        }

        /* renamed from: com.google.android.gms.internal.ads.bph$a$b */
        public static final class C1148b extends aqn.C1078a<C1146a, C1148b> implements ary {
            private C1148b() {
                super(C1146a.zzccj);
            }

            /* synthetic */ C1148b(bpi bpi) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo10613a(int i, Object obj, Object obj2) {
            switch (bpi.f5013a[i - 1]) {
                case 1:
                    return new C1146a();
                case 2:
                    return new C1148b((bpi) null);
                case 3:
                    return m3456a((arw) zzccj, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001", new Object[]{"zzccg", "zzcch", C1147a.m6138b(), "zzcci"});
                case 4:
                    return zzccj;
                case 5:
                    ash<C1146a> ash = zzcas;
                    if (ash == null) {
                        synchronized (C1146a.class) {
                            ash = zzcas;
                            if (ash == null) {
                                ash = new aqn.C1079b<>(zzccj);
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

        /* renamed from: a */
        public static ash<C1146a> m6134a() {
            return (ash) zzccj.mo10613a(aqn.C1082e.f2336g, (Object) null, (Object) null);
        }

        static {
            aqn.m3458a(C1146a.class, zzccj);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.bph$b */
    public static final class C1149b extends aqn<C1149b, C1150a> implements ary {
        private static volatile ash<C1149b> zzcas;
        /* access modifiers changed from: private */
        public static final C1149b zzcda = new C1149b();
        private int zzccg;
        private String zzccx = "";
        private aqu<C1146a> zzccy = m3462n();
        private int zzccz;

        private C1149b() {
        }

        /* renamed from: com.google.android.gms.internal.ads.bph$b$a */
        public static final class C1150a extends aqn.C1078a<C1149b, C1150a> implements ary {
            private C1150a() {
                super(C1149b.zzcda);
            }

            /* synthetic */ C1150a(bpi bpi) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo10613a(int i, Object obj, Object obj2) {
            switch (bpi.f5013a[i - 1]) {
                case 1:
                    return new C1149b();
                case 2:
                    return new C1150a((bpi) null);
                case 3:
                    return m3456a((arw) zzcda, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\b\u0000\u0002\u001b\u0003\f\u0001", new Object[]{"zzccg", "zzccx", "zzccy", C1146a.class, "zzccz", bpo.m6215b()});
                case 4:
                    return zzcda;
                case 5:
                    ash<C1149b> ash = zzcas;
                    if (ash == null) {
                        synchronized (C1149b.class) {
                            ash = zzcas;
                            if (ash == null) {
                                ash = new aqn.C1079b<>(zzcda);
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

        /* renamed from: a */
        public static ash<C1149b> m6140a() {
            return (ash) zzcda.mo10613a(aqn.C1082e.f2336g, (Object) null, (Object) null);
        }

        static {
            aqn.m3458a(C1149b.class, zzcda);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.bph$c */
    public static final class C1151c extends aqn<C1151c, C1152a> implements ary {
        private static volatile ash<C1151c> zzcas;
        /* access modifiers changed from: private */
        public static final C1151c zzcdh = new C1151c();
        private int zzccg;
        private int zzcdb;
        private C1176n zzcdc;
        private C1176n zzcdd;
        private C1176n zzcde;
        private aqu<C1176n> zzcdf = m3462n();
        private int zzcdg;

        private C1151c() {
        }

        /* renamed from: com.google.android.gms.internal.ads.bph$c$a */
        public static final class C1152a extends aqn.C1078a<C1151c, C1152a> implements ary {
            private C1152a() {
                super(C1151c.zzcdh);
            }

            /* synthetic */ C1152a(bpi bpi) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo10613a(int i, Object obj, Object obj2) {
            switch (bpi.f5013a[i - 1]) {
                case 1:
                    return new C1151c();
                case 2:
                    return new C1152a((bpi) null);
                case 3:
                    return m3456a((arw) zzcdh, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u0004\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0005\u001b\u0006\u0004\u0004", new Object[]{"zzccg", "zzcdb", "zzcdc", "zzcdd", "zzcde", "zzcdf", C1176n.class, "zzcdg"});
                case 4:
                    return zzcdh;
                case 5:
                    ash<C1151c> ash = zzcas;
                    if (ash == null) {
                        synchronized (C1151c.class) {
                            ash = zzcas;
                            if (ash == null) {
                                ash = new aqn.C1079b<>(zzcdh);
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

        /* renamed from: a */
        public static ash<C1151c> m6143a() {
            return (ash) zzcdh.mo10613a(aqn.C1082e.f2336g, (Object) null, (Object) null);
        }

        static {
            aqn.m3458a(C1151c.class, zzcdh);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.bph$d */
    public static final class C1153d extends aqn<C1153d, C1154a> implements ary {
        private static volatile ash<C1153d> zzcas;
        /* access modifiers changed from: private */
        public static final C1153d zzcdm = new C1153d();
        private int zzccg;
        private int zzcdi;
        private C1178o zzcdj;
        private String zzcdk = "";
        private String zzcdl = "";

        /* renamed from: com.google.android.gms.internal.ads.bph$d$b */
        public enum C1155b implements aqq {
            PLATFORM_UNSPECIFIED(0),
            IOS(1),
            ANDROID(2);
            

            /* renamed from: d */
            private static final aqr<C1155b> f4990d = null;

            /* renamed from: e */
            private final int f4992e;

            /* renamed from: a */
            public final int mo10648a() {
                return this.f4992e;
            }

            /* renamed from: a */
            public static C1155b m6148a(int i) {
                switch (i) {
                    case 0:
                        return PLATFORM_UNSPECIFIED;
                    case 1:
                        return IOS;
                    case 2:
                        return ANDROID;
                    default:
                        return null;
                }
            }

            /* renamed from: b */
            public static aqs m6149b() {
                return bpn.f5025a;
            }

            private C1155b(int i) {
                this.f4992e = i;
            }

            static {
                f4990d = new bpm();
            }
        }

        private C1153d() {
        }

        /* renamed from: com.google.android.gms.internal.ads.bph$d$a */
        public static final class C1154a extends aqn.C1078a<C1153d, C1154a> implements ary {
            private C1154a() {
                super(C1153d.zzcdm);
            }

            /* synthetic */ C1154a(bpi bpi) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo10613a(int i, Object obj, Object obj2) {
            switch (bpi.f5013a[i - 1]) {
                case 1:
                    return new C1153d();
                case 2:
                    return new C1154a((bpi) null);
                case 3:
                    return m3456a((arw) zzcdm, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005\f\u0000\u0006\t\u0001\u0007\b\u0002\b\b\u0003", new Object[]{"zzccg", "zzcdi", C1155b.m6149b(), "zzcdj", "zzcdk", "zzcdl"});
                case 4:
                    return zzcdm;
                case 5:
                    ash<C1153d> ash = zzcas;
                    if (ash == null) {
                        synchronized (C1153d.class) {
                            ash = zzcas;
                            if (ash == null) {
                                ash = new aqn.C1079b<>(zzcdm);
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
            aqn.m3458a(C1153d.class, zzcdm);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.bph$e */
    public static final class C1156e extends aqn<C1156e, C1157a> implements ary {
        private static volatile ash<C1156e> zzcas;
        /* access modifiers changed from: private */
        public static final C1156e zzcdz = new C1156e();
        private int zzccg;
        private String zzcdv = "";
        private int zzcdw;
        private aqt zzcdx = m3461m();
        private C1176n zzcdy;

        private C1156e() {
        }

        /* renamed from: com.google.android.gms.internal.ads.bph$e$a */
        public static final class C1157a extends aqn.C1078a<C1156e, C1157a> implements ary {
            private C1157a() {
                super(C1156e.zzcdz);
            }

            /* synthetic */ C1157a(bpi bpi) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo10613a(int i, Object obj, Object obj2) {
            switch (bpi.f5013a[i - 1]) {
                case 1:
                    return new C1156e();
                case 2:
                    return new C1157a((bpi) null);
                case 3:
                    return m3456a((arw) zzcdz, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\b\u0000\u0002\f\u0001\u0003\u0016\u0004\t\u0002", new Object[]{"zzccg", "zzcdv", "zzcdw", bpo.m6215b(), "zzcdx", "zzcdy"});
                case 4:
                    return zzcdz;
                case 5:
                    ash<C1156e> ash = zzcas;
                    if (ash == null) {
                        synchronized (C1156e.class) {
                            ash = zzcas;
                            if (ash == null) {
                                ash = new aqn.C1079b<>(zzcdz);
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
            aqn.m3458a(C1156e.class, zzcdz);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.bph$f */
    public static final class C1158f extends aqn<C1158f, C1159a> implements ary {
        private static volatile ash<C1158f> zzcas;
        /* access modifiers changed from: private */
        public static final C1158f zzceb = new C1158f();
        private int zzccg;
        private aqt zzcdx = m3461m();
        private int zzcea;

        private C1158f() {
        }

        /* renamed from: com.google.android.gms.internal.ads.bph$f$a */
        public static final class C1159a extends aqn.C1078a<C1158f, C1159a> implements ary {
            private C1159a() {
                super(C1158f.zzceb);
            }

            /* synthetic */ C1159a(bpi bpi) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo10613a(int i, Object obj, Object obj2) {
            switch (bpi.f5013a[i - 1]) {
                case 1:
                    return new C1158f();
                case 2:
                    return new C1159a((bpi) null);
                case 3:
                    return m3456a((arw) zzceb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u0016", new Object[]{"zzccg", "zzcea", bpo.m6215b(), "zzcdx"});
                case 4:
                    return zzceb;
                case 5:
                    ash<C1158f> ash = zzcas;
                    if (ash == null) {
                        synchronized (C1158f.class) {
                            ash = zzcas;
                            if (ash == null) {
                                ash = new aqn.C1079b<>(zzceb);
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

        /* renamed from: a */
        public static ash<C1158f> m6153a() {
            return (ash) zzceb.mo10613a(aqn.C1082e.f2336g, (Object) null, (Object) null);
        }

        static {
            aqn.m3458a(C1158f.class, zzceb);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.bph$g */
    public static final class C1160g extends aqn<C1160g, C1161a> implements ary {
        private static volatile ash<C1160g> zzcas;
        /* access modifiers changed from: private */
        public static final C1160g zzcee = new C1160g();
        private int zzccg;
        private C1176n zzcdy;
        private int zzcea;
        private C1156e zzcec;
        private aqu<C1174m> zzced = m3462n();

        private C1160g() {
        }

        /* renamed from: com.google.android.gms.internal.ads.bph$g$a */
        public static final class C1161a extends aqn.C1078a<C1160g, C1161a> implements ary {
            private C1161a() {
                super(C1160g.zzcee);
            }

            /* synthetic */ C1161a(bpi bpi) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo10613a(int i, Object obj, Object obj2) {
            switch (bpi.f5013a[i - 1]) {
                case 1:
                    return new C1160g();
                case 2:
                    return new C1161a((bpi) null);
                case 3:
                    return m3456a((arw) zzcee, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0000\u0002\u001b\u0003\f\u0001\u0004\t\u0002", new Object[]{"zzccg", "zzcec", "zzced", C1174m.class, "zzcea", bpo.m6215b(), "zzcdy"});
                case 4:
                    return zzcee;
                case 5:
                    ash<C1160g> ash = zzcas;
                    if (ash == null) {
                        synchronized (C1160g.class) {
                            ash = zzcas;
                            if (ash == null) {
                                ash = new aqn.C1079b<>(zzcee);
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

        /* renamed from: a */
        public static ash<C1160g> m6156a() {
            return (ash) zzcee.mo10613a(aqn.C1082e.f2336g, (Object) null, (Object) null);
        }

        static {
            aqn.m3458a(C1160g.class, zzcee);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.bph$h */
    public static final class C1162h extends aqn<C1162h, C1163a> implements ary {
        private static volatile ash<C1162h> zzcas;
        /* access modifiers changed from: private */
        public static final C1162h zzceg = new C1162h();
        private int zzccg;
        private int zzcch;
        private int zzcef;

        /* renamed from: com.google.android.gms.internal.ads.bph$h$b */
        public enum C1164b implements aqq {
            CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
            TWO_G(1),
            THREE_G(2),
            LTE(4);
            

            /* renamed from: e */
            private static final aqr<C1164b> f4997e = null;

            /* renamed from: f */
            private final int f4999f;

            /* renamed from: a */
            public final int mo10648a() {
                return this.f4999f;
            }

            /* renamed from: a */
            public static C1164b m6162a(int i) {
                if (i == 4) {
                    return LTE;
                }
                switch (i) {
                    case 0:
                        return CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    case 1:
                        return TWO_G;
                    case 2:
                        return THREE_G;
                    default:
                        return null;
                }
            }

            /* renamed from: b */
            public static aqs m6163b() {
                return bps.f5033a;
            }

            private C1164b(int i) {
                this.f4999f = i;
            }

            static {
                f4997e = new bpr();
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.bph$h$c */
        public enum C1165c implements aqq {
            NETWORKTYPE_UNSPECIFIED(0),
            CELL(1),
            WIFI(2);
            

            /* renamed from: d */
            private static final aqr<C1165c> f5003d = null;

            /* renamed from: e */
            private final int f5005e;

            /* renamed from: a */
            public final int mo10648a() {
                return this.f5005e;
            }

            /* renamed from: a */
            public static C1165c m6165a(int i) {
                switch (i) {
                    case 0:
                        return NETWORKTYPE_UNSPECIFIED;
                    case 1:
                        return CELL;
                    case 2:
                        return WIFI;
                    default:
                        return null;
                }
            }

            /* renamed from: b */
            public static aqs m6166b() {
                return bpu.f5034a;
            }

            private C1165c(int i) {
                this.f5005e = i;
            }

            static {
                f5003d = new bpt();
            }
        }

        private C1162h() {
        }

        /* renamed from: com.google.android.gms.internal.ads.bph$h$a */
        public static final class C1163a extends aqn.C1078a<C1162h, C1163a> implements ary {
            private C1163a() {
                super(C1162h.zzceg);
            }

            /* synthetic */ C1163a(bpi bpi) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo10613a(int i, Object obj, Object obj2) {
            switch (bpi.f5013a[i - 1]) {
                case 1:
                    return new C1162h();
                case 2:
                    return new C1163a((bpi) null);
                case 3:
                    return m3456a((arw) zzceg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001", new Object[]{"zzccg", "zzcch", C1165c.m6166b(), "zzcef", C1164b.m6163b()});
                case 4:
                    return zzceg;
                case 5:
                    ash<C1162h> ash = zzcas;
                    if (ash == null) {
                        synchronized (C1162h.class) {
                            ash = zzcas;
                            if (ash == null) {
                                ash = new aqn.C1079b<>(zzceg);
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

        /* renamed from: a */
        public static ash<C1162h> m6159a() {
            return (ash) zzceg.mo10613a(aqn.C1082e.f2336g, (Object) null, (Object) null);
        }

        static {
            aqn.m3458a(C1162h.class, zzceg);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.bph$i */
    public static final class C1166i extends aqn<C1166i, C1167a> implements ary {
        private static volatile ash<C1166i> zzcas;
        /* access modifiers changed from: private */
        public static final C1166i zzces = new C1166i();
        private int zzccg;
        private int zzceq;
        private C1176n zzcer;

        private C1166i() {
        }

        /* renamed from: com.google.android.gms.internal.ads.bph$i$a */
        public static final class C1167a extends aqn.C1078a<C1166i, C1167a> implements ary {
            private C1167a() {
                super(C1166i.zzces);
            }

            /* synthetic */ C1167a(bpi bpi) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo10613a(int i, Object obj, Object obj2) {
            switch (bpi.f5013a[i - 1]) {
                case 1:
                    return new C1166i();
                case 2:
                    return new C1167a((bpi) null);
                case 3:
                    return m3456a((arw) zzces, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001", new Object[]{"zzccg", "zzceq", bpo.m6215b(), "zzcer"});
                case 4:
                    return zzces;
                case 5:
                    ash<C1166i> ash = zzcas;
                    if (ash == null) {
                        synchronized (C1166i.class) {
                            ash = zzcas;
                            if (ash == null) {
                                ash = new aqn.C1079b<>(zzces);
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

        /* renamed from: a */
        public static ash<C1166i> m6168a() {
            return (ash) zzces.mo10613a(aqn.C1082e.f2336g, (Object) null, (Object) null);
        }

        static {
            aqn.m3458a(C1166i.class, zzces);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.bph$j */
    public static final class C1168j extends aqn<C1168j, C1169a> implements ary {
        private static volatile ash<C1168j> zzcas;
        /* access modifiers changed from: private */
        public static final C1168j zzcfe = new C1168j();
        private int zzccg;
        private int zzcet = 1000;
        private int zzceu = 1000;
        private int zzcev;
        private int zzcew;
        private int zzcex;
        private int zzcey;
        private int zzcez;
        private int zzcfa;
        private int zzcfb;
        private int zzcfc;
        private C1170k zzcfd;

        private C1168j() {
        }

        /* renamed from: com.google.android.gms.internal.ads.bph$j$a */
        public static final class C1169a extends aqn.C1078a<C1168j, C1169a> implements ary {
            private C1169a() {
                super(C1168j.zzcfe);
            }

            /* synthetic */ C1169a(bpi bpi) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo10613a(int i, Object obj, Object obj2) {
            switch (bpi.f5013a[i - 1]) {
                case 1:
                    return new C1168j();
                case 2:
                    return new C1169a((bpi) null);
                case 3:
                    return m3456a((arw) zzcfe, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\u0004\u0006\b\u0004\u0007\t\u0004\b\n\u0004\t\u000b\t\n", new Object[]{"zzccg", "zzcet", bpo.m6215b(), "zzceu", bpo.m6215b(), "zzcev", "zzcew", "zzcex", "zzcey", "zzcez", "zzcfa", "zzcfb", "zzcfc", "zzcfd"});
                case 4:
                    return zzcfe;
                case 5:
                    ash<C1168j> ash = zzcas;
                    if (ash == null) {
                        synchronized (C1168j.class) {
                            ash = zzcas;
                            if (ash == null) {
                                ash = new aqn.C1079b<>(zzcfe);
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

        /* renamed from: a */
        public static ash<C1168j> m6171a() {
            return (ash) zzcfe.mo10613a(aqn.C1082e.f2336g, (Object) null, (Object) null);
        }

        static {
            aqn.m3458a(C1168j.class, zzcfe);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.bph$k */
    public static final class C1170k extends aqn<C1170k, C1171a> implements ary {
        private static volatile ash<C1170k> zzcas;
        /* access modifiers changed from: private */
        public static final C1170k zzcfh = new C1170k();
        private int zzccg;
        private int zzcff;
        private int zzcfg;

        private C1170k() {
        }

        /* renamed from: com.google.android.gms.internal.ads.bph$k$a */
        public static final class C1171a extends aqn.C1078a<C1170k, C1171a> implements ary {
            private C1171a() {
                super(C1170k.zzcfh);
            }

            /* synthetic */ C1171a(bpi bpi) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo10613a(int i, Object obj, Object obj2) {
            switch (bpi.f5013a[i - 1]) {
                case 1:
                    return new C1170k();
                case 2:
                    return new C1171a((bpi) null);
                case 3:
                    return m3456a((arw) zzcfh, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", new Object[]{"zzccg", "zzcff", "zzcfg"});
                case 4:
                    return zzcfh;
                case 5:
                    ash<C1170k> ash = zzcas;
                    if (ash == null) {
                        synchronized (C1170k.class) {
                            ash = zzcas;
                            if (ash == null) {
                                ash = new aqn.C1079b<>(zzcfh);
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
            aqn.m3458a(C1170k.class, zzcfh);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.bph$l */
    public static final class C1172l extends aqn<C1172l, C1173a> implements ary {
        private static volatile ash<C1172l> zzcas;
        /* access modifiers changed from: private */
        public static final C1172l zzcfk = new C1172l();
        private int zzccg;
        private int zzcfi;
        private int zzcfj;

        private C1172l() {
        }

        /* renamed from: com.google.android.gms.internal.ads.bph$l$a */
        public static final class C1173a extends aqn.C1078a<C1172l, C1173a> implements ary {
            private C1173a() {
                super(C1172l.zzcfk);
            }

            /* synthetic */ C1173a(bpi bpi) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo10613a(int i, Object obj, Object obj2) {
            switch (bpi.f5013a[i - 1]) {
                case 1:
                    return new C1172l();
                case 2:
                    return new C1173a((bpi) null);
                case 3:
                    return m3456a((arw) zzcfk, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", new Object[]{"zzccg", "zzcfi", "zzcfj"});
                case 4:
                    return zzcfk;
                case 5:
                    ash<C1172l> ash = zzcas;
                    if (ash == null) {
                        synchronized (C1172l.class) {
                            ash = zzcas;
                            if (ash == null) {
                                ash = new aqn.C1079b<>(zzcfk);
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
            aqn.m3458a(C1172l.class, zzcfk);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.bph$m */
    public static final class C1174m extends aqn<C1174m, C1175a> implements ary {
        private static volatile ash<C1174m> zzcas;
        /* access modifiers changed from: private */
        public static final C1174m zzcfl = new C1174m();
        private int zzccg;
        private String zzcdv = "";
        private int zzcdw;
        private C1176n zzcdy;

        private C1174m() {
        }

        /* renamed from: com.google.android.gms.internal.ads.bph$m$a */
        public static final class C1175a extends aqn.C1078a<C1174m, C1175a> implements ary {
            private C1175a() {
                super(C1174m.zzcfl);
            }

            /* synthetic */ C1175a(bpi bpi) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo10613a(int i, Object obj, Object obj2) {
            switch (bpi.f5013a[i - 1]) {
                case 1:
                    return new C1174m();
                case 2:
                    return new C1175a((bpi) null);
                case 3:
                    return m3456a((arw) zzcfl, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\f\u0001\u0003\t\u0002", new Object[]{"zzccg", "zzcdv", "zzcdw", bpo.m6215b(), "zzcdy"});
                case 4:
                    return zzcfl;
                case 5:
                    ash<C1174m> ash = zzcas;
                    if (ash == null) {
                        synchronized (C1174m.class) {
                            ash = zzcas;
                            if (ash == null) {
                                ash = new aqn.C1079b<>(zzcfl);
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
            aqn.m3458a(C1174m.class, zzcfl);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.bph$n */
    public static final class C1176n extends aqn<C1176n, C1177a> implements ary {
        private static volatile ash<C1176n> zzcas;
        /* access modifiers changed from: private */
        public static final C1176n zzcfo = new C1176n();
        private int zzccg;
        private int zzcfm;
        private int zzcfn;

        private C1176n() {
        }

        /* renamed from: com.google.android.gms.internal.ads.bph$n$a */
        public static final class C1177a extends aqn.C1078a<C1176n, C1177a> implements ary {
            private C1177a() {
                super(C1176n.zzcfo);
            }

            /* synthetic */ C1177a(bpi bpi) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo10613a(int i, Object obj, Object obj2) {
            switch (bpi.f5013a[i - 1]) {
                case 1:
                    return new C1176n();
                case 2:
                    return new C1177a((bpi) null);
                case 3:
                    return m3456a((arw) zzcfo, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", new Object[]{"zzccg", "zzcfm", "zzcfn"});
                case 4:
                    return zzcfo;
                case 5:
                    ash<C1176n> ash = zzcas;
                    if (ash == null) {
                        synchronized (C1176n.class) {
                            ash = zzcas;
                            if (ash == null) {
                                ash = new aqn.C1079b<>(zzcfo);
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

        /* renamed from: a */
        public static ash<C1176n> m6180a() {
            return (ash) zzcfo.mo10613a(aqn.C1082e.f2336g, (Object) null, (Object) null);
        }

        static {
            aqn.m3458a(C1176n.class, zzcfo);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.bph$o */
    public static final class C1178o extends aqn<C1178o, C1179a> implements ary {
        private static volatile ash<C1178o> zzcas;
        /* access modifiers changed from: private */
        public static final C1178o zzcfs = new C1178o();
        private int zzccg;
        private int zzcfp;
        private int zzcfq;
        private int zzcfr;

        private C1178o() {
        }

        /* renamed from: com.google.android.gms.internal.ads.bph$o$a */
        public static final class C1179a extends aqn.C1078a<C1178o, C1179a> implements ary {
            private C1179a() {
                super(C1178o.zzcfs);
            }

            /* synthetic */ C1179a(bpi bpi) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo10613a(int i, Object obj, Object obj2) {
            switch (bpi.f5013a[i - 1]) {
                case 1:
                    return new C1178o();
                case 2:
                    return new C1179a((bpi) null);
                case 3:
                    return m3456a((arw) zzcfs, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0004\u0002", new Object[]{"zzccg", "zzcfp", "zzcfq", "zzcfr"});
                case 4:
                    return zzcfs;
                case 5:
                    ash<C1178o> ash = zzcas;
                    if (ash == null) {
                        synchronized (C1178o.class) {
                            ash = zzcas;
                            if (ash == null) {
                                ash = new aqn.C1079b<>(zzcfs);
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
            aqn.m3458a(C1178o.class, zzcfs);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.bph$p */
    public static final class C1180p extends aqn<C1180p, C1181a> implements ary {
        private static volatile ash<C1180p> zzcas;
        /* access modifiers changed from: private */
        public static final C1180p zzcfv = new C1180p();
        private int zzccg;
        private int zzcea = 1000;
        private C1182q zzcft;
        private C1176n zzcfu;

        private C1180p() {
        }

        /* renamed from: com.google.android.gms.internal.ads.bph$p$a */
        public static final class C1181a extends aqn.C1078a<C1180p, C1181a> implements ary {
            private C1181a() {
                super(C1180p.zzcfv);
            }

            /* synthetic */ C1181a(bpi bpi) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo10613a(int i, Object obj, Object obj2) {
            switch (bpi.f5013a[i - 1]) {
                case 1:
                    return new C1180p();
                case 2:
                    return new C1181a((bpi) null);
                case 3:
                    return m3456a((arw) zzcfv, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzccg", "zzcea", bpo.m6215b(), "zzcft", "zzcfu"});
                case 4:
                    return zzcfv;
                case 5:
                    ash<C1180p> ash = zzcas;
                    if (ash == null) {
                        synchronized (C1180p.class) {
                            ash = zzcas;
                            if (ash == null) {
                                ash = new aqn.C1079b<>(zzcfv);
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

        /* renamed from: a */
        public static ash<C1180p> m6185a() {
            return (ash) zzcfv.mo10613a(aqn.C1082e.f2336g, (Object) null, (Object) null);
        }

        static {
            aqn.m3458a(C1180p.class, zzcfv);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.bph$q */
    public static final class C1182q extends aqn<C1182q, C1183a> implements ary {
        private static volatile ash<C1182q> zzcas;
        /* access modifiers changed from: private */
        public static final C1182q zzcfx = new C1182q();
        private int zzccg;
        private int zzcfw;

        /* renamed from: com.google.android.gms.internal.ads.bph$q$b */
        public enum C1184b implements aqq {
            VIDEO_ERROR_CODE_UNSPECIFIED(0),
            OPENGL_RENDERING_FAILED(1),
            CACHE_LOAD_FAILED(2),
            ANDROID_TARGET_API_TOO_LOW(3);
            

            /* renamed from: e */
            private static final aqr<C1184b> f5010e = null;

            /* renamed from: f */
            private final int f5012f;

            /* renamed from: a */
            public final int mo10648a() {
                return this.f5012f;
            }

            /* renamed from: a */
            public static C1184b m6191a(int i) {
                switch (i) {
                    case 0:
                        return VIDEO_ERROR_CODE_UNSPECIFIED;
                    case 1:
                        return OPENGL_RENDERING_FAILED;
                    case 2:
                        return CACHE_LOAD_FAILED;
                    case 3:
                        return ANDROID_TARGET_API_TOO_LOW;
                    default:
                        return null;
                }
            }

            /* renamed from: b */
            public static aqs m6192b() {
                return bpw.f5035a;
            }

            private C1184b(int i) {
                this.f5012f = i;
            }

            static {
                f5010e = new bpv();
            }
        }

        private C1182q() {
        }

        /* renamed from: com.google.android.gms.internal.ads.bph$q$a */
        public static final class C1183a extends aqn.C1078a<C1182q, C1183a> implements ary {
            private C1183a() {
                super(C1182q.zzcfx);
            }

            /* synthetic */ C1183a(bpi bpi) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo10613a(int i, Object obj, Object obj2) {
            switch (bpi.f5013a[i - 1]) {
                case 1:
                    return new C1182q();
                case 2:
                    return new C1183a((bpi) null);
                case 3:
                    return m3456a((arw) zzcfx, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{"zzccg", "zzcfw", C1184b.m6192b()});
                case 4:
                    return zzcfx;
                case 5:
                    ash<C1182q> ash = zzcas;
                    if (ash == null) {
                        synchronized (C1182q.class) {
                            ash = zzcas;
                            if (ash == null) {
                                ash = new aqn.C1079b<>(zzcfx);
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

        /* renamed from: a */
        public static ash<C1182q> m6188a() {
            return (ash) zzcfx.mo10613a(aqn.C1082e.f2336g, (Object) null, (Object) null);
        }

        static {
            aqn.m3458a(C1182q.class, zzcfx);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.bph$r */
    public static final class C1185r extends aqn<C1185r, C1186a> implements ary {
        private static volatile ash<C1185r> zzcas;
        /* access modifiers changed from: private */
        public static final C1185r zzcgg = new C1185r();
        private int zzccg;
        private int zzcea = 1000;
        private C1182q zzcft;
        private int zzcgd;
        private int zzcge;
        private int zzcgf;

        private C1185r() {
        }

        /* renamed from: com.google.android.gms.internal.ads.bph$r$a */
        public static final class C1186a extends aqn.C1078a<C1185r, C1186a> implements ary {
            private C1186a() {
                super(C1185r.zzcgg);
            }

            /* synthetic */ C1186a(bpi bpi) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo10613a(int i, Object obj, Object obj2) {
            switch (bpi.f5013a[i - 1]) {
                case 1:
                    return new C1185r();
                case 2:
                    return new C1186a((bpi) null);
                case 3:
                    return m3456a((arw) zzcgg, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004", new Object[]{"zzccg", "zzcea", bpo.m6215b(), "zzcft", "zzcgd", "zzcge", "zzcgf"});
                case 4:
                    return zzcgg;
                case 5:
                    ash<C1185r> ash = zzcas;
                    if (ash == null) {
                        synchronized (C1185r.class) {
                            ash = zzcas;
                            if (ash == null) {
                                ash = new aqn.C1079b<>(zzcgg);
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

        /* renamed from: a */
        public static ash<C1185r> m6194a() {
            return (ash) zzcgg.mo10613a(aqn.C1082e.f2336g, (Object) null, (Object) null);
        }

        static {
            aqn.m3458a(C1185r.class, zzcgg);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.bph$s */
    public static final class C1187s extends aqn<C1187s, C1188a> implements ary {
        private static volatile ash<C1187s> zzcas;
        /* access modifiers changed from: private */
        public static final C1187s zzcgh = new C1187s();
        private int zzccg;
        private int zzcea = 1000;
        private C1182q zzcft;
        private C1176n zzcfu;

        private C1187s() {
        }

        /* renamed from: com.google.android.gms.internal.ads.bph$s$a */
        public static final class C1188a extends aqn.C1078a<C1187s, C1188a> implements ary {
            private C1188a() {
                super(C1187s.zzcgh);
            }

            /* synthetic */ C1188a(bpi bpi) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo10613a(int i, Object obj, Object obj2) {
            switch (bpi.f5013a[i - 1]) {
                case 1:
                    return new C1187s();
                case 2:
                    return new C1188a((bpi) null);
                case 3:
                    return m3456a((arw) zzcgh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzccg", "zzcea", bpo.m6215b(), "zzcft", "zzcfu"});
                case 4:
                    return zzcgh;
                case 5:
                    ash<C1187s> ash = zzcas;
                    if (ash == null) {
                        synchronized (C1187s.class) {
                            ash = zzcas;
                            if (ash == null) {
                                ash = new aqn.C1079b<>(zzcgh);
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

        /* renamed from: a */
        public static ash<C1187s> m6197a() {
            return (ash) zzcgh.mo10613a(aqn.C1082e.f2336g, (Object) null, (Object) null);
        }

        static {
            aqn.m3458a(C1187s.class, zzcgh);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.bph$t */
    public static final class C1189t extends aqn<C1189t, C1190a> implements ary {
        private static volatile ash<C1189t> zzcas;
        /* access modifiers changed from: private */
        public static final C1189t zzcgj = new C1189t();
        private int zzccg;
        private int zzcea = 1000;
        private C1182q zzcft;
        private int zzcgd;
        private int zzcge;
        private int zzcgf;
        private long zzcgi;

        private C1189t() {
        }

        /* renamed from: com.google.android.gms.internal.ads.bph$t$a */
        public static final class C1190a extends aqn.C1078a<C1189t, C1190a> implements ary {
            private C1190a() {
                super(C1189t.zzcgj);
            }

            /* synthetic */ C1190a(bpi bpi) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo10613a(int i, Object obj, Object obj2) {
            switch (bpi.f5013a[i - 1]) {
                case 1:
                    return new C1189t();
                case 2:
                    return new C1190a((bpi) null);
                case 3:
                    return m3456a((arw) zzcgj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0003\u0005", new Object[]{"zzccg", "zzcea", bpo.m6215b(), "zzcft", "zzcgd", "zzcge", "zzcgf", "zzcgi"});
                case 4:
                    return zzcgj;
                case 5:
                    ash<C1189t> ash = zzcas;
                    if (ash == null) {
                        synchronized (C1189t.class) {
                            ash = zzcas;
                            if (ash == null) {
                                ash = new aqn.C1079b<>(zzcgj);
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

        /* renamed from: a */
        public static ash<C1189t> m6200a() {
            return (ash) zzcgj.mo10613a(aqn.C1082e.f2336g, (Object) null, (Object) null);
        }

        static {
            aqn.m3458a(C1189t.class, zzcgj);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.bph$u */
    public static final class C1191u extends aqn<C1191u, C1192a> implements ary {
        private static volatile ash<C1191u> zzcas;
        /* access modifiers changed from: private */
        public static final C1191u zzcgk = new C1191u();
        private int zzccg;
        private int zzcea = 1000;
        private C1182q zzcft;
        private C1176n zzcfu;

        private C1191u() {
        }

        /* renamed from: com.google.android.gms.internal.ads.bph$u$a */
        public static final class C1192a extends aqn.C1078a<C1191u, C1192a> implements ary {
            private C1192a() {
                super(C1191u.zzcgk);
            }

            /* synthetic */ C1192a(bpi bpi) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo10613a(int i, Object obj, Object obj2) {
            switch (bpi.f5013a[i - 1]) {
                case 1:
                    return new C1191u();
                case 2:
                    return new C1192a((bpi) null);
                case 3:
                    return m3456a((arw) zzcgk, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzccg", "zzcea", bpo.m6215b(), "zzcft", "zzcfu"});
                case 4:
                    return zzcgk;
                case 5:
                    ash<C1191u> ash = zzcas;
                    if (ash == null) {
                        synchronized (C1191u.class) {
                            ash = zzcas;
                            if (ash == null) {
                                ash = new aqn.C1079b<>(zzcgk);
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

        /* renamed from: a */
        public static ash<C1191u> m6203a() {
            return (ash) zzcgk.mo10613a(aqn.C1082e.f2336g, (Object) null, (Object) null);
        }

        static {
            aqn.m3458a(C1191u.class, zzcgk);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.bph$v */
    public static final class C1193v extends aqn<C1193v, C1194a> implements ary {
        private static volatile ash<C1193v> zzcas;
        /* access modifiers changed from: private */
        public static final C1193v zzcgl = new C1193v();
        private int zzccg;
        private int zzcea = 1000;
        private C1182q zzcft;

        private C1193v() {
        }

        /* renamed from: com.google.android.gms.internal.ads.bph$v$a */
        public static final class C1194a extends aqn.C1078a<C1193v, C1194a> implements ary {
            private C1194a() {
                super(C1193v.zzcgl);
            }

            /* synthetic */ C1194a(bpi bpi) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo10613a(int i, Object obj, Object obj2) {
            switch (bpi.f5013a[i - 1]) {
                case 1:
                    return new C1193v();
                case 2:
                    return new C1194a((bpi) null);
                case 3:
                    return m3456a((arw) zzcgl, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001", new Object[]{"zzccg", "zzcea", bpo.m6215b(), "zzcft"});
                case 4:
                    return zzcgl;
                case 5:
                    ash<C1193v> ash = zzcas;
                    if (ash == null) {
                        synchronized (C1193v.class) {
                            ash = zzcas;
                            if (ash == null) {
                                ash = new aqn.C1079b<>(zzcgl);
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

        /* renamed from: a */
        public static ash<C1193v> m6206a() {
            return (ash) zzcgl.mo10613a(aqn.C1082e.f2336g, (Object) null, (Object) null);
        }

        static {
            aqn.m3458a(C1193v.class, zzcgl);
        }
    }
}
