package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.fd */
final class C2030fd extends C2027fa {
    private C2030fd() {
        super();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <L> List<L> mo13894a(Object obj, long j) {
        C2014eo c = m9648c(obj, j);
        if (c.mo13573a()) {
            return c;
        }
        int size = c.size();
        C2014eo a = c.mo13588a(size == 0 ? 10 : size << 1);
        C2086hf.m10024a(obj, j, (Object) a);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo13896b(Object obj, long j) {
        m9648c(obj, j).mo13578b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <E> void mo13895a(Object obj, Object obj2, long j) {
        C2014eo c = m9648c(obj, j);
        C2014eo c2 = m9648c(obj2, j);
        int size = c.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            if (!c.mo13573a()) {
                c = c.mo13588a(size2 + size);
            }
            c.addAll(c2);
        }
        if (size > 0) {
            c2 = c;
        }
        C2086hf.m10024a(obj, j, (Object) c2);
    }

    /* renamed from: c */
    private static <E> C2014eo<E> m9648c(Object obj, long j) {
        return (C2014eo) C2086hf.m10047f(obj, j);
    }
}
