package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeContentAd;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.ei */
public final class C1269ei extends C1242dj {

    /* renamed from: a */
    private final NativeContentAd.OnContentAdLoadedListener f5343a;

    public C1269ei(NativeContentAd.OnContentAdLoadedListener onContentAdLoadedListener) {
        this.f5343a = onContentAdLoadedListener;
    }

    /* renamed from: a */
    public final void mo12501a(C1228cw cwVar) {
        this.f5343a.onContentAdLoaded(new C1231cz(cwVar));
    }
}
