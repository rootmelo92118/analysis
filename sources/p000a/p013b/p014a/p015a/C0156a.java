package p000a.p013b.p014a.p015a;

import java.util.concurrent.Callable;
import p000a.p013b.C0240h;
import p000a.p013b.p018c.C0176b;
import p000a.p013b.p019d.C0181d;

/* renamed from: a.b.a.a.a */
/* compiled from: RxAndroidPlugins */
public final class C0156a {

    /* renamed from: a */
    private static volatile C0181d<Callable<C0240h>, C0240h> f346a;

    /* renamed from: b */
    private static volatile C0181d<C0240h, C0240h> f347b;

    /* renamed from: a */
    public static C0240h m452a(Callable<C0240h> callable) {
        if (callable != null) {
            C0181d<Callable<C0240h>, C0240h> dVar = f346a;
            if (dVar == null) {
                return m454b(callable);
            }
            return m450a(dVar, callable);
        }
        throw new NullPointerException("scheduler == null");
    }

    /* renamed from: a */
    public static C0240h m451a(C0240h hVar) {
        if (hVar != null) {
            C0181d dVar = f347b;
            if (dVar == null) {
                return hVar;
            }
            return (C0240h) m453a(dVar, hVar);
        }
        throw new NullPointerException("scheduler == null");
    }

    /* renamed from: b */
    static C0240h m454b(Callable<C0240h> callable) {
        try {
            C0240h call = callable.call();
            if (call != null) {
                return call;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw C0176b.m496a(th);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [a.b.d.d<java.util.concurrent.Callable<a.b.h>, a.b.h>, a.b.d.d] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p000a.p013b.C0240h m450a(p000a.p013b.p019d.C0181d<java.util.concurrent.Callable<p000a.p013b.C0240h>, p000a.p013b.C0240h> r0, java.util.concurrent.Callable<p000a.p013b.C0240h> r1) {
        /*
            java.lang.Object r0 = m453a(r0, r1)
            a.b.h r0 = (p000a.p013b.C0240h) r0
            if (r0 == 0) goto L_0x0009
            return r0
        L_0x0009:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Scheduler Callable returned null"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p013b.p014a.p015a.C0156a.m450a(a.b.d.d, java.util.concurrent.Callable):a.b.h");
    }

    /* renamed from: a */
    static <T, R> R m453a(C0181d<T, R> dVar, T t) {
        try {
            return dVar.mo375a(t);
        } catch (Throwable th) {
            throw C0176b.m496a(th);
        }
    }
}
