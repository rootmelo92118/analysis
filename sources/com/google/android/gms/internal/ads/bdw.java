package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Stack;

public final class bdw implements bcg, bco {

    /* renamed from: a */
    private static final bck f3860a = new bdx();

    /* renamed from: b */
    private static final int f3861b = bkp.m5828f("qt  ");

    /* renamed from: c */
    private final bkh f3862c = new bkh(bke.f4541a);

    /* renamed from: d */
    private final bkh f3863d = new bkh(4);

    /* renamed from: e */
    private final bkh f3864e = new bkh(16);

    /* renamed from: f */
    private final Stack<bde> f3865f = new Stack<>();

    /* renamed from: g */
    private int f3866g;

    /* renamed from: h */
    private int f3867h;

    /* renamed from: i */
    private long f3868i;

    /* renamed from: j */
    private int f3869j;

    /* renamed from: k */
    private bkh f3870k;

    /* renamed from: l */
    private int f3871l;

    /* renamed from: m */
    private int f3872m;

    /* renamed from: n */
    private bcj f3873n;

    /* renamed from: o */
    private bdy[] f3874o;

    /* renamed from: p */
    private long f3875p;

    /* renamed from: q */
    private boolean f3876q;

    /* renamed from: a */
    public final boolean mo11666a() {
        return true;
    }

    /* renamed from: c */
    public final void mo11687c() {
    }

    /* renamed from: a */
    public final boolean mo11686a(bci bci) {
        return bea.m5085b(bci);
    }

    /* renamed from: a */
    public final void mo11685a(bcj bcj) {
        this.f3873n = bcj;
    }

