package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.common.util.C0979o;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@C1598qn
@ParametersAreNonnullByDefault
public final class bne {

    /* renamed from: a */
    private final Object f4824a = new Object();
    @GuardedBy("mActivityTrackerLock")

    /* renamed from: b */
    private bnf f4825b = null;
    @GuardedBy("mActivityTrackerLock")

    /* renamed from: c */
    private boolean f4826c = false;

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12225a(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f4824a
            monitor-enter(r0)
            boolean r1 = r4.f4826c     // Catch:{ all -> 0x003c }
            if (r1 != 0) goto L_0x003a
            boolean r1 = com.google.android.gms.common.util.C0979o.m1500a()     // Catch:{ all -> 0x003c }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            return
        L_0x000f:
            r1 = 0
            android.content.Context r2 = r5.getApplicationContext()     // Catch:{ all -> 0x003c }
            if (r2 != 0) goto L_0x0017
            r2 = r5
        L_0x0017:
            boolean r3 = r2 instanceof android.app.Application     // Catch:{ all -> 0x003c }
            if (r3 == 0) goto L_0x001e
            r1 = r2
            android.app.Application r1 = (android.app.Application) r1     // Catch:{ all -> 0x003c }
        L_0x001e:
            if (r1 != 0) goto L_0x0027
            java.lang.String r5 = "Can not cast Context to Application"
            com.google.android.gms.internal.ads.C1772wz.m1630e(r5)     // Catch:{ all -> 0x003c }
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            return
        L_0x0027:
            com.google.android.gms.internal.ads.bnf r2 = r4.f4825b     // Catch:{ all -> 0x003c }
            if (r2 != 0) goto L_0x0032
            com.google.android.gms.internal.ads.bnf r2 = new com.google.android.gms.internal.ads.bnf     // Catch:{ all -> 0x003c }
            r2.<init>()     // Catch:{ all -> 0x003c }
            r4.f4825b = r2     // Catch:{ all -> 0x003c }
        L_0x0032:
            com.google.android.gms.internal.ads.bnf r2 = r4.f4825b     // Catch:{ all -> 0x003c }
            r2.mo12229a((android.app.Application) r1, (android.content.Context) r5)     // Catch:{ all -> 0x003c }
            r5 = 1
            r4.f4826c = r5     // Catch:{ all -> 0x003c }
        L_0x003a:
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            return
        L_0x003c:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bne.mo12225a(android.content.Context):void");
    }

    /* renamed from: a */
    public final void mo12226a(bnh bnh) {
        synchronized (this.f4824a) {
            if (C0979o.m1500a()) {
                if (this.f4825b == null) {
                    this.f4825b = new bnf();
                }
                this.f4825b.mo12230a(bnh);
            }
        }
    }

    @Nullable
    /* renamed from: a */
    public final Activity mo12224a() {
        synchronized (this.f4824a) {
            if (!C0979o.m1500a()) {
                return null;
            }
            if (this.f4825b == null) {
                return null;
            }
            Activity a = this.f4825b.mo12228a();
            return a;
        }
    }

    @Nullable
    /* renamed from: b */
    public final Context mo12227b() {
        synchronized (this.f4824a) {
            if (!C0979o.m1500a()) {
                return null;
            }
            if (this.f4825b == null) {
                return null;
            }
            Context b = this.f4825b.mo12231b();
            return b;
        }
    }
}
