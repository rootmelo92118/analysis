package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.zzbv;

/* renamed from: com.google.android.gms.internal.ads.mv */
final class C1498mv implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AdOverlayInfoParcel f5729a;

    /* renamed from: b */
    private final /* synthetic */ zzanu f5730b;

    C1498mv(zzanu zzanu, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f5730b = zzanu;
        this.f5729a = adOverlayInfoParcel;
    }

    public final void run() {
        zzbv.zzld();
        zzl.zza(this.f5730b.f6994a, this.f5729a, true);
    }
}
