package com.google.android.gms.p040b;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.b.g */
public abstract class C0741g<TResult> {
    @NonNull
    /* renamed from: a */
    public abstract C0741g<TResult> mo9476a(@NonNull Executor executor, @NonNull C0738d dVar);

    @NonNull
    /* renamed from: a */
    public abstract C0741g<TResult> mo9477a(@NonNull Executor executor, @NonNull C0739e<? super TResult> eVar);

    @Nullable
    /* renamed from: a */
    public abstract <X extends Throwable> TResult mo9478a(@NonNull Class<X> cls);

    /* renamed from: a */
    public abstract boolean mo9479a();

    /* renamed from: b */
    public abstract boolean mo9481b();

    /* renamed from: c */
    public abstract boolean mo9482c();

    @Nullable
    /* renamed from: d */
    public abstract TResult mo9483d();

    @Nullable
    /* renamed from: e */
    public abstract Exception mo9484e();

    @NonNull
    /* renamed from: a */
    public C0741g<TResult> mo9475a(@NonNull Executor executor, @NonNull C0737c<TResult> cVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    /* renamed from: a */
    public C0741g<TResult> mo9474a(@NonNull Executor executor, @NonNull C0736b bVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    @NonNull
    /* renamed from: a */
    public <TContinuationResult> C0741g<TContinuationResult> mo9473a(@NonNull Executor executor, @NonNull C0734a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    /* renamed from: b */
    public <TContinuationResult> C0741g<TContinuationResult> mo9480b(@NonNull Executor executor, @NonNull C0734a<TResult, C0741g<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }
}
