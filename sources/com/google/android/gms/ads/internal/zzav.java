package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.internal.ads.afl;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

final class zzav implements zzu<afl> {
    private final /* synthetic */ CountDownLatch zzbpn;

    zzav(CountDownLatch countDownLatch) {
        this.zzbpn = countDownLatch;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        this.zzbpn.countDown();
        ((afl) obj).getView().setVisibility(0);
    }
}
