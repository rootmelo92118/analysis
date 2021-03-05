package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;
import java.util.List;

public final class amk extends aqn<amk, C1054a> implements ary {
    private static volatile ash<amk> zzcas;
    /* access modifiers changed from: private */
    public static final amk zzfhk = new amk();
    private int zzccg;
    private int zzfhi;
    private aqu<C1055b> zzfhj = m3462n();

    /* renamed from: com.google.android.gms.internal.ads.amk$b */
    public static final class C1055b extends aqn<C1055b, C1056a> implements ary {
        private static volatile ash<C1055b> zzcas;
        /* access modifiers changed from: private */
        public static final C1055b zzfho = new C1055b();
        private int zzfhb;
        private ama zzfhl;
        private int zzfhm;
        private int zzfhn;

        private C1055b() {
        }

        /* renamed from: com.google.android.gms.internal.ads.amk$b$a */
        public static final class C1056a extends aqn.C1078a<C1055b, C1056a> implements ary {
            private C1056a() {
                super(C1055b.zzfho);
            }

            /* synthetic */ C1056a(aml aml) {
                this();
            }
        }

        /* renamed from: a */
        public final boolean mo10702a() {
            return this.zzfhl != null;
        }

        /* renamed from: b */
        public final ama mo10703b() {
            return this.zzfhl == null ? ama.m2725e() : this.zzfhl;
        }

        /* renamed from: c */
        public final amd mo10704c() {
            amd a = amd.m2736a(this.zzfhm);
            return a == null ? amd.UNRECOGNIZED : a;
        }

        /* renamed from: d */
        public final int mo10705d() {
            return this.zzfhn;
        }

        /* renamed from: e */
        public final amw mo10706e() {
            amw a = amw.m2841a(this.zzfhb);
            return a == null ? amw.UNRECOGNIZED : a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo10613a(int i, Object obj, Object obj2) {
            switch (aml.f2047a[i - 1]) {
                case 1:
                    return new C1055b();
                case 2:
                    return new C1056a((aml) null);
                case 3:
                    return m3456a((arw) zzfho, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzfhl", "zzfhm", "zzfhn", "zzfhb"});
                case 4:
                    return zzfho;
                case 5:
                    ash<C1055b> ash = zzcas;
                    if (ash == null) {
                        synchronized (C1055b.class) {
                            ash = zzcas;
                            if (ash == null) {
                                ash = new aqn.C1079b<>(zzfho);
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
            aqn.m3458a(C1055b.class, zzfho);
        }
    }

    private amk() {
    }

    /* renamed from: com.google.android.gms.internal.ads.amk$a */
    public static final class C1054a extends aqn.C1078a<amk, C1054a> implements ary {
        private C1054a() {
            super(amk.zzfhk);
        }

        /* synthetic */ C1054a(aml aml) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo10699a() {
        return this.zzfhi;
    }

    /* renamed from: b */
    public final List<C1055b> mo10700b() {
        return this.zzfhj;
    }

    /* renamed from: c */
    public final int mo10701c() {
        return this.zzfhj.size();
    }

    /* renamed from: a */
    public static amk m2769a(byte[] bArr) {
        return (amk) aqn.m3454a(zzfhk, bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo10613a(int i, Object obj, Object obj2) {
        switch (aml.f2047a[i - 1]) {
            case 1:
                return new amk();
            case 2:
                return new C1054a((aml) null);
            case 3:
                return m3456a((arw) zzfhk, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzccg", "zzfhi", "zzfhj", C1055b.class});
            case 4:
                return zzfhk;
            case 5:
                ash<amk> ash = zzcas;
                if (ash == null) {
                    synchronized (amk.class) {
                        ash = zzcas;
                        if (ash == null) {
                            ash = new aqn.C1079b<>(zzfhk);
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
        aqn.m3458a(amk.class, zzfhk);
    }
}
