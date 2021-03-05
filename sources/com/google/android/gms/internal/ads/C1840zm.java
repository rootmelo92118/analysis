package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import javax.annotation.concurrent.GuardedBy;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.zm */
public final class C1840zm {

    /* renamed from: a */
    private long f6937a;
    @GuardedBy("mLock")

    /* renamed from: b */
    private long f6938b = Long.MIN_VALUE;

    /* renamed from: c */
    private Object f6939c = new Object();

    public C1840zm(long j) {
        this.f6937a = j;
    }

    /* renamed from: a */
    public final boolean mo13287a() {
        synchronized (this.f6939c) {
            long b = zzbv.zzlm().mo9997b();
            if (this.f6938b + this.f6937a > b) {
                return false;
            }
            this.f6938b = b;
            return true;
        }
    }
}
