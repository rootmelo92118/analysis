package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.measurement.internal.dh */
final class C2232dh implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ComponentName f8363a;

    /* renamed from: b */
    private final /* synthetic */ C2230df f8364b;

    C2232dh(C2230df dfVar, ComponentName componentName) {
        this.f8364b = dfVar;
        this.f8363a = componentName;
    }

    public final void run() {
        this.f8364b.f8358a.m10759a(this.f8363a);
    }
}
