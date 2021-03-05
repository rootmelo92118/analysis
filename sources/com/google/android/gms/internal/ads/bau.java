package com.google.android.gms.internal.ads;

final class bau implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f3309a;

    /* renamed from: b */
    private final /* synthetic */ long f3310b;

    /* renamed from: c */
    private final /* synthetic */ long f3311c;

    /* renamed from: d */
    private final /* synthetic */ bas f3312d;

    bau(bas bas, String str, long j, long j2) {
        this.f3312d = bas;
        this.f3309a = str;
        this.f3310b = j;
        this.f3311c = j2;
    }

    public final void run() {
        this.f3312d.f3306b.mo11552a(this.f3309a, this.f3310b, this.f3311c);
    }
}
