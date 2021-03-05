package com.google.android.gms.internal.ads;

final class bfw {

    /* renamed from: a */
    private int f4129a = 1000;

    /* renamed from: b */
    private int[] f4130b = new int[this.f4129a];

    /* renamed from: c */
    private long[] f4131c = new long[this.f4129a];

    /* renamed from: d */
    private int[] f4132d = new int[this.f4129a];

    /* renamed from: e */
    private int[] f4133e = new int[this.f4129a];

    /* renamed from: f */
    private long[] f4134f = new long[this.f4129a];

    /* renamed from: g */
    private bcr[] f4135g = new bcr[this.f4129a];

    /* renamed from: h */
    private zzfs[] f4136h = new zzfs[this.f4129a];

    /* renamed from: i */
    private int f4137i;

    /* renamed from: j */
    private int f4138j;

    /* renamed from: k */
    private int f4139k;

    /* renamed from: l */
    private int f4140l;

    /* renamed from: m */
    private long f4141m = Long.MIN_VALUE;

    /* renamed from: n */
    private long f4142n = Long.MIN_VALUE;

    /* renamed from: o */
    private boolean f4143o = true;

    /* renamed from: p */
    private boolean f4144p = true;

    /* renamed from: q */
    private zzfs f4145q;

    /* renamed from: a */
    public final void mo11853a() {
        this.f4138j = 0;
        this.f4139k = 0;
        this.f4140l = 0;
        this.f4137i = 0;
        this.f4143o = true;
    }

    /* renamed from: b */
    public final void mo11857b() {
        this.f4141m = Long.MIN_VALUE;
        this.f4142n = Long.MIN_VALUE;
    }

    /* renamed from: c */
    public final int mo11858c() {
        return this.f4138j + this.f4137i;
    }

    /* renamed from: a */
    public final long mo11851a(int i) {
        int c = mo11858c() - i;
        bjy.m5689a(c >= 0 && c <= this.f4137i);
        if (c != 0) {
            this.f4137i -= c;
            this.f4140l = ((this.f4140l + this.f4129a) - c) % this.f4129a;
            this.f4142n = Long.MIN_VALUE;
            for (int i2 = this.f4137i - 1; i2 >= 0; i2--) {
                int i3 = (this.f4139k + i2) % this.f4129a;
                this.f4142n = Math.max(this.f4142n, this.f4134f[i3]);
                if ((this.f4133e[i3] & 1) != 0) {
                    break;
                }
            }
            return this.f4131c[this.f4140l];
        } else if (this.f4138j == 0 && this.f4137i == 0) {
            return 0;
        } else {
            int i4 = (this.f4140l == 0 ? this.f4129a : this.f4140l) - 1;
            return this.f4131c[i4] + ((long) this.f4132d[i4]);
        }
    }

    /* renamed from: d */
    public final int mo11859d() {
        return this.f4138j;
    }

    /* renamed from: e */
    public final synchronized boolean mo11860e() {
        return this.f4137i != 0;
    }

    /* renamed from: f */
    public final synchronized zzfs mo11861f() {
        if (this.f4144p) {
            return null;
        }
        return this.f4145q;
    }

