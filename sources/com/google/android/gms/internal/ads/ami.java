package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;

public final class ami extends aqn<ami, C1053a> implements ary {
    private static volatile ash<ami> zzcas;
    /* access modifiers changed from: private */
    public static final ami zzfhh = new ami();
    private String zzfgk = "";
    private String zzfhd = "";
    private int zzfhe;
    private boolean zzfhf;
    private String zzfhg = "";

    private ami() {
    }

    /* renamed from: com.google.android.gms.internal.ads.ami$a */
    public static final class C1053a extends aqn.C1078a<ami, C1053a> implements ary {
        private C1053a() {
            super(ami.zzfhh);
        }

        /* renamed from: a */
        public final C1053a mo10695a(String str) {
            mo11026b();
            ((ami) this.f2326a).m2749a(str);
            return this;
        }

        /* renamed from: b */
        public final C1053a mo10697b(String str) {
            mo11026b();
            ((ami) this.f2326a).m2753b(str);
            return this;
        }

        /* renamed from: a */
        public final C1053a mo10694a(int i) {
            mo11026b();
            ((ami) this.f2326a).m2751b(0);
            return this;
        }

        /* renamed from: a */
        public final C1053a mo10696a(boolean z) {
            mo11026b();
            ((ami) this.f2326a).m2750a(true);
            return this;
        }

        /* renamed from: c */
        public final C1053a mo10698c(String str) {
            mo11026b();
            ((ami) this.f2326a).m2755c(str);
            return this;
        }

        /* synthetic */ C1053a(amj amj) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo10689a() {
        return this.zzfhd;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m2749a(String str) {
        if (str != null) {
            this.zzfhd = str;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: b */
    public final String mo10690b() {
        return this.zzfgk;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m2753b(String str) {
        if (str != null) {
            this.zzfgk = str;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: c */
    public final int mo10691c() {
        return this.zzfhe;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m2751b(int i) {
        this.zzfhe = i;
    }

    /* renamed from: d */
    public final boolean mo10692d() {
        return this.zzfhf;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m2750a(boolean z) {
        this.zzfhf = z;
    }

    /* renamed from: e */
    public final String mo10693e() {
        return this.zzfhg;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m2755c(String str) {
        if (str != null) {
            this.zzfhg = str;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: f */
    public static C1053a m2756f() {
        return (C1053a) ((aqn.C1078a) zzfhh.mo10613a(aqn.C1082e.f2334e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo10613a(int i, Object obj, Object obj2) {
        switch (amj.f2046a[i - 1]) {
            case 1:
                return new ami();
            case 2:
                return new C1053a((amj) null);
            case 3:
                return m3456a((arw) zzfhh, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzfhd", "zzfgk", "zzfhe", "zzfhf", "zzfhg"});
            case 4:
                return zzfhh;
            case 5:
                ash<ami> ash = zzcas;
                if (ash == null) {
                    synchronized (ami.class) {
                        ash = zzcas;
                        if (ash == null) {
                            ash = new aqn.C1079b<>(zzfhh);
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
        aqn.m3458a(ami.class, zzfhh);
    }
}
