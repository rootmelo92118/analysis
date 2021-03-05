package com.google.android.gms.internal.ads;

import java.io.IOException;

final class bfm implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ IOException f4100a;

    /* renamed from: b */
    private final /* synthetic */ bfi f4101b;

    bfm(bfi bfi, IOException iOException) {
        this.f4101b = bfi;
        this.f4100a = iOException;
    }

    public final void run() {
        this.f4101b.f4074e.mo10244a(this.f4100a);
    }
}
