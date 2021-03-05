package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* renamed from: com.google.android.gms.internal.ads.eo */
public final class C1275eo extends C1257dy {

    /* renamed from: a */
    private final UnifiedNativeAd.UnconfirmedClickListener f5351a;

    public C1275eo(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.f5351a = unconfirmedClickListener;
    }

    /* renamed from: a */
    public final void mo12507a(String str) {
        this.f5351a.onUnconfirmedClickReceived(str);
    }

    /* renamed from: a */
    public final void mo12506a() {
        this.f5351a.onUnconfirmedClickCancelled();
    }
}
