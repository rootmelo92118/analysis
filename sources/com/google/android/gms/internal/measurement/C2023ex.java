package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ex */
public class C2023ex {

    /* renamed from: a */
    private static final C1988dv f7769a = C1988dv.m9454a();

    /* renamed from: b */
    private C1958cx f7770b;

    /* renamed from: c */
    private volatile C2043fq f7771c;

    /* renamed from: d */
    private volatile C1958cx f7772d;

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2023ex)) {
            return false;
        }
        C2023ex exVar = (C2023ex) obj;
        C2043fq fqVar = this.f7771c;
        C2043fq fqVar2 = exVar.f7771c;
        if (fqVar == null && fqVar2 == null) {
            return mo13849c().equals(exVar.mo13849c());
        }
        if (fqVar != null && fqVar2 != null) {
            return fqVar.equals(fqVar2);
        }
        if (fqVar != null) {
            return fqVar.equals(exVar.m9585b(fqVar.mo13821l()));
        }
        return m9585b(fqVar2.mo13821l()).equals(fqVar2);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.measurement.C2043fq m9585b(com.google.android.gms.internal.measurement.C2043fq r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.measurement.fq r0 = r1.f7771c
            if (r0 != 0) goto L_0x001d
            monitor-enter(r1)
            com.google.android.gms.internal.measurement.fq r0 = r1.f7771c     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x000b:
            r1.f7771c = r2     // Catch:{ ep -> 0x0012 }
            com.google.android.gms.internal.measurement.cx r0 = com.google.android.gms.internal.measurement.C1958cx.f7583a     // Catch:{ ep -> 0x0012 }
            r1.f7772d = r0     // Catch:{ ep -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r1.f7771c = r2     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.measurement.cx r2 = com.google.android.gms.internal.measurement.C1958cx.f7583a     // Catch:{ all -> 0x001a }
            r1.f7772d = r2     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        L_0x001d:
            com.google.android.gms.internal.measurement.fq r2 = r1.f7771c
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2023ex.m9585b(com.google.android.gms.internal.measurement.fq):com.google.android.gms.internal.measurement.fq");
    }

    /* renamed from: a */
    public final C2043fq mo13847a(C2043fq fqVar) {
        C2043fq fqVar2 = this.f7771c;
        this.f7770b = null;
        this.f7772d = null;
        this.f7771c = fqVar;
        return fqVar2;
    }

    /* renamed from: b */
    public final int mo13848b() {
        if (this.f7772d != null) {
            return this.f7772d.mo13595a();
        }
        if (this.f7771c != null) {
            return this.f7771c.mo13817h();
        }
        return 0;
    }

    /* renamed from: c */
    public final C1958cx mo13849c() {
        if (this.f7772d != null) {
            return this.f7772d;
        }
        synchronized (this) {
            if (this.f7772d != null) {
                C1958cx cxVar = this.f7772d;
                return cxVar;
            }
            if (this.f7771c == null) {
                this.f7772d = C1958cx.f7583a;
            } else {
                this.f7772d = this.f7771c.mo13567d();
            }
            C1958cx cxVar2 = this.f7772d;
            return cxVar2;
        }
    }
}
