package com.google.android.gms.internal.ads;

final class bfl implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bfo f4098a;

    /* renamed from: b */
    private final /* synthetic */ bfi f4099b;

    bfl(bfi bfi, bfo bfo) {
        this.f4099b = bfi;
        this.f4098a = bfo;
    }

    public final void run() {
        this.f4098a.mo11844a();
        int size = this.f4099b.f4085p.size();
        for (int i = 0; i < size; i++) {
            ((bfy) this.f4099b.f4085p.valueAt(i)).mo11871b();
        }
    }
}
