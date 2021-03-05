package com.google.android.gms.ads.internal.gmsg;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ads.C1772wz;
import com.google.android.gms.internal.ads.C1782xi;
import com.google.android.gms.internal.ads.afl;
import java.util.HashMap;
import java.util.Map;

final class zzt implements zzu<afl> {
    zzt() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        afl afl = (afl) obj;
        zzbv.zzlf();
        DisplayMetrics a = C1782xi.m8358a((WindowManager) afl.getContext().getSystemService("window"));
        int i = a.widthPixels;
        int i2 = a.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) afl).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        afl.mo10443a("locationReady", (Map<String, ?>) hashMap);
        C1772wz.m1630e("GET LOCATION COMPILED");
    }
}
