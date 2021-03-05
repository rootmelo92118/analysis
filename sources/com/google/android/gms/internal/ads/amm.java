package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;

public final class amm extends aqn<amm, C1057a> implements ary {
    private static volatile ash<amm> zzcas;
    /* access modifiers changed from: private */
    public static final amm zzfhq = new amm();
    private int zzccg;
    private int zzfhi;
    private aqu<C1058b> zzfhp = m3462n();

    /* renamed from: com.google.android.gms.internal.ads.amm$b */
    public static final class C1058b extends aqn<C1058b, C1059a> implements ary {
        private static volatile ash<C1058b> zzcas;
        /* access modifiers changed from: private */
        public static final C1058b zzfhr = new C1058b();
        private String zzfgk = "";
        private int zzfhb;
        private int zzfhm;
        private int zzfhn;

        private C1058b() {
        }

        /* renamed from: com.google.android.gms.internal.ads.amm$b$a */
        public static final class C1059a extends aqn.C1078a<C1058b, C1059a> implements ary {
            private C1059a() {
                super(C1058b.zzfhr);
            }

            /* renamed from: a */
            public final C1059a mo10712a(String str) {
                mo11026b();
                ((C1058b) this.f2326a).m2798a(str);
                return this;
            }

            /* renamed from: a */
            public final C1059a mo10710a(amd amd) {
                mo11026b();
                ((C1058b) this.f2326a).m2792a(amd);
                return this;
            }

            /* renamed from: a */
            public final C1059a mo10709a(int i) {
                mo11026b();
                ((C1058b) this.f2326a).m2800b(i);
                return this;
            }

            /* renamed from: a */
            public final C1059a mo10711a(amw amw) {
                mo11026b();
                ((C1058b) this.f2326a).m2797a(amw);
                return this;
            }

            /* synthetic */ C1059a(amn amn) {
                this();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m2798a(String str) {
            if (str != null) {
                this.zzfgk = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m2792a(amd amd) {
            if (amd != null) {
                this.zzfhm = amd.mo10648a();
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m2800b(int i) {
            this.zzfhn = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m2797a(amw amw) {
            if (amw != null) {
                this.zzfhb = amw.mo10648a();
                return;
            }
            throw new NullPointerException();
        }

        /* renamed from: a */
        public static C1059a m2791a() {
            return (C1059a) ((aqn.C1078a) zzfhr.mo10613a(aqn.C1082e.f2334e, (Object) null, (Object) null));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo10613a(int i, Object obj, Object obj2) {
            switch (amn.f2048a[i - 1]) {
                case 1:
                    return new C1058b();
                case 2:
                    return new C1059a((amn) null);
                case 3:
                    return m3456a((arw) zzfhr, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzfgk", "zzfhm", "zzfhn", "zzfhb"});
                case 4:
                    return zzfhr;
                case 5:
                    ash<C1058b> ash = zzcas;
                    if (ash == null) {
                        synchronized (C1058b.class) {
                            ash = zzcas;
                            if (ash == null) {
                                ash = new aqn.C1079b<>(zzfhr);
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
            aqn.m3458a(C1058b.class, zzfhr);
        }
    }

    private amm() {
    }

    /* renamed from: com.google.android.gms.internal.ads.amm$a */
    public static final class C1057a extends aqn.C1078a<amm, C1057a> implements ary {
        private C1057a() {
            super(amm.zzfhq);
        }

        /* renamed from: a */
        public final C1057a mo10707a(int i) {
            mo11026b();
            ((amm) this.f2326a).m2787b(i);
            return this;
        }

        /* renamed from: a */
        public final C1057a mo10708a(C1058b bVar) {
            mo11026b();
            ((amm) this.f2326a).m2783a(bVar);
            return this;
        }

        /* synthetic */ C1057a(amn amn) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m2787b(int i) {
        this.zzfhi = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m2783a(C1058b bVar) {
        if (bVar != null) {
            if (!this.zzfhp.mo10761a()) {
                aqu<C1058b> aqu = this.zzfhp;
                int size = aqu.size();
                this.zzfhp = aqu.mo10785a(size == 0 ? 10 : size << 1);
            }
            this.zzfhp.add(bVar);
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static C1057a m2782a() {
        return (C1057a) ((aqn.C1078a) zzfhq.mo10613a(aqn.C1082e.f2334e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo10613a(int i, Object obj, Object obj2) {
        switch (amn.f2048a[i - 1]) {
            case 1:
                return new amm();
            case 2:
                return new C1057a((amn) null);
            case 3:
                return m3456a((arw) zzfhq, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzccg", "zzfhi", "zzfhp", C1058b.class});
            case 4:
                return zzfhq;
            case 5:
                ash<amm> ash = zzcas;
                if (ash == null) {
                    synchronized (amm.class) {
                        ash = zzcas;
                        if (ash == null) {
                            ash = new aqn.C1079b<>(zzfhq);
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
        aqn.m3458a(amm.class, zzfhq);
    }
}
