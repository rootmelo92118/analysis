package com.google.android.gms.internal.ads;

public class arc {

    /* renamed from: a */
    private static final apz f2370a = apz.m3374a();

    /* renamed from: b */
    private apc f2371b;

    /* renamed from: c */
    private volatile arw f2372c;

    /* renamed from: d */
    private volatile apc f2373d;

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arc)) {
            return false;
        }
        arc arc = (arc) obj;
        arw arw = this.f2372c;
        arw arw2 = arc.f2372c;
        if (arw == null && arw2 == null) {
            return mo11052c().equals(arc.mo11052c());
        }
        if (arw != null && arw2 != null) {
            return arw.equals(arw2);
        }
        if (arw != null) {
            return arw.equals(arc.m3520b(arw.mo11023q()));
        }
        return m3520b(arw2.mo11023q()).equals(arw2);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.arw m3520b(com.google.android.gms.internal.ads.arw r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.arw r0 = r1.f2372c
            if (r0 != 0) goto L_0x001d
            monitor-enter(r1)
            com.google.android.gms.internal.ads.arw r0 = r1.f2372c     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x000b:
            r1.f2372c = r2     // Catch:{ aqv -> 0x0012 }
            com.google.android.gms.internal.ads.apc r0 = com.google.android.gms.internal.ads.apc.f2174a     // Catch:{ aqv -> 0x0012 }
            r1.f2373d = r0     // Catch:{ aqv -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r1.f2372c = r2     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.ads.apc r2 = com.google.android.gms.internal.ads.apc.f2174a     // Catch:{ all -> 0x001a }
            r1.f2373d = r2     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        L_0x001d:
            com.google.android.gms.internal.ads.arw r2 = r1.f2372c
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.arc.m3520b(com.google.android.gms.internal.ads.arw):com.google.android.gms.internal.ads.arw");
    }

    /* renamed from: a */
    public final arw mo11050a(arw arw) {
        arw arw2 = this.f2372c;
        this.f2371b = null;
        this.f2373d = null;
        this.f2372c = arw;
        return arw2;
    }

    /* renamed from: b */
    public final int mo11051b() {
        if (this.f2373d != null) {
            return this.f2373d.mo10792a();
        }
        if (this.f2372c != null) {
            return this.f2372c.mo11020l();
        }
        return 0;
    }

    /* renamed from: c */
    public final apc mo11052c() {
        if (this.f2373d != null) {
            return this.f2373d;
        }
        synchronized (this) {
            if (this.f2373d != null) {
                apc apc = this.f2373d;
                return apc;
            }
            if (this.f2372c == null) {
                this.f2373d = apc.f2174a;
            } else {
                this.f2373d = this.f2372c.mo10754h();
            }
            apc apc2 = this.f2373d;
            return apc2;
        }
    }
}
