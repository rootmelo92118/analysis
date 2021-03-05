package com.google.android.gms.ads.formats;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.internal.ads.C1214ci;
import com.google.android.gms.internal.ads.aai;
import com.google.android.gms.internal.ads.bre;
import com.google.android.gms.p039a.C0719a;
import com.google.android.gms.p039a.C0722b;

public final class UnifiedNativeAdView extends FrameLayout {
    private final FrameLayout zzbll;
    private final C1214ci zzblm = zzia();

    public UnifiedNativeAdView(Context context) {
        super(context);
        this.zzbll = zzc(context);
    }

    public UnifiedNativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zzbll = zzc(context);
    }

    public UnifiedNativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzbll = zzc(context);
    }

    @TargetApi(21)
    public UnifiedNativeAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.zzbll = zzc(context);
    }

    private final void zza(String str, View view) {
        try {
            this.zzblm.mo12341a(str, C0722b.m769a(view));
        } catch (RemoteException e) {
            aai.m1625b("Unable to call setAssetView on delegate", e);
        }
    }

    public final void setHeadlineView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_HEADLINE, view);
    }

    public final void setCallToActionView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_CALL_TO_ACTION, view);
    }

    public final void setIconView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_ICON, view);
    }

    public final void setBodyView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_BODY, view);
    }

    public final void setAdvertiserView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_ADVERTISER, view);
    }

    public final void setStoreView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_STORE, view);
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.zzblm.mo12343b(C0722b.m769a(view));
        } catch (RemoteException e) {
            aai.m1625b("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public final void setPriceView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_PRICE, view);
    }

    public final void setImageView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_IMAGE, view);
    }

    public final void setStarRatingView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_STAR_RATING, view);
    }

    public final void setMediaView(MediaView mediaView) {
        zza(UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO, mediaView);
    }

    public final void setAdChoicesView(AdChoicesView adChoicesView) {
        zza(UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW, adChoicesView);
    }

    public final void setNativeAd(UnifiedNativeAd unifiedNativeAd) {
        try {
            this.zzblm.mo12339a((C0719a) unifiedNativeAd.zzhy());
        } catch (RemoteException e) {
            aai.m1625b("Unable to call setNativeAd on delegate", e);
        }
    }

    private final View zzao(String str) {
        try {
            C0719a a = this.zzblm.mo12337a(str);
            if (a != null) {
                return (View) C0722b.m770a(a);
            }
            return null;
        } catch (RemoteException e) {
            aai.m1625b("Unable to call getAssetView on delegate", e);
            return null;
        }
    }

    public final View getHeadlineView() {
        return zzao(UnifiedNativeAdAssetNames.ASSET_HEADLINE);
    }

    public final View getCallToActionView() {
        return zzao(UnifiedNativeAdAssetNames.ASSET_CALL_TO_ACTION);
    }

    public final View getIconView() {
        return zzao(UnifiedNativeAdAssetNames.ASSET_ICON);
    }

    public final View getBodyView() {
        return zzao(UnifiedNativeAdAssetNames.ASSET_BODY);
    }

    public final View getStoreView() {
        return zzao(UnifiedNativeAdAssetNames.ASSET_STORE);
    }

    public final View getPriceView() {
        return zzao(UnifiedNativeAdAssetNames.ASSET_PRICE);
    }

    public final View getAdvertiserView() {
        return zzao(UnifiedNativeAdAssetNames.ASSET_ADVERTISER);
    }

    public final View getImageView() {
        return zzao(UnifiedNativeAdAssetNames.ASSET_IMAGE);
    }

    public final View getStarRatingView() {
        return zzao(UnifiedNativeAdAssetNames.ASSET_STAR_RATING);
    }

    public final MediaView getMediaView() {
        View zzao = zzao(UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO);
        if (zzao instanceof MediaView) {
            return (MediaView) zzao;
        }
        if (zzao == null) {
            return null;
        }
        aai.m1624b("View is not an instance of MediaView");
        return null;
    }

    public final AdChoicesView getAdChoicesView() {
        View zzao = zzao(UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW);
        if (zzao instanceof AdChoicesView) {
            return (AdChoicesView) zzao;
        }
        return null;
    }

    public final void destroy() {
        try {
            this.zzblm.mo12338a();
        } catch (RemoteException e) {
            aai.m1625b("Unable to destroy native ad view", e);
        }
    }

    private final FrameLayout zzc(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    private final C1214ci zzia() {
        C0926p.m1307a(this.zzbll, (Object) "createDelegate must be called after overlayFrame has been created");
        if (isInEditMode()) {
            return null;
        }
        return bre.m6318b().mo12319a(this.zzbll.getContext(), (FrameLayout) this, this.zzbll);
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.zzbll);
    }

    public final void removeView(View view) {
        if (this.zzbll != view) {
            super.removeView(view);
        }
    }

    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.zzbll);
    }

    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        if (this.zzbll != view) {
            super.bringChildToFront(this.zzbll);
        }
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.zzblm != null) {
            try {
                this.zzblm.mo12340a(C0722b.m769a(view), i);
            } catch (RemoteException e) {
                aai.m1625b("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }
}
