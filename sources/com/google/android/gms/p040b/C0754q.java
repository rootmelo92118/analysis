package com.google.android.gms.p040b;

import android.support.annotation.NonNull;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.b.q */
final class C0754q<TResult> implements C0760w<TResult> {

    /* renamed from: a */
    private final Executor f735a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f736b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: c */
    public C0737c<TResult> f737c;

    public C0754q(@NonNull Executor executor, @NonNull C0737c<TResult> cVar) {
        this.f735a = executor;
        this.f737c = cVar;
    }

    /* renamed from: a */
    public final void mo9493a(@NonNull C0741g<TResult> gVar) {
        synchronized (this.f736b) {
            if (this.f737c != null) {
                this.f735a.execute(new C0755r(this, gVar));
            }
        }
    }
}
