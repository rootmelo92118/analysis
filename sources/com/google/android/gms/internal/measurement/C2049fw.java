package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.fw */
final class C2049fw<T> implements C2061gh<T> {

    /* renamed from: a */
    private final C2043fq f7812a;

    /* renamed from: b */
    private final C2079gz<?, ?> f7813b;

    /* renamed from: c */
    private final boolean f7814c;

    /* renamed from: d */
    private final C1990dw<?> f7815d;

    private C2049fw(C2079gz<?, ?> gzVar, C1990dw<?> dwVar, C2043fq fqVar) {
        this.f7813b = gzVar;
        this.f7814c = dwVar.mo13783a(fqVar);
        this.f7815d = dwVar;
        this.f7812a = fqVar;
    }

    /* renamed from: a */
    static <T> C2049fw<T> m9753a(C2079gz<?, ?> gzVar, C1990dw<?> dwVar, C2043fq fqVar) {
        return new C2049fw<>(gzVar, dwVar, fqVar);
    }

    /* renamed from: a */
    public final T mo13926a() {
        return this.f7812a.mo13820k().mo13827e();
    }

    /* renamed from: a */
    public final boolean mo13929a(T t, T t2) {
        if (!this.f7813b.mo13993b(t).equals(this.f7813b.mo13993b(t2))) {
            return false;
        }
        if (this.f7814c) {
            return this.f7815d.mo13777a((Object) t).equals(this.f7815d.mo13777a((Object) t2));
        }
        return true;
    }

    /* renamed from: a */
    public final int mo13925a(T t) {
        int hashCode = this.f7813b.mo13993b(t).hashCode();
        return this.f7814c ? (hashCode * 53) + this.f7815d.mo13777a((Object) t).hashCode() : hashCode;
    }

    /* renamed from: b */
    public final void mo13931b(T t, T t2) {
        C2063gj.m9848a(this.f7813b, t, t2);
        if (this.f7814c) {
            C2063gj.m9846a(this.f7815d, t, t2);
        }
    }

    /* renamed from: a */
    public final void mo13928a(T t, C2105hu huVar) {
        Iterator<Map.Entry<?, Object>> e = this.f7815d.mo13777a((Object) t).mo13791e();
        while (e.hasNext()) {
            Map.Entry next = e.next();
            C1996eb ebVar = (C1996eb) next.getKey();
            if (ebVar.mo13802c() != C2104ht.MESSAGE || ebVar.mo13803d() || ebVar.mo13804e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof C2021ev) {
                huVar.mo13735a(ebVar.mo13798a(), (Object) ((C2021ev) next).mo13840a().mo13849c());
            } else {
                huVar.mo13735a(ebVar.mo13798a(), next.getValue());
            }
        }
        C2079gz<?, ?> gzVar = this.f7813b;
        gzVar.mo13995b(gzVar.mo13993b(t), huVar);
    }

    /* renamed from: a */
    public final void mo13927a(T t, C2060gg ggVar, C1988dv dvVar) {
        boolean z;
        C2079gz<?, ?> gzVar = this.f7813b;
        C1990dw<?> dwVar = this.f7815d;
        Object c = gzVar.mo13997c(t);
        C1993dz<?> b = dwVar.mo13784b(t);
        do {
            try {
                if (ggVar.mo13647a() == Integer.MAX_VALUE) {
                    gzVar.mo13996b((Object) t, c);
                    return;
                }
                int b2 = ggVar.mo13652b();
                if (b2 == 11) {
                    Object obj = null;
                    C1958cx cxVar = null;
                    int i = 0;
                    while (ggVar.mo13647a() != Integer.MAX_VALUE) {
                        int b3 = ggVar.mo13652b();
                        if (b3 == 16) {
                            i = ggVar.mo13680o();
                            obj = dwVar.mo13778a(dvVar, this.f7812a, i);
                        } else if (b3 == 26) {
                            if (obj != null) {
                                dwVar.mo13781a(ggVar, obj, dvVar, b);
                            } else {
                                cxVar = ggVar.mo13678n();
                            }
                        } else if (!ggVar.mo13657c()) {
                            break;
                        }
                    }
                    if (ggVar.mo13652b() != 12) {
                        throw C2015ep.m9575d();
                    } else if (cxVar != null) {
                        if (obj != null) {
                            dwVar.mo13780a(cxVar, obj, dvVar, b);
                        } else {
                            gzVar.mo13987a(c, i, cxVar);
                        }
                    }
                } else if ((b2 & 7) == 2) {
                    Object a = dwVar.mo13778a(dvVar, this.f7812a, b2 >>> 3);
                    if (a != null) {
                        dwVar.mo13781a(ggVar, a, dvVar, b);
                    } else {
                        z = gzVar.mo13992a(c, ggVar);
                        continue;
                    }
                } else {
                    z = ggVar.mo13657c();
                    continue;
                }
                z = true;
                continue;
            } finally {
                gzVar.mo13996b((Object) t, c);
            }
        } while (z);
    }

    /* renamed from: c */
    public final void mo13932c(T t) {
        this.f7813b.mo13999d(t);
        this.f7815d.mo13785c(t);
    }

    /* renamed from: d */
    public final boolean mo13933d(T t) {
        return this.f7815d.mo13777a((Object) t).mo13794g();
    }

    /* renamed from: b */
    public final int mo13930b(T t) {
        C2079gz<?, ?> gzVar = this.f7813b;
        int e = gzVar.mo14000e(gzVar.mo13993b(t)) + 0;
        return this.f7814c ? e + this.f7815d.mo13777a((Object) t).mo13797i() : e;
    }
}