    /* renamed from: g */
    public final synchronized long mo11862g() {
        return Math.max(this.f4141m, this.f4142n);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0023, code lost:
        return -3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo11850a(com.google.android.gms.internal.ads.baa r5, com.google.android.gms.internal.ads.bbw r6, boolean r7, boolean r8, com.google.android.gms.internal.ads.zzfs r9, com.google.android.gms.internal.ads.bfx r10) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.mo11860e()     // Catch:{ all -> 0x00a6 }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x0024
            if (r8 == 0) goto L_0x0012
            r5 = 4
            r6.mo11645a(r5)     // Catch:{ all -> 0x00a6 }
            monitor-exit(r4)
            return r3
        L_0x0012:
            com.google.android.gms.internal.ads.zzfs r6 = r4.f4145q     // Catch:{ all -> 0x00a6 }
            if (r6 == 0) goto L_0x0022
            if (r7 != 0) goto L_0x001c
            com.google.android.gms.internal.ads.zzfs r6 = r4.f4145q     // Catch:{ all -> 0x00a6 }
            if (r6 == r9) goto L_0x0022
        L_0x001c:
            com.google.android.gms.internal.ads.zzfs r6 = r4.f4145q     // Catch:{ all -> 0x00a6 }
            r5.f3268a = r6     // Catch:{ all -> 0x00a6 }
            monitor-exit(r4)
            return r1
        L_0x0022:
            monitor-exit(r4)
            return r2
        L_0x0024:
            if (r7 != 0) goto L_0x009c
            com.google.android.gms.internal.ads.zzfs[] r7 = r4.f4136h     // Catch:{ all -> 0x00a6 }
            int r8 = r4.f4139k     // Catch:{ all -> 0x00a6 }
            r7 = r7[r8]     // Catch:{ all -> 0x00a6 }
            if (r7 == r9) goto L_0x002f
            goto L_0x009c
        L_0x002f:
            java.nio.ByteBuffer r5 = r6.f3507b     // Catch:{ all -> 0x00a6 }
            r7 = 0
            r8 = 1
            if (r5 != 0) goto L_0x0037
            r5 = 1
            goto L_0x0038
        L_0x0037:
            r5 = 0
        L_0x0038:
            if (r5 == 0) goto L_0x003c
            monitor-exit(r4)
            return r2
        L_0x003c:
            long[] r5 = r4.f4134f     // Catch:{ all -> 0x00a6 }
            int r9 = r4.f4139k     // Catch:{ all -> 0x00a6 }
            r0 = r5[r9]     // Catch:{ all -> 0x00a6 }
            r6.f3508c = r0     // Catch:{ all -> 0x00a6 }
            int[] r5 = r4.f4133e     // Catch:{ all -> 0x00a6 }
            int r9 = r4.f4139k     // Catch:{ all -> 0x00a6 }
            r5 = r5[r9]     // Catch:{ all -> 0x00a6 }
            r6.mo11645a(r5)     // Catch:{ all -> 0x00a6 }
            int[] r5 = r4.f4132d     // Catch:{ all -> 0x00a6 }
            int r9 = r4.f4139k     // Catch:{ all -> 0x00a6 }
            r5 = r5[r9]     // Catch:{ all -> 0x00a6 }
            r10.f4146a = r5     // Catch:{ all -> 0x00a6 }
            long[] r5 = r4.f4131c     // Catch:{ all -> 0x00a6 }
            int r9 = r4.f4139k     // Catch:{ all -> 0x00a6 }
            r0 = r5[r9]     // Catch:{ all -> 0x00a6 }
            r10.f4147b = r0     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.internal.ads.bcr[] r5 = r4.f4135g     // Catch:{ all -> 0x00a6 }
            int r9 = r4.f4139k     // Catch:{ all -> 0x00a6 }
            r5 = r5[r9]     // Catch:{ all -> 0x00a6 }
            r10.f4149d = r5     // Catch:{ all -> 0x00a6 }
            long r0 = r4.f4141m     // Catch:{ all -> 0x00a6 }
            long r5 = r6.f3508c     // Catch:{ all -> 0x00a6 }
            long r5 = java.lang.Math.max(r0, r5)     // Catch:{ all -> 0x00a6 }
            r4.f4141m = r5     // Catch:{ all -> 0x00a6 }
            int r5 = r4.f4137i     // Catch:{ all -> 0x00a6 }
            int r5 = r5 - r8
            r4.f4137i = r5     // Catch:{ all -> 0x00a6 }
            int r5 = r4.f4139k     // Catch:{ all -> 0x00a6 }
            int r5 = r5 + r8
            r4.f4139k = r5     // Catch:{ all -> 0x00a6 }
            int r5 = r4.f4138j     // Catch:{ all -> 0x00a6 }
            int r5 = r5 + r8
            r4.f4138j = r5     // Catch:{ all -> 0x00a6 }
            int r5 = r4.f4139k     // Catch:{ all -> 0x00a6 }
            int r6 = r4.f4129a     // Catch:{ all -> 0x00a6 }
            if (r5 != r6) goto L_0x0086
            r4.f4139k = r7     // Catch:{ all -> 0x00a6 }
        L_0x0086:
            int r5 = r4.f4137i     // Catch:{ all -> 0x00a6 }
            if (r5 <= 0) goto L_0x0092
            long[] r5 = r4.f4131c     // Catch:{ all -> 0x00a6 }
            int r6 = r4.f4139k     // Catch:{ all -> 0x00a6 }
            r6 = r5[r6]     // Catch:{ all -> 0x00a6 }
            r5 = r6
            goto L_0x0098
        L_0x0092:
            long r5 = r10.f4147b     // Catch:{ all -> 0x00a6 }
            int r7 = r10.f4146a     // Catch:{ all -> 0x00a6 }
            long r7 = (long) r7     // Catch:{ all -> 0x00a6 }
            long r5 = r5 + r7
        L_0x0098:
            r10.f4148c = r5     // Catch:{ all -> 0x00a6 }
            monitor-exit(r4)
            return r3
        L_0x009c:
            com.google.android.gms.internal.ads.zzfs[] r6 = r4.f4136h     // Catch:{ all -> 0x00a6 }
            int r7 = r4.f4139k     // Catch:{ all -> 0x00a6 }
            r6 = r6[r7]     // Catch:{ all -> 0x00a6 }
            r5.f3268a = r6     // Catch:{ all -> 0x00a6 }
            monitor-exit(r4)
            return r1
        L_0x00a6:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bfw.mo11850a(com.google.android.gms.internal.ads.baa, com.google.android.gms.internal.ads.bbw, boolean, boolean, com.google.android.gms.internal.ads.zzfs, com.google.android.gms.internal.ads.bfx):int");
    }

