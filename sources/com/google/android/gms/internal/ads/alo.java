package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;

public final class alo extends aqn<alo, C1045a> implements ary {
    private static volatile ash<alo> zzcas;
    /* access modifiers changed from: private */
    public static final alo zzffr = new alo();
    private int zzffo;
    private int zzffp;
    private apc zzffq = apc.f2174a;

    private alo() {
    }

    /* renamed from: com.google.android.gms.internal.ads.alo$a */
    public static final class C1045a extends aqn.C1078a<alo, C1045a> implements ary {
        private C1045a() {
            super(alo.zzffr);
        }

        /* synthetic */ C1045a(alp alp) {
            this();
        }
    }

    /* renamed from: a */
    public final alq mo10668a() {
        alq a = alq.m2685a(this.zzffo);
        return a == null ? alq.UNRECOGNIZED : a;
    }

    /* renamed from: b */
    public final als mo10669b() {
        als a = als.m2687a(this.zzffp);
        return a == null ? als.UNRECOGNIZED : a;
    }

    /* renamed from: c */
    public final apc mo10670c() {
        return this.zzffq;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo10613a(int i, Object obj, Object obj2) {
        switch (alp.f2001a[i - 1]) {
            case 1:
                return new alo();
            case 2:
                return new C1045a((alp) null);
            case 3:
                return m3456a((arw) zzffr, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzffo", "zzffp", "zzffq"});
            case 4:
                return zzffr;
            case 5:
                ash<alo> ash = zzcas;
                if (ash == null) {
                    synchronized (alo.class) {
                        ash = zzcas;
                        if (ash == null) {
                            ash = new aqn.C1079b<>(zzffr);
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

    /* renamed from: d */
    public static alo m2679d() {
        return zzffr;
    }

    static {
        aqn.m3458a(alo.class, zzffr);
    }
}
