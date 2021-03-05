package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;

public final class akt extends aqn<akt, C1035a> implements ary {
    private static volatile ash<akt> zzcas;
    /* access modifiers changed from: private */
    public static final akt zzfer = new akt();
    private int zzfem;

    private akt() {
    }

    /* renamed from: com.google.android.gms.internal.ads.akt$a */
    public static final class C1035a extends aqn.C1078a<akt, C1035a> implements ary {
        private C1035a() {
            super(akt.zzfer);
        }

        /* synthetic */ C1035a(aku aku) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo10638a() {
        return this.zzfem;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo10613a(int i, Object obj, Object obj2) {
        switch (aku.f1962a[i - 1]) {
            case 1:
                return new akt();
            case 2:
                return new C1035a((aku) null);
            case 3:
                return m3456a((arw) zzfer, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzfem"});
            case 4:
                return zzfer;
            case 5:
                ash<akt> ash = zzcas;
                if (ash == null) {
                    synchronized (akt.class) {
                        ash = zzcas;
                        if (ash == null) {
                            ash = new aqn.C1079b<>(zzfer);
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
    public static akt m2588b() {
        return zzfer;
    }

    static {
        aqn.m3458a(akt.class, zzfer);
    }
}
