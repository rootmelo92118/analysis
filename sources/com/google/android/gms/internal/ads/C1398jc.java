package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@C1598qn
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.jc */
public final class C1398jc {

    /* renamed from: a */
    private final Object f5512a = new Object();
    @GuardedBy("mLock")

    /* renamed from: b */
    private C1406jk f5513b;

    /* renamed from: a */
    public final C1406jk mo12631a(Context context, zzbbi zzbbi) {
        C1406jk jkVar;
        synchronized (this.f5512a) {
            if (this.f5513b == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                this.f5513b = new C1406jk(context, zzbbi, (String) bre.m6321e().mo12778a(C1557p.f5892a));
            }
            jkVar = this.f5513b;
        }
        return jkVar;
    }
}
