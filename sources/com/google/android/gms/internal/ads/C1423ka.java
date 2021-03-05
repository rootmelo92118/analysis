package com.google.android.gms.internal.ads;

import android.support.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@C1598qn
@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.ka */
public final class C1423ka extends C1444kv {

    /* renamed from: a */
    private final Object f5590a = new Object();
    @GuardedBy("mLock")

    /* renamed from: b */
    private C1428kf f5591b;
    @GuardedBy("mLock")

    /* renamed from: c */
    private C1421jz f5592c;

    /* renamed from: a */
    public final void mo12656a(zzawd zzawd) {
    }

    /* renamed from: a */
    public final void mo12657a(String str) {
    }

    /* renamed from: h */
    public final void mo12665h() {
    }

    /* renamed from: i */
    public final void mo12666i() {
    }

    /* renamed from: a */
    public final void mo12654a(C1428kf kfVar) {
        synchronized (this.f5590a) {
            this.f5591b = kfVar;
        }
    }

    /* renamed from: a */
    public final void mo12650a() {
        synchronized (this.f5590a) {
            if (this.f5592c != null) {
                this.f5592c.zziy();
            }
        }
    }

    /* renamed from: b */
    public final void mo12659b() {
        synchronized (this.f5590a) {
            if (this.f5592c != null) {
                this.f5592c.zziz();
            }
        }
    }

    /* renamed from: a */
    public final void mo12651a(int i) {
        synchronized (this.f5590a) {
            if (this.f5591b != null) {
                this.f5591b.mo12669a(i == 3 ? 1 : 2);
                this.f5591b = null;
            }
        }
    }

    /* renamed from: c */
    public final void mo12660c() {
        synchronized (this.f5590a) {
            if (this.f5592c != null) {
                this.f5592c.zzja();
            }
        }
    }

    /* renamed from: d */
    public final void mo12661d() {
        synchronized (this.f5590a) {
            if (this.f5592c != null) {
                this.f5592c.zzjb();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12662e() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f5590a
            monitor-enter(r0)
            com.google.android.gms.internal.ads.kf r1 = r3.f5591b     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x0012
            com.google.android.gms.internal.ads.kf r1 = r3.f5591b     // Catch:{ all -> 0x001d }
            r2 = 0
            r1.mo12669a(r2)     // Catch:{ all -> 0x001d }
            r1 = 0
            r3.f5591b = r1     // Catch:{ all -> 0x001d }
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return
        L_0x0012:
            com.google.android.gms.internal.ads.jz r1 = r3.f5592c     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x001b
            com.google.android.gms.internal.ads.jz r1 = r3.f5592c     // Catch:{ all -> 0x001d }
            r1.zzjc()     // Catch:{ all -> 0x001d }
        L_0x001b:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return
        L_0x001d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1423ka.mo12662e():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12655a(com.google.android.gms.internal.ads.C1446kx r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f5590a
            monitor-enter(r0)
            com.google.android.gms.internal.ads.kf r1 = r3.f5591b     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x0012
            com.google.android.gms.internal.ads.kf r1 = r3.f5591b     // Catch:{ all -> 0x001d }
            r2 = 0
            r1.mo12670a(r2, r4)     // Catch:{ all -> 0x001d }
            r4 = 0
            r3.f5591b = r4     // Catch:{ all -> 0x001d }
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return
        L_0x0012:
            com.google.android.gms.internal.ads.jz r4 = r3.f5592c     // Catch:{ all -> 0x001d }
            if (r4 == 0) goto L_0x001b
            com.google.android.gms.internal.ads.jz r4 = r3.f5592c     // Catch:{ all -> 0x001d }
            r4.zzjc()     // Catch:{ all -> 0x001d }
        L_0x001b:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return
        L_0x001d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1423ka.mo12655a(com.google.android.gms.internal.ads.kx):void");
    }

    /* renamed from: f */
    public final void mo12663f() {
        synchronized (this.f5590a) {
            if (this.f5592c != null) {
                this.f5592c.zzjd();
            }
        }
    }

    /* renamed from: a */
    public final void mo12658a(String str, String str2) {
        synchronized (this.f5590a) {
            if (this.f5592c != null) {
                this.f5592c.zzd(str, str2);
            }
        }
    }

    /* renamed from: a */
    public final void mo12652a(C1233da daVar, String str) {
        synchronized (this.f5590a) {
            if (this.f5592c != null) {
                this.f5592c.zza(daVar, str);
            }
        }
    }

    /* renamed from: g */
    public final void mo12664g() {
        synchronized (this.f5590a) {
            if (this.f5592c != null) {
                this.f5592c.zzix();
            }
        }
    }

    /* renamed from: a */
    public final void mo12653a(@Nullable C1421jz jzVar) {
        synchronized (this.f5590a) {
            this.f5592c = jzVar;
        }
    }
}
