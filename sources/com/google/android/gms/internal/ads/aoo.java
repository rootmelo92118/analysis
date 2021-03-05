package com.google.android.gms.internal.ads;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

final class aoo {

    /* renamed from: a */
    private final ConcurrentHashMap<aop, List<Throwable>> f2144a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f2145b = new ReferenceQueue<>();

    aoo() {
    }

    /* renamed from: a */
    public final List<Throwable> mo10749a(Throwable th, boolean z) {
        Reference<? extends Throwable> poll = this.f2145b.poll();
        while (poll != null) {
            this.f2144a.remove(poll);
            poll = this.f2145b.poll();
        }
        return this.f2144a.get(new aop(th, (ReferenceQueue<Throwable>) null));
    }
}
