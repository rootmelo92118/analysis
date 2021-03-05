package p000a.p013b.p030f;

import java.util.concurrent.Callable;
import p000a.p013b.C0170c;
import p000a.p013b.C0230g;
import p000a.p013b.C0240h;
import p000a.p013b.p019d.C0178a;
import p000a.p013b.p019d.C0180c;
import p000a.p013b.p019d.C0181d;
import p000a.p013b.p020e.p022b.C0187a;
import p000a.p013b.p020e.p029h.C0224a;

/* renamed from: a.b.f.a */
/* compiled from: RxJavaPlugins */
public final class C0229a {

    /* renamed from: a */
    static volatile C0180c<Throwable> f473a;

    /* renamed from: b */
    static volatile C0181d<Runnable, Runnable> f474b;

    /* renamed from: c */
    static volatile C0181d<Callable<C0240h>, C0240h> f475c;

    /* renamed from: d */
    static volatile C0181d<Callable<C0240h>, C0240h> f476d;

    /* renamed from: e */
    static volatile C0181d<Callable<C0240h>, C0240h> f477e;

    /* renamed from: f */
    static volatile C0181d<Callable<C0240h>, C0240h> f478f;

    /* renamed from: g */
    static volatile C0181d<C0240h, C0240h> f479g;

    /* renamed from: h */
    static volatile C0181d<C0170c, C0170c> f480h;

    /* renamed from: i */
    static volatile C0178a<C0170c, C0230g, C0230g> f481i;

    /* renamed from: a */
    public static C0240h m628a(Callable<C0240h> callable) {
        C0187a.m524a(callable, "Scheduler Callable can't be null");
        C0181d<Callable<C0240h>, C0240h> dVar = f475c;
        if (dVar == null) {
            return m637e(callable);
        }
        return m626a(dVar, callable);
    }

    /* renamed from: b */
    public static C0240h m633b(Callable<C0240h> callable) {
        C0187a.m524a(callable, "Scheduler Callable can't be null");
        C0181d<Callable<C0240h>, C0240h> dVar = f477e;
        if (dVar == null) {
            return m637e(callable);
        }
        return m626a(dVar, callable);
    }

    /* renamed from: c */
    public static C0240h m635c(Callable<C0240h> callable) {
        C0187a.m524a(callable, "Scheduler Callable can't be null");
        C0181d<Callable<C0240h>, C0240h> dVar = f478f;
        if (dVar == null) {
            return m637e(callable);
        }
        return m626a(dVar, callable);
    }

    /* renamed from: d */
    public static C0240h m636d(Callable<C0240h> callable) {
        C0187a.m524a(callable, "Scheduler Callable can't be null");
        C0181d<Callable<C0240h>, C0240h> dVar = f476d;
        if (dVar == null) {
            return m637e(callable);
        }
        return m626a(dVar, callable);
    }

    /* renamed from: a */
    public static void m632a(Throwable th) {
        C0180c<Throwable> cVar = f473a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (cVar != null) {
            try {
                cVar.mo374a(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                m634b(th2);
            }
        }
        th.printStackTrace();
        m634b(th);
    }

    /* renamed from: b */
    static void m634b(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    /* renamed from: a */
    public static C0240h m627a(C0240h hVar) {
        C0181d dVar = f479g;
        if (dVar == null) {
            return hVar;
        }
        return (C0240h) m630a(dVar, hVar);
    }

    /* renamed from: a */
    public static Runnable m631a(Runnable runnable) {
        C0181d dVar = f474b;
        if (dVar == null) {
            return runnable;
        }
        return (Runnable) m630a(dVar, runnable);
    }

    /* renamed from: a */
    public static <T> C0230g<? super T> m625a(C0170c<T> cVar, C0230g<? super T> gVar) {
        C0178a aVar = f481i;
        return aVar != null ? (C0230g) m629a(aVar, cVar, gVar) : gVar;
    }

    /* renamed from: a */
    public static <T> C0170c<T> m624a(C0170c<T> cVar) {
        C0181d dVar = f480h;
        return dVar != null ? (C0170c) m630a(dVar, cVar) : cVar;
    }

    /* renamed from: a */
    static <T, R> R m630a(C0181d<T, R> dVar, T t) {
        try {
            return dVar.mo375a(t);
        } catch (Throwable th) {
            throw C0224a.m615a(th);
        }
    }

    /* renamed from: a */
    static <T, U, R> R m629a(C0178a<T, U, R> aVar, T t, U u) {
        try {
            return aVar.mo373a(t, u);
        } catch (Throwable th) {
            throw C0224a.m615a(th);
        }
    }

    /* renamed from: e */
    static C0240h m637e(Callable<C0240h> callable) {
        try {
            return (C0240h) C0187a.m524a(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th) {
            throw C0224a.m615a(th);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [a.b.d.d<java.util.concurrent.Callable<a.b.h>, a.b.h>, a.b.d.d] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p000a.p013b.C0240h m626a(p000a.p013b.p019d.C0181d<java.util.concurrent.Callable<p000a.p013b.C0240h>, p000a.p013b.C0240h> r0, java.util.concurrent.Callable<p000a.p013b.C0240h> r1) {
        /*
            java.lang.Object r0 = m630a(r0, r1)
            java.lang.String r1 = "Scheduler Callable result can't be null"
            java.lang.Object r0 = p000a.p013b.p020e.p022b.C0187a.m524a(r0, (java.lang.String) r1)
            a.b.h r0 = (p000a.p013b.C0240h) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p013b.p030f.C0229a.m626a(a.b.d.d, java.util.concurrent.Callable):a.b.h");
    }
}
