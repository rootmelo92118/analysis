package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

@C1598qn
final class abh {

    /* renamed from: a */
    private final Object f1307a = new Object();

    /* renamed from: b */
    private final List<Runnable> f1308b = new ArrayList();

    /* renamed from: c */
    private boolean f1309c = false;

    /* renamed from: a */
    public final void mo10074a(Runnable runnable, Executor executor) {
        synchronized (this.f1307a) {
            if (this.f1309c) {
                executor.execute(runnable);
            } else {
                this.f1308b.add(new abi(executor, runnable));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        if (r2 >= r1) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        r3 = r0.get(r2);
        r2 = r2 + 1;
        ((java.lang.Runnable) r3).run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        r0 = r0;
        r1 = r0.size();
        r2 = 0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10073a() {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = r4.f1307a
            monitor-enter(r1)
            boolean r2 = r4.f1309c     // Catch:{ all -> 0x0032 }
            if (r2 == 0) goto L_0x000e
            monitor-exit(r1)     // Catch:{ all -> 0x0032 }
            return
        L_0x000e:
            java.util.List<java.lang.Runnable> r2 = r4.f1308b     // Catch:{ all -> 0x0032 }
            r0.addAll(r2)     // Catch:{ all -> 0x0032 }
            java.util.List<java.lang.Runnable> r2 = r4.f1308b     // Catch:{ all -> 0x0032 }
            r2.clear()     // Catch:{ all -> 0x0032 }
            r2 = 1
            r4.f1309c = r2     // Catch:{ all -> 0x0032 }
            monitor-exit(r1)     // Catch:{ all -> 0x0032 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            r2 = 0
        L_0x0023:
            if (r2 >= r1) goto L_0x0031
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r3.run()
            goto L_0x0023
        L_0x0031:
            return
        L_0x0032:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0032 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.abh.mo10073a():void");
    }
}
