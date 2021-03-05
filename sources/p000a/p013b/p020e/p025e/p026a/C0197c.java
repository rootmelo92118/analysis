package p000a.p013b.p020e.p025e.p026a;

import p000a.p013b.C0228f;
import p000a.p013b.C0230g;
import p000a.p013b.C0240h;
import p000a.p013b.p017b.C0165b;
import p000a.p013b.p018c.C0176b;
import p000a.p013b.p020e.p021a.C0184b;
import p000a.p013b.p020e.p023c.C0189a;
import p000a.p013b.p020e.p023c.C0192d;
import p000a.p013b.p020e.p024d.C0193a;
import p000a.p013b.p020e.p027f.C0202a;
import p000a.p013b.p020e.p028g.C0219i;
import p000a.p013b.p030f.C0229a;

/* renamed from: a.b.e.e.a.c */
/* compiled from: ObservableObserveOn */
public final class C0197c<T> extends C0194a<T, T> {

    /* renamed from: b */
    final C0240h f376b;

    /* renamed from: c */
    final boolean f377c;

    /* renamed from: d */
    final int f378d;

    public C0197c(C0228f<T> fVar, C0240h hVar, boolean z, int i) {
        super(fVar);
        this.f376b = hVar;
        this.f377c = z;
        this.f378d = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo364b(C0230g<? super T> gVar) {
        if (this.f376b instanceof C0219i) {
            this.f373a.mo362a(gVar);
            return;
        }
        this.f373a.mo362a(new C0198a(gVar, this.f376b.mo346a(), this.f377c, this.f378d));
    }

    /* renamed from: a.b.e.e.a.c$a */
    /* compiled from: ObservableObserveOn */
    static final class C0198a<T> extends C0193a<T> implements C0230g<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;

        /* renamed from: a */
        final C0230g<? super T> f379a;

        /* renamed from: b */
        final C0240h.C0242a f380b;

        /* renamed from: c */
        final boolean f381c;

        /* renamed from: d */
        final int f382d;

        /* renamed from: e */
        C0192d<T> f383e;

        /* renamed from: f */
        C0165b f384f;

        /* renamed from: g */
        Throwable f385g;

        /* renamed from: h */
        volatile boolean f386h;

        /* renamed from: i */
        volatile boolean f387i;

        /* renamed from: j */
        int f388j;

        /* renamed from: k */
        boolean f389k;

        C0198a(C0230g<? super T> gVar, C0240h.C0242a aVar, boolean z, int i) {
            this.f379a = gVar;
            this.f380b = aVar;
            this.f381c = z;
            this.f382d = i;
        }

        public void onSubscribe(C0165b bVar) {
            if (C0184b.m505a(this.f384f, bVar)) {
                this.f384f = bVar;
                if (bVar instanceof C0189a) {
                    C0189a aVar = (C0189a) bVar;
                    int a = aVar.mo377a(7);
                    if (a == 1) {
                        this.f388j = a;
                        this.f383e = aVar;
                        this.f386h = true;
                        this.f379a.onSubscribe(this);
                        mo386e();
                        return;
                    } else if (a == 2) {
                        this.f388j = a;
                        this.f383e = aVar;
                        this.f379a.onSubscribe(this);
                        return;
                    }
                }
                this.f383e = new C0202a(this.f382d);
                this.f379a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            if (!this.f386h) {
                if (this.f388j != 2) {
                    this.f383e.mo378a(t);
                }
                mo386e();
            }
        }

        public void onError(Throwable th) {
            if (this.f386h) {
                C0229a.m632a(th);
                return;
            }
            this.f385g = th;
            this.f386h = true;
            mo386e();
        }

        public void onComplete() {
            if (!this.f386h) {
                this.f386h = true;
                mo386e();
            }
        }

        /* renamed from: a */
        public void mo348a() {
            if (!this.f387i) {
                this.f387i = true;
                this.f384f.mo348a();
                this.f380b.mo348a();
                if (getAndIncrement() == 0) {
                    this.f383e.mo381d();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo386e() {
            if (getAndIncrement() == 0) {
                this.f380b.mo397a((Runnable) this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo387f() {
            C0192d<T> dVar = this.f383e;
            C0230g<? super T> gVar = this.f379a;
            int i = 1;
            while (!mo385a(this.f386h, dVar.mo380c(), gVar)) {
                while (true) {
                    boolean z = this.f386h;
                    try {
                        T b = dVar.mo379b();
                        boolean z2 = b == null;
                        if (!mo385a(z, z2, gVar)) {
                            if (z2) {
                                i = addAndGet(-i);
                                if (i == 0) {
                                    return;
                                }
                            } else {
                                gVar.onNext(b);
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C0176b.m497b(th);
                        this.f384f.mo348a();
                        dVar.mo381d();
                        gVar.onError(th);
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo388g() {
            int i = 1;
            while (!this.f387i) {
                boolean z = this.f386h;
                Throwable th = this.f385g;
                if (this.f381c || !z || th == null) {
                    this.f379a.onNext(null);
                    if (z) {
                        Throwable th2 = this.f385g;
                        if (th2 != null) {
                            this.f379a.onError(th2);
                        } else {
                            this.f379a.onComplete();
                        }
                        this.f380b.mo348a();
                        return;
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    this.f379a.onError(this.f385g);
                    this.f380b.mo348a();
                    return;
                }
            }
        }

        public void run() {
            if (this.f389k) {
                mo388g();
            } else {
                mo387f();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo385a(boolean z, boolean z2, C0230g<? super T> gVar) {
            if (this.f387i) {
                this.f383e.mo381d();
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th = this.f385g;
                if (this.f381c) {
                    if (!z2) {
                        return false;
                    }
                    if (th != null) {
                        gVar.onError(th);
                    } else {
                        gVar.onComplete();
                    }
                    this.f380b.mo348a();
                    return true;
                } else if (th != null) {
                    this.f383e.mo381d();
                    gVar.onError(th);
                    this.f380b.mo348a();
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    gVar.onComplete();
                    this.f380b.mo348a();
                    return true;
                }
            }
        }

        /* renamed from: a */
        public int mo377a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f389k = true;
            return 2;
        }

        /* renamed from: b */
        public T mo379b() {
            return this.f383e.mo379b();
        }

        /* renamed from: d */
        public void mo381d() {
            this.f383e.mo381d();
        }

        /* renamed from: c */
        public boolean mo380c() {
            return this.f383e.mo380c();
        }
    }
}
