package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;

public final class ald extends aqn<ald, C1040a> implements ary {
    private static volatile ash<ald> zzcas;
    /* access modifiers changed from: private */
    public static final ald zzffc = new ald();
    private amg zzffb;

    private ald() {
    }

    /* renamed from: com.google.android.gms.internal.ads.ald$a */
    public static final class C1040a extends aqn.C1078a<ald, C1040a> implements ary {
        private C1040a() {
            super(ald.zzffc);
        }

        /* synthetic */ C1040a(alf alf) {
            this();
        }
    }

    /* renamed from: a */
    public final amg mo10649a() {
        return this.zzffb == null ? amg.m2741c() : this.zzffb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo10613a(int i, Object obj, Object obj2) {
        switch (alf.f1996a[i - 1]) {
            case 1:
                return new ald();
            case 2:
                return new C1040a((alf) null);
            case 3:
                return m3456a((arw) zzffc, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzffb"});
            case 4:
                return zzffc;
            case 5:
                ash<ald> ash = zzcas;
                if (ash == null) {
                    synchronized (ald.class) {
                        ash = zzcas;
                        if (ash == null) {
                            ash = new aqn.C1079b<>(zzffc);
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
    public static ald m2623b() {
        return zzffc;
    }

    static {
        aqn.m3458a(ald.class, zzffc);
    }
}
