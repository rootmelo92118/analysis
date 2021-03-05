package com.google.android.gms.internal.ads;

final class blk implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ int f4677a;

    /* renamed from: b */
    private final /* synthetic */ int f4678b;

    /* renamed from: c */
    private final /* synthetic */ int f4679c;

    /* renamed from: d */
    private final /* synthetic */ float f4680d;

    /* renamed from: e */
    private final /* synthetic */ ble f4681e;

    blk(ble ble, int i, int i2, int i3, float f) {
        this.f4681e = ble;
        this.f4677a = i;
        this.f4678b = i2;
        this.f4679c = i3;
        this.f4680d = f;
    }

    public final void run() {
        this.f4681e.f4650b.mo10231a(this.f4677a, this.f4678b, this.f4679c, this.f4680d);
    }
}
