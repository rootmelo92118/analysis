package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.z */
final class C2303z implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f8645a;

    /* renamed from: b */
    private final /* synthetic */ long f8646b;

    /* renamed from: c */
    private final /* synthetic */ C2143a f8647c;

    C2303z(C2143a aVar, String str, long j) {
        this.f8647c = aVar;
        this.f8645a = str;
        this.f8646b = j;
    }

    public final void run() {
        this.f8647c.m10393c(this.f8645a, this.f8646b);
    }
}
