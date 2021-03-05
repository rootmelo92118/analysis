package com.google.android.gms.p040b;

import android.support.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.b.k */
final class C0748k<TResult, TContinuationResult> implements C0760w<TResult> {

    /* renamed from: a */
    private final Executor f721a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C0734a<TResult, TContinuationResult> f722b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C0763z<TContinuationResult> f723c;

    public C0748k(@NonNull Executor executor, @NonNull C0734a<TResult, TContinuationResult> aVar, @NonNull C0763z<TContinuationResult> zVar) {
        this.f721a = executor;
        this.f722b = aVar;
        this.f723c = zVar;
    }

    /* renamed from: a */
    public final void mo9493a(@NonNull C0741g<TResult> gVar) {
        this.f721a.execute(new C0749l(this, gVar));
    }
}
