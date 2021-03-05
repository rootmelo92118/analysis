package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1768wv;
import com.google.android.gms.internal.ads.C1782xi;

@C1598qn
final class zzao extends C1768wv {
    final /* synthetic */ zzal zzbow;
    private final int zzbox;

    public zzao(zzal zzal, int i) {
        this.zzbow = zzal;
        this.zzbox = i;
    }

    public final void onStop() {
    }

    public final void zzki() {
        boolean z = this.zzbow.zzbls.zzbpa;
        zzbv.zzlf();
        zzaq zzaq = new zzaq(z, C1782xi.m8409o(this.zzbow.zzbls.zzsp), this.zzbow.zzboo, this.zzbow.zzbop, this.zzbow.zzbls.zzbpa ? this.zzbox : -1, this.zzbow.zzboq, this.zzbow.zzbls.zzbsu.f6689L, this.zzbow.zzbls.zzbsu.f6692O);
        int requestedOrientation = this.zzbow.zzbls.zzbsu.f6699b.getRequestedOrientation();
        if (requestedOrientation == -1) {
            requestedOrientation = this.zzbow.zzbls.zzbsu.f6705h;
        }
        C1782xi.f6838a.post(new zzap(this, new AdOverlayInfoParcel(this.zzbow, this.zzbow, this.zzbow, this.zzbow.zzbls.zzbsu.f6699b, requestedOrientation, this.zzbow.zzbls.zzbsp, this.zzbow.zzbls.zzbsu.f6678A, zzaq)));
    }
}
