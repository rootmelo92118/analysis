package com.google.android.gms.internal.p045c;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.c.e */
final class C1871e {

    /* renamed from: a */
    private final ConcurrentHashMap<C1872f, List<Throwable>> f7321a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f7322b = new ReferenceQueue<>();

    C1871e() {
    }

    /* renamed from: a */
    public final List<Throwable> mo13487a(Throwable th, boolean z) {
        Reference<? extends Throwable> poll = this.f7322b.poll();
        while (poll != null) {
            this.f7321a.remove(poll);
            poll = this.f7322b.poll();
        }
        List<Throwable> list = this.f7321a.get(new C1872f(th, (ReferenceQueue<Throwable>) null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f7321a.putIfAbsent(new C1872f(th, this.f7322b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
