package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.support.annotation.RequiresPermission;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.internal.ads.aai;
import com.google.android.gms.internal.ads.brw;
import com.google.android.gms.internal.ads.btk;

public final class PublisherAdView extends ViewGroup {
    private final btk zzvw;

    public PublisherAdView(Context context) {
        super(context);
        this.zzvw = new btk(this);
    }

    public PublisherAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zzvw = new btk(this, attributeSet, true);
        C0926p.m1307a(context, (Object) "Context cannot be null");
    }

    public PublisherAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzvw = new btk(this, attributeSet, true);
    }

    public final VideoController getVideoController() {
        return this.zzvw.mo12420m();
    }

    public final void setVideoOptions(VideoOptions videoOptions) {
        this.zzvw.mo12400a(videoOptions);
    }

    public final VideoOptions getVideoOptions() {
        return this.zzvw.mo12422o();
    }

    public final void destroy() {
        this.zzvw.mo12397a();
    }

    public final AdListener getAdListener() {
        return this.zzvw.mo12408b();
    }

    public final AdSize getAdSize() {
        return this.zzvw.mo12410c();
    }

    public final AdSize[] getAdSizes() {
        return this.zzvw.mo12411d();
    }

    public final String getAdUnitId() {
        return this.zzvw.mo12412e();
    }

    public final AppEventListener getAppEventListener() {
        return this.zzvw.mo12413f();
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.zzvw.mo12414g();
    }

    @RequiresPermission("android.permission.INTERNET")
    public final void loadAd(PublisherAdRequest publisherAdRequest) {
        this.zzvw.mo12403a(publisherAdRequest.zzaz());
    }

    public final void pause() {
        this.zzvw.mo12415h();
    }

    public final void setManualImpressionsEnabled(boolean z) {
        this.zzvw.mo12405a(z);
    }

    public final void recordManualImpression() {
        this.zzvw.mo12416i();
    }

    public final void resume() {
        this.zzvw.mo12417j();
    }

    public final void setAdListener(AdListener adListener) {
        this.zzvw.mo12398a(adListener);
    }

    public final void setAdSizes(AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.zzvw.mo12409b(adSizeArr);
    }

    public final void setAdUnitId(String str) {
        this.zzvw.mo12404a(str);
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        this.zzvw.mo12401a(appEventListener);
    }

    public final void setCorrelator(Correlator correlator) {
        this.zzvw.mo12399a(correlator);
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.zzvw.setOnCustomRenderedAdLoadedListener(onCustomRenderedAdLoadedListener);
    }

    public final String getMediationAdapterClassName() {
        return this.zzvw.mo12418k();
    }

    public final boolean isLoading() {
        return this.zzvw.mo12419l();
    }

    public final boolean zza(brw brw) {
        return this.zzvw.mo12407a(brw);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = ((i3 - i) - measuredWidth) / 2;
            int i6 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            AdSize adSize = null;
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                aai.m1625b("Unable to retrieve ad size.", e);
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                i3 = adSize.getHeightInPixels(context);
                i4 = widthInPixels;
            } else {
                i3 = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }
}
