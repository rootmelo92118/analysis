package com.google.android.gms.p040b;

import android.support.annotation.NonNull;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.b.u */
final class C0758u<TResult> implements C0760w<TResult> {

    /* renamed from: a */
    private final Executor f745a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f746b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: c */
    public C0739e<? super TResult> f747c;

    public C0758u(@NonNull Executor executor, @NonNull C0739e<? super TResult> eVar) {
        this.f745a = executor;
        this.f747c = eVar;
    }

    /* renamed from: a */
    public final void mo9493a(@NonNull C0741g<TResult> gVar) {
        if (gVar.mo9481b()) {
            synchronized (this.f746b) {
                if (this.f747c != null) {
                    this.f745a.execute(new C0759v(this, gVar));
                }
            }
        }
    }
}
