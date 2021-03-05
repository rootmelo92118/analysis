package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ads.C1557p;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1772wz;
import com.google.android.gms.internal.ads.C1782xi;
import com.google.android.gms.internal.ads.bre;

@C1598qn
public final class zza {
    public static boolean zza(Context context, zzc zzc, zzt zzt) {
        int i;
        if (zzc == null) {
            C1772wz.m1630e("No intent data for launcher overlay.");
            return false;
        }
        C1557p.m7741a(context);
        if (zzc.intent != null) {
            return zza(context, zzc.intent, zzt);
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty(zzc.url)) {
            C1772wz.m1630e("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(zzc.mimeType)) {
            intent.setDataAndType(Uri.parse(zzc.url), zzc.mimeType);
        } else {
            intent.setData(Uri.parse(zzc.url));
        }
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(zzc.packageName)) {
            intent.setPackage(zzc.packageName);
        }
        if (!TextUtils.isEmpty(zzc.zzdqq)) {
            String[] split = zzc.zzdqq.split("/", 2);
            if (split.length < 2) {
                String valueOf = String.valueOf(zzc.zzdqq);
                C1772wz.m1630e(valueOf.length() != 0 ? "Could not parse component name from open GMSG: ".concat(valueOf) : new String("Could not parse component name from open GMSG: "));
                return false;
            }
            intent.setClassName(split[0], split[1]);
        }
        String str = zzc.zzdqr;
        if (!TextUtils.isEmpty(str)) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                C1772wz.m1630e("Could not parse intent flags.");
                i = 0;
            }
            intent.addFlags(i);
        }
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f6032ch)).booleanValue()) {
            intent.addFlags(268435456);
            intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) bre.m6321e().mo12778a(C1557p.f6031cg)).booleanValue()) {
                zzbv.zzlf();
                C1782xi.m8387b(context, intent);
            }
        }
        return zza(context, intent, zzt);
    }

    private static boolean zza(Context context, Intent intent, zzt zzt) {
        try {
            String valueOf = String.valueOf(intent.toURI());
            C1772wz.m8287a(valueOf.length() != 0 ? "Launching an intent: ".concat(valueOf) : new String("Launching an intent: "));
            zzbv.zzlf();
            C1782xi.m8370a(context, intent);
            if (zzt == null) {
                return true;
            }
            zzt.zzig();
            return true;
        } catch (ActivityNotFoundException e) {
            C1772wz.m1630e(e.getMessage());
            return false;
        }
    }
}
