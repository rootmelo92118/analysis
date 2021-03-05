package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.concurrent.GuardedBy;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.oi */
public abstract class C1539oi extends C1768wv {

    /* renamed from: a */
    protected final C1544on f5813a;

    /* renamed from: b */
    protected final Context f5814b;

    /* renamed from: c */
    protected final Object f5815c = new Object();

    /* renamed from: d */
    protected final Object f5816d = new Object();

    /* renamed from: e */
    protected final C1753wg f5817e;
    @GuardedBy("mLock")

    /* renamed from: f */
    protected zzasm f5818f;

    protected C1539oi(Context context, C1753wg wgVar, C1544on onVar) {
        super(true);
        this.f5814b = context;
        this.f5817e = wgVar;
        this.f5818f = wgVar.f6725b;
        this.f5813a = onVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C1752wf mo12848a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo12849a(long j);

    public void onStop() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0033 A[Catch:{ ol -> 0x0014 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b A[Catch:{ ol -> 0x0014 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzki() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f5815c
            monitor-enter(r0)
            java.lang.String r1 = "AdRendererBackgroundTask started."
            com.google.android.gms.internal.ads.C1772wz.m1624b(r1)     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.wg r1 = r5.f5817e     // Catch:{ all -> 0x0061 }
            int r1 = r1.f6728e     // Catch:{ all -> 0x0061 }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ ol -> 0x0014 }
            r5.mo12849a((long) r2)     // Catch:{ ol -> 0x0014 }
            goto L_0x0051
        L_0x0014:
            r1 = move-exception
            int r2 = r1.mo12852a()     // Catch:{ all -> 0x0061 }
            r3 = 3
            if (r2 == r3) goto L_0x0028
            r3 = -1
            if (r2 != r3) goto L_0x0020
            goto L_0x0028
        L_0x0020:
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.C1772wz.m1630e(r1)     // Catch:{ all -> 0x0061 }
            goto L_0x002f
        L_0x0028:
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.C1772wz.m1628d(r1)     // Catch:{ all -> 0x0061 }
        L_0x002f:
            com.google.android.gms.internal.ads.zzasm r1 = r5.f5818f     // Catch:{ all -> 0x0061 }
            if (r1 != 0) goto L_0x003b
            com.google.android.gms.internal.ads.zzasm r1 = new com.google.android.gms.internal.ads.zzasm     // Catch:{ all -> 0x0061 }
            r1.<init>(r2)     // Catch:{ all -> 0x0061 }
            r5.f5818f = r1     // Catch:{ all -> 0x0061 }
            goto L_0x0046
        L_0x003b:
            com.google.android.gms.internal.ads.zzasm r1 = new com.google.android.gms.internal.ads.zzasm     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.zzasm r3 = r5.f5818f     // Catch:{ all -> 0x0061 }
            long r3 = r3.f7091j     // Catch:{ all -> 0x0061 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0061 }
            r5.f5818f = r1     // Catch:{ all -> 0x0061 }
        L_0x0046:
            android.os.Handler r1 = com.google.android.gms.internal.ads.C1782xi.f6838a     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.oj r3 = new com.google.android.gms.internal.ads.oj     // Catch:{ all -> 0x0061 }
            r3.<init>(r5)     // Catch:{ all -> 0x0061 }
            r1.post(r3)     // Catch:{ all -> 0x0061 }
            r1 = r2
        L_0x0051:
            com.google.android.gms.internal.ads.wf r1 = r5.mo12848a((int) r1)     // Catch:{ all -> 0x0061 }
            android.os.Handler r2 = com.google.android.gms.internal.ads.C1782xi.f6838a     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.ok r3 = new com.google.android.gms.internal.ads.ok     // Catch:{ all -> 0x0061 }
            r3.<init>(r5, r1)     // Catch:{ all -> 0x0061 }
            r2.post(r3)     // Catch:{ all -> 0x0061 }
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return
        L_0x0061:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1539oi.zzki():void");
    }
}
