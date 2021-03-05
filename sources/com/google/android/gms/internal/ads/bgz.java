package com.google.android.gms.internal.ads;

import java.util.List;

final class bgz implements bfs, bgd<bgq<bgx>> {

    /* renamed from: a */
    final int f4248a;

    /* renamed from: b */
    private final bgy f4249b;

    /* renamed from: c */
    private final int f4250c;

    /* renamed from: d */
    private final bey f4251d;

    /* renamed from: e */
    private final long f4252e;

    /* renamed from: f */
    private final bju f4253f;

    /* renamed from: g */
    private final bjc f4254g;

    /* renamed from: h */
    private final bgh f4255h;

    /* renamed from: i */
    private final bha[] f4256i;

    /* renamed from: j */
    private bft f4257j;

    /* renamed from: k */
    private bgq<bgx>[] f4258k = new bgq[0];

    /* renamed from: l */
    private bfg f4259l = new bfg(this.f4258k);

    /* renamed from: m */
    private bhr f4260m;

    /* renamed from: n */
    private int f4261n;

    /* renamed from: o */
    private List<bhq> f4262o;

    /* JADX WARNING: type inference failed for: r2v14, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bgz(int r22, com.google.android.gms.internal.ads.bhr r23, int r24, com.google.android.gms.internal.ads.bgy r25, int r26, com.google.android.gms.internal.ads.bey r27, long r28, com.google.android.gms.internal.ads.bju r30, com.google.android.gms.internal.ads.bjc r31) {
        /*
            r21 = this;
            r0 = r21
            r21.<init>()
            r1 = r22
            r0.f4248a = r1
            r1 = r23
            r0.f4260m = r1
            r2 = r24
            r0.f4261n = r2
            r3 = r25
            r0.f4249b = r3
            r3 = r26
            r0.f4250c = r3
            r3 = r27
            r0.f4251d = r3
            r3 = r28
            r0.f4252e = r3
            r3 = r30
            r0.f4253f = r3
            r3 = r31
            r0.f4254g = r3
            r3 = 0
            com.google.android.gms.internal.ads.bgq[] r4 = new com.google.android.gms.internal.ads.bgq[r3]
            r0.f4258k = r4
            com.google.android.gms.internal.ads.bfg r4 = new com.google.android.gms.internal.ads.bfg
            com.google.android.gms.internal.ads.bgq<com.google.android.gms.internal.ads.bgx>[] r5 = r0.f4258k
            r4.<init>(r5)
            r0.f4259l = r4
            com.google.android.gms.internal.ads.bhv r1 = r23.mo11956a(r24)
            java.util.List<com.google.android.gms.internal.ads.bhq> r1 = r1.f4361c
            r0.f4262o = r1
            java.util.List<com.google.android.gms.internal.ads.bhq> r1 = r0.f4262o
            int r2 = r1.size()
            android.util.SparseIntArray r4 = new android.util.SparseIntArray
            r4.<init>(r2)
            r5 = 0
        L_0x004b:
            if (r5 >= r2) goto L_0x005b
            java.lang.Object r6 = r1.get(r5)
            com.google.android.gms.internal.ads.bhq r6 = (com.google.android.gms.internal.ads.bhq) r6
            int r6 = r6.f4331a
            r4.put(r6, r5)
            int r5 = r5 + 1
            goto L_0x004b
        L_0x005b:
            int[][] r5 = new int[r2][]
            boolean[] r6 = new boolean[r2]
            r7 = 0
            r8 = 0
        L_0x0061:
            r10 = 1
            if (r7 >= r2) goto L_0x00c6
            boolean r11 = r6[r7]
            if (r11 != 0) goto L_0x00c3
            r6[r7] = r10
            java.lang.Object r11 = r1.get(r7)
            com.google.android.gms.internal.ads.bhq r11 = (com.google.android.gms.internal.ads.bhq) r11
            java.util.List<com.google.android.gms.internal.ads.bhu> r11 = r11.f4335e
            r12 = 0
        L_0x0073:
            int r13 = r11.size()
            if (r12 >= r13) goto L_0x008e
            java.lang.Object r13 = r11.get(r12)
            com.google.android.gms.internal.ads.bhu r13 = (com.google.android.gms.internal.ads.bhu) r13
            java.lang.String r14 = "urn:mpeg:dash:adaptation-set-switching:2016"
            java.lang.String r15 = r13.f4356a
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x008b
            r9 = r13
            goto L_0x008f
        L_0x008b:
            int r12 = r12 + 1
            goto L_0x0073
        L_0x008e:
            r9 = 0
        L_0x008f:
            if (r9 != 0) goto L_0x009b
            int r9 = r8 + 1
            int[] r10 = new int[r10]
            r10[r3] = r7
            r5[r8] = r10
        L_0x0099:
            r8 = r9
            goto L_0x00c3
        L_0x009b:
            java.lang.String r9 = r9.f4357b
            java.lang.String r11 = ","
            java.lang.String[] r9 = r9.split(r11)
            int r11 = r9.length
            int r11 = r11 + r10
            int[] r11 = new int[r11]
            r11[r3] = r7
            r12 = 0
        L_0x00aa:
            int r13 = r9.length
            if (r12 >= r13) goto L_0x00be
            r13 = r9[r12]
            int r13 = java.lang.Integer.parseInt(r13)
            int r13 = r4.get(r13)
            r6[r13] = r10
            int r12 = r12 + 1
            r11[r12] = r13
            goto L_0x00aa
        L_0x00be:
            int r9 = r8 + 1
            r5[r8] = r11
            goto L_0x0099
        L_0x00c3:
            int r7 = r7 + 1
            goto L_0x0061
        L_0x00c6:
            if (r8 >= r2) goto L_0x00cf
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r5, r8)
            r5 = r2
            int[][] r5 = (int[][]) r5
        L_0x00cf:
            int r2 = r5.length
            boolean[] r4 = new boolean[r2]
            boolean[] r6 = new boolean[r2]
            r8 = r2
            r7 = 0
        L_0x00d6:
            if (r7 >= r2) goto L_0x0148
            r11 = r5[r7]
            int r12 = r11.length
            r13 = 0
        L_0x00dc:
            if (r13 >= r12) goto L_0x0105
            r14 = r11[r13]
            java.lang.Object r14 = r1.get(r14)
            com.google.android.gms.internal.ads.bhq r14 = (com.google.android.gms.internal.ads.bhq) r14
            java.util.List<com.google.android.gms.internal.ads.bhx> r14 = r14.f4333c
            r15 = 0
        L_0x00e9:
            int r9 = r14.size()
            if (r15 >= r9) goto L_0x0102
            java.lang.Object r9 = r14.get(r15)
            com.google.android.gms.internal.ads.bhx r9 = (com.google.android.gms.internal.ads.bhx) r9
            java.util.List<com.google.android.gms.internal.ads.bhu> r9 = r9.f4369d
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x00ff
            r9 = 1
            goto L_0x0106
        L_0x00ff:
            int r15 = r15 + 1
            goto L_0x00e9
        L_0x0102:
            int r13 = r13 + 1
            goto L_0x00dc
        L_0x0105:
            r9 = 0
        L_0x0106:
            if (r9 == 0) goto L_0x010c
            r4[r7] = r10
            int r8 = r8 + 1
        L_0x010c:
            r9 = r5[r7]
            int r11 = r9.length
            r12 = 0
        L_0x0110:
            if (r12 >= r11) goto L_0x013d
            r13 = r9[r12]
            java.lang.Object r13 = r1.get(r13)
            com.google.android.gms.internal.ads.bhq r13 = (com.google.android.gms.internal.ads.bhq) r13
            java.util.List<com.google.android.gms.internal.ads.bhu> r13 = r13.f4334d
            r14 = 0
        L_0x011d:
            int r15 = r13.size()
            if (r14 >= r15) goto L_0x0139
            java.lang.Object r15 = r13.get(r14)
            com.google.android.gms.internal.ads.bhu r15 = (com.google.android.gms.internal.ads.bhu) r15
            java.lang.String r3 = "urn:scte:dash:cc:cea-608:2015"
            java.lang.String r15 = r15.f4356a
            boolean r3 = r3.equals(r15)
            if (r3 == 0) goto L_0x0135
            r3 = 1
            goto L_0x013e
        L_0x0135:
            int r14 = r14 + 1
            r3 = 0
            goto L_0x011d
        L_0x0139:
            int r12 = r12 + 1
            r3 = 0
            goto L_0x0110
        L_0x013d:
            r3 = 0
        L_0x013e:
            if (r3 == 0) goto L_0x0144
            r6[r7] = r10
            int r8 = r8 + 1
        L_0x0144:
            int r7 = r7 + 1
            r3 = 0
            goto L_0x00d6
        L_0x0148:
            com.google.android.gms.internal.ads.bgf[] r3 = new com.google.android.gms.internal.ads.bgf[r8]
            com.google.android.gms.internal.ads.bha[] r7 = new com.google.android.gms.internal.ads.bha[r8]
            r8 = 0
            r9 = 0
        L_0x014e:
            if (r8 >= r2) goto L_0x026b
            r11 = r5[r8]
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            int r13 = r11.length
            r14 = 0
        L_0x0159:
            if (r14 >= r13) goto L_0x016b
            r15 = r11[r14]
            java.lang.Object r15 = r1.get(r15)
            com.google.android.gms.internal.ads.bhq r15 = (com.google.android.gms.internal.ads.bhq) r15
            java.util.List<com.google.android.gms.internal.ads.bhx> r15 = r15.f4333c
            r12.addAll(r15)
            int r14 = r14 + 1
            goto L_0x0159
        L_0x016b:
            int r13 = r12.size()
            com.google.android.gms.internal.ads.zzfs[] r13 = new com.google.android.gms.internal.ads.zzfs[r13]
            r14 = 0
        L_0x0172:
            int r15 = r13.length
            if (r14 >= r15) goto L_0x0182
            java.lang.Object r15 = r12.get(r14)
            com.google.android.gms.internal.ads.bhx r15 = (com.google.android.gms.internal.ads.bhx) r15
            com.google.android.gms.internal.ads.zzfs r15 = r15.f4366a
            r13[r14] = r15
            int r14 = r14 + 1
            goto L_0x0172
        L_0x0182:
            r14 = 0
            r12 = r11[r14]
            java.lang.Object r12 = r1.get(r12)
            com.google.android.gms.internal.ads.bhq r12 = (com.google.android.gms.internal.ads.bhq) r12
            boolean r14 = r4[r8]
            boolean r15 = r6[r8]
            com.google.android.gms.internal.ads.bgf r10 = new com.google.android.gms.internal.ads.bgf
            r10.<init>(r13)
            r3[r9] = r10
            int r10 = r9 + 1
            com.google.android.gms.internal.ads.bha r13 = new com.google.android.gms.internal.ads.bha
            r18 = r1
            int r1 = r12.f4332b
            r19 = 1
            r22 = r13
            r23 = r1
            r24 = r11
            r25 = r9
            r26 = r19
            r27 = r14
            r28 = r15
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r7[r9] = r13
            if (r14 == 0) goto L_0x0200
            int r1 = r12.f4331a
            r13 = 16
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r13)
            r14.append(r1)
            java.lang.String r1 = ":emsg"
            r14.append(r1)
            java.lang.String r1 = r14.toString()
            java.lang.String r13 = "application/x-emsg"
            r14 = -1
            r20 = r2
            r2 = 0
            com.google.android.gms.internal.ads.zzfs r1 = com.google.android.gms.internal.ads.zzfs.m8801a(r1, r13, r2, r14, r2)
            com.google.android.gms.internal.ads.bgf r13 = new com.google.android.gms.internal.ads.bgf
            r14 = 1
            com.google.android.gms.internal.ads.zzfs[] r2 = new com.google.android.gms.internal.ads.zzfs[r14]
            r14 = 0
            r2[r14] = r1
            r13.<init>(r2)
            r3[r10] = r13
            int r1 = r10 + 1
            com.google.android.gms.internal.ads.bha r2 = new com.google.android.gms.internal.ads.bha
            r13 = 4
            r14 = 0
            r16 = 0
            r19 = 0
            r22 = r2
            r23 = r13
            r24 = r11
            r25 = r9
            r26 = r14
            r27 = r16
            r28 = r19
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r7[r10] = r2
            r10 = r1
            goto L_0x0202
        L_0x0200:
            r20 = r2
        L_0x0202:
            if (r15 == 0) goto L_0x025f
            int r1 = r12.f4331a
            r2 = 18
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r2)
            r12.append(r1)
            java.lang.String r1 = ":cea608"
            r12.append(r1)
            java.lang.String r1 = r12.toString()
            java.lang.String r2 = "application/cea-608"
            r12 = 0
            r13 = -1
            r14 = 0
            r15 = 0
            r16 = 0
            r22 = r1
            r23 = r2
            r24 = r12
            r25 = r13
            r26 = r14
            r27 = r15
            r28 = r16
            com.google.android.gms.internal.ads.zzfs r1 = com.google.android.gms.internal.ads.zzfs.m8800a((java.lang.String) r22, (java.lang.String) r23, (java.lang.String) r24, (int) r25, (int) r26, (java.lang.String) r27, (com.google.android.gms.internal.ads.zzhp) r28)
            com.google.android.gms.internal.ads.bgf r2 = new com.google.android.gms.internal.ads.bgf
            r12 = 1
            com.google.android.gms.internal.ads.zzfs[] r13 = new com.google.android.gms.internal.ads.zzfs[r12]
            r14 = 0
            r13[r14] = r1
            r2.<init>(r13)
            r3[r10] = r2
            int r1 = r10 + 1
            com.google.android.gms.internal.ads.bha r2 = new com.google.android.gms.internal.ads.bha
            r13 = 3
            r15 = 0
            r16 = 0
            r17 = 0
            r22 = r2
            r23 = r13
            r24 = r11
            r25 = r9
            r26 = r15
            r27 = r16
            r28 = r17
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r7[r10] = r2
            r9 = r1
            goto L_0x0262
        L_0x025f:
            r12 = 1
            r14 = 0
            r9 = r10
        L_0x0262:
            int r8 = r8 + 1
            r1 = r18
            r2 = r20
            r10 = 1
            goto L_0x014e
        L_0x026b:
            com.google.android.gms.internal.ads.bgh r1 = new com.google.android.gms.internal.ads.bgh
            r1.<init>(r3)
            android.util.Pair r1 = android.util.Pair.create(r1, r7)
            java.lang.Object r2 = r1.first
            com.google.android.gms.internal.ads.bgh r2 = (com.google.android.gms.internal.ads.bgh) r2
            r0.f4255h = r2
            java.lang.Object r1 = r1.second
            com.google.android.gms.internal.ads.bha[] r1 = (com.google.android.gms.internal.ads.bha[]) r1
            r0.f4256i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bgz.<init>(int, com.google.android.gms.internal.ads.bhr, int, com.google.android.gms.internal.ads.bgy, int, com.google.android.gms.internal.ads.bey, long, com.google.android.gms.internal.ads.bju, com.google.android.gms.internal.ads.bjc):void");
    }

    /* renamed from: e */
    public final long mo11832e() {
        return -9223372036854775807L;
    }

