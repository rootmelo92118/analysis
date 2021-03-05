package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.internal.ads.C1772wz;
import com.google.android.gms.internal.ads.afl;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

final class zzaw implements zzu<afl> {
    private final /* synthetic */ CountDownLatch zzbpn;

    zzaw(CountDownLatch countDownLatch) {
        this.zzbpn = countDownLatch;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C1772wz.m1630e("Adapter returned an ad, but assets substitution failed");
        this.zzbpn.countDown();
        ((afl) obj).destroy();
    }
}
