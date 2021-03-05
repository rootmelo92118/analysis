package com.google.android.gms.p040b;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C0926p;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.b.z */
final class C0763z<TResult> extends C0741g<TResult> {

    /* renamed from: a */
    private final Object f753a = new Object();

    /* renamed from: b */
    private final C0761x<TResult> f754b = new C0761x<>();
    @GuardedBy("mLock")

    /* renamed from: c */
    private boolean f755c;

    /* renamed from: d */
    private volatile boolean f756d;
    @GuardedBy("mLock")

    /* renamed from: e */
    private TResult f757e;
    @GuardedBy("mLock")

    /* renamed from: f */
    private Exception f758f;

    C0763z() {
    }

    /* renamed from: a */
    public final boolean mo9479a() {
        boolean z;
        synchronized (this.f753a) {
            z = this.f755c;
        }
        return z;
    }

    /* renamed from: c */
    public final boolean mo9482c() {
        return this.f756d;
    }

    /* renamed from: b */
    public final boolean mo9481b() {
        boolean z;
        synchronized (this.f753a) {
            z = this.f755c && !this.f756d && this.f758f == null;
        }
        return z;
    }

    /* renamed from: d */
    public final TResult mo9483d() {
        TResult tresult;
        synchronized (this.f753a) {
            m862g();
            m864i();
            if (this.f758f == null) {
                tresult = this.f757e;
            } else {
                throw new C0740f(this.f758f);
            }
        }
        return tresult;
    }

    /* renamed from: a */
    public final <X extends Throwable> TResult mo9478a(@NonNull Class<X> cls) {
        TResult tresult;
        synchronized (this.f753a) {
            m862g();
            m864i();
            if (cls.isInstance(this.f758f)) {
                throw ((Throwable) cls.cast(this.f758f));
            } else if (this.f758f == null) {
                tresult = this.f757e;
            } else {
                throw new C0740f(this.f758f);
            }
        }
        return tresult;
    }

    @Nullable
    /* renamed from: e */
    public final Exception mo9484e() {
        Exception exc;
        synchronized (this.f753a) {
            exc = this.f758f;
        }
        return exc;
    }

    @NonNull
    /* renamed from: a */
    public final C0741g<TResult> mo9477a(@NonNull Executor executor, @NonNull C0739e<? super TResult> eVar) {
        this.f754b.mo9501a(new C0758u(executor, eVar));
        m865j();
        return this;
    }

    @NonNull
    /* renamed from: a */
    public final C0741g<TResult> mo9476a(@NonNull Executor executor, @NonNull C0738d dVar) {
        this.f754b.mo9501a(new C0756s(executor, dVar));
        m865j();
        return this;
    }

    @NonNull
    /* renamed from: a */
    public final C0741g<TResult> mo9475a(@NonNull Executor executor, @NonNull C0737c<TResult> cVar) {
        this.f754b.mo9501a(new C0754q(executor, cVar));
        m865j();
        return this;
    }

    @NonNull
    /* renamed from: a */
    public final <TContinuationResult> C0741g<TContinuationResult> mo9473a(@NonNull Executor executor, @NonNull C0734a<TResult, TContinuationResult> aVar) {
        C0763z zVar = new C0763z();
        this.f754b.mo9501a(new C0748k(executor, aVar, zVar));
        m865j();
        return zVar;
    }

    @NonNull
    /* renamed from: a */
    public final C0741g<TResult> mo9474a(@NonNull Executor executor, @NonNull C0736b bVar) {
        this.f754b.mo9501a(new C0752o(executor, bVar));
        m865j();
        return this;
    }

    @NonNull
    /* renamed from: b */
    public final <TContinuationResult> C0741g<TContinuationResult> mo9480b(@NonNull Executor executor, @NonNull C0734a<TResult, C0741g<TContinuationResult>> aVar) {
        C0763z zVar = new C0763z();
        this.f754b.mo9501a(new C0750m(executor, aVar, zVar));
        m865j();
        return zVar;
    }

    /* renamed from: a */
    public final void mo9504a(TResult tresult) {
        synchronized (this.f753a) {
            m863h();
            this.f755c = true;
            this.f757e = tresult;
        }
        this.f754b.mo9500a(this);
    }

    /* renamed from: b */
    public final boolean mo9506b(TResult tresult) {
        synchronized (this.f753a) {
            if (this.f755c) {
                return false;
            }
            this.f755c = true;
            this.f757e = tresult;
            this.f754b.mo9500a(this);
            return true;
        }
    }

    /* renamed from: a */
    public final void mo9503a(@NonNull Exception exc) {
        C0926p.m1307a(exc, (Object) "Exception must not be null");
        synchronized (this.f753a) {
            m863h();
            this.f755c = true;
            this.f758f = exc;
        }
        this.f754b.mo9500a(this);
    }

    /* renamed from: b */
    public final boolean mo9505b(@NonNull Exception exc) {
        C0926p.m1307a(exc, (Object) "Exception must not be null");
        synchronized (this.f753a) {
            if (this.f755c) {
                return false;
            }
            this.f755c = true;
            this.f758f = exc;
            this.f754b.mo9500a(this);
            return true;
        }
    }

    /* renamed from: f */
    public final boolean mo9507f() {
        synchronized (this.f753a) {
            if (this.f755c) {
                return false;
            }
            this.f755c = true;
            this.f756d = true;
            this.f754b.mo9500a(this);
            return true;
        }
    }

    @GuardedBy("mLock")
    /* renamed from: g */
    private final void m862g() {
        C0926p.m1313a(this.f755c, (Object) "Task is not yet complete");
    }

    @GuardedBy("mLock")
    /* renamed from: h */
    private final void m863h() {
        C0926p.m1313a(!this.f755c, (Object) "Task is already complete");
    }

    @GuardedBy("mLock")
    /* renamed from: i */
    private final void m864i() {
        if (this.f756d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: j */
    private final void m865j() {
        synchronized (this.f753a) {
            if (this.f755c) {
                this.f754b.mo9500a(this);
            }
        }
    }
}
