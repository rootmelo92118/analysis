package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zzbv;
import java.io.InputStream;
import java.util.concurrent.Future;
import javax.annotation.concurrent.GuardedBy;

@C1598qn
public final class bop {
    /* access modifiers changed from: private */
    @Nullable
    @GuardedBy("mLock")

    /* renamed from: a */
    public boi f4909a;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: b */
    public boolean f4910b;

    /* renamed from: c */
    private final Context f4911c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Object f4912d = new Object();

    bop(Context context) {
        this.f4911c = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Future<InputStream> mo12280a(zzty zzty) {
        boq boq = new boq(this);
        bor bor = new bor(this, zzty, boq);
        bov bov = new bov(this, boq);
        synchronized (this.f4912d) {
            this.f4909a = new boi(this.f4911c, zzbv.zzlv().mo13282a(), bor, bov);
            this.f4909a.checkAvailabilityAndConnect();
        }
        return boq;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m6106a() {
        synchronized (this.f4912d) {
            if (this.f4909a != null) {
                this.f4909a.disconnect();
                this.f4909a = null;
                Binder.flushPendingCommands();
            }
        }
    }
}
