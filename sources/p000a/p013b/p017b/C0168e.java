package p000a.p013b.p017b;

import java.util.concurrent.atomic.AtomicReference;
import p000a.p013b.p020e.p022b.C0187a;

/* renamed from: a.b.b.e */
/* compiled from: ReferenceDisposable */
abstract class C0168e<T> extends AtomicReference<T> implements C0165b {
    private static final long serialVersionUID = 6537757548749041217L;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo355a(T t);

    C0168e(T t) {
        super(C0187a.m524a(t, "value is null"));
    }

    /* renamed from: a */
    public final void mo348a() {
        Object andSet;
        if (get() != null && (andSet = getAndSet((Object) null)) != null) {
            mo355a(andSet);
        }
    }

    /* renamed from: b */
    public final boolean mo357b() {
        return get() == null;
    }
}
