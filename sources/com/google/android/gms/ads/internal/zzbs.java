package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.awx;
import com.google.android.gms.internal.ads.awy;
import java.util.concurrent.Callable;

final class zzbs implements Callable<awy> {
    private final /* synthetic */ zzbp zzbra;

    zzbs(zzbp zzbp) {
        this.zzbra = zzbp;
    }

    public final /* synthetic */ Object call() {
        return new awy(awx.m4364a(this.zzbra.zzbob.f7135a, this.zzbra.mContext, false));
    }
}
