package com.google.android.gms.ads.internal;

import android.view.View;

final class zzn implements View.OnClickListener {
    private final /* synthetic */ zzk zzbmi;
    private final /* synthetic */ zzw zzbmj;

    zzn(zzk zzk, zzw zzw) {
        this.zzbmi = zzk;
        this.zzbmj = zzw;
    }

    public final void onClick(View view) {
        this.zzbmj.recordClick();
        if (this.zzbmi.zzbmg != null) {
            this.zzbmi.zzbmg.mo13060c();
        }
    }
}
