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

@Deprecated
public class NativeAdView extends FrameLayout {
    private final FrameLayout zzbld;
    private final C1214ci zzble = zzia();

    public NativeAdView(Context context) {
        super(context);
        this.zzbld = zzc(context);
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zzbld = zzc(context);
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzbld = zzc(context);
    }

    @TargetApi(21)
    public NativeAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.zzbld = zzc(context);
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        zza(NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, adChoicesView);
    }

    public AdChoicesView getAdChoicesView() {
        View zzao = zzao(NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW);
        if (zzao instanceof AdChoicesView) {
            return (AdChoicesView) zzao;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void zza(String str, View view) {
        try {
            this.zzble.mo12341a(str, C0722b.m769a(view));
        } catch (RemoteException e) {
            aai.m1625b("Unable to call setAssetView on delegate", e);
        }
    }

    /* access modifiers changed from: protected */
    public final View zzao(String str) {
        try {
            C0719a a = this.zzble.mo12337a(str);
            if (a != null) {
                return (View) C0722b.m770a(a);
            }
            return null;
        } catch (RemoteException e) {
            aai.m1625b("Unable to call getAssetView on delegate", e);
            return null;
        }
    }

    public void setNativeAd(NativeAd nativeAd) {
        try {
            this.zzble.mo12339a((C0719a) nativeAd.zzhy());
        } catch (RemoteException e) {
            aai.m1625b("Unable to call setNativeAd on delegate", e);
        }
    }

    public void destroy() {
        try {
            this.zzble.mo12338a();
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
        C0926p.m1307a(this.zzbld, (Object) "createDelegate must be called after mOverlayFrame has been created");
        if (isInEditMode()) {
            return null;
        }
        return bre.m6318b().mo12319a(this.zzbld.getContext(), (FrameLayout) this, this.zzbld);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.zzbld);
    }

    public void removeView(View view) {
        if (this.zzbld != view) {
            super.removeView(view);
        }
    }

    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.zzbld);
    }

    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        if (this.zzbld != view) {
            super.bringChildToFront(this.zzbld);
        }
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.zzble != null) {
            try {
                this.zzble.mo12340a(C0722b.m769a(view), i);
            } catch (RemoteException e) {
                aai.m1625b("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }
}
