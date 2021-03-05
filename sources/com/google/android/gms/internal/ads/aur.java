package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;

public final class aur {

    /* renamed from: com.google.android.gms.internal.ads.aur$a */
    public static final class C1091a extends aqn<C1091a, C1092a> implements ary {
        private static volatile ash<C1091a> zzcas;
        /* access modifiers changed from: private */
        public static final C1091a zzfxm = new C1091a();
        private int zzccg;
        private int zzfxf;
        private C1093b zzfxg;
        private apc zzfxh = apc.f2174a;
        private apc zzfxi = apc.f2174a;
        private boolean zzfxj;
        private boolean zzfxk;
        private byte zzfxl = 2;

        /* renamed from: com.google.android.gms.internal.ads.aur$a$b */
        public static final class C1093b extends aqn<C1093b, C1094a> implements ary {
            private static volatile ash<C1093b> zzcas;
            /* access modifiers changed from: private */
            public static final C1093b zzfxr = new C1093b();
            private int zzccg;
            private String zzfxn = "";
            private String zzfxo = "";
            private String zzfxp = "";
            private int zzfxq;

            private C1093b() {
            }

            /* renamed from: com.google.android.gms.internal.ads.aur$a$b$a */
            public static final class C1094a extends aqn.C1078a<C1093b, C1094a> implements ary {
                private C1094a() {
                    super(C1093b.zzfxr);
                }

