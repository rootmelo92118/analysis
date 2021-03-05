package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* renamed from: com.google.android.gms.measurement.internal.dm */
final /* synthetic */ class C2237dm implements Runnable {

    /* renamed from: a */
    private final C2236dl f8370a;

    /* renamed from: b */
    private final int f8371b;

    /* renamed from: c */
    private final C2295r f8372c;

    /* renamed from: d */
    private final Intent f8373d;

    C2237dm(C2236dl dlVar, int i, C2295r rVar, Intent intent) {
        this.f8370a = dlVar;
        this.f8371b = i;
        this.f8372c = rVar;
        this.f8373d = intent;
    }

    public final void run() {
        this.f8370a.mo14478a(this.f8371b, this.f8372c, this.f8373d);
    }
}
