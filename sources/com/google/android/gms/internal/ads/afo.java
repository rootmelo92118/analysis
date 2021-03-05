package com.google.android.gms.internal.ads;

import android.view.View;

final class afo implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ View f1619a;

    /* renamed from: b */
    private final /* synthetic */ C1736vq f1620b;

    /* renamed from: c */
    private final /* synthetic */ int f1621c;

    /* renamed from: d */
    private final /* synthetic */ afm f1622d;

    afo(afm afm, View view, C1736vq vqVar, int i) {
        this.f1622d = afm;
        this.f1619a = view;
        this.f1620b = vqVar;
        this.f1621c = i;
    }

    public final void run() {
        this.f1622d.m1978a(this.f1619a, this.f1620b, this.f1621c - 1);
    }
}
