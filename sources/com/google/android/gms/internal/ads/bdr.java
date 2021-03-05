package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzhp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.UUID;

public final class bdr implements bcg {

    /* renamed from: a */
    private static final bck f3786a = new bds();

    /* renamed from: b */
    private static final int f3787b = bkp.m5828f("seig");

    /* renamed from: c */
    private static final byte[] f3788c = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: A */
    private int f3789A;

    /* renamed from: B */
    private int f3790B;

    /* renamed from: C */
    private boolean f3791C;

    /* renamed from: D */
    private bcj f3792D;

    /* renamed from: E */
    private bcq f3793E;

    /* renamed from: F */
    private bcq[] f3794F;

    /* renamed from: G */
    private boolean f3795G;

    /* renamed from: d */
    private final int f3796d;

    /* renamed from: e */
    private final beb f3797e;

    /* renamed from: f */
    private final SparseArray<bdu> f3798f;

    /* renamed from: g */
    private final bkh f3799g;

    /* renamed from: h */
    private final bkh f3800h;

    /* renamed from: i */
    private final bkh f3801i;

    /* renamed from: j */
    private final bkh f3802j;

    /* renamed from: k */
    private final bkm f3803k;

    /* renamed from: l */
    private final bkh f3804l;

    /* renamed from: m */
    private final byte[] f3805m;

    /* renamed from: n */
    private final Stack<bde> f3806n;

    /* renamed from: o */
    private final LinkedList<bdt> f3807o;

    /* renamed from: p */
    private int f3808p;

    /* renamed from: q */
    private int f3809q;

    /* renamed from: r */
    private long f3810r;

    /* renamed from: s */
    private int f3811s;

    /* renamed from: t */
    private bkh f3812t;

    /* renamed from: u */
    private long f3813u;

    /* renamed from: v */
    private int f3814v;

    /* renamed from: w */
    private long f3815w;

    /* renamed from: x */
    private long f3816x;

    /* renamed from: y */
    private bdu f3817y;

    /* renamed from: z */
    private int f3818z;

    public bdr() {
        this(0);
    }

    /* renamed from: c */
    public final void mo11687c() {
    }

    public bdr(int i) {
        this(i, (bkm) null);
    }

    private bdr(int i, bkm bkm) {
        this(i, (bkm) null, (beb) null);
    }

    private bdr(int i, bkm bkm, beb beb) {
        this.f3796d = i;
        this.f3803k = null;
        this.f3797e = null;
        this.f3804l = new bkh(16);
        this.f3799g = new bkh(bke.f4541a);
        this.f3800h = new bkh(5);
        this.f3801i = new bkh();
        this.f3802j = new bkh(1);
        this.f3805m = new byte[16];
        this.f3806n = new Stack<>();
        this.f3807o = new LinkedList<>();
        this.f3798f = new SparseArray<>();
        this.f3815w = -9223372036854775807L;
        this.f3816x = -9223372036854775807L;
        m5052a();
    }

    /* renamed from: a */
    public final boolean mo11686a(bci bci) {
        return bea.m5083a(bci);
    }

    /* renamed from: a */
    public final void mo11685a(bcj bcj) {
        this.f3792D = bcj;
    }

