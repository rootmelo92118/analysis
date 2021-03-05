package com.google.android.gms.internal.ads;

import android.view.Surface;

final class bll implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Surface f4682a;

    /* renamed from: b */
    private final /* synthetic */ ble f4683b;

    bll(ble ble, Surface surface) {
        this.f4683b = ble;
        this.f4682a = surface;
    }

    public final void run() {
        this.f4683b.f4650b.mo10235a(this.f4682a);
    }
}
