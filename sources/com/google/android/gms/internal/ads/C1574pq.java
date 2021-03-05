package com.google.android.gms.internal.ads;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.pq */
final class C1574pq implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a */
    private final /* synthetic */ WeakReference f6209a;

    /* renamed from: b */
    private final /* synthetic */ C1565ph f6210b;

    C1574pq(C1565ph phVar, WeakReference weakReference) {
        this.f6210b = phVar;
        this.f6209a = weakReference;
    }

    public final void onScrollChanged() {
        this.f6210b.m7758a((WeakReference<afl>) this.f6209a, true);
    }
}
