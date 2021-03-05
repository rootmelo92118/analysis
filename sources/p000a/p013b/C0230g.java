package p000a.p013b;

import p000a.p013b.p017b.C0165b;

/* renamed from: a.b.g */
/* compiled from: Observer */
public interface C0230g<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(C0165b bVar);
}
