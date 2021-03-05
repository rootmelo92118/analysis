package com.google.android.gms.internal.ads;

final class ack implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzbcx f1347a;

    ack(zzbcx zzbcx) {
        this.f1347a = zzbcx;
    }

    public final void run() {
        if (this.f1347a.f7155r != null) {
            this.f1347a.f7155r.mo10121c();
        }
    }
}
