package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.zzbv;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.xb */
public final class C1775xb extends Handler {
    public C1775xb(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            zzbv.zzlj().mo13119a((Throwable) e, "AdMobHandler.handleMessage");
        }
    }

    public final void dispatchMessage(Message message) {
        try {
            super.dispatchMessage(message);
        } catch (Throwable th) {
            zzbv.zzlf();
            C1782xi.m8374a(zzbv.zzlj().mo13132l(), th);
            throw th;
        }
    }
}
