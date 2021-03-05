package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.internal.ads.btn;

public final class PublisherInterstitialAd {
    private final btn zzvy;

    public PublisherInterstitialAd(Context context) {
        this.zzvy = new btn(context, this);
        C0926p.m1307a(context, (Object) "Context cannot be null");
    }

    public final AdListener getAdListener() {
        return this.zzvy.mo12425a();
    }

    public final String getAdUnitId() {
        return this.zzvy.mo12435b();
    }

    public final AppEventListener getAppEventListener() {
        return this.zzvy.mo12437c();
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.zzvy.mo12438d();
    }

    public final boolean isLoaded() {
        return this.zzvy.mo12439e();
    }

    public final boolean isLoading() {
        return this.zzvy.mo12440f();
    }

    @RequiresPermission("android.permission.INTERNET")
    public final void loadAd(PublisherAdRequest publisherAdRequest) {
        this.zzvy.mo12432a(publisherAdRequest.zzaz());
    }

    public final void setAdListener(AdListener adListener) {
        this.zzvy.mo12426a(adListener);
    }

    public final void setAdUnitId(String str) {
        this.zzvy.mo12433a(str);
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        this.zzvy.mo12428a(appEventListener);
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.zzvy.setOnCustomRenderedAdLoadedListener(onCustomRenderedAdLoadedListener);
    }

    public final void setCorrelator(Correlator correlator) {
        this.zzvy.mo12427a(correlator);
    }

    public final String getMediationAdapterClassName() {
        return this.zzvy.mo12442h();
    }

    public final void show() {
        this.zzvy.mo12443i();
    }

    public final void setImmersiveMode(boolean z) {
        this.zzvy.mo12436b(z);
    }
}
