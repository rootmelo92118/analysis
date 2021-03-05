package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class bhn implements bgx {

    /* renamed from: a */
    private final bju f4312a;

    /* renamed from: b */
    private final int[] f4313b;

    /* renamed from: c */
    private final biv f4314c;

    /* renamed from: d */
    private final int f4315d;

    /* renamed from: e */
    private final bhp[] f4316e;

    /* renamed from: f */
    private final bje f4317f;

    /* renamed from: g */
    private final long f4318g;

    /* renamed from: h */
    private final int f4319h;

    /* renamed from: i */
    private bhr f4320i;

    /* renamed from: j */
    private int f4321j;

    /* renamed from: k */
    private IOException f4322k;

    /* renamed from: l */
    private boolean f4323l;

    public bhn(bju bju, bhr bhr, int i, int[] iArr, biv biv, int i2, bje bje, long j, int i3, boolean z, boolean z2) {
        biv biv2 = biv;
        this.f4312a = bju;
        this.f4320i = bhr;
        this.f4313b = iArr;
        this.f4314c = biv2;
        this.f4315d = i2;
        this.f4317f = bje;
        this.f4321j = i;
        this.f4318g = j;
        this.f4319h = i3;
        long b = bhr.mo11957b(i);
        ArrayList<bhx> b2 = m5495b();
        this.f4316e = new bhp[biv.mo11979b()];
        for (int i4 = 0; i4 < this.f4316e.length; i4++) {
            this.f4316e[i4] = new bhp(b, b2.get(biv2.mo11980b(i4)), z, z2);
        }
    }

    /* renamed from: a */
    public final void mo11922a(bhr bhr, int i) {
        try {
            this.f4320i = bhr;
            this.f4321j = i;
            long b = this.f4320i.mo11957b(this.f4321j);
            ArrayList<bhx> b2 = m5495b();
            for (int i2 = 0; i2 < this.f4316e.length; i2++) {
                this.f4316e[i2].mo11951a(b, b2.get(this.f4314c.mo11980b(i2)));
            }
        } catch (bfe e) {
            this.f4322k = e;
        }
    }

    /* renamed from: a */
    public final void mo11916a() {
        if (this.f4322k == null) {
            this.f4312a.mo12026c();
            return;
        }
        throw this.f4322k;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.google.android.gms.internal.ads.bgt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: com.google.android.gms.internal.ads.bgt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: com.google.android.gms.internal.ads.bgw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: com.google.android.gms.internal.ads.bgt} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11918a(com.google.android.gms.internal.ads.bgv r30, long r31, com.google.android.gms.internal.ads.bgp r33) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = r31
            r4 = r33
            java.io.IOException r5 = r0.f4322k
            if (r5 == 0) goto L_0x000d
            return
        L_0x000d:
            r5 = 0
            if (r1 == 0) goto L_0x0015
            long r7 = r1.f4195g
            long r7 = r7 - r2
            goto L_0x0016
        L_0x0015:
            r7 = r5
        L_0x0016:
            com.google.android.gms.internal.ads.biv r9 = r0.f4314c
            r9.mo11988a((long) r7)
            com.google.android.gms.internal.ads.bhp[] r7 = r0.f4316e
            com.google.android.gms.internal.ads.biv r8 = r0.f4314c
            int r8 = r8.mo11989d()
            r7 = r7[r8]
            com.google.android.gms.internal.ads.bgm r8 = r7.f4326a
            if (r8 == 0) goto L_0x0090
            com.google.android.gms.internal.ads.bhx r8 = r7.f4327b
            com.google.android.gms.internal.ads.bgm r9 = r7.f4326a
            com.google.android.gms.internal.ads.zzfs[] r9 = r9.mo11906c()
            r10 = 0
            if (r9 != 0) goto L_0x0039
            com.google.android.gms.internal.ads.bhw r9 = r8.mo11964c()
            goto L_0x003a
        L_0x0039:
            r9 = r10
        L_0x003a:
            com.google.android.gms.internal.ads.bhl r11 = r7.f4328c
            if (r11 != 0) goto L_0x0042
            com.google.android.gms.internal.ads.bhw r10 = r8.mo11965d()
        L_0x0042:
            if (r9 != 0) goto L_0x0046
            if (r10 == 0) goto L_0x0090
        L_0x0046:
            com.google.android.gms.internal.ads.bje r12 = r0.f4317f
            com.google.android.gms.internal.ads.biv r1 = r0.f4314c
            com.google.android.gms.internal.ads.zzfs r14 = r1.mo11981c()
            com.google.android.gms.internal.ads.biv r1 = r0.f4314c
            int r15 = r1.mo11990e()
            com.google.android.gms.internal.ads.biv r1 = r0.f4314c
            java.lang.Object r16 = r1.mo11991f()
            com.google.android.gms.internal.ads.bhx r1 = r7.f4327b
            java.lang.String r1 = r1.f4367b
            if (r9 == 0) goto L_0x0068
            com.google.android.gms.internal.ads.bhw r2 = r9.mo11961a(r10, r1)
            if (r2 != 0) goto L_0x0069
            r2 = r9
            goto L_0x0069
        L_0x0068:
            r2 = r10
        L_0x0069:
            com.google.android.gms.internal.ads.bji r3 = new com.google.android.gms.internal.ads.bji
            android.net.Uri r18 = r2.mo11960a(r1)
            long r5 = r2.f4362a
            long r1 = r2.f4363b
            com.google.android.gms.internal.ads.bhx r8 = r7.f4327b
            java.lang.String r23 = r8.mo11967f()
            r17 = r3
            r19 = r5
            r21 = r1
            r17.<init>(r18, r19, r21, r23)
            com.google.android.gms.internal.ads.bgu r1 = new com.google.android.gms.internal.ads.bgu
            com.google.android.gms.internal.ads.bgm r2 = r7.f4326a
            r11 = r1
            r13 = r3
            r17 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r4.f4209a = r1
            return
        L_0x0090:
            long r8 = r0.f4318g
            r10 = 1000(0x3e8, double:4.94E-321)
            int r12 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r12 == 0) goto L_0x00a2
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r8 = r0.f4318g
            long r5 = r5 + r8
            long r5 = r5 * r10
            goto L_0x00a8
        L_0x00a2:
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 * r10
        L_0x00a8:
            int r8 = r7.mo11952b()
            r9 = 0
            r12 = 1
            if (r8 != 0) goto L_0x00c6
            com.google.android.gms.internal.ads.bhr r1 = r0.f4320i
            boolean r1 = r1.f4337b
            if (r1 == 0) goto L_0x00c3
            int r1 = r0.f4321j
            com.google.android.gms.internal.ads.bhr r2 = r0.f4320i
            int r2 = r2.mo11955a()
            int r2 = r2 - r12
            if (r1 >= r2) goto L_0x00c2
            goto L_0x00c3
        L_0x00c2:
            r12 = 0
        L_0x00c3:
            r4.f4210b = r12
            return
        L_0x00c6:
            int r13 = r7.mo11948a()
            r14 = -1
            if (r8 != r14) goto L_0x0105
            com.google.android.gms.internal.ads.bhr r8 = r0.f4320i
            long r14 = r8.f4336a
            long r14 = r14 * r10
            long r5 = r5 - r14
            com.google.android.gms.internal.ads.bhr r8 = r0.f4320i
            int r14 = r0.f4321j
            com.google.android.gms.internal.ads.bhv r8 = r8.mo11956a(r14)
            long r14 = r8.f4360b
            long r14 = r14 * r10
            long r5 = r5 - r14
            com.google.android.gms.internal.ads.bhr r8 = r0.f4320i
            long r14 = r8.f4339d
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r8 == 0) goto L_0x00ff
            com.google.android.gms.internal.ads.bhr r8 = r0.f4320i
            long r14 = r8.f4339d
            long r14 = r14 * r10
            long r10 = r5 - r14
            int r8 = r7.mo11949a((long) r10)
            int r8 = java.lang.Math.max(r13, r8)
            r13 = r8
        L_0x00ff:
            int r5 = r7.mo11949a((long) r5)
            int r5 = r5 - r12
            goto L_0x0108
        L_0x0105:
            int r8 = r8 + r13
            int r5 = r8 + -1
        L_0x0108:
            if (r1 != 0) goto L_0x0114
            int r1 = r7.mo11949a((long) r2)
            int r1 = com.google.android.gms.internal.ads.bkp.m5810a((int) r1, (int) r13, (int) r5)
        L_0x0112:
            r15 = r1
            goto L_0x0122
        L_0x0114:
            int r1 = r30.mo11920f()
            if (r1 >= r13) goto L_0x0112
            com.google.android.gms.internal.ads.bfe r1 = new com.google.android.gms.internal.ads.bfe
            r1.<init>()
            r0.f4322k = r1
            return
        L_0x0122:
            if (r15 > r5) goto L_0x01db
            boolean r1 = r0.f4323l
            if (r1 == 0) goto L_0x012c
            if (r15 < r5) goto L_0x012c
            goto L_0x01dd
        L_0x012c:
            int r1 = r0.f4319h
            int r5 = r5 - r15
            int r5 = r5 + r12
            int r1 = java.lang.Math.min(r1, r5)
            com.google.android.gms.internal.ads.bje r6 = r0.f4317f
            int r2 = r0.f4315d
            com.google.android.gms.internal.ads.biv r3 = r0.f4314c
            com.google.android.gms.internal.ads.zzfs r3 = r3.mo11981c()
            com.google.android.gms.internal.ads.biv r5 = r0.f4314c
            int r9 = r5.mo11990e()
            com.google.android.gms.internal.ads.biv r5 = r0.f4314c
            java.lang.Object r10 = r5.mo11991f()
            com.google.android.gms.internal.ads.bhx r5 = r7.f4327b
            long r13 = r7.mo11950a((int) r15)
            com.google.android.gms.internal.ads.bhw r8 = r7.mo11954c(r15)
            java.lang.String r11 = r5.f4367b
            com.google.android.gms.internal.ads.bgm r12 = r7.f4326a
            if (r12 != 0) goto L_0x0188
            long r16 = r7.mo11953b(r15)
            com.google.android.gms.internal.ads.bji r1 = new com.google.android.gms.internal.ads.bji
            android.net.Uri r19 = r8.mo11960a(r11)
            long r11 = r8.f4362a
            long r7 = r8.f4363b
            java.lang.String r24 = r5.mo11967f()
            r18 = r1
            r20 = r11
            r22 = r7
            r18.<init>(r19, r20, r22, r24)
            com.google.android.gms.internal.ads.bgw r18 = new com.google.android.gms.internal.ads.bgw
            r5 = r18
            r7 = r1
            r8 = r3
            r11 = r13
            r13 = r16
            r16 = r2
            r17 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r13, r15, r16, r17)
            r2 = r18
            goto L_0x01d8
        L_0x0188:
            r2 = 1
            r16 = 1
        L_0x018b:
            if (r2 >= r1) goto L_0x019f
            int r12 = r15 + r2
            com.google.android.gms.internal.ads.bhw r12 = r7.mo11954c(r12)
            com.google.android.gms.internal.ads.bhw r12 = r8.mo11961a(r12, r11)
            if (r12 == 0) goto L_0x019f
            int r16 = r16 + 1
            int r2 = r2 + 1
            r8 = r12
            goto L_0x018b
        L_0x019f:
            int r1 = r15 + r16
            r2 = 1
            int r1 = r1 - r2
            long r1 = r7.mo11953b(r1)
            com.google.android.gms.internal.ads.bji r12 = new com.google.android.gms.internal.ads.bji
            android.net.Uri r18 = r8.mo11960a(r11)
            r25 = r1
            long r0 = r8.f4362a
            r27 = r13
            long r13 = r8.f4363b
            java.lang.String r23 = r5.mo11967f()
            r17 = r12
            r19 = r0
            r21 = r13
            r17.<init>(r18, r19, r21, r23)
            long r0 = r5.f4368c
            long r0 = -r0
            com.google.android.gms.internal.ads.bgt r2 = new com.google.android.gms.internal.ads.bgt
            com.google.android.gms.internal.ads.bgm r13 = r7.f4326a
            r5 = r2
            r7 = r12
            r8 = r3
            r11 = r27
            r3 = r13
            r13 = r25
            r17 = r0
            r19 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r13, r15, r16, r17, r19)
        L_0x01d8:
            r4.f4209a = r2
            return
        L_0x01db:
            r0 = r29
        L_0x01dd:
            com.google.android.gms.internal.ads.bhr r1 = r0.f4320i
            boolean r1 = r1.f4337b
            if (r1 == 0) goto L_0x01f2
            int r1 = r0.f4321j
            com.google.android.gms.internal.ads.bhr r2 = r0.f4320i
            int r2 = r2.mo11955a()
            r3 = 1
            int r2 = r2 - r3
            if (r1 >= r2) goto L_0x01f0
            goto L_0x01f3
        L_0x01f0:
            r3 = 0
            goto L_0x01f3
        L_0x01f2:
            r3 = 1
        L_0x01f3:
            r4.f4210b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bhn.mo11918a(com.google.android.gms.internal.ads.bgv, long, com.google.android.gms.internal.ads.bgp):void");
    }

    /* renamed from: a */
    public final void mo11917a(bgl bgl) {
        bco b;
        if (bgl instanceof bgu) {
            bhp bhp = this.f4316e[this.f4314c.mo11975a(((bgu) bgl).f4191c)];
            if (bhp.f4328c == null && (b = bhp.f4326a.mo11905b()) != null) {
                bhp.f4328c = new bhm((bcd) b);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        r7 = r5.f4316e[r5.f4314c.mo11975a(r6.f4191c)];
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11919a(com.google.android.gms.internal.ads.bgl r6, boolean r7, java.lang.Exception r8) {
        /*
            r5 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.internal.ads.bhr r7 = r5.f4320i
            boolean r7 = r7.f4337b
            r1 = 404(0x194, float:5.66E-43)
            r2 = 1
            if (r7 != 0) goto L_0x0043
            boolean r7 = r6 instanceof com.google.android.gms.internal.ads.bgv
            if (r7 == 0) goto L_0x0043
            boolean r7 = r8 instanceof com.google.android.gms.internal.ads.bjn
            if (r7 == 0) goto L_0x0043
            r7 = r8
            com.google.android.gms.internal.ads.bjn r7 = (com.google.android.gms.internal.ads.bjn) r7
            int r7 = r7.f4494a
            if (r7 != r1) goto L_0x0043
            com.google.android.gms.internal.ads.bhp[] r7 = r5.f4316e
            com.google.android.gms.internal.ads.biv r3 = r5.f4314c
            com.google.android.gms.internal.ads.zzfs r4 = r6.f4191c
            int r3 = r3.mo11975a((com.google.android.gms.internal.ads.zzfs) r4)
            r7 = r7[r3]
            int r3 = r7.mo11952b()
            r4 = -1
            if (r3 == r4) goto L_0x0043
            if (r3 == 0) goto L_0x0043
            int r7 = r7.mo11948a()
            int r7 = r7 + r3
            int r7 = r7 - r2
            r3 = r6
            com.google.android.gms.internal.ads.bgv r3 = (com.google.android.gms.internal.ads.bgv) r3
            int r3 = r3.mo11920f()
            if (r3 <= r7) goto L_0x0043
            r5.f4323l = r2
            return r2
        L_0x0043:
            com.google.android.gms.internal.ads.biv r7 = r5.f4314c
            com.google.android.gms.internal.ads.biv r3 = r5.f4314c
            com.google.android.gms.internal.ads.zzfs r6 = r6.f4191c
            int r6 = r3.mo11975a((com.google.android.gms.internal.ads.zzfs) r6)
            boolean r3 = r8 instanceof com.google.android.gms.internal.ads.bjn
            if (r3 == 0) goto L_0x005d
            r3 = r8
            com.google.android.gms.internal.ads.bjn r3 = (com.google.android.gms.internal.ads.bjn) r3
            int r3 = r3.f4494a
            if (r3 == r1) goto L_0x005e
            r1 = 410(0x19a, float:5.75E-43)
            if (r3 != r1) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r2 = 0
        L_0x005e:
            if (r2 == 0) goto L_0x00cf
            r0 = 60000(0xea60, double:2.9644E-319)
            boolean r0 = r7.mo11978a(r6, r0)
            com.google.android.gms.internal.ads.bjn r8 = (com.google.android.gms.internal.ads.bjn) r8
            int r8 = r8.f4494a
            if (r0 == 0) goto L_0x009e
            java.lang.String r1 = "ChunkedTrackBlacklist"
            com.google.android.gms.internal.ads.zzfs r6 = r7.mo11977a((int) r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = java.lang.String.valueOf(r6)
            int r7 = r7.length()
            int r7 = r7 + 77
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r7)
            java.lang.String r7 = "Blacklisted: duration=60000, responseCode="
            r2.append(r7)
            r2.append(r8)
            java.lang.String r7 = ", format="
            r2.append(r7)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            android.util.Log.w(r1, r6)
            goto L_0x00ce
        L_0x009e:
            java.lang.String r1 = "ChunkedTrackBlacklist"
            com.google.android.gms.internal.ads.zzfs r6 = r7.mo11977a((int) r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = java.lang.String.valueOf(r6)
            int r7 = r7.length()
            int r7 = r7 + 92
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r7)
            java.lang.String r7 = "Blacklisting failed (cannot blacklist last enabled track): responseCode="
            r2.append(r7)
            r2.append(r8)
            java.lang.String r7 = ", format="
            r2.append(r7)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            android.util.Log.w(r1, r6)
        L_0x00ce:
            return r0
        L_0x00cf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bhn.mo11919a(com.google.android.gms.internal.ads.bgl, boolean, java.lang.Exception):boolean");
    }

    /* renamed from: b */
    private final ArrayList<bhx> m5495b() {
        List<bhq> list = this.f4320i.mo11956a(this.f4321j).f4361c;
        ArrayList<bhx> arrayList = new ArrayList<>();
        for (int i : this.f4313b) {
            arrayList.addAll(list.get(i).f4333c);
        }
        return arrayList;
    }
}
