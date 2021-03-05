package com.google.android.gms.p040b;

import android.support.annotation.NonNull;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.b.s */
final class C0756s<TResult> implements C0760w<TResult> {

    /* renamed from: a */
    private final Executor f740a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f741b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: c */
    public C0738d f742c;

    public C0756s(@NonNull Executor executor, @NonNull C0738d dVar) {
        this.f740a = executor;
        this.f742c = dVar;
    }

    /* renamed from: a */
    public final void mo9493a(@NonNull C0741g<TResult> gVar) {
        if (!gVar.mo9481b() && !gVar.mo9482c()) {
            synchronized (this.f741b) {
                if (this.f742c != null) {
                    this.f740a.execute(new C0757t(this, gVar));
                }
            }
        }
    }
}
