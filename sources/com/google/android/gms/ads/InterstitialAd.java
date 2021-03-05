package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.internal.ads.bqf;
import com.google.android.gms.internal.ads.btn;

public final class InterstitialAd {
    private final btn zzvy;

    public InterstitialAd(Context context) {
        this.zzvy = new btn(context);
        C0926p.m1307a(context, (Object) "Context cannot be null");
    }

    public final AdListener getAdListener() {
        return this.zzvy.mo12425a();
    }

    public final String getAdUnitId() {
        return this.zzvy.mo12435b();
    }

    public final boolean isLoaded() {
        return this.zzvy.mo12439e();
    }

    public final boolean isLoading() {
        return this.zzvy.mo12440f();
    }

    @RequiresPermission("android.permission.INTERNET")
    public final void loadAd(AdRequest adRequest) {
        this.zzvy.mo12432a(adRequest.zzaz());
    }

    public final void setAdListener(AdListener adListener) {
        this.zzvy.mo12426a(adListener);
        if (adListener != null && (adListener instanceof bqf)) {
            this.zzvy.mo12431a((bqf) adListener);
        } else if (adListener == null) {
            this.zzvy.mo12431a((bqf) null);
        }
    }

    public final void setAdUnitId(String str) {
        this.zzvy.mo12433a(str);
    }

    public final String getMediationAdapterClassName() {
        return this.zzvy.mo12442h();
    }

    public final void show() {
        this.zzvy.mo12443i();
    }

    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        this.zzvy.mo12430a(rewardedVideoAdListener);
    }

    public final void setAdMetadataListener(AdMetadataListener adMetadataListener) {
        this.zzvy.mo12429a(adMetadataListener);
    }

    public final Bundle getAdMetadata() {
        return this.zzvy.mo12441g();
    }

    public final void zza(boolean z) {
        this.zzvy.mo12434a(true);
    }

    public final void setImmersiveMode(boolean z) {
        this.zzvy.mo12436b(z);
    }
}
