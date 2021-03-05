package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;

public final class ali extends aqn<ali, C1042a> implements ary {
    private static volatile ash<ali> zzcas;
    /* access modifiers changed from: private */
    public static final ali zzffi = new ali();
    private alo zzfff;
    private ald zzffg;
    private int zzffh;

    private ali() {
    }

    /* renamed from: com.google.android.gms.internal.ads.ali$a */
    public static final class C1042a extends aqn.C1078a<ali, C1042a> implements ary {
        private C1042a() {
            super(ali.zzffi);
        }

        /* synthetic */ C1042a(alj alj) {
            this();
        }
    }

    /* renamed from: a */
    public final alo mo10651a() {
        return this.zzfff == null ? alo.m2679d() : this.zzfff;
    }

    /* renamed from: b */
    public final ald mo10652b() {
        return this.zzffg == null ? ald.m2623b() : this.zzffg;
    }

    /* renamed from: c */
    public final alb mo10653c() {
        alb a = alb.m2621a(this.zzffh);
        return a == null ? alb.UNRECOGNIZED : a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo10613a(int i, Object obj, Object obj2) {
        switch (alj.f1998a[i - 1]) {
            case 1:
                return new ali();
            case 2:
                return new C1042a((alj) null);
            case 3:
                return m3456a((arw) zzffi, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzfff", "zzffg", "zzffh"});
            case 4:
                return zzffi;
            case 5:
                ash<ali> ash = zzcas;
                if (ash == null) {
                    synchronized (ali.class) {
                        ash = zzcas;
                        if (ash == null) {
                            ash = new aqn.C1079b<>(zzffi);
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
    public static ali m2636d() {
        return zzffi;
    }

    static {
        aqn.m3458a(ali.class, zzffi);
    }
}
