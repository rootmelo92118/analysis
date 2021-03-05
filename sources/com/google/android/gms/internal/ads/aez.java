package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

@C1598qn
public final class aez extends aeo implements bjx<bje> {

    /* renamed from: d */
    private String f1560d;

    /* renamed from: e */
    private final adb f1561e;

    /* renamed from: f */
    private boolean f1562f;

    /* renamed from: g */
    private final aey f1563g = new aey();

    /* renamed from: h */
    private final aeg f1564h = new aeg();

    /* renamed from: i */
    private ByteBuffer f1565i;

    /* renamed from: j */
    private boolean f1566j;

    /* renamed from: k */
    private final Object f1567k = new Object();

    /* renamed from: l */
    private boolean f1568l;

    public aez(adc adc, adb adb) {
        super(adc);
        this.f1561e = adb;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10245a(Object obj) {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10246a(Object obj, int i) {
    }

    /* renamed from: c */
    public final String mo10306c() {
        return this.f1560d;
    }

    /* renamed from: d */
    public final boolean mo10307d() {
        return this.f1568l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo10294b(String str) {
        String valueOf = String.valueOf("cache:");
        String valueOf2 = String.valueOf(super.mo10294b(str));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: f */
    private final void m1900f() {
        int a = (int) this.f1564h.mo10280a(this.f1565i);
        int round = Math.round(((float) a) * (((float) this.f1565i.position()) / ((float) ((int) this.f1563g.mo10304a()))));
        mo10291a(this.f1560d, mo10294b(this.f1560d), (long) round, (long) a, round > 0, adv.m1804b(), adv.m1806c());
    }

    /* JADX WARNING: type inference failed for: r1v30, types: [com.google.android.gms.internal.ads.ads] */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c2, code lost:
        if (r9.f1565i.remaining() > 0) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c4, code lost:
        m1900f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cb, code lost:
        if (r9.f1562f != false) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cd, code lost:
        r12 = r1.mo9996a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d6, code lost:
        if ((r12 - r16) < r4) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d8, code lost:
        m1900f();
        r16 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e5, code lost:
        if ((r12 - r2) > (1000 * r6)) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r1 = new java.lang.StringBuilder(49);
        r1.append("Timeout exceeded. Limit: ");
        r1.append(r6);
        r1.append(" sec");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010c, code lost:
        throw new java.io.IOException(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010d, code lost:
        r12 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r1 = r9.f1565i.limit();
        r3 = new java.lang.StringBuilder(35);
        r3.append("Precache abort at ");
        r3.append(r1);
        r3.append(" bytes");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0132, code lost:
        throw new java.io.IOException(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0138, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0139, code lost:
        r12 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo10293a(java.lang.String r22) {
        /*
            r21 = this;
            r9 = r21
            r10 = r22
            r9.f1560d = r10
            java.lang.String r11 = r21.mo10294b(r22)
            java.lang.String r12 = "error"
            r13 = 0
            com.google.android.gms.internal.ads.bjl r0 = new com.google.android.gms.internal.ads.bjl     // Catch:{ Exception -> 0x013e }
            java.lang.String r2 = r9.f1525b     // Catch:{ Exception -> 0x013e }
            r3 = 0
            com.google.android.gms.internal.ads.adb r1 = r9.f1561e     // Catch:{ Exception -> 0x013e }
            int r5 = r1.f1409d     // Catch:{ Exception -> 0x013e }
            com.google.android.gms.internal.ads.adb r1 = r9.f1561e     // Catch:{ Exception -> 0x013e }
            int r6 = r1.f1411f     // Catch:{ Exception -> 0x013e }
            r7 = 1
            r8 = 0
            r1 = r0
            r4 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x013e }
            com.google.android.gms.internal.ads.adb r1 = r9.f1561e     // Catch:{ Exception -> 0x013e }
            boolean r1 = r1.f1414i     // Catch:{ Exception -> 0x013e }
            if (r1 == 0) goto L_0x0035
            com.google.android.gms.internal.ads.ads r1 = new com.google.android.gms.internal.ads.ads     // Catch:{ Exception -> 0x0032 }
            android.content.Context r2 = r9.f1524a     // Catch:{ Exception -> 0x0032 }
            r3 = 0
            r1.<init>(r2, r0, r3, r3)     // Catch:{ Exception -> 0x0032 }
            r0 = r1
            goto L_0x0035
        L_0x0032:
            r0 = move-exception
            goto L_0x0141
        L_0x0035:
            android.net.Uri r1 = android.net.Uri.parse(r22)     // Catch:{ Exception -> 0x013e }
            com.google.android.gms.internal.ads.bji r2 = new com.google.android.gms.internal.ads.bji     // Catch:{ Exception -> 0x013e }
            r2.<init>(r1)     // Catch:{ Exception -> 0x013e }
            r0.mo10212a(r2)     // Catch:{ Exception -> 0x013e }
            java.lang.ref.WeakReference r1 = r9.f1526c     // Catch:{ Exception -> 0x013e }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x013e }
            com.google.android.gms.internal.ads.adc r1 = (com.google.android.gms.internal.ads.adc) r1     // Catch:{ Exception -> 0x013e }
            if (r1 == 0) goto L_0x004e
            r1.mo10169a((java.lang.String) r11, (com.google.android.gms.internal.ads.aeo) r9)     // Catch:{ Exception -> 0x0032 }
        L_0x004e:
            com.google.android.gms.common.util.e r1 = com.google.android.gms.ads.internal.zzbv.zzlm()     // Catch:{ Exception -> 0x013e }
            long r2 = r1.mo9996a()     // Catch:{ Exception -> 0x013e }
            com.google.android.gms.internal.ads.e<java.lang.Long> r4 = com.google.android.gms.internal.ads.C1557p.f6141r     // Catch:{ Exception -> 0x013e }
            com.google.android.gms.internal.ads.m r5 = com.google.android.gms.internal.ads.bre.m6321e()     // Catch:{ Exception -> 0x013e }
            java.lang.Object r4 = r5.mo12778a(r4)     // Catch:{ Exception -> 0x013e }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ Exception -> 0x013e }
            long r4 = r4.longValue()     // Catch:{ Exception -> 0x013e }
            com.google.android.gms.internal.ads.e<java.lang.Long> r6 = com.google.android.gms.internal.ads.C1557p.f6140q     // Catch:{ Exception -> 0x013e }
            com.google.android.gms.internal.ads.m r7 = com.google.android.gms.internal.ads.bre.m6321e()     // Catch:{ Exception -> 0x013e }
            java.lang.Object r6 = r7.mo12778a(r6)     // Catch:{ Exception -> 0x013e }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ Exception -> 0x013e }
            long r6 = r6.longValue()     // Catch:{ Exception -> 0x013e }
            com.google.android.gms.internal.ads.adb r8 = r9.f1561e     // Catch:{ Exception -> 0x013e }
            int r8 = r8.f1408c     // Catch:{ Exception -> 0x013e }
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r8)     // Catch:{ Exception -> 0x013e }
            r9.f1565i = r8     // Catch:{ Exception -> 0x013e }
            r8 = 8192(0x2000, float:1.14794E-41)
            byte[] r15 = new byte[r8]     // Catch:{ Exception -> 0x013e }
            r16 = r2
        L_0x0086:
            java.nio.ByteBuffer r14 = r9.f1565i     // Catch:{ Exception -> 0x013e }
            int r14 = r14.remaining()     // Catch:{ Exception -> 0x013e }
            int r14 = java.lang.Math.min(r14, r8)     // Catch:{ Exception -> 0x013e }
            int r14 = r0.mo10211a(r15, r13, r14)     // Catch:{ Exception -> 0x013e }
            r8 = -1
            if (r14 != r8) goto L_0x00a9
            r8 = 1
            r9.f1568l = r8     // Catch:{ Exception -> 0x0032 }
            com.google.android.gms.internal.ads.aeg r0 = r9.f1564h     // Catch:{ Exception -> 0x0032 }
            java.nio.ByteBuffer r1 = r9.f1565i     // Catch:{ Exception -> 0x0032 }
            long r0 = r0.mo10280a(r1)     // Catch:{ Exception -> 0x0032 }
            int r0 = (int) r0     // Catch:{ Exception -> 0x0032 }
            long r0 = (long) r0     // Catch:{ Exception -> 0x0032 }
            r9.mo10290a((java.lang.String) r10, (java.lang.String) r11, (long) r0)     // Catch:{ Exception -> 0x0032 }
        L_0x00a7:
            r1 = 1
            goto L_0x00c8
        L_0x00a9:
            java.lang.Object r8 = r9.f1567k     // Catch:{ Exception -> 0x013e }
            monitor-enter(r8)     // Catch:{ Exception -> 0x013e }
            boolean r13 = r9.f1562f     // Catch:{ all -> 0x0133 }
            if (r13 != 0) goto L_0x00b9
            java.nio.ByteBuffer r13 = r9.f1565i     // Catch:{ all -> 0x0133 }
            r18 = r12
            r12 = 0
            r13.put(r15, r12, r14)     // Catch:{ all -> 0x013c }
            goto L_0x00bb
        L_0x00b9:
            r18 = r12
        L_0x00bb:
            monitor-exit(r8)     // Catch:{ all -> 0x013c }
            java.nio.ByteBuffer r8 = r9.f1565i     // Catch:{ Exception -> 0x0138 }
            int r8 = r8.remaining()     // Catch:{ Exception -> 0x0138 }
            if (r8 > 0) goto L_0x00c9
            r21.m1900f()     // Catch:{ Exception -> 0x0138 }
            goto L_0x00a7
        L_0x00c8:
            return r1
        L_0x00c9:
            boolean r8 = r9.f1562f     // Catch:{ Exception -> 0x0138 }
            if (r8 != 0) goto L_0x010d
            long r12 = r1.mo9996a()     // Catch:{ Exception -> 0x0138 }
            r8 = 0
            long r19 = r12 - r16
            int r8 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r8 < 0) goto L_0x00dd
            r21.m1900f()     // Catch:{ Exception -> 0x0138 }
            r16 = r12
        L_0x00dd:
            r8 = 0
            long r12 = r12 - r2
            r19 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 * r6
            int r8 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r8 > 0) goto L_0x00ed
            r12 = r18
            r8 = 8192(0x2000, float:1.14794E-41)
            r13 = 0
            goto L_0x0086
        L_0x00ed:
            java.lang.String r12 = "downloadTimeout"
            r0 = 49
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0032 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r0 = "Timeout exceeded. Limit: "
            r1.append(r0)     // Catch:{ Exception -> 0x0032 }
            r1.append(r6)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r0 = " sec"
            r1.append(r0)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0032 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ Exception -> 0x0032 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0032 }
            throw r1     // Catch:{ Exception -> 0x0032 }
        L_0x010d:
            java.lang.String r12 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x0032 }
            java.nio.ByteBuffer r1 = r9.f1565i     // Catch:{ Exception -> 0x0032 }
            int r1 = r1.limit()     // Catch:{ Exception -> 0x0032 }
            r2 = 35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0032 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r2 = "Precache abort at "
            r3.append(r2)     // Catch:{ Exception -> 0x0032 }
            r3.append(r1)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r1 = " bytes"
            r3.append(r1)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x0032 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0032 }
            throw r0     // Catch:{ Exception -> 0x0032 }
        L_0x0133:
            r0 = move-exception
            r18 = r12
        L_0x0136:
            monitor-exit(r8)     // Catch:{ all -> 0x013c }
            throw r0     // Catch:{ Exception -> 0x0138 }
        L_0x0138:
            r0 = move-exception
            r12 = r18
            goto L_0x0141
        L_0x013c:
            r0 = move-exception
            goto L_0x0136
        L_0x013e:
            r0 = move-exception
            r18 = r12
        L_0x0141:
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getCanonicalName()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            r3 = 1
            int r2 = r2 + r3
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r1)
            java.lang.String r1 = ":"
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = java.lang.String.valueOf(r22)
            int r1 = r1.length()
            int r1 = r1 + 34
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            int r1 = r1 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Failed to preload url "
            r2.append(r1)
            r2.append(r10)
            java.lang.String r1 = " Exception: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.C1772wz.m1630e(r1)
            r9.mo10292a(r10, r11, r12, r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aez.mo10293a(java.lang.String):boolean");
    }

    /* renamed from: b */
    public final void mo10295b() {
        this.f1562f = true;
    }

    /* renamed from: e */
    public final ByteBuffer mo10308e() {
        synchronized (this.f1567k) {
            if (this.f1565i != null && !this.f1566j) {
                this.f1565i.flip();
                this.f1566j = true;
            }
            this.f1562f = true;
        }
        return this.f1565i;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo10247a(Object obj, bji bji) {
        bje bje = (bje) obj;
        if (bje instanceof bjl) {
            this.f1563g.mo10305a((bjl) bje);
        }
    }
}
