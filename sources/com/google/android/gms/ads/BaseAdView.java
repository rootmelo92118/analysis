package com.google.android.gms.ads;

import android.content.Context;
import android.support.annotation.RequiresPermission;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.internal.ads.aai;
import com.google.android.gms.internal.ads.bqf;
import com.google.android.gms.internal.ads.btk;

class BaseAdView extends ViewGroup {
    protected final btk zzvw;

    public BaseAdView(Context context, int i) {
        super(context);
        this.zzvw = new btk(this, i);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.zzvw = new btk(this, attributeSet, false, i);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.zzvw = new btk(this, attributeSet, false, i2);
    }

    public void destroy() {
        this.zzvw.mo12397a();
    }

    public AdListener getAdListener() {
        return this.zzvw.mo12408b();
    }

    public AdSize getAdSize() {
        return this.zzvw.mo12410c();
    }

    public String getAdUnitId() {
        return this.zzvw.mo12412e();
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd(AdRequest adRequest) {
        this.zzvw.mo12403a(adRequest.zzaz());
    }

    public void pause() {
        this.zzvw.mo12415h();
    }

    public void resume() {
        this.zzvw.mo12417j();
    }

    public boolean isLoading() {
        return this.zzvw.mo12419l();
    }

    public void setAdListener(AdListener adListener) {
        this.zzvw.mo12398a(adListener);
        if (adListener == null) {
            this.zzvw.mo12402a((bqf) null);
            this.zzvw.mo12401a((AppEventListener) null);
            return;
        }
        if (adListener instanceof bqf) {
            this.zzvw.mo12402a((bqf) adListener);
        }
        if (adListener instanceof AppEventListener) {
            this.zzvw.mo12401a((AppEventListener) adListener);
        }
    }

    public void setAdSize(AdSize adSize) {
        this.zzvw.mo12406a(adSize);
    }

    public void setAdUnitId(String str) {
        this.zzvw.mo12404a(str);
    }

    public String getMediationAdapterClassName() {
        return this.zzvw.mo12418k();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
    public void onMeasure(int i, int i2) {
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
