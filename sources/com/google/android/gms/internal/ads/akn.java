package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;

public final class akn extends aqn<akn, C1032a> implements ary {
    private static volatile ash<akn> zzcas;
    /* access modifiers changed from: private */
    public static final akn zzfen = new akn();
    private int zzfem;

    private akn() {
    }

    /* renamed from: com.google.android.gms.internal.ads.akn$a */
    public static final class C1032a extends aqn.C1078a<akn, C1032a> implements ary {
        private C1032a() {
            super(akn.zzfen);
        }

        /* synthetic */ C1032a(ako ako) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo10629a() {
        return this.zzfem;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo10613a(int i, Object obj, Object obj2) {
        switch (ako.f1959a[i - 1]) {
            case 1:
                return new akn();
            case 2:
                return new C1032a((ako) null);
            case 3:
                return m3456a((arw) zzfen, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzfem"});
            case 4:
                return zzfen;
            case 5:
                ash<akn> ash = zzcas;
                if (ash == null) {
                    synchronized (akn.class) {
                        ash = zzcas;
                        if (ash == null) {
                            ash = new aqn.C1079b<>(zzfen);
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

    /* renamed from: b */
    public static akn m2563b() {
        return zzfen;
    }

    static {
        aqn.m3458a(akn.class, zzfen);
    }
}
