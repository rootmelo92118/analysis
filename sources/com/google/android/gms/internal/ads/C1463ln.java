package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.support.annotation.Nullable;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.common.internal.C0926p;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.ln */
public final class C1463ln implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener {

    /* renamed from: a */
    private final C1443ku f5675a;

    /* renamed from: b */
    private NativeAdMapper f5676b;

    /* renamed from: c */
    private UnifiedNativeAdMapper f5677c;

    /* renamed from: d */
    private NativeCustomTemplateAd f5678d;

    public C1463ln(C1443ku kuVar) {
        this.f5675a = kuVar;
    }

    public final void zza(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        aai.m1624b("Adapter called onAppEvent.");
        try {
            this.f5675a.mo12658a(str, str2);
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        aai.m1624b("Adapter called onAdClicked.");
        try {
            this.f5675a.mo12650a();
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        aai.m1624b("Adapter called onAdClosed.");
        try {
            this.f5675a.mo12659b();
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error. ");
        sb.append(i);
        aai.m1624b(sb.toString());
        try {
            this.f5675a.mo12651a(i);
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        aai.m1624b("Adapter called onAdLeftApplication.");
        try {
            this.f5675a.mo12660c();
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        aai.m1624b("Adapter called onAdOpened.");
        try {
            this.f5675a.mo12661d();
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        aai.m1624b("Adapter called onAdLoaded.");
        try {
            this.f5675a.mo12662e();
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        aai.m1624b("Adapter called onAdClicked.");
        try {
            this.f5675a.mo12650a();
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        aai.m1624b("Adapter called onAdClosed.");
        try {
            this.f5675a.mo12659b();
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        aai.m1624b(sb.toString());
        try {
            this.f5675a.mo12651a(i);
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        aai.m1624b("Adapter called onAdLeftApplication.");
        try {
            this.f5675a.mo12660c();
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        aai.m1624b("Adapter called onAdOpened.");
        try {
            this.f5675a.mo12661d();
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        aai.m1624b("Adapter called onAdLoaded.");
        try {
            this.f5675a.mo12662e();
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, NativeAdMapper nativeAdMapper) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        aai.m1624b("Adapter called onAdLoaded.");
        this.f5676b = nativeAdMapper;
        this.f5677c = null;
        m7485a(mediationNativeAdapter, this.f5677c, this.f5676b);
        try {
            this.f5675a.mo12662e();
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, UnifiedNativeAdMapper unifiedNativeAdMapper) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        aai.m1624b("Adapter called onAdLoaded.");
        this.f5677c = unifiedNativeAdMapper;
        this.f5676b = null;
        m7485a(mediationNativeAdapter, this.f5677c, this.f5676b);
        try {
            this.f5675a.mo12662e();
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    private static void m7485a(MediationNativeAdapter mediationNativeAdapter, @Nullable UnifiedNativeAdMapper unifiedNativeAdMapper, @Nullable NativeAdMapper nativeAdMapper) {
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            VideoController videoController = new VideoController();
            videoController.zza(new C1460lk());
            if (unifiedNativeAdMapper != null && unifiedNativeAdMapper.hasVideoContent()) {
                unifiedNativeAdMapper.zza(videoController);
            }
            if (nativeAdMapper != null && nativeAdMapper.hasVideoContent()) {
                nativeAdMapper.zza(videoController);
            }
        }
    }

    public final void zza(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        String valueOf = String.valueOf(nativeCustomTemplateAd.getCustomTemplateId());
        aai.m1624b(valueOf.length() != 0 ? "Adapter called onAdLoaded with template id ".concat(valueOf) : new String("Adapter called onAdLoaded with template id "));
        this.f5678d = nativeCustomTemplateAd;
        try {
            this.f5675a.mo12662e();
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void zza(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
        if (nativeCustomTemplateAd instanceof C1237de) {
            try {
                this.f5675a.mo12652a(((C1237de) nativeCustomTemplateAd).mo12499a(), str);
            } catch (RemoteException e) {
                aai.m1629d("#007 Could not call remote method.", e);
            }
        } else {
            aai.m1630e("Unexpected native custom template ad type.");
        }
    }

    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        aai.m1624b(sb.toString());
        try {
            this.f5675a.mo12651a(i);
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        aai.m1624b("Adapter called onAdOpened.");
        try {
            this.f5675a.mo12661d();
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        aai.m1624b("Adapter called onAdClosed.");
        try {
            this.f5675a.mo12659b();
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        aai.m1624b("Adapter called onAdLeftApplication.");
        try {
            this.f5675a.mo12660c();
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        NativeAdMapper nativeAdMapper = this.f5676b;
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.f5677c;
        if (this.f5678d == null) {
            if (nativeAdMapper == null && unifiedNativeAdMapper == null) {
                aai.m1629d("#007 Could not call remote method.", (Throwable) null);
                return;
            } else if (unifiedNativeAdMapper != null && !unifiedNativeAdMapper.getOverrideClickHandling()) {
                aai.m1624b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            } else if (nativeAdMapper != null && !nativeAdMapper.getOverrideClickHandling()) {
                aai.m1624b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        aai.m1624b("Adapter called onAdClicked.");
        try {
            this.f5675a.mo12650a();
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        NativeAdMapper nativeAdMapper = this.f5676b;
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.f5677c;
        if (this.f5678d == null) {
            if (nativeAdMapper == null && unifiedNativeAdMapper == null) {
                aai.m1629d("#007 Could not call remote method.", (Throwable) null);
                return;
            } else if (unifiedNativeAdMapper != null && !unifiedNativeAdMapper.getOverrideImpressionRecording()) {
                aai.m1624b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            } else if (nativeAdMapper != null && !nativeAdMapper.getOverrideImpressionRecording()) {
                aai.m1624b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        aai.m1624b("Adapter called onAdImpression.");
        try {
            this.f5675a.mo12663f();
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    public final void onVideoEnd(MediationNativeAdapter mediationNativeAdapter) {
        C0926p.m1315b("#008 Must be called on the main UI thread.");
        aai.m1624b("Adapter called onVideoEnd.");
        try {
            this.f5675a.mo12664g();
        } catch (RemoteException e) {
            aai.m1629d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final NativeAdMapper mo12772a() {
        return this.f5676b;
    }

    /* renamed from: b */
    public final UnifiedNativeAdMapper mo12773b() {
        return this.f5677c;
    }

    /* renamed from: c */
    public final NativeCustomTemplateAd mo12774c() {
        return this.f5678d;
    }
}
