package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1772wz;

@C1598qn
public final class zzr extends zzd {
    public zzr(Activity activity) {
        super(activity);
    }

    public final void onCreate(Bundle bundle) {
        C1772wz.m8287a("AdOverlayParcel is null or does not contain valid overlay type.");
        this.zzdre = 3;
        this.mActivity.finish();
    }
}
