package com.google.android.gms.internal.ads;

import android.view.View;

final class afp implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    private final /* synthetic */ C1736vq f1623a;

    /* renamed from: b */
    private final /* synthetic */ afm f1624b;

    afp(afm afm, C1736vq vqVar) {
        this.f1624b = afm;
        this.f1623a = vqVar;
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        this.f1624b.m1978a(view, this.f1623a, 10);
    }
}
