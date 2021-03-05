package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.aai;

@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    private CustomEventBanner zzfce;
    private CustomEventInterstitial zzfcf;
    private CustomEventNative zzfcg;
    private View zzim;

    private static <T> T zzi(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            aai.m1630e(sb.toString());
            return null;
        }
    }

    static final class zza implements CustomEventBannerListener {
        private final CustomEventAdapter zzfch;
        private final MediationBannerListener zzie;

        public zza(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
            this.zzfch = customEventAdapter;
            this.zzie = mediationBannerListener;
        }

        public final void onAdLoaded(View view) {
            aai.m1624b("Custom event adapter called onAdLoaded.");
            this.zzfch.zza(view);
            this.zzie.onAdLoaded(this.zzfch);
        }

        public final void onAdFailedToLoad(int i) {
            aai.m1624b("Custom event adapter called onAdFailedToLoad.");
            this.zzie.onAdFailedToLoad(this.zzfch, i);
        }

        public final void onAdClicked() {
            aai.m1624b("Custom event adapter called onAdClicked.");
            this.zzie.onAdClicked(this.zzfch);
        }

        public final void onAdOpened() {
            aai.m1624b("Custom event adapter called onAdOpened.");
            this.zzie.onAdOpened(this.zzfch);
        }

        public final void onAdClosed() {
            aai.m1624b("Custom event adapter called onAdClosed.");
            this.zzie.onAdClosed(this.zzfch);
        }

        public final void onAdLeftApplication() {
            aai.m1624b("Custom event adapter called onAdLeftApplication.");
            this.zzie.onAdLeftApplication(this.zzfch);
        }
    }

    class zzb implements CustomEventInterstitialListener {
        private final CustomEventAdapter zzfch;
        private final MediationInterstitialListener zzif;

        public zzb(CustomEventAdapter customEventAdapter, MediationInterstitialListener mediationInterstitialListener) {
            this.zzfch = customEventAdapter;
            this.zzif = mediationInterstitialListener;
        }

        public final void onAdLoaded() {
            aai.m1624b("Custom event adapter called onReceivedAd.");
            this.zzif.onAdLoaded(CustomEventAdapter.this);
        }

        public final void onAdFailedToLoad(int i) {
            aai.m1624b("Custom event adapter called onFailedToReceiveAd.");
            this.zzif.onAdFailedToLoad(this.zzfch, i);
        }

        public final void onAdClicked() {
            aai.m1624b("Custom event adapter called onAdClicked.");
            this.zzif.onAdClicked(this.zzfch);
        }

        public final void onAdOpened() {
            aai.m1624b("Custom event adapter called onAdOpened.");
            this.zzif.onAdOpened(this.zzfch);
        }

        public final void onAdClosed() {
            aai.m1624b("Custom event adapter called onAdClosed.");
            this.zzif.onAdClosed(this.zzfch);
        }

        public final void onAdLeftApplication() {
            aai.m1624b("Custom event adapter called onAdLeftApplication.");
            this.zzif.onAdLeftApplication(this.zzfch);
        }
    }

    static class zzc implements CustomEventNativeListener {
        private final CustomEventAdapter zzfch;
        private final MediationNativeListener zzig;

        public zzc(CustomEventAdapter customEventAdapter, MediationNativeListener mediationNativeListener) {
            this.zzfch = customEventAdapter;
            this.zzig = mediationNativeListener;
        }

        public final void onAdLoaded(NativeAdMapper nativeAdMapper) {
            aai.m1624b("Custom event adapter called onAdLoaded.");
            this.zzig.onAdLoaded((MediationNativeAdapter) this.zzfch, nativeAdMapper);
        }

        public final void onAdLoaded(UnifiedNativeAdMapper unifiedNativeAdMapper) {
            aai.m1624b("Custom event adapter called onAdLoaded.");
            this.zzig.onAdLoaded((MediationNativeAdapter) this.zzfch, unifiedNativeAdMapper);
        }

        public final void onAdFailedToLoad(int i) {
            aai.m1624b("Custom event adapter called onAdFailedToLoad.");
            this.zzig.onAdFailedToLoad(this.zzfch, i);
        }

        public final void onAdOpened() {
            aai.m1624b("Custom event adapter called onAdOpened.");
            this.zzig.onAdOpened(this.zzfch);
        }

        public final void onAdClicked() {
            aai.m1624b("Custom event adapter called onAdClicked.");
            this.zzig.onAdClicked(this.zzfch);
        }

        public final void onAdClosed() {
            aai.m1624b("Custom event adapter called onAdClosed.");
            this.zzig.onAdClosed(this.zzfch);
        }

        public final void onAdLeftApplication() {
            aai.m1624b("Custom event adapter called onAdLeftApplication.");
            this.zzig.onAdLeftApplication(this.zzfch);
        }

        public final void onAdImpression() {
            aai.m1624b("Custom event adapter called onAdImpression.");
            this.zzig.onAdImpression(this.zzfch);
        }
    }

    public final void onDestroy() {
        if (this.zzfce != null) {
            this.zzfce.onDestroy();
        }
        if (this.zzfcf != null) {
            this.zzfcf.onDestroy();
        }
        if (this.zzfcg != null) {
            this.zzfcg.onDestroy();
        }
    }

    public final void onPause() {
        if (this.zzfce != null) {
            this.zzfce.onPause();
        }
        if (this.zzfcf != null) {
            this.zzfcf.onPause();
        }
        if (this.zzfcg != null) {
            this.zzfcg.onPause();
        }
    }

    public final void onResume() {
        if (this.zzfce != null) {
            this.zzfce.onResume();
        }
        if (this.zzfcf != null) {
            this.zzfcf.onResume();
        }
        if (this.zzfcg != null) {
            this.zzfcg.onResume();
        }
    }

    public final View getBannerView() {
        return this.zzim;
    }

    public final void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        Bundle bundle3;
        this.zzfce = (CustomEventBanner) zzi(bundle.getString("class_name"));
        if (this.zzfce == null) {
            mediationBannerListener.onAdFailedToLoad(this, 0);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString("class_name"));
        }
        this.zzfce.requestBannerAd(context, new zza(this, mediationBannerListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), adSize, mediationAdRequest, bundle3);
    }

    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        Bundle bundle3;
        this.zzfcf = (CustomEventInterstitial) zzi(bundle.getString("class_name"));
        if (this.zzfcf == null) {
            mediationInterstitialListener.onAdFailedToLoad(this, 0);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString("class_name"));
        }
        this.zzfcf.requestInterstitialAd(context, new zzb(this, mediationInterstitialListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), mediationAdRequest, bundle3);
    }

    public final void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        Bundle bundle3;
        this.zzfcg = (CustomEventNative) zzi(bundle.getString("class_name"));
        if (this.zzfcg == null) {
            mediationNativeListener.onAdFailedToLoad(this, 0);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString("class_name"));
        }
        this.zzfcg.requestNativeAd(context, new zzc(this, mediationNativeListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), nativeMediationAdRequest, bundle3);
    }

    public final void showInterstitial() {
        this.zzfcf.showInterstitial();
    }

    /* access modifiers changed from: private */
    public final void zza(View view) {
        this.zzim = view;
    }
}
