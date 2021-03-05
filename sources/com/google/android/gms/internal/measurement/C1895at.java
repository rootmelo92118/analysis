package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2003ei;

/* renamed from: com.google.android.gms.internal.measurement.at */
public final class C1895at {

    /* renamed from: com.google.android.gms.internal.measurement.at$a */
    public static final class C1896a extends C2003ei<C1896a, C1897a> implements C2045fs {
        /* access modifiers changed from: private */
        public static final C1896a zzauw = new C1896a();
        private static volatile C2055gb<C1896a> zznw;
        private String zzauu = "";
        private long zzauv;
        private int zznr;

        private C1896a() {
        }

        /* renamed from: com.google.android.gms.internal.measurement.at$a$a */
        public static final class C1897a extends C2003ei.C2004a<C1896a, C1897a> implements C2045fs {
            private C1897a() {
                super(C1896a.zzauw);
            }

            /* renamed from: a */
            public final C1897a mo13494a(String str) {
                mo13824b();
                ((C1896a) this.f7726a).m8894a(str);
                return this;
            }

            /* renamed from: a */
            public final C1897a mo13493a(long j) {
                mo13824b();
                ((C1896a) this.f7726a).m8891a(j);
                return this;
            }

            /* synthetic */ C1897a(C1901au auVar) {
                this();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m8894a(String str) {
            if (str != null) {
                this.zznr |= 1;
                this.zzauu = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m8891a(long j) {
            this.zznr |= 2;
            this.zzauv = j;
        }

        /* renamed from: a */
        public static C1897a m8890a() {
            return (C1897a) ((C2003ei.C2004a) zzauw.mo13492a(C2003ei.C2008e.f7734e, (Object) null, (Object) null));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo13492a(int i, Object obj, Object obj2) {
            switch (C1901au.f7391a[i - 1]) {
                case 1:
                    return new C1896a();
                case 2:
                    return new C1897a((C1901au) null);
                case 3:
                    return m9523a((C2043fq) zzauw, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001", new Object[]{"zznr", "zzauu", "zzauv"});
                case 4:
                    return zzauw;
                case 5:
                    C2055gb<C1896a> gbVar = zznw;
                    if (gbVar == null) {
                        synchronized (C1896a.class) {
                            gbVar = zznw;
                            if (gbVar == null) {
                                gbVar = new C2003ei.C2005b<>(zzauw);
                                zznw = gbVar;
                            }
                        }
                    }
                    return gbVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            C2003ei.m9525a(C1896a.class, zzauw);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.at$b */
    public static final class C1898b extends C2003ei<C1898b, C1899a> implements C2045fs {
        /* access modifiers changed from: private */
        public static final C1898b zzauz = new C1898b();
        private static volatile C2055gb<C1898b> zznw;
        private int zzaux = 1;
        private C2014eo<C1896a> zzauy = m9527i();
        private int zznr;

        /* renamed from: com.google.android.gms.internal.measurement.at$b$b */
        public enum C1900b implements C2011el {
            RADS(1),
            PROVISIONING(2);
            

            /* renamed from: c */
            private static final C2012em<C1900b> f7388c = null;

            /* renamed from: d */
            private final int f7390d;

            /* renamed from: a */
            public final int mo13496a() {
                return this.f7390d;
            }

            /* renamed from: a */
            public static C1900b m8906a(int i) {
                switch (i) {
                    case 1:
                        return RADS;
                    case 2:
                        return PROVISIONING;
                    default:
                        return null;
                }
            }

            /* renamed from: b */
            public static C2013en m8907b() {
                return C1903aw.f7392a;
            }

            private C1900b(int i) {
                this.f7390d = i;
            }

            static {
                f7388c = new C1902av();
            }
        }

        private C1898b() {
        }

        /* renamed from: com.google.android.gms.internal.measurement.at$b$a */
        public static final class C1899a extends C2003ei.C2004a<C1898b, C1899a> implements C2045fs {
            private C1899a() {
                super(C1898b.zzauz);
            }

            /* renamed from: a */
            public final C1899a mo13495a(C1896a aVar) {
                mo13824b();
                ((C1898b) this.f7726a).m8900a(aVar);
                return this;
            }

            /* synthetic */ C1899a(C1901au auVar) {
                this();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m8900a(C1896a aVar) {
            if (aVar != null) {
                if (!this.zzauy.mo13573a()) {
                    C2014eo<C1896a> eoVar = this.zzauy;
                    int size = eoVar.size();
                    this.zzauy = eoVar.mo13588a(size == 0 ? 10 : size << 1);
                }
                this.zzauy.add(aVar);
                return;
            }
            throw new NullPointerException();
        }

        /* renamed from: a */
        public static C1899a m8899a() {
            return (C1899a) ((C2003ei.C2004a) zzauz.mo13492a(C2003ei.C2008e.f7734e, (Object) null, (Object) null));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo13492a(int i, Object obj, Object obj2) {
            switch (C1901au.f7391a[i - 1]) {
                case 1:
                    return new C1898b();
                case 2:
                    return new C1899a((C1901au) null);
                case 3:
                    return m9523a((C2043fq) zzauz, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u001b", new Object[]{"zznr", "zzaux", C1900b.m8907b(), "zzauy", C1896a.class});
                case 4:
                    return zzauz;
                case 5:
                    C2055gb<C1898b> gbVar = zznw;
                    if (gbVar == null) {
                        synchronized (C1898b.class) {
                            gbVar = zznw;
                            if (gbVar == null) {
                                gbVar = new C2003ei.C2005b<>(zzauz);
                                zznw = gbVar;
                            }
                        }
                    }
                    return gbVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* renamed from: b */
        public static C2055gb<C1898b> m8902b() {
            return (C2055gb) zzauz.mo13492a(C2003ei.C2008e.f7736g, (Object) null, (Object) null);
        }

        static {
            C2003ei.m9525a(C1898b.class, zzauz);
        }
    }
}
