package p000a.p013b.p017b;

import java.util.concurrent.Future;
import p000a.p013b.p020e.p021a.C0185c;
import p000a.p013b.p020e.p022b.C0187a;

/* renamed from: a.b.b.c */
/* compiled from: Disposables */
public final class C0166c {
    /* renamed from: a */
    public static C0165b m471a(Runnable runnable) {
        C0187a.m524a(runnable, "run is null");
        return new C0169f(runnable);
    }

    /* renamed from: a */
    public static C0165b m472a(Future<?> future) {
        C0187a.m524a(future, "future is null");
        return m473a(future, true);
    }

    /* renamed from: a */
    public static C0165b m473a(Future<?> future, boolean z) {
        C0187a.m524a(future, "future is null");
        return new C0167d(future, z);
    }

    /* renamed from: a */
    public static C0165b m470a() {
        return C0185c.INSTANCE;
    }
}
