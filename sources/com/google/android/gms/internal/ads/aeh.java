package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.Arrays;

@C1598qn
public final class aeh implements aev {
    /* renamed from: a */
    public final aeo mo10281a(adc adc, int i, String str, adb adb) {
        if (Build.VERSION.SDK_INT < 16 || i <= 0 || !Arrays.asList(adb.f1410e.split(",")).contains("3")) {
            return new aew(adc);
        }
        int c = adv.m1806c();
        if (c < adb.f1413h) {
            return new afa(adc, adb);
        }
        if (c < adb.f1407b) {
            return new aez(adc, adb);
        }
        return new aex(adc);
    }
}
