package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

@TargetApi(14)
@C1598qn
public final class acv {

    /* renamed from: a */
    private final long f1360a = TimeUnit.MILLISECONDS.toNanos(((Long) bre.m6321e().mo12778a(C1557p.f6147x)).longValue());

    /* renamed from: b */
    private long f1361b;

    /* renamed from: c */
    private boolean f1362c = true;

    acv() {
    }

    /* renamed from: a */
    public final void mo10138a() {
        this.f1362c = true;
    }

    /* renamed from: a */
    public final void mo10139a(SurfaceTexture surfaceTexture, acm acm) {
        if (acm != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (this.f1362c || Math.abs(timestamp - this.f1361b) >= this.f1360a) {
                this.f1362c = false;
                this.f1361b = timestamp;
                C1782xi.f6838a.post(new acw(this, acm));
            }
        }
    }
}
