package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aqn;
import java.util.List;

public final class amy extends aqn<amy, C1064a> implements ary {
    private static volatile ash<amy> zzcas;
    /* access modifiers changed from: private */
    public static final amy zzfik = new amy();
    private int zzccg;
    private String zzfii = "";
    private aqu<ami> zzfij = m3462n();

    private amy() {
    }

    /* renamed from: com.google.android.gms.internal.ads.amy$a */
    public static final class C1064a extends aqn.C1078a<amy, C1064a> implements ary {
        private C1064a() {
            super(amy.zzfik);
        }

        /* renamed from: a */
        public final C1064a mo10726a(String str) {
            mo11026b();
            ((amy) this.f2326a).m2846a(str);
            return this;
        }

        /* renamed from: a */
        public final C1064a mo10725a(ami ami) {
            mo11026b();
            ((amy) this.f2326a).m2843a(ami);
            return this;
        }

        /* synthetic */ C1064a(amz amz) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m2846a(String str) {
        if (str != null) {
            this.zzfii = str;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public final List<ami> mo10724a() {
        return this.zzfij;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m2843a(ami ami) {
        if (ami != null) {
            if (!this.zzfij.mo10761a()) {
                aqu<ami> aqu = this.zzfij;
                int size = aqu.size();
                this.zzfij = aqu.mo10785a(size == 0 ? 10 : size << 1);
            }
            this.zzfij.add(ami);
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: b */
    public static C1064a m2847b() {
        return (C1064a) ((aqn.C1078a) zzfik.mo10613a(aqn.C1082e.f2334e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo10613a(int i, Object obj, Object obj2) {
        switch (amz.f2062a[i - 1]) {
            case 1:
                return new amy();
            case 2:
                return new C1064a((amz) null);
            case 3:
                return m3456a((arw) zzfik, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzccg", "zzfii", "zzfij", ami.class});
            case 4:
                return zzfik;
            case 5:
                ash<amy> ash = zzcas;
                if (ash == null) {
                    synchronized (amy.class) {
                        ash = zzcas;
                        if (ash == null) {
                            ash = new aqn.C1079b<>(zzfik);
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
        aqn.m3458a(amy.class, zzfik);
    }
}
