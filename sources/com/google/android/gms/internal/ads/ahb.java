package com.google.android.gms.internal.ads;

import android.view.View;

final class ahb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ View f1760a;

    /* renamed from: b */
    private final /* synthetic */ C1736vq f1761b;

    /* renamed from: c */
    private final /* synthetic */ int f1762c;

    /* renamed from: d */
    private final /* synthetic */ agz f1763d;

    ahb(agz agz, View view, C1736vq vqVar, int i) {
        this.f1763d = agz;
        this.f1760a = view;
        this.f1761b = vqVar;
        this.f1762c = i;
    }

    public final void run() {
        this.f1763d.m2178a(this.f1760a, this.f1761b, this.f1762c - 1);
    }
}
