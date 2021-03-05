package com.google.android.gms.internal.ads;

import java.util.List;

final class ari extends arf {
    private ari() {
        super();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <L> List<L> mo11059a(Object obj, long j) {
        aqu c = m3545c(obj, j);
        if (c.mo10761a()) {
            return c;
        }
        int size = c.size();
        aqu a = c.mo10785a(size == 0 ? 10 : size << 1);
        atn.m3922a(obj, j, (Object) a);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo11061b(Object obj, long j) {
        m3545c(obj, j).mo10766b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <E> void mo11060a(Object obj, Object obj2, long j) {
        aqu c = m3545c(obj, j);
        aqu c2 = m3545c(obj2, j);
        int size = c.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            if (!c.mo10761a()) {
                c = c.mo10785a(size2 + size);
            }
            c.addAll(c2);
        }
        if (size > 0) {
            c2 = c;
        }
        atn.m3922a(obj, j, (Object) c2);
    }

    /* renamed from: c */
    private static <E> aqu<E> m3545c(Object obj, long j) {
        return (aqu) atn.m3944f(obj, j);
    }
}
