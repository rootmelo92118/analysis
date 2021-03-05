package p000a.p013b.p020e.p021a;

import java.util.concurrent.atomic.AtomicReference;
import p000a.p013b.p017b.C0165b;
import p000a.p013b.p020e.p022b.C0187a;
import p000a.p013b.p030f.C0229a;

/* renamed from: a.b.e.a.b */
/* compiled from: DisposableHelper */
public enum C0184b implements C0165b {
    DISPOSED;

    /* renamed from: a */
    public void mo348a() {
    }

    /* renamed from: a */
    public static boolean m504a(C0165b bVar) {
        return bVar == DISPOSED;
    }

    /* renamed from: a */
    public static boolean m507a(AtomicReference<C0165b> atomicReference, C0165b bVar) {
        C0187a.m524a(bVar, "d is null");
        if (atomicReference.compareAndSet((Object) null, bVar)) {
            return true;
        }
        bVar.mo348a();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        m508b();
        return false;
    }

    /* renamed from: a */
    public static boolean m506a(AtomicReference<C0165b> atomicReference) {
        C0165b andSet;
        C0165b bVar = atomicReference.get();
        C0184b bVar2 = DISPOSED;
        if (bVar == bVar2 || (andSet = atomicReference.getAndSet(bVar2)) == bVar2) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.mo348a();
        return true;
    }

    /* renamed from: a */
    public static boolean m505a(C0165b bVar, C0165b bVar2) {
        if (bVar2 == null) {
            C0229a.m632a((Throwable) new NullPointerException("next is null"));
            return false;
        } else if (bVar == null) {
            return true;
        } else {
            bVar2.mo348a();
            m508b();
            return false;
        }
    }

    /* renamed from: b */
    public static void m508b() {
        C0229a.m632a((Throwable) new IllegalStateException("Disposable already set!"));
    }
}
