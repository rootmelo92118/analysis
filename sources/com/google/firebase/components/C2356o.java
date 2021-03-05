package com.google.firebase.components;

import android.support.annotation.GuardedBy;
import com.google.android.gms.common.internal.C0926p;
import com.google.firebase.p047a.C2328a;
import com.google.firebase.p047a.C2329b;
import com.google.firebase.p047a.C2330c;
import com.google.firebase.p047a.C2331d;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.components.o */
/* compiled from: com.google.firebase:firebase-common@@16.0.2 */
class C2356o implements C2330c, C2331d {
    @GuardedBy("this")

    /* renamed from: a */
    private final Map<Class<?>, ConcurrentHashMap<C2329b<Object>, Executor>> f8787a = new HashMap();
    @GuardedBy("this")

    /* renamed from: b */
    private Queue<C2328a<?>> f8788b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f8789c;

    C2356o(Executor executor) {
        this.f8789c = executor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r0.hasNext() == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        r1 = r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(com.google.firebase.components.C2357p.m11599a(r1, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r0 = m11594b(r4).iterator();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14951a(com.google.firebase.p047a.C2328a<?> r4) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.C0926p.m1306a(r4)
            monitor-enter(r3)
            java.util.Queue<com.google.firebase.a.a<?>> r0 = r3.f8788b     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x000f
            java.util.Queue<com.google.firebase.a.a<?>> r0 = r3.f8788b     // Catch:{ all -> 0x0033 }
            r0.add(r4)     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x000f:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            java.util.Set r0 = r3.m11594b(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            java.lang.Runnable r1 = com.google.firebase.components.C2357p.m11599a(r1, r4)
            r2.execute(r1)
            goto L_0x0018
        L_0x0032:
            return
        L_0x0033:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.C2356o.mo14951a(com.google.firebase.a.a):void");
    }

    /* renamed from: b */
    private synchronized Set<Map.Entry<C2329b<Object>, Executor>> m11594b(C2328a<?> aVar) {
        Map map = this.f8787a.get(aVar.mo14902a());
        if (map == null) {
            return Collections.emptySet();
        }
        return map.entrySet();
    }

    /* renamed from: a */
    public synchronized <T> void mo14907a(Class<T> cls, Executor executor, C2329b<? super T> bVar) {
        C0926p.m1306a(cls);
        C0926p.m1306a(bVar);
        C0926p.m1306a(executor);
        if (!this.f8787a.containsKey(cls)) {
            this.f8787a.put(cls, new ConcurrentHashMap());
        }
        this.f8787a.get(cls).put(bVar, executor);
    }

    /* renamed from: a */
    public <T> void mo14906a(Class<T> cls, C2329b<? super T> bVar) {
        mo14907a(cls, this.f8789c, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14950a() {
        Queue<C2328a<?>> queue;
        synchronized (this) {
            if (this.f8788b != null) {
                queue = this.f8788b;
                this.f8788b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (C2328a a : queue) {
                mo14951a(a);
            }
        }
    }
}
