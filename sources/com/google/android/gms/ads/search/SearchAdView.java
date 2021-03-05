package com.google.android.gms.ads.search;

import android.content.Context;
import android.support.annotation.RequiresPermission;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.aai;
import com.google.android.gms.internal.ads.btk;

@C1598qn
public final class SearchAdView extends ViewGroup {
    private final btk zzvw;

    public SearchAdView(Context context) {
        super(context);
        this.zzvw = new btk(this);
    }

    public SearchAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zzvw = new btk(this, attributeSet, false);
    }

    public SearchAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzvw = new btk(this, attributeSet, false);
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

    public final String getAdUnitId() {
        return this.zzvw.mo12412e();
    }

    @RequiresPermission("android.permission.INTERNET")
    public final void loadAd(SearchAdRequest searchAdRequest) {
        this.zzvw.mo12403a(searchAdRequest.zzaz());
    }

    @RequiresPermission("android.permission.INTERNET")
    public final void loadAd(DynamicHeightSearchAdRequest dynamicHeightSearchAdRequest) {
        if (AdSize.SEARCH.equals(getAdSize())) {
            this.zzvw.mo12403a(dynamicHeightSearchAdRequest.zzaz());
            return;
        }
        throw new IllegalStateException("You must use AdSize.SEARCH for a DynamicHeightSearchAdRequest");
    }

    public final void pause() {
        this.zzvw.mo12415h();
    }

    public final void resume() {
        this.zzvw.mo12417j();
    }

    public final void setAdListener(AdListener adListener) {
        this.zzvw.mo12398a(adListener);
    }

    public final void setAdSize(AdSize adSize) {
        this.zzvw.mo12406a(adSize);
    }

    public final void setAdUnitId(String str) {
        this.zzvw.mo12404a(str);
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
