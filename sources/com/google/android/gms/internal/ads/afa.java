package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;

@TargetApi(16)
@C1598qn
public final class afa extends aeo implements aec {

    /* renamed from: d */
    private adv f1570d;

    /* renamed from: e */
    private String f1571e;

    /* renamed from: f */
    private boolean f1572f;

    /* renamed from: g */
    private Exception f1573g;

    /* renamed from: h */
    private boolean f1574h;

    public afa(adc adc, adb adb) {
        super(adc);
        this.f1570d = new adv(adc.getContext(), adb);
        this.f1570d.mo10237a((aec) this);
    }

    /* renamed from: a */
    public final void mo10266a(int i, int i2) {
    }

    /* renamed from: b */
    public final void mo10269b(int i) {
    }

    /* renamed from: a */
    public final void mo10268a(boolean z, long j) {
        adc adc = (adc) this.f1526c.get();
        if (adc != null) {
            abl.f1313a.execute(new afb(adc, z, j));
        }
    }

    /* renamed from: a */
    public final void mo10267a(String str, Exception exc) {
        this.f1573g = exc;
        C1772wz.m1627c("Precache error", exc);
        m1911c(str);
    }

    /* renamed from: a */
    public final void mo10288a(int i) {
        this.f1570d.mo10254d().mo10222b(i);
    }

    /* renamed from: c */
    public final void mo10296c(int i) {
        this.f1570d.mo10254d().mo10217a(i);
    }

    /* renamed from: d */
    public final void mo10297d(int i) {
        this.f1570d.mo10254d().mo10224c(i);
    }

    /* renamed from: e */
    public final void mo10298e(int i) {
        this.f1570d.mo10254d().mo10226d(i);
    }

