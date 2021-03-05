package p000a.p013b.p017b;

import java.util.concurrent.Future;

/* renamed from: a.b.b.d */
/* compiled from: FutureDisposable */
final class C0167d extends C0168e<Future<?>> {
    private static final long serialVersionUID = 6545242830671168775L;

    /* renamed from: a */
    private final boolean f359a;

    C0167d(Future<?> future, boolean z) {
        super(future);
        this.f359a = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo355a(Future<?> future) {
        future.cancel(this.f359a);
    }
}
