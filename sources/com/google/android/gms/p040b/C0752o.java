package com.google.android.gms.p040b;

import android.support.annotation.NonNull;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.b.o */
final class C0752o<TResult> implements C0760w<TResult> {

    /* renamed from: a */
    private final Executor f731a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f732b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: c */
    public C0736b f733c;

    public C0752o(@NonNull Executor executor, @NonNull C0736b bVar) {
        this.f731a = executor;
        this.f733c = bVar;
    }

    /* renamed from: a */
    public final void mo9493a(@NonNull C0741g gVar) {
        if (gVar.mo9482c()) {
            synchronized (this.f732b) {
                if (this.f733c != null) {
                    this.f731a.execute(new C0753p(this));
                }
            }
        }
    }
}
