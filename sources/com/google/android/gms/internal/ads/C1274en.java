package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.en */
public final class C1274en extends C1254dv {

    /* renamed from: a */
    private final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener f5350a;

    public C1274en(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.f5350a = onUnifiedNativeAdLoadedListener;
    }

    /* renamed from: a */
    public final void mo12505a(C1260ea eaVar) {
        this.f5350a.onUnifiedNativeAdLoaded(new C1263ed(eaVar));
    }
}
