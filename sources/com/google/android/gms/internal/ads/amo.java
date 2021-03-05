package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;

public final class amo extends aqn<amo, C1060a> implements ary {
    private static volatile ash<amo> zzcas;
    /* access modifiers changed from: private */
    public static final amo zzfht = new amo();
    private int zzfea;
    private amq zzfhs;

    private amo() {
    }

    /* renamed from: com.google.android.gms.internal.ads.amo$a */
    public static final class C1060a extends aqn.C1078a<amo, C1060a> implements ary {
        private C1060a() {
            super(amo.zzfht);
        }

        /* renamed from: a */
        public final C1060a mo10715a(int i) {
            mo11026b();
            ((amo) this.f2326a).m2810b(0);
            return this;
        }

        /* renamed from: a */
        public final C1060a mo10716a(amq amq) {
            mo11026b();
            ((amo) this.f2326a).m2809a(amq);
            return this;
        }

        /* synthetic */ C1060a(amp amp) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo10713a() {
        return this.zzfea;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m2810b(int i) {
        this.zzfea = i;
    }

    /* renamed from: b */
    public final amq mo10714b() {
        return this.zzfhs == null ? amq.m2819b() : this.zzfhs;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m2809a(amq amq) {
        if (amq != null) {
            this.zzfhs = amq;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static amo m2806a(apc apc) {
        return (amo) aqn.m3451a(zzfht, apc);
    }

    /* renamed from: c */
    public static C1060a m2811c() {
        return (C1060a) ((aqn.C1078a) zzfht.mo10613a(aqn.C1082e.f2334e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo10613a(int i, Object obj, Object obj2) {
        switch (amp.f2049a[i - 1]) {
            case 1:
                return new amo();
            case 2:
                return new C1060a((amp) null);
            case 3:
                return m3456a((arw) zzfht, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzfea", "zzfhs"});
            case 4:
                return zzfht;
            case 5:
                ash<amo> ash = zzcas;
                if (ash == null) {
                    synchronized (amo.class) {
                        ash = zzcas;
                        if (ash == null) {
                            ash = new aqn.C1079b<>(zzfht);
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
        aqn.m3458a(amo.class, zzfht);
    }
}
