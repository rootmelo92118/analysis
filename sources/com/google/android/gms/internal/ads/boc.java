package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zzbv;
import javax.annotation.concurrent.GuardedBy;

@C1598qn
public final class boc {

    /* renamed from: a */
    private final Runnable f4895a = new bod(this);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f4896b = new Object();
    /* access modifiers changed from: private */
    @Nullable
    @GuardedBy("mLock")

    /* renamed from: c */
    public boi f4897c;
    @Nullable
    @GuardedBy("mLock")

    /* renamed from: d */
    private Context f4898d;
    /* access modifiers changed from: private */
    @Nullable
    @GuardedBy("mLock")

    /* renamed from: e */
    public bom f4899e;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12271a(android.content.Context r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.Object r0 = r2.f4896b
            monitor-enter(r0)
            android.content.Context r1 = r2.f4898d     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x000c:
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x0048 }
            r2.f4898d = r3     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.e<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.C1557p.f5968bW     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.m r1 = com.google.android.gms.internal.ads.bre.m6321e()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.mo12778a(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0028
            r2.m6089b()     // Catch:{ all -> 0x0048 }
            goto L_0x0046
        L_0x0028:
            com.google.android.gms.internal.ads.e<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.C1557p.f5967bV     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.m r1 = com.google.android.gms.internal.ads.bre.m6321e()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.mo12778a(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.boe r3 = new com.google.android.gms.internal.ads.boe     // Catch:{ all -> 0x0048 }
            r3.<init>(r2)     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.bne r1 = com.google.android.gms.ads.internal.zzbv.zzli()     // Catch:{ all -> 0x0048 }
            r1.mo12226a((com.google.android.gms.internal.ads.bnh) r3)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.boc.mo12271a(android.content.Context):void");
    }

    /* renamed from: a */
    public final void mo12270a() {
        if (((Boolean) bre.m6321e().mo12778a(C1557p.f5969bX)).booleanValue()) {
            synchronized (this.f4896b) {
                m6089b();
                zzbv.zzlf();
                C1782xi.f6838a.removeCallbacks(this.f4895a);
                zzbv.zzlf();
                C1782xi.f6838a.postDelayed(this.f4895a, ((Long) bre.m6321e().mo12778a(C1557p.f5970bY)).longValue());
            }
        }
    }

    /* renamed from: a */
    public final zztv mo12269a(zzty zzty) {
        synchronized (this.f4896b) {
            if (this.f4899e == null) {
                zztv zztv = new zztv();
                return zztv;
            }
            try {
                zztv a = this.f4899e.mo12279a(zzty);
                return a;
            } catch (RemoteException e) {
                C1772wz.m1625b("Unable to call into cache service.", e);
                return new zztv();
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m6089b() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f4896b
            monitor-enter(r0)
            android.content.Context r1 = r6.f4898d     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002e
            com.google.android.gms.internal.ads.boi r1 = r6.f4897c     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x000c
            goto L_0x002e
        L_0x000c:
            com.google.android.gms.internal.ads.bof r1 = new com.google.android.gms.internal.ads.bof     // Catch:{ all -> 0x0030 }
            r1.<init>(r6)     // Catch:{ all -> 0x0030 }
            com.google.android.gms.internal.ads.bog r2 = new com.google.android.gms.internal.ads.bog     // Catch:{ all -> 0x0030 }
            r2.<init>(r6)     // Catch:{ all -> 0x0030 }
            com.google.android.gms.internal.ads.boi r3 = new com.google.android.gms.internal.ads.boi     // Catch:{ all -> 0x0030 }
            android.content.Context r4 = r6.f4898d     // Catch:{ all -> 0x0030 }
            com.google.android.gms.internal.ads.zj r5 = com.google.android.gms.ads.internal.zzbv.zzlv()     // Catch:{ all -> 0x0030 }
            android.os.Looper r5 = r5.mo13282a()     // Catch:{ all -> 0x0030 }
            r3.<init>(r4, r5, r1, r2)     // Catch:{ all -> 0x0030 }
            r6.f4897c = r3     // Catch:{ all -> 0x0030 }
            com.google.android.gms.internal.ads.boi r1 = r6.f4897c     // Catch:{ all -> 0x0030 }
            r1.checkAvailabilityAndConnect()     // Catch:{ all -> 0x0030 }
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0030:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.boc.m6089b():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m6092c() {
        synchronized (this.f4896b) {
            if (this.f4897c != null) {
                if (this.f4897c.isConnected() || this.f4897c.isConnecting()) {
                    this.f4897c.disconnect();
                }
                this.f4897c = null;
                this.f4899e = null;
                Binder.flushPendingCommands();
            }
        }
    }
}