    /* renamed from: a */
    public final void mo11924a(bhr bhr, int i) {
        this.f4260m = bhr;
        this.f4261n = i;
        this.f4262o = bhr.mo11956a(i).f4361c;
        if (this.f4258k != null) {
            for (bgq<bgx> c : this.f4258k) {
                c.mo11910c().mo11922a(bhr, i);
            }
            this.f4257j.mo11495a(this);
        }
    }

    /* renamed from: b */
    public final void mo11925b() {
        for (bgq<bgx> e : this.f4258k) {
            e.mo11913e();
        }
    }

    /* renamed from: a */
    public final void mo11822a(bft bft, long j) {
        this.f4257j = bft;
        bft.mo11493a(this);
    }

    /* renamed from: c */
    public final void mo11830c() {
        this.f4253f.mo12026c();
    }

    /* renamed from: d */
    public final bgh mo11831d() {
        return this.f4255h;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo11820a(com.google.android.gms.internal.ads.biv[] r30, boolean[] r31, com.google.android.gms.internal.ads.bgb[] r32, boolean[] r33, long r34) {
        /*
            r29 = this;
            r10 = r29
            r11 = r30
            r8 = r34
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            r14 = 0
            r6 = 0
        L_0x000d:
            int r0 = r11.length
            r1 = 0
            r15 = 1
            if (r6 >= r0) goto L_0x00ca
            r0 = r32[r6]
            boolean r0 = r0 instanceof com.google.android.gms.internal.ads.bgq
            if (r0 == 0) goto L_0x003e
            r0 = r32[r6]
            com.google.android.gms.internal.ads.bgq r0 = (com.google.android.gms.internal.ads.bgq) r0
            r2 = r11[r6]
            if (r2 == 0) goto L_0x0039
            boolean r2 = r31[r6]
            if (r2 != 0) goto L_0x0025
            goto L_0x0039
        L_0x0025:
            com.google.android.gms.internal.ads.bgh r1 = r10.f4255h
            r2 = r11[r6]
            com.google.android.gms.internal.ads.bgf r2 = r2.mo11976a()
            int r1 = r1.mo11893a((com.google.android.gms.internal.ads.bgf) r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13.put(r1, r0)
            goto L_0x003e
        L_0x0039:
            r0.mo11913e()
            r32[r6] = r1
        L_0x003e:
            r0 = r32[r6]
            if (r0 != 0) goto L_0x00c1
            r0 = r11[r6]
            if (r0 == 0) goto L_0x00c1
            com.google.android.gms.internal.ads.bgh r0 = r10.f4255h
            r1 = r11[r6]
            com.google.android.gms.internal.ads.bgf r1 = r1.mo11976a()
            int r16 = r0.mo11893a((com.google.android.gms.internal.ads.bgf) r1)
            com.google.android.gms.internal.ads.bha[] r0 = r10.f4256i
            r0 = r0[r16]
            boolean r1 = r0.f4265c
            if (r1 == 0) goto L_0x00c1
            r22 = r11[r6]
            r1 = 2
            int[] r2 = new int[r1]
            boolean r3 = r0.f4267e
            if (r3 == 0) goto L_0x0068
            r4 = 4
            r2[r14] = r4
            r4 = 1
            goto L_0x0069
        L_0x0068:
            r4 = 0
        L_0x0069:
            boolean r5 = r0.f4268f
            if (r5 == 0) goto L_0x0074
            int r7 = r4 + 1
            r17 = 3
            r2[r4] = r17
            r4 = r7
        L_0x0074:
            if (r4 >= r1) goto L_0x007b
            int[] r1 = java.util.Arrays.copyOf(r2, r4)
            r2 = r1
        L_0x007b:
            com.google.android.gms.internal.ads.bgy r1 = r10.f4249b
            com.google.android.gms.internal.ads.bju r4 = r10.f4253f
            com.google.android.gms.internal.ads.bhr r7 = r10.f4260m
            r28 = r6
            int r6 = r10.f4261n
            int[] r8 = r0.f4263a
            int r9 = r0.f4264b
            long r11 = r10.f4252e
            r17 = r1
            r18 = r4
            r19 = r7
            r20 = r6
            r21 = r8
            r23 = r9
            r24 = r11
            r26 = r3
            r27 = r5
            com.google.android.gms.internal.ads.bgx r3 = r17.mo11923a(r18, r19, r20, r21, r22, r23, r24, r26, r27)
            com.google.android.gms.internal.ads.bgq r11 = new com.google.android.gms.internal.ads.bgq
            int r1 = r0.f4264b
            com.google.android.gms.internal.ads.bjc r5 = r10.f4254g
            int r8 = r10.f4250c
            com.google.android.gms.internal.ads.bey r9 = r10.f4251d
            r0 = r11
            r4 = r29
            r12 = r28
            r6 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r13.put(r0, r11)
            r32[r12] = r11
            r33[r12] = r15
            goto L_0x00c2
        L_0x00c1:
            r12 = r6
        L_0x00c2:
            int r6 = r12 + 1
            r8 = r34
            r11 = r30
            goto L_0x000d
        L_0x00ca:
            r0 = r30
            r2 = 0
        L_0x00cd:
            int r3 = r0.length
            if (r2 >= r3) goto L_0x0145
            r3 = r32[r2]
            boolean r3 = r3 instanceof com.google.android.gms.internal.ads.bgr
            if (r3 != 0) goto L_0x00dc
            r3 = r32[r2]
            boolean r3 = r3 instanceof com.google.android.gms.internal.ads.bfh
            if (r3 == 0) goto L_0x00eb
        L_0x00dc:
            r3 = r0[r2]
            if (r3 == 0) goto L_0x00e4
            boolean r4 = r31[r2]
            if (r4 != 0) goto L_0x00eb
        L_0x00e4:
            r4 = r32[r2]
            m5431a((com.google.android.gms.internal.ads.bgb) r4)
            r32[r2] = r1
        L_0x00eb:
            r4 = r0[r2]
            if (r4 == 0) goto L_0x0140
            com.google.android.gms.internal.ads.bgh r4 = r10.f4255h
            r5 = r0[r2]
            com.google.android.gms.internal.ads.bgf r5 = r5.mo11976a()
            int r4 = r4.mo11893a((com.google.android.gms.internal.ads.bgf) r5)
            com.google.android.gms.internal.ads.bha[] r5 = r10.f4256i
            r4 = r5[r4]
            boolean r5 = r4.f4265c
            if (r5 != 0) goto L_0x0140
            int r5 = r4.f4266d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r13.get(r5)
            com.google.android.gms.internal.ads.bgq r5 = (com.google.android.gms.internal.ads.bgq) r5
            r6 = r32[r2]
            if (r5 != 0) goto L_0x0116
            boolean r7 = r6 instanceof com.google.android.gms.internal.ads.bfh
            goto L_0x0124
        L_0x0116:
            boolean r7 = r6 instanceof com.google.android.gms.internal.ads.bgr
            if (r7 == 0) goto L_0x0123
            r7 = r6
            com.google.android.gms.internal.ads.bgr r7 = (com.google.android.gms.internal.ads.bgr) r7
            com.google.android.gms.internal.ads.bgq<T> r7 = r7.f4229a
            if (r7 != r5) goto L_0x0123
            r7 = 1
            goto L_0x0124
        L_0x0123:
            r7 = 0
        L_0x0124:
            if (r7 != 0) goto L_0x0140
            m5431a((com.google.android.gms.internal.ads.bgb) r6)
            if (r5 != 0) goto L_0x0133
            com.google.android.gms.internal.ads.bfh r4 = new com.google.android.gms.internal.ads.bfh
            r4.<init>()
            r6 = r34
            goto L_0x013b
        L_0x0133:
            int r4 = r4.f4264b
            r6 = r34
            com.google.android.gms.internal.ads.bgr r4 = r5.mo11908a(r6, r4)
        L_0x013b:
            r32[r2] = r4
            r33[r2] = r15
            goto L_0x0142
        L_0x0140:
            r6 = r34
        L_0x0142:
            int r2 = r2 + 1
            goto L_0x00cd
        L_0x0145:
            r6 = r34
            int r0 = r13.size()
            com.google.android.gms.internal.ads.bgq[] r0 = new com.google.android.gms.internal.ads.bgq[r0]
            r10.f4258k = r0
            java.util.Collection r0 = r13.values()
            com.google.android.gms.internal.ads.bgq<com.google.android.gms.internal.ads.bgx>[] r1 = r10.f4258k
            r0.toArray(r1)
            com.google.android.gms.internal.ads.bfg r0 = new com.google.android.gms.internal.ads.bfg
            com.google.android.gms.internal.ads.bgq<com.google.android.gms.internal.ads.bgx>[] r1 = r10.f4258k
            r0.<init>(r1)
            r10.f4259l = r0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bgz.mo11820a(com.google.android.gms.internal.ads.biv[], boolean[], com.google.android.gms.internal.ads.bgb[], boolean[], long):long");
    }

    /* renamed from: b */
    public final void mo11828b(long j) {
        for (bgq<bgx> b : this.f4258k) {
            b.mo11909b(j);
        }
    }

    /* renamed from: a */
    public final boolean mo11812a(long j) {
        return this.f4259l.mo11812a(j);
    }

    /* renamed from: a_ */
    public final long mo11813a_() {
        return this.f4259l.mo11813a_();
    }

    /* renamed from: f */
    public final long mo11833f() {
        long j = Long.MAX_VALUE;
        for (bgq<bgx> d : this.f4258k) {
            long d2 = d.mo11912d();
            if (d2 != Long.MIN_VALUE) {
                j = Math.min(j, d2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: c */
    public final long mo11829c(long j) {
        for (bgq<bgx> c : this.f4258k) {
            c.mo11911c(j);
        }
        return j;
    }

    /* renamed from: a */
    private static void m5431a(bgb bgb) {
        if (bgb instanceof bgr) {
            ((bgr) bgb).mo11915c();
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo11495a(bgc bgc) {
        this.f4257j.mo11495a(this);
    }
}