    /* renamed from: a */
    public final void mo9592a() {
        if (this.f1570d != null) {
            this.f1570d.mo10237a((aec) null);
            this.f1570d.mo10255e();
        }
        super.mo9592a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo10294b(String str) {
        String valueOf = String.valueOf("cache:");
        String valueOf2 = String.valueOf(super.mo10294b(str));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0079, code lost:
        if (r11.f1573g == null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007f, code lost:
        throw r11.f1573g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0080, code lost:
        r1 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0089, code lost:
        throw new java.io.IOException("Abort requested before buffering finished. ");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo10293a(java.lang.String r33) {
        /*
            r32 = this;
            r11 = r32
            r12 = r33
            r11.f1571e = r12
            java.lang.String r13 = r32.mo10294b(r33)
            java.lang.String r14 = "error"
            android.net.Uri r0 = android.net.Uri.parse(r33)     // Catch:{ Exception -> 0x0157 }
            com.google.android.gms.internal.ads.adv r1 = r11.f1570d     // Catch:{ Exception -> 0x0157 }
            java.lang.String r2 = r11.f1525b     // Catch:{ Exception -> 0x0157 }
            r1.mo10233a((android.net.Uri) r0, (java.lang.String) r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.ref.WeakReference r0 = r11.f1526c     // Catch:{ Exception -> 0x0157 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0157 }
            com.google.android.gms.internal.ads.adc r0 = (com.google.android.gms.internal.ads.adc) r0     // Catch:{ Exception -> 0x0157 }
            if (r0 == 0) goto L_0x0028
            r0.mo10169a((java.lang.String) r13, (com.google.android.gms.internal.ads.aeo) r11)     // Catch:{ Exception -> 0x0025 }
            goto L_0x0028
        L_0x0025:
            r0 = move-exception
            goto L_0x015a
        L_0x0028:
            com.google.android.gms.common.util.e r0 = com.google.android.gms.ads.internal.zzbv.zzlm()     // Catch:{ Exception -> 0x0157 }
            long r16 = r0.mo9996a()     // Catch:{ Exception -> 0x0157 }
            com.google.android.gms.internal.ads.e<java.lang.Long> r1 = com.google.android.gms.internal.ads.C1557p.f6141r     // Catch:{ Exception -> 0x0157 }
            com.google.android.gms.internal.ads.m r2 = com.google.android.gms.internal.ads.bre.m6321e()     // Catch:{ Exception -> 0x0157 }
            java.lang.Object r1 = r2.mo12778a(r1)     // Catch:{ Exception -> 0x0157 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x0157 }
            long r9 = r1.longValue()     // Catch:{ Exception -> 0x0157 }
            com.google.android.gms.internal.ads.e<java.lang.Long> r1 = com.google.android.gms.internal.ads.C1557p.f6140q     // Catch:{ Exception -> 0x0157 }
            com.google.android.gms.internal.ads.m r2 = com.google.android.gms.internal.ads.bre.m6321e()     // Catch:{ Exception -> 0x0157 }
            java.lang.Object r1 = r2.mo12778a(r1)     // Catch:{ Exception -> 0x0157 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x0157 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x0157 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r6 = r1 * r3
            com.google.android.gms.internal.ads.e<java.lang.Integer> r1 = com.google.android.gms.internal.ads.C1557p.f6139p     // Catch:{ Exception -> 0x0157 }
            com.google.android.gms.internal.ads.m r2 = com.google.android.gms.internal.ads.bre.m6321e()     // Catch:{ Exception -> 0x0157 }
            java.lang.Object r1 = r2.mo12778a(r1)     // Catch:{ Exception -> 0x0157 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x0157 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x0157 }
            long r4 = (long) r1     // Catch:{ Exception -> 0x0157 }
            r1 = -1
        L_0x0067:
            monitor-enter(r32)     // Catch:{ Exception -> 0x0157 }
            long r18 = r0.mo9996a()     // Catch:{ all -> 0x0150 }
            r3 = 0
            long r18 = r18 - r16
            int r3 = (r18 > r6 ? 1 : (r18 == r6 ? 0 : -1))
            if (r3 > 0) goto L_0x0123
            boolean r3 = r11.f1572f     // Catch:{ all -> 0x0150 }
            if (r3 == 0) goto L_0x008a
            java.lang.Exception r0 = r11.f1573g     // Catch:{ all -> 0x0155 }
            if (r0 == 0) goto L_0x0080
            java.lang.String r1 = "badUrl"
            java.lang.Exception r0 = r11.f1573g     // Catch:{ all -> 0x0149 }
            throw r0     // Catch:{ all -> 0x0149 }
        L_0x0080:
            java.lang.String r1 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0149 }
            java.lang.String r2 = "Abort requested before buffering finished. "
            r0.<init>(r2)     // Catch:{ all -> 0x0149 }
            throw r0     // Catch:{ all -> 0x0149 }
        L_0x008a:
            boolean r3 = r11.f1574h     // Catch:{ all -> 0x0150 }
            r18 = 1
            if (r3 == 0) goto L_0x0093
            monitor-exit(r32)     // Catch:{ all -> 0x0155 }
            goto L_0x00f4
        L_0x0093:
            com.google.android.gms.internal.ads.adv r3 = r11.f1570d     // Catch:{ all -> 0x0150 }
            com.google.android.gms.internal.ads.azn r3 = r3.mo10227a()     // Catch:{ all -> 0x0150 }
            if (r3 == 0) goto L_0x0117
            r20 = r14
            long r14 = r3.mo11485f()     // Catch:{ all -> 0x014c }
            r21 = 0
            int r8 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r8 <= 0) goto L_0x00f9
            long r23 = r3.mo11487h()     // Catch:{ all -> 0x014c }
            int r3 = (r23 > r1 ? 1 : (r23 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x00d6
            int r1 = (r23 > r21 ? 1 : (r23 == r21 ? 0 : -1))
            if (r1 <= 0) goto L_0x00b5
            r8 = 1
            goto L_0x00b6
        L_0x00b5:
            r8 = 0
        L_0x00b6:
            int r19 = com.google.android.gms.internal.ads.adv.m1804b()     // Catch:{ all -> 0x014c }
            int r25 = com.google.android.gms.internal.ads.adv.m1806c()     // Catch:{ all -> 0x014c }
            r1 = r32
            r2 = r33
            r3 = r13
            r26 = r4
            r4 = r23
            r28 = r6
            r6 = r14
            r30 = r9
            r9 = r19
            r10 = r25
            r1.mo10291a(r2, r3, r4, r6, r8, r9, r10)     // Catch:{ all -> 0x014c }
            r1 = r23
            goto L_0x00dc
        L_0x00d6:
            r26 = r4
            r28 = r6
            r30 = r9
        L_0x00dc:
            int r3 = (r23 > r14 ? 1 : (r23 == r14 ? 0 : -1))
            if (r3 < 0) goto L_0x00e5
            r11.mo10290a((java.lang.String) r12, (java.lang.String) r13, (long) r14)     // Catch:{ all -> 0x014c }
            monitor-exit(r32)     // Catch:{ all -> 0x014c }
            goto L_0x00f4
        L_0x00e5:
            com.google.android.gms.internal.ads.adv r3 = r11.f1570d     // Catch:{ all -> 0x014c }
            long r3 = r3.mo10256f()     // Catch:{ all -> 0x014c }
            int r5 = (r3 > r26 ? 1 : (r3 == r26 ? 0 : -1))
            if (r5 < 0) goto L_0x00f5
            int r3 = (r23 > r21 ? 1 : (r23 == r21 ? 0 : -1))
            if (r3 <= 0) goto L_0x00f5
            monitor-exit(r32)     // Catch:{ all -> 0x014c }
        L_0x00f4:
            return r18
        L_0x00f5:
            r3 = r1
            r1 = r30
            goto L_0x00ff
        L_0x00f9:
            r26 = r4
            r28 = r6
            r3 = r1
            r1 = r9
        L_0x00ff:
            r11.wait(r1)     // Catch:{ InterruptedException -> 0x010d }
            monitor-exit(r32)     // Catch:{ all -> 0x014c }
            r9 = r1
            r1 = r3
            r14 = r20
            r4 = r26
            r6 = r28
            goto L_0x0067
        L_0x010d:
            java.lang.String r1 = "interrupted"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0149 }
            java.lang.String r2 = "Wait interrupted."
            r0.<init>(r2)     // Catch:{ all -> 0x0149 }
            throw r0     // Catch:{ all -> 0x0149 }
        L_0x0117:
            r20 = r14
            java.lang.String r1 = "exoPlayerReleased"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0149 }
            java.lang.String r2 = "ExoPlayer was released during preloading."
            r0.<init>(r2)     // Catch:{ all -> 0x0149 }
            throw r0     // Catch:{ all -> 0x0149 }
        L_0x0123:
            r28 = r6
            r20 = r14
            java.lang.String r1 = "downloadTimeout"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0149 }
            r2 = 47
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0149 }
            r3.<init>(r2)     // Catch:{ all -> 0x0149 }
            java.lang.String r2 = "Timeout reached. Limit: "
            r3.append(r2)     // Catch:{ all -> 0x0149 }
            r4 = r28
            r3.append(r4)     // Catch:{ all -> 0x0149 }
            java.lang.String r2 = " ms"
            r3.append(r2)     // Catch:{ all -> 0x0149 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0149 }
            r0.<init>(r2)     // Catch:{ all -> 0x0149 }
            throw r0     // Catch:{ all -> 0x0149 }
        L_0x0149:
            r0 = move-exception
            r14 = r1
            goto L_0x0153
        L_0x014c:
            r0 = move-exception
            r14 = r20
            goto L_0x0153
        L_0x0150:
            r0 = move-exception
            r20 = r14
        L_0x0153:
            monitor-exit(r32)     // Catch:{ all -> 0x0155 }
            throw r0     // Catch:{ Exception -> 0x0025 }
        L_0x0155:
            r0 = move-exception
            goto L_0x0153
        L_0x0157:
            r0 = move-exception
            r20 = r14
        L_0x015a:
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r33)
            int r2 = r2.length()
            int r2 = r2 + 34
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Failed to preload url "
            r3.append(r2)
            r3.append(r12)
            java.lang.String r2 = " Exception: "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.google.android.gms.internal.ads.C1772wz.m1630e(r1)
            r32.mo9592a()
            java.lang.String r0 = m1910b(r14, r0)
            r11.mo10292a(r12, r13, r14, r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.afa.mo10293a(java.lang.String):boolean");
    }

    /* renamed from: b */
    public final void mo10295b() {
        m1911c((String) null);
    }

    /* renamed from: c */
    private final void m1911c(String str) {
        synchronized (this) {
            this.f1572f = true;
            notify();
            mo9592a();
        }
        if (this.f1571e != null) {
            String b = mo10294b(this.f1571e);
            if (this.f1573g != null) {
                mo10292a(this.f1571e, b, "badUrl", m1910b(str, this.f1573g));
            } else {
                mo10292a(this.f1571e, b, "externalAbort", "Programmatic precache abort.");
            }
        }
    }

    /* renamed from: c */
    public final adv mo10309c() {
        synchronized (this) {
            this.f1574h = true;
            notify();
        }
        this.f1570d.mo10237a((aec) null);
        adv adv = this.f1570d;
        this.f1570d = null;
        return adv;
    }

    /* renamed from: b */
    private static String m1910b(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }
}