    /* renamed from: a */
    public final void mo11684a(long j, long j2) {
        this.f3865f.clear();
        this.f3869j = 0;
        this.f3871l = 0;
        this.f3872m = 0;
        if (j == 0) {
            m5069d();
        } else if (this.f3874o != null) {
            for (bdy bdy : this.f3874o) {
                bee bee = bdy.f3878b;
                int a = bee.mo11732a(j2);
                if (a == -1) {
                    a = bee.mo11733b(j2);
                }
                bdy.f3880d = a;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:148:0x019e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02b3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x019a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo11683a(com.google.android.gms.internal.ads.bci r25, com.google.android.gms.internal.ads.bcn r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
        L_0x0006:
            int r3 = r0.f3866g
            r5 = 262144(0x40000, double:1.295163E-318)
            r8 = -1
            r9 = 8
            r10 = 1
            switch(r3) {
                case 0: goto L_0x01a0;
                case 1: goto L_0x0119;
                case 2: goto L_0x0018;
                default: goto L_0x0012;
            }
        L_0x0012:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0018:
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = 0
            r9 = -1
        L_0x001f:
            com.google.android.gms.internal.ads.bdy[] r14 = r0.f3874o
            int r14 = r14.length
            if (r3 >= r14) goto L_0x003f
            com.google.android.gms.internal.ads.bdy[] r14 = r0.f3874o
            r14 = r14[r3]
            int r15 = r14.f3880d
            com.google.android.gms.internal.ads.bee r7 = r14.f3878b
            int r7 = r7.f3915a
            if (r15 == r7) goto L_0x003c
            com.google.android.gms.internal.ads.bee r7 = r14.f3878b
            long[] r7 = r7.f3916b
            r14 = r7[r15]
            int r7 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r7 >= 0) goto L_0x003c
            r9 = r3
            r12 = r14
        L_0x003c:
            int r3 = r3 + 1
            goto L_0x001f
        L_0x003f:
            if (r9 != r8) goto L_0x0042
            return r8
        L_0x0042:
            com.google.android.gms.internal.ads.bdy[] r3 = r0.f3874o
            r3 = r3[r9]
            com.google.android.gms.internal.ads.bcq r7 = r3.f3879c
            int r8 = r3.f3880d
            com.google.android.gms.internal.ads.bee r9 = r3.f3878b
            long[] r9 = r9.f3916b
            r12 = r9[r8]
            com.google.android.gms.internal.ads.bee r9 = r3.f3878b
            int[] r9 = r9.f3917c
            r9 = r9[r8]
            com.google.android.gms.internal.ads.beb r14 = r3.f3877a
            int r14 = r14.f3888g
            if (r14 != r10) goto L_0x0061
            r14 = 8
            long r12 = r12 + r14
            int r9 = r9 + -8
        L_0x0061:
            long r14 = r25.mo11673b()
            long r14 = r12 - r14
            int r4 = r0.f3871l
            long r10 = (long) r4
            long r14 = r14 + r10
            r10 = 0
            int r4 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r4 < 0) goto L_0x0115
            int r4 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x0077
            goto L_0x0115
        L_0x0077:
            int r2 = (int) r14
            r1.mo11674b(r2)
            com.google.android.gms.internal.ads.beb r2 = r3.f3877a
            int r2 = r2.f3892k
            if (r2 == 0) goto L_0x00da
            com.google.android.gms.internal.ads.bkh r2 = r0.f3863d
            byte[] r2 = r2.f4559a
            r4 = 0
            r2[r4] = r4
            r5 = 1
            r2[r5] = r4
            r5 = 2
            r2[r5] = r4
            com.google.android.gms.internal.ads.beb r2 = r3.f3877a
            int r2 = r2.f3892k
            com.google.android.gms.internal.ads.beb r4 = r3.f3877a
            int r4 = r4.f3892k
            r5 = 4
            int r4 = 4 - r4
        L_0x0099:
            int r5 = r0.f3871l
            if (r5 >= r9) goto L_0x00f2
            int r5 = r0.f3872m
            if (r5 != 0) goto L_0x00c8
            com.google.android.gms.internal.ads.bkh r5 = r0.f3863d
            byte[] r5 = r5.f4559a
            r1.mo11675b(r5, r4, r2)
            com.google.android.gms.internal.ads.bkh r5 = r0.f3863d
            r6 = 0
            r5.mo12054c(r6)
            com.google.android.gms.internal.ads.bkh r5 = r0.f3863d
            int r5 = r5.mo12068o()
            r0.f3872m = r5
            com.google.android.gms.internal.ads.bkh r5 = r0.f3862c
            r5.mo12054c(r6)
            com.google.android.gms.internal.ads.bkh r5 = r0.f3862c
            r10 = 4
            r7.mo11681a(r5, r10)
            int r5 = r0.f3871l
            int r5 = r5 + r10
            r0.f3871l = r5
            int r9 = r9 + r4
            goto L_0x0099
        L_0x00c8:
            r6 = 0
            int r5 = r0.f3872m
            int r5 = r7.mo11679a(r1, r5, r6)
            int r6 = r0.f3871l
            int r6 = r6 + r5
            r0.f3871l = r6
            int r6 = r0.f3872m
            int r6 = r6 - r5
            r0.f3872m = r6
            goto L_0x0099
        L_0x00da:
            int r2 = r0.f3871l
            if (r2 >= r9) goto L_0x00f2
            int r2 = r0.f3871l
            int r2 = r9 - r2
            r4 = 0
            int r2 = r7.mo11679a(r1, r2, r4)
            int r4 = r0.f3871l
            int r4 = r4 + r2
            r0.f3871l = r4
            int r4 = r0.f3872m
            int r4 = r4 - r2
            r0.f3872m = r4
            goto L_0x00da
        L_0x00f2:
            r20 = r9
            com.google.android.gms.internal.ads.bee r1 = r3.f3878b
            long[] r1 = r1.f3919e
            r17 = r1[r8]
            com.google.android.gms.internal.ads.bee r1 = r3.f3878b
            int[] r1 = r1.f3920f
            r19 = r1[r8]
            r21 = 0
            r22 = 0
            r16 = r7
            r16.mo11680a(r17, r19, r20, r21, r22)
            int r1 = r3.f3880d
            r4 = 1
            int r1 = r1 + r4
            r3.f3880d = r1
            r1 = 0
            r0.f3871l = r1
            r0.f3872m = r1
            return r1
        L_0x0115:
            r4 = 1
            r2.f3528a = r12
            return r4
        L_0x0119:
            long r3 = r0.f3868i
            int r7 = r0.f3869j
            long r7 = (long) r7
            long r3 = r3 - r7
            long r7 = r25.mo11673b()
            long r7 = r7 + r3
            com.google.android.gms.internal.ads.bkh r10 = r0.f3870k
            if (r10 == 0) goto L_0x017b
            com.google.android.gms.internal.ads.bkh r5 = r0.f3870k
            byte[] r5 = r5.f4559a
            int r6 = r0.f3869j
            int r3 = (int) r3
            r1.mo11675b(r5, r6, r3)
            int r3 = r0.f3867h
            int r4 = com.google.android.gms.internal.ads.bdd.f3672a
            if (r3 != r4) goto L_0x015e
            com.google.android.gms.internal.ads.bkh r3 = r0.f3870k
            r3.mo12054c(r9)
            int r4 = r3.mo12065l()
            int r5 = f3861b
            if (r4 != r5) goto L_0x0147
        L_0x0145:
            r3 = 1
            goto L_0x015b
        L_0x0147:
            r4 = 4
            r3.mo12056d(r4)
        L_0x014b:
            int r4 = r3.mo12051b()
            if (r4 <= 0) goto L_0x015a
            int r4 = r3.mo12065l()
            int r5 = f3861b
            if (r4 != r5) goto L_0x014b
            goto L_0x0145
        L_0x015a:
            r3 = 0
        L_0x015b:
            r0.f3876q = r3
            goto L_0x0183
        L_0x015e:
            java.util.Stack<com.google.android.gms.internal.ads.bde> r3 = r0.f3865f
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0183
            java.util.Stack<com.google.android.gms.internal.ads.bde> r3 = r0.f3865f
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.bde r3 = (com.google.android.gms.internal.ads.bde) r3
            com.google.android.gms.internal.ads.bdf r4 = new com.google.android.gms.internal.ads.bdf
            int r5 = r0.f3867h
            com.google.android.gms.internal.ads.bkh r6 = r0.f3870k
            r4.<init>(r5, r6)
            r3.mo11720a((com.google.android.gms.internal.ads.bdf) r4)
            goto L_0x0183
        L_0x017b:
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 >= 0) goto L_0x0185
            int r3 = (int) r3
            r1.mo11674b(r3)
        L_0x0183:
            r3 = 0
            goto L_0x018d
        L_0x0185:
            long r5 = r25.mo11673b()
            long r5 = r5 + r3
            r2.f3528a = r5
            r3 = 1
        L_0x018d:
            r0.m5068a((long) r7)
            if (r3 == 0) goto L_0x019a
            int r3 = r0.f3866g
            r4 = 2
            if (r3 == r4) goto L_0x019a
            r23 = 1
            goto L_0x019c
        L_0x019a:
            r23 = 0
        L_0x019c:
            if (r23 == 0) goto L_0x0006
            r3 = 1
            return r3
        L_0x01a0:
            r3 = 1
            int r4 = r0.f3869j
            if (r4 != 0) goto L_0x01ca
            com.google.android.gms.internal.ads.bkh r4 = r0.f3864e
            byte[] r4 = r4.f4559a
            r5 = 0
            boolean r4 = r1.mo11672a(r4, r5, r9, r3)
            if (r4 != 0) goto L_0x01b3
            r3 = 0
            goto L_0x02b1
        L_0x01b3:
            r0.f3869j = r9
            com.google.android.gms.internal.ads.bkh r3 = r0.f3864e
            r3.mo12054c(r5)
            com.google.android.gms.internal.ads.bkh r3 = r0.f3864e
            long r3 = r3.mo12063j()
            r0.f3868i = r3
            com.google.android.gms.internal.ads.bkh r3 = r0.f3864e
            int r3 = r3.mo12065l()
            r0.f3867h = r3
        L_0x01ca:
            long r3 = r0.f3868i
            r5 = 1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01e6
            com.google.android.gms.internal.ads.bkh r3 = r0.f3864e
            byte[] r3 = r3.f4559a
            r1.mo11675b(r3, r9, r9)
            int r3 = r0.f3869j
            int r3 = r3 + r9
            r0.f3869j = r3
            com.google.android.gms.internal.ads.bkh r3 = r0.f3864e
            long r3 = r3.mo12069p()
            r0.f3868i = r3
        L_0x01e6:
            int r3 = r0.f3867h
            int r4 = com.google.android.gms.internal.ads.bdd.f3647B
            if (r3 == r4) goto L_0x0203
            int r4 = com.google.android.gms.internal.ads.bdd.f3649D
            if (r3 == r4) goto L_0x0203
            int r4 = com.google.android.gms.internal.ads.bdd.f3650E
            if (r3 == r4) goto L_0x0203
            int r4 = com.google.android.gms.internal.ads.bdd.f3651F
            if (r3 == r4) goto L_0x0203
            int r4 = com.google.android.gms.internal.ads.bdd.f3652G
            if (r3 == r4) goto L_0x0203
            int r4 = com.google.android.gms.internal.ads.bdd.f3661P
            if (r3 != r4) goto L_0x0201
            goto L_0x0203
        L_0x0201:
            r3 = 0
            goto L_0x0204
        L_0x0203:
            r3 = 1
        L_0x0204:
            if (r3 == 0) goto L_0x0230
            long r3 = r25.mo11673b()
            long r5 = r0.f3868i
            long r3 = r3 + r5
            int r5 = r0.f3869j
            long r5 = (long) r5
            long r3 = r3 - r5
            java.util.Stack<com.google.android.gms.internal.ads.bde> r5 = r0.f3865f
            com.google.android.gms.internal.ads.bde r6 = new com.google.android.gms.internal.ads.bde
            int r7 = r0.f3867h
            r6.<init>(r7, r3)
            r5.add(r6)
            long r5 = r0.f3868i
            int r7 = r0.f3869j
            long r9 = (long) r7
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x022c
            r0.m5068a((long) r3)
        L_0x0229:
            r3 = 1
            goto L_0x02b1
        L_0x022c:
            r24.m5069d()
            goto L_0x0229
        L_0x0230:
            int r3 = r0.f3867h
            int r4 = com.google.android.gms.internal.ads.bdd.f3663R
            if (r3 == r4) goto L_0x0275
            int r4 = com.google.android.gms.internal.ads.bdd.f3648C
            if (r3 == r4) goto L_0x0275
            int r4 = com.google.android.gms.internal.ads.bdd.f3664S
            if (r3 == r4) goto L_0x0275
            int r4 = com.google.android.gms.internal.ads.bdd.f3665T
            if (r3 == r4) goto L_0x0275
            int r4 = com.google.android.gms.internal.ads.bdd.f3699al
            if (r3 == r4) goto L_0x0275
            int r4 = com.google.android.gms.internal.ads.bdd.f3700am
            if (r3 == r4) goto L_0x0275
            int r4 = com.google.android.gms.internal.ads.bdd.f3701an
            if (r3 == r4) goto L_0x0275
            int r4 = com.google.android.gms.internal.ads.bdd.f3662Q
            if (r3 == r4) goto L_0x0275
            int r4 = com.google.android.gms.internal.ads.bdd.f3702ao
            if (r3 == r4) goto L_0x0275
            int r4 = com.google.android.gms.internal.ads.bdd.f3703ap
            if (r3 == r4) goto L_0x0275
            int r4 = com.google.android.gms.internal.ads.bdd.f3704aq
            if (r3 == r4) goto L_0x0275
            int r4 = com.google.android.gms.internal.ads.bdd.f3705ar
            if (r3 == r4) goto L_0x0275
            int r4 = com.google.android.gms.internal.ads.bdd.f3706as
            if (r3 == r4) goto L_0x0275
            int r4 = com.google.android.gms.internal.ads.bdd.f3660O
            if (r3 == r4) goto L_0x0275
            int r4 = com.google.android.gms.internal.ads.bdd.f3672a
            if (r3 == r4) goto L_0x0275
            int r4 = com.google.android.gms.internal.ads.bdd.f3713az
            if (r3 != r4) goto L_0x0273
            goto L_0x0275
        L_0x0273:
            r3 = 0
            goto L_0x0276
        L_0x0275:
            r3 = 1
        L_0x0276:
            if (r3 == 0) goto L_0x02ab
            int r3 = r0.f3869j
            if (r3 != r9) goto L_0x027e
            r3 = 1
            goto L_0x027f
        L_0x027e:
            r3 = 0
        L_0x027f:
            com.google.android.gms.internal.ads.bjy.m5691b(r3)
            long r3 = r0.f3868i
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x028d
            r3 = 1
            goto L_0x028e
        L_0x028d:
            r3 = 0
        L_0x028e:
            com.google.android.gms.internal.ads.bjy.m5691b(r3)
            com.google.android.gms.internal.ads.bkh r3 = new com.google.android.gms.internal.ads.bkh
            long r4 = r0.f3868i
            int r4 = (int) r4
            r3.<init>((int) r4)
            r0.f3870k = r3
            com.google.android.gms.internal.ads.bkh r3 = r0.f3864e
            byte[] r3 = r3.f4559a
            com.google.android.gms.internal.ads.bkh r4 = r0.f3870k
            byte[] r4 = r4.f4559a
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r4, r5, r9)
            r3 = 1
            r0.f3866g = r3
            goto L_0x02b1
        L_0x02ab:
            r3 = 1
            r4 = 0
            r0.f3870k = r4
            r0.f3866g = r3
        L_0x02b1:
            if (r3 != 0) goto L_0x0006
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bdw.mo11683a(com.google.android.gms.internal.ads.bci, com.google.android.gms.internal.ads.bcn):int");
    }

    /* renamed from: b */
    public final long mo11667b() {
        return this.f3875p;
    }

    /* renamed from: b */
    public final long mo11668b(long j) {
        long j2 = Long.MAX_VALUE;
        for (bdy bdy : this.f3874o) {
            bee bee = bdy.f3878b;
            int a = bee.mo11732a(j);
            if (a == -1) {
                a = bee.mo11733b(j);
            }
            long j3 = bee.f3916b[a];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    /* renamed from: d */
    private final void m5069d() {
        this.f3866g = 0;
        this.f3869j = 0;
    }

    /* renamed from: a */
    private final void m5068a(long j) {
        beb a;
        while (!this.f3865f.isEmpty() && this.f3865f.peek().f3740aP == j) {
            bde pop = this.f3865f.pop();
            if (pop.f3739aO == bdd.f3647B) {
                long j2 = -9223372036854775807L;
                ArrayList arrayList = new ArrayList();
                zzki zzki = null;
                bcl bcl = new bcl();
                bdf d = pop.mo11721d(bdd.f3713az);
                if (!(d == null || (zzki = bdg.m5037a(d, this.f3876q)) == null)) {
                    bcl.mo11692a(zzki);
                }
                for (int i = 0; i < pop.f3742aR.size(); i++) {
                    bde bde = pop.f3742aR.get(i);
                    if (bde.f3739aO == bdd.f3649D && (a = bdg.m5035a(bde, pop.mo11721d(bdd.f3648C), -9223372036854775807L, (zzhp) null, this.f3876q)) != null) {
                        bee a2 = bdg.m5036a(a, bde.mo11722e(bdd.f3650E).mo11722e(bdd.f3651F).mo11722e(bdd.f3652G), bcl);
                        if (a2.f3915a != 0) {
                            bdy bdy = new bdy(a, a2, this.f3873n.mo11688a(i, a.f3883b));
                            zzfs a3 = a.f3887f.mo13405a(a2.f3918d + 30);
                            if (a.f3883b == 1) {
                                if (bcl.mo11691a()) {
                                    a3 = a3.mo13406a(bcl.f3526a, bcl.f3527b);
                                }
                                if (zzki != null) {
                                    a3 = a3.mo13410a(zzki);
                                }
                            }
                            bdy.f3879c.mo11682a(a3);
                            j2 = Math.max(j2, a.f3886e);
                            arrayList.add(bdy);
                        }
                    }
                }
                this.f3875p = j2;
                this.f3874o = (bdy[]) arrayList.toArray(new bdy[arrayList.size()]);
                this.f3873n.mo11689a();
                this.f3873n.mo11690a(this);
                this.f3865f.clear();
                this.f3866g = 2;
            } else if (!this.f3865f.isEmpty()) {
                this.f3865f.peek().mo11719a(pop);
            }
        }
        if (this.f3866g != 2) {
            m5069d();
        }
    }
}