    /* renamed from: h */
    public final synchronized long mo11863h() {
        if (!mo11860e()) {
            return -1;
        }
        int i = ((this.f4139k + this.f4137i) - 1) % this.f4129a;
        this.f4139k = (this.f4139k + this.f4137i) % this.f4129a;
        this.f4138j += this.f4137i;
        this.f4137i = 0;
        return this.f4131c[i] + ((long) this.f4132d[i]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0060, code lost:
        return -1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long mo11852a(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.mo11860e()     // Catch:{ all -> 0x0061 }
            r1 = -1
            if (r0 == 0) goto L_0x005f
            long[] r0 = r8.f4134f     // Catch:{ all -> 0x0061 }
            int r3 = r8.f4139k     // Catch:{ all -> 0x0061 }
            r3 = r0[r3]     // Catch:{ all -> 0x0061 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0014
            goto L_0x005f
        L_0x0014:
            long r3 = r8.f4142n     // Catch:{ all -> 0x0061 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x001e
            if (r11 != 0) goto L_0x001e
            monitor-exit(r8)
            return r1
        L_0x001e:
            r11 = 0
            int r0 = r8.f4139k     // Catch:{ all -> 0x0061 }
            r3 = -1
            r11 = -1
            r4 = 0
        L_0x0024:
            int r5 = r8.f4140l     // Catch:{ all -> 0x0061 }
            if (r0 == r5) goto L_0x0041
            long[] r5 = r8.f4134f     // Catch:{ all -> 0x0061 }
            r6 = r5[r0]     // Catch:{ all -> 0x0061 }
            int r5 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r5 > 0) goto L_0x0041
            int[] r5 = r8.f4133e     // Catch:{ all -> 0x0061 }
            r5 = r5[r0]     // Catch:{ all -> 0x0061 }
            r5 = r5 & 1
            if (r5 == 0) goto L_0x0039
            r11 = r4
        L_0x0039:
            int r0 = r0 + 1
            int r5 = r8.f4129a     // Catch:{ all -> 0x0061 }
            int r0 = r0 % r5
            int r4 = r4 + 1
            goto L_0x0024
        L_0x0041:
            if (r11 != r3) goto L_0x0045
            monitor-exit(r8)
            return r1
        L_0x0045:
            int r9 = r8.f4139k     // Catch:{ all -> 0x0061 }
            int r9 = r9 + r11
            int r10 = r8.f4129a     // Catch:{ all -> 0x0061 }
            int r9 = r9 % r10
            r8.f4139k = r9     // Catch:{ all -> 0x0061 }
            int r9 = r8.f4138j     // Catch:{ all -> 0x0061 }
            int r9 = r9 + r11
            r8.f4138j = r9     // Catch:{ all -> 0x0061 }
            int r9 = r8.f4137i     // Catch:{ all -> 0x0061 }
            int r9 = r9 - r11
            r8.f4137i = r9     // Catch:{ all -> 0x0061 }
            long[] r9 = r8.f4131c     // Catch:{ all -> 0x0061 }
            int r10 = r8.f4139k     // Catch:{ all -> 0x0061 }
            r10 = r9[r10]     // Catch:{ all -> 0x0061 }
            monitor-exit(r8)
            return r10
        L_0x005f:
            monitor-exit(r8)
            return r1
        L_0x0061:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bfw.mo11852a(long, boolean):long");
    }

    /* renamed from: a */
    public final synchronized boolean mo11856a(zzfs zzfs) {
        if (zzfs == null) {
            this.f4144p = true;
            return false;
        }
        this.f4144p = false;
        if (bkp.m5820a((Object) zzfs, (Object) this.f4145q)) {
            return false;
        }
        this.f4145q = zzfs;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00e8, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo11855a(long r6, int r8, long r9, int r11, com.google.android.gms.internal.ads.bcr r12) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f4143o     // Catch:{ all -> 0x00e9 }
            r1 = 0
            if (r0 == 0) goto L_0x000e
            r0 = r8 & 1
            if (r0 != 0) goto L_0x000c
            monitor-exit(r5)
            return
        L_0x000c:
            r5.f4143o = r1     // Catch:{ all -> 0x00e9 }
        L_0x000e:
            boolean r0 = r5.f4144p     // Catch:{ all -> 0x00e9 }
            r0 = r0 ^ 1
            com.google.android.gms.internal.ads.bjy.m5691b(r0)     // Catch:{ all -> 0x00e9 }
            r5.mo11854a((long) r6)     // Catch:{ all -> 0x00e9 }
            long[] r0 = r5.f4134f     // Catch:{ all -> 0x00e9 }
            int r2 = r5.f4140l     // Catch:{ all -> 0x00e9 }
            r0[r2] = r6     // Catch:{ all -> 0x00e9 }
            long[] r6 = r5.f4131c     // Catch:{ all -> 0x00e9 }
            int r7 = r5.f4140l     // Catch:{ all -> 0x00e9 }
            r6[r7] = r9     // Catch:{ all -> 0x00e9 }
            int[] r6 = r5.f4132d     // Catch:{ all -> 0x00e9 }
            int r7 = r5.f4140l     // Catch:{ all -> 0x00e9 }
            r6[r7] = r11     // Catch:{ all -> 0x00e9 }
            int[] r6 = r5.f4133e     // Catch:{ all -> 0x00e9 }
            int r7 = r5.f4140l     // Catch:{ all -> 0x00e9 }
            r6[r7] = r8     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.internal.ads.bcr[] r6 = r5.f4135g     // Catch:{ all -> 0x00e9 }
            int r7 = r5.f4140l     // Catch:{ all -> 0x00e9 }
            r6[r7] = r12     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.internal.ads.zzfs[] r6 = r5.f4136h     // Catch:{ all -> 0x00e9 }
            int r7 = r5.f4140l     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.internal.ads.zzfs r8 = r5.f4145q     // Catch:{ all -> 0x00e9 }
            r6[r7] = r8     // Catch:{ all -> 0x00e9 }
            int[] r6 = r5.f4130b     // Catch:{ all -> 0x00e9 }
            int r7 = r5.f4140l     // Catch:{ all -> 0x00e9 }
            r6[r7] = r1     // Catch:{ all -> 0x00e9 }
            int r6 = r5.f4137i     // Catch:{ all -> 0x00e9 }
            int r6 = r6 + 1
            r5.f4137i = r6     // Catch:{ all -> 0x00e9 }
            int r6 = r5.f4137i     // Catch:{ all -> 0x00e9 }
            int r7 = r5.f4129a     // Catch:{ all -> 0x00e9 }
            if (r6 != r7) goto L_0x00d9
            int r6 = r5.f4129a     // Catch:{ all -> 0x00e9 }
            int r6 = r6 + 1000
            int[] r7 = new int[r6]     // Catch:{ all -> 0x00e9 }
            long[] r8 = new long[r6]     // Catch:{ all -> 0x00e9 }
            long[] r9 = new long[r6]     // Catch:{ all -> 0x00e9 }
            int[] r10 = new int[r6]     // Catch:{ all -> 0x00e9 }
            int[] r11 = new int[r6]     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.internal.ads.bcr[] r12 = new com.google.android.gms.internal.ads.bcr[r6]     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.internal.ads.zzfs[] r0 = new com.google.android.gms.internal.ads.zzfs[r6]     // Catch:{ all -> 0x00e9 }
            int r2 = r5.f4129a     // Catch:{ all -> 0x00e9 }
            int r3 = r5.f4139k     // Catch:{ all -> 0x00e9 }
            int r2 = r2 - r3
            long[] r3 = r5.f4131c     // Catch:{ all -> 0x00e9 }
            int r4 = r5.f4139k     // Catch:{ all -> 0x00e9 }
            java.lang.System.arraycopy(r3, r4, r8, r1, r2)     // Catch:{ all -> 0x00e9 }
            long[] r3 = r5.f4134f     // Catch:{ all -> 0x00e9 }
            int r4 = r5.f4139k     // Catch:{ all -> 0x00e9 }
            java.lang.System.arraycopy(r3, r4, r9, r1, r2)     // Catch:{ all -> 0x00e9 }
            int[] r3 = r5.f4133e     // Catch:{ all -> 0x00e9 }
            int r4 = r5.f4139k     // Catch:{ all -> 0x00e9 }
            java.lang.System.arraycopy(r3, r4, r10, r1, r2)     // Catch:{ all -> 0x00e9 }
            int[] r3 = r5.f4132d     // Catch:{ all -> 0x00e9 }
            int r4 = r5.f4139k     // Catch:{ all -> 0x00e9 }
            java.lang.System.arraycopy(r3, r4, r11, r1, r2)     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.internal.ads.bcr[] r3 = r5.f4135g     // Catch:{ all -> 0x00e9 }
            int r4 = r5.f4139k     // Catch:{ all -> 0x00e9 }
            java.lang.System.arraycopy(r3, r4, r12, r1, r2)     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.internal.ads.zzfs[] r3 = r5.f4136h     // Catch:{ all -> 0x00e9 }
            int r4 = r5.f4139k     // Catch:{ all -> 0x00e9 }
            java.lang.System.arraycopy(r3, r4, r0, r1, r2)     // Catch:{ all -> 0x00e9 }
            int[] r3 = r5.f4130b     // Catch:{ all -> 0x00e9 }
            int r4 = r5.f4139k     // Catch:{ all -> 0x00e9 }
            java.lang.System.arraycopy(r3, r4, r7, r1, r2)     // Catch:{ all -> 0x00e9 }
            int r3 = r5.f4139k     // Catch:{ all -> 0x00e9 }
            long[] r4 = r5.f4131c     // Catch:{ all -> 0x00e9 }
            java.lang.System.arraycopy(r4, r1, r8, r2, r3)     // Catch:{ all -> 0x00e9 }
            long[] r4 = r5.f4134f     // Catch:{ all -> 0x00e9 }
            java.lang.System.arraycopy(r4, r1, r9, r2, r3)     // Catch:{ all -> 0x00e9 }
            int[] r4 = r5.f4133e     // Catch:{ all -> 0x00e9 }
            java.lang.System.arraycopy(r4, r1, r10, r2, r3)     // Catch:{ all -> 0x00e9 }
            int[] r4 = r5.f4132d     // Catch:{ all -> 0x00e9 }
            java.lang.System.arraycopy(r4, r1, r11, r2, r3)     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.internal.ads.bcr[] r4 = r5.f4135g     // Catch:{ all -> 0x00e9 }
            java.lang.System.arraycopy(r4, r1, r12, r2, r3)     // Catch:{ all -> 0x00e9 }
            com.google.android.gms.internal.ads.zzfs[] r4 = r5.f4136h     // Catch:{ all -> 0x00e9 }
            java.lang.System.arraycopy(r4, r1, r0, r2, r3)     // Catch:{ all -> 0x00e9 }
            int[] r4 = r5.f4130b     // Catch:{ all -> 0x00e9 }
            java.lang.System.arraycopy(r4, r1, r7, r2, r3)     // Catch:{ all -> 0x00e9 }
            r5.f4131c = r8     // Catch:{ all -> 0x00e9 }
            r5.f4134f = r9     // Catch:{ all -> 0x00e9 }
            r5.f4133e = r10     // Catch:{ all -> 0x00e9 }
            r5.f4132d = r11     // Catch:{ all -> 0x00e9 }
            r5.f4135g = r12     // Catch:{ all -> 0x00e9 }
            r5.f4136h = r0     // Catch:{ all -> 0x00e9 }
            r5.f4130b = r7     // Catch:{ all -> 0x00e9 }
            r5.f4139k = r1     // Catch:{ all -> 0x00e9 }
            int r7 = r5.f4129a     // Catch:{ all -> 0x00e9 }
            r5.f4140l = r7     // Catch:{ all -> 0x00e9 }
            int r7 = r5.f4129a     // Catch:{ all -> 0x00e9 }
            r5.f4137i = r7     // Catch:{ all -> 0x00e9 }
            r5.f4129a = r6     // Catch:{ all -> 0x00e9 }
            monitor-exit(r5)
            return
        L_0x00d9:
            int r6 = r5.f4140l     // Catch:{ all -> 0x00e9 }
            int r6 = r6 + 1
            r5.f4140l = r6     // Catch:{ all -> 0x00e9 }
            int r6 = r5.f4140l     // Catch:{ all -> 0x00e9 }
            int r7 = r5.f4129a     // Catch:{ all -> 0x00e9 }
            if (r6 != r7) goto L_0x00e7
            r5.f4140l = r1     // Catch:{ all -> 0x00e9 }
        L_0x00e7:
            monitor-exit(r5)
            return
        L_0x00e9:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bfw.mo11855a(long, int, long, int, com.google.android.gms.internal.ads.bcr):void");
    }

    /* renamed from: a */
    public final synchronized void mo11854a(long j) {
        this.f4142n = Math.max(this.f4142n, j);
    }
}
