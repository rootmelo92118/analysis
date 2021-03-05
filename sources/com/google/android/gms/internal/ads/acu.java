package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.support.annotation.Nullable;
import com.google.android.gms.common.util.C0979o;
import java.util.Arrays;

@C1598qn
public final class acu extends acn {
    @Nullable
    /* renamed from: a */
    public final zzbdi mo10127a(Context context, adc adc, int i, boolean z, C1019ad adVar, adb adb) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        boolean z2 = true;
        if (!(C0979o.m1500a() && (applicationInfo == null || applicationInfo.targetSdkVersion >= 11))) {
            return null;
        }
        ade ade = new ade(context, adc.mo10180i(), adc.mo10177g(), adVar, adc.mo10173c());
        if (Build.VERSION.SDK_INT < 16 || i != 2) {
            z2 = false;
        }
        if (!z2) {
            adb adb2 = adb;
        } else if (Arrays.asList(adb.f1410e.split(",")).contains("3")) {
            return new zzbee(context, ade, adc, z, m1711a(adc), adb);
        }
        return new zzbcx(context, z, m1711a(adc), adb, new ade(context, adc.mo10180i(), adc.mo10177g(), adVar, adc.mo10173c()));
    }
}
