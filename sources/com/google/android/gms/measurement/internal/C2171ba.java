package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.ba */
final class C2171ba implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f8167a;

    /* renamed from: b */
    private final /* synthetic */ long f8168b;

    /* renamed from: c */
    private final /* synthetic */ C2143a f8169c;

    C2171ba(C2143a aVar, String str, long j) {
        this.f8169c = aVar;
        this.f8167a = str;
        this.f8168b = j;
    }

    public final void run() {
        this.f8169c.m10394d(this.f8167a, this.f8168b);
    }
}
