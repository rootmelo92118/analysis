package p000a.p013b.p020e.p025e.p026a;

import java.util.concurrent.atomic.AtomicReference;
import p000a.p013b.C0228f;
import p000a.p013b.C0230g;
import p000a.p013b.C0240h;
import p000a.p013b.p017b.C0165b;
import p000a.p013b.p020e.p021a.C0184b;

/* renamed from: a.b.e.e.a.d */
/* compiled from: ObservableSubscribeOn */
public final class C0199d<T> extends C0194a<T, T> {

    /* renamed from: b */
    final C0240h f390b;

    public C0199d(C0228f<T> fVar, C0240h hVar) {
        super(fVar);
        this.f390b = hVar;
    }

    /* renamed from: b */
    public void mo364b(C0230g<? super T> gVar) {
        final C0201a aVar = new C0201a(gVar);
        gVar.onSubscribe(aVar);
        aVar.mo395a(this.f390b.mo416a(new Runnable() {
            public void run() {
                C0199d.this.f373a.mo362a(aVar);
            }
        }));
    }

    /* renamed from: a.b.e.e.a.d$a */
    /* compiled from: ObservableSubscribeOn */
    static final class C0201a<T> extends AtomicReference<C0165b> implements C0165b, C0230g<T> {
        private static final long serialVersionUID = 8094547886072529208L;

        /* renamed from: a */
        final C0230g<? super T> f393a;

        /* renamed from: b */
        final AtomicReference<C0165b> f394b = new AtomicReference<>();

        C0201a(C0230g<? super T> gVar) {
            this.f393a = gVar;
        }

        public void onSubscribe(C0165b bVar) {
            C0184b.m507a(this.f394b, bVar);
        }

        public void onNext(T t) {
            this.f393a.onNext(t);
        }

        public void onError(Throwable th) {
            this.f393a.onError(th);
        }

        public void onComplete() {
            this.f393a.onComplete();
        }

        /* renamed from: a */
        public void mo348a() {
            C0184b.m506a(this.f394b);
            C0184b.m506a((AtomicReference<C0165b>) this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo395a(C0165b bVar) {
            C0184b.m507a((AtomicReference<C0165b>) this, bVar);
        }
    }
}
