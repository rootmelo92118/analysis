package com.google.android.gms.internal.p045c;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.c.f */
final class C1872f extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f7323a;

    public C1872f(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f7323a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final int hashCode() {
        return this.f7323a;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C1872f fVar = (C1872f) obj;
        return this.f7323a == fVar.f7323a && get() == fVar.get();
    }
}
