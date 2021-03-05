package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ViewSwitcher;
import com.google.android.gms.internal.ads.C1772wz;
import com.google.android.gms.internal.ads.C1805ye;
import com.google.android.gms.internal.ads.C1850zw;
import com.google.android.gms.internal.ads.afl;
import java.util.ArrayList;

public final class zzbx extends ViewSwitcher {
    private final C1805ye zzbue;
    @Nullable
    private final C1850zw zzbuf;
    private boolean zzbug = true;

    public zzbx(Context context, String str, String str2, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        super(context);
        this.zzbue = new C1805ye(context);
        this.zzbue.mo13251a(str);
        this.zzbue.mo13254b(str2);
        if (context instanceof Activity) {
            this.zzbuf = new C1850zw((Activity) context, this, onGlobalLayoutListener, onScrollChangedListener);
        } else {
            this.zzbuf = new C1850zw((Activity) null, this, onGlobalLayoutListener, onScrollChangedListener);
        }
        this.zzbuf.mo13296a();
    }

    public final C1805ye zzmm() {
        return this.zzbue;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.zzbug) {
            return false;
        }
        this.zzbue.mo13250a(motionEvent);
        return false;
    }

    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && (childAt instanceof afl)) {
                arrayList.add((afl) childAt);
            }
        }
        super.removeAllViews();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ((afl) obj).destroy();
        }
    }

    public final void zzmn() {
        C1772wz.m8287a("Disable position monitoring on adFrame.");
        if (this.zzbuf != null) {
            this.zzbuf.mo13298b();
        }
    }

    public final void zzmo() {
        C1772wz.m8287a("Enable debug gesture detector on adFrame.");
        this.zzbug = true;
    }

    public final void zzmp() {
        C1772wz.m8287a("Disable debug gesture detector on adFrame.");
        this.zzbug = false;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.zzbuf != null) {
            this.zzbuf.mo13299c();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.zzbuf != null) {
            this.zzbuf.mo13300d();
        }
    }
}
