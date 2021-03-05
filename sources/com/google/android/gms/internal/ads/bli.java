package com.google.android.gms.internal.ads;

final class bli implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ int f4659a;

    /* renamed from: b */
    private final /* synthetic */ long f4660b;

    /* renamed from: c */
    private final /* synthetic */ ble f4661c;

    bli(ble ble, int i, long j) {
        this.f4661c = ble;
        this.f4659a = i;
        this.f4660b = j;
    }

    public final void run() {
        this.f4661c.f4650b.mo10232a(this.f4659a, this.f4660b);
    }
}
