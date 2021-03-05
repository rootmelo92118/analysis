package com.google.android.gms.internal.ads;

import android.view.View;

final class ahc implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    private final /* synthetic */ C1736vq f1764a;

    /* renamed from: b */
    private final /* synthetic */ agz f1765b;

    ahc(agz agz, C1736vq vqVar) {
        this.f1765b = agz;
        this.f1764a = vqVar;
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        this.f1765b.m2178a(view, this.f1764a, 10);
    }
}