    /* renamed from: a */
    public final void mo11684a(long j, long j2) {
        int size = this.f3798f.size();
        for (int i = 0; i < size; i++) {
            this.f3798f.valueAt(i).mo11728a();
        }
        this.f3807o.clear();
        this.f3814v = 0;
        this.f3806n.clear();
        m5052a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:254:0x0610 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0370 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0004 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0004 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo11683a(com.google.android.gms.internal.ads.bci r29, com.google.android.gms.internal.ads.bcn r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
        L_0x0004:
            int r2 = r0.f3808p
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5 = 3
            r6 = 2
            r7 = 4
            r8 = 0
            r9 = 8
            r11 = 0
            switch(r2) {
                case 0: goto L_0x01e1;
                case 1: goto L_0x007f;
                case 2: goto L_0x0028;
                default: goto L_0x0015;
            }
        L_0x0015:
            int r2 = r0.f3808p
            if (r2 != r5) goto L_0x0469
            com.google.android.gms.internal.ads.bdu r2 = r0.f3817y
            if (r2 != 0) goto L_0x03de
            android.util.SparseArray<com.google.android.gms.internal.ads.bdu> r2 = r0.f3798f
            int r7 = r2.size()
            r12 = r3
            r4 = r8
            r3 = 0
            goto L_0x0382
        L_0x0028:
            android.util.SparseArray<com.google.android.gms.internal.ads.bdu> r2 = r0.f3798f
            int r2 = r2.size()
            r6 = r3
            r3 = 0
        L_0x0030:
            if (r3 >= r2) goto L_0x0054
            android.util.SparseArray<com.google.android.gms.internal.ads.bdu> r4 = r0.f3798f
            java.lang.Object r4 = r4.valueAt(r3)
            com.google.android.gms.internal.ads.bdu r4 = (com.google.android.gms.internal.ads.bdu) r4
            com.google.android.gms.internal.ads.bed r4 = r4.f3821a
            boolean r9 = r4.f3913r
            if (r9 == 0) goto L_0x0051
            long r9 = r4.f3899d
            int r12 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r12 >= 0) goto L_0x0051
            long r6 = r4.f3899d
            android.util.SparseArray<com.google.android.gms.internal.ads.bdu> r4 = r0.f3798f
            java.lang.Object r4 = r4.valueAt(r3)
            com.google.android.gms.internal.ads.bdu r4 = (com.google.android.gms.internal.ads.bdu) r4
            r8 = r4
        L_0x0051:
            int r3 = r3 + 1
            goto L_0x0030
        L_0x0054:
            if (r8 != 0) goto L_0x0059
            r0.f3808p = r5
            goto L_0x0004
        L_0x0059:
            long r2 = r29.mo11673b()
            long r6 = r6 - r2
            int r2 = (int) r6
            if (r2 < 0) goto L_0x0077
            r1.mo11674b(r2)
            com.google.android.gms.internal.ads.bed r2 = r8.f3821a
            com.google.android.gms.internal.ads.bkh r3 = r2.f3912q
            byte[] r3 = r3.f4559a
            int r4 = r2.f3911p
            r1.mo11675b(r3, r11, r4)
            com.google.android.gms.internal.ads.bkh r3 = r2.f3912q
            r3.mo12054c(r11)
            r2.f3913r = r11
            goto L_0x0004
        L_0x0077:
            com.google.android.gms.internal.ads.bad r1 = new com.google.android.gms.internal.ads.bad
            java.lang.String r2 = "Offset to encryption data was negative."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x007f:
            long r2 = r0.f3810r
            int r2 = (int) r2
            int r3 = r0.f3811s
            int r2 = r2 - r3
            com.google.android.gms.internal.ads.bkh r3 = r0.f3812t
            if (r3 == 0) goto L_0x01d5
            com.google.android.gms.internal.ads.bkh r3 = r0.f3812t
            byte[] r3 = r3.f4559a
            r1.mo11675b(r3, r9, r2)
            com.google.android.gms.internal.ads.bdf r2 = new com.google.android.gms.internal.ads.bdf
            int r3 = r0.f3809q
            com.google.android.gms.internal.ads.bkh r4 = r0.f3812t
            r2.<init>(r3, r4)
            long r3 = r29.mo11673b()
            java.util.Stack<com.google.android.gms.internal.ads.bde> r5 = r0.f3806n
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x00b2
            java.util.Stack<com.google.android.gms.internal.ads.bde> r3 = r0.f3806n
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.bde r3 = (com.google.android.gms.internal.ads.bde) r3
            r3.mo11720a((com.google.android.gms.internal.ads.bdf) r2)
            goto L_0x01d8
        L_0x00b2:
            int r5 = r2.f3739aO
            int r8 = com.google.android.gms.internal.ads.bdd.f3646A
            if (r5 != r8) goto L_0x017b
            com.google.android.gms.internal.ads.bkh r2 = r2.f3743aP
            r2.mo12054c(r9)
            int r5 = r2.mo12065l()
            int r5 = com.google.android.gms.internal.ads.bdd.m5025a(r5)
            r2.mo12056d(r7)
            long r8 = r2.mo12063j()
            if (r5 != 0) goto L_0x00db
            long r12 = r2.mo12063j()
            long r14 = r2.mo12063j()
            long r3 = r3 + r14
        L_0x00d7:
            r18 = r3
            r3 = r12
            goto L_0x00e5
        L_0x00db:
            long r12 = r2.mo12069p()
            long r14 = r2.mo12069p()
            long r3 = r3 + r14
            goto L_0x00d7
        L_0x00e5:
            r14 = 1000000(0xf4240, double:4.940656E-318)
            r12 = r3
            r16 = r8
            long r20 = com.google.android.gms.internal.ads.bkp.m5813a((long) r12, (long) r14, (long) r16)
            r2.mo12056d(r6)
            int r5 = r2.mo12060g()
            int[] r6 = new int[r5]
            long[] r14 = new long[r5]
            long[] r15 = new long[r5]
            long[] r12 = new long[r5]
            r16 = r3
            r3 = r20
        L_0x0102:
            if (r11 >= r5) goto L_0x0151
            int r13 = r2.mo12065l()
            r22 = -2147483648(0xffffffff80000000, float:-0.0)
            r22 = r13 & r22
            if (r22 != 0) goto L_0x0149
            long r22 = r2.mo12063j()
            r24 = 2147483647(0x7fffffff, float:NaN)
            r13 = r13 & r24
            r6[r11] = r13
            r14[r11] = r18
            r12[r11] = r3
            long r3 = r16 + r22
            r16 = 1000000(0xf4240, double:4.940656E-318)
            r10 = r12
            r12 = r3
            r26 = r14
            r7 = r15
            r14 = r16
            r16 = r8
            long r12 = com.google.android.gms.internal.ads.bkp.m5813a((long) r12, (long) r14, (long) r16)
            r14 = r10[r11]
            long r14 = r12 - r14
            r7[r11] = r14
            r14 = 4
            r2.mo12056d(r14)
            r14 = r6[r11]
            long r14 = (long) r14
            long r18 = r18 + r14
            int r11 = r11 + 1
            r16 = r3
            r15 = r7
            r3 = r12
            r14 = r26
            r7 = 4
            r12 = r10
            goto L_0x0102
        L_0x0149:
            com.google.android.gms.internal.ads.bad r1 = new com.google.android.gms.internal.ads.bad
            java.lang.String r2 = "Unhandled indirect reference"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0151:
            r10 = r12
            r26 = r14
            r7 = r15
            java.lang.Long r2 = java.lang.Long.valueOf(r20)
            com.google.android.gms.internal.ads.bcd r3 = new com.google.android.gms.internal.ads.bcd
            r4 = r26
            r3.<init>(r6, r4, r7, r10)
            android.util.Pair r2 = android.util.Pair.create(r2, r3)
            java.lang.Object r3 = r2.first
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r0.f3816x = r3
            com.google.android.gms.internal.ads.bcj r3 = r0.f3792D
            java.lang.Object r2 = r2.second
            com.google.android.gms.internal.ads.bco r2 = (com.google.android.gms.internal.ads.bco) r2
            r3.mo11690a(r2)
            r2 = 1
            r0.f3795G = r2
            goto L_0x01d8
        L_0x017b:
            int r3 = r2.f3739aO
            int r4 = com.google.android.gms.internal.ads.bdd.f3678aF
            if (r3 != r4) goto L_0x01d8
            com.google.android.gms.internal.ads.bkh r2 = r2.f3743aP
            com.google.android.gms.internal.ads.bcq r3 = r0.f3793E
            if (r3 == 0) goto L_0x01d8
            r3 = 12
            r2.mo12054c(r3)
            r2.mo12070q()
            r2.mo12070q()
            long r8 = r2.mo12063j()
            long r4 = r2.mo12063j()
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = com.google.android.gms.internal.ads.bkp.m5813a((long) r4, (long) r6, (long) r8)
            r2.mo12054c(r3)
            int r10 = r2.mo12051b()
            com.google.android.gms.internal.ads.bcq r3 = r0.f3793E
            r3.mo11681a(r2, r10)
            long r2 = r0.f3816x
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c5
            com.google.android.gms.internal.ads.bcq r6 = r0.f3793E
            long r2 = r0.f3816x
            long r7 = r2 + r4
            r9 = 1
            r11 = 0
            r12 = 0
            r6.mo11680a(r7, r9, r10, r11, r12)
            goto L_0x01d8
        L_0x01c5:
            java.util.LinkedList<com.google.android.gms.internal.ads.bdt> r2 = r0.f3807o
            com.google.android.gms.internal.ads.bdt r3 = new com.google.android.gms.internal.ads.bdt
            r3.<init>(r4, r10)
            r2.addLast(r3)
            int r2 = r0.f3814v
            int r2 = r2 + r10
            r0.f3814v = r2
            goto L_0x01d8
        L_0x01d5:
            r1.mo11674b(r2)
        L_0x01d8:
            long r2 = r29.mo11673b()
            r0.m5053a((long) r2)
            goto L_0x0004
        L_0x01e1:
            int r2 = r0.f3811s
            if (r2 != 0) goto L_0x020b
            com.google.android.gms.internal.ads.bkh r2 = r0.f3804l
            byte[] r2 = r2.f4559a
            r3 = 1
            boolean r2 = r1.mo11672a(r2, r11, r9, r3)
            if (r2 != 0) goto L_0x01f4
            r25 = 0
            goto L_0x036e
        L_0x01f4:
            r0.f3811s = r9
            com.google.android.gms.internal.ads.bkh r2 = r0.f3804l
            r2.mo12054c(r11)
            com.google.android.gms.internal.ads.bkh r2 = r0.f3804l
            long r2 = r2.mo12063j()
            r0.f3810r = r2
            com.google.android.gms.internal.ads.bkh r2 = r0.f3804l
            int r2 = r2.mo12065l()
            r0.f3809q = r2
        L_0x020b:
            long r2 = r0.f3810r
            r4 = 1
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x0227
            com.google.android.gms.internal.ads.bkh r2 = r0.f3804l
            byte[] r2 = r2.f4559a
            r1.mo11675b(r2, r9, r9)
            int r2 = r0.f3811s
            int r2 = r2 + r9
            r0.f3811s = r2
            com.google.android.gms.internal.ads.bkh r2 = r0.f3804l
            long r2 = r2.mo12069p()
            r0.f3810r = r2
        L_0x0227:
            long r2 = r0.f3810r
            int r4 = r0.f3811s
            long r4 = (long) r4
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x037a
            long r2 = r29.mo11673b()
            int r4 = r0.f3811s
            long r4 = (long) r4
            long r2 = r2 - r4
            int r4 = r0.f3809q
            int r5 = com.google.android.gms.internal.ads.bdd.f3656K
            if (r4 != r5) goto L_0x025a
            android.util.SparseArray<com.google.android.gms.internal.ads.bdu> r4 = r0.f3798f
            int r4 = r4.size()
            r5 = 0
        L_0x0245:
            if (r5 >= r4) goto L_0x025a
            android.util.SparseArray<com.google.android.gms.internal.ads.bdu> r7 = r0.f3798f
            java.lang.Object r7 = r7.valueAt(r5)
            com.google.android.gms.internal.ads.bdu r7 = (com.google.android.gms.internal.ads.bdu) r7
            com.google.android.gms.internal.ads.bed r7 = r7.f3821a
            r7.f3897b = r2
            r7.f3899d = r2
            r7.f3898c = r2
            int r5 = r5 + 1
            goto L_0x0245
        L_0x025a:
            int r4 = r0.f3809q
            int r5 = com.google.android.gms.internal.ads.bdd.f3720h
            if (r4 != r5) goto L_0x027e
            r0.f3817y = r8
            long r4 = r0.f3810r
            long r2 = r2 + r4
            r0.f3813u = r2
            boolean r2 = r0.f3795G
            if (r2 != 0) goto L_0x027a
            com.google.android.gms.internal.ads.bcj r2 = r0.f3792D
            com.google.android.gms.internal.ads.bcp r3 = new com.google.android.gms.internal.ads.bcp
            long r4 = r0.f3815w
            r3.<init>(r4)
            r2.mo11690a(r3)
            r2 = 1
            r0.f3795G = r2
        L_0x027a:
            r0.f3808p = r6
            goto L_0x036c
        L_0x027e:
            int r2 = r0.f3809q
            int r3 = com.google.android.gms.internal.ads.bdd.f3647B
            if (r2 == r3) goto L_0x02a7
            int r3 = com.google.android.gms.internal.ads.bdd.f3649D
            if (r2 == r3) goto L_0x02a7
            int r3 = com.google.android.gms.internal.ads.bdd.f3650E
            if (r2 == r3) goto L_0x02a7
            int r3 = com.google.android.gms.internal.ads.bdd.f3651F
            if (r2 == r3) goto L_0x02a7
            int r3 = com.google.android.gms.internal.ads.bdd.f3652G
            if (r2 == r3) goto L_0x02a7
            int r3 = com.google.android.gms.internal.ads.bdd.f3656K
            if (r2 == r3) goto L_0x02a7
            int r3 = com.google.android.gms.internal.ads.bdd.f3657L
            if (r2 == r3) goto L_0x02a7
            int r3 = com.google.android.gms.internal.ads.bdd.f3658M
            if (r2 == r3) goto L_0x02a7
            int r3 = com.google.android.gms.internal.ads.bdd.f3661P
            if (r2 != r3) goto L_0x02a5
            goto L_0x02a7
        L_0x02a5:
            r2 = 0
            goto L_0x02a8
        L_0x02a7:
            r2 = 1
        L_0x02a8:
            if (r2 == 0) goto L_0x02d3
            long r2 = r29.mo11673b()
            long r4 = r0.f3810r
            long r2 = r2 + r4
            r4 = 8
            long r2 = r2 - r4
            java.util.Stack<com.google.android.gms.internal.ads.bde> r4 = r0.f3806n
            com.google.android.gms.internal.ads.bde r5 = new com.google.android.gms.internal.ads.bde
            int r6 = r0.f3809q
            r5.<init>(r6, r2)
            r4.add(r5)
            long r4 = r0.f3810r
            int r6 = r0.f3811s
            long r6 = (long) r6
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x02ce
            r0.m5053a((long) r2)
            goto L_0x036c
        L_0x02ce:
            r28.m5052a()
            goto L_0x036c
        L_0x02d3:
            int r2 = r0.f3809q
            int r3 = com.google.android.gms.internal.ads.bdd.f3664S
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.bdd.f3663R
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.bdd.f3648C
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.bdd.f3646A
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.bdd.f3665T
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.bdd.f3735w
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.bdd.f3736x
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.bdd.f3660O
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.bdd.f3737y
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.bdd.f3738z
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.bdd.f3666U
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.bdd.f3690ac
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.bdd.f3691ad
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.bdd.f3695ah
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.bdd.f3694ag
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.bdd.f3692ae
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.bdd.f3693af
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.bdd.f3662Q
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.bdd.f3659N
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.bdd.f3678aF
            if (r2 != r3) goto L_0x0326
            goto L_0x0328
        L_0x0326:
            r2 = 0
            goto L_0x0329
        L_0x0328:
            r2 = 1
        L_0x0329:
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r2 == 0) goto L_0x0361
            int r2 = r0.f3811s
            if (r2 != r9) goto L_0x0359
            long r5 = r0.f3810r
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x0351
            com.google.android.gms.internal.ads.bkh r2 = new com.google.android.gms.internal.ads.bkh
            long r3 = r0.f3810r
            int r3 = (int) r3
            r2.<init>((int) r3)
            r0.f3812t = r2
            com.google.android.gms.internal.ads.bkh r2 = r0.f3804l
            byte[] r2 = r2.f4559a
            com.google.android.gms.internal.ads.bkh r3 = r0.f3812t
            byte[] r3 = r3.f4559a
            java.lang.System.arraycopy(r2, r11, r3, r11, r9)
            r2 = 1
            r0.f3808p = r2
            goto L_0x036c
        L_0x0351:
            com.google.android.gms.internal.ads.bad r1 = new com.google.android.gms.internal.ads.bad
            java.lang.String r2 = "Leaf atom with length > 2147483647 (unsupported)."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0359:
            com.google.android.gms.internal.ads.bad r1 = new com.google.android.gms.internal.ads.bad
            java.lang.String r2 = "Leaf atom defines extended atom size (unsupported)."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0361:
            long r5 = r0.f3810r
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x0372
            r0.f3812t = r8
            r2 = 1
            r0.f3808p = r2
        L_0x036c:
            r25 = 1
        L_0x036e:
            if (r25 != 0) goto L_0x0004
            r1 = -1
            return r1
        L_0x0372:
            com.google.android.gms.internal.ads.bad r1 = new com.google.android.gms.internal.ads.bad
            java.lang.String r2 = "Skipping atom with length > 2147483647 (unsupported)."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x037a:
            com.google.android.gms.internal.ads.bad r1 = new com.google.android.gms.internal.ads.bad
            java.lang.String r2 = "Atom size less than header length (unsupported)."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0382:
            if (r3 >= r7) goto L_0x03a3
            java.lang.Object r10 = r2.valueAt(r3)
            com.google.android.gms.internal.ads.bdu r10 = (com.google.android.gms.internal.ads.bdu) r10
            int r14 = r10.f3827g
            com.google.android.gms.internal.ads.bed r15 = r10.f3821a
            int r15 = r15.f3900e
            if (r14 == r15) goto L_0x03a0
            com.google.android.gms.internal.ads.bed r14 = r10.f3821a
            long[] r14 = r14.f3902g
            int r15 = r10.f3827g
            r15 = r14[r15]
            int r14 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r14 >= 0) goto L_0x03a0
            r4 = r10
            r12 = r15
        L_0x03a0:
            int r3 = r3 + 1
            goto L_0x0382
        L_0x03a3:
            if (r4 != 0) goto L_0x03c1
            long r2 = r0.f3813u
            long r4 = r29.mo11673b()
            long r2 = r2 - r4
            int r2 = (int) r2
            if (r2 < 0) goto L_0x03b9
            r1.mo11674b(r2)
            r28.m5052a()
            r3 = 0
            r5 = 0
            goto L_0x060e
        L_0x03b9:
            com.google.android.gms.internal.ads.bad r1 = new com.google.android.gms.internal.ads.bad
            java.lang.String r2 = "Offset to end of mdat was negative."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x03c1:
            com.google.android.gms.internal.ads.bed r2 = r4.f3821a
            long[] r2 = r2.f3902g
            int r3 = r4.f3827g
            r12 = r2[r3]
            long r2 = r29.mo11673b()
            long r12 = r12 - r2
            int r2 = (int) r12
            if (r2 >= 0) goto L_0x03d9
            java.lang.String r2 = "FragmentedMp4Extractor"
            java.lang.String r3 = "Ignoring negative offset to sample data."
            android.util.Log.w(r2, r3)
            r2 = 0
        L_0x03d9:
            r1.mo11674b(r2)
            r0.f3817y = r4
        L_0x03de:
            com.google.android.gms.internal.ads.bdu r2 = r0.f3817y
            com.google.android.gms.internal.ads.bed r2 = r2.f3821a
            int[] r2 = r2.f3904i
            com.google.android.gms.internal.ads.bdu r3 = r0.f3817y
            int r3 = r3.f3825e
            r2 = r2[r3]
            r0.f3818z = r2
            com.google.android.gms.internal.ads.bdu r2 = r0.f3817y
            com.google.android.gms.internal.ads.bed r2 = r2.f3821a
            boolean r2 = r2.f3908m
            if (r2 == 0) goto L_0x0451
            com.google.android.gms.internal.ads.bdu r2 = r0.f3817y
            com.google.android.gms.internal.ads.bed r3 = r2.f3821a
            com.google.android.gms.internal.ads.bkh r4 = r3.f3912q
            com.google.android.gms.internal.ads.bdo r7 = r3.f3896a
            int r7 = r7.f3777a
            com.google.android.gms.internal.ads.bec r10 = r3.f3910o
            if (r10 == 0) goto L_0x0405
            com.google.android.gms.internal.ads.bec r7 = r3.f3910o
            goto L_0x040b
        L_0x0405:
            com.google.android.gms.internal.ads.beb r10 = r2.f3823c
            com.google.android.gms.internal.ads.bec[] r10 = r10.f3889h
            r7 = r10[r7]
        L_0x040b:
            int r7 = r7.f3893a
            boolean[] r3 = r3.f3909n
            int r10 = r2.f3825e
            boolean r3 = r3[r10]
            com.google.android.gms.internal.ads.bkh r10 = r0.f3802j
            byte[] r10 = r10.f4559a
            if (r3 == 0) goto L_0x041c
            r12 = 128(0x80, float:1.794E-43)
            goto L_0x041d
        L_0x041c:
            r12 = 0
        L_0x041d:
            r12 = r12 | r7
            byte r12 = (byte) r12
            r10[r11] = r12
            com.google.android.gms.internal.ads.bkh r10 = r0.f3802j
            r10.mo12054c(r11)
            com.google.android.gms.internal.ads.bcq r2 = r2.f3822b
            com.google.android.gms.internal.ads.bkh r10 = r0.f3802j
            r12 = 1
            r2.mo11681a(r10, r12)
            r2.mo11681a(r4, r7)
            if (r3 != 0) goto L_0x0436
            int r7 = r7 + 1
            goto L_0x0447
        L_0x0436:
            int r3 = r4.mo12060g()
            r10 = -2
            r4.mo12056d(r10)
            int r3 = r3 * 6
            int r3 = r3 + r6
            r2.mo11681a(r4, r3)
            int r7 = r7 + 1
            int r7 = r7 + r3
        L_0x0447:
            r0.f3789A = r7
            int r2 = r0.f3818z
            int r3 = r0.f3789A
            int r2 = r2 + r3
            r0.f3818z = r2
            goto L_0x0453
        L_0x0451:
            r0.f3789A = r11
        L_0x0453:
            com.google.android.gms.internal.ads.bdu r2 = r0.f3817y
            com.google.android.gms.internal.ads.beb r2 = r2.f3823c
            int r2 = r2.f3888g
            r3 = 1
            if (r2 != r3) goto L_0x0464
            int r2 = r0.f3818z
            int r2 = r2 - r9
            r0.f3818z = r2
            r1.mo11674b(r9)
        L_0x0464:
            r2 = 4
            r0.f3808p = r2
            r0.f3790B = r11
        L_0x0469:
            com.google.android.gms.internal.ads.bdu r2 = r0.f3817y
            com.google.android.gms.internal.ads.bed r2 = r2.f3821a
            com.google.android.gms.internal.ads.bdu r3 = r0.f3817y
            com.google.android.gms.internal.ads.beb r3 = r3.f3823c
            com.google.android.gms.internal.ads.bdu r4 = r0.f3817y
            com.google.android.gms.internal.ads.bcq r12 = r4.f3822b
            com.google.android.gms.internal.ads.bdu r4 = r0.f3817y
            int r4 = r4.f3825e
            int r7 = r3.f3892k
            r9 = 1000(0x3e8, double:4.94E-321)
            if (r7 == 0) goto L_0x054a
            com.google.android.gms.internal.ads.bkh r7 = r0.f3800h
            byte[] r7 = r7.f4559a
            r7[r11] = r11
            r13 = 1
            r7[r13] = r11
            r7[r6] = r11
            int r6 = r3.f3892k
            int r6 = r6 + r13
            int r13 = r3.f3892k
            r14 = 4
            int r13 = 4 - r13
        L_0x0492:
            int r14 = r0.f3789A
            int r15 = r0.f3818z
            if (r14 >= r15) goto L_0x0560
            int r14 = r0.f3790B
            if (r14 != 0) goto L_0x04e0
            r1.mo11675b(r7, r13, r6)
            com.google.android.gms.internal.ads.bkh r14 = r0.f3800h
            r14.mo12054c(r11)
            com.google.android.gms.internal.ads.bkh r14 = r0.f3800h
            int r14 = r14.mo12068o()
            r15 = 1
            int r14 = r14 - r15
            r0.f3790B = r14
            com.google.android.gms.internal.ads.bkh r14 = r0.f3799g
            r14.mo12054c(r11)
            com.google.android.gms.internal.ads.bkh r14 = r0.f3799g
            r5 = 4
            r12.mo11681a(r14, r5)
            com.google.android.gms.internal.ads.bkh r14 = r0.f3800h
            r12.mo11681a(r14, r15)
            com.google.android.gms.internal.ads.bcq[] r14 = r0.f3794F
            if (r14 == 0) goto L_0x04d0
            com.google.android.gms.internal.ads.zzfs r14 = r3.f3887f
            java.lang.String r14 = r14.f7209e
            byte r15 = r7[r5]
            boolean r14 = com.google.android.gms.internal.ads.bke.m5761a((java.lang.String) r14, (byte) r15)
            if (r14 == 0) goto L_0x04d0
            r14 = 1
            goto L_0x04d1
        L_0x04d0:
            r14 = 0
        L_0x04d1:
            r0.f3791C = r14
            int r14 = r0.f3789A
            int r14 = r14 + 5
            r0.f3789A = r14
            int r14 = r0.f3818z
            int r14 = r14 + r13
            r0.f3818z = r14
            r5 = 3
            goto L_0x0492
        L_0x04e0:
            r5 = 4
            boolean r14 = r0.f3791C
            if (r14 == 0) goto L_0x0530
            com.google.android.gms.internal.ads.bkh r14 = r0.f3801i
            int r15 = r0.f3790B
            r14.mo12048a(r15)
            com.google.android.gms.internal.ads.bkh r14 = r0.f3801i
            byte[] r14 = r14.f4559a
            int r15 = r0.f3790B
            r1.mo11675b(r14, r11, r15)
            com.google.android.gms.internal.ads.bkh r14 = r0.f3801i
            int r15 = r0.f3790B
            r12.mo11681a(r14, r15)
            int r14 = r0.f3790B
            com.google.android.gms.internal.ads.bkh r15 = r0.f3801i
            byte[] r15 = r15.f4559a
            com.google.android.gms.internal.ads.bkh r5 = r0.f3801i
            int r5 = r5.mo12053c()
            int r5 = com.google.android.gms.internal.ads.bke.m5758a((byte[]) r15, (int) r5)
            com.google.android.gms.internal.ads.bkh r15 = r0.f3801i
            java.lang.String r8 = "video/hevc"
            com.google.android.gms.internal.ads.zzfs r11 = r3.f3887f
            java.lang.String r11 = r11.f7209e
            boolean r8 = r8.equals(r11)
            r15.mo12054c(r8)
            com.google.android.gms.internal.ads.bkh r8 = r0.f3801i
            r8.mo12052b(r5)
            long r15 = r2.mo11731b(r4)
            r27 = r6
            long r5 = r15 * r9
            com.google.android.gms.internal.ads.bkh r8 = r0.f3801i
            com.google.android.gms.internal.ads.bcq[] r11 = r0.f3794F
            com.google.android.gms.internal.ads.bil.m5579a(r5, r8, r11)
            goto L_0x0539
        L_0x0530:
            r27 = r6
            int r5 = r0.f3790B
            r6 = 0
            int r14 = r12.mo11679a(r1, r5, r6)
        L_0x0539:
            int r5 = r0.f3789A
            int r5 = r5 + r14
            r0.f3789A = r5
            int r5 = r0.f3790B
            int r5 = r5 - r14
            r0.f3790B = r5
            r6 = r27
            r5 = 3
            r8 = 0
            r11 = 0
            goto L_0x0492
        L_0x054a:
            int r5 = r0.f3789A
            int r6 = r0.f3818z
            if (r5 >= r6) goto L_0x0560
            int r5 = r0.f3818z
            int r6 = r0.f3789A
            int r5 = r5 - r6
            r6 = 0
            int r5 = r12.mo11679a(r1, r5, r6)
            int r6 = r0.f3789A
            int r6 = r6 + r5
            r0.f3789A = r6
            goto L_0x054a
        L_0x0560:
            long r5 = r2.mo11731b(r4)
            long r5 = r5 * r9
            com.google.android.gms.internal.ads.bkm r7 = r0.f3803k
            if (r7 != 0) goto L_0x0611
            boolean r7 = r2.f3908m
            if (r7 == 0) goto L_0x0571
            r11 = 1073741824(0x40000000, float:2.0)
            goto L_0x0572
        L_0x0571:
            r11 = 0
        L_0x0572:
            boolean[] r7 = r2.f3907l
            boolean r4 = r7[r4]
            r15 = r11 | r4
            boolean r4 = r2.f3908m
            if (r4 == 0) goto L_0x05a1
            com.google.android.gms.internal.ads.bec r4 = r2.f3910o
            if (r4 == 0) goto L_0x0584
            com.google.android.gms.internal.ads.bec r3 = r2.f3910o
        L_0x0582:
            r8 = r3
            goto L_0x058d
        L_0x0584:
            com.google.android.gms.internal.ads.bec[] r3 = r3.f3889h
            com.google.android.gms.internal.ads.bdo r4 = r2.f3896a
            int r4 = r4.f3777a
            r3 = r3[r4]
            goto L_0x0582
        L_0x058d:
            com.google.android.gms.internal.ads.bdu r3 = r0.f3817y
            com.google.android.gms.internal.ads.bec r3 = r3.f3829i
            if (r8 == r3) goto L_0x059c
            com.google.android.gms.internal.ads.bcr r3 = new com.google.android.gms.internal.ads.bcr
            byte[] r4 = r8.f3894b
            r7 = 1
            r3.<init>(r7, r4)
            goto L_0x05a3
        L_0x059c:
            com.google.android.gms.internal.ads.bdu r3 = r0.f3817y
            com.google.android.gms.internal.ads.bcr r3 = r3.f3828h
            goto L_0x05a3
        L_0x05a1:
            r3 = 0
            r8 = 0
        L_0x05a3:
            com.google.android.gms.internal.ads.bdu r4 = r0.f3817y
            r4.f3828h = r3
            com.google.android.gms.internal.ads.bdu r4 = r0.f3817y
            r4.f3829i = r8
            int r4 = r0.f3818z
            r17 = 0
            r13 = r5
            r16 = r4
            r18 = r3
            r12.mo11680a(r13, r15, r16, r17, r18)
        L_0x05b7:
            java.util.LinkedList<com.google.android.gms.internal.ads.bdt> r3 = r0.f3807o
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x05dd
            java.util.LinkedList<com.google.android.gms.internal.ads.bdt> r3 = r0.f3807o
            java.lang.Object r3 = r3.removeFirst()
            com.google.android.gms.internal.ads.bdt r3 = (com.google.android.gms.internal.ads.bdt) r3
            int r4 = r0.f3814v
            int r7 = r3.f3820b
            int r4 = r4 - r7
            r0.f3814v = r4
            com.google.android.gms.internal.ads.bcq r7 = r0.f3793E
            long r8 = r3.f3819a
            long r8 = r8 + r5
            r10 = 1
            int r11 = r3.f3820b
            int r12 = r0.f3814v
            r13 = 0
            r7.mo11680a(r8, r10, r11, r12, r13)
            goto L_0x05b7
        L_0x05dd:
            com.google.android.gms.internal.ads.bdu r3 = r0.f3817y
            int r4 = r3.f3825e
            r5 = 1
            int r4 = r4 + r5
            r3.f3825e = r4
            com.google.android.gms.internal.ads.bdu r3 = r0.f3817y
            int r4 = r3.f3826f
            int r4 = r4 + r5
            r3.f3826f = r4
            com.google.android.gms.internal.ads.bdu r3 = r0.f3817y
            int r3 = r3.f3826f
            int[] r2 = r2.f3903h
            com.google.android.gms.internal.ads.bdu r4 = r0.f3817y
            int r4 = r4.f3827g
            r2 = r2[r4]
            if (r3 != r2) goto L_0x060a
            com.google.android.gms.internal.ads.bdu r2 = r0.f3817y
            int r3 = r2.f3827g
            int r3 = r3 + r5
            r2.f3827g = r3
            com.google.android.gms.internal.ads.bdu r2 = r0.f3817y
            r3 = 0
            r2.f3826f = r3
            r2 = 0
            r0.f3817y = r2
            goto L_0x060b
        L_0x060a:
            r3 = 0
        L_0x060b:
            r2 = 3
            r0.f3808p = r2
        L_0x060e:
            if (r5 == 0) goto L_0x0004
            return r3
        L_0x0611:
            java.lang.NoSuchMethodError r1 = new java.lang.NoSuchMethodError
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bdr.mo11683a(com.google.android.gms.internal.ads.bci, com.google.android.gms.internal.ads.bcn):int");
    }

    /* renamed from: a */
    private final void m5052a() {
        this.f3808p = 0;
        this.f3811s = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:157:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03f4  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03fb  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x065a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m5053a(long r55) {
        /*
            r54 = this;
            r0 = r54
        L_0x0002:
            java.util.Stack<com.google.android.gms.internal.ads.bde> r1 = r0.f3806n
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0701
            java.util.Stack<com.google.android.gms.internal.ads.bde> r1 = r0.f3806n
            java.lang.Object r1 = r1.peek()
            com.google.android.gms.internal.ads.bde r1 = (com.google.android.gms.internal.ads.bde) r1
            long r1 = r1.f3740aP
            int r5 = (r1 > r55 ? 1 : (r1 == r55 ? 0 : -1))
            if (r5 != 0) goto L_0x0701
            java.util.Stack<com.google.android.gms.internal.ads.bde> r1 = r0.f3806n
            java.lang.Object r1 = r1.pop()
            com.google.android.gms.internal.ads.bde r1 = (com.google.android.gms.internal.ads.bde) r1
            int r2 = r1.f3739aO
            int r5 = com.google.android.gms.internal.ads.bdd.f3647B
            r7 = 12
            r9 = 8
            r11 = 1
            if (r2 != r5) goto L_0x01ca
            java.lang.String r2 = "Unexpected moov box."
            com.google.android.gms.internal.ads.bjy.m5692b(r11, r2)
            java.util.List<com.google.android.gms.internal.ads.bdf> r2 = r1.f3741aQ
            com.google.android.gms.internal.ads.zzhp r2 = m5051a((java.util.List<com.google.android.gms.internal.ads.bdf>) r2)
            int r5 = com.google.android.gms.internal.ads.bdd.f3658M
            com.google.android.gms.internal.ads.bde r5 = r1.mo11722e(r5)
            android.util.SparseArray r14 = new android.util.SparseArray
            r14.<init>()
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.List<com.google.android.gms.internal.ads.bdf> r15 = r5.f3741aQ
            int r15 = r15.size()
            r18 = r12
            r12 = 0
        L_0x004f:
            if (r12 >= r15) goto L_0x00bd
            java.util.List<com.google.android.gms.internal.ads.bdf> r13 = r5.f3741aQ
            java.lang.Object r13 = r13.get(r12)
            com.google.android.gms.internal.ads.bdf r13 = (com.google.android.gms.internal.ads.bdf) r13
            int r10 = r13.f3739aO
            int r6 = com.google.android.gms.internal.ads.bdd.f3737y
            if (r10 != r6) goto L_0x0096
            com.google.android.gms.internal.ads.bkh r6 = r13.f3743aP
            r6.mo12054c(r7)
            int r10 = r6.mo12065l()
            int r13 = r6.mo12068o()
            int r13 = r13 - r11
            int r7 = r6.mo12068o()
            int r11 = r6.mo12068o()
            int r6 = r6.mo12065l()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            com.google.android.gms.internal.ads.bdo r8 = new com.google.android.gms.internal.ads.bdo
            r8.<init>(r13, r7, r11, r6)
            android.util.Pair r6 = android.util.Pair.create(r10, r8)
            java.lang.Object r7 = r6.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r6 = r6.second
            com.google.android.gms.internal.ads.bdo r6 = (com.google.android.gms.internal.ads.bdo) r6
            r14.put(r7, r6)
            goto L_0x00b7
        L_0x0096:
            int r6 = r13.f3739aO
            int r7 = com.google.android.gms.internal.ads.bdd.f3659N
            if (r6 != r7) goto L_0x00b7
            com.google.android.gms.internal.ads.bkh r6 = r13.f3743aP
            r6.mo12054c(r9)
            int r7 = r6.mo12065l()
            int r7 = com.google.android.gms.internal.ads.bdd.m5025a(r7)
            if (r7 != 0) goto L_0x00b2
            long r6 = r6.mo12063j()
        L_0x00af:
            r18 = r6
            goto L_0x00b7
        L_0x00b2:
            long r6 = r6.mo12069p()
            goto L_0x00af
        L_0x00b7:
            int r12 = r12 + 1
            r7 = 12
            r11 = 1
            goto L_0x004f
        L_0x00bd:
            android.util.SparseArray r5 = new android.util.SparseArray
            r5.<init>()
            java.util.List<com.google.android.gms.internal.ads.bde> r6 = r1.f3742aR
            int r6 = r6.size()
            r7 = 0
        L_0x00c9:
            if (r7 >= r6) goto L_0x00f8
            java.util.List<com.google.android.gms.internal.ads.bde> r8 = r1.f3742aR
            java.lang.Object r8 = r8.get(r7)
            r12 = r8
            com.google.android.gms.internal.ads.bde r12 = (com.google.android.gms.internal.ads.bde) r12
            int r8 = r12.f3739aO
            int r10 = com.google.android.gms.internal.ads.bdd.f3649D
            if (r8 != r10) goto L_0x00f3
            int r8 = com.google.android.gms.internal.ads.bdd.f3648C
            com.google.android.gms.internal.ads.bdf r13 = r1.mo11721d(r8)
            r17 = 0
            r8 = r14
            r14 = r18
            r16 = r2
            com.google.android.gms.internal.ads.beb r10 = com.google.android.gms.internal.ads.bdg.m5035a((com.google.android.gms.internal.ads.bde) r12, (com.google.android.gms.internal.ads.bdf) r13, (long) r14, (com.google.android.gms.internal.ads.zzhp) r16, (boolean) r17)
            if (r10 == 0) goto L_0x00f4
            int r11 = r10.f3882a
            r5.put(r11, r10)
            goto L_0x00f4
        L_0x00f3:
            r8 = r14
        L_0x00f4:
            int r7 = r7 + 1
            r14 = r8
            goto L_0x00c9
        L_0x00f8:
            r8 = r14
            int r1 = r5.size()
            android.util.SparseArray<com.google.android.gms.internal.ads.bdu> r2 = r0.f3798f
            int r2 = r2.size()
            if (r2 != 0) goto L_0x0199
            r2 = 0
        L_0x0106:
            if (r2 >= r1) goto L_0x013a
            java.lang.Object r6 = r5.valueAt(r2)
            com.google.android.gms.internal.ads.beb r6 = (com.google.android.gms.internal.ads.beb) r6
            com.google.android.gms.internal.ads.bdu r7 = new com.google.android.gms.internal.ads.bdu
            com.google.android.gms.internal.ads.bcj r10 = r0.f3792D
            int r11 = r6.f3883b
            com.google.android.gms.internal.ads.bcq r10 = r10.mo11688a(r2, r11)
            r7.<init>(r10)
            int r10 = r6.f3882a
            java.lang.Object r10 = r8.get(r10)
            com.google.android.gms.internal.ads.bdo r10 = (com.google.android.gms.internal.ads.bdo) r10
            r7.mo11729a(r6, r10)
            android.util.SparseArray<com.google.android.gms.internal.ads.bdu> r10 = r0.f3798f
            int r11 = r6.f3882a
            r10.put(r11, r7)
            long r10 = r0.f3815w
            long r6 = r6.f3886e
            long r6 = java.lang.Math.max(r10, r6)
            r0.f3815w = r6
            int r2 = r2 + 1
            goto L_0x0106
        L_0x013a:
            int r1 = r0.f3796d
            r2 = 4
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0163
            com.google.android.gms.internal.ads.bcq r1 = r0.f3793E
            if (r1 != 0) goto L_0x0163
            com.google.android.gms.internal.ads.bcj r1 = r0.f3792D
            android.util.SparseArray<com.google.android.gms.internal.ads.bdu> r5 = r0.f3798f
            int r5 = r5.size()
            com.google.android.gms.internal.ads.bcq r1 = r1.mo11688a(r5, r2)
            r0.f3793E = r1
            com.google.android.gms.internal.ads.bcq r1 = r0.f3793E
            java.lang.String r2 = "application/x-emsg"
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = 0
            com.google.android.gms.internal.ads.zzfs r2 = com.google.android.gms.internal.ads.zzfs.m8795a((java.lang.String) r7, (java.lang.String) r2, (long) r5)
            r1.mo11682a(r2)
        L_0x0163:
            int r1 = r0.f3796d
            r1 = r1 & r9
            if (r1 == 0) goto L_0x0192
            com.google.android.gms.internal.ads.bcq[] r1 = r0.f3794F
            if (r1 != 0) goto L_0x0192
            com.google.android.gms.internal.ads.bcj r1 = r0.f3792D
            android.util.SparseArray<com.google.android.gms.internal.ads.bdu> r2 = r0.f3798f
            int r2 = r2.size()
            r5 = 1
            int r2 = r2 + r5
            r5 = 3
            com.google.android.gms.internal.ads.bcq r1 = r1.mo11688a(r2, r5)
            r5 = 0
            java.lang.String r6 = "application/cea-608"
            r7 = 0
            r8 = -1
            r9 = 0
            r10 = 0
            r11 = 0
            com.google.android.gms.internal.ads.zzfs r2 = com.google.android.gms.internal.ads.zzfs.m8800a((java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (int) r8, (int) r9, (java.lang.String) r10, (com.google.android.gms.internal.ads.zzhp) r11)
            r1.mo11682a(r2)
            r2 = 1
            com.google.android.gms.internal.ads.bcq[] r2 = new com.google.android.gms.internal.ads.bcq[r2]
            r5 = 0
            r2[r5] = r1
            r0.f3794F = r2
        L_0x0192:
            com.google.android.gms.internal.ads.bcj r1 = r0.f3792D
            r1.mo11689a()
            goto L_0x0002
        L_0x0199:
            android.util.SparseArray<com.google.android.gms.internal.ads.bdu> r2 = r0.f3798f
            int r2 = r2.size()
            if (r2 != r1) goto L_0x01a4
            r20 = 1
            goto L_0x01a6
        L_0x01a4:
            r20 = 0
        L_0x01a6:
            com.google.android.gms.internal.ads.bjy.m5691b(r20)
            r2 = 0
        L_0x01aa:
            if (r2 >= r1) goto L_0x0002
            java.lang.Object r6 = r5.valueAt(r2)
            com.google.android.gms.internal.ads.beb r6 = (com.google.android.gms.internal.ads.beb) r6
            android.util.SparseArray<com.google.android.gms.internal.ads.bdu> r7 = r0.f3798f
            int r9 = r6.f3882a
            java.lang.Object r7 = r7.get(r9)
            com.google.android.gms.internal.ads.bdu r7 = (com.google.android.gms.internal.ads.bdu) r7
            int r9 = r6.f3882a
            java.lang.Object r9 = r8.get(r9)
            com.google.android.gms.internal.ads.bdo r9 = (com.google.android.gms.internal.ads.bdo) r9
            r7.mo11729a(r6, r9)
            int r2 = r2 + 1
            goto L_0x01aa
        L_0x01ca:
            r7 = 0
            int r2 = r1.f3739aO
            int r5 = com.google.android.gms.internal.ads.bdd.f3656K
            if (r2 != r5) goto L_0x06ea
            android.util.SparseArray<com.google.android.gms.internal.ads.bdu> r2 = r0.f3798f
            int r5 = r0.f3796d
            byte[] r6 = r0.f3805m
            java.util.List<com.google.android.gms.internal.ads.bde> r8 = r1.f3742aR
            int r8 = r8.size()
            r10 = 0
        L_0x01de:
            if (r10 >= r8) goto L_0x06bc
            java.util.List<com.google.android.gms.internal.ads.bde> r11 = r1.f3742aR
            java.lang.Object r11 = r11.get(r10)
            com.google.android.gms.internal.ads.bde r11 = (com.google.android.gms.internal.ads.bde) r11
            int r12 = r11.f3739aO
            int r13 = com.google.android.gms.internal.ads.bdd.f3657L
            if (r12 != r13) goto L_0x069a
            int r12 = com.google.android.gms.internal.ads.bdd.f3736x
            com.google.android.gms.internal.ads.bdf r12 = r11.mo11721d(r12)
            com.google.android.gms.internal.ads.bkh r12 = r12.f3743aP
            r12.mo12054c(r9)
            int r13 = r12.mo12065l()
            int r13 = com.google.android.gms.internal.ads.bdd.m5026b(r13)
            int r14 = r12.mo12065l()
            r15 = r5 & 16
            if (r15 != 0) goto L_0x020a
            goto L_0x020b
        L_0x020a:
            r14 = 0
        L_0x020b:
            java.lang.Object r14 = r2.get(r14)
            com.google.android.gms.internal.ads.bdu r14 = (com.google.android.gms.internal.ads.bdu) r14
            if (r14 != 0) goto L_0x0217
            r14 = r7
            r21 = r8
            goto L_0x0267
        L_0x0217:
            r15 = r13 & 1
            if (r15 == 0) goto L_0x022a
            r21 = r8
            long r7 = r12.mo12069p()
            com.google.android.gms.internal.ads.bed r15 = r14.f3821a
            r15.f3898c = r7
            com.google.android.gms.internal.ads.bed r15 = r14.f3821a
            r15.f3899d = r7
            goto L_0x022c
        L_0x022a:
            r21 = r8
        L_0x022c:
            com.google.android.gms.internal.ads.bdo r7 = r14.f3824d
            r8 = r13 & 2
            if (r8 == 0) goto L_0x0239
            int r8 = r12.mo12068o()
            r15 = 1
            int r8 = r8 - r15
            goto L_0x023b
        L_0x0239:
            int r8 = r7.f3777a
        L_0x023b:
            r15 = r13 & 8
            if (r15 == 0) goto L_0x0244
            int r15 = r12.mo12068o()
            goto L_0x0246
        L_0x0244:
            int r15 = r7.f3778b
        L_0x0246:
            r16 = r13 & 16
            if (r16 == 0) goto L_0x0251
            int r16 = r12.mo12068o()
            r9 = r16
            goto L_0x0253
        L_0x0251:
            int r9 = r7.f3779c
        L_0x0253:
            r13 = r13 & 32
            if (r13 == 0) goto L_0x025c
            int r7 = r12.mo12068o()
            goto L_0x025e
        L_0x025c:
            int r7 = r7.f3780d
        L_0x025e:
            com.google.android.gms.internal.ads.bed r12 = r14.f3821a
            com.google.android.gms.internal.ads.bdo r13 = new com.google.android.gms.internal.ads.bdo
            r13.<init>(r8, r15, r9, r7)
            r12.f3896a = r13
        L_0x0267:
            if (r14 == 0) goto L_0x0692
            com.google.android.gms.internal.ads.bed r7 = r14.f3821a
            long r8 = r7.f3914s
            r14.mo11728a()
            int r12 = com.google.android.gms.internal.ads.bdd.f3735w
            com.google.android.gms.internal.ads.bdf r12 = r11.mo11721d(r12)
            if (r12 == 0) goto L_0x029d
            r12 = r5 & 2
            if (r12 != 0) goto L_0x029d
            int r8 = com.google.android.gms.internal.ads.bdd.f3735w
            com.google.android.gms.internal.ads.bdf r8 = r11.mo11721d(r8)
            com.google.android.gms.internal.ads.bkh r8 = r8.f3743aP
            r9 = 8
            r8.mo12054c(r9)
            int r9 = r8.mo12065l()
            int r9 = com.google.android.gms.internal.ads.bdd.m5025a(r9)
            r12 = 1
            if (r9 != r12) goto L_0x0299
            long r8 = r8.mo12069p()
            goto L_0x029d
        L_0x0299:
            long r8 = r8.mo12063j()
        L_0x029d:
            java.util.List<com.google.android.gms.internal.ads.bdf> r12 = r11.f3741aQ
            int r13 = r12.size()
            r22 = r2
            r2 = 0
            r3 = 0
            r15 = 0
        L_0x02a8:
            if (r15 >= r13) goto L_0x02d0
            java.lang.Object r4 = r12.get(r15)
            com.google.android.gms.internal.ads.bdf r4 = (com.google.android.gms.internal.ads.bdf) r4
            r23 = r8
            int r8 = r4.f3739aO
            int r9 = com.google.android.gms.internal.ads.bdd.f3738z
            if (r8 != r9) goto L_0x02c9
            com.google.android.gms.internal.ads.bkh r4 = r4.f3743aP
            r8 = 12
            r4.mo12054c(r8)
            int r4 = r4.mo12068o()
            if (r4 <= 0) goto L_0x02cb
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L_0x02cb
        L_0x02c9:
            r8 = 12
        L_0x02cb:
            int r15 = r15 + 1
            r8 = r23
            goto L_0x02a8
        L_0x02d0:
            r23 = r8
            r4 = 0
            r8 = 12
            r14.f3827g = r4
            r14.f3826f = r4
            r14.f3825e = r4
            com.google.android.gms.internal.ads.bed r4 = r14.f3821a
            r4.f3900e = r2
            r4.f3901f = r3
            int[] r9 = r4.f3903h
            if (r9 == 0) goto L_0x02ea
            int[] r9 = r4.f3903h
            int r9 = r9.length
            if (r9 >= r2) goto L_0x02f2
        L_0x02ea:
            long[] r9 = new long[r2]
            r4.f3902g = r9
            int[] r2 = new int[r2]
            r4.f3903h = r2
        L_0x02f2:
            int[] r2 = r4.f3904i
            if (r2 == 0) goto L_0x02fb
            int[] r2 = r4.f3904i
            int r2 = r2.length
            if (r2 >= r3) goto L_0x0313
        L_0x02fb:
            int r3 = r3 * 125
            int r3 = r3 / 100
            int[] r2 = new int[r3]
            r4.f3904i = r2
            int[] r2 = new int[r3]
            r4.f3905j = r2
            long[] r2 = new long[r3]
            r4.f3906k = r2
            boolean[] r2 = new boolean[r3]
            r4.f3907l = r2
            boolean[] r2 = new boolean[r3]
            r4.f3909n = r2
        L_0x0313:
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0316:
            if (r2 >= r13) goto L_0x04b0
            java.lang.Object r17 = r12.get(r2)
            r8 = r17
            com.google.android.gms.internal.ads.bdf r8 = (com.google.android.gms.internal.ads.bdf) r8
            int r9 = r8.f3739aO
            int r15 = com.google.android.gms.internal.ads.bdd.f3738z
            if (r9 != r15) goto L_0x0480
            int r9 = r3 + 1
            com.google.android.gms.internal.ads.bkh r8 = r8.f3743aP
            r15 = 8
            r8.mo12054c(r15)
            int r15 = r8.mo12065l()
            int r15 = com.google.android.gms.internal.ads.bdd.m5026b(r15)
            r25 = r9
            com.google.android.gms.internal.ads.beb r9 = r14.f3823c
            r26 = r12
            com.google.android.gms.internal.ads.bed r12 = r14.f3821a
            r27 = r13
            com.google.android.gms.internal.ads.bdo r13 = r12.f3896a
            int[] r0 = r12.f3903h
            int r16 = r8.mo12068o()
            r0[r3] = r16
            long[] r0 = r12.f3902g
            r28 = r6
            r29 = r7
            long r6 = r12.f3898c
            r0[r3] = r6
            r0 = r15 & 1
            if (r0 == 0) goto L_0x036c
            long[] r0 = r12.f3902g
            r6 = r0[r3]
            r30 = r1
            int r1 = r8.mo12065l()
            r31 = r10
            r32 = r11
            long r10 = (long) r1
            long r6 = r6 + r10
            r0[r3] = r6
            goto L_0x0372
        L_0x036c:
            r30 = r1
            r31 = r10
            r32 = r11
        L_0x0372:
            r0 = r15 & 4
            if (r0 == 0) goto L_0x0378
            r0 = 1
            goto L_0x0379
        L_0x0378:
            r0 = 0
        L_0x0379:
            int r1 = r13.f3780d
            if (r0 == 0) goto L_0x0381
            int r1 = r8.mo12068o()
        L_0x0381:
            r6 = r15 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x0387
            r6 = 1
            goto L_0x0388
        L_0x0387:
            r6 = 0
        L_0x0388:
            r7 = r15 & 512(0x200, float:7.175E-43)
            if (r7 == 0) goto L_0x038e
            r7 = 1
            goto L_0x038f
        L_0x038e:
            r7 = 0
        L_0x038f:
            r10 = r15 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L_0x0395
            r10 = 1
            goto L_0x0396
        L_0x0395:
            r10 = 0
        L_0x0396:
            r11 = r15 & 2048(0x800, float:2.87E-42)
            if (r11 == 0) goto L_0x039c
            r11 = 1
            goto L_0x039d
        L_0x039c:
            r11 = 0
        L_0x039d:
            long[] r15 = r9.f3890i
            if (r15 == 0) goto L_0x03c5
            long[] r15 = r9.f3890i
            int r15 = r15.length
            r33 = r1
            r1 = 1
            if (r15 != r1) goto L_0x03c7
            long[] r1 = r9.f3890i
            r15 = 0
            r16 = r1[r15]
            r18 = 0
            int r1 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r1 != 0) goto L_0x03c7
            long[] r1 = r9.f3891j
            r34 = r1[r15]
            r36 = 1000(0x3e8, double:4.94E-321)
            r40 = r14
            long r14 = r9.f3884c
            r38 = r14
            long r15 = com.google.android.gms.internal.ads.bkp.m5813a((long) r34, (long) r36, (long) r38)
            goto L_0x03cb
        L_0x03c5:
            r33 = r1
        L_0x03c7:
            r40 = r14
            r15 = 0
        L_0x03cb:
            int[] r1 = r12.f3904i
            int[] r14 = r12.f3905j
            r41 = r2
            long[] r2 = r12.f3906k
            r42 = r1
            boolean[] r1 = r12.f3907l
            r43 = r1
            int r1 = r9.f3883b
            r44 = r2
            r2 = 2
            if (r1 != r2) goto L_0x03e6
            r1 = r5 & 1
            if (r1 == 0) goto L_0x03e6
            r1 = 1
            goto L_0x03e7
        L_0x03e6:
            r1 = 0
        L_0x03e7:
            int[] r2 = r12.f3903h
            r2 = r2[r3]
            int r2 = r2 + r4
            r46 = r4
            r45 = r5
            long r4 = r9.f3884c
            if (r3 <= 0) goto L_0x03fb
            r49 = r14
            r47 = r15
            long r14 = r12.f3914s
            goto L_0x0401
        L_0x03fb:
            r49 = r14
            r47 = r15
            r14 = r23
        L_0x0401:
            r3 = r46
        L_0x0403:
            if (r3 >= r2) goto L_0x0477
            if (r6 == 0) goto L_0x040c
            int r9 = r8.mo12068o()
            goto L_0x040e
        L_0x040c:
            int r9 = r13.f3778b
        L_0x040e:
            if (r7 == 0) goto L_0x0417
            int r16 = r8.mo12068o()
            r50 = r2
            goto L_0x041d
        L_0x0417:
            r50 = r2
            int r2 = r13.f3779c
            r16 = r2
        L_0x041d:
            if (r3 != 0) goto L_0x0424
            if (r0 == 0) goto L_0x0424
            r2 = r33
            goto L_0x042d
        L_0x0424:
            if (r10 == 0) goto L_0x042b
            int r2 = r8.mo12065l()
            goto L_0x042d
        L_0x042b:
            int r2 = r13.f3780d
        L_0x042d:
            if (r11 == 0) goto L_0x0441
            r51 = r0
            int r0 = r8.mo12065l()
            int r0 = r0 * 1000
            r52 = r6
            r53 = r7
            long r6 = (long) r0
            long r6 = r6 / r4
            int r0 = (int) r6
            r49[r3] = r0
            goto L_0x044a
        L_0x0441:
            r51 = r0
            r52 = r6
            r53 = r7
            r0 = 0
            r49[r3] = r0
        L_0x044a:
            r36 = 1000(0x3e8, double:4.94E-321)
            r34 = r14
            r38 = r4
            long r6 = com.google.android.gms.internal.ads.bkp.m5813a((long) r34, (long) r36, (long) r38)
            long r6 = r6 - r47
            r44[r3] = r6
            r42[r3] = r16
            r0 = 16
            int r2 = r2 >> r0
            r0 = 1
            r2 = r2 & r0
            if (r2 != 0) goto L_0x0467
            if (r1 == 0) goto L_0x0465
            if (r3 != 0) goto L_0x0467
        L_0x0465:
            r0 = 1
            goto L_0x0468
        L_0x0467:
            r0 = 0
        L_0x0468:
            r43[r3] = r0
            long r6 = (long) r9
            long r14 = r14 + r6
            int r3 = r3 + 1
            r2 = r50
            r0 = r51
            r6 = r52
            r7 = r53
            goto L_0x0403
        L_0x0477:
            r50 = r2
            r12.f3914s = r14
            r3 = r25
            r4 = r50
            goto L_0x0496
        L_0x0480:
            r30 = r1
            r41 = r2
            r46 = r4
            r45 = r5
            r28 = r6
            r29 = r7
            r31 = r10
            r32 = r11
            r26 = r12
            r27 = r13
            r40 = r14
        L_0x0496:
            int r2 = r41 + 1
            r12 = r26
            r13 = r27
            r6 = r28
            r7 = r29
            r1 = r30
            r10 = r31
            r11 = r32
            r14 = r40
            r5 = r45
            r0 = r54
            r8 = 12
            goto L_0x0316
        L_0x04b0:
            r30 = r1
            r45 = r5
            r28 = r6
            r29 = r7
            r31 = r10
            r32 = r11
            r40 = r14
            int r0 = com.google.android.gms.internal.ads.bdd.f3690ac
            com.google.android.gms.internal.ads.bdf r0 = r11.mo11721d(r0)
            if (r0 == 0) goto L_0x0545
            r14 = r40
            com.google.android.gms.internal.ads.beb r1 = r14.f3823c
            com.google.android.gms.internal.ads.bec[] r1 = r1.f3889h
            r2 = r29
            com.google.android.gms.internal.ads.bdo r3 = r2.f3896a
            int r3 = r3.f3777a
            r1 = r1[r3]
            com.google.android.gms.internal.ads.bkh r0 = r0.f3743aP
            int r1 = r1.f3893a
            r3 = 8
            r0.mo12054c(r3)
            int r4 = r0.mo12065l()
            int r4 = com.google.android.gms.internal.ads.bdd.m5026b(r4)
            r5 = 1
            r4 = r4 & r5
            if (r4 != r5) goto L_0x04ec
            r0.mo12056d(r3)
        L_0x04ec:
            int r3 = r0.mo12059f()
            int r4 = r0.mo12068o()
            int r5 = r2.f3901f
            if (r4 != r5) goto L_0x0522
            if (r3 != 0) goto L_0x050f
            boolean[] r3 = r2.f3909n
            r5 = 0
            r6 = 0
        L_0x04fe:
            if (r5 >= r4) goto L_0x051e
            int r7 = r0.mo12059f()
            int r6 = r6 + r7
            if (r7 <= r1) goto L_0x0509
            r7 = 1
            goto L_0x050a
        L_0x0509:
            r7 = 0
        L_0x050a:
            r3[r5] = r7
            int r5 = r5 + 1
            goto L_0x04fe
        L_0x050f:
            if (r3 <= r1) goto L_0x0513
            r0 = 1
            goto L_0x0514
        L_0x0513:
            r0 = 0
        L_0x0514:
            int r3 = r3 * r4
            r1 = 0
            int r6 = r3 + 0
            boolean[] r3 = r2.f3909n
            java.util.Arrays.fill(r3, r1, r4, r0)
        L_0x051e:
            r2.mo11730a(r6)
            goto L_0x0547
        L_0x0522:
            com.google.android.gms.internal.ads.bad r0 = new com.google.android.gms.internal.ads.bad
            int r1 = r2.f3901f
            r2 = 41
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Length mismatch: "
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = ", "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0545:
            r2 = r29
        L_0x0547:
            int r0 = com.google.android.gms.internal.ads.bdd.f3691ad
            com.google.android.gms.internal.ads.bdf r0 = r11.mo11721d(r0)
            if (r0 == 0) goto L_0x059a
            com.google.android.gms.internal.ads.bkh r0 = r0.f3743aP
            r1 = 8
            r0.mo12054c(r1)
            int r3 = r0.mo12065l()
            int r4 = com.google.android.gms.internal.ads.bdd.m5026b(r3)
            r5 = 1
            r4 = r4 & r5
            if (r4 != r5) goto L_0x0565
            r0.mo12056d(r1)
        L_0x0565:
            int r1 = r0.mo12068o()
            if (r1 != r5) goto L_0x0581
            int r1 = com.google.android.gms.internal.ads.bdd.m5025a(r3)
            long r3 = r2.f3899d
            if (r1 != 0) goto L_0x0578
            long r0 = r0.mo12063j()
            goto L_0x057c
        L_0x0578:
            long r0 = r0.mo12069p()
        L_0x057c:
            r5 = 0
            long r3 = r3 + r0
            r2.f3899d = r3
            goto L_0x059a
        L_0x0581:
            com.google.android.gms.internal.ads.bad r0 = new com.google.android.gms.internal.ads.bad
            r2 = 40
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Unexpected saio entry count: "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x059a:
            int r0 = com.google.android.gms.internal.ads.bdd.f3695ah
            com.google.android.gms.internal.ads.bdf r0 = r11.mo11721d(r0)
            if (r0 == 0) goto L_0x05a8
            com.google.android.gms.internal.ads.bkh r0 = r0.f3743aP
            r1 = 0
            m5054a(r0, r1, r2)
        L_0x05a8:
            int r0 = com.google.android.gms.internal.ads.bdd.f3692ae
            com.google.android.gms.internal.ads.bdf r0 = r11.mo11721d(r0)
            int r1 = com.google.android.gms.internal.ads.bdd.f3693af
            com.google.android.gms.internal.ads.bdf r1 = r11.mo11721d(r1)
            if (r0 == 0) goto L_0x064f
            if (r1 == 0) goto L_0x064f
            com.google.android.gms.internal.ads.bkh r0 = r0.f3743aP
            com.google.android.gms.internal.ads.bkh r1 = r1.f3743aP
            r3 = 8
            r0.mo12054c(r3)
            int r3 = r0.mo12065l()
            int r4 = r0.mo12065l()
            int r5 = f3787b
            if (r4 != r5) goto L_0x064f
            int r3 = com.google.android.gms.internal.ads.bdd.m5025a(r3)
            r4 = 1
            if (r3 != r4) goto L_0x05d8
            r3 = 4
            r0.mo12056d(r3)
        L_0x05d8:
            int r0 = r0.mo12065l()
            if (r0 != r4) goto L_0x0647
            r0 = 8
            r1.mo12054c(r0)
            int r0 = r1.mo12065l()
            int r3 = r1.mo12065l()
            int r5 = f3787b
            if (r3 != r5) goto L_0x0645
            int r0 = com.google.android.gms.internal.ads.bdd.m5025a(r0)
            if (r0 != r4) goto L_0x060a
            long r3 = r1.mo12063j()
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0602
            r0 = 4
            r3 = 2
            goto L_0x0613
        L_0x0602:
            com.google.android.gms.internal.ads.bad r0 = new com.google.android.gms.internal.ads.bad
            java.lang.String r1 = "Variable length decription in sgpd found (unsupported)"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x060a:
            r3 = 2
            if (r0 < r3) goto L_0x0612
            r0 = 4
            r1.mo12056d(r0)
            goto L_0x0613
        L_0x0612:
            r0 = 4
        L_0x0613:
            long r4 = r1.mo12063j()
            r6 = 1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x063d
            r1.mo12056d(r3)
            int r3 = r1.mo12059f()
            r4 = 1
            if (r3 != r4) goto L_0x0651
            int r3 = r1.mo12059f()
            r5 = 16
            byte[] r6 = new byte[r5]
            r7 = 0
            r1.mo12050a(r6, r7, r5)
            r2.f3908m = r4
            com.google.android.gms.internal.ads.bec r1 = new com.google.android.gms.internal.ads.bec
            r1.<init>(r4, r3, r6)
            r2.f3910o = r1
            goto L_0x0651
        L_0x063d:
            com.google.android.gms.internal.ads.bad r0 = new com.google.android.gms.internal.ads.bad
            java.lang.String r1 = "Entry count in sgpd != 1 (unsupported)."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0645:
            r0 = 4
            goto L_0x0651
        L_0x0647:
            com.google.android.gms.internal.ads.bad r0 = new com.google.android.gms.internal.ads.bad
            java.lang.String r1 = "Entry count in sbgp != 1 (unsupported)."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x064f:
            r0 = 4
            r4 = 1
        L_0x0651:
            java.util.List<com.google.android.gms.internal.ads.bdf> r1 = r11.f3741aQ
            int r1 = r1.size()
            r3 = 0
        L_0x0658:
            if (r3 >= r1) goto L_0x068f
            java.util.List<com.google.android.gms.internal.ads.bdf> r5 = r11.f3741aQ
            java.lang.Object r5 = r5.get(r3)
            com.google.android.gms.internal.ads.bdf r5 = (com.google.android.gms.internal.ads.bdf) r5
            int r6 = r5.f3739aO
            int r7 = com.google.android.gms.internal.ads.bdd.f3694ag
            if (r6 != r7) goto L_0x0683
            com.google.android.gms.internal.ads.bkh r5 = r5.f3743aP
            r6 = 8
            r5.mo12054c(r6)
            r7 = r28
            r8 = 0
            r9 = 16
            r5.mo12050a(r7, r8, r9)
            byte[] r10 = f3788c
            boolean r10 = java.util.Arrays.equals(r7, r10)
            if (r10 == 0) goto L_0x068a
            m5054a(r5, r9, r2)
            goto L_0x068a
        L_0x0683:
            r7 = r28
            r6 = 8
            r8 = 0
            r9 = 16
        L_0x068a:
            int r3 = r3 + 1
            r28 = r7
            goto L_0x0658
        L_0x068f:
            r7 = r28
            goto L_0x06a7
        L_0x0692:
            r30 = r1
            r22 = r2
            r45 = r5
            r7 = r6
            goto L_0x06a3
        L_0x069a:
            r30 = r1
            r22 = r2
            r45 = r5
            r7 = r6
            r21 = r8
        L_0x06a3:
            r31 = r10
            r0 = 4
            r4 = 1
        L_0x06a7:
            r6 = 8
            r8 = 0
            int r10 = r31 + 1
            r6 = r7
            r8 = r21
            r2 = r22
            r1 = r30
            r5 = r45
            r0 = r54
            r7 = 0
            r9 = 8
            goto L_0x01de
        L_0x06bc:
            r8 = 0
            java.util.List<com.google.android.gms.internal.ads.bdf> r0 = r1.f3741aQ
            com.google.android.gms.internal.ads.zzhp r0 = m5051a((java.util.List<com.google.android.gms.internal.ads.bdf>) r0)
            if (r0 == 0) goto L_0x06e7
            r2 = r54
            android.util.SparseArray<com.google.android.gms.internal.ads.bdu> r1 = r2.f3798f
            int r1 = r1.size()
        L_0x06cd:
            if (r8 >= r1) goto L_0x06fe
            android.util.SparseArray<com.google.android.gms.internal.ads.bdu> r3 = r2.f3798f
            java.lang.Object r3 = r3.valueAt(r8)
            com.google.android.gms.internal.ads.bdu r3 = (com.google.android.gms.internal.ads.bdu) r3
            com.google.android.gms.internal.ads.bcq r4 = r3.f3822b
            com.google.android.gms.internal.ads.beb r3 = r3.f3823c
            com.google.android.gms.internal.ads.zzfs r3 = r3.f3887f
            com.google.android.gms.internal.ads.zzfs r3 = r3.mo13409a((com.google.android.gms.internal.ads.zzhp) r0)
            r4.mo11682a(r3)
            int r8 = r8 + 1
            goto L_0x06cd
        L_0x06e7:
            r2 = r54
            goto L_0x06fe
        L_0x06ea:
            r2 = r0
            java.util.Stack<com.google.android.gms.internal.ads.bde> r0 = r2.f3806n
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x06fe
            java.util.Stack<com.google.android.gms.internal.ads.bde> r0 = r2.f3806n
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.bde r0 = (com.google.android.gms.internal.ads.bde) r0
            r0.mo11719a((com.google.android.gms.internal.ads.bde) r1)
        L_0x06fe:
            r0 = r2
            goto L_0x0002
        L_0x0701:
            r2 = r0
            r54.m5052a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bdr.m5053a(long):void");
    }

    /* renamed from: a */
    private static void m5054a(bkh bkh, int i, bed bed) {
        bkh.mo12054c(i + 8);
        int b = bdd.m5026b(bkh.mo12065l());
        if ((b & 1) == 0) {
            boolean z = (b & 2) != 0;
            int o = bkh.mo12068o();
            if (o == bed.f3901f) {
                Arrays.fill(bed.f3909n, 0, o, z);
                bed.mo11730a(bkh.mo12051b());
                bkh.mo12050a(bed.f3912q.f4559a, 0, bed.f3911p);
                bed.f3912q.mo12054c(0);
                bed.f3913r = false;
                return;
            }
            int i2 = bed.f3901f;
            StringBuilder sb = new StringBuilder(41);
            sb.append("Length mismatch: ");
            sb.append(o);
            sb.append(", ");
            sb.append(i2);
            throw new bad(sb.toString());
        }
        throw new bad("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* renamed from: a */
    private static zzhp m5051a(List<bdf> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            bdf bdf = list.get(i);
            if (bdf.f3739aO == bdd.f3666U) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bdf.f3743aP.f4559a;
                UUID a = bdz.m5079a(bArr);
                if (a == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new zzhp.zza(a, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new zzhp((List<zzhp.zza>) arrayList);
    }
}
