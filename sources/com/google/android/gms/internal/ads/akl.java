package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;

public final class akl extends aqn<akl, C1031a> implements ary {
    private static volatile ash<akl> zzcas;
    /* access modifiers changed from: private */
    public static final akl zzfel = new akl();
    private akn zzfeh;
    private int zzfek;

    private akl() {
    }

    /* renamed from: com.google.android.gms.internal.ads.akl$a */
    public static final class C1031a extends aqn.C1078a<akl, C1031a> implements ary {
        private C1031a() {
            super(akl.zzfel);
        }

        /* synthetic */ C1031a(akm akm) {
            this();
        }
    }

    /* renamed from: a */
    public final akn mo10627a() {
        return this.zzfeh == null ? akn.m2563b() : this.zzfeh;
    }

    /* renamed from: b */
    public final int mo10628b() {
        return this.zzfek;
    }

    /* renamed from: a */
    public static akl m2557a(apc apc) {
        return (akl) aqn.m3451a(zzfel, apc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo10613a(int i, Object obj, Object obj2) {
        switch (akm.f1958a[i - 1]) {
            case 1:
                return new akl();
            case 2:
                return new C1031a((akm) null);
            case 3:
                return m3456a((arw) zzfel, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzfeh", "zzfek"});
            case 4:
                return zzfel;
            case 5:
                ash<akl> ash = zzcas;
                if (ash == null) {
                    synchronized (akl.class) {
                        ash = zzcas;
                        if (ash == null) {
                            ash = new aqn.C1079b<>(zzfel);
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

    /* renamed from: c */
    public static akl m2558c() {
        return zzfel;
    }

    static {
        aqn.m3458a(akl.class, zzfel);
    }
}
