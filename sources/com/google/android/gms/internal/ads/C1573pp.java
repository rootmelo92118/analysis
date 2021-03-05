package com.google.android.gms.internal.ads;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.pp */
final class C1573pp implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private final /* synthetic */ WeakReference f6207a;

    /* renamed from: b */
    private final /* synthetic */ C1565ph f6208b;

    C1573pp(C1565ph phVar, WeakReference weakReference) {
        this.f6208b = phVar;
        this.f6207a = weakReference;
    }

    public final void onGlobalLayout() {
        this.f6208b.m7758a((WeakReference<afl>) this.f6207a, false);
    }
}
