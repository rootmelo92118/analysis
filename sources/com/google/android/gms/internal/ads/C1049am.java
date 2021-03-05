package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.am */
public final class C1049am extends C1027ak {

    /* renamed from: a */
    private final OnCustomRenderedAdLoadedListener f2021a;

    public C1049am(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.f2021a = onCustomRenderedAdLoadedListener;
    }

    /* renamed from: a */
    public final void mo10603a(C1023ag agVar) {
        this.f2021a.onCustomRenderedAdLoaded(new C1022af(agVar));
    }
}
