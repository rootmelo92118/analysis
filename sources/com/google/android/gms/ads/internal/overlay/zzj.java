package com.google.android.gms.ads.internal.overlay;

import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1768wv;
import com.google.android.gms.internal.ads.C1782xi;

@C1598qn
final class zzj extends C1768wv {
    final /* synthetic */ zzd zzdrn;

    private zzj(zzd zzd) {
        this.zzdrn = zzd;
    }

    public final void onStop() {
    }

    public final void zzki() {
        Bitmap a = zzbv.zzma().mo13285a(Integer.valueOf(this.zzdrn.zzdqu.zzdsc.zzbpf));
        if (a != null) {
            C1782xi.f6838a.post(new zzk(this, zzbv.zzlh().mo13223a(this.zzdrn.mActivity, a, this.zzdrn.zzdqu.zzdsc.zzbpd, this.zzdrn.zzdqu.zzdsc.zzbpe)));
        }
    }

    /* synthetic */ zzj(zzd zzd, zzf zzf) {
        this(zzd);
    }
}
