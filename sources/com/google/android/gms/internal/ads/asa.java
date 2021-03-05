package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

final class asa<T> implements aso<T> {

    /* renamed from: a */
    private static final int[] f2402a = new int[0];

    /* renamed from: b */
    private static final Unsafe f2403b = atn.m3932c();

    /* renamed from: c */
    private final int[] f2404c;

    /* renamed from: d */
    private final Object[] f2405d;

    /* renamed from: e */
    private final int f2406e;

    /* renamed from: f */
    private final int f2407f;

    /* renamed from: g */
    private final arw f2408g;

    /* renamed from: h */
    private final boolean f2409h;

    /* renamed from: i */
    private final boolean f2410i;

    /* renamed from: j */
    private final boolean f2411j;

    /* renamed from: k */
    private final boolean f2412k;

    /* renamed from: l */
    private final int[] f2413l;

    /* renamed from: m */
    private final int f2414m;

    /* renamed from: n */
    private final int f2415n;

    /* renamed from: o */
    private final ase f2416o;

    /* renamed from: p */
    private final arf f2417p;

    /* renamed from: q */
    private final atg<?, ?> f2418q;

    /* renamed from: r */
    private final aqa<?> f2419r;

    /* renamed from: s */
    private final arr f2420s;

    private asa(int[] iArr, Object[] objArr, int i, int i2, arw arw, boolean z, boolean z2, int[] iArr2, int i3, int i4, ase ase, arf arf, atg<?, ?> atg, aqa<?> aqa, arr arr) {
        this.f2404c = iArr;
        this.f2405d = objArr;
        this.f2406e = i;
        this.f2407f = i2;
        this.f2410i = arw instanceof aqn;
        this.f2411j = z;
        this.f2409h = aqa != null && aqa.mo10986a(arw);
        this.f2412k = false;
        this.f2413l = iArr2;
        this.f2414m = i3;
        this.f2415n = i4;
        this.f2416o = ase;
        this.f2417p = arf;
        this.f2418q = atg;
        this.f2419r = aqa;
        this.f2408g = arw;
        this.f2420s = arr;
    }

