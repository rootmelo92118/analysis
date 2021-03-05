package com.google.android.gms.internal.ads;

final class acs implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f1354a;

    /* renamed from: b */
    private final /* synthetic */ zzbdk f1355b;

    acs(zzbdk zzbdk, boolean z) {
        this.f1355b = zzbdk;
        this.f1354a = z;
    }

    public final void run() {
        this.f1355b.m8651a("windowVisibilityChanged", "isVisible", String.valueOf(this.f1354a));
    }
}
