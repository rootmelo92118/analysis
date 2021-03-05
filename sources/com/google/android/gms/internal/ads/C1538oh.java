package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.oh */
final class C1538oh implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C1537og f5812a;

    C1538oh(C1537og ogVar) {
        this.f5812a = ogVar;
    }

    public final void run() {
        if (this.f5812a.f5811h.get()) {
            C1772wz.m1626c("Timed out waiting for WebView to finish loading.");
            this.f5812a.cancel();
        }
    }
}
