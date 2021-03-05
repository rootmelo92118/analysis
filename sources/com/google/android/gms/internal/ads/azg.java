package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class azg implements bnl {

    /* renamed from: a */
    private final Map<String, List<blj<?>>> f3159a = new HashMap();

    /* renamed from: b */
    private final axe f3160b;

    azg(axe axe) {
        this.f3160b = axe;
    }

    /* renamed from: a */
    public final void mo11436a(blj<?> blj, brk<?> brk) {
        List<blj> remove;
        if (brk.f5186b == null || brk.f5186b.mo11341a()) {
            mo11435a(blj);
            return;
        }
        String f = blj.mo12123f();
        synchronized (this) {
            remove = this.f3159a.remove(f);
        }
        if (remove != null) {
            if (C1264ee.f5336a) {
                C1264ee.m6815a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), f);
            }
            for (blj a : remove) {
                this.f3160b.f3028e.mo11511a((blj<?>) a, brk);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo11435a(blj<?> blj) {
        String f = blj.mo12123f();
        List remove = this.f3159a.remove(f);
        if (remove != null && !remove.isEmpty()) {
            if (C1264ee.f5336a) {
                C1264ee.m6815a("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), f);
            }
            blj blj2 = (blj) remove.remove(0);
            this.f3159a.put(f, remove);
            blj2.mo12111a((bnl) this);
            try {
                this.f3160b.f3026c.put(blj2);
            } catch (InterruptedException e) {
                C1264ee.m6818c("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                this.f3160b.mo11367a();
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean m4509b(com.google.android.gms.internal.ads.blj<?> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = r6.mo12123f()     // Catch:{ all -> 0x0052 }
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.blj<?>>> r1 = r5.f3159a     // Catch:{ all -> 0x0052 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0052 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x003a
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.blj<?>>> r1 = r5.f3159a     // Catch:{ all -> 0x0052 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0052 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0052 }
            if (r1 != 0) goto L_0x001e
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0052 }
            r1.<init>()     // Catch:{ all -> 0x0052 }
        L_0x001e:
            java.lang.String r4 = "waiting-for-response"
            r6.mo12117b(r4)     // Catch:{ all -> 0x0052 }
            r1.add(r6)     // Catch:{ all -> 0x0052 }
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.blj<?>>> r6 = r5.f3159a     // Catch:{ all -> 0x0052 }
            r6.put(r0, r1)     // Catch:{ all -> 0x0052 }
            boolean r6 = com.google.android.gms.internal.ads.C1264ee.f5336a     // Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x0038
            java.lang.String r6 = "Request for cacheKey=%s is in flight, putting on hold."
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0052 }
            r1[r3] = r0     // Catch:{ all -> 0x0052 }
            com.google.android.gms.internal.ads.C1264ee.m6817b(r6, r1)     // Catch:{ all -> 0x0052 }
        L_0x0038:
            monitor-exit(r5)
            return r2
        L_0x003a:
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.blj<?>>> r1 = r5.f3159a     // Catch:{ all -> 0x0052 }
            r4 = 0
            r1.put(r0, r4)     // Catch:{ all -> 0x0052 }
            r6.mo12111a((com.google.android.gms.internal.ads.bnl) r5)     // Catch:{ all -> 0x0052 }
            boolean r6 = com.google.android.gms.internal.ads.C1264ee.f5336a     // Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x0050
            java.lang.String r6 = "new request, sending to network %s"
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0052 }
            r1[r3] = r0     // Catch:{ all -> 0x0052 }
            com.google.android.gms.internal.ads.C1264ee.m6817b(r6, r1)     // Catch:{ all -> 0x0052 }
        L_0x0050:
            monitor-exit(r5)
            return r3
        L_0x0052:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.azg.m4509b(com.google.android.gms.internal.ads.blj):boolean");
    }
}
