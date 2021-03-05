package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.C0979o;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1782xi;

@C1598qn
public final class zzl {
    public static void zza(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.zzdsa == 4 && adOverlayInfoParcel.zzdru == null) {
            if (adOverlayInfoParcel.zzdrt != null) {
                adOverlayInfoParcel.zzdrt.onAdClicked();
            }
            zzbv.zzlc();
            zza.zza(context, adOverlayInfoParcel.zzdrs, adOverlayInfoParcel.zzdrz);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.CLASS_NAME);
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.zzbsp.f7138d);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        AdOverlayInfoParcel.zza(intent, adOverlayInfoParcel);
        if (!C0979o.m1507h()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        zzbv.zzlf();
        C1782xi.m8370a(context, intent);
    }
}
