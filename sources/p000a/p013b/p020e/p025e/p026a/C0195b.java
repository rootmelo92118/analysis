package p000a.p013b.p020e.p025e.p026a;

import java.util.concurrent.atomic.AtomicReference;
import p000a.p013b.C0170c;
import p000a.p013b.C0177d;
import p000a.p013b.C0182e;
import p000a.p013b.C0230g;
import p000a.p013b.p017b.C0165b;
import p000a.p013b.p018c.C0176b;
import p000a.p013b.p020e.p021a.C0184b;
import p000a.p013b.p030f.C0229a;

/* renamed from: a.b.e.e.a.b */
/* compiled from: ObservableCreate */
public final class C0195b<T> extends C0170c<T> {

    /* renamed from: a */
    final C0182e<T> f374a;

    public C0195b(C0182e<T> eVar) {
        this.f374a = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo364b(C0230g<? super T> gVar) {
        C0196a aVar = new C0196a(gVar);
        gVar.onSubscribe(aVar);
        try {
            this.f374a.subscribe(aVar);
        } catch (Throwable th) {
            C0176b.m497b(th);
            aVar.mo383a(th);
        }
    }

    /* renamed from: a.b.e.e.a.b$a */
    /* compiled from: ObservableCreate */
    static final class C0196a<T> extends AtomicReference<C0165b> implements C0165b, C0177d<T> {
        private static final long serialVersionUID = -3434801548987643227L;

        /* renamed from: a */
        final C0230g<? super T> f375a;

        C0196a(C0230g<? super T> gVar) {
            this.f375a = gVar;
        }

        /* renamed from: a */
        public void mo383a(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (!mo384b()) {
                try {
                    this.f375a.onError(th);
                } finally {
                    mo348a();
                }
            } else {
                C0229a.m632a(th);
            }
        }

        /* renamed from: e_ */
        public void mo342e_() {
            if (!mo384b()) {
                try {
                    this.f375a.onComplete();
                } finally {
                    mo348a();
                }
            }
        }

        /* renamed from: a */
        public void mo348a() {
            C0184b.m506a((AtomicReference<C0165b>) this);
        }

        /* renamed from: b */
        public boolean mo384b() {
            return C0184b.m504a((C0165b) get());
        }
    }
}