                /* synthetic */ C1094a(aus aus) {
                    this();
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final Object mo10613a(int i, Object obj, Object obj2) {
                switch (aus.f2635a[i - 1]) {
                    case 1:
                        return new C1093b();
                    case 2:
                        return new C1094a((aus) null);
                    case 3:
                        return m3456a((arw) zzfxr, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u0004\u0003", new Object[]{"zzccg", "zzfxn", "zzfxo", "zzfxp", "zzfxq"});
                    case 4:
                        return zzfxr;
                    case 5:
                        ash<C1093b> ash = zzcas;
                        if (ash == null) {
                            synchronized (C1093b.class) {
                                ash = zzcas;
                                if (ash == null) {
                                    ash = new aqn.C1079b<>(zzfxr);
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
                aqn.m3458a(C1093b.class, zzfxr);
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.aur$a$c */
        public enum C1095c implements aqq {
            SAFE(0),
            DANGEROUS(1),
            UNKNOWN(2),
            POTENTIALLY_UNWANTED(3),
            DANGEROUS_HOST(4);
            

            /* renamed from: f */
            private static final aqr<C1095c> f2607f = null;

            /* renamed from: g */
            private final int f2609g;

            /* renamed from: a */
            public final int mo10648a() {
                return this.f2609g;
            }

            /* renamed from: a */
            public static C1095c m4202a(int i) {
                switch (i) {
                    case 0:
                        return SAFE;
                    case 1:
                        return DANGEROUS;
                    case 2:
                        return UNKNOWN;
                    case 3:
                        return POTENTIALLY_UNWANTED;
                    case 4:
                        return DANGEROUS_HOST;
                    default:
                        return null;
                }
            }

            /* renamed from: b */
            public static aqs m4203b() {
                return auu.f2636a;
            }

            private C1095c(int i) {
                this.f2609g = i;
            }

            static {
                f2607f = new aut();
            }
        }

        private C1091a() {
        }

        /* renamed from: com.google.android.gms.internal.ads.aur$a$a */
        public static final class C1092a extends aqn.C1078a<C1091a, C1092a> implements ary {
            private C1092a() {
                super(C1091a.zzfxm);
            }

            /* synthetic */ C1092a(aus aus) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo10613a(int i, Object obj, Object obj2) {
            int i2 = 0;
            switch (aus.f2635a[i - 1]) {
                case 1:
                    return new C1091a();
                case 2:
                    return new C1092a((aus) null);
                case 3:
                    return m3456a((arw) zzfxm, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001Ԍ\u0000\u0002\t\u0001\u0003\n\u0002\u0004\n\u0003\u0005\u0007\u0004\u0006\u0007\u0005", new Object[]{"zzccg", "zzfxf", C1095c.m4203b(), "zzfxg", "zzfxh", "zzfxi", "zzfxj", "zzfxk"});
                case 4:
                    return zzfxm;
                case 5:
                    ash<C1091a> ash = zzcas;
                    if (ash == null) {
                        synchronized (C1091a.class) {
                            ash = zzcas;
                            if (ash == null) {
                                ash = new aqn.C1079b<>(zzfxm);
                                zzcas = ash;
                            }
                        }
                    }
                    return ash;
                case 6:
                    return Byte.valueOf(this.zzfxl);
                case 7:
                    if (obj != null) {
                        i2 = 1;
                    }
                    this.zzfxl = (byte) i2;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            aqn.m3458a(C1091a.class, zzfxm);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.aur$b */
    public static final class C1096b extends aqn<C1096b, C1097a> implements ary {
        private static volatile ash<C1096b> zzcas;
        /* access modifiers changed from: private */
        public static final C1096b zzfyn = new C1096b();
        private int zzccg;
        private int zzcch;
        private apc zzfxh = apc.f2174a;
        private byte zzfxl = 2;
        private String zzfxo = "";
        private int zzfxy;
        private String zzfxz = "";
        private String zzfya = "";
        private C1098b zzfyb;
        private aqu<C1114h> zzfyc = m3462n();
        private String zzfyd = "";
        private C1110f zzfye;
        private boolean zzfyf;
        private aqu<String> zzfyg = aqn.m3462n();
        private String zzfyh = "";
        private boolean zzfyi;
        private boolean zzfyj;
        private C1117i zzfyk;
        private aqu<String> zzfyl = aqn.m3462n();
        private aqu<String> zzfym = aqn.m3462n();

        /* renamed from: com.google.android.gms.internal.ads.aur$b$b */
        public static final class C1098b extends aqn<C1098b, C1099a> implements ary {
            private static volatile ash<C1098b> zzcas;
            /* access modifiers changed from: private */
            public static final C1098b zzfyp = new C1098b();
            private int zzccg;
            private String zzfyo = "";

            private C1098b() {
            }

            /* renamed from: com.google.android.gms.internal.ads.aur$b$b$a */
            public static final class C1099a extends aqn.C1078a<C1098b, C1099a> implements ary {
                private C1099a() {
                    super(C1098b.zzfyp);
                }

                /* synthetic */ C1099a(aus aus) {
                    this();
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final Object mo10613a(int i, Object obj, Object obj2) {
                switch (aus.f2635a[i - 1]) {
                    case 1:
                        return new C1098b();
                    case 2:
                        return new C1099a((aus) null);
                    case 3:
                        return m3456a((arw) zzfyp, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"zzccg", "zzfyo"});
                    case 4:
                        return zzfyp;
                    case 5:
                        ash<C1098b> ash = zzcas;
                        if (ash == null) {
                            synchronized (C1098b.class) {
                                ash = zzcas;
                                if (ash == null) {
                                    ash = new aqn.C1079b<>(zzfyp);
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
                aqn.m3458a(C1098b.class, zzfyp);
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.aur$b$c */
        public static final class C1100c extends aqn<C1100c, C1101a> implements ary {
            private static volatile ash<C1100c> zzcas;
            /* access modifiers changed from: private */
            public static final C1100c zzfyr = new C1100c();
            private int zzccg;
            private apc zzfgl = apc.f2174a;
            private byte zzfxl = 2;
            private apc zzfyq = apc.f2174a;

            private C1100c() {
            }

            /* renamed from: com.google.android.gms.internal.ads.aur$b$c$a */
            public static final class C1101a extends aqn.C1078a<C1100c, C1101a> implements ary {
                private C1101a() {
                    super(C1100c.zzfyr);
                }

                /* synthetic */ C1101a(aus aus) {
                    this();
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final Object mo10613a(int i, Object obj, Object obj2) {
                int i2 = 0;
                switch (aus.f2635a[i - 1]) {
                    case 1:
                        return new C1100c();
                    case 2:
                        return new C1101a((aus) null);
                    case 3:
                        return m3456a((arw) zzfyr, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001Ԋ\u0000\u0002\n\u0001", new Object[]{"zzccg", "zzfyq", "zzfgl"});
                    case 4:
                        return zzfyr;
                    case 5:
                        ash<C1100c> ash = zzcas;
                        if (ash == null) {
                            synchronized (C1100c.class) {
                                ash = zzcas;
                                if (ash == null) {
                                    ash = new aqn.C1079b<>(zzfyr);
                                    zzcas = ash;
                                }
                            }
                        }
                        return ash;
                    case 6:
                        return Byte.valueOf(this.zzfxl);
                    case 7:
                        if (obj != null) {
                            i2 = 1;
                        }
                        this.zzfxl = (byte) i2;
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                aqn.m3458a(C1100c.class, zzfyr);
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.aur$b$d */
        public static final class C1102d extends aqn<C1102d, C1103a> implements ary {
            private static volatile ash<C1102d> zzcas;
            /* access modifiers changed from: private */
            public static final C1102d zzfyx = new C1102d();
            private int zzccg;
            private byte zzfxl = 2;
            private C1104b zzfys;
            private aqu<C1100c> zzfyt = m3462n();
            private apc zzfyu = apc.f2174a;
            private apc zzfyv = apc.f2174a;
            private int zzfyw;

            /* renamed from: com.google.android.gms.internal.ads.aur$b$d$b */
            public static final class C1104b extends aqn<C1104b, C1105a> implements ary {
                private static volatile ash<C1104b> zzcas;
                /* access modifiers changed from: private */
                public static final C1104b zzfzb = new C1104b();
                private int zzccg;
                private apc zzfyy = apc.f2174a;
                private apc zzfyz = apc.f2174a;
                private apc zzfza = apc.f2174a;

                private C1104b() {
                }

                /* renamed from: com.google.android.gms.internal.ads.aur$b$d$b$a */
                public static final class C1105a extends aqn.C1078a<C1104b, C1105a> implements ary {
                    private C1105a() {
                        super(C1104b.zzfzb);
                    }

                    /* synthetic */ C1105a(aus aus) {
                        this();
                    }
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final Object mo10613a(int i, Object obj, Object obj2) {
                    switch (aus.f2635a[i - 1]) {
                        case 1:
                            return new C1104b();
                        case 2:
                            return new C1105a((aus) null);
                        case 3:
                            return m3456a((arw) zzfzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0000\u0002\n\u0001\u0003\n\u0002", new Object[]{"zzccg", "zzfyy", "zzfyz", "zzfza"});
                        case 4:
                            return zzfzb;
                        case 5:
                            ash<C1104b> ash = zzcas;
                            if (ash == null) {
                                synchronized (C1104b.class) {
                                    ash = zzcas;
                                    if (ash == null) {
                                        ash = new aqn.C1079b<>(zzfzb);
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
                public static ash<C1104b> m4213a() {
                    return (ash) zzfzb.mo10613a(aqn.C1082e.f2336g, (Object) null, (Object) null);
                }

                static {
                    aqn.m3458a(C1104b.class, zzfzb);
                }
            }

            private C1102d() {
            }

            /* renamed from: com.google.android.gms.internal.ads.aur$b$d$a */
            public static final class C1103a extends aqn.C1078a<C1102d, C1103a> implements ary {
                private C1103a() {
                    super(C1102d.zzfyx);
                }

                /* synthetic */ C1103a(aus aus) {
                    this();
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final Object mo10613a(int i, Object obj, Object obj2) {
                int i2 = 0;
                switch (aus.f2635a[i - 1]) {
                    case 1:
                        return new C1102d();
                    case 2:
                        return new C1103a((aus) null);
                    case 3:
                        return m3456a((arw) zzfyx, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001\t\u0000\u0002Л\u0003\n\u0001\u0004\n\u0002\u0005\u0004\u0003", new Object[]{"zzccg", "zzfys", "zzfyt", C1100c.class, "zzfyu", "zzfyv", "zzfyw"});
                    case 4:
                        return zzfyx;
                    case 5:
                        ash<C1102d> ash = zzcas;
                        if (ash == null) {
                            synchronized (C1102d.class) {
                                ash = zzcas;
                                if (ash == null) {
                                    ash = new aqn.C1079b<>(zzfyx);
                                    zzcas = ash;
                                }
                            }
                        }
                        return ash;
                    case 6:
                        return Byte.valueOf(this.zzfxl);
                    case 7:
                        if (obj != null) {
                            i2 = 1;
                        }
                        this.zzfxl = (byte) i2;
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                aqn.m3458a(C1102d.class, zzfyx);
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.aur$b$e */
        public static final class C1106e extends aqn<C1106e, C1107a> implements ary {
            private static volatile ash<C1106e> zzcas;
            /* access modifiers changed from: private */
            public static final C1106e zzfze = new C1106e();
            private int zzccg;
            private byte zzfxl = 2;
            private aqu<C1100c> zzfyt = m3462n();
            private apc zzfyu = apc.f2174a;
            private apc zzfyv = apc.f2174a;
            private int zzfyw;
            private C1108b zzfzc;
            private apc zzfzd = apc.f2174a;

            /* renamed from: com.google.android.gms.internal.ads.aur$b$e$b */
            public static final class C1108b extends aqn<C1108b, C1109a> implements ary {
                private static volatile ash<C1108b> zzcas;
                /* access modifiers changed from: private */
                public static final C1108b zzfzh = new C1108b();
                private int zzccg;
                private apc zzfza = apc.f2174a;
                private int zzfzf;
                private apc zzfzg = apc.f2174a;

                private C1108b() {
                }

                /* renamed from: com.google.android.gms.internal.ads.aur$b$e$b$a */
                public static final class C1109a extends aqn.C1078a<C1108b, C1109a> implements ary {
                    private C1109a() {
                        super(C1108b.zzfzh);
                    }

                    /* synthetic */ C1109a(aus aus) {
                        this();
                    }
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final Object mo10613a(int i, Object obj, Object obj2) {
                    switch (aus.f2635a[i - 1]) {
                        case 1:
                            return new C1108b();
                        case 2:
                            return new C1109a((aus) null);
                        case 3:
                            return m3456a((arw) zzfzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\n\u0001\u0003\n\u0002", new Object[]{"zzccg", "zzfzf", "zzfzg", "zzfza"});
                        case 4:
                            return zzfzh;
                        case 5:
                            ash<C1108b> ash = zzcas;
                            if (ash == null) {
                                synchronized (C1108b.class) {
                                    ash = zzcas;
                                    if (ash == null) {
                                        ash = new aqn.C1079b<>(zzfzh);
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
                public static ash<C1108b> m4218a() {
                    return (ash) zzfzh.mo10613a(aqn.C1082e.f2336g, (Object) null, (Object) null);
                }

                static {
                    aqn.m3458a(C1108b.class, zzfzh);
                }
            }

            private C1106e() {
            }

            /* renamed from: com.google.android.gms.internal.ads.aur$b$e$a */
            public static final class C1107a extends aqn.C1078a<C1106e, C1107a> implements ary {
                private C1107a() {
                    super(C1106e.zzfze);
                }

                /* synthetic */ C1107a(aus aus) {
                    this();
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final Object mo10613a(int i, Object obj, Object obj2) {
                int i2 = 0;
                switch (aus.f2635a[i - 1]) {
                    case 1:
                        return new C1106e();
                    case 2:
                        return new C1107a((aus) null);
                    case 3:
                        return m3456a((arw) zzfze, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001\t\u0000\u0002Л\u0003\n\u0001\u0004\n\u0002\u0005\u0004\u0003\u0006\n\u0004", new Object[]{"zzccg", "zzfzc", "zzfyt", C1100c.class, "zzfyu", "zzfyv", "zzfyw", "zzfzd"});
                    case 4:
                        return zzfze;
                    case 5:
                        ash<C1106e> ash = zzcas;
                        if (ash == null) {
                            synchronized (C1106e.class) {
                                ash = zzcas;
                                if (ash == null) {
                                    ash = new aqn.C1079b<>(zzfze);
                                    zzcas = ash;
                                }
                            }
                        }
                        return ash;
                    case 6:
                        return Byte.valueOf(this.zzfxl);
                    case 7:
                        if (obj != null) {
                            i2 = 1;
                        }
                        this.zzfxl = (byte) i2;
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                aqn.m3458a(C1106e.class, zzfze);
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.aur$b$f */
        public static final class C1110f extends aqn<C1110f, C1111a> implements ary {
            private static volatile ash<C1110f> zzcas;
            /* access modifiers changed from: private */
            public static final C1110f zzfzk = new C1110f();
            private int zzccg;
            private int zzcch;
            private String zzfzi = "";
            private apc zzfzj = apc.f2174a;

            /* renamed from: com.google.android.gms.internal.ads.aur$b$f$b */
            public enum C1112b implements aqq {
                TYPE_UNKNOWN(0),
                TYPE_CREATIVE(1);
                

                /* renamed from: c */
                private static final aqr<C1112b> f2612c = null;

                /* renamed from: d */
                private final int f2614d;

                /* renamed from: a */
                public final int mo10648a() {
                    return this.f2614d;
                }

                /* renamed from: a */
                public static C1112b m4223a(int i) {
                    switch (i) {
                        case 0:
                            return TYPE_UNKNOWN;
                        case 1:
                            return TYPE_CREATIVE;
                        default:
                            return null;
                    }
                }

                /* renamed from: b */
                public static aqs m4224b() {
                    return auw.f2637a;
                }

                private C1112b(int i) {
                    this.f2614d = i;
                }

                static {
                    f2612c = new auv();
                }
            }

            private C1110f() {
            }

            /* renamed from: com.google.android.gms.internal.ads.aur$b$f$a */
            public static final class C1111a extends aqn.C1078a<C1110f, C1111a> implements ary {
                private C1111a() {
                    super(C1110f.zzfzk);
                }

                /* synthetic */ C1111a(aus aus) {
                    this();
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final Object mo10613a(int i, Object obj, Object obj2) {
                switch (aus.f2635a[i - 1]) {
                    case 1:
                        return new C1110f();
                    case 2:
                        return new C1111a((aus) null);
                    case 3:
                        return m3456a((arw) zzfzk, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\n\u0002", new Object[]{"zzccg", "zzcch", C1112b.m4224b(), "zzfzi", "zzfzj"});
                    case 4:
                        return zzfzk;
                    case 5:
                        ash<C1110f> ash = zzcas;
                        if (ash == null) {
                            synchronized (C1110f.class) {
                                ash = zzcas;
                                if (ash == null) {
                                    ash = new aqn.C1079b<>(zzfzk);
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
                aqn.m3458a(C1110f.class, zzfzk);
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.aur$b$g */
        public enum C1113g implements aqq {
            UNKNOWN(0),
            URL_PHISHING(1),
            URL_MALWARE(2),
            URL_UNWANTED(3),
            CLIENT_SIDE_PHISHING_URL(4),
            CLIENT_SIDE_MALWARE_URL(5),
            DANGEROUS_DOWNLOAD_RECOVERY(6),
            DANGEROUS_DOWNLOAD_WARNING(7),
            OCTAGON_AD(8),
            OCTAGON_AD_SB_MATCH(9);
            

            /* renamed from: k */
            private static final aqr<C1113g> f2625k = null;

            /* renamed from: l */
            private final int f2627l;

            /* renamed from: a */
            public final int mo10648a() {
                return this.f2627l;
            }

            /* renamed from: a */
            public static C1113g m4226a(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN;
                    case 1:
                        return URL_PHISHING;
                    case 2:
                        return URL_MALWARE;
                    case 3:
                        return URL_UNWANTED;
                    case 4:
                        return CLIENT_SIDE_PHISHING_URL;
                    case 5:
                        return CLIENT_SIDE_MALWARE_URL;
                    case 6:
                        return DANGEROUS_DOWNLOAD_RECOVERY;
                    case 7:
                        return DANGEROUS_DOWNLOAD_WARNING;
                    case 8:
                        return OCTAGON_AD;
                    case 9:
                        return OCTAGON_AD_SB_MATCH;
                    default:
                        return null;
                }
            }

            /* renamed from: b */
            public static aqs m4227b() {
                return auy.f2638a;
            }

            private C1113g(int i) {
                this.f2627l = i;
            }

            static {
                f2625k = new aux();
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.aur$b$h */
        public static final class C1114h extends aqn<C1114h, C1116b> implements ary {
            private static volatile ash<C1114h> zzcas;
            /* access modifiers changed from: private */
            public static final C1114h zzgah = new C1114h();
            private int zzccg;
            private byte zzfxl = 2;
            private String zzfxo = "";
            private int zzfzz;
            private C1102d zzgaa;
            private C1106e zzgab;
            private int zzgac;
            private aqt zzgad = m3461m();
            private String zzgae = "";
            private int zzgaf;
            private aqu<String> zzgag = aqn.m3462n();

            /* renamed from: com.google.android.gms.internal.ads.aur$b$h$a */
            public enum C1115a implements aqq {
                AD_RESOURCE_UNKNOWN(0),
                AD_RESOURCE_CREATIVE(1),
                AD_RESOURCE_POST_CLICK(2),
                AD_RESOURCE_AUTO_CLICK_DESTINATION(3);
                

                /* renamed from: e */
                private static final aqr<C1115a> f2632e = null;

                /* renamed from: f */
                private final int f2634f;

                /* renamed from: a */
                public final int mo10648a() {
                    return this.f2634f;
                }

                /* renamed from: a */
                public static C1115a m4231a(int i) {
                    switch (i) {
                        case 0:
                            return AD_RESOURCE_UNKNOWN;
                        case 1:
                            return AD_RESOURCE_CREATIVE;
                        case 2:
                            return AD_RESOURCE_POST_CLICK;
                        case 3:
                            return AD_RESOURCE_AUTO_CLICK_DESTINATION;
                        default:
                            return null;
                    }
                }

                /* renamed from: b */
                public static aqs m4232b() {
                    return ava.f2640a;
                }

                private C1115a(int i) {
                    this.f2634f = i;
                }

                static {
                    f2632e = new auz();
                }
            }

            private C1114h() {
            }

            /* renamed from: com.google.android.gms.internal.ads.aur$b$h$b */
            public static final class C1116b extends aqn.C1078a<C1114h, C1116b> implements ary {
                private C1116b() {
                    super(C1114h.zzgah);
                }

                /* synthetic */ C1116b(aus aus) {
                    this();
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final Object mo10613a(int i, Object obj, Object obj2) {
                int i2 = 0;
                switch (aus.f2635a[i - 1]) {
                    case 1:
                        return new C1114h();
                    case 2:
                        return new C1116b((aus) null);
                    case 3:
                        return m3456a((arw) zzgah, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001Ԅ\u0000\u0002\b\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005\u0004\u0004\u0006\u0016\u0007\b\u0005\b\f\u0006\t\u001a", new Object[]{"zzccg", "zzfzz", "zzfxo", "zzgaa", "zzgab", "zzgac", "zzgad", "zzgae", "zzgaf", C1115a.m4232b(), "zzgag"});
                    case 4:
                        return zzgah;
                    case 5:
                        ash<C1114h> ash = zzcas;
                        if (ash == null) {
                            synchronized (C1114h.class) {
                                ash = zzcas;
                                if (ash == null) {
                                    ash = new aqn.C1079b<>(zzgah);
                                    zzcas = ash;
                                }
                            }
                        }
                        return ash;
                    case 6:
                        return Byte.valueOf(this.zzfxl);
                    case 7:
                        if (obj != null) {
                            i2 = 1;
                        }
                        this.zzfxl = (byte) i2;
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                aqn.m3458a(C1114h.class, zzgah);
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.aur$b$i */
        public static final class C1117i extends aqn<C1117i, C1118a> implements ary {
            private static volatile ash<C1117i> zzcas;
            /* access modifiers changed from: private */
            public static final C1117i zzgaq = new C1117i();
            private int zzccg;
            private String zzgan = "";
            private long zzgao;
            private boolean zzgap;

            private C1117i() {
            }

            /* renamed from: com.google.android.gms.internal.ads.aur$b$i$a */
            public static final class C1118a extends aqn.C1078a<C1117i, C1118a> implements ary {
                private C1118a() {
                    super(C1117i.zzgaq);
                }

                /* synthetic */ C1118a(aus aus) {
                    this();
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final Object mo10613a(int i, Object obj, Object obj2) {
                switch (aus.f2635a[i - 1]) {
                    case 1:
                        return new C1117i();
                    case 2:
                        return new C1118a((aus) null);
                    case 3:
                        return m3456a((arw) zzgaq, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\u0007\u0002", new Object[]{"zzccg", "zzgan", "zzgao", "zzgap"});
                    case 4:
                        return zzgaq;
                    case 5:
                        ash<C1117i> ash = zzcas;
                        if (ash == null) {
                            synchronized (C1117i.class) {
                                ash = zzcas;
                                if (ash == null) {
                                    ash = new aqn.C1079b<>(zzgaq);
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
                aqn.m3458a(C1117i.class, zzgaq);
            }
        }

        private C1096b() {
        }

        /* renamed from: com.google.android.gms.internal.ads.aur$b$a */
        public static final class C1097a extends aqn.C1078a<C1096b, C1097a> implements ary {
            private C1097a() {
                super(C1096b.zzfyn);
            }

            /* synthetic */ C1097a(aus aus) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo10613a(int i, Object obj, Object obj2) {
            int i2 = 0;
            switch (aus.f2635a[i - 1]) {
                case 1:
                    return new C1096b();
                case 2:
                    return new C1097a((aus) null);
                case 3:
                    return m3456a((arw) zzfyn, "\u0001\u0012\u0000\u0001\u0001\u0015\u0012\u0000\u0004\u0001\u0001\b\u0002\u0002\b\u0003\u0003\b\u0004\u0004Л\u0005\u0007\b\u0006\u001a\u0007\b\t\b\u0007\n\t\u0007\u000b\n\f\u0000\u000b\f\u0001\f\t\u0005\r\b\u0006\u000e\t\u0007\u000f\n\f\u0011\t\r\u0014\u001a\u0015\u001a", new Object[]{"zzccg", "zzfxo", "zzfxz", "zzfya", "zzfyc", C1114h.class, "zzfyf", "zzfyg", "zzfyh", "zzfyi", "zzfyj", "zzcch", C1113g.m4227b(), "zzfxy", C1091a.C1095c.m4203b(), "zzfyb", "zzfyd", "zzfye", "zzfxh", "zzfyk", "zzfyl", "zzfym"});
                case 4:
                    return zzfyn;
                case 5:
                    ash<C1096b> ash = zzcas;
                    if (ash == null) {
                        synchronized (C1096b.class) {
                            ash = zzcas;
                            if (ash == null) {
                                ash = new aqn.C1079b<>(zzfyn);
                                zzcas = ash;
                            }
                        }
                    }
                    return ash;
                case 6:
                    return Byte.valueOf(this.zzfxl);
                case 7:
                    if (obj != null) {
                        i2 = 1;
                    }
                    this.zzfxl = (byte) i2;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            aqn.m3458a(C1096b.class, zzfyn);
        }
    }
}
