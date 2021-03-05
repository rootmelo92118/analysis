package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.ek */
public final class C1271ek extends C1248dp {

    /* renamed from: a */
    private final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener f5345a;

    public C1271ek(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener) {
        this.f5345a = onCustomTemplateAdLoadedListener;
    }

    /* renamed from: a */
    public final void mo12503a(C1233da daVar) {
        this.f5345a.onCustomTemplateAdLoaded(C1237de.m6723a(daVar));
    }
}