    /* renamed from: f */
    private static boolean m3666f(int i) {
        return (i & 536870912) != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:174:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x040e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.ads.asa<T> m3636a(java.lang.Class<T> r37, com.google.android.gms.internal.ads.aru r38, com.google.android.gms.internal.ads.ase r39, com.google.android.gms.internal.ads.arf r40, com.google.android.gms.internal.ads.atg<?, ?> r41, com.google.android.gms.internal.ads.aqa<?> r42, com.google.android.gms.internal.ads.arr r43) {
        /*
            r0 = r38
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.asm
            if (r1 == 0) goto L_0x0487
            com.google.android.gms.internal.ads.asm r0 = (com.google.android.gms.internal.ads.asm) r0
            int r1 = r0.mo11087a()
            int r2 = com.google.android.gms.internal.ads.aqn.C1082e.f2338i
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x0014
            r11 = 1
            goto L_0x0015
        L_0x0014:
            r11 = 0
        L_0x0015:
            java.lang.String r1 = r0.mo11119d()
            int r2 = r1.length()
            char r5 = r1.charAt(r3)
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r7) goto L_0x003f
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r8 = r5
            r5 = 1
            r9 = 13
        L_0x002c:
            int r10 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r7) goto L_0x003c
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r8 = r8 | r5
            int r9 = r9 + 13
            r5 = r10
            goto L_0x002c
        L_0x003c:
            int r5 = r5 << r9
            r5 = r5 | r8
            goto L_0x0040
        L_0x003f:
            r10 = 1
        L_0x0040:
            int r8 = r10 + 1
            char r9 = r1.charAt(r10)
            if (r9 < r7) goto L_0x005f
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x004c:
            int r12 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x005c
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r10
            r9 = r9 | r8
            int r10 = r10 + 13
            r8 = r12
            goto L_0x004c
        L_0x005c:
            int r8 = r8 << r10
            r9 = r9 | r8
            goto L_0x0060
        L_0x005f:
            r12 = r8
        L_0x0060:
            if (r9 != 0) goto L_0x006e
            int[] r8 = f2402a
            r16 = r8
            r8 = 0
            r9 = 0
            r10 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            goto L_0x01a1
        L_0x006e:
            int r8 = r12 + 1
            char r9 = r1.charAt(r12)
            if (r9 < r7) goto L_0x008e
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x007a:
            int r12 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x008a
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r10
            r9 = r9 | r8
            int r10 = r10 + 13
            r8 = r12
            goto L_0x007a
        L_0x008a:
            int r8 = r8 << r10
            r8 = r8 | r9
            r9 = r8
            goto L_0x008f
        L_0x008e:
            r12 = r8
        L_0x008f:
            int r8 = r12 + 1
            char r10 = r1.charAt(r12)
            if (r10 < r7) goto L_0x00ae
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x009b:
            int r13 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x00ab
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r12
            r10 = r10 | r8
            int r12 = r12 + 13
            r8 = r13
            goto L_0x009b
        L_0x00ab:
            int r8 = r8 << r12
            r10 = r10 | r8
            goto L_0x00af
        L_0x00ae:
            r13 = r8
        L_0x00af:
            int r8 = r13 + 1
            char r12 = r1.charAt(r13)
            if (r12 < r7) goto L_0x00cf
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00bb:
            int r14 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x00cb
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r13
            r12 = r12 | r8
            int r13 = r13 + 13
            r8 = r14
            goto L_0x00bb
        L_0x00cb:
            int r8 = r8 << r13
            r8 = r8 | r12
            r12 = r8
            goto L_0x00d0
        L_0x00cf:
            r14 = r8
        L_0x00d0:
            int r8 = r14 + 1
            char r13 = r1.charAt(r14)
            if (r13 < r7) goto L_0x00f0
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00dc:
            int r15 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x00ec
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r14
            r13 = r13 | r8
            int r14 = r14 + 13
            r8 = r15
            goto L_0x00dc
        L_0x00ec:
            int r8 = r8 << r14
            r8 = r8 | r13
            r13 = r8
            goto L_0x00f1
        L_0x00f0:
            r15 = r8
        L_0x00f1:
            int r8 = r15 + 1
            char r14 = r1.charAt(r15)
            if (r14 < r7) goto L_0x0113
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x00fd:
            int r16 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x010e
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r15
            r14 = r14 | r8
            int r15 = r15 + 13
            r8 = r16
            goto L_0x00fd
        L_0x010e:
            int r8 = r8 << r15
            r8 = r8 | r14
            r14 = r8
            r8 = r16
        L_0x0113:
            int r15 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x0136
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x011f:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L_0x0131
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r8 = r8 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x011f
        L_0x0131:
            int r15 = r15 << r16
            r8 = r8 | r15
            r15 = r17
        L_0x0136:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L_0x0162
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r17 = 13
            r36 = r16
            r16 = r15
            r15 = r36
        L_0x0148:
            int r18 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L_0x015b
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r17
            r16 = r16 | r15
            int r17 = r17 + 13
            r15 = r18
            goto L_0x0148
        L_0x015b:
            int r15 = r15 << r17
            r15 = r16 | r15
            r3 = r18
            goto L_0x0164
        L_0x0162:
            r3 = r16
        L_0x0164:
            int r16 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r7) goto L_0x018f
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r17 = 13
            r36 = r16
            r16 = r3
            r3 = r36
        L_0x0176:
            int r18 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r7) goto L_0x0189
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r17
            r16 = r16 | r3
            int r17 = r17 + 13
            r3 = r18
            goto L_0x0176
        L_0x0189:
            int r3 = r3 << r17
            r3 = r16 | r3
            r16 = r18
        L_0x018f:
            int r17 = r3 + r8
            int r15 = r17 + r15
            int[] r15 = new int[r15]
            int r17 = r9 << 1
            int r10 = r17 + r10
            r36 = r15
            r15 = r10
            r10 = r12
            r12 = r16
            r16 = r36
        L_0x01a1:
            sun.misc.Unsafe r6 = f2403b
            java.lang.Object[] r17 = r0.mo11120e()
            com.google.android.gms.internal.ads.arw r18 = r0.mo11089c()
            java.lang.Class r7 = r18.getClass()
            r22 = r12
            int r12 = r14 * 3
            int[] r12 = new int[r12]
            int r14 = r14 << r4
            java.lang.Object[] r14 = new java.lang.Object[r14]
            int r18 = r3 + r8
            r23 = r3
            r20 = r15
            r8 = r22
            r15 = 0
            r19 = 0
            r22 = r18
        L_0x01c5:
            if (r8 >= r2) goto L_0x0459
            int r24 = r8 + 1
            char r8 = r1.charAt(r8)
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r8 < r4) goto L_0x01f9
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r25 = 13
            r36 = r24
            r24 = r8
            r8 = r36
        L_0x01dc:
            int r26 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r4) goto L_0x01f2
            r4 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r25
            r24 = r24 | r4
            int r25 = r25 + 13
            r8 = r26
            r4 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01dc
        L_0x01f2:
            int r4 = r8 << r25
            r8 = r24 | r4
            r4 = r26
            goto L_0x01fb
        L_0x01f9:
            r4 = r24
        L_0x01fb:
            int r24 = r4 + 1
            char r4 = r1.charAt(r4)
            r27 = r2
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r2) goto L_0x022f
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r25 = 13
            r36 = r24
            r24 = r4
            r4 = r36
        L_0x0212:
            int r26 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r2) goto L_0x0228
            r2 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r25
            r24 = r24 | r2
            int r25 = r25 + 13
            r4 = r26
            r2 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0212
        L_0x0228:
            int r2 = r4 << r25
            r4 = r24 | r2
            r2 = r26
            goto L_0x0231
        L_0x022f:
            r2 = r24
        L_0x0231:
            r28 = r3
            r3 = r4 & 255(0xff, float:3.57E-43)
            r29 = r11
            r11 = r4 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x0240
            int r11 = r15 + 1
            r16[r15] = r19
            r15 = r11
        L_0x0240:
            com.google.android.gms.internal.ads.aqg r11 = com.google.android.gms.internal.ads.aqg.MAP
            int r11 = r11.mo11008a()
            if (r3 <= r11) goto L_0x0301
            int r11 = r2 + 1
            char r2 = r1.charAt(r2)
            r30 = r11
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r11) goto L_0x0278
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r24 = r2
            r2 = r30
            r25 = 13
        L_0x025d:
            int r26 = r2 + 1
            char r2 = r1.charAt(r2)
            if (r2 < r11) goto L_0x0273
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r25
            r24 = r24 | r2
            int r25 = r25 + 13
            r2 = r26
            r11 = 55296(0xd800, float:7.7486E-41)
            goto L_0x025d
        L_0x0273:
            int r2 = r2 << r25
            r2 = r24 | r2
            goto L_0x027a
        L_0x0278:
            r26 = r30
        L_0x027a:
            com.google.android.gms.internal.ads.aqg r11 = com.google.android.gms.internal.ads.aqg.MESSAGE
            int r11 = r11.mo11008a()
            int r11 = r11 + 51
            if (r3 == r11) goto L_0x02b3
            com.google.android.gms.internal.ads.aqg r11 = com.google.android.gms.internal.ads.aqg.GROUP
            int r11 = r11.mo11008a()
            int r11 = r11 + 51
            if (r3 != r11) goto L_0x028f
            goto L_0x02b3
        L_0x028f:
            com.google.android.gms.internal.ads.aqg r11 = com.google.android.gms.internal.ads.aqg.ENUM
            int r11 = r11.mo11008a()
            int r11 = r11 + 51
            if (r3 != r11) goto L_0x02ad
            r11 = r5 & 1
            r31 = r15
            r15 = 1
            if (r11 != r15) goto L_0x02af
            int r11 = r19 / 3
            int r11 = r11 << r15
            int r11 = r11 + r15
            int r15 = r20 + 1
            r20 = r17[r20]
            r14[r11] = r20
            r24 = r15
            goto L_0x02b1
        L_0x02ad:
            r31 = r15
        L_0x02af:
            r24 = r20
        L_0x02b1:
            r15 = 1
            goto L_0x02c0
        L_0x02b3:
            r31 = r15
            int r11 = r19 / 3
            r15 = 1
            int r11 = r11 << r15
            int r11 = r11 + r15
            int r24 = r20 + 1
            r20 = r17[r20]
            r14[r11] = r20
        L_0x02c0:
            int r2 = r2 << r15
            r11 = r17[r2]
            boolean r15 = r11 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x02cc
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
        L_0x02c9:
            r32 = r10
            goto L_0x02d5
        L_0x02cc:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = m3640a((java.lang.Class<?>) r7, (java.lang.String) r11)
            r17[r2] = r11
            goto L_0x02c9
        L_0x02d5:
            long r10 = r6.objectFieldOffset(r11)
            int r10 = (int) r10
            int r2 = r2 + 1
            r11 = r17[r2]
            boolean r15 = r11 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x02e7
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
        L_0x02e4:
            r33 = r10
            goto L_0x02f0
        L_0x02e7:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = m3640a((java.lang.Class<?>) r7, (java.lang.String) r11)
            r17[r2] = r11
            goto L_0x02e4
        L_0x02f0:
            long r10 = r6.objectFieldOffset(r11)
            int r2 = (int) r10
            r34 = r13
            r35 = r14
            r20 = r24
            r11 = r33
            r14 = r2
            r2 = 0
            goto L_0x0414
        L_0x0301:
            r32 = r10
            r31 = r15
            int r10 = r20 + 1
            r11 = r17[r20]
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = m3640a((java.lang.Class<?>) r7, (java.lang.String) r11)
            com.google.android.gms.internal.ads.aqg r15 = com.google.android.gms.internal.ads.aqg.MESSAGE
            int r15 = r15.mo11008a()
            if (r3 == r15) goto L_0x03a5
            com.google.android.gms.internal.ads.aqg r15 = com.google.android.gms.internal.ads.aqg.GROUP
            int r15 = r15.mo11008a()
            if (r3 != r15) goto L_0x0321
            goto L_0x03a5
        L_0x0321:
            com.google.android.gms.internal.ads.aqg r15 = com.google.android.gms.internal.ads.aqg.MESSAGE_LIST
            int r15 = r15.mo11008a()
            if (r3 == r15) goto L_0x0393
            com.google.android.gms.internal.ads.aqg r15 = com.google.android.gms.internal.ads.aqg.GROUP_LIST
            int r15 = r15.mo11008a()
            if (r3 != r15) goto L_0x0332
            goto L_0x0393
        L_0x0332:
            com.google.android.gms.internal.ads.aqg r15 = com.google.android.gms.internal.ads.aqg.ENUM
            int r15 = r15.mo11008a()
            if (r3 == r15) goto L_0x0381
            com.google.android.gms.internal.ads.aqg r15 = com.google.android.gms.internal.ads.aqg.ENUM_LIST
            int r15 = r15.mo11008a()
            if (r3 == r15) goto L_0x0381
            com.google.android.gms.internal.ads.aqg r15 = com.google.android.gms.internal.ads.aqg.ENUM_LIST_PACKED
            int r15 = r15.mo11008a()
            if (r3 != r15) goto L_0x034b
            goto L_0x0381
        L_0x034b:
            com.google.android.gms.internal.ads.aqg r15 = com.google.android.gms.internal.ads.aqg.MAP
            int r15 = r15.mo11008a()
            if (r3 != r15) goto L_0x037d
            int r15 = r23 + 1
            r16[r23] = r19
            int r20 = r19 / 3
            r23 = 1
            int r20 = r20 << 1
            int r23 = r10 + 1
            r10 = r17[r10]
            r14[r20] = r10
            r10 = r4 & 2048(0x800, float:2.87E-42)
            if (r10 == 0) goto L_0x0374
            int r20 = r20 + 1
            int r10 = r23 + 1
            r23 = r17[r23]
            r14[r20] = r23
            r34 = r13
            r35 = r14
            goto L_0x037a
        L_0x0374:
            r34 = r13
            r35 = r14
            r10 = r23
        L_0x037a:
            r23 = r15
            goto L_0x03b4
        L_0x037d:
            r34 = r13
            r13 = 1
            goto L_0x03b2
        L_0x0381:
            r15 = r5 & 1
            r34 = r13
            r13 = 1
            if (r15 != r13) goto L_0x03b2
            int r15 = r19 / 3
            int r15 = r15 << r13
            int r15 = r15 + r13
            int r20 = r10 + 1
            r10 = r17[r10]
            r14[r15] = r10
            goto L_0x03a0
        L_0x0393:
            r34 = r13
            r13 = 1
            int r15 = r19 / 3
            int r15 = r15 << r13
            int r15 = r15 + r13
            int r20 = r10 + 1
            r10 = r17[r10]
            r14[r15] = r10
        L_0x03a0:
            r35 = r14
            r10 = r20
            goto L_0x03b4
        L_0x03a5:
            r34 = r13
            r13 = 1
            int r15 = r19 / 3
            int r15 = r15 << r13
            int r15 = r15 + r13
            java.lang.Class r20 = r11.getType()
            r14[r15] = r20
        L_0x03b2:
            r35 = r14
        L_0x03b4:
            long r13 = r6.objectFieldOffset(r11)
            int r11 = (int) r13
            r13 = r5 & 1
            r14 = 1
            if (r13 != r14) goto L_0x040e
            com.google.android.gms.internal.ads.aqg r13 = com.google.android.gms.internal.ads.aqg.GROUP
            int r13 = r13.mo11008a()
            if (r3 > r13) goto L_0x040e
            int r13 = r2 + 1
            char r2 = r1.charAt(r2)
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r14) goto L_0x03ea
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x03d5:
            int r20 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r14) goto L_0x03e6
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r15
            r2 = r2 | r13
            int r15 = r15 + 13
            r13 = r20
            goto L_0x03d5
        L_0x03e6:
            int r13 = r13 << r15
            r2 = r2 | r13
            r13 = r20
        L_0x03ea:
            r15 = 1
            int r20 = r9 << 1
            int r21 = r2 / 32
            int r20 = r20 + r21
            r14 = r17[r20]
            boolean r15 = r14 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x03fa
            java.lang.reflect.Field r14 = (java.lang.reflect.Field) r14
            goto L_0x0402
        L_0x03fa:
            java.lang.String r14 = (java.lang.String) r14
            java.lang.reflect.Field r14 = m3640a((java.lang.Class<?>) r7, (java.lang.String) r14)
            r17[r20] = r14
        L_0x0402:
            long r14 = r6.objectFieldOffset(r14)
            int r14 = (int) r14
            int r2 = r2 % 32
            r20 = r10
            r26 = r13
            goto L_0x0414
        L_0x040e:
            r26 = r2
            r20 = r10
            r2 = 0
            r14 = 0
        L_0x0414:
            r10 = 18
            if (r3 < r10) goto L_0x0422
            r10 = 49
            if (r3 > r10) goto L_0x0422
            int r10 = r22 + 1
            r16[r22] = r11
            r22 = r10
        L_0x0422:
            int r10 = r19 + 1
            r12[r19] = r8
            int r8 = r10 + 1
            r13 = r4 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x042f
            r13 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0430
        L_0x042f:
            r13 = 0
        L_0x0430:
            r4 = r4 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x0437
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0438
        L_0x0437:
            r4 = 0
        L_0x0438:
            r4 = r4 | r13
            int r3 = r3 << 20
            r3 = r3 | r4
            r3 = r3 | r11
            r12[r10] = r3
            int r19 = r8 + 1
            int r2 = r2 << 20
            r2 = r2 | r14
            r12[r8] = r2
            r8 = r26
            r2 = r27
            r3 = r28
            r11 = r29
            r15 = r31
            r10 = r32
            r13 = r34
            r14 = r35
            r4 = 1
            goto L_0x01c5
        L_0x0459:
            r28 = r3
            r32 = r10
            r29 = r11
            r34 = r13
            r35 = r14
            com.google.android.gms.internal.ads.asa r1 = new com.google.android.gms.internal.ads.asa
            com.google.android.gms.internal.ads.arw r10 = r0.mo11089c()
            r0 = 0
            r5 = r1
            r6 = r12
            r7 = r35
            r8 = r32
            r9 = r34
            r12 = r0
            r13 = r16
            r14 = r28
            r15 = r18
            r16 = r39
            r17 = r40
            r18 = r41
            r19 = r42
            r20 = r43
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r1
        L_0x0487:
            com.google.android.gms.internal.ads.atb r0 = (com.google.android.gms.internal.ads.atb) r0
            r0.mo11087a()
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.asa.m3636a(java.lang.Class, com.google.android.gms.internal.ads.aru, com.google.android.gms.internal.ads.ase, com.google.android.gms.internal.ads.arf, com.google.android.gms.internal.ads.atg, com.google.android.gms.internal.ads.aqa, com.google.android.gms.internal.ads.arr):com.google.android.gms.internal.ads.asa");
    }

    /* renamed from: a */
    private static Field m3640a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: a */
    public final T mo11101a() {
        return this.f2416o.mo11111a(this.f2408g);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (com.google.android.gms.internal.ads.asq.m3780a(com.google.android.gms.internal.ads.atn.m3944f(r10, r6), com.google.android.gms.internal.ads.atn.m3944f(r11, r6)) != false) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (com.google.android.gms.internal.ads.atn.m3928b(r10, r6) == com.google.android.gms.internal.ads.atn.m3928b(r11, r6)) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r11, r6)) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (com.google.android.gms.internal.ads.atn.m3928b(r10, r6) == com.google.android.gms.internal.ads.atn.m3928b(r11, r6)) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r11, r6)) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r11, r6)) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r11, r6)) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (com.google.android.gms.internal.ads.asq.m3780a(com.google.android.gms.internal.ads.atn.m3944f(r10, r6), com.google.android.gms.internal.ads.atn.m3944f(r11, r6)) != false) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (com.google.android.gms.internal.ads.asq.m3780a(com.google.android.gms.internal.ads.atn.m3944f(r10, r6), com.google.android.gms.internal.ads.atn.m3944f(r11, r6)) != false) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (com.google.android.gms.internal.ads.asq.m3780a(com.google.android.gms.internal.ads.atn.m3944f(r10, r6), com.google.android.gms.internal.ads.atn.m3944f(r11, r6)) != false) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (com.google.android.gms.internal.ads.atn.m3936c(r10, r6) == com.google.android.gms.internal.ads.atn.m3936c(r11, r6)) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r11, r6)) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (com.google.android.gms.internal.ads.atn.m3928b(r10, r6) == com.google.android.gms.internal.ads.atn.m3928b(r11, r6)) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r11, r6)) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (com.google.android.gms.internal.ads.atn.m3928b(r10, r6) == com.google.android.gms.internal.ads.atn.m3928b(r11, r6)) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (com.google.android.gms.internal.ads.atn.m3928b(r10, r6) == com.google.android.gms.internal.ads.atn.m3928b(r11, r6)) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x019c, code lost:
        if (com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r11, r6)) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01af, code lost:
        if (com.google.android.gms.internal.ads.atn.m3928b(r10, r6) == com.google.android.gms.internal.ads.atn.m3928b(r11, r6)) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b1, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.ads.asq.m3780a(com.google.android.gms.internal.ads.atn.m3944f(r10, r6), com.google.android.gms.internal.ads.atn.m3944f(r11, r6)) != false) goto L_0x01b2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11105a(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f2404c
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01b9
            int r4 = r9.m3661d((int) r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x019f;
                case 1: goto L_0x018e;
                case 2: goto L_0x017b;
                case 3: goto L_0x0168;
                case 4: goto L_0x0157;
                case 5: goto L_0x0144;
                case 6: goto L_0x0132;
                case 7: goto L_0x0120;
                case 8: goto L_0x010a;
                case 9: goto L_0x00f4;
                case 10: goto L_0x00de;
                case 11: goto L_0x00cc;
                case 12: goto L_0x00ba;
                case 13: goto L_0x00a8;
                case 14: goto L_0x0094;
                case 15: goto L_0x0082;
                case 16: goto L_0x006e;
                case 17: goto L_0x0058;
                case 18: goto L_0x004a;
                case 19: goto L_0x004a;
                case 20: goto L_0x004a;
                case 21: goto L_0x004a;
                case 22: goto L_0x004a;
                case 23: goto L_0x004a;
                case 24: goto L_0x004a;
                case 25: goto L_0x004a;
                case 26: goto L_0x004a;
                case 27: goto L_0x004a;
                case 28: goto L_0x004a;
                case 29: goto L_0x004a;
                case 30: goto L_0x004a;
                case 31: goto L_0x004a;
                case 32: goto L_0x004a;
                case 33: goto L_0x004a;
                case 34: goto L_0x004a;
                case 35: goto L_0x004a;
                case 36: goto L_0x004a;
                case 37: goto L_0x004a;
                case 38: goto L_0x004a;
                case 39: goto L_0x004a;
                case 40: goto L_0x004a;
                case 41: goto L_0x004a;
                case 42: goto L_0x004a;
                case 43: goto L_0x004a;
                case 44: goto L_0x004a;
                case 45: goto L_0x004a;
                case 46: goto L_0x004a;
                case 47: goto L_0x004a;
                case 48: goto L_0x004a;
                case 49: goto L_0x004a;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01b2
        L_0x001c:
            int r4 = r9.m3663e((int) r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r10, (long) r4)
            int r4 = com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r11, (long) r4)
            if (r8 != r4) goto L_0x01b1
            java.lang.Object r4 = com.google.android.gms.internal.ads.atn.m3944f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.atn.m3944f(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.asq.m3780a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01b2
            goto L_0x01b1
        L_0x003c:
            java.lang.Object r3 = com.google.android.gms.internal.ads.atn.m3944f(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.ads.atn.m3944f(r11, r6)
            boolean r3 = com.google.android.gms.internal.ads.asq.m3780a((java.lang.Object) r3, (java.lang.Object) r4)
            goto L_0x01b2
        L_0x004a:
            java.lang.Object r3 = com.google.android.gms.internal.ads.atn.m3944f(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.ads.atn.m3944f(r11, r6)
            boolean r3 = com.google.android.gms.internal.ads.asq.m3780a((java.lang.Object) r3, (java.lang.Object) r4)
            goto L_0x01b2
        L_0x0058:
            boolean r4 = r9.m3660c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            java.lang.Object r4 = com.google.android.gms.internal.ads.atn.m3944f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.atn.m3944f(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.asq.m3780a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01b2
            goto L_0x01b1
        L_0x006e:
            boolean r4 = r9.m3660c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            long r4 = com.google.android.gms.internal.ads.atn.m3928b(r10, r6)
            long r6 = com.google.android.gms.internal.ads.atn.m3928b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b2
            goto L_0x01b1
        L_0x0082:
            boolean r4 = r9.m3660c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            int r4 = com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01b2
            goto L_0x01b1
        L_0x0094:
            boolean r4 = r9.m3660c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            long r4 = com.google.android.gms.internal.ads.atn.m3928b(r10, r6)
            long r6 = com.google.android.gms.internal.ads.atn.m3928b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b2
            goto L_0x01b1
        L_0x00a8:
            boolean r4 = r9.m3660c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            int r4 = com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01b2
            goto L_0x01b1
        L_0x00ba:
            boolean r4 = r9.m3660c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            int r4 = com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01b2
            goto L_0x01b1
        L_0x00cc:
            boolean r4 = r9.m3660c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            int r4 = com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01b2
            goto L_0x01b1
        L_0x00de:
            boolean r4 = r9.m3660c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            java.lang.Object r4 = com.google.android.gms.internal.ads.atn.m3944f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.atn.m3944f(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.asq.m3780a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01b2
            goto L_0x01b1
        L_0x00f4:
            boolean r4 = r9.m3660c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            java.lang.Object r4 = com.google.android.gms.internal.ads.atn.m3944f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.atn.m3944f(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.asq.m3780a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01b2
            goto L_0x01b1
        L_0x010a:
            boolean r4 = r9.m3660c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            java.lang.Object r4 = com.google.android.gms.internal.ads.atn.m3944f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.atn.m3944f(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.asq.m3780a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01b2
            goto L_0x01b1
        L_0x0120:
            boolean r4 = r9.m3660c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            boolean r4 = com.google.android.gms.internal.ads.atn.m3936c(r10, r6)
            boolean r5 = com.google.android.gms.internal.ads.atn.m3936c(r11, r6)
            if (r4 == r5) goto L_0x01b2
            goto L_0x01b1
        L_0x0132:
            boolean r4 = r9.m3660c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            int r4 = com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01b2
            goto L_0x01b1
        L_0x0144:
            boolean r4 = r9.m3660c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            long r4 = com.google.android.gms.internal.ads.atn.m3928b(r10, r6)
            long r6 = com.google.android.gms.internal.ads.atn.m3928b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b2
            goto L_0x01b1
        L_0x0157:
            boolean r4 = r9.m3660c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            int r4 = com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01b2
            goto L_0x01b1
        L_0x0168:
            boolean r4 = r9.m3660c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            long r4 = com.google.android.gms.internal.ads.atn.m3928b(r10, r6)
            long r6 = com.google.android.gms.internal.ads.atn.m3928b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b2
            goto L_0x01b1
        L_0x017b:
            boolean r4 = r9.m3660c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            long r4 = com.google.android.gms.internal.ads.atn.m3928b(r10, r6)
            long r6 = com.google.android.gms.internal.ads.atn.m3928b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b2
            goto L_0x01b1
        L_0x018e:
            boolean r4 = r9.m3660c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            int r4 = com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01b2
            goto L_0x01b1
        L_0x019f:
            boolean r4 = r9.m3660c(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            long r4 = com.google.android.gms.internal.ads.atn.m3928b(r10, r6)
            long r6 = com.google.android.gms.internal.ads.atn.m3928b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b2
        L_0x01b1:
            r3 = 0
        L_0x01b2:
            if (r3 != 0) goto L_0x01b5
            return r1
        L_0x01b5:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01b9:
            com.google.android.gms.internal.ads.atg<?, ?> r0 = r9.f2418q
            java.lang.Object r0 = r0.mo11176b(r10)
            com.google.android.gms.internal.ads.atg<?, ?> r2 = r9.f2418q
            java.lang.Object r2 = r2.mo11176b(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01cc
            return r1
        L_0x01cc:
            boolean r0 = r9.f2409h
            if (r0 == 0) goto L_0x01e1
            com.google.android.gms.internal.ads.aqa<?> r0 = r9.f2419r
            com.google.android.gms.internal.ads.aqd r10 = r0.mo10979a((java.lang.Object) r10)
            com.google.android.gms.internal.ads.aqa<?> r0 = r9.f2419r
            com.google.android.gms.internal.ads.aqd r11 = r0.mo10979a((java.lang.Object) r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01e1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.asa.mo11105a(java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: a */
    public final int mo11100a(T t) {
        int length = this.f2404c.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int d = m3661d(i2);
            int i3 = this.f2404c[i2];
            long j = (long) (1048575 & d);
            int i4 = 37;
            switch ((d & 267386880) >>> 20) {
                case 0:
                    i = (i * 53) + aqp.m3493a(Double.doubleToLongBits(atn.m3941e(t, j)));
                    break;
                case 1:
                    i = (i * 53) + Float.floatToIntBits(atn.m3937d(t, j));
                    break;
                case 2:
                    i = (i * 53) + aqp.m3493a(atn.m3928b(t, j));
                    break;
                case 3:
                    i = (i * 53) + aqp.m3493a(atn.m3928b(t, j));
                    break;
                case 4:
                    i = (i * 53) + atn.m3913a((Object) t, j);
                    break;
                case 5:
                    i = (i * 53) + aqp.m3493a(atn.m3928b(t, j));
                    break;
                case 6:
                    i = (i * 53) + atn.m3913a((Object) t, j);
                    break;
                case 7:
                    i = (i * 53) + aqp.m3494a(atn.m3936c(t, j));
                    break;
                case 8:
                    i = (i * 53) + ((String) atn.m3944f(t, j)).hashCode();
                    break;
                case 9:
                    Object f = atn.m3944f(t, j);
                    if (f != null) {
                        i4 = f.hashCode();
                    }
                    i = (i * 53) + i4;
                    break;
                case 10:
                    i = (i * 53) + atn.m3944f(t, j).hashCode();
                    break;
                case 11:
                    i = (i * 53) + atn.m3913a((Object) t, j);
                    break;
                case 12:
                    i = (i * 53) + atn.m3913a((Object) t, j);
                    break;
                case 13:
                    i = (i * 53) + atn.m3913a((Object) t, j);
                    break;
                case 14:
                    i = (i * 53) + aqp.m3493a(atn.m3928b(t, j));
                    break;
                case 15:
                    i = (i * 53) + atn.m3913a((Object) t, j);
                    break;
                case 16:
                    i = (i * 53) + aqp.m3493a(atn.m3928b(t, j));
                    break;
                case 17:
                    Object f2 = atn.m3944f(t, j);
                    if (f2 != null) {
                        i4 = f2.hashCode();
                    }
                    i = (i * 53) + i4;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = (i * 53) + atn.m3944f(t, j).hashCode();
                    break;
                case 50:
                    i = (i * 53) + atn.m3944f(t, j).hashCode();
                    break;
                case 51:
                    if (!m3648a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + aqp.m3493a(Double.doubleToLongBits(m3651b(t, j)));
                        break;
                    }
                case 52:
                    if (!m3648a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + Float.floatToIntBits(m3658c(t, j));
                        break;
                    }
                case 53:
                    if (!m3648a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + aqp.m3493a(m3664e(t, j));
                        break;
                    }
                case 54:
                    if (!m3648a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + aqp.m3493a(m3664e(t, j));
                        break;
                    }
                case 55:
                    if (!m3648a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m3662d(t, j);
                        break;
                    }
                case 56:
                    if (!m3648a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + aqp.m3493a(m3664e(t, j));
                        break;
                    }
                case 57:
                    if (!m3648a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m3662d(t, j);
                        break;
                    }
                case 58:
                    if (!m3648a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + aqp.m3494a(m3667f(t, j));
                        break;
                    }
                case 59:
                    if (!m3648a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + ((String) atn.m3944f(t, j)).hashCode();
                        break;
                    }
                case 60:
                    if (!m3648a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + atn.m3944f(t, j).hashCode();
                        break;
                    }
                case 61:
                    if (!m3648a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + atn.m3944f(t, j).hashCode();
                        break;
                    }
                case 62:
                    if (!m3648a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m3662d(t, j);
                        break;
                    }
                case 63:
                    if (!m3648a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m3662d(t, j);
                        break;
                    }
                case 64:
                    if (!m3648a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m3662d(t, j);
                        break;
                    }
                case 65:
                    if (!m3648a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + aqp.m3493a(m3664e(t, j));
                        break;
                    }
                case 66:
                    if (!m3648a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m3662d(t, j);
                        break;
                    }
                case 67:
                    if (!m3648a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + aqp.m3493a(m3664e(t, j));
                        break;
                    }
                case 68:
                    if (!m3648a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + atn.m3944f(t, j).hashCode();
                        break;
                    }
            }
        }
        int hashCode = (i * 53) + this.f2418q.mo11176b(t).hashCode();
        return this.f2409h ? (hashCode * 53) + this.f2419r.mo10979a((Object) t).hashCode() : hashCode;
    }

    /* renamed from: b */
    public final void mo11107b(T t, T t2) {
        if (t2 != null) {
            for (int i = 0; i < this.f2404c.length; i += 3) {
                int d = m3661d(i);
                long j = (long) (1048575 & d);
                int i2 = this.f2404c[i];
                switch ((d & 267386880) >>> 20) {
                    case 0:
                        if (!m3647a(t2, i)) {
                            break;
                        } else {
                            atn.m3918a((Object) t, j, atn.m3941e(t2, j));
                            m3654b(t, i);
                            break;
                        }
                    case 1:
                        if (!m3647a(t2, i)) {
                            break;
                        } else {
                            atn.m3919a((Object) t, j, atn.m3937d(t2, j));
                            m3654b(t, i);
                            break;
                        }
                    case 2:
                        if (!m3647a(t2, i)) {
                            break;
                        } else {
                            atn.m3921a((Object) t, j, atn.m3928b(t2, j));
                            m3654b(t, i);
                            break;
                        }
                    case 3:
                        if (!m3647a(t2, i)) {
                            break;
                        } else {
                            atn.m3921a((Object) t, j, atn.m3928b(t2, j));
                            m3654b(t, i);
                            break;
                        }
                    case 4:
                        if (!m3647a(t2, i)) {
                            break;
                        } else {
                            atn.m3920a((Object) t, j, atn.m3913a((Object) t2, j));
                            m3654b(t, i);
                            break;
                        }
                    case 5:
                        if (!m3647a(t2, i)) {
                            break;
                        } else {
                            atn.m3921a((Object) t, j, atn.m3928b(t2, j));
                            m3654b(t, i);
                            break;
                        }
                    case 6:
                        if (!m3647a(t2, i)) {
                            break;
                        } else {
                            atn.m3920a((Object) t, j, atn.m3913a((Object) t2, j));
                            m3654b(t, i);
                            break;
                        }
                    case 7:
                        if (!m3647a(t2, i)) {
                            break;
                        } else {
                            atn.m3923a((Object) t, j, atn.m3936c(t2, j));
                            m3654b(t, i);
                            break;
                        }
                    case 8:
                        if (!m3647a(t2, i)) {
                            break;
                        } else {
                            atn.m3922a((Object) t, j, atn.m3944f(t2, j));
                            m3654b(t, i);
                            break;
                        }
                    case 9:
                        m3646a(t, t2, i);
                        break;
                    case 10:
                        if (!m3647a(t2, i)) {
                            break;
                        } else {
                            atn.m3922a((Object) t, j, atn.m3944f(t2, j));
                            m3654b(t, i);
                            break;
                        }
                    case 11:
                        if (!m3647a(t2, i)) {
                            break;
                        } else {
                            atn.m3920a((Object) t, j, atn.m3913a((Object) t2, j));
                            m3654b(t, i);
                            break;
                        }
                    case 12:
                        if (!m3647a(t2, i)) {
                            break;
                        } else {
                            atn.m3920a((Object) t, j, atn.m3913a((Object) t2, j));
                            m3654b(t, i);
                            break;
                        }
                    case 13:
                        if (!m3647a(t2, i)) {
                            break;
                        } else {
                            atn.m3920a((Object) t, j, atn.m3913a((Object) t2, j));
                            m3654b(t, i);
                            break;
                        }
                    case 14:
                        if (!m3647a(t2, i)) {
                            break;
                        } else {
                            atn.m3921a((Object) t, j, atn.m3928b(t2, j));
                            m3654b(t, i);
                            break;
                        }
                    case 15:
                        if (!m3647a(t2, i)) {
                            break;
                        } else {
                            atn.m3920a((Object) t, j, atn.m3913a((Object) t2, j));
                            m3654b(t, i);
                            break;
                        }
                    case 16:
                        if (!m3647a(t2, i)) {
                            break;
                        } else {
                            atn.m3921a((Object) t, j, atn.m3928b(t2, j));
                            m3654b(t, i);
                            break;
                        }
                    case 17:
                        m3646a(t, t2, i);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.f2417p.mo11060a(t, t2, j);
                        break;
                    case 50:
                        asq.m3777a(this.f2420s, t, t2, j);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!m3648a(t2, i2, i)) {
                            break;
                        } else {
                            atn.m3922a((Object) t, j, atn.m3944f(t2, j));
                            m3655b(t, i2, i);
                            break;
                        }
                    case 60:
                        m3657b(t, t2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!m3648a(t2, i2, i)) {
                            break;
                        } else {
                            atn.m3922a((Object) t, j, atn.m3944f(t2, j));
                            m3655b(t, i2, i);
                            break;
                        }
                    case 68:
                        m3657b(t, t2, i);
                        break;
                }
            }
            if (!this.f2411j) {
                asq.m3778a(this.f2418q, t, t2);
                if (this.f2409h) {
                    asq.m3776a(this.f2419r, t, t2);
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    private final void m3646a(T t, T t2, int i) {
        long d = (long) (m3661d(i) & 1048575);
        if (m3647a(t2, i)) {
            Object f = atn.m3944f(t, d);
            Object f2 = atn.m3944f(t2, d);
            if (f != null && f2 != null) {
                atn.m3922a((Object) t, d, aqp.m3496a(f, f2));
                m3654b(t, i);
            } else if (f2 != null) {
                atn.m3922a((Object) t, d, f2);
                m3654b(t, i);
            }
        }
    }

    /* renamed from: b */
    private final void m3657b(T t, T t2, int i) {
        int d = m3661d(i);
        int i2 = this.f2404c[i];
        long j = (long) (d & 1048575);
        if (m3648a(t2, i2, i)) {
            Object f = atn.m3944f(t, j);
            Object f2 = atn.m3944f(t2, j);
            if (f != null && f2 != null) {
                atn.m3922a((Object) t, j, aqp.m3496a(f, f2));
                m3655b(t, i2, i);
            } else if (f2 != null) {
                atn.m3922a((Object) t, j, f2);
                m3655b(t, i2, i);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x09cb, code lost:
        r18 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0aef, code lost:
        r3 = r3 + 3;
        r9 = r18;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo11106b(T r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            boolean r2 = r0.f2411j
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 0
            r7 = 1
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x055f
            sun.misc.Unsafe r2 = f2403b
            r12 = 0
            r13 = 0
        L_0x0016:
            int[] r14 = r0.f2404c
            int r14 = r14.length
            if (r12 >= r14) goto L_0x0557
            int r14 = r0.m3661d((int) r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.f2404c
            r3 = r3[r12]
            r14 = r14 & r8
            long r5 = (long) r14
            com.google.android.gms.internal.ads.aqg r14 = com.google.android.gms.internal.ads.aqg.DOUBLE_LIST_PACKED
            int r14 = r14.mo11008a()
            if (r15 < r14) goto L_0x0041
            com.google.android.gms.internal.ads.aqg r14 = com.google.android.gms.internal.ads.aqg.SINT64_LIST_PACKED
            int r14 = r14.mo11008a()
            if (r15 > r14) goto L_0x0041
            int[] r14 = r0.f2404c
            int r17 = r12 + 2
            r14 = r14[r17]
            r14 = r14 & r8
            goto L_0x0042
        L_0x0041:
            r14 = 0
        L_0x0042:
            switch(r15) {
                case 0: goto L_0x0544;
                case 1: goto L_0x0538;
                case 2: goto L_0x0528;
                case 3: goto L_0x0518;
                case 4: goto L_0x0508;
                case 5: goto L_0x04fc;
                case 6: goto L_0x04f0;
                case 7: goto L_0x04e4;
                case 8: goto L_0x04c4;
                case 9: goto L_0x04af;
                case 10: goto L_0x049c;
                case 11: goto L_0x048b;
                case 12: goto L_0x047a;
                case 13: goto L_0x046d;
                case 14: goto L_0x0460;
                case 15: goto L_0x044f;
                case 16: goto L_0x043e;
                case 17: goto L_0x0427;
                case 18: goto L_0x041c;
                case 19: goto L_0x0411;
                case 20: goto L_0x0406;
                case 21: goto L_0x03fb;
                case 22: goto L_0x03f0;
                case 23: goto L_0x03e5;
                case 24: goto L_0x03da;
                case 25: goto L_0x03cf;
                case 26: goto L_0x03c4;
                case 27: goto L_0x03b5;
                case 28: goto L_0x03aa;
                case 29: goto L_0x039f;
                case 30: goto L_0x0394;
                case 31: goto L_0x0389;
                case 32: goto L_0x037e;
                case 33: goto L_0x0373;
                case 34: goto L_0x0368;
                case 35: goto L_0x0347;
                case 36: goto L_0x0326;
                case 37: goto L_0x0305;
                case 38: goto L_0x02e4;
                case 39: goto L_0x02c3;
                case 40: goto L_0x02a2;
                case 41: goto L_0x0281;
                case 42: goto L_0x0260;
                case 43: goto L_0x023f;
                case 44: goto L_0x021e;
                case 45: goto L_0x01fd;
                case 46: goto L_0x01dc;
                case 47: goto L_0x01bb;
                case 48: goto L_0x019a;
                case 49: goto L_0x018b;
                case 50: goto L_0x017a;
                case 51: goto L_0x016b;
                case 52: goto L_0x015e;
                case 53: goto L_0x014d;
                case 54: goto L_0x013c;
                case 55: goto L_0x012b;
                case 56: goto L_0x011e;
                case 57: goto L_0x0111;
                case 58: goto L_0x0104;
                case 59: goto L_0x00e4;
                case 60: goto L_0x00cf;
                case 61: goto L_0x00bc;
                case 62: goto L_0x00ab;
                case 63: goto L_0x009a;
                case 64: goto L_0x008d;
                case 65: goto L_0x0080;
                case 66: goto L_0x006f;
                case 67: goto L_0x005e;
                case 68: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x0551
        L_0x0047:
            boolean r14 = r0.m3648a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.ads.atn.m3944f(r1, r5)
            com.google.android.gms.internal.ads.arw r5 = (com.google.android.gms.internal.ads.arw) r5
            com.google.android.gms.internal.ads.aso r6 = r0.m3637a((int) r12)
            int r3 = com.google.android.gms.internal.ads.apt.m3166c((int) r3, (com.google.android.gms.internal.ads.arw) r5, (com.google.android.gms.internal.ads.aso) r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x005e:
            boolean r14 = r0.m3648a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x0551
            long r5 = m3664e(r1, r5)
            int r3 = com.google.android.gms.internal.ads.apt.m3178f((int) r3, (long) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x006f:
            boolean r14 = r0.m3648a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x0551
            int r5 = m3662d(r1, r5)
            int r3 = com.google.android.gms.internal.ads.apt.m3185h((int) r3, (int) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0080:
            boolean r5 = r0.m3648a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.apt.m3186h((int) r3, (long) r9)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x008d:
            boolean r5 = r0.m3648a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.apt.m3192j(r3, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x009a:
            boolean r14 = r0.m3648a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x0551
            int r5 = m3662d(r1, r5)
            int r3 = com.google.android.gms.internal.ads.apt.m3194k(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00ab:
            boolean r14 = r0.m3648a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x0551
            int r5 = m3662d(r1, r5)
            int r3 = com.google.android.gms.internal.ads.apt.m3181g((int) r3, (int) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00bc:
            boolean r14 = r0.m3648a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.ads.atn.m3944f(r1, r5)
            com.google.android.gms.internal.ads.apc r5 = (com.google.android.gms.internal.ads.apc) r5
            int r3 = com.google.android.gms.internal.ads.apt.m3164c((int) r3, (com.google.android.gms.internal.ads.apc) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00cf:
            boolean r14 = r0.m3648a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.ads.atn.m3944f(r1, r5)
            com.google.android.gms.internal.ads.aso r6 = r0.m3637a((int) r12)
            int r3 = com.google.android.gms.internal.ads.asq.m3764a((int) r3, (java.lang.Object) r5, (com.google.android.gms.internal.ads.aso) r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00e4:
            boolean r14 = r0.m3648a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.ads.atn.m3944f(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.ads.apc
            if (r6 == 0) goto L_0x00fb
            com.google.android.gms.internal.ads.apc r5 = (com.google.android.gms.internal.ads.apc) r5
            int r3 = com.google.android.gms.internal.ads.apt.m3164c((int) r3, (com.google.android.gms.internal.ads.apc) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00fb:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.ads.apt.m3156b((int) r3, (java.lang.String) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0104:
            boolean r5 = r0.m3648a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.apt.m3157b((int) r3, (boolean) r7)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0111:
            boolean r5 = r0.m3648a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.apt.m3189i(r3, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x011e:
            boolean r5 = r0.m3648a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.apt.m3182g((int) r3, (long) r9)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x012b:
            boolean r14 = r0.m3648a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x0551
            int r5 = m3662d(r1, r5)
            int r3 = com.google.android.gms.internal.ads.apt.m3177f((int) r3, (int) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x013c:
            boolean r14 = r0.m3648a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x0551
            long r5 = m3664e(r1, r5)
            int r3 = com.google.android.gms.internal.ads.apt.m3174e((int) r3, (long) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x014d:
            boolean r14 = r0.m3648a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x0551
            long r5 = m3664e(r1, r5)
            int r3 = com.google.android.gms.internal.ads.apt.m3168d((int) r3, (long) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x015e:
            boolean r5 = r0.m3648a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.apt.m3153b((int) r3, (float) r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x016b:
            boolean r5 = r0.m3648a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x0551
            r5 = 0
            int r3 = com.google.android.gms.internal.ads.apt.m3152b((int) r3, (double) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x017a:
            com.google.android.gms.internal.ads.arr r14 = r0.f2420s
            java.lang.Object r5 = com.google.android.gms.internal.ads.atn.m3944f(r1, r5)
            java.lang.Object r6 = r0.m3653b((int) r12)
            int r3 = r14.mo11079a(r3, r5, r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x018b:
            java.util.List r5 = m3641a((java.lang.Object) r1, (long) r5)
            com.google.android.gms.internal.ads.aso r6 = r0.m3637a((int) r12)
            int r3 = com.google.android.gms.internal.ads.asq.m3782b((int) r3, (java.util.List<com.google.android.gms.internal.ads.arw>) r5, (com.google.android.gms.internal.ads.aso) r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x019a:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.asq.m3790c(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f2412k
            if (r6 == 0) goto L_0x01ae
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01ae:
            int r3 = com.google.android.gms.internal.ads.apt.m3173e((int) r3)
            int r6 = com.google.android.gms.internal.ads.apt.m3180g((int) r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x01bb:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.asq.m3805g(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f2412k
            if (r6 == 0) goto L_0x01cf
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01cf:
            int r3 = com.google.android.gms.internal.ads.apt.m3173e((int) r3)
            int r6 = com.google.android.gms.internal.ads.apt.m3180g((int) r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x01dc:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.asq.m3811i(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f2412k
            if (r6 == 0) goto L_0x01f0
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01f0:
            int r3 = com.google.android.gms.internal.ads.apt.m3173e((int) r3)
            int r6 = com.google.android.gms.internal.ads.apt.m3180g((int) r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x01fd:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.asq.m3808h(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f2412k
            if (r6 == 0) goto L_0x0211
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0211:
            int r3 = com.google.android.gms.internal.ads.apt.m3173e((int) r3)
            int r6 = com.google.android.gms.internal.ads.apt.m3180g((int) r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x021e:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.asq.m3794d(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f2412k
            if (r6 == 0) goto L_0x0232
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0232:
            int r3 = com.google.android.gms.internal.ads.apt.m3173e((int) r3)
            int r6 = com.google.android.gms.internal.ads.apt.m3180g((int) r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x023f:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.asq.m3802f(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f2412k
            if (r6 == 0) goto L_0x0253
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0253:
            int r3 = com.google.android.gms.internal.ads.apt.m3173e((int) r3)
            int r6 = com.google.android.gms.internal.ads.apt.m3180g((int) r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0260:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.asq.m3814j(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f2412k
            if (r6 == 0) goto L_0x0274
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0274:
            int r3 = com.google.android.gms.internal.ads.apt.m3173e((int) r3)
            int r6 = com.google.android.gms.internal.ads.apt.m3180g((int) r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0281:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.asq.m3808h(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f2412k
            if (r6 == 0) goto L_0x0295
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0295:
            int r3 = com.google.android.gms.internal.ads.apt.m3173e((int) r3)
            int r6 = com.google.android.gms.internal.ads.apt.m3180g((int) r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x02a2:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.asq.m3811i(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f2412k
            if (r6 == 0) goto L_0x02b6
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02b6:
            int r3 = com.google.android.gms.internal.ads.apt.m3173e((int) r3)
            int r6 = com.google.android.gms.internal.ads.apt.m3180g((int) r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x02c3:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.asq.m3798e(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f2412k
            if (r6 == 0) goto L_0x02d7
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02d7:
            int r3 = com.google.android.gms.internal.ads.apt.m3173e((int) r3)
            int r6 = com.google.android.gms.internal.ads.apt.m3180g((int) r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x02e4:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.asq.m3784b(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f2412k
            if (r6 == 0) goto L_0x02f8
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02f8:
            int r3 = com.google.android.gms.internal.ads.apt.m3173e((int) r3)
            int r6 = com.google.android.gms.internal.ads.apt.m3180g((int) r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0305:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.asq.m3768a((java.util.List<java.lang.Long>) r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f2412k
            if (r6 == 0) goto L_0x0319
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0319:
            int r3 = com.google.android.gms.internal.ads.apt.m3173e((int) r3)
            int r6 = com.google.android.gms.internal.ads.apt.m3180g((int) r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0326:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.asq.m3808h(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f2412k
            if (r6 == 0) goto L_0x033a
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x033a:
            int r3 = com.google.android.gms.internal.ads.apt.m3173e((int) r3)
            int r6 = com.google.android.gms.internal.ads.apt.m3180g((int) r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0347:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.asq.m3811i(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f2412k
            if (r6 == 0) goto L_0x035b
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x035b:
            int r3 = com.google.android.gms.internal.ads.apt.m3173e((int) r3)
            int r6 = com.google.android.gms.internal.ads.apt.m3180g((int) r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0368:
            java.util.List r5 = m3641a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.asq.m3789c(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0373:
            java.util.List r5 = m3641a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.asq.m3804g(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x037e:
            java.util.List r5 = m3641a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.asq.m3810i(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0389:
            java.util.List r5 = m3641a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.asq.m3807h(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0394:
            java.util.List r5 = m3641a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.asq.m3793d(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x039f:
            java.util.List r5 = m3641a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.asq.m3801f(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03aa:
            java.util.List r5 = m3641a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.asq.m3781b(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03b5:
            java.util.List r5 = m3641a((java.lang.Object) r1, (long) r5)
            com.google.android.gms.internal.ads.aso r6 = r0.m3637a((int) r12)
            int r3 = com.google.android.gms.internal.ads.asq.m3766a((int) r3, (java.util.List<?>) r5, (com.google.android.gms.internal.ads.aso) r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03c4:
            java.util.List r5 = m3641a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.asq.m3765a((int) r3, (java.util.List<?>) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03cf:
            java.util.List r5 = m3641a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.asq.m3813j(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03da:
            java.util.List r5 = m3641a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.asq.m3807h(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03e5:
            java.util.List r5 = m3641a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.asq.m3810i(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03f0:
            java.util.List r5 = m3641a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.asq.m3797e(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03fb:
            java.util.List r5 = m3641a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.asq.m3783b((int) r3, (java.util.List<java.lang.Long>) r5, (boolean) r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0406:
            java.util.List r5 = m3641a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.asq.m3767a((int) r3, (java.util.List<java.lang.Long>) r5, (boolean) r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0411:
            java.util.List r5 = m3641a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.asq.m3807h(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x041c:
            java.util.List r5 = m3641a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.asq.m3810i(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0427:
            boolean r14 = r0.m3647a(r1, (int) r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.ads.atn.m3944f(r1, r5)
            com.google.android.gms.internal.ads.arw r5 = (com.google.android.gms.internal.ads.arw) r5
            com.google.android.gms.internal.ads.aso r6 = r0.m3637a((int) r12)
            int r3 = com.google.android.gms.internal.ads.apt.m3166c((int) r3, (com.google.android.gms.internal.ads.arw) r5, (com.google.android.gms.internal.ads.aso) r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x043e:
            boolean r14 = r0.m3647a(r1, (int) r12)
            if (r14 == 0) goto L_0x0551
            long r5 = com.google.android.gms.internal.ads.atn.m3928b(r1, r5)
            int r3 = com.google.android.gms.internal.ads.apt.m3178f((int) r3, (long) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x044f:
            boolean r14 = r0.m3647a(r1, (int) r12)
            if (r14 == 0) goto L_0x0551
            int r5 = com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.apt.m3185h((int) r3, (int) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0460:
            boolean r5 = r0.m3647a(r1, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.apt.m3186h((int) r3, (long) r9)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x046d:
            boolean r5 = r0.m3647a(r1, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.apt.m3192j(r3, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x047a:
            boolean r14 = r0.m3647a(r1, (int) r12)
            if (r14 == 0) goto L_0x0551
            int r5 = com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.apt.m3194k(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x048b:
            boolean r14 = r0.m3647a(r1, (int) r12)
            if (r14 == 0) goto L_0x0551
            int r5 = com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.apt.m3181g((int) r3, (int) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x049c:
            boolean r14 = r0.m3647a(r1, (int) r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.ads.atn.m3944f(r1, r5)
            com.google.android.gms.internal.ads.apc r5 = (com.google.android.gms.internal.ads.apc) r5
            int r3 = com.google.android.gms.internal.ads.apt.m3164c((int) r3, (com.google.android.gms.internal.ads.apc) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04af:
            boolean r14 = r0.m3647a(r1, (int) r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.ads.atn.m3944f(r1, r5)
            com.google.android.gms.internal.ads.aso r6 = r0.m3637a((int) r12)
            int r3 = com.google.android.gms.internal.ads.asq.m3764a((int) r3, (java.lang.Object) r5, (com.google.android.gms.internal.ads.aso) r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04c4:
            boolean r14 = r0.m3647a(r1, (int) r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.ads.atn.m3944f(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.ads.apc
            if (r6 == 0) goto L_0x04db
            com.google.android.gms.internal.ads.apc r5 = (com.google.android.gms.internal.ads.apc) r5
            int r3 = com.google.android.gms.internal.ads.apt.m3164c((int) r3, (com.google.android.gms.internal.ads.apc) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04db:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.ads.apt.m3156b((int) r3, (java.lang.String) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04e4:
            boolean r5 = r0.m3647a(r1, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.apt.m3157b((int) r3, (boolean) r7)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04f0:
            boolean r5 = r0.m3647a(r1, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.apt.m3189i(r3, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04fc:
            boolean r5 = r0.m3647a(r1, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.apt.m3182g((int) r3, (long) r9)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0508:
            boolean r14 = r0.m3647a(r1, (int) r12)
            if (r14 == 0) goto L_0x0551
            int r5 = com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.apt.m3177f((int) r3, (int) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0518:
            boolean r14 = r0.m3647a(r1, (int) r12)
            if (r14 == 0) goto L_0x0551
            long r5 = com.google.android.gms.internal.ads.atn.m3928b(r1, r5)
            int r3 = com.google.android.gms.internal.ads.apt.m3174e((int) r3, (long) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0528:
            boolean r14 = r0.m3647a(r1, (int) r12)
            if (r14 == 0) goto L_0x0551
            long r5 = com.google.android.gms.internal.ads.atn.m3928b(r1, r5)
            int r3 = com.google.android.gms.internal.ads.apt.m3168d((int) r3, (long) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0538:
            boolean r5 = r0.m3647a(r1, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.apt.m3153b((int) r3, (float) r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0544:
            boolean r5 = r0.m3647a(r1, (int) r12)
            if (r5 == 0) goto L_0x0551
            r5 = 0
            int r3 = com.google.android.gms.internal.ads.apt.m3152b((int) r3, (double) r5)
            int r13 = r13 + r3
        L_0x0551:
            int r12 = r12 + 3
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x0557:
            com.google.android.gms.internal.ads.atg<?, ?> r2 = r0.f2418q
            int r1 = m3630a(r2, r1)
            int r13 = r13 + r1
            return r13
        L_0x055f:
            sun.misc.Unsafe r2 = f2403b
            r3 = -1
            r3 = 0
            r5 = 0
            r6 = -1
            r12 = 0
        L_0x0566:
            int[] r13 = r0.f2404c
            int r13 = r13.length
            if (r3 >= r13) goto L_0x0af7
            int r13 = r0.m3661d((int) r3)
            int[] r14 = r0.f2404c
            r14 = r14[r3]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r16 = r13 & r15
            int r15 = r16 >>> 20
            r4 = 17
            if (r15 > r4) goto L_0x0592
            int[] r4 = r0.f2404c
            int r16 = r3 + 2
            r4 = r4[r16]
            r11 = r4 & r8
            int r16 = r4 >>> 20
            int r16 = r7 << r16
            if (r11 == r6) goto L_0x05b3
            long r9 = (long) r11
            int r12 = r2.getInt(r1, r9)
            r6 = r11
            goto L_0x05b3
        L_0x0592:
            boolean r4 = r0.f2412k
            if (r4 == 0) goto L_0x05b0
            com.google.android.gms.internal.ads.aqg r4 = com.google.android.gms.internal.ads.aqg.DOUBLE_LIST_PACKED
            int r4 = r4.mo11008a()
            if (r15 < r4) goto L_0x05b0
            com.google.android.gms.internal.ads.aqg r4 = com.google.android.gms.internal.ads.aqg.SINT64_LIST_PACKED
            int r4 = r4.mo11008a()
            if (r15 > r4) goto L_0x05b0
            int[] r4 = r0.f2404c
            int r9 = r3 + 2
            r4 = r4[r9]
            r11 = r4 & r8
            r4 = r11
            goto L_0x05b1
        L_0x05b0:
            r4 = 0
        L_0x05b1:
            r16 = 0
        L_0x05b3:
            r9 = r13 & r8
            long r9 = (long) r9
            switch(r15) {
                case 0: goto L_0x0ae0;
                case 1: goto L_0x0ad0;
                case 2: goto L_0x0abe;
                case 3: goto L_0x0aad;
                case 4: goto L_0x0a9c;
                case 5: goto L_0x0a8d;
                case 6: goto L_0x0a81;
                case 7: goto L_0x0a76;
                case 8: goto L_0x0a58;
                case 9: goto L_0x0a45;
                case 10: goto L_0x0a35;
                case 11: goto L_0x0a27;
                case 12: goto L_0x0a19;
                case 13: goto L_0x0a0e;
                case 14: goto L_0x0a02;
                case 15: goto L_0x09f4;
                case 16: goto L_0x09e6;
                case 17: goto L_0x09d2;
                case 18: goto L_0x09be;
                case 19: goto L_0x09b1;
                case 20: goto L_0x09a4;
                case 21: goto L_0x0997;
                case 22: goto L_0x098a;
                case 23: goto L_0x097d;
                case 24: goto L_0x0970;
                case 25: goto L_0x0963;
                case 26: goto L_0x0957;
                case 27: goto L_0x0946;
                case 28: goto L_0x0939;
                case 29: goto L_0x092b;
                case 30: goto L_0x091d;
                case 31: goto L_0x090f;
                case 32: goto L_0x0901;
                case 33: goto L_0x08f3;
                case 34: goto L_0x08e5;
                case 35: goto L_0x08c4;
                case 36: goto L_0x08a3;
                case 37: goto L_0x0882;
                case 38: goto L_0x0861;
                case 39: goto L_0x0840;
                case 40: goto L_0x081f;
                case 41: goto L_0x07fe;
                case 42: goto L_0x07dd;
                case 43: goto L_0x07bc;
                case 44: goto L_0x079b;
                case 45: goto L_0x077a;
                case 46: goto L_0x0759;
                case 47: goto L_0x0738;
                case 48: goto L_0x0717;
                case 49: goto L_0x0706;
                case 50: goto L_0x06f5;
                case 51: goto L_0x06e6;
                case 52: goto L_0x06d8;
                case 53: goto L_0x06c7;
                case 54: goto L_0x06b6;
                case 55: goto L_0x06a5;
                case 56: goto L_0x0696;
                case 57: goto L_0x0688;
                case 58: goto L_0x067b;
                case 59: goto L_0x065b;
                case 60: goto L_0x0646;
                case 61: goto L_0x0633;
                case 62: goto L_0x0622;
                case 63: goto L_0x0611;
                case 64: goto L_0x0603;
                case 65: goto L_0x05f4;
                case 66: goto L_0x05e3;
                case 67: goto L_0x05d2;
                case 68: goto L_0x05bb;
                default: goto L_0x05b9;
            }
        L_0x05b9:
            goto L_0x09ca
        L_0x05bb:
            boolean r4 = r0.m3648a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.ads.arw r4 = (com.google.android.gms.internal.ads.arw) r4
            com.google.android.gms.internal.ads.aso r9 = r0.m3637a((int) r3)
            int r4 = com.google.android.gms.internal.ads.apt.m3166c((int) r14, (com.google.android.gms.internal.ads.arw) r4, (com.google.android.gms.internal.ads.aso) r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x05d2:
            boolean r4 = r0.m3648a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            long r9 = m3664e(r1, r9)
            int r4 = com.google.android.gms.internal.ads.apt.m3178f((int) r14, (long) r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x05e3:
            boolean r4 = r0.m3648a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            int r4 = m3662d(r1, r9)
            int r4 = com.google.android.gms.internal.ads.apt.m3185h((int) r14, (int) r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x05f4:
            boolean r4 = r0.m3648a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            r9 = 0
            int r4 = com.google.android.gms.internal.ads.apt.m3186h((int) r14, (long) r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0603:
            boolean r4 = r0.m3648a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            r4 = 0
            int r9 = com.google.android.gms.internal.ads.apt.m3192j(r14, r4)
            int r5 = r5 + r9
            goto L_0x09ca
        L_0x0611:
            boolean r4 = r0.m3648a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            int r4 = m3662d(r1, r9)
            int r4 = com.google.android.gms.internal.ads.apt.m3194k(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0622:
            boolean r4 = r0.m3648a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            int r4 = m3662d(r1, r9)
            int r4 = com.google.android.gms.internal.ads.apt.m3181g((int) r14, (int) r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0633:
            boolean r4 = r0.m3648a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.ads.apc r4 = (com.google.android.gms.internal.ads.apc) r4
            int r4 = com.google.android.gms.internal.ads.apt.m3164c((int) r14, (com.google.android.gms.internal.ads.apc) r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0646:
            boolean r4 = r0.m3648a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.ads.aso r9 = r0.m3637a((int) r3)
            int r4 = com.google.android.gms.internal.ads.asq.m3764a((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.ads.aso) r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x065b:
            boolean r4 = r0.m3648a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            java.lang.Object r4 = r2.getObject(r1, r9)
            boolean r9 = r4 instanceof com.google.android.gms.internal.ads.apc
            if (r9 == 0) goto L_0x0672
            com.google.android.gms.internal.ads.apc r4 = (com.google.android.gms.internal.ads.apc) r4
            int r4 = com.google.android.gms.internal.ads.apt.m3164c((int) r14, (com.google.android.gms.internal.ads.apc) r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0672:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.ads.apt.m3156b((int) r14, (java.lang.String) r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x067b:
            boolean r4 = r0.m3648a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            int r4 = com.google.android.gms.internal.ads.apt.m3157b((int) r14, (boolean) r7)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0688:
            boolean r4 = r0.m3648a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            r4 = 0
            int r9 = com.google.android.gms.internal.ads.apt.m3189i(r14, r4)
            int r5 = r5 + r9
            goto L_0x09ca
        L_0x0696:
            boolean r4 = r0.m3648a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            r9 = 0
            int r4 = com.google.android.gms.internal.ads.apt.m3182g((int) r14, (long) r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x06a5:
            boolean r4 = r0.m3648a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            int r4 = m3662d(r1, r9)
            int r4 = com.google.android.gms.internal.ads.apt.m3177f((int) r14, (int) r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x06b6:
            boolean r4 = r0.m3648a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            long r9 = m3664e(r1, r9)
            int r4 = com.google.android.gms.internal.ads.apt.m3174e((int) r14, (long) r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x06c7:
            boolean r4 = r0.m3648a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            long r9 = m3664e(r1, r9)
            int r4 = com.google.android.gms.internal.ads.apt.m3168d((int) r14, (long) r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x06d8:
            boolean r4 = r0.m3648a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            r4 = 0
            int r9 = com.google.android.gms.internal.ads.apt.m3153b((int) r14, (float) r4)
            int r5 = r5 + r9
            goto L_0x09ca
        L_0x06e6:
            boolean r4 = r0.m3648a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            r9 = 0
            int r4 = com.google.android.gms.internal.ads.apt.m3152b((int) r14, (double) r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x06f5:
            com.google.android.gms.internal.ads.arr r4 = r0.f2420s
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.lang.Object r10 = r0.m3653b((int) r3)
            int r4 = r4.mo11079a(r14, r9, r10)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0706:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.aso r9 = r0.m3637a((int) r3)
            int r4 = com.google.android.gms.internal.ads.asq.m3782b((int) r14, (java.util.List<com.google.android.gms.internal.ads.arw>) r4, (com.google.android.gms.internal.ads.aso) r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0717:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.asq.m3790c(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f2412k
            if (r10 == 0) goto L_0x072b
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x072b:
            int r4 = com.google.android.gms.internal.ads.apt.m3173e((int) r14)
            int r10 = com.google.android.gms.internal.ads.apt.m3180g((int) r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0738:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.asq.m3805g(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f2412k
            if (r10 == 0) goto L_0x074c
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x074c:
            int r4 = com.google.android.gms.internal.ads.apt.m3173e((int) r14)
            int r10 = com.google.android.gms.internal.ads.apt.m3180g((int) r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0759:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.asq.m3811i(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f2412k
            if (r10 == 0) goto L_0x076d
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x076d:
            int r4 = com.google.android.gms.internal.ads.apt.m3173e((int) r14)
            int r10 = com.google.android.gms.internal.ads.apt.m3180g((int) r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x077a:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.asq.m3808h(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f2412k
            if (r10 == 0) goto L_0x078e
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x078e:
            int r4 = com.google.android.gms.internal.ads.apt.m3173e((int) r14)
            int r10 = com.google.android.gms.internal.ads.apt.m3180g((int) r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x079b:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.asq.m3794d(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f2412k
            if (r10 == 0) goto L_0x07af
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x07af:
            int r4 = com.google.android.gms.internal.ads.apt.m3173e((int) r14)
            int r10 = com.google.android.gms.internal.ads.apt.m3180g((int) r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x07bc:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.asq.m3802f(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f2412k
            if (r10 == 0) goto L_0x07d0
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x07d0:
            int r4 = com.google.android.gms.internal.ads.apt.m3173e((int) r14)
            int r10 = com.google.android.gms.internal.ads.apt.m3180g((int) r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x07dd:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.asq.m3814j(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f2412k
            if (r10 == 0) goto L_0x07f1
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x07f1:
            int r4 = com.google.android.gms.internal.ads.apt.m3173e((int) r14)
            int r10 = com.google.android.gms.internal.ads.apt.m3180g((int) r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x07fe:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.asq.m3808h(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f2412k
            if (r10 == 0) goto L_0x0812
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x0812:
            int r4 = com.google.android.gms.internal.ads.apt.m3173e((int) r14)
            int r10 = com.google.android.gms.internal.ads.apt.m3180g((int) r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x081f:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.asq.m3811i(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f2412k
            if (r10 == 0) goto L_0x0833
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x0833:
            int r4 = com.google.android.gms.internal.ads.apt.m3173e((int) r14)
            int r10 = com.google.android.gms.internal.ads.apt.m3180g((int) r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0840:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.asq.m3798e(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f2412k
            if (r10 == 0) goto L_0x0854
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x0854:
            int r4 = com.google.android.gms.internal.ads.apt.m3173e((int) r14)
            int r10 = com.google.android.gms.internal.ads.apt.m3180g((int) r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0861:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.asq.m3784b(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f2412k
            if (r10 == 0) goto L_0x0875
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x0875:
            int r4 = com.google.android.gms.internal.ads.apt.m3173e((int) r14)
            int r10 = com.google.android.gms.internal.ads.apt.m3180g((int) r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0882:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.asq.m3768a((java.util.List<java.lang.Long>) r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f2412k
            if (r10 == 0) goto L_0x0896
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x0896:
            int r4 = com.google.android.gms.internal.ads.apt.m3173e((int) r14)
            int r10 = com.google.android.gms.internal.ads.apt.m3180g((int) r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x08a3:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.asq.m3808h(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f2412k
            if (r10 == 0) goto L_0x08b7
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x08b7:
            int r4 = com.google.android.gms.internal.ads.apt.m3173e((int) r14)
            int r10 = com.google.android.gms.internal.ads.apt.m3180g((int) r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x08c4:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.asq.m3811i(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f2412k
            if (r10 == 0) goto L_0x08d8
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x08d8:
            int r4 = com.google.android.gms.internal.ads.apt.m3173e((int) r14)
            int r10 = com.google.android.gms.internal.ads.apt.m3180g((int) r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x08e5:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            r11 = 0
            int r4 = com.google.android.gms.internal.ads.asq.m3789c(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x08f3:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.asq.m3804g(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0901:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.asq.m3810i(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x090f:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.asq.m3807h(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x091d:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.asq.m3793d(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x092b:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.asq.m3801f(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0939:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.asq.m3781b(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0946:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.aso r9 = r0.m3637a((int) r3)
            int r4 = com.google.android.gms.internal.ads.asq.m3766a((int) r14, (java.util.List<?>) r4, (com.google.android.gms.internal.ads.aso) r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0957:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.asq.m3765a((int) r14, (java.util.List<?>) r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0963:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            r11 = 0
            int r4 = com.google.android.gms.internal.ads.asq.m3813j(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0970:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.asq.m3807h(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x097d:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.asq.m3810i(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x098a:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.asq.m3797e(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0997:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.asq.m3783b((int) r14, (java.util.List<java.lang.Long>) r4, (boolean) r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x09a4:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.asq.m3767a((int) r14, (java.util.List<java.lang.Long>) r4, (boolean) r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x09b1:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.asq.m3807h(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x09be:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.asq.m3810i(r14, r4, r11)
            int r5 = r5 + r4
        L_0x09ca:
            r4 = 0
        L_0x09cb:
            r9 = 0
            r10 = 0
            r18 = 0
            goto L_0x0aef
        L_0x09d2:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.ads.arw r4 = (com.google.android.gms.internal.ads.arw) r4
            com.google.android.gms.internal.ads.aso r9 = r0.m3637a((int) r3)
            int r4 = com.google.android.gms.internal.ads.apt.m3166c((int) r14, (com.google.android.gms.internal.ads.arw) r4, (com.google.android.gms.internal.ads.aso) r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x09e6:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            long r9 = r2.getLong(r1, r9)
            int r4 = com.google.android.gms.internal.ads.apt.m3178f((int) r14, (long) r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x09f4:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            int r4 = r2.getInt(r1, r9)
            int r4 = com.google.android.gms.internal.ads.apt.m3185h((int) r14, (int) r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a02:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            r9 = 0
            int r4 = com.google.android.gms.internal.ads.apt.m3186h((int) r14, (long) r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a0e:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            r4 = 0
            int r9 = com.google.android.gms.internal.ads.apt.m3192j(r14, r4)
            int r5 = r5 + r9
            goto L_0x09ca
        L_0x0a19:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            int r4 = r2.getInt(r1, r9)
            int r4 = com.google.android.gms.internal.ads.apt.m3194k(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a27:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            int r4 = r2.getInt(r1, r9)
            int r4 = com.google.android.gms.internal.ads.apt.m3181g((int) r14, (int) r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a35:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.ads.apc r4 = (com.google.android.gms.internal.ads.apc) r4
            int r4 = com.google.android.gms.internal.ads.apt.m3164c((int) r14, (com.google.android.gms.internal.ads.apc) r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a45:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.ads.aso r9 = r0.m3637a((int) r3)
            int r4 = com.google.android.gms.internal.ads.asq.m3764a((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.ads.aso) r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a58:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            java.lang.Object r4 = r2.getObject(r1, r9)
            boolean r9 = r4 instanceof com.google.android.gms.internal.ads.apc
            if (r9 == 0) goto L_0x0a6d
            com.google.android.gms.internal.ads.apc r4 = (com.google.android.gms.internal.ads.apc) r4
            int r4 = com.google.android.gms.internal.ads.apt.m3164c((int) r14, (com.google.android.gms.internal.ads.apc) r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a6d:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.ads.apt.m3156b((int) r14, (java.lang.String) r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a76:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            int r4 = com.google.android.gms.internal.ads.apt.m3157b((int) r14, (boolean) r7)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a81:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            r4 = 0
            int r9 = com.google.android.gms.internal.ads.apt.m3189i(r14, r4)
            int r5 = r5 + r9
            goto L_0x09cb
        L_0x0a8d:
            r4 = 0
            r9 = r12 & r16
            if (r9 == 0) goto L_0x09cb
            r9 = 0
            int r11 = com.google.android.gms.internal.ads.apt.m3182g((int) r14, (long) r9)
            int r5 = r5 + r11
            r18 = r9
            goto L_0x0ace
        L_0x0a9c:
            r4 = 0
            r18 = 0
            r11 = r12 & r16
            if (r11 == 0) goto L_0x0ace
            int r9 = r2.getInt(r1, r9)
            int r9 = com.google.android.gms.internal.ads.apt.m3177f((int) r14, (int) r9)
            int r5 = r5 + r9
            goto L_0x0ace
        L_0x0aad:
            r4 = 0
            r18 = 0
            r11 = r12 & r16
            if (r11 == 0) goto L_0x0ace
            long r9 = r2.getLong(r1, r9)
            int r9 = com.google.android.gms.internal.ads.apt.m3174e((int) r14, (long) r9)
            int r5 = r5 + r9
            goto L_0x0ace
        L_0x0abe:
            r4 = 0
            r18 = 0
            r11 = r12 & r16
            if (r11 == 0) goto L_0x0ace
            long r9 = r2.getLong(r1, r9)
            int r9 = com.google.android.gms.internal.ads.apt.m3168d((int) r14, (long) r9)
            int r5 = r5 + r9
        L_0x0ace:
            r9 = 0
            goto L_0x0add
        L_0x0ad0:
            r4 = 0
            r18 = 0
            r9 = r12 & r16
            if (r9 == 0) goto L_0x0ace
            r9 = 0
            int r10 = com.google.android.gms.internal.ads.apt.m3153b((int) r14, (float) r9)
            int r5 = r5 + r10
        L_0x0add:
            r10 = 0
            goto L_0x0aef
        L_0x0ae0:
            r4 = 0
            r9 = 0
            r18 = 0
            r10 = r12 & r16
            if (r10 == 0) goto L_0x0add
            r10 = 0
            int r13 = com.google.android.gms.internal.ads.apt.m3152b((int) r14, (double) r10)
            int r5 = r5 + r13
        L_0x0aef:
            int r3 = r3 + 3
            r9 = r18
            r4 = 0
            r11 = 0
            goto L_0x0566
        L_0x0af7:
            com.google.android.gms.internal.ads.atg<?, ?> r2 = r0.f2418q
            int r2 = m3630a(r2, r1)
            int r5 = r5 + r2
            boolean r2 = r0.f2409h
            if (r2 == 0) goto L_0x0b0d
            com.google.android.gms.internal.ads.aqa<?> r2 = r0.f2419r
            com.google.android.gms.internal.ads.aqd r1 = r2.mo10979a((java.lang.Object) r1)
            int r1 = r1.mo10998h()
            int r5 = r5 + r1
        L_0x0b0d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.asa.mo11106b(java.lang.Object):int");
    }

    /* renamed from: a */
    private static <UT, UB> int m3630a(atg<UT, UB> atg, T t) {
        return atg.mo11184f(atg.mo11176b(t));
    }

    /* renamed from: a */
    private static <E> List<E> m3641a(Object obj, long j) {
        return (List) atn.m3944f(obj, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0511  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x054f  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0a27  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11103a(T r14, com.google.android.gms.internal.ads.auc r15) {
        /*
            r13 = this;
            int r0 = r15.mo10926a()
            int r1 = com.google.android.gms.internal.ads.aqn.C1082e.f2340k
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x0527
            com.google.android.gms.internal.ads.atg<?, ?> r0 = r13.f2418q
            m3643a(r0, r14, (com.google.android.gms.internal.ads.auc) r15)
            boolean r0 = r13.f2409h
            if (r0 == 0) goto L_0x0030
            com.google.android.gms.internal.ads.aqa<?> r0 = r13.f2419r
            com.google.android.gms.internal.ads.aqd r0 = r0.mo10979a((java.lang.Object) r14)
            boolean r1 = r0.mo10990b()
            if (r1 != 0) goto L_0x0030
            java.util.Iterator r0 = r0.mo10996f()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0032
        L_0x0030:
            r0 = r3
            r1 = r0
        L_0x0032:
            int[] r7 = r13.f2404c
            int r7 = r7.length
            int r7 = r7 + -3
        L_0x0037:
            if (r7 < 0) goto L_0x050f
            int r8 = r13.m3661d((int) r7)
            int[] r9 = r13.f2404c
            r9 = r9[r7]
        L_0x0041:
            if (r1 == 0) goto L_0x005f
            com.google.android.gms.internal.ads.aqa<?> r10 = r13.f2419r
            int r10 = r10.mo10978a((java.util.Map.Entry<?, ?>) r1)
            if (r10 <= r9) goto L_0x005f
            com.google.android.gms.internal.ads.aqa<?> r10 = r13.f2419r
            r10.mo10984a((com.google.android.gms.internal.ads.auc) r15, (java.util.Map.Entry<?, ?>) r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0041
        L_0x005d:
            r1 = r3
            goto L_0x0041
        L_0x005f:
            r10 = r8 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x04fc;
                case 1: goto L_0x04ec;
                case 2: goto L_0x04dc;
                case 3: goto L_0x04cc;
                case 4: goto L_0x04bc;
                case 5: goto L_0x04ac;
                case 6: goto L_0x049c;
                case 7: goto L_0x048b;
                case 8: goto L_0x047a;
                case 9: goto L_0x0465;
                case 10: goto L_0x0452;
                case 11: goto L_0x0441;
                case 12: goto L_0x0430;
                case 13: goto L_0x041f;
                case 14: goto L_0x040e;
                case 15: goto L_0x03fd;
                case 16: goto L_0x03ec;
                case 17: goto L_0x03d7;
                case 18: goto L_0x03c6;
                case 19: goto L_0x03b5;
                case 20: goto L_0x03a4;
                case 21: goto L_0x0393;
                case 22: goto L_0x0382;
                case 23: goto L_0x0371;
                case 24: goto L_0x0360;
                case 25: goto L_0x034f;
                case 26: goto L_0x033e;
                case 27: goto L_0x0329;
                case 28: goto L_0x0318;
                case 29: goto L_0x0307;
                case 30: goto L_0x02f6;
                case 31: goto L_0x02e5;
                case 32: goto L_0x02d4;
                case 33: goto L_0x02c3;
                case 34: goto L_0x02b2;
                case 35: goto L_0x02a1;
                case 36: goto L_0x0290;
                case 37: goto L_0x027f;
                case 38: goto L_0x026e;
                case 39: goto L_0x025d;
                case 40: goto L_0x024c;
                case 41: goto L_0x023b;
                case 42: goto L_0x022a;
                case 43: goto L_0x0219;
                case 44: goto L_0x0208;
                case 45: goto L_0x01f7;
                case 46: goto L_0x01e6;
                case 47: goto L_0x01d5;
                case 48: goto L_0x01c4;
                case 49: goto L_0x01af;
                case 50: goto L_0x01a4;
                case 51: goto L_0x0193;
                case 52: goto L_0x0182;
                case 53: goto L_0x0171;
                case 54: goto L_0x0160;
                case 55: goto L_0x014f;
                case 56: goto L_0x013e;
                case 57: goto L_0x012d;
                case 58: goto L_0x011c;
                case 59: goto L_0x010b;
                case 60: goto L_0x00f6;
                case 61: goto L_0x00e3;
                case 62: goto L_0x00d2;
                case 63: goto L_0x00c1;
                case 64: goto L_0x00b0;
                case 65: goto L_0x009f;
                case 66: goto L_0x008e;
                case 67: goto L_0x007d;
                case 68: goto L_0x0068;
                default: goto L_0x0066;
            }
        L_0x0066:
            goto L_0x050b
        L_0x0068:
            boolean r10 = r13.m3648a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            com.google.android.gms.internal.ads.aso r10 = r13.m3637a((int) r7)
            r15.mo10944b((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.ads.aso) r10)
            goto L_0x050b
        L_0x007d:
            boolean r10 = r13.m3648a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m3664e(r14, r10)
            r15.mo10955e((int) r9, (long) r10)
            goto L_0x050b
        L_0x008e:
            boolean r10 = r13.m3648a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m3662d(r14, r10)
            r15.mo10957f(r9, r8)
            goto L_0x050b
        L_0x009f:
            boolean r10 = r13.m3648a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m3664e(r14, r10)
            r15.mo10943b((int) r9, (long) r10)
            goto L_0x050b
        L_0x00b0:
            boolean r10 = r13.m3648a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m3662d(r14, r10)
            r15.mo10930a((int) r9, (int) r8)
            goto L_0x050b
        L_0x00c1:
            boolean r10 = r13.m3648a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m3662d(r14, r10)
            r15.mo10942b((int) r9, (int) r8)
            goto L_0x050b
        L_0x00d2:
            boolean r10 = r13.m3648a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m3662d(r14, r10)
            r15.mo10954e((int) r9, (int) r8)
            goto L_0x050b
        L_0x00e3:
            boolean r10 = r13.m3648a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            com.google.android.gms.internal.ads.apc r8 = (com.google.android.gms.internal.ads.apc) r8
            r15.mo10932a((int) r9, (com.google.android.gms.internal.ads.apc) r8)
            goto L_0x050b
        L_0x00f6:
            boolean r10 = r13.m3648a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            com.google.android.gms.internal.ads.aso r10 = r13.m3637a((int) r7)
            r15.mo10935a((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.ads.aso) r10)
            goto L_0x050b
        L_0x010b:
            boolean r10 = r13.m3648a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            m3642a((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.ads.auc) r15)
            goto L_0x050b
        L_0x011c:
            boolean r10 = r13.m3648a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = m3667f(r14, r10)
            r15.mo10940a((int) r9, (boolean) r8)
            goto L_0x050b
        L_0x012d:
            boolean r10 = r13.m3648a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m3662d(r14, r10)
            r15.mo10951d((int) r9, (int) r8)
            goto L_0x050b
        L_0x013e:
            boolean r10 = r13.m3648a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m3664e(r14, r10)
            r15.mo10952d((int) r9, (long) r10)
            goto L_0x050b
        L_0x014f:
            boolean r10 = r13.m3648a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m3662d(r14, r10)
            r15.mo10948c((int) r9, (int) r8)
            goto L_0x050b
        L_0x0160:
            boolean r10 = r13.m3648a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m3664e(r14, r10)
            r15.mo10949c((int) r9, (long) r10)
            goto L_0x050b
        L_0x0171:
            boolean r10 = r13.m3648a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m3664e(r14, r10)
            r15.mo10931a((int) r9, (long) r10)
            goto L_0x050b
        L_0x0182:
            boolean r10 = r13.m3648a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = m3658c(r14, r10)
            r15.mo10929a((int) r9, (float) r8)
            goto L_0x050b
        L_0x0193:
            boolean r10 = r13.m3648a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = m3651b(r14, (long) r10)
            r15.mo10928a((int) r9, (double) r10)
            goto L_0x050b
        L_0x01a4:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            r13.m3644a((com.google.android.gms.internal.ads.auc) r15, (int) r9, (java.lang.Object) r8, (int) r7)
            goto L_0x050b
        L_0x01af:
            int[] r9 = r13.f2404c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.aso r10 = r13.m3637a((int) r7)
            com.google.android.gms.internal.ads.asq.m3787b((int) r9, (java.util.List<?>) r8, (com.google.android.gms.internal.ads.auc) r15, (com.google.android.gms.internal.ads.aso) r10)
            goto L_0x050b
        L_0x01c4:
            int[] r9 = r13.f2404c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.asq.m3800e(r9, r8, r15, r4)
            goto L_0x050b
        L_0x01d5:
            int[] r9 = r13.f2404c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.asq.m3815j(r9, r8, r15, r4)
            goto L_0x050b
        L_0x01e6:
            int[] r9 = r13.f2404c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.asq.m3806g(r9, r8, r15, r4)
            goto L_0x050b
        L_0x01f7:
            int[] r9 = r13.f2404c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.asq.m3817l(r9, r8, r15, r4)
            goto L_0x050b
        L_0x0208:
            int[] r9 = r13.f2404c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.asq.m3818m(r9, r8, r15, r4)
            goto L_0x050b
        L_0x0219:
            int[] r9 = r13.f2404c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.asq.m3812i(r9, r8, r15, r4)
            goto L_0x050b
        L_0x022a:
            int[] r9 = r13.f2404c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.asq.m3819n(r9, r8, r15, r4)
            goto L_0x050b
        L_0x023b:
            int[] r9 = r13.f2404c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.asq.m3816k(r9, r8, r15, r4)
            goto L_0x050b
        L_0x024c:
            int[] r9 = r13.f2404c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.asq.m3803f(r9, r8, r15, r4)
            goto L_0x050b
        L_0x025d:
            int[] r9 = r13.f2404c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.asq.m3809h(r9, r8, r15, r4)
            goto L_0x050b
        L_0x026e:
            int[] r9 = r13.f2404c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.asq.m3796d(r9, r8, r15, r4)
            goto L_0x050b
        L_0x027f:
            int[] r9 = r13.f2404c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.asq.m3792c(r9, r8, r15, r4)
            goto L_0x050b
        L_0x0290:
            int[] r9 = r13.f2404c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.asq.m3788b((int) r9, (java.util.List<java.lang.Float>) r8, (com.google.android.gms.internal.ads.auc) r15, (boolean) r4)
            goto L_0x050b
        L_0x02a1:
            int[] r9 = r13.f2404c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.asq.m3775a((int) r9, (java.util.List<java.lang.Double>) r8, (com.google.android.gms.internal.ads.auc) r15, (boolean) r4)
            goto L_0x050b
        L_0x02b2:
            int[] r9 = r13.f2404c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.asq.m3800e(r9, r8, r15, r5)
            goto L_0x050b
        L_0x02c3:
            int[] r9 = r13.f2404c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.asq.m3815j(r9, r8, r15, r5)
            goto L_0x050b
        L_0x02d4:
            int[] r9 = r13.f2404c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.asq.m3806g(r9, r8, r15, r5)
            goto L_0x050b
        L_0x02e5:
            int[] r9 = r13.f2404c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.asq.m3817l(r9, r8, r15, r5)
            goto L_0x050b
        L_0x02f6:
            int[] r9 = r13.f2404c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.asq.m3818m(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0307:
            int[] r9 = r13.f2404c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.asq.m3812i(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0318:
            int[] r9 = r13.f2404c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.asq.m3786b((int) r9, (java.util.List<com.google.android.gms.internal.ads.apc>) r8, (com.google.android.gms.internal.ads.auc) r15)
            goto L_0x050b
        L_0x0329:
            int[] r9 = r13.f2404c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.aso r10 = r13.m3637a((int) r7)
            com.google.android.gms.internal.ads.asq.m3774a((int) r9, (java.util.List<?>) r8, (com.google.android.gms.internal.ads.auc) r15, (com.google.android.gms.internal.ads.aso) r10)
            goto L_0x050b
        L_0x033e:
            int[] r9 = r13.f2404c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.asq.m3773a((int) r9, (java.util.List<java.lang.String>) r8, (com.google.android.gms.internal.ads.auc) r15)
            goto L_0x050b
        L_0x034f:
            int[] r9 = r13.f2404c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.asq.m3819n(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0360:
            int[] r9 = r13.f2404c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.asq.m3816k(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0371:
            int[] r9 = r13.f2404c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.asq.m3803f(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0382:
            int[] r9 = r13.f2404c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.asq.m3809h(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0393:
            int[] r9 = r13.f2404c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.asq.m3796d(r9, r8, r15, r5)
            goto L_0x050b
        L_0x03a4:
            int[] r9 = r13.f2404c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.asq.m3792c(r9, r8, r15, r5)
            goto L_0x050b
        L_0x03b5:
            int[] r9 = r13.f2404c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.asq.m3788b((int) r9, (java.util.List<java.lang.Float>) r8, (com.google.android.gms.internal.ads.auc) r15, (boolean) r5)
            goto L_0x050b
        L_0x03c6:
            int[] r9 = r13.f2404c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.asq.m3775a((int) r9, (java.util.List<java.lang.Double>) r8, (com.google.android.gms.internal.ads.auc) r15, (boolean) r5)
            goto L_0x050b
        L_0x03d7:
            boolean r10 = r13.m3647a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            com.google.android.gms.internal.ads.aso r10 = r13.m3637a((int) r7)
            r15.mo10944b((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.ads.aso) r10)
            goto L_0x050b
        L_0x03ec:
            boolean r10 = r13.m3647a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.ads.atn.m3928b(r14, r10)
            r15.mo10955e((int) r9, (long) r10)
            goto L_0x050b
        L_0x03fd:
            boolean r10 = r13.m3647a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r14, (long) r10)
            r15.mo10957f(r9, r8)
            goto L_0x050b
        L_0x040e:
            boolean r10 = r13.m3647a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.ads.atn.m3928b(r14, r10)
            r15.mo10943b((int) r9, (long) r10)
            goto L_0x050b
        L_0x041f:
            boolean r10 = r13.m3647a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r14, (long) r10)
            r15.mo10930a((int) r9, (int) r8)
            goto L_0x050b
        L_0x0430:
            boolean r10 = r13.m3647a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r14, (long) r10)
            r15.mo10942b((int) r9, (int) r8)
            goto L_0x050b
        L_0x0441:
            boolean r10 = r13.m3647a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r14, (long) r10)
            r15.mo10954e((int) r9, (int) r8)
            goto L_0x050b
        L_0x0452:
            boolean r10 = r13.m3647a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            com.google.android.gms.internal.ads.apc r8 = (com.google.android.gms.internal.ads.apc) r8
            r15.mo10932a((int) r9, (com.google.android.gms.internal.ads.apc) r8)
            goto L_0x050b
        L_0x0465:
            boolean r10 = r13.m3647a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            com.google.android.gms.internal.ads.aso r10 = r13.m3637a((int) r7)
            r15.mo10935a((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.ads.aso) r10)
            goto L_0x050b
        L_0x047a:
            boolean r10 = r13.m3647a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.atn.m3944f(r14, r10)
            m3642a((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.ads.auc) r15)
            goto L_0x050b
        L_0x048b:
            boolean r10 = r13.m3647a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = com.google.android.gms.internal.ads.atn.m3936c(r14, r10)
            r15.mo10940a((int) r9, (boolean) r8)
            goto L_0x050b
        L_0x049c:
            boolean r10 = r13.m3647a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r14, (long) r10)
            r15.mo10951d((int) r9, (int) r8)
            goto L_0x050b
        L_0x04ac:
            boolean r10 = r13.m3647a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.ads.atn.m3928b(r14, r10)
            r15.mo10952d((int) r9, (long) r10)
            goto L_0x050b
        L_0x04bc:
            boolean r10 = r13.m3647a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r14, (long) r10)
            r15.mo10948c((int) r9, (int) r8)
            goto L_0x050b
        L_0x04cc:
            boolean r10 = r13.m3647a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.ads.atn.m3928b(r14, r10)
            r15.mo10949c((int) r9, (long) r10)
            goto L_0x050b
        L_0x04dc:
            boolean r10 = r13.m3647a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.ads.atn.m3928b(r14, r10)
            r15.mo10931a((int) r9, (long) r10)
            goto L_0x050b
        L_0x04ec:
            boolean r10 = r13.m3647a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = com.google.android.gms.internal.ads.atn.m3937d(r14, r10)
            r15.mo10929a((int) r9, (float) r8)
            goto L_0x050b
        L_0x04fc:
            boolean r10 = r13.m3647a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = com.google.android.gms.internal.ads.atn.m3941e(r14, r10)
            r15.mo10928a((int) r9, (double) r10)
        L_0x050b:
            int r7 = r7 + -3
            goto L_0x0037
        L_0x050f:
            if (r1 == 0) goto L_0x0526
            com.google.android.gms.internal.ads.aqa<?> r14 = r13.f2419r
            r14.mo10984a((com.google.android.gms.internal.ads.auc) r15, (java.util.Map.Entry<?, ?>) r1)
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x0524
            java.lang.Object r14 = r0.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            r1 = r14
            goto L_0x050f
        L_0x0524:
            r1 = r3
            goto L_0x050f
        L_0x0526:
            return
        L_0x0527:
            boolean r0 = r13.f2411j
            if (r0 == 0) goto L_0x0a42
            boolean r0 = r13.f2409h
            if (r0 == 0) goto L_0x0546
            com.google.android.gms.internal.ads.aqa<?> r0 = r13.f2419r
            com.google.android.gms.internal.ads.aqd r0 = r0.mo10979a((java.lang.Object) r14)
            boolean r1 = r0.mo10990b()
            if (r1 != 0) goto L_0x0546
            java.util.Iterator r0 = r0.mo10994e()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0548
        L_0x0546:
            r0 = r3
            r1 = r0
        L_0x0548:
            int[] r7 = r13.f2404c
            int r7 = r7.length
            r8 = r1
            r1 = 0
        L_0x054d:
            if (r1 >= r7) goto L_0x0a25
            int r9 = r13.m3661d((int) r1)
            int[] r10 = r13.f2404c
            r10 = r10[r1]
        L_0x0557:
            if (r8 == 0) goto L_0x0575
            com.google.android.gms.internal.ads.aqa<?> r11 = r13.f2419r
            int r11 = r11.mo10978a((java.util.Map.Entry<?, ?>) r8)
            if (r11 > r10) goto L_0x0575
            com.google.android.gms.internal.ads.aqa<?> r11 = r13.f2419r
            r11.mo10984a((com.google.android.gms.internal.ads.auc) r15, (java.util.Map.Entry<?, ?>) r8)
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0573
            java.lang.Object r8 = r0.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            goto L_0x0557
        L_0x0573:
            r8 = r3
            goto L_0x0557
        L_0x0575:
            r11 = r9 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x0a12;
                case 1: goto L_0x0a02;
                case 2: goto L_0x09f2;
                case 3: goto L_0x09e2;
                case 4: goto L_0x09d2;
                case 5: goto L_0x09c2;
                case 6: goto L_0x09b2;
                case 7: goto L_0x09a1;
                case 8: goto L_0x0990;
                case 9: goto L_0x097b;
                case 10: goto L_0x0968;
                case 11: goto L_0x0957;
                case 12: goto L_0x0946;
                case 13: goto L_0x0935;
                case 14: goto L_0x0924;
                case 15: goto L_0x0913;
                case 16: goto L_0x0902;
                case 17: goto L_0x08ed;
                case 18: goto L_0x08dc;
                case 19: goto L_0x08cb;
                case 20: goto L_0x08ba;
                case 21: goto L_0x08a9;
                case 22: goto L_0x0898;
                case 23: goto L_0x0887;
                case 24: goto L_0x0876;
                case 25: goto L_0x0865;
                case 26: goto L_0x0854;
                case 27: goto L_0x083f;
                case 28: goto L_0x082e;
                case 29: goto L_0x081d;
                case 30: goto L_0x080c;
                case 31: goto L_0x07fb;
                case 32: goto L_0x07ea;
                case 33: goto L_0x07d9;
                case 34: goto L_0x07c8;
                case 35: goto L_0x07b7;
                case 36: goto L_0x07a6;
                case 37: goto L_0x0795;
                case 38: goto L_0x0784;
                case 39: goto L_0x0773;
                case 40: goto L_0x0762;
                case 41: goto L_0x0751;
                case 42: goto L_0x0740;
                case 43: goto L_0x072f;
                case 44: goto L_0x071e;
                case 45: goto L_0x070d;
                case 46: goto L_0x06fc;
                case 47: goto L_0x06eb;
                case 48: goto L_0x06da;
                case 49: goto L_0x06c5;
                case 50: goto L_0x06ba;
                case 51: goto L_0x06a9;
                case 52: goto L_0x0698;
                case 53: goto L_0x0687;
                case 54: goto L_0x0676;
                case 55: goto L_0x0665;
                case 56: goto L_0x0654;
                case 57: goto L_0x0643;
                case 58: goto L_0x0632;
                case 59: goto L_0x0621;
                case 60: goto L_0x060c;
                case 61: goto L_0x05f9;
                case 62: goto L_0x05e8;
                case 63: goto L_0x05d7;
                case 64: goto L_0x05c6;
                case 65: goto L_0x05b5;
                case 66: goto L_0x05a4;
                case 67: goto L_0x0593;
                case 68: goto L_0x057e;
                default: goto L_0x057c;
            }
        L_0x057c:
            goto L_0x0a21
        L_0x057e:
            boolean r11 = r13.m3648a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            com.google.android.gms.internal.ads.aso r11 = r13.m3637a((int) r1)
            r15.mo10944b((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.ads.aso) r11)
            goto L_0x0a21
        L_0x0593:
            boolean r11 = r13.m3648a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m3664e(r14, r11)
            r15.mo10955e((int) r10, (long) r11)
            goto L_0x0a21
        L_0x05a4:
            boolean r11 = r13.m3648a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m3662d(r14, r11)
            r15.mo10957f(r10, r9)
            goto L_0x0a21
        L_0x05b5:
            boolean r11 = r13.m3648a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m3664e(r14, r11)
            r15.mo10943b((int) r10, (long) r11)
            goto L_0x0a21
        L_0x05c6:
            boolean r11 = r13.m3648a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m3662d(r14, r11)
            r15.mo10930a((int) r10, (int) r9)
            goto L_0x0a21
        L_0x05d7:
            boolean r11 = r13.m3648a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m3662d(r14, r11)
            r15.mo10942b((int) r10, (int) r9)
            goto L_0x0a21
        L_0x05e8:
            boolean r11 = r13.m3648a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m3662d(r14, r11)
            r15.mo10954e((int) r10, (int) r9)
            goto L_0x0a21
        L_0x05f9:
            boolean r11 = r13.m3648a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            com.google.android.gms.internal.ads.apc r9 = (com.google.android.gms.internal.ads.apc) r9
            r15.mo10932a((int) r10, (com.google.android.gms.internal.ads.apc) r9)
            goto L_0x0a21
        L_0x060c:
            boolean r11 = r13.m3648a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            com.google.android.gms.internal.ads.aso r11 = r13.m3637a((int) r1)
            r15.mo10935a((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.ads.aso) r11)
            goto L_0x0a21
        L_0x0621:
            boolean r11 = r13.m3648a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            m3642a((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.ads.auc) r15)
            goto L_0x0a21
        L_0x0632:
            boolean r11 = r13.m3648a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = m3667f(r14, r11)
            r15.mo10940a((int) r10, (boolean) r9)
            goto L_0x0a21
        L_0x0643:
            boolean r11 = r13.m3648a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m3662d(r14, r11)
            r15.mo10951d((int) r10, (int) r9)
            goto L_0x0a21
        L_0x0654:
            boolean r11 = r13.m3648a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m3664e(r14, r11)
            r15.mo10952d((int) r10, (long) r11)
            goto L_0x0a21
        L_0x0665:
            boolean r11 = r13.m3648a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m3662d(r14, r11)
            r15.mo10948c((int) r10, (int) r9)
            goto L_0x0a21
        L_0x0676:
            boolean r11 = r13.m3648a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m3664e(r14, r11)
            r15.mo10949c((int) r10, (long) r11)
            goto L_0x0a21
        L_0x0687:
            boolean r11 = r13.m3648a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m3664e(r14, r11)
            r15.mo10931a((int) r10, (long) r11)
            goto L_0x0a21
        L_0x0698:
            boolean r11 = r13.m3648a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = m3658c(r14, r11)
            r15.mo10929a((int) r10, (float) r9)
            goto L_0x0a21
        L_0x06a9:
            boolean r11 = r13.m3648a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = m3651b(r14, (long) r11)
            r15.mo10928a((int) r10, (double) r11)
            goto L_0x0a21
        L_0x06ba:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            r13.m3644a((com.google.android.gms.internal.ads.auc) r15, (int) r10, (java.lang.Object) r9, (int) r1)
            goto L_0x0a21
        L_0x06c5:
            int[] r10 = r13.f2404c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.aso r11 = r13.m3637a((int) r1)
            com.google.android.gms.internal.ads.asq.m3787b((int) r10, (java.util.List<?>) r9, (com.google.android.gms.internal.ads.auc) r15, (com.google.android.gms.internal.ads.aso) r11)
            goto L_0x0a21
        L_0x06da:
            int[] r10 = r13.f2404c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.asq.m3800e(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x06eb:
            int[] r10 = r13.f2404c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.asq.m3815j(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x06fc:
            int[] r10 = r13.f2404c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.asq.m3806g(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x070d:
            int[] r10 = r13.f2404c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.asq.m3817l(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x071e:
            int[] r10 = r13.f2404c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.asq.m3818m(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x072f:
            int[] r10 = r13.f2404c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.asq.m3812i(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x0740:
            int[] r10 = r13.f2404c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.asq.m3819n(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x0751:
            int[] r10 = r13.f2404c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.asq.m3816k(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x0762:
            int[] r10 = r13.f2404c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.asq.m3803f(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x0773:
            int[] r10 = r13.f2404c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.asq.m3809h(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x0784:
            int[] r10 = r13.f2404c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.asq.m3796d(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x0795:
            int[] r10 = r13.f2404c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.asq.m3792c(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x07a6:
            int[] r10 = r13.f2404c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.asq.m3788b((int) r10, (java.util.List<java.lang.Float>) r9, (com.google.android.gms.internal.ads.auc) r15, (boolean) r4)
            goto L_0x0a21
        L_0x07b7:
            int[] r10 = r13.f2404c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.asq.m3775a((int) r10, (java.util.List<java.lang.Double>) r9, (com.google.android.gms.internal.ads.auc) r15, (boolean) r4)
            goto L_0x0a21
        L_0x07c8:
            int[] r10 = r13.f2404c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.asq.m3800e(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x07d9:
            int[] r10 = r13.f2404c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.asq.m3815j(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x07ea:
            int[] r10 = r13.f2404c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.asq.m3806g(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x07fb:
            int[] r10 = r13.f2404c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.asq.m3817l(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x080c:
            int[] r10 = r13.f2404c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.asq.m3818m(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x081d:
            int[] r10 = r13.f2404c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.asq.m3812i(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x082e:
            int[] r10 = r13.f2404c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.asq.m3786b((int) r10, (java.util.List<com.google.android.gms.internal.ads.apc>) r9, (com.google.android.gms.internal.ads.auc) r15)
            goto L_0x0a21
        L_0x083f:
            int[] r10 = r13.f2404c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.aso r11 = r13.m3637a((int) r1)
            com.google.android.gms.internal.ads.asq.m3774a((int) r10, (java.util.List<?>) r9, (com.google.android.gms.internal.ads.auc) r15, (com.google.android.gms.internal.ads.aso) r11)
            goto L_0x0a21
        L_0x0854:
            int[] r10 = r13.f2404c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.asq.m3773a((int) r10, (java.util.List<java.lang.String>) r9, (com.google.android.gms.internal.ads.auc) r15)
            goto L_0x0a21
        L_0x0865:
            int[] r10 = r13.f2404c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.asq.m3819n(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x0876:
            int[] r10 = r13.f2404c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.asq.m3816k(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x0887:
            int[] r10 = r13.f2404c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.asq.m3803f(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x0898:
            int[] r10 = r13.f2404c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.asq.m3809h(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x08a9:
            int[] r10 = r13.f2404c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.asq.m3796d(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x08ba:
            int[] r10 = r13.f2404c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.asq.m3792c(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x08cb:
            int[] r10 = r13.f2404c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.asq.m3788b((int) r10, (java.util.List<java.lang.Float>) r9, (com.google.android.gms.internal.ads.auc) r15, (boolean) r5)
            goto L_0x0a21
        L_0x08dc:
            int[] r10 = r13.f2404c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.asq.m3775a((int) r10, (java.util.List<java.lang.Double>) r9, (com.google.android.gms.internal.ads.auc) r15, (boolean) r5)
            goto L_0x0a21
        L_0x08ed:
            boolean r11 = r13.m3647a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            com.google.android.gms.internal.ads.aso r11 = r13.m3637a((int) r1)
            r15.mo10944b((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.ads.aso) r11)
            goto L_0x0a21
        L_0x0902:
            boolean r11 = r13.m3647a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.ads.atn.m3928b(r14, r11)
            r15.mo10955e((int) r10, (long) r11)
            goto L_0x0a21
        L_0x0913:
            boolean r11 = r13.m3647a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r14, (long) r11)
            r15.mo10957f(r10, r9)
            goto L_0x0a21
        L_0x0924:
            boolean r11 = r13.m3647a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.ads.atn.m3928b(r14, r11)
            r15.mo10943b((int) r10, (long) r11)
            goto L_0x0a21
        L_0x0935:
            boolean r11 = r13.m3647a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r14, (long) r11)
            r15.mo10930a((int) r10, (int) r9)
            goto L_0x0a21
        L_0x0946:
            boolean r11 = r13.m3647a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r14, (long) r11)
            r15.mo10942b((int) r10, (int) r9)
            goto L_0x0a21
        L_0x0957:
            boolean r11 = r13.m3647a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r14, (long) r11)
            r15.mo10954e((int) r10, (int) r9)
            goto L_0x0a21
        L_0x0968:
            boolean r11 = r13.m3647a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            com.google.android.gms.internal.ads.apc r9 = (com.google.android.gms.internal.ads.apc) r9
            r15.mo10932a((int) r10, (com.google.android.gms.internal.ads.apc) r9)
            goto L_0x0a21
        L_0x097b:
            boolean r11 = r13.m3647a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            com.google.android.gms.internal.ads.aso r11 = r13.m3637a((int) r1)
            r15.mo10935a((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.ads.aso) r11)
            goto L_0x0a21
        L_0x0990:
            boolean r11 = r13.m3647a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.atn.m3944f(r14, r11)
            m3642a((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.ads.auc) r15)
            goto L_0x0a21
        L_0x09a1:
            boolean r11 = r13.m3647a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = com.google.android.gms.internal.ads.atn.m3936c(r14, r11)
            r15.mo10940a((int) r10, (boolean) r9)
            goto L_0x0a21
        L_0x09b2:
            boolean r11 = r13.m3647a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r14, (long) r11)
            r15.mo10951d((int) r10, (int) r9)
            goto L_0x0a21
        L_0x09c2:
            boolean r11 = r13.m3647a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.ads.atn.m3928b(r14, r11)
            r15.mo10952d((int) r10, (long) r11)
            goto L_0x0a21
        L_0x09d2:
            boolean r11 = r13.m3647a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.ads.atn.m3913a((java.lang.Object) r14, (long) r11)
            r15.mo10948c((int) r10, (int) r9)
            goto L_0x0a21
        L_0x09e2:
            boolean r11 = r13.m3647a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.ads.atn.m3928b(r14, r11)
            r15.mo10949c((int) r10, (long) r11)
            goto L_0x0a21
        L_0x09f2:
            boolean r11 = r13.m3647a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.ads.atn.m3928b(r14, r11)
            r15.mo10931a((int) r10, (long) r11)
            goto L_0x0a21
        L_0x0a02:
            boolean r11 = r13.m3647a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = com.google.android.gms.internal.ads.atn.m3937d(r14, r11)
            r15.mo10929a((int) r10, (float) r9)
            goto L_0x0a21
        L_0x0a12:
            boolean r11 = r13.m3647a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = com.google.android.gms.internal.ads.atn.m3941e(r14, r11)
            r15.mo10928a((int) r10, (double) r11)
        L_0x0a21:
            int r1 = r1 + 3
            goto L_0x054d
        L_0x0a25:
            if (r8 == 0) goto L_0x0a3c
            com.google.android.gms.internal.ads.aqa<?> r1 = r13.f2419r
            r1.mo10984a((com.google.android.gms.internal.ads.auc) r15, (java.util.Map.Entry<?, ?>) r8)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0a3a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r8 = r1
            goto L_0x0a25
        L_0x0a3a:
            r8 = r3
            goto L_0x0a25
        L_0x0a3c:
            com.google.android.gms.internal.ads.atg<?, ?> r0 = r13.f2418q
            m3643a(r0, r14, (com.google.android.gms.internal.ads.auc) r15)
            return
        L_0x0a42:
            r13.m3656b(r14, (com.google.android.gms.internal.ads.auc) r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.asa.mo11103a(java.lang.Object, com.google.android.gms.internal.ads.auc):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:172:0x0527  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m3656b(T r20, com.google.android.gms.internal.ads.auc r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            boolean r3 = r0.f2409h
            if (r3 == 0) goto L_0x0021
            com.google.android.gms.internal.ads.aqa<?> r3 = r0.f2419r
            com.google.android.gms.internal.ads.aqd r3 = r3.mo10979a((java.lang.Object) r1)
            boolean r5 = r3.mo10990b()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.mo10994e()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            r6 = -1
            int[] r7 = r0.f2404c
            int r7 = r7.length
            sun.misc.Unsafe r8 = f2403b
            r10 = r5
            r5 = 0
            r11 = 0
        L_0x002c:
            if (r5 >= r7) goto L_0x0525
            int r12 = r0.m3661d((int) r5)
            int[] r13 = r0.f2404c
            r13 = r13[r5]
            r14 = 267386880(0xff00000, float:2.3665827E-29)
            r14 = r14 & r12
            int r14 = r14 >>> 20
            boolean r15 = r0.f2411j
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r15 != 0) goto L_0x0061
            r15 = 17
            if (r14 > r15) goto L_0x0061
            int[] r15 = r0.f2404c
            int r17 = r5 + 2
            r15 = r15[r17]
            r9 = r15 & r16
            if (r9 == r6) goto L_0x0059
            r18 = r5
            long r4 = (long) r9
            int r11 = r8.getInt(r1, r4)
            r6 = r9
            goto L_0x005b
        L_0x0059:
            r18 = r5
        L_0x005b:
            int r4 = r15 >>> 20
            r5 = 1
            int r9 = r5 << r4
            goto L_0x0064
        L_0x0061:
            r18 = r5
            r9 = 0
        L_0x0064:
            if (r10 == 0) goto L_0x0083
            com.google.android.gms.internal.ads.aqa<?> r4 = r0.f2419r
            int r4 = r4.mo10978a((java.util.Map.Entry<?, ?>) r10)
            if (r4 > r13) goto L_0x0083
            com.google.android.gms.internal.ads.aqa<?> r4 = r0.f2419r
            r4.mo10984a((com.google.android.gms.internal.ads.auc) r2, (java.util.Map.Entry<?, ?>) r10)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r10 = r4
            goto L_0x0064
        L_0x0081:
            r10 = 0
            goto L_0x0064
        L_0x0083:
            r4 = r12 & r16
            long r4 = (long) r4
            switch(r14) {
                case 0: goto L_0x0514;
                case 1: goto L_0x0506;
                case 2: goto L_0x04f8;
                case 3: goto L_0x04ea;
                case 4: goto L_0x04dc;
                case 5: goto L_0x04ce;
                case 6: goto L_0x04c0;
                case 7: goto L_0x04b2;
                case 8: goto L_0x04a3;
                case 9: goto L_0x0490;
                case 10: goto L_0x047f;
                case 11: goto L_0x0470;
                case 12: goto L_0x0461;
                case 13: goto L_0x0452;
                case 14: goto L_0x0443;
                case 15: goto L_0x0434;
                case 16: goto L_0x0425;
                case 17: goto L_0x0412;
                case 18: goto L_0x0400;
                case 19: goto L_0x03ee;
                case 20: goto L_0x03dc;
                case 21: goto L_0x03ca;
                case 22: goto L_0x03b8;
                case 23: goto L_0x03a6;
                case 24: goto L_0x0394;
                case 25: goto L_0x0382;
                case 26: goto L_0x0371;
                case 27: goto L_0x035c;
                case 28: goto L_0x034b;
                case 29: goto L_0x0339;
                case 30: goto L_0x0327;
                case 31: goto L_0x0315;
                case 32: goto L_0x0303;
                case 33: goto L_0x02f1;
                case 34: goto L_0x02df;
                case 35: goto L_0x02cd;
                case 36: goto L_0x02bb;
                case 37: goto L_0x02a9;
                case 38: goto L_0x0297;
                case 39: goto L_0x0285;
                case 40: goto L_0x0273;
                case 41: goto L_0x0261;
                case 42: goto L_0x024f;
                case 43: goto L_0x023d;
                case 44: goto L_0x022b;
                case 45: goto L_0x0219;
                case 46: goto L_0x0207;
                case 47: goto L_0x01f5;
                case 48: goto L_0x01e3;
                case 49: goto L_0x01ce;
                case 50: goto L_0x01c3;
                case 51: goto L_0x01b2;
                case 52: goto L_0x01a1;
                case 53: goto L_0x0190;
                case 54: goto L_0x017f;
                case 55: goto L_0x016e;
                case 56: goto L_0x015d;
                case 57: goto L_0x014c;
                case 58: goto L_0x013b;
                case 59: goto L_0x012a;
                case 60: goto L_0x0115;
                case 61: goto L_0x0102;
                case 62: goto L_0x00f2;
                case 63: goto L_0x00e2;
                case 64: goto L_0x00d2;
                case 65: goto L_0x00c2;
                case 66: goto L_0x00b2;
                case 67: goto L_0x00a2;
                case 68: goto L_0x008e;
                default: goto L_0x0089;
            }
        L_0x0089:
            r12 = r18
        L_0x008b:
            r14 = 0
            goto L_0x0521
        L_0x008e:
            r12 = r18
            boolean r9 = r0.m3648a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.ads.aso r5 = r0.m3637a((int) r12)
            r2.mo10944b((int) r13, (java.lang.Object) r4, (com.google.android.gms.internal.ads.aso) r5)
            goto L_0x008b
        L_0x00a2:
            r12 = r18
            boolean r9 = r0.m3648a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            long r4 = m3664e(r1, r4)
            r2.mo10955e((int) r13, (long) r4)
            goto L_0x008b
        L_0x00b2:
            r12 = r18
            boolean r9 = r0.m3648a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m3662d(r1, r4)
            r2.mo10957f(r13, r4)
            goto L_0x008b
        L_0x00c2:
            r12 = r18
            boolean r9 = r0.m3648a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            long r4 = m3664e(r1, r4)
            r2.mo10943b((int) r13, (long) r4)
            goto L_0x008b
        L_0x00d2:
            r12 = r18
            boolean r9 = r0.m3648a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m3662d(r1, r4)
            r2.mo10930a((int) r13, (int) r4)
            goto L_0x008b
        L_0x00e2:
            r12 = r18
            boolean r9 = r0.m3648a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m3662d(r1, r4)
            r2.mo10942b((int) r13, (int) r4)
            goto L_0x008b
        L_0x00f2:
            r12 = r18
            boolean r9 = r0.m3648a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m3662d(r1, r4)
            r2.mo10954e((int) r13, (int) r4)
            goto L_0x008b
        L_0x0102:
            r12 = r18
            boolean r9 = r0.m3648a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.ads.apc r4 = (com.google.android.gms.internal.ads.apc) r4
            r2.mo10932a((int) r13, (com.google.android.gms.internal.ads.apc) r4)
            goto L_0x008b
        L_0x0115:
            r12 = r18
            boolean r9 = r0.m3648a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.ads.aso r5 = r0.m3637a((int) r12)
            r2.mo10935a((int) r13, (java.lang.Object) r4, (com.google.android.gms.internal.ads.aso) r5)
            goto L_0x008b
        L_0x012a:
            r12 = r18
            boolean r9 = r0.m3648a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            java.lang.Object r4 = r8.getObject(r1, r4)
            m3642a((int) r13, (java.lang.Object) r4, (com.google.android.gms.internal.ads.auc) r2)
            goto L_0x008b
        L_0x013b:
            r12 = r18
            boolean r9 = r0.m3648a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            boolean r4 = m3667f(r1, r4)
            r2.mo10940a((int) r13, (boolean) r4)
            goto L_0x008b
        L_0x014c:
            r12 = r18
            boolean r9 = r0.m3648a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m3662d(r1, r4)
            r2.mo10951d((int) r13, (int) r4)
            goto L_0x008b
        L_0x015d:
            r12 = r18
            boolean r9 = r0.m3648a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            long r4 = m3664e(r1, r4)
            r2.mo10952d((int) r13, (long) r4)
            goto L_0x008b
        L_0x016e:
            r12 = r18
            boolean r9 = r0.m3648a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m3662d(r1, r4)
            r2.mo10948c((int) r13, (int) r4)
            goto L_0x008b
        L_0x017f:
            r12 = r18
            boolean r9 = r0.m3648a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            long r4 = m3664e(r1, r4)
            r2.mo10949c((int) r13, (long) r4)
            goto L_0x008b
        L_0x0190:
            r12 = r18
            boolean r9 = r0.m3648a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            long r4 = m3664e(r1, r4)
            r2.mo10931a((int) r13, (long) r4)
            goto L_0x008b
        L_0x01a1:
            r12 = r18
            boolean r9 = r0.m3648a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            float r4 = m3658c(r1, r4)
            r2.mo10929a((int) r13, (float) r4)
            goto L_0x008b
        L_0x01b2:
            r12 = r18
            boolean r9 = r0.m3648a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            double r4 = m3651b(r1, (long) r4)
            r2.mo10928a((int) r13, (double) r4)
            goto L_0x008b
        L_0x01c3:
            r12 = r18
            java.lang.Object r4 = r8.getObject(r1, r4)
            r0.m3644a((com.google.android.gms.internal.ads.auc) r2, (int) r13, (java.lang.Object) r4, (int) r12)
            goto L_0x008b
        L_0x01ce:
            r12 = r18
            int[] r9 = r0.f2404c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.aso r5 = r0.m3637a((int) r12)
            com.google.android.gms.internal.ads.asq.m3787b((int) r9, (java.util.List<?>) r4, (com.google.android.gms.internal.ads.auc) r2, (com.google.android.gms.internal.ads.aso) r5)
            goto L_0x008b
        L_0x01e3:
            r12 = r18
            int[] r9 = r0.f2404c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r13 = 1
            com.google.android.gms.internal.ads.asq.m3800e(r9, r4, r2, r13)
            goto L_0x008b
        L_0x01f5:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f2404c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.asq.m3815j(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0207:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f2404c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.asq.m3806g(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0219:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f2404c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.asq.m3817l(r9, r4, r2, r13)
            goto L_0x008b
        L_0x022b:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f2404c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.asq.m3818m(r9, r4, r2, r13)
            goto L_0x008b
        L_0x023d:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f2404c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.asq.m3812i(r9, r4, r2, r13)
            goto L_0x008b
        L_0x024f:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f2404c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.asq.m3819n(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0261:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f2404c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.asq.m3816k(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0273:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f2404c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.asq.m3803f(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0285:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f2404c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.asq.m3809h(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0297:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f2404c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.asq.m3796d(r9, r4, r2, r13)
            goto L_0x008b
        L_0x02a9:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f2404c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.asq.m3792c(r9, r4, r2, r13)
            goto L_0x008b
        L_0x02bb:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f2404c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.asq.m3788b((int) r9, (java.util.List<java.lang.Float>) r4, (com.google.android.gms.internal.ads.auc) r2, (boolean) r13)
            goto L_0x008b
        L_0x02cd:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f2404c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.asq.m3775a((int) r9, (java.util.List<java.lang.Double>) r4, (com.google.android.gms.internal.ads.auc) r2, (boolean) r13)
            goto L_0x008b
        L_0x02df:
            r12 = r18
            int[] r9 = r0.f2404c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r13 = 0
            com.google.android.gms.internal.ads.asq.m3800e(r9, r4, r2, r13)
            goto L_0x008b
        L_0x02f1:
            r12 = r18
            r13 = 0
            int[] r9 = r0.f2404c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.asq.m3815j(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0303:
            r12 = r18
            r13 = 0
            int[] r9 = r0.f2404c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.asq.m3806g(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0315:
            r12 = r18
            r13 = 0
            int[] r9 = r0.f2404c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.asq.m3817l(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0327:
            r12 = r18
            r13 = 0
            int[] r9 = r0.f2404c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.asq.m3818m(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0339:
            r12 = r18
            r13 = 0
            int[] r9 = r0.f2404c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.asq.m3812i(r9, r4, r2, r13)
            goto L_0x008b
        L_0x034b:
            r12 = r18
            int[] r9 = r0.f2404c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.asq.m3786b((int) r9, (java.util.List<com.google.android.gms.internal.ads.apc>) r4, (com.google.android.gms.internal.ads.auc) r2)
            goto L_0x008b
        L_0x035c:
            r12 = r18
            int[] r9 = r0.f2404c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.aso r5 = r0.m3637a((int) r12)
            com.google.android.gms.internal.ads.asq.m3774a((int) r9, (java.util.List<?>) r4, (com.google.android.gms.internal.ads.auc) r2, (com.google.android.gms.internal.ads.aso) r5)
            goto L_0x008b
        L_0x0371:
            r12 = r18
            int[] r9 = r0.f2404c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.asq.m3773a((int) r9, (java.util.List<java.lang.String>) r4, (com.google.android.gms.internal.ads.auc) r2)
            goto L_0x008b
        L_0x0382:
            r12 = r18
            int[] r9 = r0.f2404c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r14 = 0
            com.google.android.gms.internal.ads.asq.m3819n(r9, r4, r2, r14)
            goto L_0x0521
        L_0x0394:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f2404c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.asq.m3816k(r9, r4, r2, r14)
            goto L_0x0521
        L_0x03a6:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f2404c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.asq.m3803f(r9, r4, r2, r14)
            goto L_0x0521
        L_0x03b8:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f2404c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.asq.m3809h(r9, r4, r2, r14)
            goto L_0x0521
        L_0x03ca:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f2404c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.asq.m3796d(r9, r4, r2, r14)
            goto L_0x0521
        L_0x03dc:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f2404c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.asq.m3792c(r9, r4, r2, r14)
            goto L_0x0521
        L_0x03ee:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f2404c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.asq.m3788b((int) r9, (java.util.List<java.lang.Float>) r4, (com.google.android.gms.internal.ads.auc) r2, (boolean) r14)
            goto L_0x0521
        L_0x0400:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f2404c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.asq.m3775a((int) r9, (java.util.List<java.lang.Double>) r4, (com.google.android.gms.internal.ads.auc) r2, (boolean) r14)
            goto L_0x0521
        L_0x0412:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.ads.aso r5 = r0.m3637a((int) r12)
            r2.mo10944b((int) r13, (java.lang.Object) r4, (com.google.android.gms.internal.ads.aso) r5)
            goto L_0x0521
        L_0x0425:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            long r4 = r8.getLong(r1, r4)
            r2.mo10955e((int) r13, (long) r4)
            goto L_0x0521
        L_0x0434:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.mo10957f(r13, r4)
            goto L_0x0521
        L_0x0443:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            long r4 = r8.getLong(r1, r4)
            r2.mo10943b((int) r13, (long) r4)
            goto L_0x0521
        L_0x0452:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.mo10930a((int) r13, (int) r4)
            goto L_0x0521
        L_0x0461:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.mo10942b((int) r13, (int) r4)
            goto L_0x0521
        L_0x0470:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.mo10954e((int) r13, (int) r4)
            goto L_0x0521
        L_0x047f:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.ads.apc r4 = (com.google.android.gms.internal.ads.apc) r4
            r2.mo10932a((int) r13, (com.google.android.gms.internal.ads.apc) r4)
            goto L_0x0521
        L_0x0490:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.ads.aso r5 = r0.m3637a((int) r12)
            r2.mo10935a((int) r13, (java.lang.Object) r4, (com.google.android.gms.internal.ads.aso) r5)
            goto L_0x0521
        L_0x04a3:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            java.lang.Object r4 = r8.getObject(r1, r4)
            m3642a((int) r13, (java.lang.Object) r4, (com.google.android.gms.internal.ads.auc) r2)
            goto L_0x0521
        L_0x04b2:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            boolean r4 = com.google.android.gms.internal.ads.atn.m3936c(r1, r4)
            r2.mo10940a((int) r13, (boolean) r4)
            goto L_0x0521
        L_0x04c0:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.mo10951d((int) r13, (int) r4)
            goto L_0x0521
        L_0x04ce:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            long r4 = r8.getLong(r1, r4)
            r2.mo10952d((int) r13, (long) r4)
            goto L_0x0521
        L_0x04dc:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.mo10948c((int) r13, (int) r4)
            goto L_0x0521
        L_0x04ea:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            long r4 = r8.getLong(r1, r4)
            r2.mo10949c((int) r13, (long) r4)
            goto L_0x0521
        L_0x04f8:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            long r4 = r8.getLong(r1, r4)
            r2.mo10931a((int) r13, (long) r4)
            goto L_0x0521
        L_0x0506:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            float r4 = com.google.android.gms.internal.ads.atn.m3937d(r1, r4)
            r2.mo10929a((int) r13, (float) r4)
            goto L_0x0521
        L_0x0514:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            double r4 = com.google.android.gms.internal.ads.atn.m3941e(r1, r4)
            r2.mo10928a((int) r13, (double) r4)
        L_0x0521:
            int r5 = r12 + 3
            goto L_0x002c
        L_0x0525:
            if (r10 == 0) goto L_0x053c
            com.google.android.gms.internal.ads.aqa<?> r4 = r0.f2419r
            r4.mo10984a((com.google.android.gms.internal.ads.auc) r2, (java.util.Map.Entry<?, ?>) r10)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x053a
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r10 = r4
            goto L_0x0525
        L_0x053a:
            r10 = 0
            goto L_0x0525
        L_0x053c:
            com.google.android.gms.internal.ads.atg<?, ?> r3 = r0.f2418q
            m3643a(r3, r1, (com.google.android.gms.internal.ads.auc) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.asa.m3656b(java.lang.Object, com.google.android.gms.internal.ads.auc):void");
    }

    /* renamed from: a */
    private final <K, V> void m3644a(auc auc, int i, Object obj, int i2) {
        if (obj != null) {
            auc.mo10933a(i, this.f2420s.mo11086f(m3653b(i2)), this.f2420s.mo11082b(obj));
        }
    }

    /* renamed from: a */
    private static <UT, UB> void m3643a(atg<UT, UB> atg, T t, auc auc) {
        atg.mo11172a(atg.mo11176b(t), auc);
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: a */
    public final void mo11102a(T r13, com.google.android.gms.internal.ads.asn r14, com.google.android.gms.internal.ads.apz r15) {
        /*
            r12 = this;
            if (r15 == 0) goto L_0x05e0
            com.google.android.gms.internal.ads.atg<?, ?> r7 = r12.f2418q
            com.google.android.gms.internal.ads.aqa<?> r8 = r12.f2419r
            r9 = 0
            r0 = r9
            r10 = r0
        L_0x0009:
            int r1 = r14.mo10845a()     // Catch:{ all -> 0x05c8 }
            int r2 = r12.m3668g(r1)     // Catch:{ all -> 0x05c8 }
            if (r2 >= 0) goto L_0x0079
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x002f
            int r14 = r12.f2414m
        L_0x001a:
            int r15 = r12.f2415n
            if (r14 >= r15) goto L_0x0029
            int[] r15 = r12.f2413l
            r15 = r15[r14]
            java.lang.Object r10 = r12.m3639a((java.lang.Object) r13, (int) r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x001a
        L_0x0029:
            if (r10 == 0) goto L_0x002e
            r7.mo11179b((java.lang.Object) r13, r10)
        L_0x002e:
            return
        L_0x002f:
            boolean r2 = r12.f2409h     // Catch:{ all -> 0x05c8 }
            if (r2 != 0) goto L_0x0035
            r2 = r9
            goto L_0x003c
        L_0x0035:
            com.google.android.gms.internal.ads.arw r2 = r12.f2408g     // Catch:{ all -> 0x05c8 }
            java.lang.Object r1 = r8.mo10980a(r15, r2, r1)     // Catch:{ all -> 0x05c8 }
            r2 = r1
        L_0x003c:
            if (r2 == 0) goto L_0x0052
            if (r0 != 0) goto L_0x0044
            com.google.android.gms.internal.ads.aqd r0 = r8.mo10987b(r13)     // Catch:{ all -> 0x05c8 }
        L_0x0044:
            r11 = r0
            r0 = r8
            r1 = r14
            r3 = r15
            r4 = r11
            r5 = r10
            r6 = r7
            java.lang.Object r0 = r0.mo10981a(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x05c8 }
            r10 = r0
            r0 = r11
            goto L_0x0009
        L_0x0052:
            r7.mo11174a((com.google.android.gms.internal.ads.asn) r14)     // Catch:{ all -> 0x05c8 }
            if (r10 != 0) goto L_0x005c
            java.lang.Object r1 = r7.mo11180c(r13)     // Catch:{ all -> 0x05c8 }
            r10 = r1
        L_0x005c:
            boolean r1 = r7.mo11175a(r10, (com.google.android.gms.internal.ads.asn) r14)     // Catch:{ all -> 0x05c8 }
            if (r1 != 0) goto L_0x0009
            int r14 = r12.f2414m
        L_0x0064:
            int r15 = r12.f2415n
            if (r14 >= r15) goto L_0x0073
            int[] r15 = r12.f2413l
            r15 = r15[r14]
            java.lang.Object r10 = r12.m3639a((java.lang.Object) r13, (int) r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x0064
        L_0x0073:
            if (r10 == 0) goto L_0x0078
            r7.mo11179b((java.lang.Object) r13, r10)
        L_0x0078:
            return
        L_0x0079:
            int r3 = r12.m3661d((int) r2)     // Catch:{ all -> 0x05c8 }
            r4 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r3
            int r4 = r4 >>> 20
            r5 = 1048575(0xfffff, float:1.469367E-39)
            switch(r4) {
                case 0: goto L_0x0574;
                case 1: goto L_0x0565;
                case 2: goto L_0x0556;
                case 3: goto L_0x0547;
                case 4: goto L_0x0538;
                case 5: goto L_0x0529;
                case 6: goto L_0x051a;
                case 7: goto L_0x050b;
                case 8: goto L_0x0503;
                case 9: goto L_0x04d2;
                case 10: goto L_0x04c3;
                case 11: goto L_0x04b4;
                case 12: goto L_0x0492;
                case 13: goto L_0x0483;
                case 14: goto L_0x0474;
                case 15: goto L_0x0465;
                case 16: goto L_0x0456;
                case 17: goto L_0x0425;
                case 18: goto L_0x0417;
                case 19: goto L_0x0409;
                case 20: goto L_0x03fb;
                case 21: goto L_0x03ed;
                case 22: goto L_0x03df;
                case 23: goto L_0x03d1;
                case 24: goto L_0x03c3;
                case 25: goto L_0x03b5;
                case 26: goto L_0x0393;
                case 27: goto L_0x0381;
                case 28: goto L_0x0373;
                case 29: goto L_0x0365;
                case 30: goto L_0x034f;
                case 31: goto L_0x0341;
                case 32: goto L_0x0333;
                case 33: goto L_0x0325;
                case 34: goto L_0x0317;
                case 35: goto L_0x0309;
                case 36: goto L_0x02fb;
                case 37: goto L_0x02ed;
                case 38: goto L_0x02df;
                case 39: goto L_0x02d1;
                case 40: goto L_0x02c3;
                case 41: goto L_0x02b5;
                case 42: goto L_0x02a7;
                case 43: goto L_0x0299;
                case 44: goto L_0x0284;
                case 45: goto L_0x0276;
                case 46: goto L_0x0268;
                case 47: goto L_0x025a;
                case 48: goto L_0x024c;
                case 49: goto L_0x023a;
                case 50: goto L_0x01f8;
                case 51: goto L_0x01e6;
                case 52: goto L_0x01d4;
                case 53: goto L_0x01c2;
                case 54: goto L_0x01b0;
                case 55: goto L_0x019e;
                case 56: goto L_0x018c;
                case 57: goto L_0x017a;
                case 58: goto L_0x0168;
                case 59: goto L_0x0160;
                case 60: goto L_0x012f;
                case 61: goto L_0x0121;
                case 62: goto L_0x010f;
                case 63: goto L_0x00ea;
                case 64: goto L_0x00d8;
                case 65: goto L_0x00c6;
                case 66: goto L_0x00b4;
                case 67: goto L_0x00a2;
                case 68: goto L_0x0090;
                default: goto L_0x0088;
            }
        L_0x0088:
            if (r10 != 0) goto L_0x0584
            java.lang.Object r1 = r7.mo11166a()     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0583
        L_0x0090:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.aso r5 = r12.m3637a((int) r2)     // Catch:{ aqw -> 0x05a1 }
            java.lang.Object r5 = r14.mo10851b(r5, r15)     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3922a((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ aqw -> 0x05a1 }
            r12.m3655b(r13, (int) r1, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x00a2:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ aqw -> 0x05a1 }
            long r5 = r14.mo10886t()     // Catch:{ aqw -> 0x05a1 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3922a((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ aqw -> 0x05a1 }
            r12.m3655b(r13, (int) r1, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x00b4:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ aqw -> 0x05a1 }
            int r5 = r14.mo10885s()     // Catch:{ aqw -> 0x05a1 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3922a((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ aqw -> 0x05a1 }
            r12.m3655b(r13, (int) r1, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x00c6:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ aqw -> 0x05a1 }
            long r5 = r14.mo10884r()     // Catch:{ aqw -> 0x05a1 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3922a((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ aqw -> 0x05a1 }
            r12.m3655b(r13, (int) r1, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x00d8:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ aqw -> 0x05a1 }
            int r5 = r14.mo10882q()     // Catch:{ aqw -> 0x05a1 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3922a((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ aqw -> 0x05a1 }
            r12.m3655b(r13, (int) r1, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x00ea:
            int r4 = r14.mo10880p()     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.aqs r6 = r12.m3659c((int) r2)     // Catch:{ aqw -> 0x05a1 }
            if (r6 == 0) goto L_0x0101
            boolean r6 = r6.mo11037a(r4)     // Catch:{ aqw -> 0x05a1 }
            if (r6 == 0) goto L_0x00fb
            goto L_0x0101
        L_0x00fb:
            java.lang.Object r1 = com.google.android.gms.internal.ads.asq.m3771a((int) r1, (int) r4, r10, r7)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0362
        L_0x0101:
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ aqw -> 0x05a1 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3922a((java.lang.Object) r13, (long) r5, (java.lang.Object) r3)     // Catch:{ aqw -> 0x05a1 }
            r12.m3655b(r13, (int) r1, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x010f:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ aqw -> 0x05a1 }
            int r5 = r14.mo10878o()     // Catch:{ aqw -> 0x05a1 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3922a((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ aqw -> 0x05a1 }
            r12.m3655b(r13, (int) r1, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x0121:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.apc r5 = r14.mo10876n()     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3922a((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ aqw -> 0x05a1 }
            r12.m3655b(r13, (int) r1, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x012f:
            boolean r4 = r12.m3648a(r13, (int) r1, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            if (r4 == 0) goto L_0x014b
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ aqw -> 0x05a1 }
            java.lang.Object r5 = com.google.android.gms.internal.ads.atn.m3944f(r13, r3)     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.aso r6 = r12.m3637a((int) r2)     // Catch:{ aqw -> 0x05a1 }
            java.lang.Object r6 = r14.mo10846a(r6, r15)     // Catch:{ aqw -> 0x05a1 }
            java.lang.Object r5 = com.google.android.gms.internal.ads.aqp.m3496a((java.lang.Object) r5, (java.lang.Object) r6)     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3922a((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x015b
        L_0x014b:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.aso r5 = r12.m3637a((int) r2)     // Catch:{ aqw -> 0x05a1 }
            java.lang.Object r5 = r14.mo10846a(r5, r15)     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3922a((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ aqw -> 0x05a1 }
            r12.m3654b(r13, (int) r2)     // Catch:{ aqw -> 0x05a1 }
        L_0x015b:
            r12.m3655b(r13, (int) r1, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x0160:
            r12.m3645a((java.lang.Object) r13, (int) r3, (com.google.android.gms.internal.ads.asn) r14)     // Catch:{ aqw -> 0x05a1 }
            r12.m3655b(r13, (int) r1, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x0168:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ aqw -> 0x05a1 }
            boolean r5 = r14.mo10871k()     // Catch:{ aqw -> 0x05a1 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3922a((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ aqw -> 0x05a1 }
            r12.m3655b(r13, (int) r1, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x017a:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ aqw -> 0x05a1 }
            int r5 = r14.mo10868j()     // Catch:{ aqw -> 0x05a1 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3922a((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ aqw -> 0x05a1 }
            r12.m3655b(r13, (int) r1, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x018c:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ aqw -> 0x05a1 }
            long r5 = r14.mo10866i()     // Catch:{ aqw -> 0x05a1 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3922a((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ aqw -> 0x05a1 }
            r12.m3655b(r13, (int) r1, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x019e:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ aqw -> 0x05a1 }
            int r5 = r14.mo10864h()     // Catch:{ aqw -> 0x05a1 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3922a((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ aqw -> 0x05a1 }
            r12.m3655b(r13, (int) r1, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x01b0:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ aqw -> 0x05a1 }
            long r5 = r14.mo10860f()     // Catch:{ aqw -> 0x05a1 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3922a((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ aqw -> 0x05a1 }
            r12.m3655b(r13, (int) r1, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x01c2:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ aqw -> 0x05a1 }
            long r5 = r14.mo10862g()     // Catch:{ aqw -> 0x05a1 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3922a((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ aqw -> 0x05a1 }
            r12.m3655b(r13, (int) r1, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x01d4:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ aqw -> 0x05a1 }
            float r5 = r14.mo10858e()     // Catch:{ aqw -> 0x05a1 }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3922a((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ aqw -> 0x05a1 }
            r12.m3655b(r13, (int) r1, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x01e6:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ aqw -> 0x05a1 }
            double r5 = r14.mo10856d()     // Catch:{ aqw -> 0x05a1 }
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3922a((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ aqw -> 0x05a1 }
            r12.m3655b(r13, (int) r1, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x01f8:
            java.lang.Object r1 = r12.m3653b((int) r2)     // Catch:{ aqw -> 0x05a1 }
            int r2 = r12.m3661d((int) r2)     // Catch:{ aqw -> 0x05a1 }
            r2 = r2 & r5
            long r2 = (long) r2     // Catch:{ aqw -> 0x05a1 }
            java.lang.Object r4 = com.google.android.gms.internal.ads.atn.m3944f(r13, r2)     // Catch:{ aqw -> 0x05a1 }
            if (r4 != 0) goto L_0x0212
            com.google.android.gms.internal.ads.arr r4 = r12.f2420s     // Catch:{ aqw -> 0x05a1 }
            java.lang.Object r4 = r4.mo11085e(r1)     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3922a((java.lang.Object) r13, (long) r2, (java.lang.Object) r4)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0229
        L_0x0212:
            com.google.android.gms.internal.ads.arr r5 = r12.f2420s     // Catch:{ aqw -> 0x05a1 }
            boolean r5 = r5.mo11083c(r4)     // Catch:{ aqw -> 0x05a1 }
            if (r5 == 0) goto L_0x0229
            com.google.android.gms.internal.ads.arr r5 = r12.f2420s     // Catch:{ aqw -> 0x05a1 }
            java.lang.Object r5 = r5.mo11085e(r1)     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.arr r6 = r12.f2420s     // Catch:{ aqw -> 0x05a1 }
            r6.mo11080a(r5, r4)     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3922a((java.lang.Object) r13, (long) r2, (java.lang.Object) r5)     // Catch:{ aqw -> 0x05a1 }
            r4 = r5
        L_0x0229:
            com.google.android.gms.internal.ads.arr r2 = r12.f2420s     // Catch:{ aqw -> 0x05a1 }
            java.util.Map r2 = r2.mo11081a(r4)     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.arr r3 = r12.f2420s     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.arp r1 = r3.mo11086f(r1)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10849a(r2, r1, (com.google.android.gms.internal.ads.apz) r15)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x023a:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.aso r1 = r12.m3637a((int) r2)     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.arf r2 = r12.f2417p     // Catch:{ aqw -> 0x05a1 }
            java.util.List r2 = r2.mo11059a(r13, r3)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10853b(r2, r1, r15)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x024c:
            com.google.android.gms.internal.ads.arf r1 = r12.f2417p     // Catch:{ aqw -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ aqw -> 0x05a1 }
            java.util.List r1 = r1.mo11059a(r13, r2)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10883q(r1)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x025a:
            com.google.android.gms.internal.ads.arf r1 = r12.f2417p     // Catch:{ aqw -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ aqw -> 0x05a1 }
            java.util.List r1 = r1.mo11059a(r13, r2)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10881p(r1)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x0268:
            com.google.android.gms.internal.ads.arf r1 = r12.f2417p     // Catch:{ aqw -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ aqw -> 0x05a1 }
            java.util.List r1 = r1.mo11059a(r13, r2)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10879o(r1)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x0276:
            com.google.android.gms.internal.ads.arf r1 = r12.f2417p     // Catch:{ aqw -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ aqw -> 0x05a1 }
            java.util.List r1 = r1.mo11059a(r13, r2)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10877n(r1)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x0284:
            com.google.android.gms.internal.ads.arf r4 = r12.f2417p     // Catch:{ aqw -> 0x05a1 }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ aqw -> 0x05a1 }
            java.util.List r3 = r4.mo11059a(r13, r5)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10875m(r3)     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.aqs r2 = r12.m3659c((int) r2)     // Catch:{ aqw -> 0x05a1 }
            java.lang.Object r1 = com.google.android.gms.internal.ads.asq.m3772a(r1, r3, r2, r10, r7)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0362
        L_0x0299:
            com.google.android.gms.internal.ads.arf r1 = r12.f2417p     // Catch:{ aqw -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ aqw -> 0x05a1 }
            java.util.List r1 = r1.mo11059a(r13, r2)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10873l(r1)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x02a7:
            com.google.android.gms.internal.ads.arf r1 = r12.f2417p     // Catch:{ aqw -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ aqw -> 0x05a1 }
            java.util.List r1 = r1.mo11059a(r13, r2)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10865h(r1)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x02b5:
            com.google.android.gms.internal.ads.arf r1 = r12.f2417p     // Catch:{ aqw -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ aqw -> 0x05a1 }
            java.util.List r1 = r1.mo11059a(r13, r2)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10863g(r1)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x02c3:
            com.google.android.gms.internal.ads.arf r1 = r12.f2417p     // Catch:{ aqw -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ aqw -> 0x05a1 }
            java.util.List r1 = r1.mo11059a(r13, r2)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10861f(r1)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x02d1:
            com.google.android.gms.internal.ads.arf r1 = r12.f2417p     // Catch:{ aqw -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ aqw -> 0x05a1 }
            java.util.List r1 = r1.mo11059a(r13, r2)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10859e(r1)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x02df:
            com.google.android.gms.internal.ads.arf r1 = r12.f2417p     // Catch:{ aqw -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ aqw -> 0x05a1 }
            java.util.List r1 = r1.mo11059a(r13, r2)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10854c(r1)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x02ed:
            com.google.android.gms.internal.ads.arf r1 = r12.f2417p     // Catch:{ aqw -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ aqw -> 0x05a1 }
            java.util.List r1 = r1.mo11059a(r13, r2)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10857d(r1)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x02fb:
            com.google.android.gms.internal.ads.arf r1 = r12.f2417p     // Catch:{ aqw -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ aqw -> 0x05a1 }
            java.util.List r1 = r1.mo11059a(r13, r2)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10852b(r1)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x0309:
            com.google.android.gms.internal.ads.arf r1 = r12.f2417p     // Catch:{ aqw -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ aqw -> 0x05a1 }
            java.util.List r1 = r1.mo11059a(r13, r2)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10847a(r1)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x0317:
            com.google.android.gms.internal.ads.arf r1 = r12.f2417p     // Catch:{ aqw -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ aqw -> 0x05a1 }
            java.util.List r1 = r1.mo11059a(r13, r2)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10883q(r1)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x0325:
            com.google.android.gms.internal.ads.arf r1 = r12.f2417p     // Catch:{ aqw -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ aqw -> 0x05a1 }
            java.util.List r1 = r1.mo11059a(r13, r2)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10881p(r1)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x0333:
            com.google.android.gms.internal.ads.arf r1 = r12.f2417p     // Catch:{ aqw -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ aqw -> 0x05a1 }
            java.util.List r1 = r1.mo11059a(r13, r2)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10879o(r1)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x0341:
            com.google.android.gms.internal.ads.arf r1 = r12.f2417p     // Catch:{ aqw -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ aqw -> 0x05a1 }
            java.util.List r1 = r1.mo11059a(r13, r2)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10877n(r1)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x034f:
            com.google.android.gms.internal.ads.arf r4 = r12.f2417p     // Catch:{ aqw -> 0x05a1 }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ aqw -> 0x05a1 }
            java.util.List r3 = r4.mo11059a(r13, r5)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10875m(r3)     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.aqs r2 = r12.m3659c((int) r2)     // Catch:{ aqw -> 0x05a1 }
            java.lang.Object r1 = com.google.android.gms.internal.ads.asq.m3772a(r1, r3, r2, r10, r7)     // Catch:{ aqw -> 0x05a1 }
        L_0x0362:
            r10 = r1
            goto L_0x0009
        L_0x0365:
            com.google.android.gms.internal.ads.arf r1 = r12.f2417p     // Catch:{ aqw -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ aqw -> 0x05a1 }
            java.util.List r1 = r1.mo11059a(r13, r2)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10873l(r1)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x0373:
            com.google.android.gms.internal.ads.arf r1 = r12.f2417p     // Catch:{ aqw -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ aqw -> 0x05a1 }
            java.util.List r1 = r1.mo11059a(r13, r2)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10870k(r1)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x0381:
            com.google.android.gms.internal.ads.aso r1 = r12.m3637a((int) r2)     // Catch:{ aqw -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.arf r4 = r12.f2417p     // Catch:{ aqw -> 0x05a1 }
            java.util.List r2 = r4.mo11059a(r13, r2)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10848a(r2, r1, (com.google.android.gms.internal.ads.apz) r15)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x0393:
            boolean r1 = m3666f(r3)     // Catch:{ aqw -> 0x05a1 }
            if (r1 == 0) goto L_0x03a7
            com.google.android.gms.internal.ads.arf r1 = r12.f2417p     // Catch:{ aqw -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ aqw -> 0x05a1 }
            java.util.List r1 = r1.mo11059a(r13, r2)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10869j(r1)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x03a7:
            com.google.android.gms.internal.ads.arf r1 = r12.f2417p     // Catch:{ aqw -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ aqw -> 0x05a1 }
            java.util.List r1 = r1.mo11059a(r13, r2)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10867i(r1)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x03b5:
            com.google.android.gms.internal.ads.arf r1 = r12.f2417p     // Catch:{ aqw -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ aqw -> 0x05a1 }
            java.util.List r1 = r1.mo11059a(r13, r2)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10865h(r1)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x03c3:
            com.google.android.gms.internal.ads.arf r1 = r12.f2417p     // Catch:{ aqw -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ aqw -> 0x05a1 }
            java.util.List r1 = r1.mo11059a(r13, r2)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10863g(r1)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x03d1:
            com.google.android.gms.internal.ads.arf r1 = r12.f2417p     // Catch:{ aqw -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ aqw -> 0x05a1 }
            java.util.List r1 = r1.mo11059a(r13, r2)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10861f(r1)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x03df:
            com.google.android.gms.internal.ads.arf r1 = r12.f2417p     // Catch:{ aqw -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ aqw -> 0x05a1 }
            java.util.List r1 = r1.mo11059a(r13, r2)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10859e(r1)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x03ed:
            com.google.android.gms.internal.ads.arf r1 = r12.f2417p     // Catch:{ aqw -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ aqw -> 0x05a1 }
            java.util.List r1 = r1.mo11059a(r13, r2)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10854c(r1)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x03fb:
            com.google.android.gms.internal.ads.arf r1 = r12.f2417p     // Catch:{ aqw -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ aqw -> 0x05a1 }
            java.util.List r1 = r1.mo11059a(r13, r2)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10857d(r1)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x0409:
            com.google.android.gms.internal.ads.arf r1 = r12.f2417p     // Catch:{ aqw -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ aqw -> 0x05a1 }
            java.util.List r1 = r1.mo11059a(r13, r2)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10852b(r1)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x0417:
            com.google.android.gms.internal.ads.arf r1 = r12.f2417p     // Catch:{ aqw -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ aqw -> 0x05a1 }
            java.util.List r1 = r1.mo11059a(r13, r2)     // Catch:{ aqw -> 0x05a1 }
            r14.mo10847a(r1)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x0425:
            boolean r1 = r12.m3647a(r13, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            if (r1 == 0) goto L_0x0443
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ aqw -> 0x05a1 }
            java.lang.Object r1 = com.google.android.gms.internal.ads.atn.m3944f(r13, r3)     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.aso r2 = r12.m3637a((int) r2)     // Catch:{ aqw -> 0x05a1 }
            java.lang.Object r2 = r14.mo10851b(r2, r15)     // Catch:{ aqw -> 0x05a1 }
            java.lang.Object r1 = com.google.android.gms.internal.ads.aqp.m3496a((java.lang.Object) r1, (java.lang.Object) r2)     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3922a((java.lang.Object) r13, (long) r3, (java.lang.Object) r1)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x0443:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.aso r1 = r12.m3637a((int) r2)     // Catch:{ aqw -> 0x05a1 }
            java.lang.Object r1 = r14.mo10851b(r1, r15)     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3922a((java.lang.Object) r13, (long) r3, (java.lang.Object) r1)     // Catch:{ aqw -> 0x05a1 }
            r12.m3654b(r13, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x0456:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ aqw -> 0x05a1 }
            long r5 = r14.mo10886t()     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3921a((java.lang.Object) r13, (long) r3, (long) r5)     // Catch:{ aqw -> 0x05a1 }
            r12.m3654b(r13, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x0465:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ aqw -> 0x05a1 }
            int r1 = r14.mo10885s()     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3920a((java.lang.Object) r13, (long) r3, (int) r1)     // Catch:{ aqw -> 0x05a1 }
            r12.m3654b(r13, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x0474:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ aqw -> 0x05a1 }
            long r5 = r14.mo10884r()     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3921a((java.lang.Object) r13, (long) r3, (long) r5)     // Catch:{ aqw -> 0x05a1 }
            r12.m3654b(r13, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x0483:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ aqw -> 0x05a1 }
            int r1 = r14.mo10882q()     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3920a((java.lang.Object) r13, (long) r3, (int) r1)     // Catch:{ aqw -> 0x05a1 }
            r12.m3654b(r13, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x0492:
            int r4 = r14.mo10880p()     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.aqs r6 = r12.m3659c((int) r2)     // Catch:{ aqw -> 0x05a1 }
            if (r6 == 0) goto L_0x04a9
            boolean r6 = r6.mo11037a(r4)     // Catch:{ aqw -> 0x05a1 }
            if (r6 == 0) goto L_0x04a3
            goto L_0x04a9
        L_0x04a3:
            java.lang.Object r1 = com.google.android.gms.internal.ads.asq.m3771a((int) r1, (int) r4, r10, r7)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0362
        L_0x04a9:
            r1 = r3 & r5
            long r5 = (long) r1     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3920a((java.lang.Object) r13, (long) r5, (int) r4)     // Catch:{ aqw -> 0x05a1 }
            r12.m3654b(r13, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x04b4:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ aqw -> 0x05a1 }
            int r1 = r14.mo10878o()     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3920a((java.lang.Object) r13, (long) r3, (int) r1)     // Catch:{ aqw -> 0x05a1 }
            r12.m3654b(r13, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x04c3:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.apc r1 = r14.mo10876n()     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3922a((java.lang.Object) r13, (long) r3, (java.lang.Object) r1)     // Catch:{ aqw -> 0x05a1 }
            r12.m3654b(r13, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x04d2:
            boolean r1 = r12.m3647a(r13, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            if (r1 == 0) goto L_0x04f0
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ aqw -> 0x05a1 }
            java.lang.Object r1 = com.google.android.gms.internal.ads.atn.m3944f(r13, r3)     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.aso r2 = r12.m3637a((int) r2)     // Catch:{ aqw -> 0x05a1 }
            java.lang.Object r2 = r14.mo10846a(r2, r15)     // Catch:{ aqw -> 0x05a1 }
            java.lang.Object r1 = com.google.android.gms.internal.ads.aqp.m3496a((java.lang.Object) r1, (java.lang.Object) r2)     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3922a((java.lang.Object) r13, (long) r3, (java.lang.Object) r1)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x04f0:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.aso r1 = r12.m3637a((int) r2)     // Catch:{ aqw -> 0x05a1 }
            java.lang.Object r1 = r14.mo10846a(r1, r15)     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3922a((java.lang.Object) r13, (long) r3, (java.lang.Object) r1)     // Catch:{ aqw -> 0x05a1 }
            r12.m3654b(r13, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x0503:
            r12.m3645a((java.lang.Object) r13, (int) r3, (com.google.android.gms.internal.ads.asn) r14)     // Catch:{ aqw -> 0x05a1 }
            r12.m3654b(r13, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x050b:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ aqw -> 0x05a1 }
            boolean r1 = r14.mo10871k()     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3923a((java.lang.Object) r13, (long) r3, (boolean) r1)     // Catch:{ aqw -> 0x05a1 }
            r12.m3654b(r13, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x051a:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ aqw -> 0x05a1 }
            int r1 = r14.mo10868j()     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3920a((java.lang.Object) r13, (long) r3, (int) r1)     // Catch:{ aqw -> 0x05a1 }
            r12.m3654b(r13, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x0529:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ aqw -> 0x05a1 }
            long r5 = r14.mo10866i()     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3921a((java.lang.Object) r13, (long) r3, (long) r5)     // Catch:{ aqw -> 0x05a1 }
            r12.m3654b(r13, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x0538:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ aqw -> 0x05a1 }
            int r1 = r14.mo10864h()     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3920a((java.lang.Object) r13, (long) r3, (int) r1)     // Catch:{ aqw -> 0x05a1 }
            r12.m3654b(r13, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x0547:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ aqw -> 0x05a1 }
            long r5 = r14.mo10860f()     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3921a((java.lang.Object) r13, (long) r3, (long) r5)     // Catch:{ aqw -> 0x05a1 }
            r12.m3654b(r13, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x0556:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ aqw -> 0x05a1 }
            long r5 = r14.mo10862g()     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3921a((java.lang.Object) r13, (long) r3, (long) r5)     // Catch:{ aqw -> 0x05a1 }
            r12.m3654b(r13, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x0565:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ aqw -> 0x05a1 }
            float r1 = r14.mo10858e()     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3919a((java.lang.Object) r13, (long) r3, (float) r1)     // Catch:{ aqw -> 0x05a1 }
            r12.m3654b(r13, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x0574:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ aqw -> 0x05a1 }
            double r5 = r14.mo10856d()     // Catch:{ aqw -> 0x05a1 }
            com.google.android.gms.internal.ads.atn.m3918a((java.lang.Object) r13, (long) r3, (double) r5)     // Catch:{ aqw -> 0x05a1 }
            r12.m3654b(r13, (int) r2)     // Catch:{ aqw -> 0x05a1 }
            goto L_0x0009
        L_0x0583:
            r10 = r1
        L_0x0584:
            boolean r1 = r7.mo11175a(r10, (com.google.android.gms.internal.ads.asn) r14)     // Catch:{ aqw -> 0x05a1 }
            if (r1 != 0) goto L_0x0009
            int r14 = r12.f2414m
        L_0x058c:
            int r15 = r12.f2415n
            if (r14 >= r15) goto L_0x059b
            int[] r15 = r12.f2413l
            r15 = r15[r14]
            java.lang.Object r10 = r12.m3639a((java.lang.Object) r13, (int) r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x058c
        L_0x059b:
            if (r10 == 0) goto L_0x05a0
            r7.mo11179b((java.lang.Object) r13, r10)
        L_0x05a0:
            return
        L_0x05a1:
            r7.mo11174a((com.google.android.gms.internal.ads.asn) r14)     // Catch:{ all -> 0x05c8 }
            if (r10 != 0) goto L_0x05ab
            java.lang.Object r1 = r7.mo11180c(r13)     // Catch:{ all -> 0x05c8 }
            r10 = r1
        L_0x05ab:
            boolean r1 = r7.mo11175a(r10, (com.google.android.gms.internal.ads.asn) r14)     // Catch:{ all -> 0x05c8 }
            if (r1 != 0) goto L_0x0009
            int r14 = r12.f2414m
        L_0x05b3:
            int r15 = r12.f2415n
            if (r14 >= r15) goto L_0x05c2
            int[] r15 = r12.f2413l
            r15 = r15[r14]
            java.lang.Object r10 = r12.m3639a((java.lang.Object) r13, (int) r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x05b3
        L_0x05c2:
            if (r10 == 0) goto L_0x05c7
            r7.mo11179b((java.lang.Object) r13, r10)
        L_0x05c7:
            return
        L_0x05c8:
            r14 = move-exception
            int r15 = r12.f2414m
        L_0x05cb:
            int r0 = r12.f2415n
            if (r15 >= r0) goto L_0x05da
            int[] r0 = r12.f2413l
            r0 = r0[r15]
            java.lang.Object r10 = r12.m3639a((java.lang.Object) r13, (int) r0, r10, r7)
            int r15 = r15 + 1
            goto L_0x05cb
        L_0x05da:
            if (r10 == 0) goto L_0x05df
            r7.mo11179b((java.lang.Object) r13, r10)
        L_0x05df:
            throw r14
        L_0x05e0:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.asa.mo11102a(java.lang.Object, com.google.android.gms.internal.ads.asn, com.google.android.gms.internal.ads.apz):void");
    }

    /* renamed from: e */
    private static ath m3665e(Object obj) {
        aqn aqn = (aqn) obj;
        ath ath = aqn.zzfpu;
        if (ath != ath.m3874a()) {
            return ath;
        }
        ath b = ath.m3877b();
        aqn.zzfpu = b;
        return b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m3629a(com.google.android.gms.internal.ads.aso r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.ads.aoz r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = com.google.android.gms.internal.ads.aoy.m2958a((int) r8, (byte[]) r7, (int) r0, (com.google.android.gms.internal.ads.aoz) r10)
            int r8 = r10.f2155a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo11101a()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo11104a(r1, r2, r3, r4, r5)
            r6.mo11108c(r9)
            r10.f2157c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.ads.aqv r6 = com.google.android.gms.internal.ads.aqv.m3507a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.asa.m3629a(com.google.android.gms.internal.ads.aso, byte[], int, int, com.google.android.gms.internal.ads.aoz):int");
    }

    /* renamed from: a */
    private static int m3628a(aso aso, byte[] bArr, int i, int i2, int i3, aoz aoz) {
        asa asa = (asa) aso;
        Object a = asa.mo11101a();
        int a2 = asa.m3634a(a, bArr, i, i2, i3, aoz);
        asa.mo11108c(a);
        aoz.f2157c = a;
        return a2;
    }

    /* renamed from: a */
    private static int m3627a(aso<?> aso, int i, byte[] bArr, int i2, int i3, aqu<?> aqu, aoz aoz) {
        int a = m3629a((aso) aso, bArr, i2, i3, aoz);
        aqu.add(aoz.f2157c);
        while (a < i3) {
            int a2 = aoy.m2960a(bArr, a, aoz);
            if (i != aoz.f2155a) {
                break;
            }
            a = m3629a((aso) aso, bArr, a2, i3, aoz);
            aqu.add(aoz.f2157c);
        }
        return a;
    }

    /* renamed from: a */
    private static int m3635a(byte[] bArr, int i, int i2, atw atw, Class<?> cls, aoz aoz) {
        switch (asb.f2421a[atw.ordinal()]) {
            case 1:
                int b = aoy.m2962b(bArr, i, aoz);
                aoz.f2157c = Boolean.valueOf(aoz.f2156b != 0);
                return b;
            case 2:
                return aoy.m2968e(bArr, i, aoz);
            case 3:
                aoz.f2157c = Double.valueOf(aoy.m2964c(bArr, i));
                return i + 8;
            case 4:
            case 5:
                aoz.f2157c = Integer.valueOf(aoy.m2959a(bArr, i));
                return i + 4;
            case 6:
            case 7:
                aoz.f2157c = Long.valueOf(aoy.m2963b(bArr, i));
                return i + 8;
            case 8:
                aoz.f2157c = Float.valueOf(aoy.m2966d(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int a = aoy.m2960a(bArr, i, aoz);
                aoz.f2157c = Integer.valueOf(aoz.f2155a);
                return a;
            case 12:
            case 13:
                int b2 = aoy.m2962b(bArr, i, aoz);
                aoz.f2157c = Long.valueOf(aoz.f2156b);
                return b2;
            case 14:
                return m3629a((aso) asj.m3697a().mo11112a(cls), bArr, i, i2, aoz);
            case 15:
                int a2 = aoy.m2960a(bArr, i, aoz);
                aoz.f2157c = Integer.valueOf(apo.m3033g(aoz.f2155a));
                return a2;
            case 16:
                int b3 = aoy.m2962b(bArr, i, aoz);
                aoz.f2157c = Long.valueOf(apo.m3030a(aoz.f2156b));
                return b3;
            case 17:
                return aoy.m2967d(bArr, i, aoz);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* renamed from: a */
    private static int m3626a(int i, byte[] bArr, int i2, int i3, Object obj, aoz aoz) {
        return aoy.m2957a(i, bArr, i2, i3, m3665e(obj), aoz);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0433 A[SYNTHETIC] */
    /* renamed from: a */
    private final int m3632a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.ads.aoz r30) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2 = r21
            r6 = r23
            r8 = r24
            r9 = r28
            r7 = r30
            sun.misc.Unsafe r11 = f2403b
            java.lang.Object r11 = r11.getObject(r1, r9)
            com.google.android.gms.internal.ads.aqu r11 = (com.google.android.gms.internal.ads.aqu) r11
            boolean r12 = r11.mo10761a()
            r13 = 1
            if (r12 != 0) goto L_0x0036
            int r12 = r11.size()
            if (r12 != 0) goto L_0x002c
            r12 = 10
            goto L_0x002d
        L_0x002c:
            int r12 = r12 << r13
        L_0x002d:
            com.google.android.gms.internal.ads.aqu r11 = r11.mo10785a(r12)
            sun.misc.Unsafe r12 = f2403b
            r12.putObject(r1, r9, r11)
        L_0x0036:
            r9 = 5
            r14 = 0
            r10 = 2
            switch(r27) {
                case 18: goto L_0x03f2;
                case 19: goto L_0x03b2;
                case 20: goto L_0x0371;
                case 21: goto L_0x0371;
                case 22: goto L_0x0357;
                case 23: goto L_0x0316;
                case 24: goto L_0x02d5;
                case 25: goto L_0x027e;
                case 26: goto L_0x01c4;
                case 27: goto L_0x01aa;
                case 28: goto L_0x0151;
                case 29: goto L_0x0357;
                case 30: goto L_0x0119;
                case 31: goto L_0x02d5;
                case 32: goto L_0x0316;
                case 33: goto L_0x00cc;
                case 34: goto L_0x007f;
                case 35: goto L_0x03f2;
                case 36: goto L_0x03b2;
                case 37: goto L_0x0371;
                case 38: goto L_0x0371;
                case 39: goto L_0x0357;
                case 40: goto L_0x0316;
                case 41: goto L_0x02d5;
                case 42: goto L_0x027e;
                case 43: goto L_0x0357;
                case 44: goto L_0x0119;
                case 45: goto L_0x02d5;
                case 46: goto L_0x0316;
                case 47: goto L_0x00cc;
                case 48: goto L_0x007f;
                case 49: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0432
        L_0x003f:
            r1 = 3
            if (r6 != r1) goto L_0x0432
            com.google.android.gms.internal.ads.aso r1 = r0.m3637a((int) r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = m3628a((com.google.android.gms.internal.ads.aso) r22, (byte[]) r23, (int) r24, (int) r25, (int) r26, (com.google.android.gms.internal.ads.aoz) r27)
            java.lang.Object r8 = r7.f2157c
            r11.add(r8)
        L_0x005f:
            if (r4 >= r5) goto L_0x0432
            int r8 = com.google.android.gms.internal.ads.aoy.m2960a(r3, r4, r7)
            int r9 = r7.f2155a
            if (r2 != r9) goto L_0x0432
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = m3628a((com.google.android.gms.internal.ads.aso) r22, (byte[]) r23, (int) r24, (int) r25, (int) r26, (com.google.android.gms.internal.ads.aoz) r27)
            java.lang.Object r8 = r7.f2157c
            r11.add(r8)
            goto L_0x005f
        L_0x007f:
            if (r6 != r10) goto L_0x00a3
            com.google.android.gms.internal.ads.arj r11 = (com.google.android.gms.internal.ads.arj) r11
            int r1 = com.google.android.gms.internal.ads.aoy.m2960a(r3, r4, r7)
            int r2 = r7.f2155a
            int r2 = r2 + r1
        L_0x008a:
            if (r1 >= r2) goto L_0x009a
            int r1 = com.google.android.gms.internal.ads.aoy.m2962b(r3, r1, r7)
            long r4 = r7.f2156b
            long r4 = com.google.android.gms.internal.ads.apo.m3030a((long) r4)
            r11.mo11062a((long) r4)
            goto L_0x008a
        L_0x009a:
            if (r1 != r2) goto L_0x009e
            goto L_0x0433
        L_0x009e:
            com.google.android.gms.internal.ads.aqv r1 = com.google.android.gms.internal.ads.aqv.m3507a()
            throw r1
        L_0x00a3:
            if (r6 != 0) goto L_0x0432
            com.google.android.gms.internal.ads.arj r11 = (com.google.android.gms.internal.ads.arj) r11
            int r1 = com.google.android.gms.internal.ads.aoy.m2962b(r3, r4, r7)
            long r8 = r7.f2156b
            long r8 = com.google.android.gms.internal.ads.apo.m3030a((long) r8)
            r11.mo11062a((long) r8)
        L_0x00b4:
            if (r1 >= r5) goto L_0x0433
            int r4 = com.google.android.gms.internal.ads.aoy.m2960a(r3, r1, r7)
            int r6 = r7.f2155a
            if (r2 != r6) goto L_0x0433
            int r1 = com.google.android.gms.internal.ads.aoy.m2962b(r3, r4, r7)
            long r8 = r7.f2156b
            long r8 = com.google.android.gms.internal.ads.apo.m3030a((long) r8)
            r11.mo11062a((long) r8)
            goto L_0x00b4
        L_0x00cc:
            if (r6 != r10) goto L_0x00f0
            com.google.android.gms.internal.ads.aqo r11 = (com.google.android.gms.internal.ads.aqo) r11
            int r1 = com.google.android.gms.internal.ads.aoy.m2960a(r3, r4, r7)
            int r2 = r7.f2155a
            int r2 = r2 + r1
        L_0x00d7:
            if (r1 >= r2) goto L_0x00e7
            int r1 = com.google.android.gms.internal.ads.aoy.m2960a(r3, r1, r7)
            int r4 = r7.f2155a
            int r4 = com.google.android.gms.internal.ads.apo.m3033g(r4)
            r11.mo11033c(r4)
            goto L_0x00d7
        L_0x00e7:
            if (r1 != r2) goto L_0x00eb
            goto L_0x0433
        L_0x00eb:
            com.google.android.gms.internal.ads.aqv r1 = com.google.android.gms.internal.ads.aqv.m3507a()
            throw r1
        L_0x00f0:
            if (r6 != 0) goto L_0x0432
            com.google.android.gms.internal.ads.aqo r11 = (com.google.android.gms.internal.ads.aqo) r11
            int r1 = com.google.android.gms.internal.ads.aoy.m2960a(r3, r4, r7)
            int r4 = r7.f2155a
            int r4 = com.google.android.gms.internal.ads.apo.m3033g(r4)
            r11.mo11033c(r4)
        L_0x0101:
            if (r1 >= r5) goto L_0x0433
            int r4 = com.google.android.gms.internal.ads.aoy.m2960a(r3, r1, r7)
            int r6 = r7.f2155a
            if (r2 != r6) goto L_0x0433
            int r1 = com.google.android.gms.internal.ads.aoy.m2960a(r3, r4, r7)
            int r4 = r7.f2155a
            int r4 = com.google.android.gms.internal.ads.apo.m3033g(r4)
            r11.mo11033c(r4)
            goto L_0x0101
        L_0x0119:
            if (r6 != r10) goto L_0x0120
            int r2 = com.google.android.gms.internal.ads.aoy.m2961a((byte[]) r3, (int) r4, (com.google.android.gms.internal.ads.aqu<?>) r11, (com.google.android.gms.internal.ads.aoz) r7)
            goto L_0x0131
        L_0x0120:
            if (r6 != 0) goto L_0x0432
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r11
            r7 = r30
            int r2 = com.google.android.gms.internal.ads.aoy.m2956a((int) r2, (byte[]) r3, (int) r4, (int) r5, (com.google.android.gms.internal.ads.aqu<?>) r6, (com.google.android.gms.internal.ads.aoz) r7)
        L_0x0131:
            com.google.android.gms.internal.ads.aqn r1 = (com.google.android.gms.internal.ads.aqn) r1
            com.google.android.gms.internal.ads.ath r3 = r1.zzfpu
            com.google.android.gms.internal.ads.ath r4 = com.google.android.gms.internal.ads.ath.m3874a()
            if (r3 != r4) goto L_0x013c
            r3 = 0
        L_0x013c:
            com.google.android.gms.internal.ads.aqs r4 = r0.m3659c((int) r8)
            com.google.android.gms.internal.ads.atg<?, ?> r5 = r0.f2418q
            r6 = r22
            java.lang.Object r3 = com.google.android.gms.internal.ads.asq.m3772a(r6, r11, r4, r3, r5)
            com.google.android.gms.internal.ads.ath r3 = (com.google.android.gms.internal.ads.ath) r3
            if (r3 == 0) goto L_0x014e
            r1.zzfpu = r3
        L_0x014e:
            r1 = r2
            goto L_0x0433
        L_0x0151:
            if (r6 != r10) goto L_0x0432
            int r1 = com.google.android.gms.internal.ads.aoy.m2960a(r3, r4, r7)
            int r4 = r7.f2155a
            if (r4 < 0) goto L_0x01a5
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x01a0
            if (r4 != 0) goto L_0x0167
            com.google.android.gms.internal.ads.apc r4 = com.google.android.gms.internal.ads.apc.f2174a
            r11.add(r4)
            goto L_0x016f
        L_0x0167:
            com.google.android.gms.internal.ads.apc r6 = com.google.android.gms.internal.ads.apc.m2987a((byte[]) r3, (int) r1, (int) r4)
            r11.add(r6)
            int r1 = r1 + r4
        L_0x016f:
            if (r1 >= r5) goto L_0x0433
            int r4 = com.google.android.gms.internal.ads.aoy.m2960a(r3, r1, r7)
            int r6 = r7.f2155a
            if (r2 != r6) goto L_0x0433
            int r1 = com.google.android.gms.internal.ads.aoy.m2960a(r3, r4, r7)
            int r4 = r7.f2155a
            if (r4 < 0) goto L_0x019b
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0196
            if (r4 != 0) goto L_0x018d
            com.google.android.gms.internal.ads.apc r4 = com.google.android.gms.internal.ads.apc.f2174a
            r11.add(r4)
            goto L_0x016f
        L_0x018d:
            com.google.android.gms.internal.ads.apc r6 = com.google.android.gms.internal.ads.apc.m2987a((byte[]) r3, (int) r1, (int) r4)
            r11.add(r6)
            int r1 = r1 + r4
            goto L_0x016f
        L_0x0196:
            com.google.android.gms.internal.ads.aqv r1 = com.google.android.gms.internal.ads.aqv.m3507a()
            throw r1
        L_0x019b:
            com.google.android.gms.internal.ads.aqv r1 = com.google.android.gms.internal.ads.aqv.m3508b()
            throw r1
        L_0x01a0:
            com.google.android.gms.internal.ads.aqv r1 = com.google.android.gms.internal.ads.aqv.m3507a()
            throw r1
        L_0x01a5:
            com.google.android.gms.internal.ads.aqv r1 = com.google.android.gms.internal.ads.aqv.m3508b()
            throw r1
        L_0x01aa:
            if (r6 != r10) goto L_0x0432
            com.google.android.gms.internal.ads.aso r1 = r0.m3637a((int) r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r11
            r28 = r30
            int r1 = m3627a((com.google.android.gms.internal.ads.aso<?>) r22, (int) r23, (byte[]) r24, (int) r25, (int) r26, (com.google.android.gms.internal.ads.aqu<?>) r27, (com.google.android.gms.internal.ads.aoz) r28)
            goto L_0x0433
        L_0x01c4:
            if (r6 != r10) goto L_0x0432
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            int r1 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r1 != 0) goto L_0x021a
            int r1 = com.google.android.gms.internal.ads.aoy.m2960a(r3, r4, r7)
            int r4 = r7.f2155a
            if (r4 < 0) goto L_0x0215
            if (r4 != 0) goto L_0x01df
            java.lang.String r4 = ""
            r11.add(r4)
            goto L_0x01ea
        L_0x01df:
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r8 = com.google.android.gms.internal.ads.aqp.f2347a
            r6.<init>(r3, r1, r4, r8)
            r11.add(r6)
            int r1 = r1 + r4
        L_0x01ea:
            if (r1 >= r5) goto L_0x0433
            int r4 = com.google.android.gms.internal.ads.aoy.m2960a(r3, r1, r7)
            int r6 = r7.f2155a
            if (r2 != r6) goto L_0x0433
            int r1 = com.google.android.gms.internal.ads.aoy.m2960a(r3, r4, r7)
            int r4 = r7.f2155a
            if (r4 < 0) goto L_0x0210
            if (r4 != 0) goto L_0x0204
            java.lang.String r4 = ""
            r11.add(r4)
            goto L_0x01ea
        L_0x0204:
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r8 = com.google.android.gms.internal.ads.aqp.f2347a
            r6.<init>(r3, r1, r4, r8)
            r11.add(r6)
            int r1 = r1 + r4
            goto L_0x01ea
        L_0x0210:
            com.google.android.gms.internal.ads.aqv r1 = com.google.android.gms.internal.ads.aqv.m3508b()
            throw r1
        L_0x0215:
            com.google.android.gms.internal.ads.aqv r1 = com.google.android.gms.internal.ads.aqv.m3508b()
            throw r1
        L_0x021a:
            int r1 = com.google.android.gms.internal.ads.aoy.m2960a(r3, r4, r7)
            int r4 = r7.f2155a
            if (r4 < 0) goto L_0x0279
            if (r4 != 0) goto L_0x022a
            java.lang.String r4 = ""
            r11.add(r4)
            goto L_0x023d
        L_0x022a:
            int r6 = r1 + r4
            boolean r8 = com.google.android.gms.internal.ads.atp.m4007a((byte[]) r3, (int) r1, (int) r6)
            if (r8 == 0) goto L_0x0274
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.ads.aqp.f2347a
            r8.<init>(r3, r1, r4, r9)
            r11.add(r8)
        L_0x023c:
            r1 = r6
        L_0x023d:
            if (r1 >= r5) goto L_0x0433
            int r4 = com.google.android.gms.internal.ads.aoy.m2960a(r3, r1, r7)
            int r6 = r7.f2155a
            if (r2 != r6) goto L_0x0433
            int r1 = com.google.android.gms.internal.ads.aoy.m2960a(r3, r4, r7)
            int r4 = r7.f2155a
            if (r4 < 0) goto L_0x026f
            if (r4 != 0) goto L_0x0257
            java.lang.String r4 = ""
            r11.add(r4)
            goto L_0x023d
        L_0x0257:
            int r6 = r1 + r4
            boolean r8 = com.google.android.gms.internal.ads.atp.m4007a((byte[]) r3, (int) r1, (int) r6)
            if (r8 == 0) goto L_0x026a
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.ads.aqp.f2347a
            r8.<init>(r3, r1, r4, r9)
            r11.add(r8)
            goto L_0x023c
        L_0x026a:
            com.google.android.gms.internal.ads.aqv r1 = com.google.android.gms.internal.ads.aqv.m3515i()
            throw r1
        L_0x026f:
            com.google.android.gms.internal.ads.aqv r1 = com.google.android.gms.internal.ads.aqv.m3508b()
            throw r1
        L_0x0274:
            com.google.android.gms.internal.ads.aqv r1 = com.google.android.gms.internal.ads.aqv.m3515i()
            throw r1
        L_0x0279:
            com.google.android.gms.internal.ads.aqv r1 = com.google.android.gms.internal.ads.aqv.m3508b()
            throw r1
        L_0x027e:
            r1 = 0
            if (r6 != r10) goto L_0x02a6
            com.google.android.gms.internal.ads.apa r11 = (com.google.android.gms.internal.ads.apa) r11
            int r2 = com.google.android.gms.internal.ads.aoy.m2960a(r3, r4, r7)
            int r4 = r7.f2155a
            int r4 = r4 + r2
        L_0x028a:
            if (r2 >= r4) goto L_0x029d
            int r2 = com.google.android.gms.internal.ads.aoy.m2962b(r3, r2, r7)
            long r5 = r7.f2156b
            int r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x0298
            r5 = 1
            goto L_0x0299
        L_0x0298:
            r5 = 0
        L_0x0299:
            r11.mo10786a((boolean) r5)
            goto L_0x028a
        L_0x029d:
            if (r2 != r4) goto L_0x02a1
            goto L_0x014e
        L_0x02a1:
            com.google.android.gms.internal.ads.aqv r1 = com.google.android.gms.internal.ads.aqv.m3507a()
            throw r1
        L_0x02a6:
            if (r6 != 0) goto L_0x0432
            com.google.android.gms.internal.ads.apa r11 = (com.google.android.gms.internal.ads.apa) r11
            int r4 = com.google.android.gms.internal.ads.aoy.m2962b(r3, r4, r7)
            long r8 = r7.f2156b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x02b6
            r6 = 1
            goto L_0x02b7
        L_0x02b6:
            r6 = 0
        L_0x02b7:
            r11.mo10786a((boolean) r6)
        L_0x02ba:
            if (r4 >= r5) goto L_0x0432
            int r6 = com.google.android.gms.internal.ads.aoy.m2960a(r3, r4, r7)
            int r8 = r7.f2155a
            if (r2 != r8) goto L_0x0432
            int r4 = com.google.android.gms.internal.ads.aoy.m2962b(r3, r6, r7)
            long r8 = r7.f2156b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x02d0
            r6 = 1
            goto L_0x02d1
        L_0x02d0:
            r6 = 0
        L_0x02d1:
            r11.mo10786a((boolean) r6)
            goto L_0x02ba
        L_0x02d5:
            if (r6 != r10) goto L_0x02f5
            com.google.android.gms.internal.ads.aqo r11 = (com.google.android.gms.internal.ads.aqo) r11
            int r1 = com.google.android.gms.internal.ads.aoy.m2960a(r3, r4, r7)
            int r2 = r7.f2155a
            int r2 = r2 + r1
        L_0x02e0:
            if (r1 >= r2) goto L_0x02ec
            int r4 = com.google.android.gms.internal.ads.aoy.m2959a(r3, r1)
            r11.mo11033c(r4)
            int r1 = r1 + 4
            goto L_0x02e0
        L_0x02ec:
            if (r1 != r2) goto L_0x02f0
            goto L_0x0433
        L_0x02f0:
            com.google.android.gms.internal.ads.aqv r1 = com.google.android.gms.internal.ads.aqv.m3507a()
            throw r1
        L_0x02f5:
            if (r6 != r9) goto L_0x0432
            com.google.android.gms.internal.ads.aqo r11 = (com.google.android.gms.internal.ads.aqo) r11
            int r1 = com.google.android.gms.internal.ads.aoy.m2959a(r18, r19)
            r11.mo11033c(r1)
            int r1 = r4 + 4
        L_0x0302:
            if (r1 >= r5) goto L_0x0433
            int r4 = com.google.android.gms.internal.ads.aoy.m2960a(r3, r1, r7)
            int r6 = r7.f2155a
            if (r2 != r6) goto L_0x0433
            int r1 = com.google.android.gms.internal.ads.aoy.m2959a(r3, r4)
            r11.mo11033c(r1)
            int r1 = r4 + 4
            goto L_0x0302
        L_0x0316:
            if (r6 != r10) goto L_0x0336
            com.google.android.gms.internal.ads.arj r11 = (com.google.android.gms.internal.ads.arj) r11
            int r1 = com.google.android.gms.internal.ads.aoy.m2960a(r3, r4, r7)
            int r2 = r7.f2155a
            int r2 = r2 + r1
        L_0x0321:
            if (r1 >= r2) goto L_0x032d
            long r4 = com.google.android.gms.internal.ads.aoy.m2963b(r3, r1)
            r11.mo11062a((long) r4)
            int r1 = r1 + 8
            goto L_0x0321
        L_0x032d:
            if (r1 != r2) goto L_0x0331
            goto L_0x0433
        L_0x0331:
            com.google.android.gms.internal.ads.aqv r1 = com.google.android.gms.internal.ads.aqv.m3507a()
            throw r1
        L_0x0336:
            if (r6 != r13) goto L_0x0432
            com.google.android.gms.internal.ads.arj r11 = (com.google.android.gms.internal.ads.arj) r11
            long r8 = com.google.android.gms.internal.ads.aoy.m2963b(r18, r19)
            r11.mo11062a((long) r8)
            int r1 = r4 + 8
        L_0x0343:
            if (r1 >= r5) goto L_0x0433
            int r4 = com.google.android.gms.internal.ads.aoy.m2960a(r3, r1, r7)
            int r6 = r7.f2155a
            if (r2 != r6) goto L_0x0433
            long r8 = com.google.android.gms.internal.ads.aoy.m2963b(r3, r4)
            r11.mo11062a((long) r8)
            int r1 = r4 + 8
            goto L_0x0343
        L_0x0357:
            if (r6 != r10) goto L_0x035f
            int r1 = com.google.android.gms.internal.ads.aoy.m2961a((byte[]) r3, (int) r4, (com.google.android.gms.internal.ads.aqu<?>) r11, (com.google.android.gms.internal.ads.aoz) r7)
            goto L_0x0433
        L_0x035f:
            if (r6 != 0) goto L_0x0432
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r11
            r26 = r30
            int r1 = com.google.android.gms.internal.ads.aoy.m2956a((int) r21, (byte[]) r22, (int) r23, (int) r24, (com.google.android.gms.internal.ads.aqu<?>) r25, (com.google.android.gms.internal.ads.aoz) r26)
            goto L_0x0433
        L_0x0371:
            if (r6 != r10) goto L_0x0391
            com.google.android.gms.internal.ads.arj r11 = (com.google.android.gms.internal.ads.arj) r11
            int r1 = com.google.android.gms.internal.ads.aoy.m2960a(r3, r4, r7)
            int r2 = r7.f2155a
            int r2 = r2 + r1
        L_0x037c:
            if (r1 >= r2) goto L_0x0388
            int r1 = com.google.android.gms.internal.ads.aoy.m2962b(r3, r1, r7)
            long r4 = r7.f2156b
            r11.mo11062a((long) r4)
            goto L_0x037c
        L_0x0388:
            if (r1 != r2) goto L_0x038c
            goto L_0x0433
        L_0x038c:
            com.google.android.gms.internal.ads.aqv r1 = com.google.android.gms.internal.ads.aqv.m3507a()
            throw r1
        L_0x0391:
            if (r6 != 0) goto L_0x0432
            com.google.android.gms.internal.ads.arj r11 = (com.google.android.gms.internal.ads.arj) r11
            int r1 = com.google.android.gms.internal.ads.aoy.m2962b(r3, r4, r7)
            long r8 = r7.f2156b
            r11.mo11062a((long) r8)
        L_0x039e:
            if (r1 >= r5) goto L_0x0433
            int r4 = com.google.android.gms.internal.ads.aoy.m2960a(r3, r1, r7)
            int r6 = r7.f2155a
            if (r2 != r6) goto L_0x0433
            int r1 = com.google.android.gms.internal.ads.aoy.m2962b(r3, r4, r7)
            long r8 = r7.f2156b
            r11.mo11062a((long) r8)
            goto L_0x039e
        L_0x03b2:
            if (r6 != r10) goto L_0x03d1
            com.google.android.gms.internal.ads.aqk r11 = (com.google.android.gms.internal.ads.aqk) r11
            int r1 = com.google.android.gms.internal.ads.aoy.m2960a(r3, r4, r7)
            int r2 = r7.f2155a
            int r2 = r2 + r1
        L_0x03bd:
            if (r1 >= r2) goto L_0x03c9
            float r4 = com.google.android.gms.internal.ads.aoy.m2966d(r3, r1)
            r11.mo11009a((float) r4)
            int r1 = r1 + 4
            goto L_0x03bd
        L_0x03c9:
            if (r1 != r2) goto L_0x03cc
            goto L_0x0433
        L_0x03cc:
            com.google.android.gms.internal.ads.aqv r1 = com.google.android.gms.internal.ads.aqv.m3507a()
            throw r1
        L_0x03d1:
            if (r6 != r9) goto L_0x0432
            com.google.android.gms.internal.ads.aqk r11 = (com.google.android.gms.internal.ads.aqk) r11
            float r1 = com.google.android.gms.internal.ads.aoy.m2966d(r18, r19)
            r11.mo11009a((float) r1)
            int r1 = r4 + 4
        L_0x03de:
            if (r1 >= r5) goto L_0x0433
            int r4 = com.google.android.gms.internal.ads.aoy.m2960a(r3, r1, r7)
            int r6 = r7.f2155a
            if (r2 != r6) goto L_0x0433
            float r1 = com.google.android.gms.internal.ads.aoy.m2966d(r3, r4)
            r11.mo11009a((float) r1)
            int r1 = r4 + 4
            goto L_0x03de
        L_0x03f2:
            if (r6 != r10) goto L_0x0411
            com.google.android.gms.internal.ads.apw r11 = (com.google.android.gms.internal.ads.apw) r11
            int r1 = com.google.android.gms.internal.ads.aoy.m2960a(r3, r4, r7)
            int r2 = r7.f2155a
            int r2 = r2 + r1
        L_0x03fd:
            if (r1 >= r2) goto L_0x0409
            double r4 = com.google.android.gms.internal.ads.aoy.m2964c(r3, r1)
            r11.mo10967a((double) r4)
            int r1 = r1 + 8
            goto L_0x03fd
        L_0x0409:
            if (r1 != r2) goto L_0x040c
            goto L_0x0433
        L_0x040c:
            com.google.android.gms.internal.ads.aqv r1 = com.google.android.gms.internal.ads.aqv.m3507a()
            throw r1
        L_0x0411:
            if (r6 != r13) goto L_0x0432
            com.google.android.gms.internal.ads.apw r11 = (com.google.android.gms.internal.ads.apw) r11
            double r8 = com.google.android.gms.internal.ads.aoy.m2964c(r18, r19)
            r11.mo10967a((double) r8)
            int r1 = r4 + 8
        L_0x041e:
            if (r1 >= r5) goto L_0x0433
            int r4 = com.google.android.gms.internal.ads.aoy.m2960a(r3, r1, r7)
            int r6 = r7.f2155a
            if (r2 != r6) goto L_0x0433
            double r8 = com.google.android.gms.internal.ads.aoy.m2964c(r3, r4)
            r11.mo10967a((double) r8)
            int r1 = r4 + 8
            goto L_0x041e
        L_0x0432:
            r1 = r4
        L_0x0433:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.asa.m3632a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.ads.aoz):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: byte} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <K, V> int m3633a(T r8, byte[] r9, int r10, int r11, int r12, long r13, com.google.android.gms.internal.ads.aoz r15) {
        /*
            r7 = this;
            sun.misc.Unsafe r0 = f2403b
            java.lang.Object r12 = r7.m3653b((int) r12)
            java.lang.Object r1 = r0.getObject(r8, r13)
            com.google.android.gms.internal.ads.arr r2 = r7.f2420s
            boolean r2 = r2.mo11083c(r1)
            if (r2 == 0) goto L_0x0021
            com.google.android.gms.internal.ads.arr r2 = r7.f2420s
            java.lang.Object r2 = r2.mo11085e(r12)
            com.google.android.gms.internal.ads.arr r3 = r7.f2420s
            r3.mo11080a(r2, r1)
            r0.putObject(r8, r13, r2)
            r1 = r2
        L_0x0021:
            com.google.android.gms.internal.ads.arr r8 = r7.f2420s
            com.google.android.gms.internal.ads.arp r8 = r8.mo11086f(r12)
            com.google.android.gms.internal.ads.arr r12 = r7.f2420s
            java.util.Map r12 = r12.mo11081a(r1)
            int r10 = com.google.android.gms.internal.ads.aoy.m2960a(r9, r10, r15)
            int r13 = r15.f2155a
            if (r13 < 0) goto L_0x0094
            int r14 = r11 - r10
            if (r13 > r14) goto L_0x0094
            int r13 = r13 + r10
            K r14 = r8.f2391b
            V r0 = r8.f2393d
        L_0x003e:
            if (r10 >= r13) goto L_0x0089
            int r1 = r10 + 1
            byte r10 = r9[r10]
            if (r10 >= 0) goto L_0x004c
            int r1 = com.google.android.gms.internal.ads.aoy.m2958a((int) r10, (byte[]) r9, (int) r1, (com.google.android.gms.internal.ads.aoz) r15)
            int r10 = r15.f2155a
        L_0x004c:
            r2 = r1
            int r1 = r10 >>> 3
            r3 = r10 & 7
            switch(r1) {
                case 1: goto L_0x006f;
                case 2: goto L_0x0055;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x0084
        L_0x0055:
            com.google.android.gms.internal.ads.atw r1 = r8.f2392c
            int r1 = r1.mo11231b()
            if (r3 != r1) goto L_0x0084
            com.google.android.gms.internal.ads.atw r4 = r8.f2392c
            V r10 = r8.f2393d
            java.lang.Class r5 = r10.getClass()
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = m3635a((byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.ads.atw) r4, (java.lang.Class<?>) r5, (com.google.android.gms.internal.ads.aoz) r6)
            java.lang.Object r0 = r15.f2157c
            goto L_0x003e
        L_0x006f:
            com.google.android.gms.internal.ads.atw r1 = r8.f2390a
            int r1 = r1.mo11231b()
            if (r3 != r1) goto L_0x0084
            com.google.android.gms.internal.ads.atw r4 = r8.f2390a
            r5 = 0
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = m3635a((byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.ads.atw) r4, (java.lang.Class<?>) r5, (com.google.android.gms.internal.ads.aoz) r6)
            java.lang.Object r14 = r15.f2157c
            goto L_0x003e
        L_0x0084:
            int r10 = com.google.android.gms.internal.ads.aoy.m2955a(r10, r9, r2, r11, r15)
            goto L_0x003e
        L_0x0089:
            if (r10 != r13) goto L_0x008f
            r12.put(r14, r0)
            return r13
        L_0x008f:
            com.google.android.gms.internal.ads.aqv r8 = com.google.android.gms.internal.ads.aqv.m3514h()
            throw r8
        L_0x0094:
            com.google.android.gms.internal.ads.aqv r8 = com.google.android.gms.internal.ads.aqv.m3507a()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.asa.m3633a(java.lang.Object, byte[], int, int, int, long, com.google.android.gms.internal.ads.aoz):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a1, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m3631a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.ads.aoz r29) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = f2403b
            int[] r7 = r0.f2404c
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x0191;
                case 52: goto L_0x0181;
                case 53: goto L_0x0171;
                case 54: goto L_0x0171;
                case 55: goto L_0x0161;
                case 56: goto L_0x0150;
                case 57: goto L_0x0140;
                case 58: goto L_0x0127;
                case 59: goto L_0x00f3;
                case 60: goto L_0x00c5;
                case 61: goto L_0x00b8;
                case 62: goto L_0x0161;
                case 63: goto L_0x008a;
                case 64: goto L_0x0140;
                case 65: goto L_0x0150;
                case 66: goto L_0x0075;
                case 67: goto L_0x0060;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x01a5
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x01a5
            r2 = r2 & -8
            r7 = r2 | 4
            com.google.android.gms.internal.ads.aso r2 = r0.m3637a((int) r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = m3628a((com.google.android.gms.internal.ads.aso) r2, (byte[]) r3, (int) r4, (int) r5, (int) r6, (com.google.android.gms.internal.ads.aoz) r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            if (r15 != 0) goto L_0x0055
            java.lang.Object r3 = r11.f2157c
            r12.putObject(r1, r9, r3)
            goto L_0x01a1
        L_0x0055:
            java.lang.Object r3 = r11.f2157c
            java.lang.Object r3 = com.google.android.gms.internal.ads.aqp.m3496a((java.lang.Object) r15, (java.lang.Object) r3)
            r12.putObject(r1, r9, r3)
            goto L_0x01a1
        L_0x0060:
            if (r5 != 0) goto L_0x01a5
            int r2 = com.google.android.gms.internal.ads.aoy.m2962b(r3, r4, r11)
            long r3 = r11.f2156b
            long r3 = com.google.android.gms.internal.ads.apo.m3030a((long) r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x01a1
        L_0x0075:
            if (r5 != 0) goto L_0x01a5
            int r2 = com.google.android.gms.internal.ads.aoy.m2960a(r3, r4, r11)
            int r3 = r11.f2155a
            int r3 = com.google.android.gms.internal.ads.apo.m3033g(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x01a1
        L_0x008a:
            if (r5 != 0) goto L_0x01a5
            int r3 = com.google.android.gms.internal.ads.aoy.m2960a(r3, r4, r11)
            int r4 = r11.f2155a
            com.google.android.gms.internal.ads.aqs r5 = r0.m3659c((int) r6)
            if (r5 == 0) goto L_0x00ae
            boolean r5 = r5.mo11037a(r4)
            if (r5 == 0) goto L_0x009f
            goto L_0x00ae
        L_0x009f:
            com.google.android.gms.internal.ads.ath r1 = m3665e((java.lang.Object) r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.mo11185a((int) r2, (java.lang.Object) r4)
            r2 = r3
            goto L_0x01a6
        L_0x00ae:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x01a1
        L_0x00b8:
            if (r5 != r15) goto L_0x01a5
            int r2 = com.google.android.gms.internal.ads.aoy.m2968e(r3, r4, r11)
            java.lang.Object r3 = r11.f2157c
            r12.putObject(r1, r9, r3)
            goto L_0x01a1
        L_0x00c5:
            if (r5 != r15) goto L_0x01a5
            com.google.android.gms.internal.ads.aso r2 = r0.m3637a((int) r6)
            r5 = r20
            int r2 = m3629a((com.google.android.gms.internal.ads.aso) r2, (byte[]) r3, (int) r4, (int) r5, (com.google.android.gms.internal.ads.aoz) r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00dc
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00dd
        L_0x00dc:
            r15 = 0
        L_0x00dd:
            if (r15 != 0) goto L_0x00e5
            java.lang.Object r3 = r11.f2157c
            r12.putObject(r1, r9, r3)
            goto L_0x00ee
        L_0x00e5:
            java.lang.Object r3 = r11.f2157c
            java.lang.Object r3 = com.google.android.gms.internal.ads.aqp.m3496a((java.lang.Object) r15, (java.lang.Object) r3)
            r12.putObject(r1, r9, r3)
        L_0x00ee:
            r12.putInt(r1, r13, r8)
            goto L_0x01a6
        L_0x00f3:
            if (r5 != r15) goto L_0x01a5
            int r2 = com.google.android.gms.internal.ads.aoy.m2960a(r3, r4, r11)
            int r4 = r11.f2155a
            if (r4 != 0) goto L_0x0103
            java.lang.String r3 = ""
            r12.putObject(r1, r9, r3)
            goto L_0x0122
        L_0x0103:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x0117
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.ads.atp.m4007a((byte[]) r3, (int) r2, (int) r5)
            if (r5 == 0) goto L_0x0112
            goto L_0x0117
        L_0x0112:
            com.google.android.gms.internal.ads.aqv r1 = com.google.android.gms.internal.ads.aqv.m3515i()
            throw r1
        L_0x0117:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.android.gms.internal.ads.aqp.f2347a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        L_0x0122:
            r12.putInt(r1, r13, r8)
            goto L_0x01a6
        L_0x0127:
            if (r5 != 0) goto L_0x01a5
            int r2 = com.google.android.gms.internal.ads.aoy.m2962b(r3, r4, r11)
            long r3 = r11.f2156b
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0137
            r15 = 1
            goto L_0x0138
        L_0x0137:
            r15 = 0
        L_0x0138:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            r12.putObject(r1, r9, r3)
            goto L_0x01a1
        L_0x0140:
            if (r5 != r7) goto L_0x01a5
            int r2 = com.google.android.gms.internal.ads.aoy.m2959a(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 4
            goto L_0x01a1
        L_0x0150:
            r2 = 1
            if (r5 != r2) goto L_0x01a5
            long r2 = com.google.android.gms.internal.ads.aoy.m2963b(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 8
            goto L_0x01a1
        L_0x0161:
            if (r5 != 0) goto L_0x01a5
            int r2 = com.google.android.gms.internal.ads.aoy.m2960a(r3, r4, r11)
            int r3 = r11.f2155a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x01a1
        L_0x0171:
            if (r5 != 0) goto L_0x01a5
            int r2 = com.google.android.gms.internal.ads.aoy.m2962b(r3, r4, r11)
            long r3 = r11.f2156b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x01a1
        L_0x0181:
            if (r5 != r7) goto L_0x01a5
            float r2 = com.google.android.gms.internal.ads.aoy.m2966d(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 4
            goto L_0x01a1
        L_0x0191:
            r2 = 1
            if (r5 != r2) goto L_0x01a5
            double r2 = com.google.android.gms.internal.ads.aoy.m2964c(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 8
        L_0x01a1:
            r12.putInt(r1, r13, r8)
            goto L_0x01a6
        L_0x01a5:
            r2 = r4
        L_0x01a6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.asa.m3631a(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.ads.aoz):int");
    }

    /* renamed from: a */
    private final aso m3637a(int i) {
        int i2 = (i / 3) << 1;
        aso aso = (aso) this.f2405d[i2];
        if (aso != null) {
            return aso;
        }
        aso a = asj.m3697a().mo11112a((Class) this.f2405d[i2 + 1]);
        this.f2405d[i2] = a;
        return a;
    }

    /* renamed from: b */
    private final Object m3653b(int i) {
        return this.f2405d[(i / 3) << 1];
    }

    /* renamed from: c */
    private final aqs m3659c(int i) {
        return (aqs) this.f2405d[((i / 3) << 1) + 1];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02bb, code lost:
        r20 = r6;
        r25 = r7;
        r19 = r8;
        r28 = r10;
        r2 = r11;
        r7 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x035a, code lost:
        if (r0 == r15) goto L_0x035c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x035e, code lost:
        r12 = r32;
        r9 = r36;
        r1 = r17;
        r2 = r19;
        r6 = r20;
        r7 = r25;
        r10 = r28;
        r3 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x039f, code lost:
        if (r0 == r15) goto L_0x035c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009a, code lost:
        r12 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0174, code lost:
        r11 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0215, code lost:
        r6 = r6 | r22;
        r2 = r8;
        r3 = r13;
        r1 = r17;
        r13 = r11;
        r11 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0241, code lost:
        r11 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x027a, code lost:
        r2 = r8;
        r0 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02b1, code lost:
        r2 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02b2, code lost:
        r3 = r13;
        r1 = r17;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m3634a(T r31, byte[] r32, int r33, int r34, int r35, com.google.android.gms.internal.ads.aoz r36) {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r9 = r36
            sun.misc.Unsafe r10 = f2403b
            r16 = 0
            r0 = r33
            r1 = -1
            r2 = 0
            r3 = 0
            r6 = 0
            r7 = -1
        L_0x0017:
            if (r0 >= r13) goto L_0x0404
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0028
            int r0 = com.google.android.gms.internal.ads.aoy.m2958a((int) r0, (byte[]) r12, (int) r3, (com.google.android.gms.internal.ads.aoz) r9)
            int r3 = r9.f2155a
            r4 = r0
            r5 = r3
            goto L_0x002a
        L_0x0028:
            r5 = r0
            r4 = r3
        L_0x002a:
            int r3 = r5 >>> 3
            r0 = r5 & 7
            r8 = 3
            if (r3 <= r1) goto L_0x0039
            int r2 = r2 / r8
            int r1 = r15.m3625a((int) r3, (int) r2)
        L_0x0036:
            r2 = r1
            r1 = -1
            goto L_0x003e
        L_0x0039:
            int r1 = r15.m3668g(r3)
            goto L_0x0036
        L_0x003e:
            if (r2 != r1) goto L_0x004f
            r17 = r3
            r2 = r4
            r20 = r6
            r25 = r7
            r28 = r10
            r6 = r11
            r19 = 0
            r7 = r5
            goto L_0x03c5
        L_0x004f:
            int[] r1 = r15.f2404c
            int r18 = r2 + 1
            r1 = r1[r18]
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r1 & r18
            int r8 = r18 >>> 20
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r5
            r5 = r1 & r18
            long r11 = (long) r5
            r5 = 17
            r21 = r1
            if (r8 > r5) goto L_0x02c7
            int[] r5 = r15.f2404c
            int r22 = r2 + 2
            r5 = r5[r22]
            int r22 = r5 >>> 20
            r1 = 1
            int r22 = r1 << r22
            r5 = r5 & r18
            if (r5 == r7) goto L_0x008c
            r13 = -1
            if (r7 == r13) goto L_0x0082
            r24 = r2
            long r1 = (long) r7
            r10.putInt(r14, r1, r6)
            goto L_0x0084
        L_0x0082:
            r24 = r2
        L_0x0084:
            long r1 = (long) r5
            int r1 = r10.getInt(r14, r1)
            r6 = r1
            r7 = r5
            goto L_0x008f
        L_0x008c:
            r24 = r2
            r13 = -1
        L_0x008f:
            r1 = 5
            switch(r8) {
                case 0: goto L_0x0297;
                case 1: goto L_0x027d;
                case 2: goto L_0x025e;
                case 3: goto L_0x025e;
                case 4: goto L_0x0244;
                case 5: goto L_0x021e;
                case 6: goto L_0x01fb;
                case 7: goto L_0x01d7;
                case 8: goto L_0x01b0;
                case 9: goto L_0x0177;
                case 10: goto L_0x015b;
                case 11: goto L_0x0244;
                case 12: goto L_0x0128;
                case 13: goto L_0x01fb;
                case 14: goto L_0x021e;
                case 15: goto L_0x010c;
                case 16: goto L_0x00e9;
                case 17: goto L_0x00a0;
                default: goto L_0x0093;
            }
        L_0x0093:
            r17 = r3
            r11 = r4
            r13 = r20
            r8 = r24
        L_0x009a:
            r12 = r32
        L_0x009c:
            r18 = -1
            goto L_0x02bb
        L_0x00a0:
            r2 = 3
            if (r0 != r2) goto L_0x00e1
            int r0 = r3 << 3
            r5 = r0 | 4
            r2 = r24
            com.google.android.gms.internal.ads.aso r0 = r15.m3637a((int) r2)
            r1 = r32
            r8 = r2
            r2 = r4
            r17 = r3
            r3 = r34
            r4 = r5
            r13 = r20
            r5 = r36
            int r0 = m3628a((com.google.android.gms.internal.ads.aso) r0, (byte[]) r1, (int) r2, (int) r3, (int) r4, (com.google.android.gms.internal.ads.aoz) r5)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x00c8
            java.lang.Object r1 = r9.f2157c
            r10.putObject(r14, r11, r1)
            goto L_0x00d5
        L_0x00c8:
            java.lang.Object r1 = r10.getObject(r14, r11)
            java.lang.Object r2 = r9.f2157c
            java.lang.Object r1 = com.google.android.gms.internal.ads.aqp.m3496a((java.lang.Object) r1, (java.lang.Object) r2)
            r10.putObject(r14, r11, r1)
        L_0x00d5:
            r6 = r6 | r22
            r2 = r8
            r3 = r13
            r1 = r17
            r11 = r35
            r12 = r32
            goto L_0x02b7
        L_0x00e1:
            r17 = r3
            r13 = r20
            r8 = r24
            r11 = r4
            goto L_0x009a
        L_0x00e9:
            r17 = r3
            r13 = r20
            r8 = r24
            if (r0 != 0) goto L_0x0108
            r2 = r11
            r12 = r32
            int r11 = com.google.android.gms.internal.ads.aoy.m2962b(r12, r4, r9)
            long r0 = r9.f2156b
            long r4 = com.google.android.gms.internal.ads.apo.m3030a((long) r0)
            r0 = r10
            r1 = r31
            r0.putLong(r1, r2, r4)
            r6 = r6 | r22
            goto L_0x027a
        L_0x0108:
            r12 = r32
            goto L_0x0174
        L_0x010c:
            r17 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r12 = r32
            if (r0 != 0) goto L_0x0174
            int r0 = com.google.android.gms.internal.ads.aoy.m2960a(r12, r4, r9)
            int r1 = r9.f2155a
            int r1 = com.google.android.gms.internal.ads.apo.m3033g(r1)
            r10.putInt(r14, r2, r1)
            r6 = r6 | r22
            goto L_0x02b1
        L_0x0128:
            r17 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r12 = r32
            if (r0 != 0) goto L_0x0174
            int r0 = com.google.android.gms.internal.ads.aoy.m2960a(r12, r4, r9)
            int r1 = r9.f2155a
            com.google.android.gms.internal.ads.aqs r4 = r15.m3659c((int) r8)
            if (r4 == 0) goto L_0x0154
            boolean r4 = r4.mo11037a(r1)
            if (r4 == 0) goto L_0x0146
            goto L_0x0154
        L_0x0146:
            com.google.android.gms.internal.ads.ath r2 = m3665e((java.lang.Object) r31)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo11185a((int) r13, (java.lang.Object) r1)
            goto L_0x02b1
        L_0x0154:
            r10.putInt(r14, r2, r1)
            r6 = r6 | r22
            goto L_0x02b1
        L_0x015b:
            r17 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r1 = 2
            r12 = r32
            if (r0 != r1) goto L_0x0174
            int r0 = com.google.android.gms.internal.ads.aoy.m2968e(r12, r4, r9)
            java.lang.Object r1 = r9.f2157c
            r10.putObject(r14, r2, r1)
            r6 = r6 | r22
            goto L_0x02b1
        L_0x0174:
            r11 = r4
            goto L_0x009c
        L_0x0177:
            r17 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r1 = 2
            r12 = r32
            if (r0 != r1) goto L_0x01aa
            com.google.android.gms.internal.ads.aso r0 = r15.m3637a((int) r8)
            r11 = r34
            r18 = -1
            int r0 = m3629a((com.google.android.gms.internal.ads.aso) r0, (byte[]) r12, (int) r4, (int) r11, (com.google.android.gms.internal.ads.aoz) r9)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x0199
            java.lang.Object r1 = r9.f2157c
            r10.putObject(r14, r2, r1)
            goto L_0x01a6
        L_0x0199:
            java.lang.Object r1 = r10.getObject(r14, r2)
            java.lang.Object r4 = r9.f2157c
            java.lang.Object r1 = com.google.android.gms.internal.ads.aqp.m3496a((java.lang.Object) r1, (java.lang.Object) r4)
            r10.putObject(r14, r2, r1)
        L_0x01a6:
            r6 = r6 | r22
            goto L_0x0215
        L_0x01aa:
            r11 = r34
            r18 = -1
            goto L_0x0241
        L_0x01b0:
            r17 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r1 = 2
            r11 = r34
            r12 = r32
            r18 = -1
            if (r0 != r1) goto L_0x0241
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x01cb
            int r0 = com.google.android.gms.internal.ads.aoy.m2965c(r12, r4, r9)
            goto L_0x01cf
        L_0x01cb:
            int r0 = com.google.android.gms.internal.ads.aoy.m2967d(r12, r4, r9)
        L_0x01cf:
            java.lang.Object r1 = r9.f2157c
            r10.putObject(r14, r2, r1)
            r6 = r6 | r22
            goto L_0x0215
        L_0x01d7:
            r17 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r11 = r34
            r12 = r32
            r18 = -1
            if (r0 != 0) goto L_0x0241
            int r0 = com.google.android.gms.internal.ads.aoy.m2962b(r12, r4, r9)
            long r4 = r9.f2156b
            r19 = 0
            int r1 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r1 == 0) goto L_0x01f4
            r1 = 1
            goto L_0x01f5
        L_0x01f4:
            r1 = 0
        L_0x01f5:
            com.google.android.gms.internal.ads.atn.m3923a((java.lang.Object) r14, (long) r2, (boolean) r1)
            r6 = r6 | r22
            goto L_0x0215
        L_0x01fb:
            r17 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r11 = r34
            r12 = r32
            r18 = -1
            if (r0 != r1) goto L_0x0241
            int r0 = com.google.android.gms.internal.ads.aoy.m2959a(r12, r4)
            r10.putInt(r14, r2, r0)
            int r0 = r4 + 4
            r6 = r6 | r22
        L_0x0215:
            r2 = r8
            r3 = r13
            r1 = r17
            r13 = r11
            r11 = r35
            goto L_0x0017
        L_0x021e:
            r17 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r1 = 1
            r11 = r34
            r12 = r32
            r18 = -1
            if (r0 != r1) goto L_0x0241
            long r19 = com.google.android.gms.internal.ads.aoy.m2963b(r12, r4)
            r0 = r10
            r1 = r31
            r11 = r4
            r4 = r19
            r0.putLong(r1, r2, r4)
            int r0 = r11 + 8
            r6 = r6 | r22
            goto L_0x02b1
        L_0x0241:
            r11 = r4
            goto L_0x02bb
        L_0x0244:
            r17 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r12 = r32
            r18 = -1
            r11 = r4
            if (r0 != 0) goto L_0x02bb
            int r0 = com.google.android.gms.internal.ads.aoy.m2960a(r12, r11, r9)
            int r1 = r9.f2155a
            r10.putInt(r14, r2, r1)
            r6 = r6 | r22
            goto L_0x02b1
        L_0x025e:
            r17 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r12 = r32
            r18 = -1
            r11 = r4
            if (r0 != 0) goto L_0x02bb
            int r11 = com.google.android.gms.internal.ads.aoy.m2962b(r12, r11, r9)
            long r4 = r9.f2156b
            r0 = r10
            r1 = r31
            r0.putLong(r1, r2, r4)
            r6 = r6 | r22
        L_0x027a:
            r2 = r8
            r0 = r11
            goto L_0x02b2
        L_0x027d:
            r17 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r12 = r32
            r18 = -1
            r11 = r4
            if (r0 != r1) goto L_0x02bb
            float r0 = com.google.android.gms.internal.ads.aoy.m2966d(r12, r11)
            com.google.android.gms.internal.ads.atn.m3919a((java.lang.Object) r14, (long) r2, (float) r0)
            int r0 = r11 + 4
            r6 = r6 | r22
            goto L_0x02b1
        L_0x0297:
            r17 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r1 = 1
            r12 = r32
            r18 = -1
            r11 = r4
            if (r0 != r1) goto L_0x02bb
            double r0 = com.google.android.gms.internal.ads.aoy.m2964c(r12, r11)
            com.google.android.gms.internal.ads.atn.m3918a((java.lang.Object) r14, (long) r2, (double) r0)
            int r0 = r11 + 8
            r6 = r6 | r22
        L_0x02b1:
            r2 = r8
        L_0x02b2:
            r3 = r13
            r1 = r17
        L_0x02b5:
            r11 = r35
        L_0x02b7:
            r13 = r34
            goto L_0x0017
        L_0x02bb:
            r20 = r6
            r25 = r7
            r19 = r8
            r28 = r10
            r2 = r11
            r7 = r13
            goto L_0x03a5
        L_0x02c7:
            r5 = r2
            r17 = r3
            r2 = r11
            r13 = r20
            r12 = r32
            r18 = -1
            r11 = r4
            r1 = 27
            if (r8 != r1) goto L_0x0322
            r1 = 2
            if (r0 != r1) goto L_0x0315
            java.lang.Object r0 = r10.getObject(r14, r2)
            com.google.android.gms.internal.ads.aqu r0 = (com.google.android.gms.internal.ads.aqu) r0
            boolean r1 = r0.mo10761a()
            if (r1 != 0) goto L_0x02f7
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02ee
            r1 = 10
            goto L_0x02f0
        L_0x02ee:
            int r1 = r1 << 1
        L_0x02f0:
            com.google.android.gms.internal.ads.aqu r0 = r0.mo10785a(r1)
            r10.putObject(r14, r2, r0)
        L_0x02f7:
            r8 = r0
            com.google.android.gms.internal.ads.aso r0 = r15.m3637a((int) r5)
            r1 = r13
            r2 = r32
            r3 = r11
            r4 = r34
            r19 = r5
            r5 = r8
            r20 = r6
            r6 = r36
            int r0 = m3627a((com.google.android.gms.internal.ads.aso<?>) r0, (int) r1, (byte[]) r2, (int) r3, (int) r4, (com.google.android.gms.internal.ads.aqu<?>) r5, (com.google.android.gms.internal.ads.aoz) r6)
            r3 = r13
            r1 = r17
            r2 = r19
            r6 = r20
            goto L_0x02b5
        L_0x0315:
            r19 = r5
            r20 = r6
            r25 = r7
            r28 = r10
            r15 = r11
            r29 = r13
            goto L_0x03a2
        L_0x0322:
            r19 = r5
            r20 = r6
            r1 = 49
            if (r8 > r1) goto L_0x0372
            r1 = r21
            long r5 = (long) r1
            r4 = r0
            r0 = r30
            r1 = r31
            r21 = r2
            r2 = r32
            r3 = r11
            r26 = r4
            r4 = r34
            r23 = r5
            r5 = r13
            r6 = r17
            r25 = r7
            r7 = r26
            r27 = r8
            r15 = -1
            r8 = r19
            r28 = r10
            r9 = r23
            r15 = r11
            r11 = r27
            r29 = r13
            r12 = r21
            r14 = r36
            int r0 = r0.m3632a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (long) r9, (int) r11, (long) r12, (com.google.android.gms.internal.ads.aoz) r14)
            if (r0 != r15) goto L_0x035e
        L_0x035c:
            r2 = r0
            goto L_0x03a3
        L_0x035e:
            r12 = r32
            r9 = r36
            r1 = r17
            r2 = r19
            r6 = r20
            r7 = r25
            r10 = r28
            r3 = r29
        L_0x036e:
            r11 = r35
            goto L_0x03e9
        L_0x0372:
            r26 = r0
            r25 = r7
            r27 = r8
            r28 = r10
            r15 = r11
            r29 = r13
            r1 = r21
            r21 = r2
            r0 = 50
            r9 = r27
            if (r9 != r0) goto L_0x03a8
            r7 = r26
            r0 = 2
            if (r7 != r0) goto L_0x03a2
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r19
            r6 = r21
            r8 = r36
            int r0 = r0.m3633a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (long) r6, (com.google.android.gms.internal.ads.aoz) r8)
            if (r0 != r15) goto L_0x035e
            goto L_0x035c
        L_0x03a2:
            r2 = r15
        L_0x03a3:
            r7 = r29
        L_0x03a5:
            r6 = r35
            goto L_0x03c5
        L_0x03a8:
            r7 = r26
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r29
            r6 = r17
            r10 = r21
            r12 = r19
            r13 = r36
            int r0 = r0.m3631a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (long) r10, (int) r12, (com.google.android.gms.internal.ads.aoz) r13)
            if (r0 != r15) goto L_0x03f1
            goto L_0x035c
        L_0x03c5:
            if (r7 != r6) goto L_0x03cc
            if (r6 != 0) goto L_0x03ca
            goto L_0x03cc
        L_0x03ca:
            r3 = r7
            goto L_0x040c
        L_0x03cc:
            r0 = r7
            r1 = r32
            r3 = r34
            r4 = r31
            r5 = r36
            int r0 = m3626a((int) r0, (byte[]) r1, (int) r2, (int) r3, (java.lang.Object) r4, (com.google.android.gms.internal.ads.aoz) r5)
            r12 = r32
            r9 = r36
            r11 = r6
            r3 = r7
            r1 = r17
            r2 = r19
            r6 = r20
            r7 = r25
            r10 = r28
        L_0x03e9:
            r13 = r34
            r14 = r31
            r15 = r30
            goto L_0x0017
        L_0x03f1:
            r7 = r29
            r12 = r32
            r9 = r36
            r3 = r7
            r1 = r17
            r2 = r19
            r6 = r20
            r7 = r25
            r10 = r28
            goto L_0x036e
        L_0x0404:
            r20 = r6
            r25 = r7
            r28 = r10
            r6 = r11
            r2 = r0
        L_0x040c:
            r1 = r20
            r0 = r25
            r4 = -1
            if (r0 == r4) goto L_0x041c
            long r4 = (long) r0
            r7 = r28
            r0 = r31
            r7.putInt(r0, r4, r1)
            goto L_0x041e
        L_0x041c:
            r0 = r31
        L_0x041e:
            r1 = 0
            r4 = r30
            int r5 = r4.f2414m
        L_0x0423:
            int r7 = r4.f2415n
            if (r5 >= r7) goto L_0x0436
            int[] r7 = r4.f2413l
            r7 = r7[r5]
            com.google.android.gms.internal.ads.atg<?, ?> r8 = r4.f2418q
            java.lang.Object r1 = r4.m3639a((java.lang.Object) r0, (int) r7, r1, r8)
            com.google.android.gms.internal.ads.ath r1 = (com.google.android.gms.internal.ads.ath) r1
            int r5 = r5 + 1
            goto L_0x0423
        L_0x0436:
            if (r1 == 0) goto L_0x043d
            com.google.android.gms.internal.ads.atg<?, ?> r5 = r4.f2418q
            r5.mo11179b((java.lang.Object) r0, r1)
        L_0x043d:
            if (r6 != 0) goto L_0x0449
            r0 = r34
            if (r2 != r0) goto L_0x0444
            goto L_0x044f
        L_0x0444:
            com.google.android.gms.internal.ads.aqv r0 = com.google.android.gms.internal.ads.aqv.m3514h()
            throw r0
        L_0x0449:
            r0 = r34
            if (r2 > r0) goto L_0x0450
            if (r3 != r6) goto L_0x0450
        L_0x044f:
            return r2
        L_0x0450:
            com.google.android.gms.internal.ads.aqv r0 = com.google.android.gms.internal.ads.aqv.m3514h()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.asa.m3634a(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.aoz):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0115, code lost:
        r2 = r4;
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0149, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0167, code lost:
        r1 = r7;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x016c, code lost:
        r25 = r7;
        r15 = r8;
        r18 = r9;
        r19 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01e4, code lost:
        if (r0 == r15) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0212, code lost:
        if (r0 == r15) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0231, code lost:
        if (r0 == r15) goto L_0x01e6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11104a(T r29, byte[] r30, int r31, int r32, com.google.android.gms.internal.ads.aoz r33) {
        /*
            r28 = this;
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            boolean r0 = r15.f2411j
            if (r0 == 0) goto L_0x025e
            sun.misc.Unsafe r9 = f2403b
            r10 = -1
            r16 = 0
            r0 = r31
            r1 = -1
            r2 = 0
        L_0x0017:
            if (r0 >= r13) goto L_0x0255
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0029
            int r0 = com.google.android.gms.internal.ads.aoy.m2958a((int) r0, (byte[]) r12, (int) r3, (com.google.android.gms.internal.ads.aoz) r11)
            int r3 = r11.f2155a
            r8 = r0
            r17 = r3
            goto L_0x002c
        L_0x0029:
            r17 = r0
            r8 = r3
        L_0x002c:
            int r7 = r17 >>> 3
            r6 = r17 & 7
            if (r7 <= r1) goto L_0x003a
            int r2 = r2 / 3
            int r0 = r15.m3625a((int) r7, (int) r2)
        L_0x0038:
            r4 = r0
            goto L_0x003f
        L_0x003a:
            int r0 = r15.m3668g(r7)
            goto L_0x0038
        L_0x003f:
            if (r4 != r10) goto L_0x004c
            r25 = r7
            r2 = r8
            r18 = r9
            r19 = 0
            r27 = -1
            goto L_0x0234
        L_0x004c:
            int[] r0 = r15.f2404c
            int r1 = r4 + 1
            r5 = r0[r1]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r5
            int r3 = r0 >>> 20
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r1 = (long) r0
            r0 = 17
            r10 = 2
            if (r3 > r0) goto L_0x0175
            r0 = 1
            switch(r3) {
                case 0: goto L_0x015a;
                case 1: goto L_0x014b;
                case 2: goto L_0x0139;
                case 3: goto L_0x0139;
                case 4: goto L_0x012b;
                case 5: goto L_0x0119;
                case 6: goto L_0x0108;
                case 7: goto L_0x00f2;
                case 8: goto L_0x00db;
                case 9: goto L_0x00ba;
                case 10: goto L_0x00ad;
                case 11: goto L_0x012b;
                case 12: goto L_0x009e;
                case 13: goto L_0x0108;
                case 14: goto L_0x0119;
                case 15: goto L_0x008b;
                case 16: goto L_0x0070;
                default: goto L_0x0065;
            }
        L_0x0065:
            r19 = r4
            r25 = r7
            r15 = r8
            r18 = r9
        L_0x006c:
            r27 = -1
            goto L_0x0215
        L_0x0070:
            if (r6 != 0) goto L_0x0065
            int r6 = com.google.android.gms.internal.ads.aoy.m2962b(r12, r8, r11)
            r20 = r1
            long r0 = r11.f2156b
            long r22 = com.google.android.gms.internal.ads.apo.m3030a((long) r0)
            r0 = r9
            r2 = r20
            r1 = r29
            r10 = r4
            r4 = r22
            r0.putLong(r1, r2, r4)
            goto L_0x0149
        L_0x008b:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x016c
            int r0 = com.google.android.gms.internal.ads.aoy.m2960a(r12, r8, r11)
            int r1 = r11.f2155a
            int r1 = com.google.android.gms.internal.ads.apo.m3033g(r1)
            r9.putInt(r14, r2, r1)
            goto L_0x0167
        L_0x009e:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x016c
            int r0 = com.google.android.gms.internal.ads.aoy.m2960a(r12, r8, r11)
            int r1 = r11.f2155a
            r9.putInt(r14, r2, r1)
            goto L_0x0167
        L_0x00ad:
            r2 = r1
            if (r6 != r10) goto L_0x0065
            int r0 = com.google.android.gms.internal.ads.aoy.m2968e(r12, r8, r11)
            java.lang.Object r1 = r11.f2157c
            r9.putObject(r14, r2, r1)
            goto L_0x0115
        L_0x00ba:
            r2 = r1
            if (r6 != r10) goto L_0x0065
            com.google.android.gms.internal.ads.aso r0 = r15.m3637a((int) r4)
            int r0 = m3629a((com.google.android.gms.internal.ads.aso) r0, (byte[]) r12, (int) r8, (int) r13, (com.google.android.gms.internal.ads.aoz) r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x00d1
            java.lang.Object r1 = r11.f2157c
            r9.putObject(r14, r2, r1)
            goto L_0x0115
        L_0x00d1:
            java.lang.Object r5 = r11.f2157c
            java.lang.Object r1 = com.google.android.gms.internal.ads.aqp.m3496a((java.lang.Object) r1, (java.lang.Object) r5)
            r9.putObject(r14, r2, r1)
            goto L_0x0115
        L_0x00db:
            r2 = r1
            if (r6 != r10) goto L_0x0065
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r5
            if (r0 != 0) goto L_0x00e8
            int r0 = com.google.android.gms.internal.ads.aoy.m2965c(r12, r8, r11)
            goto L_0x00ec
        L_0x00e8:
            int r0 = com.google.android.gms.internal.ads.aoy.m2967d(r12, r8, r11)
        L_0x00ec:
            java.lang.Object r1 = r11.f2157c
            r9.putObject(r14, r2, r1)
            goto L_0x0115
        L_0x00f2:
            r2 = r1
            if (r6 != 0) goto L_0x0065
            int r1 = com.google.android.gms.internal.ads.aoy.m2962b(r12, r8, r11)
            long r5 = r11.f2156b
            r19 = 0
            int r8 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r8 == 0) goto L_0x0102
            goto L_0x0103
        L_0x0102:
            r0 = 0
        L_0x0103:
            com.google.android.gms.internal.ads.atn.m3923a((java.lang.Object) r14, (long) r2, (boolean) r0)
            r0 = r1
            goto L_0x0115
        L_0x0108:
            r2 = r1
            r0 = 5
            if (r6 != r0) goto L_0x0065
            int r0 = com.google.android.gms.internal.ads.aoy.m2959a(r12, r8)
            r9.putInt(r14, r2, r0)
            int r0 = r8 + 4
        L_0x0115:
            r2 = r4
            r1 = r7
            goto L_0x0169
        L_0x0119:
            r2 = r1
            if (r6 != r0) goto L_0x0065
            long r5 = com.google.android.gms.internal.ads.aoy.m2963b(r12, r8)
            r0 = r9
            r1 = r29
            r10 = r4
            r4 = r5
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x0167
        L_0x012b:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x016c
            int r0 = com.google.android.gms.internal.ads.aoy.m2960a(r12, r8, r11)
            int r1 = r11.f2155a
            r9.putInt(r14, r2, r1)
            goto L_0x0167
        L_0x0139:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x016c
            int r6 = com.google.android.gms.internal.ads.aoy.m2962b(r12, r8, r11)
            long r4 = r11.f2156b
            r0 = r9
            r1 = r29
            r0.putLong(r1, r2, r4)
        L_0x0149:
            r0 = r6
            goto L_0x0167
        L_0x014b:
            r2 = r1
            r10 = r4
            r0 = 5
            if (r6 != r0) goto L_0x016c
            float r0 = com.google.android.gms.internal.ads.aoy.m2966d(r12, r8)
            com.google.android.gms.internal.ads.atn.m3919a((java.lang.Object) r14, (long) r2, (float) r0)
            int r0 = r8 + 4
            goto L_0x0167
        L_0x015a:
            r2 = r1
            r10 = r4
            if (r6 != r0) goto L_0x016c
            double r0 = com.google.android.gms.internal.ads.aoy.m2964c(r12, r8)
            com.google.android.gms.internal.ads.atn.m3918a((java.lang.Object) r14, (long) r2, (double) r0)
            int r0 = r8 + 8
        L_0x0167:
            r1 = r7
            r2 = r10
        L_0x0169:
            r10 = -1
            goto L_0x0017
        L_0x016c:
            r25 = r7
            r15 = r8
            r18 = r9
            r19 = r10
            goto L_0x006c
        L_0x0175:
            r0 = 27
            if (r3 != r0) goto L_0x01b1
            if (r6 != r10) goto L_0x0065
            java.lang.Object r0 = r9.getObject(r14, r1)
            com.google.android.gms.internal.ads.aqu r0 = (com.google.android.gms.internal.ads.aqu) r0
            boolean r3 = r0.mo10761a()
            if (r3 != 0) goto L_0x0199
            int r3 = r0.size()
            if (r3 != 0) goto L_0x0190
            r3 = 10
            goto L_0x0192
        L_0x0190:
            int r3 = r3 << 1
        L_0x0192:
            com.google.android.gms.internal.ads.aqu r0 = r0.mo10785a(r3)
            r9.putObject(r14, r1, r0)
        L_0x0199:
            r5 = r0
            com.google.android.gms.internal.ads.aso r0 = r15.m3637a((int) r4)
            r1 = r17
            r2 = r30
            r3 = r8
            r19 = r4
            r4 = r32
            r6 = r33
            int r0 = m3627a((com.google.android.gms.internal.ads.aso<?>) r0, (int) r1, (byte[]) r2, (int) r3, (int) r4, (com.google.android.gms.internal.ads.aqu<?>) r5, (com.google.android.gms.internal.ads.aoz) r6)
            r1 = r7
            r2 = r19
            goto L_0x0169
        L_0x01b1:
            r19 = r4
            r0 = 49
            if (r3 > r0) goto L_0x01e8
            long r4 = (long) r5
            r0 = r28
            r20 = r1
            r1 = r29
            r2 = r30
            r10 = r3
            r3 = r8
            r22 = r4
            r4 = r32
            r5 = r17
            r24 = r6
            r6 = r7
            r25 = r7
            r7 = r24
            r15 = r8
            r8 = r19
            r18 = r9
            r26 = r10
            r27 = -1
            r9 = r22
            r11 = r26
            r12 = r20
            r14 = r33
            int r0 = r0.m3632a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (long) r9, (int) r11, (long) r12, (com.google.android.gms.internal.ads.aoz) r14)
            if (r0 != r15) goto L_0x0242
        L_0x01e6:
            r2 = r0
            goto L_0x0234
        L_0x01e8:
            r20 = r1
            r26 = r3
            r24 = r6
            r25 = r7
            r15 = r8
            r18 = r9
            r27 = -1
            r0 = 50
            r9 = r26
            if (r9 != r0) goto L_0x0217
            r7 = r24
            if (r7 != r10) goto L_0x0215
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r19
            r6 = r20
            r8 = r33
            int r0 = r0.m3633a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (long) r6, (com.google.android.gms.internal.ads.aoz) r8)
            if (r0 != r15) goto L_0x0242
            goto L_0x01e6
        L_0x0215:
            r2 = r15
            goto L_0x0234
        L_0x0217:
            r7 = r24
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r8 = r5
            r5 = r17
            r6 = r25
            r10 = r20
            r12 = r19
            r13 = r33
            int r0 = r0.m3631a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (long) r10, (int) r12, (com.google.android.gms.internal.ads.aoz) r13)
            if (r0 != r15) goto L_0x0242
            goto L_0x01e6
        L_0x0234:
            r0 = r17
            r1 = r30
            r3 = r32
            r4 = r29
            r5 = r33
            int r0 = m3626a((int) r0, (byte[]) r1, (int) r2, (int) r3, (java.lang.Object) r4, (com.google.android.gms.internal.ads.aoz) r5)
        L_0x0242:
            r14 = r29
            r12 = r30
            r11 = r33
            r9 = r18
            r2 = r19
            r1 = r25
            r10 = -1
            r13 = r32
            r15 = r28
            goto L_0x0017
        L_0x0255:
            r4 = r13
            if (r0 != r4) goto L_0x0259
            return
        L_0x0259:
            com.google.android.gms.internal.ads.aqv r0 = com.google.android.gms.internal.ads.aqv.m3514h()
            throw r0
        L_0x025e:
            r4 = r13
            r5 = 0
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r32
            r6 = r33
            r0.m3634a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (com.google.android.gms.internal.ads.aoz) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.asa.mo11104a(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.aoz):void");
    }

    /* renamed from: c */
    public final void mo11108c(T t) {
        for (int i = this.f2414m; i < this.f2415n; i++) {
            long d = (long) (m3661d(this.f2413l[i]) & 1048575);
            Object f = atn.m3944f(t, d);
            if (f != null) {
                atn.m3922a((Object) t, d, this.f2420s.mo11084d(f));
            }
        }
        int length = this.f2413l.length;
        for (int i2 = this.f2415n; i2 < length; i2++) {
            this.f2417p.mo11061b(t, (long) this.f2413l[i2]);
        }
        this.f2418q.mo11182d(t);
        if (this.f2409h) {
            this.f2419r.mo10988c(t);
        }
    }

    /* renamed from: a */
    private final <UT, UB> UB m3639a(Object obj, int i, UB ub, atg<UT, UB> atg) {
        aqs c;
        int i2 = this.f2404c[i];
        Object f = atn.m3944f(obj, (long) (m3661d(i) & 1048575));
        if (f == null || (c = m3659c(i)) == null) {
            return ub;
        }
        return m3638a(i, i2, this.f2420s.mo11081a(f), c, ub, atg);
    }

    /* renamed from: a */
    private final <K, V, UT, UB> UB m3638a(int i, int i2, Map<K, V> map, aqs aqs, UB ub, atg<UT, UB> atg) {
        arp<?, ?> f = this.f2420s.mo11086f(m3653b(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!aqs.mo11037a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = atg.mo11166a();
                }
                apk b = apc.m2991b(aro.m3566a(f, next.getKey(), next.getValue()));
                try {
                    aro.m3567a(b.mo10815b(), f, next.getKey(), next.getValue());
                    atg.mo11170a(ub, i2, b.mo10814a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0104, code lost:
        continue;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11109d(T r14) {
        /*
            r13 = this;
            r0 = 0
            r1 = -1
            r1 = 0
            r2 = -1
            r3 = 0
        L_0x0005:
            int r4 = r13.f2414m
            r5 = 1
            if (r1 >= r4) goto L_0x0108
            int[] r4 = r13.f2413l
            r4 = r4[r1]
            int[] r6 = r13.f2404c
            r6 = r6[r4]
            int r7 = r13.m3661d((int) r4)
            boolean r8 = r13.f2411j
            r9 = 1048575(0xfffff, float:1.469367E-39)
            if (r8 != 0) goto L_0x0035
            int[] r8 = r13.f2404c
            int r10 = r4 + 2
            r8 = r8[r10]
            r10 = r8 & r9
            int r8 = r8 >>> 20
            int r8 = r5 << r8
            if (r10 == r2) goto L_0x0036
            sun.misc.Unsafe r2 = f2403b
            long r11 = (long) r10
            int r2 = r2.getInt(r14, r11)
            r3 = r2
            r2 = r10
            goto L_0x0036
        L_0x0035:
            r8 = 0
        L_0x0036:
            r10 = 268435456(0x10000000, float:2.5243549E-29)
            r10 = r10 & r7
            if (r10 == 0) goto L_0x003d
            r10 = 1
            goto L_0x003e
        L_0x003d:
            r10 = 0
        L_0x003e:
            if (r10 == 0) goto L_0x0047
            boolean r10 = r13.m3649a(r14, (int) r4, (int) r3, (int) r8)
            if (r10 != 0) goto L_0x0047
            return r0
        L_0x0047:
            r10 = 267386880(0xff00000, float:2.3665827E-29)
            r10 = r10 & r7
            int r10 = r10 >>> 20
            r11 = 9
            if (r10 == r11) goto L_0x00f3
            r11 = 17
            if (r10 == r11) goto L_0x00f3
            r8 = 27
            if (r10 == r8) goto L_0x00c7
            r8 = 60
            if (r10 == r8) goto L_0x00b6
            r8 = 68
            if (r10 == r8) goto L_0x00b6
            switch(r10) {
                case 49: goto L_0x00c7;
                case 50: goto L_0x0065;
                default: goto L_0x0063;
            }
        L_0x0063:
            goto L_0x0104
        L_0x0065:
            com.google.android.gms.internal.ads.arr r6 = r13.f2420s
            r7 = r7 & r9
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.atn.m3944f(r14, r7)
            java.util.Map r6 = r6.mo11082b(r7)
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x00b3
            java.lang.Object r4 = r13.m3653b((int) r4)
            com.google.android.gms.internal.ads.arr r7 = r13.f2420s
            com.google.android.gms.internal.ads.arp r4 = r7.mo11086f(r4)
            com.google.android.gms.internal.ads.atw r4 = r4.f2392c
            com.google.android.gms.internal.ads.aub r4 = r4.mo11230a()
            com.google.android.gms.internal.ads.aub r7 = com.google.android.gms.internal.ads.aub.MESSAGE
            if (r4 != r7) goto L_0x00b3
            r4 = 0
            java.util.Collection r6 = r6.values()
            java.util.Iterator r6 = r6.iterator()
        L_0x0094:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00b3
            java.lang.Object r7 = r6.next()
            if (r4 != 0) goto L_0x00ac
            com.google.android.gms.internal.ads.asj r4 = com.google.android.gms.internal.ads.asj.m3697a()
            java.lang.Class r8 = r7.getClass()
            com.google.android.gms.internal.ads.aso r4 = r4.mo11112a(r8)
        L_0x00ac:
            boolean r7 = r4.mo11109d(r7)
            if (r7 != 0) goto L_0x0094
            r5 = 0
        L_0x00b3:
            if (r5 != 0) goto L_0x0104
            return r0
        L_0x00b6:
            boolean r5 = r13.m3648a(r14, (int) r6, (int) r4)
            if (r5 == 0) goto L_0x0104
            com.google.android.gms.internal.ads.aso r4 = r13.m3637a((int) r4)
            boolean r4 = m3650a((java.lang.Object) r14, (int) r7, (com.google.android.gms.internal.ads.aso) r4)
            if (r4 != 0) goto L_0x0104
            return r0
        L_0x00c7:
            r6 = r7 & r9
            long r6 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.atn.m3944f(r14, r6)
            java.util.List r6 = (java.util.List) r6
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x00f0
            com.google.android.gms.internal.ads.aso r4 = r13.m3637a((int) r4)
            r7 = 0
        L_0x00db:
            int r8 = r6.size()
            if (r7 >= r8) goto L_0x00f0
            java.lang.Object r8 = r6.get(r7)
            boolean r8 = r4.mo11109d(r8)
            if (r8 != 0) goto L_0x00ed
            r5 = 0
            goto L_0x00f0
        L_0x00ed:
            int r7 = r7 + 1
            goto L_0x00db
        L_0x00f0:
            if (r5 != 0) goto L_0x0104
            return r0
        L_0x00f3:
            boolean r5 = r13.m3649a(r14, (int) r4, (int) r3, (int) r8)
            if (r5 == 0) goto L_0x0104
            com.google.android.gms.internal.ads.aso r4 = r13.m3637a((int) r4)
            boolean r4 = m3650a((java.lang.Object) r14, (int) r7, (com.google.android.gms.internal.ads.aso) r4)
            if (r4 != 0) goto L_0x0104
            return r0
        L_0x0104:
            int r1 = r1 + 1
            goto L_0x0005
        L_0x0108:
            boolean r1 = r13.f2409h
            if (r1 == 0) goto L_0x0119
            com.google.android.gms.internal.ads.aqa<?> r1 = r13.f2419r
            com.google.android.gms.internal.ads.aqd r14 = r1.mo10979a((java.lang.Object) r14)
            boolean r14 = r14.mo10997g()
            if (r14 != 0) goto L_0x0119
            return r0
        L_0x0119:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.asa.mo11109d(java.lang.Object):boolean");
    }

    /* renamed from: a */
    private static boolean m3650a(Object obj, int i, aso aso) {
        return aso.mo11109d(atn.m3944f(obj, (long) (i & 1048575)));
    }

    /* renamed from: a */
    private static void m3642a(int i, Object obj, auc auc) {
        if (obj instanceof String) {
            auc.mo10936a(i, (String) obj);
        } else {
            auc.mo10932a(i, (apc) obj);
        }
    }

    /* renamed from: a */
    private final void m3645a(Object obj, int i, asn asn) {
        if (m3666f(i)) {
            atn.m3922a(obj, (long) (i & 1048575), (Object) asn.mo10874m());
        } else if (this.f2410i) {
            atn.m3922a(obj, (long) (i & 1048575), (Object) asn.mo10872l());
        } else {
            atn.m3922a(obj, (long) (i & 1048575), (Object) asn.mo10876n());
        }
    }

    /* renamed from: d */
    private final int m3661d(int i) {
        return this.f2404c[i + 1];
    }

    /* renamed from: e */
    private final int m3663e(int i) {
        return this.f2404c[i + 2];
    }

    /* renamed from: b */
    private static <T> double m3651b(T t, long j) {
        return ((Double) atn.m3944f(t, j)).doubleValue();
    }

    /* renamed from: c */
    private static <T> float m3658c(T t, long j) {
        return ((Float) atn.m3944f(t, j)).floatValue();
    }

    /* renamed from: d */
    private static <T> int m3662d(T t, long j) {
        return ((Integer) atn.m3944f(t, j)).intValue();
    }

    /* renamed from: e */
    private static <T> long m3664e(T t, long j) {
        return ((Long) atn.m3944f(t, j)).longValue();
    }

    /* renamed from: f */
    private static <T> boolean m3667f(T t, long j) {
        return ((Boolean) atn.m3944f(t, j)).booleanValue();
    }

    /* renamed from: c */
    private final boolean m3660c(T t, T t2, int i) {
        return m3647a(t, i) == m3647a(t2, i);
    }

    /* renamed from: a */
    private final boolean m3649a(T t, int i, int i2, int i3) {
        if (this.f2411j) {
            return m3647a(t, i);
        }
        return (i2 & i3) != 0;
    }

    /* renamed from: a */
    private final boolean m3647a(T t, int i) {
        if (this.f2411j) {
            int d = m3661d(i);
            long j = (long) (d & 1048575);
            switch ((d & 267386880) >>> 20) {
                case 0:
                    return atn.m3941e(t, j) != 0.0d;
                case 1:
                    return atn.m3937d(t, j) != 0.0f;
                case 2:
                    return atn.m3928b(t, j) != 0;
                case 3:
                    return atn.m3928b(t, j) != 0;
                case 4:
                    return atn.m3913a((Object) t, j) != 0;
                case 5:
                    return atn.m3928b(t, j) != 0;
                case 6:
                    return atn.m3913a((Object) t, j) != 0;
                case 7:
                    return atn.m3936c(t, j);
                case 8:
                    Object f = atn.m3944f(t, j);
                    if (f instanceof String) {
                        return !((String) f).isEmpty();
                    }
                    if (f instanceof apc) {
                        return !apc.f2174a.equals(f);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return atn.m3944f(t, j) != null;
                case 10:
                    return !apc.f2174a.equals(atn.m3944f(t, j));
                case 11:
                    return atn.m3913a((Object) t, j) != 0;
                case 12:
                    return atn.m3913a((Object) t, j) != 0;
                case 13:
                    return atn.m3913a((Object) t, j) != 0;
                case 14:
                    return atn.m3928b(t, j) != 0;
                case 15:
                    return atn.m3913a((Object) t, j) != 0;
                case 16:
                    return atn.m3928b(t, j) != 0;
                case 17:
                    return atn.m3944f(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int e = m3663e(i);
            return (atn.m3913a((Object) t, (long) (e & 1048575)) & (1 << (e >>> 20))) != 0;
        }
    }

    /* renamed from: b */
    private final void m3654b(T t, int i) {
        if (!this.f2411j) {
            int e = m3663e(i);
            long j = (long) (e & 1048575);
            atn.m3920a((Object) t, j, atn.m3913a((Object) t, j) | (1 << (e >>> 20)));
        }
    }

    /* renamed from: a */
    private final boolean m3648a(T t, int i, int i2) {
        return atn.m3913a((Object) t, (long) (m3663e(i2) & 1048575)) == i;
    }

    /* renamed from: b */
    private final void m3655b(T t, int i, int i2) {
        atn.m3920a((Object) t, (long) (m3663e(i2) & 1048575), i);
    }

    /* renamed from: g */
    private final int m3668g(int i) {
        if (i < this.f2406e || i > this.f2407f) {
            return -1;
        }
        return m3652b(i, 0);
    }

    /* renamed from: a */
    private final int m3625a(int i, int i2) {
        if (i < this.f2406e || i > this.f2407f) {
            return -1;
        }
        return m3652b(i, i2);
    }

    /* renamed from: b */
    private final int m3652b(int i, int i2) {
        int length = (this.f2404c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f2404c[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }
}
