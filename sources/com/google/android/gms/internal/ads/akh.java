package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;

public final class akh extends aqn<akh, C1029a> implements ary {
    private static volatile ash<akh> zzcas;
    /* access modifiers changed from: private */
    public static final akh zzfeg = new akh();
    private akl zzfee;
    private alw zzfef;

    private akh() {
    }

    /* renamed from: com.google.android.gms.internal.ads.akh$a */
    public static final class C1029a extends aqn.C1078a<akh, C1029a> implements ary {
        private C1029a() {
            super(akh.zzfeg);
        }

        /* synthetic */ C1029a(aki aki) {
            this();
        }
    }

    /* renamed from: a */
    public final akl mo10619a() {
        return this.zzfee == null ? akl.m2558c() : this.zzfee;
    }

    /* renamed from: b */
    public final alw mo10620b() {
        return this.zzfef == null ? alw.m2707c() : this.zzfef;
    }

    /* renamed from: a */
    public static akh m2535a(apc apc) {
        return (akh) aqn.m3451a(zzfeg, apc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo10613a(int i, Object obj, Object obj2) {
        switch (aki.f1956a[i - 1]) {
            case 1:
                return new akh();
            case 2:
                return new C1029a((aki) null);
            case 3:
                return m3456a((arw) zzfeg, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzfee", "zzfef"});
            case 4:
                return zzfeg;
            case 5:
                ash<akh> ash = zzcas;
                if (ash == null) {
                    synchronized (akh.class) {
                        ash = zzcas;
                        if (ash == null) {
                            ash = new aqn.C1079b<>(zzfeg);
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
        aqn.m3458a(akh.class, zzfeg);
    }
}
