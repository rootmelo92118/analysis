package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.afl;

@C1598qn
public final class zzi {
    public final int index;
    public final ViewGroup parent;
    public final ViewGroup.LayoutParams zzdrp;
    public final Context zzsp;

    public zzi(afl afl) {
        this.zzdrp = afl.getLayoutParams();
        ViewParent parent2 = afl.getParent();
        this.zzsp = afl.mo10377p();
        if (parent2 == null || !(parent2 instanceof ViewGroup)) {
            throw new zzg("Could not get the parent of the WebView for an overlay.");
        }
        this.parent = (ViewGroup) parent2;
        this.index = this.parent.indexOfChild(afl.getView());
        this.parent.removeView(afl.getView());
        afl.mo10353b(true);
    }
}
