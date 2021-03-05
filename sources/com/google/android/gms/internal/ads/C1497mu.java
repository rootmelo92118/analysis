package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzn;

/* renamed from: com.google.android.gms.internal.ads.mu */
final class C1497mu implements zzn {

    /* renamed from: a */
    private final /* synthetic */ zzanu f5728a;

    C1497mu(zzanu zzanu) {
        this.f5728a = zzanu;
    }

    public final void zziv() {
        aai.m1624b("AdMobCustomTabsAdapter overlay is closed.");
        this.f5728a.f6995b.onAdClosed(this.f5728a);
    }

    public final void onPause() {
        aai.m1624b("AdMobCustomTabsAdapter overlay is paused.");
    }

    public final void onResume() {
        aai.m1624b("AdMobCustomTabsAdapter overlay is resumed.");
    }

    public final void zziw() {
        aai.m1624b("Opening AdMobCustomTabsAdapter overlay.");
        this.f5728a.f6995b.onAdOpened(this.f5728a);
    }
}
