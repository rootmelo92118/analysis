package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.formats.NativeAdViewHolder;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.zzb;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1851zx;
import com.google.android.gms.internal.ads.aai;
import com.google.android.gms.internal.ads.bqf;
import com.google.android.gms.internal.ads.bre;
import com.google.android.gms.internal.ads.btb;
import com.google.android.gms.internal.ads.zzbiy;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@C1598qn
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationNativeAdapter, OnImmersiveModeUpdatedListener, zzb, MediationRewardedVideoAdAdapter, zzbiy {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private AdView zzhs;
    private InterstitialAd zzht;
    private AdLoader zzhu;
    private Context zzhv;
    /* access modifiers changed from: private */
    public InterstitialAd zzhw;
    /* access modifiers changed from: private */
    public MediationRewardedVideoAdListener zzhx;
    private final RewardedVideoAdListener zzhy = new C0717g(this);

    /* access modifiers changed from: protected */
    public abstract Bundle zza(Bundle bundle, Bundle bundle2);

    private final AdRequest zza(Context context, MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        AdRequest.Builder builder = new AdRequest.Builder();
        Date birthday = mediationAdRequest.getBirthday();
        if (birthday != null) {
            builder.setBirthday(birthday);
        }
        int gender = mediationAdRequest.getGender();
        if (gender != 0) {
            builder.setGender(gender);
        }
        Set<String> keywords = mediationAdRequest.getKeywords();
        if (keywords != null) {
            for (String addKeyword : keywords) {
                builder.addKeyword(addKeyword);
            }
        }
        Location location = mediationAdRequest.getLocation();
        if (location != null) {
            builder.setLocation(location);
        }
        if (mediationAdRequest.isTesting()) {
            bre.m6317a();
            builder.addTestDevice(C1851zx.m8584a(context));
        }
        if (mediationAdRequest.taggedForChildDirectedTreatment() != -1) {
            boolean z = true;
            if (mediationAdRequest.taggedForChildDirectedTreatment() != 1) {
                z = false;
            }
            builder.tagForChildDirectedTreatment(z);
        }
        builder.setIsDesignedForFamilies(mediationAdRequest.isDesignedForFamilies());
        builder.addNetworkExtrasBundle(AdMobAdapter.class, zza(bundle, bundle2));
        return builder.build();
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$d */
    static final class C0700d extends AdListener implements AppEventListener, bqf {

        /* renamed from: a */
        private final AbstractAdViewAdapter f631a;

        /* renamed from: b */
        private final MediationBannerListener f632b;

        public C0700d(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
            this.f631a = abstractAdViewAdapter;
            this.f632b = mediationBannerListener;
        }

        public final void onAdLoaded() {
            this.f632b.onAdLoaded(this.f631a);
        }

        public final void onAdFailedToLoad(int i) {
            this.f632b.onAdFailedToLoad(this.f631a, i);
        }

        public final void onAdOpened() {
            this.f632b.onAdOpened(this.f631a);
        }

        public final void onAdClosed() {
            this.f632b.onAdClosed(this.f631a);
        }

        public final void onAdLeftApplication() {
            this.f632b.onAdLeftApplication(this.f631a);
        }

        public final void onAdClicked() {
            this.f632b.onAdClicked(this.f631a);
        }

        public final void onAppEvent(String str, String str2) {
            this.f632b.zza(this.f631a, str, str2);
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$e */
    static final class C0701e extends AdListener implements bqf {

        /* renamed from: a */
        private final AbstractAdViewAdapter f633a;

        /* renamed from: b */
        private final MediationInterstitialListener f634b;

        public C0701e(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
            this.f633a = abstractAdViewAdapter;
            this.f634b = mediationInterstitialListener;
        }

        public final void onAdLoaded() {
            this.f634b.onAdLoaded(this.f633a);
        }

        public final void onAdFailedToLoad(int i) {
            this.f634b.onAdFailedToLoad(this.f633a, i);
        }

        public final void onAdOpened() {
            this.f634b.onAdOpened(this.f633a);
        }

        public final void onAdClosed() {
            this.f634b.onAdClosed(this.f633a);
        }

        public final void onAdLeftApplication() {
            this.f634b.onAdLeftApplication(this.f633a);
        }

        public final void onAdClicked() {
            this.f634b.onAdClicked(this.f633a);
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$f */
    static final class C0702f extends AdListener implements NativeAppInstallAd.OnAppInstallAdLoadedListener, NativeContentAd.OnContentAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener, UnifiedNativeAd.OnUnifiedNativeAdLoadedListener {

        /* renamed from: a */
        private final AbstractAdViewAdapter f635a;

        /* renamed from: b */
        private final MediationNativeListener f636b;

        public C0702f(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
            this.f635a = abstractAdViewAdapter;
            this.f636b = mediationNativeListener;
        }

        public final void onAdLoaded() {
        }

        public final void onAdFailedToLoad(int i) {
            this.f636b.onAdFailedToLoad(this.f635a, i);
        }

        public final void onAdOpened() {
            this.f636b.onAdOpened(this.f635a);
        }

        public final void onAdClosed() {
            this.f636b.onAdClosed(this.f635a);
        }

        public final void onAdLeftApplication() {
            this.f636b.onAdLeftApplication(this.f635a);
        }

        public final void onAdClicked() {
            this.f636b.onAdClicked(this.f635a);
        }

        public final void onAdImpression() {
            this.f636b.onAdImpression(this.f635a);
        }

        public final void onAppInstallAdLoaded(NativeAppInstallAd nativeAppInstallAd) {
            this.f636b.onAdLoaded((MediationNativeAdapter) this.f635a, (NativeAdMapper) new C0697a(nativeAppInstallAd));
        }

        public final void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiedNativeAd) {
            this.f636b.onAdLoaded((MediationNativeAdapter) this.f635a, (UnifiedNativeAdMapper) new C0699c(unifiedNativeAd));
        }

        public final void onContentAdLoaded(NativeContentAd nativeContentAd) {
            this.f636b.onAdLoaded((MediationNativeAdapter) this.f635a, (NativeAdMapper) new C0698b(nativeContentAd));
        }

        public final void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativeCustomTemplateAd) {
            this.f636b.zza(this.f635a, nativeCustomTemplateAd);
        }

        public final void onCustomClick(NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
            this.f636b.zza(this.f635a, nativeCustomTemplateAd, str);
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$b */
    static class C0698b extends NativeContentAdMapper {

        /* renamed from: a */
        private final NativeContentAd f629a;

        public C0698b(NativeContentAd nativeContentAd) {
            this.f629a = nativeContentAd;
            setHeadline(nativeContentAd.getHeadline().toString());
            setImages(nativeContentAd.getImages());
            setBody(nativeContentAd.getBody().toString());
            if (nativeContentAd.getLogo() != null) {
                setLogo(nativeContentAd.getLogo());
            }
            setCallToAction(nativeContentAd.getCallToAction().toString());
            setAdvertiser(nativeContentAd.getAdvertiser().toString());
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(nativeContentAd.getVideoController());
        }

        public final void trackView(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.f629a);
            }
            NativeAdViewHolder nativeAdViewHolder = NativeAdViewHolder.zzblg.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd((NativeAd) this.f629a);
            }
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$c */
    static class C0699c extends UnifiedNativeAdMapper {

        /* renamed from: a */
        private final UnifiedNativeAd f630a;

        public C0699c(UnifiedNativeAd unifiedNativeAd) {
            this.f630a = unifiedNativeAd;
            setHeadline(unifiedNativeAd.getHeadline());
            setImages(unifiedNativeAd.getImages());
            setBody(unifiedNativeAd.getBody());
            setIcon(unifiedNativeAd.getIcon());
            setCallToAction(unifiedNativeAd.getCallToAction());
            setAdvertiser(unifiedNativeAd.getAdvertiser());
            setStarRating(unifiedNativeAd.getStarRating());
            setStore(unifiedNativeAd.getStore());
            setPrice(unifiedNativeAd.getPrice());
            zzp(unifiedNativeAd.zzic());
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(unifiedNativeAd.getVideoController());
        }

        public final void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
            if (view instanceof UnifiedNativeAdView) {
                ((UnifiedNativeAdView) view).setNativeAd(this.f630a);
                return;
            }
            NativeAdViewHolder nativeAdViewHolder = NativeAdViewHolder.zzblg.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd(this.f630a);
            }
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$a */
    static class C0697a extends NativeAppInstallAdMapper {

        /* renamed from: a */
        private final NativeAppInstallAd f628a;

        public C0697a(NativeAppInstallAd nativeAppInstallAd) {
            this.f628a = nativeAppInstallAd;
            setHeadline(nativeAppInstallAd.getHeadline().toString());
            setImages(nativeAppInstallAd.getImages());
            setBody(nativeAppInstallAd.getBody().toString());
            setIcon(nativeAppInstallAd.getIcon());
            setCallToAction(nativeAppInstallAd.getCallToAction().toString());
            if (nativeAppInstallAd.getStarRating() != null) {
                setStarRating(nativeAppInstallAd.getStarRating().doubleValue());
            }
            if (nativeAppInstallAd.getStore() != null) {
                setStore(nativeAppInstallAd.getStore().toString());
            }
            if (nativeAppInstallAd.getPrice() != null) {
                setPrice(nativeAppInstallAd.getPrice().toString());
            }
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(nativeAppInstallAd.getVideoController());
        }

        public final void trackView(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.f628a);
            }
            NativeAdViewHolder nativeAdViewHolder = NativeAdViewHolder.zzblg.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd((NativeAd) this.f628a);
            }
        }
    }

    public void onDestroy() {
        if (this.zzhs != null) {
            this.zzhs.destroy();
            this.zzhs = null;
        }
        if (this.zzht != null) {
            this.zzht = null;
        }
        if (this.zzhu != null) {
            this.zzhu = null;
        }
        if (this.zzhw != null) {
            this.zzhw = null;
        }
    }

    public void onPause() {
        if (this.zzhs != null) {
            this.zzhs.pause();
        }
    }

    public void onResume() {
        if (this.zzhs != null) {
            this.zzhs.resume();
        }
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.zzhs = new AdView(context);
        this.zzhs.setAdSize(new AdSize(adSize.getWidth(), adSize.getHeight()));
        this.zzhs.setAdUnitId(getAdUnitId(bundle));
        this.zzhs.setAdListener(new C0700d(this, mediationBannerListener));
        this.zzhs.loadAd(zza(context, mediationAdRequest, bundle2, bundle));
    }

    public View getBannerView() {
        return this.zzhs;
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.zzht = new InterstitialAd(context);
        this.zzht.setAdUnitId(getAdUnitId(bundle));
        this.zzht.setAdListener(new C0701e(this, mediationInterstitialListener));
        this.zzht.loadAd(zza(context, mediationAdRequest, bundle2, bundle));
    }

    public void onImmersiveModeUpdated(boolean z) {
        if (this.zzht != null) {
            this.zzht.setImmersiveMode(z);
        }
        if (this.zzhw != null) {
            this.zzhw.setImmersiveMode(z);
        }
    }

    public btb getVideoController() {
        VideoController videoController;
        if (this.zzhs == null || (videoController = this.zzhs.getVideoController()) == null) {
            return null;
        }
        return videoController.zzbc();
    }

    public void showInterstitial() {
        this.zzht.show();
    }

    public Bundle getInterstitialAdapterInfo() {
        return new MediationAdapter.zza().zzdi(1).zzafg();
    }

    public void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        C0702f fVar = new C0702f(this, mediationNativeListener);
        AdLoader.Builder withAdListener = new AdLoader.Builder(context, bundle.getString(AD_UNIT_ID_PARAMETER)).withAdListener(fVar);
        NativeAdOptions nativeAdOptions = nativeMediationAdRequest.getNativeAdOptions();
        if (nativeAdOptions != null) {
            withAdListener.withNativeAdOptions(nativeAdOptions);
        }
        if (nativeMediationAdRequest.isUnifiedNativeAdRequested()) {
            withAdListener.forUnifiedNativeAd(fVar);
        }
        if (nativeMediationAdRequest.isAppInstallAdRequested()) {
            withAdListener.forAppInstallAd(fVar);
        }
        if (nativeMediationAdRequest.isContentAdRequested()) {
            withAdListener.forContentAd(fVar);
        }
        if (nativeMediationAdRequest.zzvg()) {
            for (String next : nativeMediationAdRequest.zzvh().keySet()) {
                withAdListener.forCustomTemplateAd(next, fVar, nativeMediationAdRequest.zzvh().get(next).booleanValue() ? fVar : null);
            }
        }
        this.zzhu = withAdListener.build();
        this.zzhu.loadAd(zza(context, nativeMediationAdRequest, bundle2, bundle));
    }

    public void initialize(Context context, MediationAdRequest mediationAdRequest, String str, MediationRewardedVideoAdListener mediationRewardedVideoAdListener, Bundle bundle, Bundle bundle2) {
        this.zzhv = context.getApplicationContext();
        this.zzhx = mediationRewardedVideoAdListener;
        this.zzhx.onInitializationSucceeded(this);
    }

    public void loadAd(MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        if (this.zzhv == null || this.zzhx == null) {
            aai.m1626c("AdMobAdapter.loadAd called before initialize.");
            return;
        }
        this.zzhw = new InterstitialAd(this.zzhv);
        this.zzhw.zza(true);
        this.zzhw.setAdUnitId(getAdUnitId(bundle));
        this.zzhw.setRewardedVideoAdListener(this.zzhy);
        this.zzhw.setAdMetadataListener(new C0718h(this));
        this.zzhw.loadAd(zza(this.zzhv, mediationAdRequest, bundle2, bundle));
    }

    public void showVideo() {
        this.zzhw.show();
    }

    public boolean isInitialized() {
        return this.zzhx != null;
    }
}
