package com.google.android.gms.internal.ads;

final class blm implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bbv f4684a;

    /* renamed from: b */
    private final /* synthetic */ ble f4685b;

    blm(ble ble, bbv bbv) {
        this.f4685b = ble;
        this.f4684a = bbv;
    }

    public final void run() {
        this.f4684a.mo11653a();
        this.f4685b.f4650b.mo10252b(this.f4684a);
    }
}
