package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeAppInstallAd;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.eh */
public final class C1268eh extends C1239dg {

    /* renamed from: a */
    private final NativeAppInstallAd.OnAppInstallAdLoadedListener f5342a;

    public C1268eh(NativeAppInstallAd.OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
        this.f5342a = onAppInstallAdLoadedListener;
    }

    /* renamed from: a */
    public final void mo12500a(C1224cs csVar) {
        this.f5342a.onAppInstallAdLoaded(new C1227cv(csVar));
    }
}
