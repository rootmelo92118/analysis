package com.google.android.gms.p040b;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.C0926p;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.b.j */
public final class C0745j {

    /* renamed from: com.google.android.gms.b.j$b */
    interface C0747b extends C0736b, C0738d, C0739e<Object> {
    }

    /* renamed from: a */
    public static <TResult> C0741g<TResult> m828a(TResult tresult) {
        C0763z zVar = new C0763z();
        zVar.mo9504a(tresult);
        return zVar;
    }

    /* renamed from: com.google.android.gms.b.j$a */
    private static final class C0746a implements C0747b {

        /* renamed from: a */
        private final CountDownLatch f720a;

        private C0746a() {
            this.f720a = new CountDownLatch(1);
        }

        /* renamed from: a */
        public final void mo9472a(Object obj) {
            this.f720a.countDown();
        }

        /* renamed from: a */
        public final void mo9471a(@NonNull Exception exc) {
            this.f720a.countDown();
        }

        /* renamed from: a */
        public final void mo9469a() {
            this.f720a.countDown();
        }

        /* renamed from: b */
        public final void mo9492b() {
            this.f720a.await();
        }

        /* renamed from: a */
        public final boolean mo9491a(long j, TimeUnit timeUnit) {
            return this.f720a.await(j, timeUnit);
        }

        /* synthetic */ C0746a(C0735aa aaVar) {
            this();
        }
    }

    /* renamed from: a */
    public static <TResult> TResult m829a(@NonNull C0741g<TResult> gVar) {
        C0926p.m1310a();
        C0926p.m1307a(gVar, (Object) "Task must not be null");
        if (gVar.mo9479a()) {
            return m832b(gVar);
        }
        C0746a aVar = new C0746a((C0735aa) null);
        m831a(gVar, aVar);
        aVar.mo9492b();
        return m832b(gVar);
    }

    /* renamed from: a */
    public static <TResult> TResult m830a(@NonNull C0741g<TResult> gVar, long j, @NonNull TimeUnit timeUnit) {
        C0926p.m1310a();
        C0926p.m1307a(gVar, (Object) "Task must not be null");
        C0926p.m1307a(timeUnit, (Object) "TimeUnit must not be null");
        if (gVar.mo9479a()) {
            return m832b(gVar);
        }
        C0746a aVar = new C0746a((C0735aa) null);
        m831a(gVar, aVar);
        if (aVar.mo9491a(j, timeUnit)) {
            return m832b(gVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* renamed from: b */
    private static <TResult> TResult m832b(C0741g<TResult> gVar) {
        if (gVar.mo9481b()) {
            return gVar.mo9483d();
        }
        if (gVar.mo9482c()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(gVar.mo9484e());
    }

    /* renamed from: a */
    private static void m831a(C0741g<?> gVar, C0747b bVar) {
        gVar.mo9477a(C0743i.f718b, (C0739e<? super Object>) bVar);
        gVar.mo9476a(C0743i.f718b, (C0738d) bVar);
        gVar.mo9474a(C0743i.f718b, (C0736b) bVar);
    }
}
