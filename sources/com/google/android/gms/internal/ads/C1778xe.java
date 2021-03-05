package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.xe */
final /* synthetic */ class C1778xe implements Runnable {

    /* renamed from: a */
    private final C1777xd f6829a;

    /* renamed from: b */
    private final Context f6830b;

    /* renamed from: c */
    private final String f6831c;

    C1778xe(C1777xd xdVar, Context context, String str) {
        this.f6829a = xdVar;
        this.f6830b = context;
        this.f6831c = str;
    }

    public final void run() {
        this.f6829a.mo13194a(this.f6830b, this.f6831c);
    }
}
