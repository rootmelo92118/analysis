package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.internal.ads.C1238df;
import com.google.android.gms.internal.ads.C1241di;
import com.google.android.gms.internal.ads.C1253du;
import com.google.android.gms.internal.ads.C1268eh;
import com.google.android.gms.internal.ads.C1269ei;
import com.google.android.gms.internal.ads.C1270ej;
import com.google.android.gms.internal.ads.C1271ek;
import com.google.android.gms.internal.ads.C1272el;
import com.google.android.gms.internal.ads.C1274en;
import com.google.android.gms.internal.ads.C1436kn;
import com.google.android.gms.internal.ads.C1437ko;
import com.google.android.gms.internal.ads.aai;
import com.google.android.gms.internal.ads.bqi;
import com.google.android.gms.internal.ads.bqp;
import com.google.android.gms.internal.ads.bre;
import com.google.android.gms.internal.ads.brl;
import com.google.android.gms.internal.ads.bro;
import com.google.android.gms.internal.ads.brr;
import com.google.android.gms.internal.ads.bsk;
import com.google.android.gms.internal.ads.bti;
import com.google.android.gms.internal.ads.zzacp;
import com.google.android.gms.internal.ads.zzwf;

public class AdLoader {
    private final Context mContext;
    private final bqp zzvn;
    private final bro zzvo;

    public static class Builder {
        private final Context mContext;
        private final brr zzvp;

        public Builder(Context context, String str) {
            this((Context) C0926p.m1307a(context, (Object) "context cannot be null"), bre.m6318b().mo12318a(context, str, (C1437ko) new C1436kn()));
        }

        private Builder(Context context, brr brr) {
            this.mContext = context;
            this.zzvp = brr;
        }

        @Deprecated
        public Builder forContentAd(NativeContentAd.OnContentAdLoadedListener onContentAdLoadedListener) {
            try {
                this.zzvp.zza((C1241di) new C1269ei(onContentAdLoadedListener));
            } catch (RemoteException e) {
                aai.m1627c("Failed to add content ad listener", e);
            }
            return this;
        }

        @Deprecated
        public Builder forAppInstallAd(NativeAppInstallAd.OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
            try {
                this.zzvp.zza((C1238df) new C1268eh(onAppInstallAdLoadedListener));
            } catch (RemoteException e) {
                aai.m1627c("Failed to add app install ad listener", e);
            }
            return this;
        }

        public Builder forUnifiedNativeAd(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
            try {
                this.zzvp.zza((C1253du) new C1274en(onUnifiedNativeAdLoadedListener));
            } catch (RemoteException e) {
                aai.m1627c("Failed to add google native ad listener", e);
            }
            return this;
        }

        public Builder forCustomTemplateAd(String str, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
            C1270ej ejVar;
            try {
                brr brr = this.zzvp;
                C1271ek ekVar = new C1271ek(onCustomTemplateAdLoadedListener);
                if (onCustomClickListener == null) {
                    ejVar = null;
                } else {
                    ejVar = new C1270ej(onCustomClickListener);
                }
                brr.zza(str, ekVar, ejVar);
            } catch (RemoteException e) {
                aai.m1627c("Failed to add custom template ad listener", e);
            }
            return this;
        }

        public Builder forPublisherAdView(OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener, AdSize... adSizeArr) {
            if (adSizeArr == null || adSizeArr.length <= 0) {
                throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                this.zzvp.zza(new C1272el(onPublisherAdViewLoadedListener), new zzwf(this.mContext, adSizeArr));
            } catch (RemoteException e) {
                aai.m1627c("Failed to add publisher banner ad listener", e);
            }
            return this;
        }

        public Builder withAdListener(AdListener adListener) {
            try {
                this.zzvp.zzb((brl) new bqi(adListener));
            } catch (RemoteException e) {
                aai.m1627c("Failed to set AdListener.", e);
            }
            return this;
        }

        public Builder withNativeAdOptions(NativeAdOptions nativeAdOptions) {
            try {
                this.zzvp.zza(new zzacp(nativeAdOptions));
            } catch (RemoteException e) {
                aai.m1627c("Failed to specify native ad options", e);
            }
            return this;
        }

        public Builder withPublisherAdViewOptions(PublisherAdViewOptions publisherAdViewOptions) {
            try {
                this.zzvp.zza(publisherAdViewOptions);
            } catch (RemoteException e) {
                aai.m1627c("Failed to specify DFP banner ad options", e);
            }
            return this;
        }

        public Builder withCorrelator(@NonNull Correlator correlator) {
            C0926p.m1306a(correlator);
            try {
                this.zzvp.zzb((bsk) correlator.zzvx);
            } catch (RemoteException e) {
                aai.m1627c("Failed to set correlator.", e);
            }
            return this;
        }

        public AdLoader build() {
            try {
                return new AdLoader(this.mContext, this.zzvp.zzkd());
            } catch (RemoteException e) {
                aai.m1625b("Failed to build AdLoader.", e);
                return null;
            }
        }
    }

    AdLoader(Context context, bro bro) {
        this(context, bro, bqp.f5123a);
    }

    private AdLoader(Context context, bro bro, bqp bqp) {
        this.mContext = context;
        this.zzvo = bro;
        this.zzvn = bqp;
    }

    private final void zza(bti bti) {
        try {
            this.zzvo.zzd(bqp.m6264a(this.mContext, bti));
        } catch (RemoteException e) {
            aai.m1625b("Failed to load ad.", e);
        }
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd(AdRequest adRequest) {
        zza(adRequest.zzaz());
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAds(AdRequest adRequest, int i) {
        try {
            this.zzvo.zza(bqp.m6264a(this.mContext, adRequest.zzaz()), i);
        } catch (RemoteException e) {
            aai.m1625b("Failed to load ads.", e);
        }
    }

    public void loadAd(PublisherAdRequest publisherAdRequest) {
        zza(publisherAdRequest.zzaz());
    }

    @Deprecated
    public String getMediationAdapterClassName() {
        try {
            return this.zzvo.zzje();
        } catch (RemoteException e) {
            aai.m1627c("Failed to get the mediation adapter class name.", e);
            return null;
        }
    }

    public boolean isLoading() {
        try {
            return this.zzvo.isLoading();
        } catch (RemoteException e) {
            aai.m1627c("Failed to check if ad is loading.", e);
            return false;
        }
    }
}
