package com.google.android.gms.p040b;

import android.support.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.b.m */
final class C0750m<TResult, TContinuationResult> implements C0736b, C0738d, C0739e<TContinuationResult>, C0760w<TResult> {

    /* renamed from: a */
    private final Executor f726a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C0734a<TResult, C0741g<TContinuationResult>> f727b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C0763z<TContinuationResult> f728c;

    public C0750m(@NonNull Executor executor, @NonNull C0734a<TResult, C0741g<TContinuationResult>> aVar, @NonNull C0763z<TContinuationResult> zVar) {
        this.f726a = executor;
        this.f727b = aVar;
        this.f728c = zVar;
    }

    /* renamed from: a */
    public final void mo9493a(@NonNull C0741g<TResult> gVar) {
        this.f726a.execute(new C0751n(this, gVar));
    }

    /* renamed from: a */
    public final void mo9472a(TContinuationResult tcontinuationresult) {
        this.f728c.mo9504a(tcontinuationresult);
    }

    /* renamed from: a */
    public final void mo9471a(@NonNull Exception exc) {
        this.f728c.mo9503a(exc);
    }

    /* renamed from: a */
    public final void mo9469a() {
        this.f728c.mo9507f();
    }
}
