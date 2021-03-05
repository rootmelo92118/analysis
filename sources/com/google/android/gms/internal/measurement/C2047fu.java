package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.fu */
final class C2047fu<T> implements C2061gh<T> {

    /* renamed from: a */
    private static final int[] f7793a = new int[0];

    /* renamed from: b */
    private static final Unsafe f7794b = C2086hf.m10035c();

    /* renamed from: c */
    private final int[] f7795c;

    /* renamed from: d */
    private final Object[] f7796d;

    /* renamed from: e */
    private final int f7797e;

    /* renamed from: f */
    private final int f7798f;

    /* renamed from: g */
    private final C2043fq f7799g;

    /* renamed from: h */
    private final boolean f7800h;

    /* renamed from: i */
    private final boolean f7801i;

    /* renamed from: j */
    private final boolean f7802j;

    /* renamed from: k */
    private final boolean f7803k;

    /* renamed from: l */
    private final int[] f7804l;

    /* renamed from: m */
    private final int f7805m;

    /* renamed from: n */
    private final int f7806n;

    /* renamed from: o */
    private final C2051fy f7807o;

    /* renamed from: p */
    private final C2027fa f7808p;

    /* renamed from: q */
    private final C2079gz<?, ?> f7809q;

    /* renamed from: r */
    private final C1990dw<?> f7810r;

    /* renamed from: s */
    private final C2038fl f7811s;

    private C2047fu(int[] iArr, Object[] objArr, int i, int i2, C2043fq fqVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, C2051fy fyVar, C2027fa faVar, C2079gz<?, ?> gzVar, C1990dw<?> dwVar, C2038fl flVar) {
        this.f7795c = iArr;
        this.f7796d = objArr;
        this.f7797e = i;
        this.f7798f = i2;
        this.f7801i = fqVar instanceof C2003ei;
        this.f7802j = z;
        this.f7800h = dwVar != null && dwVar.mo13783a(fqVar);
        this.f7803k = false;
        this.f7804l = iArr2;
        this.f7805m = i3;
        this.f7806n = i4;
        this.f7807o = fyVar;
        this.f7808p = faVar;
        this.f7809q = gzVar;
        this.f7810r = dwVar;
        this.f7799g = fqVar;
        this.f7811s = flVar;
    }

    /* renamed from: f */
    private static boolean m9741f(int i) {
        return (i & 536870912) != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:172:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03c7  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x03d2  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x03db  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.measurement.C2047fu<T> m9713a(java.lang.Class<T> r37, com.google.android.gms.internal.measurement.C2041fo r38, com.google.android.gms.internal.measurement.C2051fy r39, com.google.android.gms.internal.measurement.C2027fa r40, com.google.android.gms.internal.measurement.C2079gz<?, ?> r41, com.google.android.gms.internal.measurement.C1990dw<?> r42, com.google.android.gms.internal.measurement.C2038fl r43) {
        /*
            r0 = r38
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C2059gf
            if (r1 == 0) goto L_0x0441
            com.google.android.gms.internal.measurement.gf r0 = (com.google.android.gms.internal.measurement.C2059gf) r0
            int r1 = r0.mo13922a()
            int r2 = com.google.android.gms.internal.measurement.C2003ei.C2008e.f7738i
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x0014
            r11 = 1
            goto L_0x0015
        L_0x0014:
            r11 = 0
        L_0x0015:
            java.lang.String r1 = r0.mo13940d()
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
            int[] r8 = f7793a
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
            sun.misc.Unsafe r6 = f7794b
            java.lang.Object[] r17 = r0.mo13941e()
            com.google.android.gms.internal.measurement.fq r18 = r0.mo13924c()
            java.lang.Class r7 = r18.getClass()
            r22 = r12
            int r12 = r14 * 3
            int[] r12 = new int[r12]
            int r14 = r14 << r4
            java.lang.Object[] r14 = new java.lang.Object[r14]
            int r18 = r3 + r8
            r20 = r15
            r23 = r18
            r8 = r22
            r15 = 0
            r19 = 0
            r22 = r3
        L_0x01c5:
            if (r8 >= r2) goto L_0x0413
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
            r11 = 51
            r30 = r15
            if (r3 < r11) goto L_0x02e4
            int r11 = r2 + 1
            char r2 = r1.charAt(r2)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r15) goto L_0x026f
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r24 = 13
        L_0x0255:
            int r25 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r15) goto L_0x026a
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r24
            r2 = r2 | r11
            int r24 = r24 + 13
            r11 = r25
            r15 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0255
        L_0x026a:
            int r11 = r11 << r24
            r2 = r2 | r11
            r11 = r25
        L_0x026f:
            int r15 = r3 + -51
            r31 = r11
            r11 = 9
            if (r15 == r11) goto L_0x0296
            r11 = 17
            if (r15 != r11) goto L_0x027c
            goto L_0x0296
        L_0x027c:
            r11 = 12
            if (r15 != r11) goto L_0x0292
            r11 = r5 & 1
            r15 = 1
            if (r11 != r15) goto L_0x0292
            int r11 = r19 / 3
            int r11 = r11 << r15
            int r11 = r11 + r15
            int r15 = r20 + 1
            r20 = r17[r20]
            r14[r11] = r20
            r24 = r15
            goto L_0x0294
        L_0x0292:
            r24 = r20
        L_0x0294:
            r15 = 1
            goto L_0x02a1
        L_0x0296:
            int r11 = r19 / 3
            r15 = 1
            int r11 = r11 << r15
            int r11 = r11 + r15
            int r24 = r20 + 1
            r20 = r17[r20]
            r14[r11] = r20
        L_0x02a1:
            int r2 = r2 << r15
            r11 = r17[r2]
            boolean r15 = r11 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x02ad
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
        L_0x02aa:
            r32 = r10
            goto L_0x02b6
        L_0x02ad:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = m9717a((java.lang.Class<?>) r7, (java.lang.String) r11)
            r17[r2] = r11
            goto L_0x02aa
        L_0x02b6:
            long r10 = r6.objectFieldOffset(r11)
            int r10 = (int) r10
            int r2 = r2 + 1
            r11 = r17[r2]
            boolean r15 = r11 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x02c8
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
        L_0x02c5:
            r33 = r10
            goto L_0x02d1
        L_0x02c8:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = m9717a((java.lang.Class<?>) r7, (java.lang.String) r11)
            r17[r2] = r11
            goto L_0x02c5
        L_0x02d1:
            long r10 = r6.objectFieldOffset(r11)
            int r2 = (int) r10
            r34 = r13
            r35 = r14
            r20 = r24
            r13 = r31
            r11 = r33
            r14 = r2
            r2 = 0
            goto L_0x03dd
        L_0x02e4:
            r32 = r10
            int r10 = r20 + 1
            r11 = r17[r20]
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = m9717a((java.lang.Class<?>) r7, (java.lang.String) r11)
            r15 = 9
            if (r3 == r15) goto L_0x0366
            r15 = 17
            if (r3 != r15) goto L_0x02fa
            goto L_0x0366
        L_0x02fa:
            r15 = 27
            if (r3 == r15) goto L_0x0354
            r15 = 49
            if (r3 != r15) goto L_0x0303
            goto L_0x0354
        L_0x0303:
            r15 = 12
            if (r3 == r15) goto L_0x0342
            r15 = 30
            if (r3 == r15) goto L_0x0342
            r15 = 44
            if (r3 != r15) goto L_0x0310
            goto L_0x0342
        L_0x0310:
            r15 = 50
            if (r3 != r15) goto L_0x033e
            int r15 = r22 + 1
            r16[r22] = r19
            int r20 = r19 / 3
            r22 = 1
            int r20 = r20 << 1
            int r22 = r10 + 1
            r10 = r17[r10]
            r14[r20] = r10
            r10 = r4 & 2048(0x800, float:2.87E-42)
            if (r10 == 0) goto L_0x0335
            int r20 = r20 + 1
            int r10 = r22 + 1
            r22 = r17[r22]
            r14[r20] = r22
            r34 = r13
            r35 = r14
            goto L_0x033b
        L_0x0335:
            r34 = r13
            r35 = r14
            r10 = r22
        L_0x033b:
            r22 = r15
            goto L_0x0375
        L_0x033e:
            r34 = r13
            r13 = 1
            goto L_0x0373
        L_0x0342:
            r15 = r5 & 1
            r34 = r13
            r13 = 1
            if (r15 != r13) goto L_0x0373
            int r15 = r19 / 3
            int r15 = r15 << r13
            int r15 = r15 + r13
            int r20 = r10 + 1
            r10 = r17[r10]
            r14[r15] = r10
            goto L_0x0361
        L_0x0354:
            r34 = r13
            r13 = 1
            int r15 = r19 / 3
            int r15 = r15 << r13
            int r15 = r15 + r13
            int r20 = r10 + 1
            r10 = r17[r10]
            r14[r15] = r10
        L_0x0361:
            r35 = r14
            r10 = r20
            goto L_0x0375
        L_0x0366:
            r34 = r13
            r13 = 1
            int r15 = r19 / 3
            int r15 = r15 << r13
            int r15 = r15 + r13
            java.lang.Class r20 = r11.getType()
            r14[r15] = r20
        L_0x0373:
            r35 = r14
        L_0x0375:
            long r13 = r6.objectFieldOffset(r11)
            int r11 = (int) r13
            r13 = r5 & 1
            r14 = 1
            if (r13 != r14) goto L_0x03c7
            r13 = 17
            if (r3 > r13) goto L_0x03c7
            int r13 = r2 + 1
            char r2 = r1.charAt(r2)
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r14) goto L_0x03a7
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0392:
            int r20 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r14) goto L_0x03a3
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r15
            r2 = r2 | r13
            int r15 = r15 + 13
            r13 = r20
            goto L_0x0392
        L_0x03a3:
            int r13 = r13 << r15
            r2 = r2 | r13
            r13 = r20
        L_0x03a7:
            r15 = 1
            int r20 = r9 << 1
            int r21 = r2 / 32
            int r20 = r20 + r21
            r14 = r17[r20]
            boolean r15 = r14 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x03b7
            java.lang.reflect.Field r14 = (java.lang.reflect.Field) r14
            goto L_0x03bf
        L_0x03b7:
            java.lang.String r14 = (java.lang.String) r14
            java.lang.reflect.Field r14 = m9717a((java.lang.Class<?>) r7, (java.lang.String) r14)
            r17[r20] = r14
        L_0x03bf:
            long r14 = r6.objectFieldOffset(r14)
            int r14 = (int) r14
            int r2 = r2 % 32
            goto L_0x03ca
        L_0x03c7:
            r13 = r2
            r2 = 0
            r14 = 0
        L_0x03ca:
            r15 = 18
            if (r3 < r15) goto L_0x03db
            r15 = 49
            if (r3 > r15) goto L_0x03db
            int r15 = r23 + 1
            r16[r23] = r11
            r20 = r10
            r23 = r15
            goto L_0x03dd
        L_0x03db:
            r20 = r10
        L_0x03dd:
            int r10 = r19 + 1
            r12[r19] = r8
            int r8 = r10 + 1
            r15 = r4 & 512(0x200, float:7.175E-43)
            if (r15 == 0) goto L_0x03ea
            r15 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03eb
        L_0x03ea:
            r15 = 0
        L_0x03eb:
            r4 = r4 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x03f2
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03f3
        L_0x03f2:
            r4 = 0
        L_0x03f3:
            r4 = r4 | r15
            int r3 = r3 << 20
            r3 = r3 | r4
            r3 = r3 | r11
            r12[r10] = r3
            int r19 = r8 + 1
            int r2 = r2 << 20
            r2 = r2 | r14
            r12[r8] = r2
            r8 = r13
            r2 = r27
            r3 = r28
            r11 = r29
            r15 = r30
            r10 = r32
            r13 = r34
            r14 = r35
            r4 = 1
            goto L_0x01c5
        L_0x0413:
            r28 = r3
            r32 = r10
            r29 = r11
            r34 = r13
            r35 = r14
            com.google.android.gms.internal.measurement.fu r1 = new com.google.android.gms.internal.measurement.fu
            com.google.android.gms.internal.measurement.fq r10 = r0.mo13924c()
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
        L_0x0441:
            com.google.android.gms.internal.measurement.gu r0 = (com.google.android.gms.internal.measurement.C2074gu) r0
            r0.mo13922a()
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2047fu.m9713a(java.lang.Class, com.google.android.gms.internal.measurement.fo, com.google.android.gms.internal.measurement.fy, com.google.android.gms.internal.measurement.fa, com.google.android.gms.internal.measurement.gz, com.google.android.gms.internal.measurement.dw, com.google.android.gms.internal.measurement.fl):com.google.android.gms.internal.measurement.fu");
    }

    /* renamed from: a */
    private static Field m9717a(Class<?> cls, String str) {
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
    public final T mo13926a() {
        return this.f7807o.mo13935a(this.f7799g);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (com.google.android.gms.internal.measurement.C2063gj.m9850a(com.google.android.gms.internal.measurement.C2086hf.m10047f(r10, r6), com.google.android.gms.internal.measurement.C2086hf.m10047f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (com.google.android.gms.internal.measurement.C2086hf.m10030b(r10, r6) == com.google.android.gms.internal.measurement.C2086hf.m10030b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (com.google.android.gms.internal.measurement.C2086hf.m10030b(r10, r6) == com.google.android.gms.internal.measurement.C2086hf.m10030b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (com.google.android.gms.internal.measurement.C2063gj.m9850a(com.google.android.gms.internal.measurement.C2086hf.m10047f(r10, r6), com.google.android.gms.internal.measurement.C2086hf.m10047f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (com.google.android.gms.internal.measurement.C2063gj.m9850a(com.google.android.gms.internal.measurement.C2086hf.m10047f(r10, r6), com.google.android.gms.internal.measurement.C2086hf.m10047f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (com.google.android.gms.internal.measurement.C2063gj.m9850a(com.google.android.gms.internal.measurement.C2086hf.m10047f(r10, r6), com.google.android.gms.internal.measurement.C2086hf.m10047f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (com.google.android.gms.internal.measurement.C2086hf.m10038c(r10, r6) == com.google.android.gms.internal.measurement.C2086hf.m10038c(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (com.google.android.gms.internal.measurement.C2086hf.m10030b(r10, r6) == com.google.android.gms.internal.measurement.C2086hf.m10030b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (com.google.android.gms.internal.measurement.C2086hf.m10030b(r10, r6) == com.google.android.gms.internal.measurement.C2086hf.m10030b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (com.google.android.gms.internal.measurement.C2086hf.m10030b(r10, r6) == com.google.android.gms.internal.measurement.C2086hf.m10030b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.C2086hf.m10039d(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.C2086hf.m10039d(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.C2086hf.m10044e(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.C2086hf.m10044e(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c1, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.measurement.C2063gj.m9850a(com.google.android.gms.internal.measurement.C2086hf.m10047f(r10, r6), com.google.android.gms.internal.measurement.C2086hf.m10047f(r11, r6)) != false) goto L_0x01c2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo13929a(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f7795c
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01c9
            int r4 = r9.m9737d((int) r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x01a7;
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
            goto L_0x01c2
        L_0x001c:
            int r4 = r9.m9739e(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r10, (long) r4)
            int r4 = com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r11, (long) r4)
            if (r8 != r4) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.C2063gj.m9850a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x003c:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r11, r6)
            boolean r3 = com.google.android.gms.internal.measurement.C2063gj.m9850a((java.lang.Object) r3, (java.lang.Object) r4)
            goto L_0x01c2
        L_0x004a:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r11, r6)
            boolean r3 = com.google.android.gms.internal.measurement.C2063gj.m9850a((java.lang.Object) r3, (java.lang.Object) r4)
            goto L_0x01c2
        L_0x0058:
            boolean r4 = r9.m9736c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.C2063gj.m9850a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x006e:
            boolean r4 = r9.m9736c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.C2086hf.m10030b(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C2086hf.m10030b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0082:
            boolean r4 = r9.m9736c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0094:
            boolean r4 = r9.m9736c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.C2086hf.m10030b(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C2086hf.m10030b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00a8:
            boolean r4 = r9.m9736c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00ba:
            boolean r4 = r9.m9736c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00cc:
            boolean r4 = r9.m9736c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00de:
            boolean r4 = r9.m9736c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.C2063gj.m9850a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00f4:
            boolean r4 = r9.m9736c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.C2063gj.m9850a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x010a:
            boolean r4 = r9.m9736c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.C2063gj.m9850a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0120:
            boolean r4 = r9.m9736c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            boolean r4 = com.google.android.gms.internal.measurement.C2086hf.m10038c(r10, r6)
            boolean r5 = com.google.android.gms.internal.measurement.C2086hf.m10038c(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0132:
            boolean r4 = r9.m9736c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0144:
            boolean r4 = r9.m9736c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.C2086hf.m10030b(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C2086hf.m10030b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0157:
            boolean r4 = r9.m9736c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0168:
            boolean r4 = r9.m9736c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.C2086hf.m10030b(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C2086hf.m10030b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x017b:
            boolean r4 = r9.m9736c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.C2086hf.m10030b(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C2086hf.m10030b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x018e:
            boolean r4 = r9.m9736c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            float r4 = com.google.android.gms.internal.measurement.C2086hf.m10039d(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = com.google.android.gms.internal.measurement.C2086hf.m10039d(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x01a7:
            boolean r4 = r9.m9736c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            double r4 = com.google.android.gms.internal.measurement.C2086hf.m10044e(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = com.google.android.gms.internal.measurement.C2086hf.m10044e(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
        L_0x01c1:
            r3 = 0
        L_0x01c2:
            if (r3 != 0) goto L_0x01c5
            return r1
        L_0x01c5:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01c9:
            com.google.android.gms.internal.measurement.gz<?, ?> r0 = r9.f7809q
            java.lang.Object r0 = r0.mo13993b(r10)
            com.google.android.gms.internal.measurement.gz<?, ?> r2 = r9.f7809q
            java.lang.Object r2 = r2.mo13993b(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01dc
            return r1
        L_0x01dc:
            boolean r0 = r9.f7800h
            if (r0 == 0) goto L_0x01f1
            com.google.android.gms.internal.measurement.dw<?> r0 = r9.f7810r
            com.google.android.gms.internal.measurement.dz r10 = r0.mo13777a((java.lang.Object) r10)
            com.google.android.gms.internal.measurement.dw<?> r0 = r9.f7810r
            com.google.android.gms.internal.measurement.dz r11 = r0.mo13777a((java.lang.Object) r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01f1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2047fu.mo13929a(java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: a */
    public final int mo13925a(T t) {
        int length = this.f7795c.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int d = m9737d(i2);
            int i3 = this.f7795c[i2];
            long j = (long) (1048575 & d);
            int i4 = 37;
            switch ((d & 267386880) >>> 20) {
                case 0:
                    i = (i * 53) + C2010ek.m9558a(Double.doubleToLongBits(C2086hf.m10044e(t, j)));
                    break;
                case 1:
                    i = (i * 53) + Float.floatToIntBits(C2086hf.m10039d(t, j));
                    break;
                case 2:
                    i = (i * 53) + C2010ek.m9558a(C2086hf.m10030b(t, j));
                    break;
                case 3:
                    i = (i * 53) + C2010ek.m9558a(C2086hf.m10030b(t, j));
                    break;
                case 4:
                    i = (i * 53) + C2086hf.m10014a((Object) t, j);
                    break;
                case 5:
                    i = (i * 53) + C2010ek.m9558a(C2086hf.m10030b(t, j));
                    break;
                case 6:
                    i = (i * 53) + C2086hf.m10014a((Object) t, j);
                    break;
                case 7:
                    i = (i * 53) + C2010ek.m9559a(C2086hf.m10038c(t, j));
                    break;
                case 8:
                    i = (i * 53) + ((String) C2086hf.m10047f(t, j)).hashCode();
                    break;
                case 9:
                    Object f = C2086hf.m10047f(t, j);
                    if (f != null) {
                        i4 = f.hashCode();
                    }
                    i = (i * 53) + i4;
                    break;
                case 10:
                    i = (i * 53) + C2086hf.m10047f(t, j).hashCode();
                    break;
                case 11:
                    i = (i * 53) + C2086hf.m10014a((Object) t, j);
                    break;
                case 12:
                    i = (i * 53) + C2086hf.m10014a((Object) t, j);
                    break;
                case 13:
                    i = (i * 53) + C2086hf.m10014a((Object) t, j);
                    break;
                case 14:
                    i = (i * 53) + C2010ek.m9558a(C2086hf.m10030b(t, j));
                    break;
                case 15:
                    i = (i * 53) + C2086hf.m10014a((Object) t, j);
                    break;
                case 16:
                    i = (i * 53) + C2010ek.m9558a(C2086hf.m10030b(t, j));
                    break;
                case 17:
                    Object f2 = C2086hf.m10047f(t, j);
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
                    i = (i * 53) + C2086hf.m10047f(t, j).hashCode();
                    break;
                case 50:
                    i = (i * 53) + C2086hf.m10047f(t, j).hashCode();
                    break;
                case 51:
                    if (!m9725a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C2010ek.m9558a(Double.doubleToLongBits(m9728b(t, j)));
                        break;
                    }
                case 52:
                    if (!m9725a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + Float.floatToIntBits(m9734c(t, j));
                        break;
                    }
                case 53:
                    if (!m9725a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C2010ek.m9558a(m9740e(t, j));
                        break;
                    }
                case 54:
                    if (!m9725a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C2010ek.m9558a(m9740e(t, j));
                        break;
                    }
                case 55:
                    if (!m9725a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m9738d(t, j);
                        break;
                    }
                case 56:
                    if (!m9725a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C2010ek.m9558a(m9740e(t, j));
                        break;
                    }
                case 57:
                    if (!m9725a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m9738d(t, j);
                        break;
                    }
                case 58:
                    if (!m9725a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C2010ek.m9559a(m9742f(t, j));
                        break;
                    }
                case 59:
                    if (!m9725a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + ((String) C2086hf.m10047f(t, j)).hashCode();
                        break;
                    }
                case 60:
                    if (!m9725a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C2086hf.m10047f(t, j).hashCode();
                        break;
                    }
                case 61:
                    if (!m9725a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C2086hf.m10047f(t, j).hashCode();
                        break;
                    }
                case 62:
                    if (!m9725a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m9738d(t, j);
                        break;
                    }
                case 63:
                    if (!m9725a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m9738d(t, j);
                        break;
                    }
                case 64:
                    if (!m9725a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m9738d(t, j);
                        break;
                    }
                case 65:
                    if (!m9725a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C2010ek.m9558a(m9740e(t, j));
                        break;
                    }
                case 66:
                    if (!m9725a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m9738d(t, j);
                        break;
                    }
                case 67:
                    if (!m9725a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C2010ek.m9558a(m9740e(t, j));
                        break;
                    }
                case 68:
                    if (!m9725a(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + C2086hf.m10047f(t, j).hashCode();
                        break;
                    }
            }
        }
        int hashCode = (i * 53) + this.f7809q.mo13993b(t).hashCode();
        return this.f7800h ? (hashCode * 53) + this.f7810r.mo13777a((Object) t).hashCode() : hashCode;
    }

    /* renamed from: b */
    public final void mo13931b(T t, T t2) {
        if (t2 != null) {
            for (int i = 0; i < this.f7795c.length; i += 3) {
                int d = m9737d(i);
                long j = (long) (1048575 & d);
                int i2 = this.f7795c[i];
                switch ((d & 267386880) >>> 20) {
                    case 0:
                        if (!m9724a(t2, i)) {
                            break;
                        } else {
                            C2086hf.m10020a((Object) t, j, C2086hf.m10044e(t2, j));
                            m9730b(t, i);
                            break;
                        }
                    case 1:
                        if (!m9724a(t2, i)) {
                            break;
                        } else {
                            C2086hf.m10021a((Object) t, j, C2086hf.m10039d(t2, j));
                            m9730b(t, i);
                            break;
                        }
                    case 2:
                        if (!m9724a(t2, i)) {
                            break;
                        } else {
                            C2086hf.m10023a((Object) t, j, C2086hf.m10030b(t2, j));
                            m9730b(t, i);
                            break;
                        }
                    case 3:
                        if (!m9724a(t2, i)) {
                            break;
                        } else {
                            C2086hf.m10023a((Object) t, j, C2086hf.m10030b(t2, j));
                            m9730b(t, i);
                            break;
                        }
                    case 4:
                        if (!m9724a(t2, i)) {
                            break;
                        } else {
                            C2086hf.m10022a((Object) t, j, C2086hf.m10014a((Object) t2, j));
                            m9730b(t, i);
                            break;
                        }
                    case 5:
                        if (!m9724a(t2, i)) {
                            break;
                        } else {
                            C2086hf.m10023a((Object) t, j, C2086hf.m10030b(t2, j));
                            m9730b(t, i);
                            break;
                        }
                    case 6:
                        if (!m9724a(t2, i)) {
                            break;
                        } else {
                            C2086hf.m10022a((Object) t, j, C2086hf.m10014a((Object) t2, j));
                            m9730b(t, i);
                            break;
                        }
                    case 7:
                        if (!m9724a(t2, i)) {
                            break;
                        } else {
                            C2086hf.m10025a((Object) t, j, C2086hf.m10038c(t2, j));
                            m9730b(t, i);
                            break;
                        }
                    case 8:
                        if (!m9724a(t2, i)) {
                            break;
                        } else {
                            C2086hf.m10024a((Object) t, j, C2086hf.m10047f(t2, j));
                            m9730b(t, i);
                            break;
                        }
                    case 9:
                        m9723a(t, t2, i);
                        break;
                    case 10:
                        if (!m9724a(t2, i)) {
                            break;
                        } else {
                            C2086hf.m10024a((Object) t, j, C2086hf.m10047f(t2, j));
                            m9730b(t, i);
                            break;
                        }
                    case 11:
                        if (!m9724a(t2, i)) {
                            break;
                        } else {
                            C2086hf.m10022a((Object) t, j, C2086hf.m10014a((Object) t2, j));
                            m9730b(t, i);
                            break;
                        }
                    case 12:
                        if (!m9724a(t2, i)) {
                            break;
                        } else {
                            C2086hf.m10022a((Object) t, j, C2086hf.m10014a((Object) t2, j));
                            m9730b(t, i);
                            break;
                        }
                    case 13:
                        if (!m9724a(t2, i)) {
                            break;
                        } else {
                            C2086hf.m10022a((Object) t, j, C2086hf.m10014a((Object) t2, j));
                            m9730b(t, i);
                            break;
                        }
                    case 14:
                        if (!m9724a(t2, i)) {
                            break;
                        } else {
                            C2086hf.m10023a((Object) t, j, C2086hf.m10030b(t2, j));
                            m9730b(t, i);
                            break;
                        }
                    case 15:
                        if (!m9724a(t2, i)) {
                            break;
                        } else {
                            C2086hf.m10022a((Object) t, j, C2086hf.m10014a((Object) t2, j));
                            m9730b(t, i);
                            break;
                        }
                    case 16:
                        if (!m9724a(t2, i)) {
                            break;
                        } else {
                            C2086hf.m10023a((Object) t, j, C2086hf.m10030b(t2, j));
                            m9730b(t, i);
                            break;
                        }
                    case 17:
                        m9723a(t, t2, i);
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
                        this.f7808p.mo13895a(t, t2, j);
                        break;
                    case 50:
                        C2063gj.m9847a(this.f7811s, t, t2, j);
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
                        if (!m9725a(t2, i2, i)) {
                            break;
                        } else {
                            C2086hf.m10024a((Object) t, j, C2086hf.m10047f(t2, j));
                            m9731b(t, i2, i);
                            break;
                        }
                    case 60:
                        m9733b(t, t2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!m9725a(t2, i2, i)) {
                            break;
                        } else {
                            C2086hf.m10024a((Object) t, j, C2086hf.m10047f(t2, j));
                            m9731b(t, i2, i);
                            break;
                        }
                    case 68:
                        m9733b(t, t2, i);
                        break;
                }
            }
            if (!this.f7802j) {
                C2063gj.m9848a(this.f7809q, t, t2);
                if (this.f7800h) {
                    C2063gj.m9846a(this.f7810r, t, t2);
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    private final void m9723a(T t, T t2, int i) {
        long d = (long) (m9737d(i) & 1048575);
        if (m9724a(t2, i)) {
            Object f = C2086hf.m10047f(t, d);
            Object f2 = C2086hf.m10047f(t2, d);
            if (f != null && f2 != null) {
                C2086hf.m10024a((Object) t, d, C2010ek.m9561a(f, f2));
                m9730b(t, i);
            } else if (f2 != null) {
                C2086hf.m10024a((Object) t, d, f2);
                m9730b(t, i);
            }
        }
    }

    /* renamed from: b */
    private final void m9733b(T t, T t2, int i) {
        int d = m9737d(i);
        int i2 = this.f7795c[i];
        long j = (long) (d & 1048575);
        if (m9725a(t2, i2, i)) {
            Object f = C2086hf.m10047f(t, j);
            Object f2 = C2086hf.m10047f(t2, j);
            if (f != null && f2 != null) {
                C2086hf.m10024a((Object) t, j, C2010ek.m9561a(f, f2));
                m9731b(t, i2, i);
            } else if (f2 != null) {
                C2086hf.m10024a((Object) t, j, f2);
                m9731b(t, i2, i);
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
    public final int mo13930b(T r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            boolean r2 = r0.f7802j
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 0
            r7 = 1
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x055f
            sun.misc.Unsafe r2 = f7794b
            r12 = 0
            r13 = 0
        L_0x0016:
            int[] r14 = r0.f7795c
            int r14 = r14.length
            if (r12 >= r14) goto L_0x0557
            int r14 = r0.m9737d((int) r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.f7795c
            r3 = r3[r12]
            r14 = r14 & r8
            long r5 = (long) r14
            com.google.android.gms.internal.measurement.ec r14 = com.google.android.gms.internal.measurement.C1997ec.DOUBLE_LIST_PACKED
            int r14 = r14.mo13805a()
            if (r15 < r14) goto L_0x0041
            com.google.android.gms.internal.measurement.ec r14 = com.google.android.gms.internal.measurement.C1997ec.SINT64_LIST_PACKED
            int r14 = r14.mo13805a()
            if (r15 > r14) goto L_0x0041
            int[] r14 = r0.f7795c
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
            boolean r14 = r0.m9725a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r1, r5)
            com.google.android.gms.internal.measurement.fq r5 = (com.google.android.gms.internal.measurement.C2043fq) r5
            com.google.android.gms.internal.measurement.gh r6 = r0.m9714a((int) r12)
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9246c((int) r3, (com.google.android.gms.internal.measurement.C2043fq) r5, (com.google.android.gms.internal.measurement.C2061gh) r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x005e:
            boolean r14 = r0.m9725a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x0551
            long r5 = m9740e(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9258f((int) r3, (long) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x006f:
            boolean r14 = r0.m9725a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x0551
            int r5 = m9738d(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9265h((int) r3, (int) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0080:
            boolean r5 = r0.m9725a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9266h((int) r3, (long) r9)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x008d:
            boolean r5 = r0.m9725a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9272j(r3, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x009a:
            boolean r14 = r0.m9725a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x0551
            int r5 = m9738d(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9274k(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00ab:
            boolean r14 = r0.m9725a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x0551
            int r5 = m9738d(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9261g((int) r3, (int) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00bc:
            boolean r14 = r0.m9725a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r1, r5)
            com.google.android.gms.internal.measurement.cx r5 = (com.google.android.gms.internal.measurement.C1958cx) r5
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9244c((int) r3, (com.google.android.gms.internal.measurement.C1958cx) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00cf:
            boolean r14 = r0.m9725a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r1, r5)
            com.google.android.gms.internal.measurement.gh r6 = r0.m9714a((int) r12)
            int r3 = com.google.android.gms.internal.measurement.C2063gj.m9834a((int) r3, (java.lang.Object) r5, (com.google.android.gms.internal.measurement.C2061gh) r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00e4:
            boolean r14 = r0.m9725a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.measurement.C1958cx
            if (r6 == 0) goto L_0x00fb
            com.google.android.gms.internal.measurement.cx r5 = (com.google.android.gms.internal.measurement.C1958cx) r5
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9244c((int) r3, (com.google.android.gms.internal.measurement.C1958cx) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00fb:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9236b((int) r3, (java.lang.String) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0104:
            boolean r5 = r0.m9725a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9237b((int) r3, (boolean) r7)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0111:
            boolean r5 = r0.m9725a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9269i(r3, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x011e:
            boolean r5 = r0.m9725a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9262g((int) r3, (long) r9)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x012b:
            boolean r14 = r0.m9725a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x0551
            int r5 = m9738d(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9257f((int) r3, (int) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x013c:
            boolean r14 = r0.m9725a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x0551
            long r5 = m9740e(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9254e((int) r3, (long) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x014d:
            boolean r14 = r0.m9725a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x0551
            long r5 = m9740e(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9249d((int) r3, (long) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x015e:
            boolean r5 = r0.m9725a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9233b((int) r3, (float) r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x016b:
            boolean r5 = r0.m9725a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x0551
            r5 = 0
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9232b((int) r3, (double) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x017a:
            com.google.android.gms.internal.measurement.fl r14 = r0.f7811s
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r1, r5)
            java.lang.Object r6 = r0.m9729b((int) r12)
            int r3 = r14.mo13914a(r3, r5, r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x018b:
            java.util.List r5 = m9718a((java.lang.Object) r1, (long) r5)
            com.google.android.gms.internal.measurement.gh r6 = r0.m9714a((int) r12)
            int r3 = com.google.android.gms.internal.measurement.C2063gj.m9852b((int) r3, (java.util.List<com.google.android.gms.internal.measurement.C2043fq>) r5, (com.google.android.gms.internal.measurement.C2061gh) r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x019a:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C2063gj.m9860c(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f7803k
            if (r6 == 0) goto L_0x01ae
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01ae:
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9253e((int) r3)
            int r6 = com.google.android.gms.internal.measurement.C1976do.m9260g((int) r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x01bb:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C2063gj.m9875g(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f7803k
            if (r6 == 0) goto L_0x01cf
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01cf:
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9253e((int) r3)
            int r6 = com.google.android.gms.internal.measurement.C1976do.m9260g((int) r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x01dc:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C2063gj.m9881i(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f7803k
            if (r6 == 0) goto L_0x01f0
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01f0:
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9253e((int) r3)
            int r6 = com.google.android.gms.internal.measurement.C1976do.m9260g((int) r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x01fd:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C2063gj.m9878h(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f7803k
            if (r6 == 0) goto L_0x0211
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0211:
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9253e((int) r3)
            int r6 = com.google.android.gms.internal.measurement.C1976do.m9260g((int) r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x021e:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C2063gj.m9864d(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f7803k
            if (r6 == 0) goto L_0x0232
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0232:
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9253e((int) r3)
            int r6 = com.google.android.gms.internal.measurement.C1976do.m9260g((int) r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x023f:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C2063gj.m9872f(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f7803k
            if (r6 == 0) goto L_0x0253
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0253:
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9253e((int) r3)
            int r6 = com.google.android.gms.internal.measurement.C1976do.m9260g((int) r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0260:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C2063gj.m9884j(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f7803k
            if (r6 == 0) goto L_0x0274
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0274:
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9253e((int) r3)
            int r6 = com.google.android.gms.internal.measurement.C1976do.m9260g((int) r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0281:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C2063gj.m9878h(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f7803k
            if (r6 == 0) goto L_0x0295
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0295:
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9253e((int) r3)
            int r6 = com.google.android.gms.internal.measurement.C1976do.m9260g((int) r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x02a2:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C2063gj.m9881i(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f7803k
            if (r6 == 0) goto L_0x02b6
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02b6:
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9253e((int) r3)
            int r6 = com.google.android.gms.internal.measurement.C1976do.m9260g((int) r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x02c3:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C2063gj.m9868e(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f7803k
            if (r6 == 0) goto L_0x02d7
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02d7:
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9253e((int) r3)
            int r6 = com.google.android.gms.internal.measurement.C1976do.m9260g((int) r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x02e4:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C2063gj.m9854b(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f7803k
            if (r6 == 0) goto L_0x02f8
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02f8:
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9253e((int) r3)
            int r6 = com.google.android.gms.internal.measurement.C1976do.m9260g((int) r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0305:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C2063gj.m9838a((java.util.List<java.lang.Long>) r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f7803k
            if (r6 == 0) goto L_0x0319
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0319:
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9253e((int) r3)
            int r6 = com.google.android.gms.internal.measurement.C1976do.m9260g((int) r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0326:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C2063gj.m9878h(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f7803k
            if (r6 == 0) goto L_0x033a
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x033a:
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9253e((int) r3)
            int r6 = com.google.android.gms.internal.measurement.C1976do.m9260g((int) r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0347:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C2063gj.m9881i(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.f7803k
            if (r6 == 0) goto L_0x035b
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x035b:
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9253e((int) r3)
            int r6 = com.google.android.gms.internal.measurement.C1976do.m9260g((int) r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0368:
            java.util.List r5 = m9718a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C2063gj.m9859c(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0373:
            java.util.List r5 = m9718a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C2063gj.m9874g(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x037e:
            java.util.List r5 = m9718a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C2063gj.m9880i(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0389:
            java.util.List r5 = m9718a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C2063gj.m9877h(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0394:
            java.util.List r5 = m9718a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C2063gj.m9863d(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x039f:
            java.util.List r5 = m9718a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C2063gj.m9871f(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03aa:
            java.util.List r5 = m9718a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C2063gj.m9851b(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03b5:
            java.util.List r5 = m9718a((java.lang.Object) r1, (long) r5)
            com.google.android.gms.internal.measurement.gh r6 = r0.m9714a((int) r12)
            int r3 = com.google.android.gms.internal.measurement.C2063gj.m9836a((int) r3, (java.util.List<?>) r5, (com.google.android.gms.internal.measurement.C2061gh) r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03c4:
            java.util.List r5 = m9718a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C2063gj.m9835a((int) r3, (java.util.List<?>) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03cf:
            java.util.List r5 = m9718a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C2063gj.m9883j(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03da:
            java.util.List r5 = m9718a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C2063gj.m9877h(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03e5:
            java.util.List r5 = m9718a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C2063gj.m9880i(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03f0:
            java.util.List r5 = m9718a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C2063gj.m9867e(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03fb:
            java.util.List r5 = m9718a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C2063gj.m9853b((int) r3, (java.util.List<java.lang.Long>) r5, (boolean) r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0406:
            java.util.List r5 = m9718a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C2063gj.m9837a((int) r3, (java.util.List<java.lang.Long>) r5, (boolean) r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0411:
            java.util.List r5 = m9718a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C2063gj.m9877h(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x041c:
            java.util.List r5 = m9718a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C2063gj.m9880i(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0427:
            boolean r14 = r0.m9724a(r1, (int) r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r1, r5)
            com.google.android.gms.internal.measurement.fq r5 = (com.google.android.gms.internal.measurement.C2043fq) r5
            com.google.android.gms.internal.measurement.gh r6 = r0.m9714a((int) r12)
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9246c((int) r3, (com.google.android.gms.internal.measurement.C2043fq) r5, (com.google.android.gms.internal.measurement.C2061gh) r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x043e:
            boolean r14 = r0.m9724a(r1, (int) r12)
            if (r14 == 0) goto L_0x0551
            long r5 = com.google.android.gms.internal.measurement.C2086hf.m10030b(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9258f((int) r3, (long) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x044f:
            boolean r14 = r0.m9724a(r1, (int) r12)
            if (r14 == 0) goto L_0x0551
            int r5 = com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9265h((int) r3, (int) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0460:
            boolean r5 = r0.m9724a(r1, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9266h((int) r3, (long) r9)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x046d:
            boolean r5 = r0.m9724a(r1, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9272j(r3, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x047a:
            boolean r14 = r0.m9724a(r1, (int) r12)
            if (r14 == 0) goto L_0x0551
            int r5 = com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9274k(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x048b:
            boolean r14 = r0.m9724a(r1, (int) r12)
            if (r14 == 0) goto L_0x0551
            int r5 = com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9261g((int) r3, (int) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x049c:
            boolean r14 = r0.m9724a(r1, (int) r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r1, r5)
            com.google.android.gms.internal.measurement.cx r5 = (com.google.android.gms.internal.measurement.C1958cx) r5
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9244c((int) r3, (com.google.android.gms.internal.measurement.C1958cx) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04af:
            boolean r14 = r0.m9724a(r1, (int) r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r1, r5)
            com.google.android.gms.internal.measurement.gh r6 = r0.m9714a((int) r12)
            int r3 = com.google.android.gms.internal.measurement.C2063gj.m9834a((int) r3, (java.lang.Object) r5, (com.google.android.gms.internal.measurement.C2061gh) r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04c4:
            boolean r14 = r0.m9724a(r1, (int) r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.measurement.C1958cx
            if (r6 == 0) goto L_0x04db
            com.google.android.gms.internal.measurement.cx r5 = (com.google.android.gms.internal.measurement.C1958cx) r5
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9244c((int) r3, (com.google.android.gms.internal.measurement.C1958cx) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04db:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9236b((int) r3, (java.lang.String) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04e4:
            boolean r5 = r0.m9724a(r1, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9237b((int) r3, (boolean) r7)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04f0:
            boolean r5 = r0.m9724a(r1, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9269i(r3, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04fc:
            boolean r5 = r0.m9724a(r1, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9262g((int) r3, (long) r9)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0508:
            boolean r14 = r0.m9724a(r1, (int) r12)
            if (r14 == 0) goto L_0x0551
            int r5 = com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9257f((int) r3, (int) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0518:
            boolean r14 = r0.m9724a(r1, (int) r12)
            if (r14 == 0) goto L_0x0551
            long r5 = com.google.android.gms.internal.measurement.C2086hf.m10030b(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9254e((int) r3, (long) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0528:
            boolean r14 = r0.m9724a(r1, (int) r12)
            if (r14 == 0) goto L_0x0551
            long r5 = com.google.android.gms.internal.measurement.C2086hf.m10030b(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9249d((int) r3, (long) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0538:
            boolean r5 = r0.m9724a(r1, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9233b((int) r3, (float) r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0544:
            boolean r5 = r0.m9724a(r1, (int) r12)
            if (r5 == 0) goto L_0x0551
            r5 = 0
            int r3 = com.google.android.gms.internal.measurement.C1976do.m9232b((int) r3, (double) r5)
            int r13 = r13 + r3
        L_0x0551:
            int r12 = r12 + 3
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x0557:
            com.google.android.gms.internal.measurement.gz<?, ?> r2 = r0.f7809q
            int r1 = m9712a(r2, r1)
            int r13 = r13 + r1
            return r13
        L_0x055f:
            sun.misc.Unsafe r2 = f7794b
            r3 = -1
            r3 = 0
            r5 = 0
            r6 = -1
            r12 = 0
        L_0x0566:
            int[] r13 = r0.f7795c
            int r13 = r13.length
            if (r3 >= r13) goto L_0x0af7
            int r13 = r0.m9737d((int) r3)
            int[] r14 = r0.f7795c
            r14 = r14[r3]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r16 = r13 & r15
            int r15 = r16 >>> 20
            r4 = 17
            if (r15 > r4) goto L_0x0592
            int[] r4 = r0.f7795c
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
            boolean r4 = r0.f7803k
            if (r4 == 0) goto L_0x05b0
            com.google.android.gms.internal.measurement.ec r4 = com.google.android.gms.internal.measurement.C1997ec.DOUBLE_LIST_PACKED
            int r4 = r4.mo13805a()
            if (r15 < r4) goto L_0x05b0
            com.google.android.gms.internal.measurement.ec r4 = com.google.android.gms.internal.measurement.C1997ec.SINT64_LIST_PACKED
            int r4 = r4.mo13805a()
            if (r15 > r4) goto L_0x05b0
            int[] r4 = r0.f7795c
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
            boolean r4 = r0.m9725a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.measurement.fq r4 = (com.google.android.gms.internal.measurement.C2043fq) r4
            com.google.android.gms.internal.measurement.gh r9 = r0.m9714a((int) r3)
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9246c((int) r14, (com.google.android.gms.internal.measurement.C2043fq) r4, (com.google.android.gms.internal.measurement.C2061gh) r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x05d2:
            boolean r4 = r0.m9725a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            long r9 = m9740e(r1, r9)
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9258f((int) r14, (long) r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x05e3:
            boolean r4 = r0.m9725a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            int r4 = m9738d(r1, r9)
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9265h((int) r14, (int) r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x05f4:
            boolean r4 = r0.m9725a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            r9 = 0
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9266h((int) r14, (long) r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0603:
            boolean r4 = r0.m9725a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            r4 = 0
            int r9 = com.google.android.gms.internal.measurement.C1976do.m9272j(r14, r4)
            int r5 = r5 + r9
            goto L_0x09ca
        L_0x0611:
            boolean r4 = r0.m9725a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            int r4 = m9738d(r1, r9)
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9274k(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0622:
            boolean r4 = r0.m9725a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            int r4 = m9738d(r1, r9)
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9261g((int) r14, (int) r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0633:
            boolean r4 = r0.m9725a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.measurement.cx r4 = (com.google.android.gms.internal.measurement.C1958cx) r4
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9244c((int) r14, (com.google.android.gms.internal.measurement.C1958cx) r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0646:
            boolean r4 = r0.m9725a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.measurement.gh r9 = r0.m9714a((int) r3)
            int r4 = com.google.android.gms.internal.measurement.C2063gj.m9834a((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.measurement.C2061gh) r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x065b:
            boolean r4 = r0.m9725a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            java.lang.Object r4 = r2.getObject(r1, r9)
            boolean r9 = r4 instanceof com.google.android.gms.internal.measurement.C1958cx
            if (r9 == 0) goto L_0x0672
            com.google.android.gms.internal.measurement.cx r4 = (com.google.android.gms.internal.measurement.C1958cx) r4
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9244c((int) r14, (com.google.android.gms.internal.measurement.C1958cx) r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0672:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9236b((int) r14, (java.lang.String) r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x067b:
            boolean r4 = r0.m9725a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9237b((int) r14, (boolean) r7)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0688:
            boolean r4 = r0.m9725a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            r4 = 0
            int r9 = com.google.android.gms.internal.measurement.C1976do.m9269i(r14, r4)
            int r5 = r5 + r9
            goto L_0x09ca
        L_0x0696:
            boolean r4 = r0.m9725a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            r9 = 0
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9262g((int) r14, (long) r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x06a5:
            boolean r4 = r0.m9725a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            int r4 = m9738d(r1, r9)
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9257f((int) r14, (int) r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x06b6:
            boolean r4 = r0.m9725a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            long r9 = m9740e(r1, r9)
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9254e((int) r14, (long) r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x06c7:
            boolean r4 = r0.m9725a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            long r9 = m9740e(r1, r9)
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9249d((int) r14, (long) r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x06d8:
            boolean r4 = r0.m9725a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            r4 = 0
            int r9 = com.google.android.gms.internal.measurement.C1976do.m9233b((int) r14, (float) r4)
            int r5 = r5 + r9
            goto L_0x09ca
        L_0x06e6:
            boolean r4 = r0.m9725a(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            r9 = 0
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9232b((int) r14, (double) r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x06f5:
            com.google.android.gms.internal.measurement.fl r4 = r0.f7811s
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.lang.Object r10 = r0.m9729b((int) r3)
            int r4 = r4.mo13914a(r14, r9, r10)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0706:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.gh r9 = r0.m9714a((int) r3)
            int r4 = com.google.android.gms.internal.measurement.C2063gj.m9852b((int) r14, (java.util.List<com.google.android.gms.internal.measurement.C2043fq>) r4, (com.google.android.gms.internal.measurement.C2061gh) r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0717:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.measurement.C2063gj.m9860c(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f7803k
            if (r10 == 0) goto L_0x072b
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x072b:
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9253e((int) r14)
            int r10 = com.google.android.gms.internal.measurement.C1976do.m9260g((int) r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0738:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.measurement.C2063gj.m9875g(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f7803k
            if (r10 == 0) goto L_0x074c
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x074c:
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9253e((int) r14)
            int r10 = com.google.android.gms.internal.measurement.C1976do.m9260g((int) r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0759:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.measurement.C2063gj.m9881i(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f7803k
            if (r10 == 0) goto L_0x076d
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x076d:
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9253e((int) r14)
            int r10 = com.google.android.gms.internal.measurement.C1976do.m9260g((int) r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x077a:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.measurement.C2063gj.m9878h(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f7803k
            if (r10 == 0) goto L_0x078e
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x078e:
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9253e((int) r14)
            int r10 = com.google.android.gms.internal.measurement.C1976do.m9260g((int) r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x079b:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.measurement.C2063gj.m9864d(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f7803k
            if (r10 == 0) goto L_0x07af
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x07af:
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9253e((int) r14)
            int r10 = com.google.android.gms.internal.measurement.C1976do.m9260g((int) r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x07bc:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.measurement.C2063gj.m9872f(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f7803k
            if (r10 == 0) goto L_0x07d0
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x07d0:
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9253e((int) r14)
            int r10 = com.google.android.gms.internal.measurement.C1976do.m9260g((int) r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x07dd:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.measurement.C2063gj.m9884j(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f7803k
            if (r10 == 0) goto L_0x07f1
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x07f1:
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9253e((int) r14)
            int r10 = com.google.android.gms.internal.measurement.C1976do.m9260g((int) r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x07fe:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.measurement.C2063gj.m9878h(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f7803k
            if (r10 == 0) goto L_0x0812
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x0812:
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9253e((int) r14)
            int r10 = com.google.android.gms.internal.measurement.C1976do.m9260g((int) r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x081f:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.measurement.C2063gj.m9881i(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f7803k
            if (r10 == 0) goto L_0x0833
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x0833:
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9253e((int) r14)
            int r10 = com.google.android.gms.internal.measurement.C1976do.m9260g((int) r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0840:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.measurement.C2063gj.m9868e(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f7803k
            if (r10 == 0) goto L_0x0854
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x0854:
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9253e((int) r14)
            int r10 = com.google.android.gms.internal.measurement.C1976do.m9260g((int) r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0861:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.measurement.C2063gj.m9854b(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f7803k
            if (r10 == 0) goto L_0x0875
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x0875:
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9253e((int) r14)
            int r10 = com.google.android.gms.internal.measurement.C1976do.m9260g((int) r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0882:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.measurement.C2063gj.m9838a((java.util.List<java.lang.Long>) r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f7803k
            if (r10 == 0) goto L_0x0896
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x0896:
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9253e((int) r14)
            int r10 = com.google.android.gms.internal.measurement.C1976do.m9260g((int) r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x08a3:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.measurement.C2063gj.m9878h(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f7803k
            if (r10 == 0) goto L_0x08b7
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x08b7:
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9253e((int) r14)
            int r10 = com.google.android.gms.internal.measurement.C1976do.m9260g((int) r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x08c4:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.measurement.C2063gj.m9881i(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.f7803k
            if (r10 == 0) goto L_0x08d8
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x08d8:
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9253e((int) r14)
            int r10 = com.google.android.gms.internal.measurement.C1976do.m9260g((int) r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x08e5:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            r11 = 0
            int r4 = com.google.android.gms.internal.measurement.C2063gj.m9859c(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x08f3:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C2063gj.m9874g(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0901:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C2063gj.m9880i(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x090f:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C2063gj.m9877h(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x091d:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C2063gj.m9863d(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x092b:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C2063gj.m9871f(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0939:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C2063gj.m9851b(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0946:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.gh r9 = r0.m9714a((int) r3)
            int r4 = com.google.android.gms.internal.measurement.C2063gj.m9836a((int) r14, (java.util.List<?>) r4, (com.google.android.gms.internal.measurement.C2061gh) r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0957:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C2063gj.m9835a((int) r14, (java.util.List<?>) r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0963:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            r11 = 0
            int r4 = com.google.android.gms.internal.measurement.C2063gj.m9883j(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0970:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C2063gj.m9877h(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x097d:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C2063gj.m9880i(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x098a:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C2063gj.m9867e(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0997:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C2063gj.m9853b((int) r14, (java.util.List<java.lang.Long>) r4, (boolean) r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x09a4:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C2063gj.m9837a((int) r14, (java.util.List<java.lang.Long>) r4, (boolean) r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x09b1:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C2063gj.m9877h(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x09be:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C2063gj.m9880i(r14, r4, r11)
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
            com.google.android.gms.internal.measurement.fq r4 = (com.google.android.gms.internal.measurement.C2043fq) r4
            com.google.android.gms.internal.measurement.gh r9 = r0.m9714a((int) r3)
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9246c((int) r14, (com.google.android.gms.internal.measurement.C2043fq) r4, (com.google.android.gms.internal.measurement.C2061gh) r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x09e6:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            long r9 = r2.getLong(r1, r9)
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9258f((int) r14, (long) r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x09f4:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            int r4 = r2.getInt(r1, r9)
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9265h((int) r14, (int) r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a02:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            r9 = 0
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9266h((int) r14, (long) r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a0e:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            r4 = 0
            int r9 = com.google.android.gms.internal.measurement.C1976do.m9272j(r14, r4)
            int r5 = r5 + r9
            goto L_0x09ca
        L_0x0a19:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            int r4 = r2.getInt(r1, r9)
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9274k(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a27:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            int r4 = r2.getInt(r1, r9)
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9261g((int) r14, (int) r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a35:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.measurement.cx r4 = (com.google.android.gms.internal.measurement.C1958cx) r4
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9244c((int) r14, (com.google.android.gms.internal.measurement.C1958cx) r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a45:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.measurement.gh r9 = r0.m9714a((int) r3)
            int r4 = com.google.android.gms.internal.measurement.C2063gj.m9834a((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.measurement.C2061gh) r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a58:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            java.lang.Object r4 = r2.getObject(r1, r9)
            boolean r9 = r4 instanceof com.google.android.gms.internal.measurement.C1958cx
            if (r9 == 0) goto L_0x0a6d
            com.google.android.gms.internal.measurement.cx r4 = (com.google.android.gms.internal.measurement.C1958cx) r4
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9244c((int) r14, (com.google.android.gms.internal.measurement.C1958cx) r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a6d:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9236b((int) r14, (java.lang.String) r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a76:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            int r4 = com.google.android.gms.internal.measurement.C1976do.m9237b((int) r14, (boolean) r7)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a81:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            r4 = 0
            int r9 = com.google.android.gms.internal.measurement.C1976do.m9269i(r14, r4)
            int r5 = r5 + r9
            goto L_0x09cb
        L_0x0a8d:
            r4 = 0
            r9 = r12 & r16
            if (r9 == 0) goto L_0x09cb
            r9 = 0
            int r11 = com.google.android.gms.internal.measurement.C1976do.m9262g((int) r14, (long) r9)
            int r5 = r5 + r11
            r18 = r9
            goto L_0x0ace
        L_0x0a9c:
            r4 = 0
            r18 = 0
            r11 = r12 & r16
            if (r11 == 0) goto L_0x0ace
            int r9 = r2.getInt(r1, r9)
            int r9 = com.google.android.gms.internal.measurement.C1976do.m9257f((int) r14, (int) r9)
            int r5 = r5 + r9
            goto L_0x0ace
        L_0x0aad:
            r4 = 0
            r18 = 0
            r11 = r12 & r16
            if (r11 == 0) goto L_0x0ace
            long r9 = r2.getLong(r1, r9)
            int r9 = com.google.android.gms.internal.measurement.C1976do.m9254e((int) r14, (long) r9)
            int r5 = r5 + r9
            goto L_0x0ace
        L_0x0abe:
            r4 = 0
            r18 = 0
            r11 = r12 & r16
            if (r11 == 0) goto L_0x0ace
            long r9 = r2.getLong(r1, r9)
            int r9 = com.google.android.gms.internal.measurement.C1976do.m9249d((int) r14, (long) r9)
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
            int r10 = com.google.android.gms.internal.measurement.C1976do.m9233b((int) r14, (float) r9)
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
            int r13 = com.google.android.gms.internal.measurement.C1976do.m9232b((int) r14, (double) r10)
            int r5 = r5 + r13
        L_0x0aef:
            int r3 = r3 + 3
            r9 = r18
            r4 = 0
            r11 = 0
            goto L_0x0566
        L_0x0af7:
            com.google.android.gms.internal.measurement.gz<?, ?> r2 = r0.f7809q
            int r2 = m9712a(r2, r1)
            int r5 = r5 + r2
            boolean r2 = r0.f7800h
            if (r2 == 0) goto L_0x0b0d
            com.google.android.gms.internal.measurement.dw<?> r2 = r0.f7810r
            com.google.android.gms.internal.measurement.dz r1 = r2.mo13777a((java.lang.Object) r1)
            int r1 = r1.mo13795h()
            int r5 = r5 + r1
        L_0x0b0d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2047fu.mo13930b(java.lang.Object):int");
    }

    /* renamed from: a */
    private static <UT, UB> int m9712a(C2079gz<UT, UB> gzVar, T t) {
        return gzVar.mo14001f(gzVar.mo13993b(t));
    }

    /* renamed from: a */
    private static <E> List<E> m9718a(Object obj, long j) {
        return (List) C2086hf.m10047f(obj, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0511  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x054f  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0a27  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13928a(T r14, com.google.android.gms.internal.measurement.C2105hu r15) {
        /*
            r13 = this;
            int r0 = r15.mo13727a()
            int r1 = com.google.android.gms.internal.measurement.C2003ei.C2008e.f7740k
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x0527
            com.google.android.gms.internal.measurement.gz<?, ?> r0 = r13.f7809q
            m9720a(r0, r14, (com.google.android.gms.internal.measurement.C2105hu) r15)
            boolean r0 = r13.f7800h
            if (r0 == 0) goto L_0x0030
            com.google.android.gms.internal.measurement.dw<?> r0 = r13.f7810r
            com.google.android.gms.internal.measurement.dz r0 = r0.mo13777a((java.lang.Object) r14)
            boolean r1 = r0.mo13787b()
            if (r1 != 0) goto L_0x0030
            java.util.Iterator r0 = r0.mo13793f()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0032
        L_0x0030:
            r0 = r3
            r1 = r0
        L_0x0032:
            int[] r7 = r13.f7795c
            int r7 = r7.length
            int r7 = r7 + -3
        L_0x0037:
            if (r7 < 0) goto L_0x050f
            int r8 = r13.m9737d((int) r7)
            int[] r9 = r13.f7795c
            r9 = r9[r7]
        L_0x0041:
            if (r1 == 0) goto L_0x005f
            com.google.android.gms.internal.measurement.dw<?> r10 = r13.f7810r
            int r10 = r10.mo13776a((java.util.Map.Entry<?, ?>) r1)
            if (r10 <= r9) goto L_0x005f
            com.google.android.gms.internal.measurement.dw<?> r10 = r13.f7810r
            r10.mo13782a(r15, r1)
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
            boolean r10 = r13.m9725a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            com.google.android.gms.internal.measurement.gh r10 = r13.m9714a((int) r7)
            r15.mo13745b((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.measurement.C2061gh) r10)
            goto L_0x050b
        L_0x007d:
            boolean r10 = r13.m9725a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m9740e(r14, r10)
            r15.mo13756e((int) r9, (long) r10)
            goto L_0x050b
        L_0x008e:
            boolean r10 = r13.m9725a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m9738d(r14, r10)
            r15.mo13758f(r9, r8)
            goto L_0x050b
        L_0x009f:
            boolean r10 = r13.m9725a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m9740e(r14, r10)
            r15.mo13744b((int) r9, (long) r10)
            goto L_0x050b
        L_0x00b0:
            boolean r10 = r13.m9725a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m9738d(r14, r10)
            r15.mo13731a((int) r9, (int) r8)
            goto L_0x050b
        L_0x00c1:
            boolean r10 = r13.m9725a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m9738d(r14, r10)
            r15.mo13743b((int) r9, (int) r8)
            goto L_0x050b
        L_0x00d2:
            boolean r10 = r13.m9725a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m9738d(r14, r10)
            r15.mo13755e((int) r9, (int) r8)
            goto L_0x050b
        L_0x00e3:
            boolean r10 = r13.m9725a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            com.google.android.gms.internal.measurement.cx r8 = (com.google.android.gms.internal.measurement.C1958cx) r8
            r15.mo13733a((int) r9, (com.google.android.gms.internal.measurement.C1958cx) r8)
            goto L_0x050b
        L_0x00f6:
            boolean r10 = r13.m9725a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            com.google.android.gms.internal.measurement.gh r10 = r13.m9714a((int) r7)
            r15.mo13736a((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.measurement.C2061gh) r10)
            goto L_0x050b
        L_0x010b:
            boolean r10 = r13.m9725a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            m9719a((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.measurement.C2105hu) r15)
            goto L_0x050b
        L_0x011c:
            boolean r10 = r13.m9725a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = m9742f(r14, r10)
            r15.mo13741a((int) r9, (boolean) r8)
            goto L_0x050b
        L_0x012d:
            boolean r10 = r13.m9725a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m9738d(r14, r10)
            r15.mo13752d((int) r9, (int) r8)
            goto L_0x050b
        L_0x013e:
            boolean r10 = r13.m9725a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m9740e(r14, r10)
            r15.mo13753d((int) r9, (long) r10)
            goto L_0x050b
        L_0x014f:
            boolean r10 = r13.m9725a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m9738d(r14, r10)
            r15.mo13749c((int) r9, (int) r8)
            goto L_0x050b
        L_0x0160:
            boolean r10 = r13.m9725a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m9740e(r14, r10)
            r15.mo13750c((int) r9, (long) r10)
            goto L_0x050b
        L_0x0171:
            boolean r10 = r13.m9725a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m9740e(r14, r10)
            r15.mo13732a((int) r9, (long) r10)
            goto L_0x050b
        L_0x0182:
            boolean r10 = r13.m9725a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = m9734c(r14, r10)
            r15.mo13730a((int) r9, (float) r8)
            goto L_0x050b
        L_0x0193:
            boolean r10 = r13.m9725a(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = m9728b(r14, (long) r10)
            r15.mo13729a((int) r9, (double) r10)
            goto L_0x050b
        L_0x01a4:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            r13.m9721a((com.google.android.gms.internal.measurement.C2105hu) r15, (int) r9, (java.lang.Object) r8, (int) r7)
            goto L_0x050b
        L_0x01af:
            int[] r9 = r13.f7795c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.gh r10 = r13.m9714a((int) r7)
            com.google.android.gms.internal.measurement.C2063gj.m9857b((int) r9, (java.util.List<?>) r8, (com.google.android.gms.internal.measurement.C2105hu) r15, (com.google.android.gms.internal.measurement.C2061gh) r10)
            goto L_0x050b
        L_0x01c4:
            int[] r9 = r13.f7795c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C2063gj.m9870e(r9, r8, r15, r4)
            goto L_0x050b
        L_0x01d5:
            int[] r9 = r13.f7795c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C2063gj.m9885j(r9, r8, r15, r4)
            goto L_0x050b
        L_0x01e6:
            int[] r9 = r13.f7795c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C2063gj.m9876g(r9, r8, r15, r4)
            goto L_0x050b
        L_0x01f7:
            int[] r9 = r13.f7795c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C2063gj.m9887l(r9, r8, r15, r4)
            goto L_0x050b
        L_0x0208:
            int[] r9 = r13.f7795c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C2063gj.m9888m(r9, r8, r15, r4)
            goto L_0x050b
        L_0x0219:
            int[] r9 = r13.f7795c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C2063gj.m9882i(r9, r8, r15, r4)
            goto L_0x050b
        L_0x022a:
            int[] r9 = r13.f7795c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C2063gj.m9889n(r9, r8, r15, r4)
            goto L_0x050b
        L_0x023b:
            int[] r9 = r13.f7795c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C2063gj.m9886k(r9, r8, r15, r4)
            goto L_0x050b
        L_0x024c:
            int[] r9 = r13.f7795c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C2063gj.m9873f(r9, r8, r15, r4)
            goto L_0x050b
        L_0x025d:
            int[] r9 = r13.f7795c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C2063gj.m9879h(r9, r8, r15, r4)
            goto L_0x050b
        L_0x026e:
            int[] r9 = r13.f7795c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C2063gj.m9866d(r9, r8, r15, r4)
            goto L_0x050b
        L_0x027f:
            int[] r9 = r13.f7795c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C2063gj.m9862c(r9, r8, r15, r4)
            goto L_0x050b
        L_0x0290:
            int[] r9 = r13.f7795c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C2063gj.m9858b((int) r9, (java.util.List<java.lang.Float>) r8, (com.google.android.gms.internal.measurement.C2105hu) r15, (boolean) r4)
            goto L_0x050b
        L_0x02a1:
            int[] r9 = r13.f7795c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C2063gj.m9845a((int) r9, (java.util.List<java.lang.Double>) r8, (com.google.android.gms.internal.measurement.C2105hu) r15, (boolean) r4)
            goto L_0x050b
        L_0x02b2:
            int[] r9 = r13.f7795c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C2063gj.m9870e(r9, r8, r15, r5)
            goto L_0x050b
        L_0x02c3:
            int[] r9 = r13.f7795c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C2063gj.m9885j(r9, r8, r15, r5)
            goto L_0x050b
        L_0x02d4:
            int[] r9 = r13.f7795c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C2063gj.m9876g(r9, r8, r15, r5)
            goto L_0x050b
        L_0x02e5:
            int[] r9 = r13.f7795c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C2063gj.m9887l(r9, r8, r15, r5)
            goto L_0x050b
        L_0x02f6:
            int[] r9 = r13.f7795c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C2063gj.m9888m(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0307:
            int[] r9 = r13.f7795c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C2063gj.m9882i(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0318:
            int[] r9 = r13.f7795c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C2063gj.m9856b((int) r9, (java.util.List<com.google.android.gms.internal.measurement.C1958cx>) r8, (com.google.android.gms.internal.measurement.C2105hu) r15)
            goto L_0x050b
        L_0x0329:
            int[] r9 = r13.f7795c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.gh r10 = r13.m9714a((int) r7)
            com.google.android.gms.internal.measurement.C2063gj.m9844a((int) r9, (java.util.List<?>) r8, (com.google.android.gms.internal.measurement.C2105hu) r15, (com.google.android.gms.internal.measurement.C2061gh) r10)
            goto L_0x050b
        L_0x033e:
            int[] r9 = r13.f7795c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C2063gj.m9843a((int) r9, (java.util.List<java.lang.String>) r8, (com.google.android.gms.internal.measurement.C2105hu) r15)
            goto L_0x050b
        L_0x034f:
            int[] r9 = r13.f7795c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C2063gj.m9889n(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0360:
            int[] r9 = r13.f7795c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C2063gj.m9886k(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0371:
            int[] r9 = r13.f7795c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C2063gj.m9873f(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0382:
            int[] r9 = r13.f7795c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C2063gj.m9879h(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0393:
            int[] r9 = r13.f7795c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C2063gj.m9866d(r9, r8, r15, r5)
            goto L_0x050b
        L_0x03a4:
            int[] r9 = r13.f7795c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C2063gj.m9862c(r9, r8, r15, r5)
            goto L_0x050b
        L_0x03b5:
            int[] r9 = r13.f7795c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C2063gj.m9858b((int) r9, (java.util.List<java.lang.Float>) r8, (com.google.android.gms.internal.measurement.C2105hu) r15, (boolean) r5)
            goto L_0x050b
        L_0x03c6:
            int[] r9 = r13.f7795c
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C2063gj.m9845a((int) r9, (java.util.List<java.lang.Double>) r8, (com.google.android.gms.internal.measurement.C2105hu) r15, (boolean) r5)
            goto L_0x050b
        L_0x03d7:
            boolean r10 = r13.m9724a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            com.google.android.gms.internal.measurement.gh r10 = r13.m9714a((int) r7)
            r15.mo13745b((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.measurement.C2061gh) r10)
            goto L_0x050b
        L_0x03ec:
            boolean r10 = r13.m9724a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.C2086hf.m10030b(r14, r10)
            r15.mo13756e((int) r9, (long) r10)
            goto L_0x050b
        L_0x03fd:
            boolean r10 = r13.m9724a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r14, (long) r10)
            r15.mo13758f(r9, r8)
            goto L_0x050b
        L_0x040e:
            boolean r10 = r13.m9724a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.C2086hf.m10030b(r14, r10)
            r15.mo13744b((int) r9, (long) r10)
            goto L_0x050b
        L_0x041f:
            boolean r10 = r13.m9724a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r14, (long) r10)
            r15.mo13731a((int) r9, (int) r8)
            goto L_0x050b
        L_0x0430:
            boolean r10 = r13.m9724a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r14, (long) r10)
            r15.mo13743b((int) r9, (int) r8)
            goto L_0x050b
        L_0x0441:
            boolean r10 = r13.m9724a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r14, (long) r10)
            r15.mo13755e((int) r9, (int) r8)
            goto L_0x050b
        L_0x0452:
            boolean r10 = r13.m9724a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            com.google.android.gms.internal.measurement.cx r8 = (com.google.android.gms.internal.measurement.C1958cx) r8
            r15.mo13733a((int) r9, (com.google.android.gms.internal.measurement.C1958cx) r8)
            goto L_0x050b
        L_0x0465:
            boolean r10 = r13.m9724a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            com.google.android.gms.internal.measurement.gh r10 = r13.m9714a((int) r7)
            r15.mo13736a((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.measurement.C2061gh) r10)
            goto L_0x050b
        L_0x047a:
            boolean r10 = r13.m9724a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r10)
            m9719a((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.measurement.C2105hu) r15)
            goto L_0x050b
        L_0x048b:
            boolean r10 = r13.m9724a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = com.google.android.gms.internal.measurement.C2086hf.m10038c(r14, r10)
            r15.mo13741a((int) r9, (boolean) r8)
            goto L_0x050b
        L_0x049c:
            boolean r10 = r13.m9724a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r14, (long) r10)
            r15.mo13752d((int) r9, (int) r8)
            goto L_0x050b
        L_0x04ac:
            boolean r10 = r13.m9724a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.C2086hf.m10030b(r14, r10)
            r15.mo13753d((int) r9, (long) r10)
            goto L_0x050b
        L_0x04bc:
            boolean r10 = r13.m9724a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r14, (long) r10)
            r15.mo13749c((int) r9, (int) r8)
            goto L_0x050b
        L_0x04cc:
            boolean r10 = r13.m9724a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.C2086hf.m10030b(r14, r10)
            r15.mo13750c((int) r9, (long) r10)
            goto L_0x050b
        L_0x04dc:
            boolean r10 = r13.m9724a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.C2086hf.m10030b(r14, r10)
            r15.mo13732a((int) r9, (long) r10)
            goto L_0x050b
        L_0x04ec:
            boolean r10 = r13.m9724a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = com.google.android.gms.internal.measurement.C2086hf.m10039d(r14, r10)
            r15.mo13730a((int) r9, (float) r8)
            goto L_0x050b
        L_0x04fc:
            boolean r10 = r13.m9724a(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = com.google.android.gms.internal.measurement.C2086hf.m10044e(r14, r10)
            r15.mo13729a((int) r9, (double) r10)
        L_0x050b:
            int r7 = r7 + -3
            goto L_0x0037
        L_0x050f:
            if (r1 == 0) goto L_0x0526
            com.google.android.gms.internal.measurement.dw<?> r14 = r13.f7810r
            r14.mo13782a(r15, r1)
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
            boolean r0 = r13.f7802j
            if (r0 == 0) goto L_0x0a42
            boolean r0 = r13.f7800h
            if (r0 == 0) goto L_0x0546
            com.google.android.gms.internal.measurement.dw<?> r0 = r13.f7810r
            com.google.android.gms.internal.measurement.dz r0 = r0.mo13777a((java.lang.Object) r14)
            boolean r1 = r0.mo13787b()
            if (r1 != 0) goto L_0x0546
            java.util.Iterator r0 = r0.mo13791e()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0548
        L_0x0546:
            r0 = r3
            r1 = r0
        L_0x0548:
            int[] r7 = r13.f7795c
            int r7 = r7.length
            r8 = r1
            r1 = 0
        L_0x054d:
            if (r1 >= r7) goto L_0x0a25
            int r9 = r13.m9737d((int) r1)
            int[] r10 = r13.f7795c
            r10 = r10[r1]
        L_0x0557:
            if (r8 == 0) goto L_0x0575
            com.google.android.gms.internal.measurement.dw<?> r11 = r13.f7810r
            int r11 = r11.mo13776a((java.util.Map.Entry<?, ?>) r8)
            if (r11 > r10) goto L_0x0575
            com.google.android.gms.internal.measurement.dw<?> r11 = r13.f7810r
            r11.mo13782a(r15, r8)
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
            boolean r11 = r13.m9725a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            com.google.android.gms.internal.measurement.gh r11 = r13.m9714a((int) r1)
            r15.mo13745b((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.measurement.C2061gh) r11)
            goto L_0x0a21
        L_0x0593:
            boolean r11 = r13.m9725a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m9740e(r14, r11)
            r15.mo13756e((int) r10, (long) r11)
            goto L_0x0a21
        L_0x05a4:
            boolean r11 = r13.m9725a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m9738d(r14, r11)
            r15.mo13758f(r10, r9)
            goto L_0x0a21
        L_0x05b5:
            boolean r11 = r13.m9725a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m9740e(r14, r11)
            r15.mo13744b((int) r10, (long) r11)
            goto L_0x0a21
        L_0x05c6:
            boolean r11 = r13.m9725a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m9738d(r14, r11)
            r15.mo13731a((int) r10, (int) r9)
            goto L_0x0a21
        L_0x05d7:
            boolean r11 = r13.m9725a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m9738d(r14, r11)
            r15.mo13743b((int) r10, (int) r9)
            goto L_0x0a21
        L_0x05e8:
            boolean r11 = r13.m9725a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m9738d(r14, r11)
            r15.mo13755e((int) r10, (int) r9)
            goto L_0x0a21
        L_0x05f9:
            boolean r11 = r13.m9725a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            com.google.android.gms.internal.measurement.cx r9 = (com.google.android.gms.internal.measurement.C1958cx) r9
            r15.mo13733a((int) r10, (com.google.android.gms.internal.measurement.C1958cx) r9)
            goto L_0x0a21
        L_0x060c:
            boolean r11 = r13.m9725a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            com.google.android.gms.internal.measurement.gh r11 = r13.m9714a((int) r1)
            r15.mo13736a((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.measurement.C2061gh) r11)
            goto L_0x0a21
        L_0x0621:
            boolean r11 = r13.m9725a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            m9719a((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.measurement.C2105hu) r15)
            goto L_0x0a21
        L_0x0632:
            boolean r11 = r13.m9725a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = m9742f(r14, r11)
            r15.mo13741a((int) r10, (boolean) r9)
            goto L_0x0a21
        L_0x0643:
            boolean r11 = r13.m9725a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m9738d(r14, r11)
            r15.mo13752d((int) r10, (int) r9)
            goto L_0x0a21
        L_0x0654:
            boolean r11 = r13.m9725a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m9740e(r14, r11)
            r15.mo13753d((int) r10, (long) r11)
            goto L_0x0a21
        L_0x0665:
            boolean r11 = r13.m9725a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m9738d(r14, r11)
            r15.mo13749c((int) r10, (int) r9)
            goto L_0x0a21
        L_0x0676:
            boolean r11 = r13.m9725a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m9740e(r14, r11)
            r15.mo13750c((int) r10, (long) r11)
            goto L_0x0a21
        L_0x0687:
            boolean r11 = r13.m9725a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m9740e(r14, r11)
            r15.mo13732a((int) r10, (long) r11)
            goto L_0x0a21
        L_0x0698:
            boolean r11 = r13.m9725a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = m9734c(r14, r11)
            r15.mo13730a((int) r10, (float) r9)
            goto L_0x0a21
        L_0x06a9:
            boolean r11 = r13.m9725a(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = m9728b(r14, (long) r11)
            r15.mo13729a((int) r10, (double) r11)
            goto L_0x0a21
        L_0x06ba:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            r13.m9721a((com.google.android.gms.internal.measurement.C2105hu) r15, (int) r10, (java.lang.Object) r9, (int) r1)
            goto L_0x0a21
        L_0x06c5:
            int[] r10 = r13.f7795c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.gh r11 = r13.m9714a((int) r1)
            com.google.android.gms.internal.measurement.C2063gj.m9857b((int) r10, (java.util.List<?>) r9, (com.google.android.gms.internal.measurement.C2105hu) r15, (com.google.android.gms.internal.measurement.C2061gh) r11)
            goto L_0x0a21
        L_0x06da:
            int[] r10 = r13.f7795c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C2063gj.m9870e(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x06eb:
            int[] r10 = r13.f7795c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C2063gj.m9885j(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x06fc:
            int[] r10 = r13.f7795c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C2063gj.m9876g(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x070d:
            int[] r10 = r13.f7795c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C2063gj.m9887l(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x071e:
            int[] r10 = r13.f7795c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C2063gj.m9888m(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x072f:
            int[] r10 = r13.f7795c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C2063gj.m9882i(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x0740:
            int[] r10 = r13.f7795c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C2063gj.m9889n(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x0751:
            int[] r10 = r13.f7795c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C2063gj.m9886k(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x0762:
            int[] r10 = r13.f7795c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C2063gj.m9873f(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x0773:
            int[] r10 = r13.f7795c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C2063gj.m9879h(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x0784:
            int[] r10 = r13.f7795c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C2063gj.m9866d(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x0795:
            int[] r10 = r13.f7795c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C2063gj.m9862c(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x07a6:
            int[] r10 = r13.f7795c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C2063gj.m9858b((int) r10, (java.util.List<java.lang.Float>) r9, (com.google.android.gms.internal.measurement.C2105hu) r15, (boolean) r4)
            goto L_0x0a21
        L_0x07b7:
            int[] r10 = r13.f7795c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C2063gj.m9845a((int) r10, (java.util.List<java.lang.Double>) r9, (com.google.android.gms.internal.measurement.C2105hu) r15, (boolean) r4)
            goto L_0x0a21
        L_0x07c8:
            int[] r10 = r13.f7795c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C2063gj.m9870e(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x07d9:
            int[] r10 = r13.f7795c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C2063gj.m9885j(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x07ea:
            int[] r10 = r13.f7795c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C2063gj.m9876g(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x07fb:
            int[] r10 = r13.f7795c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C2063gj.m9887l(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x080c:
            int[] r10 = r13.f7795c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C2063gj.m9888m(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x081d:
            int[] r10 = r13.f7795c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C2063gj.m9882i(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x082e:
            int[] r10 = r13.f7795c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C2063gj.m9856b((int) r10, (java.util.List<com.google.android.gms.internal.measurement.C1958cx>) r9, (com.google.android.gms.internal.measurement.C2105hu) r15)
            goto L_0x0a21
        L_0x083f:
            int[] r10 = r13.f7795c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.gh r11 = r13.m9714a((int) r1)
            com.google.android.gms.internal.measurement.C2063gj.m9844a((int) r10, (java.util.List<?>) r9, (com.google.android.gms.internal.measurement.C2105hu) r15, (com.google.android.gms.internal.measurement.C2061gh) r11)
            goto L_0x0a21
        L_0x0854:
            int[] r10 = r13.f7795c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C2063gj.m9843a((int) r10, (java.util.List<java.lang.String>) r9, (com.google.android.gms.internal.measurement.C2105hu) r15)
            goto L_0x0a21
        L_0x0865:
            int[] r10 = r13.f7795c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C2063gj.m9889n(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x0876:
            int[] r10 = r13.f7795c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C2063gj.m9886k(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x0887:
            int[] r10 = r13.f7795c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C2063gj.m9873f(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x0898:
            int[] r10 = r13.f7795c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C2063gj.m9879h(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x08a9:
            int[] r10 = r13.f7795c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C2063gj.m9866d(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x08ba:
            int[] r10 = r13.f7795c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C2063gj.m9862c(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x08cb:
            int[] r10 = r13.f7795c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C2063gj.m9858b((int) r10, (java.util.List<java.lang.Float>) r9, (com.google.android.gms.internal.measurement.C2105hu) r15, (boolean) r5)
            goto L_0x0a21
        L_0x08dc:
            int[] r10 = r13.f7795c
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C2063gj.m9845a((int) r10, (java.util.List<java.lang.Double>) r9, (com.google.android.gms.internal.measurement.C2105hu) r15, (boolean) r5)
            goto L_0x0a21
        L_0x08ed:
            boolean r11 = r13.m9724a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            com.google.android.gms.internal.measurement.gh r11 = r13.m9714a((int) r1)
            r15.mo13745b((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.measurement.C2061gh) r11)
            goto L_0x0a21
        L_0x0902:
            boolean r11 = r13.m9724a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.measurement.C2086hf.m10030b(r14, r11)
            r15.mo13756e((int) r10, (long) r11)
            goto L_0x0a21
        L_0x0913:
            boolean r11 = r13.m9724a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r14, (long) r11)
            r15.mo13758f(r10, r9)
            goto L_0x0a21
        L_0x0924:
            boolean r11 = r13.m9724a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.measurement.C2086hf.m10030b(r14, r11)
            r15.mo13744b((int) r10, (long) r11)
            goto L_0x0a21
        L_0x0935:
            boolean r11 = r13.m9724a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r14, (long) r11)
            r15.mo13731a((int) r10, (int) r9)
            goto L_0x0a21
        L_0x0946:
            boolean r11 = r13.m9724a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r14, (long) r11)
            r15.mo13743b((int) r10, (int) r9)
            goto L_0x0a21
        L_0x0957:
            boolean r11 = r13.m9724a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r14, (long) r11)
            r15.mo13755e((int) r10, (int) r9)
            goto L_0x0a21
        L_0x0968:
            boolean r11 = r13.m9724a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            com.google.android.gms.internal.measurement.cx r9 = (com.google.android.gms.internal.measurement.C1958cx) r9
            r15.mo13733a((int) r10, (com.google.android.gms.internal.measurement.C1958cx) r9)
            goto L_0x0a21
        L_0x097b:
            boolean r11 = r13.m9724a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            com.google.android.gms.internal.measurement.gh r11 = r13.m9714a((int) r1)
            r15.mo13736a((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.measurement.C2061gh) r11)
            goto L_0x0a21
        L_0x0990:
            boolean r11 = r13.m9724a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r11)
            m9719a((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.measurement.C2105hu) r15)
            goto L_0x0a21
        L_0x09a1:
            boolean r11 = r13.m9724a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = com.google.android.gms.internal.measurement.C2086hf.m10038c(r14, r11)
            r15.mo13741a((int) r10, (boolean) r9)
            goto L_0x0a21
        L_0x09b2:
            boolean r11 = r13.m9724a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r14, (long) r11)
            r15.mo13752d((int) r10, (int) r9)
            goto L_0x0a21
        L_0x09c2:
            boolean r11 = r13.m9724a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.measurement.C2086hf.m10030b(r14, r11)
            r15.mo13753d((int) r10, (long) r11)
            goto L_0x0a21
        L_0x09d2:
            boolean r11 = r13.m9724a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.measurement.C2086hf.m10014a((java.lang.Object) r14, (long) r11)
            r15.mo13749c((int) r10, (int) r9)
            goto L_0x0a21
        L_0x09e2:
            boolean r11 = r13.m9724a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.measurement.C2086hf.m10030b(r14, r11)
            r15.mo13750c((int) r10, (long) r11)
            goto L_0x0a21
        L_0x09f2:
            boolean r11 = r13.m9724a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.measurement.C2086hf.m10030b(r14, r11)
            r15.mo13732a((int) r10, (long) r11)
            goto L_0x0a21
        L_0x0a02:
            boolean r11 = r13.m9724a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = com.google.android.gms.internal.measurement.C2086hf.m10039d(r14, r11)
            r15.mo13730a((int) r10, (float) r9)
            goto L_0x0a21
        L_0x0a12:
            boolean r11 = r13.m9724a(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = com.google.android.gms.internal.measurement.C2086hf.m10044e(r14, r11)
            r15.mo13729a((int) r10, (double) r11)
        L_0x0a21:
            int r1 = r1 + 3
            goto L_0x054d
        L_0x0a25:
            if (r8 == 0) goto L_0x0a3c
            com.google.android.gms.internal.measurement.dw<?> r1 = r13.f7810r
            r1.mo13782a(r15, r8)
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
            com.google.android.gms.internal.measurement.gz<?, ?> r0 = r13.f7809q
            m9720a(r0, r14, (com.google.android.gms.internal.measurement.C2105hu) r15)
            return
        L_0x0a42:
            r13.m9732b(r14, (com.google.android.gms.internal.measurement.C2105hu) r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2047fu.mo13928a(java.lang.Object, com.google.android.gms.internal.measurement.hu):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:172:0x0527  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m9732b(T r20, com.google.android.gms.internal.measurement.C2105hu r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            boolean r3 = r0.f7800h
            if (r3 == 0) goto L_0x0021
            com.google.android.gms.internal.measurement.dw<?> r3 = r0.f7810r
            com.google.android.gms.internal.measurement.dz r3 = r3.mo13777a((java.lang.Object) r1)
            boolean r5 = r3.mo13787b()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.mo13791e()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            r6 = -1
            int[] r7 = r0.f7795c
            int r7 = r7.length
            sun.misc.Unsafe r8 = f7794b
            r10 = r5
            r5 = 0
            r11 = 0
        L_0x002c:
            if (r5 >= r7) goto L_0x0525
            int r12 = r0.m9737d((int) r5)
            int[] r13 = r0.f7795c
            r13 = r13[r5]
            r14 = 267386880(0xff00000, float:2.3665827E-29)
            r14 = r14 & r12
            int r14 = r14 >>> 20
            boolean r15 = r0.f7802j
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r15 != 0) goto L_0x0061
            r15 = 17
            if (r14 > r15) goto L_0x0061
            int[] r15 = r0.f7795c
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
            com.google.android.gms.internal.measurement.dw<?> r4 = r0.f7810r
            int r4 = r4.mo13776a((java.util.Map.Entry<?, ?>) r10)
            if (r4 > r13) goto L_0x0083
            com.google.android.gms.internal.measurement.dw<?> r4 = r0.f7810r
            r4.mo13782a(r2, r10)
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
            boolean r9 = r0.m9725a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.measurement.gh r5 = r0.m9714a((int) r12)
            r2.mo13745b((int) r13, (java.lang.Object) r4, (com.google.android.gms.internal.measurement.C2061gh) r5)
            goto L_0x008b
        L_0x00a2:
            r12 = r18
            boolean r9 = r0.m9725a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            long r4 = m9740e(r1, r4)
            r2.mo13756e((int) r13, (long) r4)
            goto L_0x008b
        L_0x00b2:
            r12 = r18
            boolean r9 = r0.m9725a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m9738d(r1, r4)
            r2.mo13758f(r13, r4)
            goto L_0x008b
        L_0x00c2:
            r12 = r18
            boolean r9 = r0.m9725a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            long r4 = m9740e(r1, r4)
            r2.mo13744b((int) r13, (long) r4)
            goto L_0x008b
        L_0x00d2:
            r12 = r18
            boolean r9 = r0.m9725a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m9738d(r1, r4)
            r2.mo13731a((int) r13, (int) r4)
            goto L_0x008b
        L_0x00e2:
            r12 = r18
            boolean r9 = r0.m9725a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m9738d(r1, r4)
            r2.mo13743b((int) r13, (int) r4)
            goto L_0x008b
        L_0x00f2:
            r12 = r18
            boolean r9 = r0.m9725a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m9738d(r1, r4)
            r2.mo13755e((int) r13, (int) r4)
            goto L_0x008b
        L_0x0102:
            r12 = r18
            boolean r9 = r0.m9725a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.measurement.cx r4 = (com.google.android.gms.internal.measurement.C1958cx) r4
            r2.mo13733a((int) r13, (com.google.android.gms.internal.measurement.C1958cx) r4)
            goto L_0x008b
        L_0x0115:
            r12 = r18
            boolean r9 = r0.m9725a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.measurement.gh r5 = r0.m9714a((int) r12)
            r2.mo13736a((int) r13, (java.lang.Object) r4, (com.google.android.gms.internal.measurement.C2061gh) r5)
            goto L_0x008b
        L_0x012a:
            r12 = r18
            boolean r9 = r0.m9725a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            java.lang.Object r4 = r8.getObject(r1, r4)
            m9719a((int) r13, (java.lang.Object) r4, (com.google.android.gms.internal.measurement.C2105hu) r2)
            goto L_0x008b
        L_0x013b:
            r12 = r18
            boolean r9 = r0.m9725a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            boolean r4 = m9742f(r1, r4)
            r2.mo13741a((int) r13, (boolean) r4)
            goto L_0x008b
        L_0x014c:
            r12 = r18
            boolean r9 = r0.m9725a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m9738d(r1, r4)
            r2.mo13752d((int) r13, (int) r4)
            goto L_0x008b
        L_0x015d:
            r12 = r18
            boolean r9 = r0.m9725a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            long r4 = m9740e(r1, r4)
            r2.mo13753d((int) r13, (long) r4)
            goto L_0x008b
        L_0x016e:
            r12 = r18
            boolean r9 = r0.m9725a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            int r4 = m9738d(r1, r4)
            r2.mo13749c((int) r13, (int) r4)
            goto L_0x008b
        L_0x017f:
            r12 = r18
            boolean r9 = r0.m9725a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            long r4 = m9740e(r1, r4)
            r2.mo13750c((int) r13, (long) r4)
            goto L_0x008b
        L_0x0190:
            r12 = r18
            boolean r9 = r0.m9725a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            long r4 = m9740e(r1, r4)
            r2.mo13732a((int) r13, (long) r4)
            goto L_0x008b
        L_0x01a1:
            r12 = r18
            boolean r9 = r0.m9725a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            float r4 = m9734c(r1, r4)
            r2.mo13730a((int) r13, (float) r4)
            goto L_0x008b
        L_0x01b2:
            r12 = r18
            boolean r9 = r0.m9725a(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            double r4 = m9728b(r1, (long) r4)
            r2.mo13729a((int) r13, (double) r4)
            goto L_0x008b
        L_0x01c3:
            r12 = r18
            java.lang.Object r4 = r8.getObject(r1, r4)
            r0.m9721a((com.google.android.gms.internal.measurement.C2105hu) r2, (int) r13, (java.lang.Object) r4, (int) r12)
            goto L_0x008b
        L_0x01ce:
            r12 = r18
            int[] r9 = r0.f7795c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.gh r5 = r0.m9714a((int) r12)
            com.google.android.gms.internal.measurement.C2063gj.m9857b((int) r9, (java.util.List<?>) r4, (com.google.android.gms.internal.measurement.C2105hu) r2, (com.google.android.gms.internal.measurement.C2061gh) r5)
            goto L_0x008b
        L_0x01e3:
            r12 = r18
            int[] r9 = r0.f7795c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r13 = 1
            com.google.android.gms.internal.measurement.C2063gj.m9870e(r9, r4, r2, r13)
            goto L_0x008b
        L_0x01f5:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f7795c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C2063gj.m9885j(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0207:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f7795c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C2063gj.m9876g(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0219:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f7795c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C2063gj.m9887l(r9, r4, r2, r13)
            goto L_0x008b
        L_0x022b:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f7795c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C2063gj.m9888m(r9, r4, r2, r13)
            goto L_0x008b
        L_0x023d:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f7795c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C2063gj.m9882i(r9, r4, r2, r13)
            goto L_0x008b
        L_0x024f:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f7795c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C2063gj.m9889n(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0261:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f7795c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C2063gj.m9886k(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0273:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f7795c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C2063gj.m9873f(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0285:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f7795c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C2063gj.m9879h(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0297:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f7795c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C2063gj.m9866d(r9, r4, r2, r13)
            goto L_0x008b
        L_0x02a9:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f7795c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C2063gj.m9862c(r9, r4, r2, r13)
            goto L_0x008b
        L_0x02bb:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f7795c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C2063gj.m9858b((int) r9, (java.util.List<java.lang.Float>) r4, (com.google.android.gms.internal.measurement.C2105hu) r2, (boolean) r13)
            goto L_0x008b
        L_0x02cd:
            r12 = r18
            r13 = 1
            int[] r9 = r0.f7795c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C2063gj.m9845a((int) r9, (java.util.List<java.lang.Double>) r4, (com.google.android.gms.internal.measurement.C2105hu) r2, (boolean) r13)
            goto L_0x008b
        L_0x02df:
            r12 = r18
            int[] r9 = r0.f7795c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r13 = 0
            com.google.android.gms.internal.measurement.C2063gj.m9870e(r9, r4, r2, r13)
            goto L_0x008b
        L_0x02f1:
            r12 = r18
            r13 = 0
            int[] r9 = r0.f7795c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C2063gj.m9885j(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0303:
            r12 = r18
            r13 = 0
            int[] r9 = r0.f7795c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C2063gj.m9876g(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0315:
            r12 = r18
            r13 = 0
            int[] r9 = r0.f7795c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C2063gj.m9887l(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0327:
            r12 = r18
            r13 = 0
            int[] r9 = r0.f7795c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C2063gj.m9888m(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0339:
            r12 = r18
            r13 = 0
            int[] r9 = r0.f7795c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C2063gj.m9882i(r9, r4, r2, r13)
            goto L_0x008b
        L_0x034b:
            r12 = r18
            int[] r9 = r0.f7795c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C2063gj.m9856b((int) r9, (java.util.List<com.google.android.gms.internal.measurement.C1958cx>) r4, (com.google.android.gms.internal.measurement.C2105hu) r2)
            goto L_0x008b
        L_0x035c:
            r12 = r18
            int[] r9 = r0.f7795c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.gh r5 = r0.m9714a((int) r12)
            com.google.android.gms.internal.measurement.C2063gj.m9844a((int) r9, (java.util.List<?>) r4, (com.google.android.gms.internal.measurement.C2105hu) r2, (com.google.android.gms.internal.measurement.C2061gh) r5)
            goto L_0x008b
        L_0x0371:
            r12 = r18
            int[] r9 = r0.f7795c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C2063gj.m9843a((int) r9, (java.util.List<java.lang.String>) r4, (com.google.android.gms.internal.measurement.C2105hu) r2)
            goto L_0x008b
        L_0x0382:
            r12 = r18
            int[] r9 = r0.f7795c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r14 = 0
            com.google.android.gms.internal.measurement.C2063gj.m9889n(r9, r4, r2, r14)
            goto L_0x0521
        L_0x0394:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f7795c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C2063gj.m9886k(r9, r4, r2, r14)
            goto L_0x0521
        L_0x03a6:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f7795c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C2063gj.m9873f(r9, r4, r2, r14)
            goto L_0x0521
        L_0x03b8:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f7795c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C2063gj.m9879h(r9, r4, r2, r14)
            goto L_0x0521
        L_0x03ca:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f7795c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C2063gj.m9866d(r9, r4, r2, r14)
            goto L_0x0521
        L_0x03dc:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f7795c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C2063gj.m9862c(r9, r4, r2, r14)
            goto L_0x0521
        L_0x03ee:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f7795c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C2063gj.m9858b((int) r9, (java.util.List<java.lang.Float>) r4, (com.google.android.gms.internal.measurement.C2105hu) r2, (boolean) r14)
            goto L_0x0521
        L_0x0400:
            r12 = r18
            r14 = 0
            int[] r9 = r0.f7795c
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.C2063gj.m9845a((int) r9, (java.util.List<java.lang.Double>) r4, (com.google.android.gms.internal.measurement.C2105hu) r2, (boolean) r14)
            goto L_0x0521
        L_0x0412:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.measurement.gh r5 = r0.m9714a((int) r12)
            r2.mo13745b((int) r13, (java.lang.Object) r4, (com.google.android.gms.internal.measurement.C2061gh) r5)
            goto L_0x0521
        L_0x0425:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            long r4 = r8.getLong(r1, r4)
            r2.mo13756e((int) r13, (long) r4)
            goto L_0x0521
        L_0x0434:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.mo13758f(r13, r4)
            goto L_0x0521
        L_0x0443:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            long r4 = r8.getLong(r1, r4)
            r2.mo13744b((int) r13, (long) r4)
            goto L_0x0521
        L_0x0452:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.mo13731a((int) r13, (int) r4)
            goto L_0x0521
        L_0x0461:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.mo13743b((int) r13, (int) r4)
            goto L_0x0521
        L_0x0470:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.mo13755e((int) r13, (int) r4)
            goto L_0x0521
        L_0x047f:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.measurement.cx r4 = (com.google.android.gms.internal.measurement.C1958cx) r4
            r2.mo13733a((int) r13, (com.google.android.gms.internal.measurement.C1958cx) r4)
            goto L_0x0521
        L_0x0490:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.measurement.gh r5 = r0.m9714a((int) r12)
            r2.mo13736a((int) r13, (java.lang.Object) r4, (com.google.android.gms.internal.measurement.C2061gh) r5)
            goto L_0x0521
        L_0x04a3:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            java.lang.Object r4 = r8.getObject(r1, r4)
            m9719a((int) r13, (java.lang.Object) r4, (com.google.android.gms.internal.measurement.C2105hu) r2)
            goto L_0x0521
        L_0x04b2:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            boolean r4 = com.google.android.gms.internal.measurement.C2086hf.m10038c(r1, r4)
            r2.mo13741a((int) r13, (boolean) r4)
            goto L_0x0521
        L_0x04c0:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.mo13752d((int) r13, (int) r4)
            goto L_0x0521
        L_0x04ce:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            long r4 = r8.getLong(r1, r4)
            r2.mo13753d((int) r13, (long) r4)
            goto L_0x0521
        L_0x04dc:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.mo13749c((int) r13, (int) r4)
            goto L_0x0521
        L_0x04ea:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            long r4 = r8.getLong(r1, r4)
            r2.mo13750c((int) r13, (long) r4)
            goto L_0x0521
        L_0x04f8:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            long r4 = r8.getLong(r1, r4)
            r2.mo13732a((int) r13, (long) r4)
            goto L_0x0521
        L_0x0506:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            float r4 = com.google.android.gms.internal.measurement.C2086hf.m10039d(r1, r4)
            r2.mo13730a((int) r13, (float) r4)
            goto L_0x0521
        L_0x0514:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            double r4 = com.google.android.gms.internal.measurement.C2086hf.m10044e(r1, r4)
            r2.mo13729a((int) r13, (double) r4)
        L_0x0521:
            int r5 = r12 + 3
            goto L_0x002c
        L_0x0525:
            if (r10 == 0) goto L_0x053c
            com.google.android.gms.internal.measurement.dw<?> r4 = r0.f7810r
            r4.mo13782a(r2, r10)
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
            com.google.android.gms.internal.measurement.gz<?, ?> r3 = r0.f7809q
            m9720a(r3, r1, (com.google.android.gms.internal.measurement.C2105hu) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2047fu.m9732b(java.lang.Object, com.google.android.gms.internal.measurement.hu):void");
    }

    /* renamed from: a */
    private final <K, V> void m9721a(C2105hu huVar, int i, Object obj, int i2) {
        if (obj != null) {
            huVar.mo13734a(i, this.f7811s.mo13921f(m9729b(i2)), this.f7811s.mo13917b(obj));
        }
    }

    /* renamed from: a */
    private static <UT, UB> void m9720a(C2079gz<UT, UB> gzVar, T t, C2105hu huVar) {
        gzVar.mo13989a(gzVar.mo13993b(t), huVar);
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: a */
    public final void mo13927a(T r18, com.google.android.gms.internal.measurement.C2060gg r19, com.google.android.gms.internal.measurement.C1988dv r20) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r0 = r19
            r10 = r20
            if (r10 == 0) goto L_0x05f1
            com.google.android.gms.internal.measurement.gz<?, ?> r11 = r1.f7809q
            com.google.android.gms.internal.measurement.dw<?> r12 = r1.f7810r
            r13 = 0
            r3 = r13
            r14 = r3
        L_0x0011:
            int r4 = r19.mo13647a()     // Catch:{ all -> 0x05d9 }
            int r5 = r1.f7797e     // Catch:{ all -> 0x05d9 }
            r6 = -1
            if (r4 < r5) goto L_0x003e
            int r5 = r1.f7798f     // Catch:{ all -> 0x05d9 }
            if (r4 > r5) goto L_0x003e
            r5 = 0
            int[] r7 = r1.f7795c     // Catch:{ all -> 0x05d9 }
            int r7 = r7.length     // Catch:{ all -> 0x05d9 }
            int r7 = r7 / 3
            int r7 = r7 + -1
        L_0x0026:
            if (r5 > r7) goto L_0x003e
            int r8 = r7 + r5
            int r8 = r8 >>> 1
            int r9 = r8 * 3
            int[] r15 = r1.f7795c     // Catch:{ all -> 0x05d9 }
            r15 = r15[r9]     // Catch:{ all -> 0x05d9 }
            if (r4 != r15) goto L_0x0036
            r6 = r9
            goto L_0x003e
        L_0x0036:
            if (r4 >= r15) goto L_0x003b
            int r7 = r8 + -1
            goto L_0x0026
        L_0x003b:
            int r5 = r8 + 1
            goto L_0x0026
        L_0x003e:
            if (r6 >= 0) goto L_0x00a8
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r5) goto L_0x005c
            int r0 = r1.f7805m
        L_0x0047:
            int r3 = r1.f7806n
            if (r0 >= r3) goto L_0x0056
            int[] r3 = r1.f7804l
            r3 = r3[r0]
            java.lang.Object r14 = r1.m9716a((java.lang.Object) r2, (int) r3, r14, r11)
            int r0 = r0 + 1
            goto L_0x0047
        L_0x0056:
            if (r14 == 0) goto L_0x005b
            r11.mo13996b((java.lang.Object) r2, r14)
        L_0x005b:
            return
        L_0x005c:
            boolean r5 = r1.f7800h     // Catch:{ all -> 0x05d9 }
            if (r5 != 0) goto L_0x0062
            r5 = r13
            goto L_0x0069
        L_0x0062:
            com.google.android.gms.internal.measurement.fq r5 = r1.f7799g     // Catch:{ all -> 0x05d9 }
            java.lang.Object r4 = r12.mo13778a(r10, r5, r4)     // Catch:{ all -> 0x05d9 }
            r5 = r4
        L_0x0069:
            if (r5 == 0) goto L_0x0081
            if (r3 != 0) goto L_0x0071
            com.google.android.gms.internal.measurement.dz r3 = r12.mo13784b(r2)     // Catch:{ all -> 0x05d9 }
        L_0x0071:
            r15 = r3
            r3 = r12
            r4 = r19
            r6 = r20
            r7 = r15
            r8 = r14
            r9 = r11
            java.lang.Object r3 = r3.mo13779a(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x05d9 }
            r14 = r3
            r3 = r15
            goto L_0x0011
        L_0x0081:
            r11.mo13991a((com.google.android.gms.internal.measurement.C2060gg) r0)     // Catch:{ all -> 0x05d9 }
            if (r14 != 0) goto L_0x008b
            java.lang.Object r4 = r11.mo13997c(r2)     // Catch:{ all -> 0x05d9 }
            r14 = r4
        L_0x008b:
            boolean r4 = r11.mo13992a(r14, (com.google.android.gms.internal.measurement.C2060gg) r0)     // Catch:{ all -> 0x05d9 }
            if (r4 != 0) goto L_0x0011
            int r0 = r1.f7805m
        L_0x0093:
            int r3 = r1.f7806n
            if (r0 >= r3) goto L_0x00a2
            int[] r3 = r1.f7804l
            r3 = r3[r0]
            java.lang.Object r14 = r1.m9716a((java.lang.Object) r2, (int) r3, r14, r11)
            int r0 = r0 + 1
            goto L_0x0093
        L_0x00a2:
            if (r14 == 0) goto L_0x00a7
            r11.mo13996b((java.lang.Object) r2, r14)
        L_0x00a7:
            return
        L_0x00a8:
            int r5 = r1.m9737d((int) r6)     // Catch:{ all -> 0x05d9 }
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r7 = r7 & r5
            int r7 = r7 >>> 20
            r8 = 1048575(0xfffff, float:1.469367E-39)
            switch(r7) {
                case 0: goto L_0x0585;
                case 1: goto L_0x0576;
                case 2: goto L_0x0567;
                case 3: goto L_0x0558;
                case 4: goto L_0x0549;
                case 5: goto L_0x053a;
                case 6: goto L_0x052b;
                case 7: goto L_0x051c;
                case 8: goto L_0x0514;
                case 9: goto L_0x04e3;
                case 10: goto L_0x04d4;
                case 11: goto L_0x04c5;
                case 12: goto L_0x04a3;
                case 13: goto L_0x0494;
                case 14: goto L_0x0485;
                case 15: goto L_0x0476;
                case 16: goto L_0x0467;
                case 17: goto L_0x0436;
                case 18: goto L_0x0429;
                case 19: goto L_0x041c;
                case 20: goto L_0x040f;
                case 21: goto L_0x0402;
                case 22: goto L_0x03f5;
                case 23: goto L_0x03e8;
                case 24: goto L_0x03db;
                case 25: goto L_0x03ce;
                case 26: goto L_0x03ae;
                case 27: goto L_0x039d;
                case 28: goto L_0x0390;
                case 29: goto L_0x0383;
                case 30: goto L_0x036d;
                case 31: goto L_0x0360;
                case 32: goto L_0x0353;
                case 33: goto L_0x0346;
                case 34: goto L_0x0339;
                case 35: goto L_0x032c;
                case 36: goto L_0x031f;
                case 37: goto L_0x0312;
                case 38: goto L_0x0305;
                case 39: goto L_0x02f8;
                case 40: goto L_0x02eb;
                case 41: goto L_0x02de;
                case 42: goto L_0x02d1;
                case 43: goto L_0x02c4;
                case 44: goto L_0x02af;
                case 45: goto L_0x02a2;
                case 46: goto L_0x0295;
                case 47: goto L_0x0288;
                case 48: goto L_0x027b;
                case 49: goto L_0x0269;
                case 50: goto L_0x0227;
                case 51: goto L_0x0215;
                case 52: goto L_0x0203;
                case 53: goto L_0x01f1;
                case 54: goto L_0x01df;
                case 55: goto L_0x01cd;
                case 56: goto L_0x01bb;
                case 57: goto L_0x01a9;
                case 58: goto L_0x0197;
                case 59: goto L_0x018f;
                case 60: goto L_0x015e;
                case 61: goto L_0x0150;
                case 62: goto L_0x013e;
                case 63: goto L_0x0119;
                case 64: goto L_0x0107;
                case 65: goto L_0x00f5;
                case 66: goto L_0x00e3;
                case 67: goto L_0x00d1;
                case 68: goto L_0x00bf;
                default: goto L_0x00b7;
            }
        L_0x00b7:
            if (r14 != 0) goto L_0x0595
            java.lang.Object r4 = r11.mo13983a()     // Catch:{ eq -> 0x05b2 }
            goto L_0x0594
        L_0x00bf:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.gh r5 = r1.m9714a((int) r6)     // Catch:{ eq -> 0x05b2 }
            java.lang.Object r5 = r0.mo13653b(r5, r10)     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10024a((java.lang.Object) r2, (long) r7, (java.lang.Object) r5)     // Catch:{ eq -> 0x05b2 }
            r1.m9731b(r2, (int) r4, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x00d1:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ eq -> 0x05b2 }
            long r15 = r19.mo13688t()     // Catch:{ eq -> 0x05b2 }
            java.lang.Long r5 = java.lang.Long.valueOf(r15)     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10024a((java.lang.Object) r2, (long) r7, (java.lang.Object) r5)     // Catch:{ eq -> 0x05b2 }
            r1.m9731b(r2, (int) r4, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x00e3:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ eq -> 0x05b2 }
            int r5 = r19.mo13687s()     // Catch:{ eq -> 0x05b2 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10024a((java.lang.Object) r2, (long) r7, (java.lang.Object) r5)     // Catch:{ eq -> 0x05b2 }
            r1.m9731b(r2, (int) r4, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x00f5:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ eq -> 0x05b2 }
            long r15 = r19.mo13686r()     // Catch:{ eq -> 0x05b2 }
            java.lang.Long r5 = java.lang.Long.valueOf(r15)     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10024a((java.lang.Object) r2, (long) r7, (java.lang.Object) r5)     // Catch:{ eq -> 0x05b2 }
            r1.m9731b(r2, (int) r4, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x0107:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ eq -> 0x05b2 }
            int r5 = r19.mo13684q()     // Catch:{ eq -> 0x05b2 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10024a((java.lang.Object) r2, (long) r7, (java.lang.Object) r5)     // Catch:{ eq -> 0x05b2 }
            r1.m9731b(r2, (int) r4, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x0119:
            int r7 = r19.mo13682p()     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.en r9 = r1.m9735c((int) r6)     // Catch:{ eq -> 0x05b2 }
            if (r9 == 0) goto L_0x0130
            boolean r9 = r9.mo13497a(r7)     // Catch:{ eq -> 0x05b2 }
            if (r9 == 0) goto L_0x012a
            goto L_0x0130
        L_0x012a:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C2063gj.m9841a((int) r4, (int) r7, r14, r11)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0380
        L_0x0130:
            r5 = r5 & r8
            long r8 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10024a((java.lang.Object) r2, (long) r8, (java.lang.Object) r5)     // Catch:{ eq -> 0x05b2 }
            r1.m9731b(r2, (int) r4, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x013e:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ eq -> 0x05b2 }
            int r5 = r19.mo13680o()     // Catch:{ eq -> 0x05b2 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10024a((java.lang.Object) r2, (long) r7, (java.lang.Object) r5)     // Catch:{ eq -> 0x05b2 }
            r1.m9731b(r2, (int) r4, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x0150:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.cx r5 = r19.mo13678n()     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10024a((java.lang.Object) r2, (long) r7, (java.lang.Object) r5)     // Catch:{ eq -> 0x05b2 }
            r1.m9731b(r2, (int) r4, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x015e:
            boolean r7 = r1.m9725a(r2, (int) r4, (int) r6)     // Catch:{ eq -> 0x05b2 }
            if (r7 == 0) goto L_0x017a
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r2, r7)     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.gh r9 = r1.m9714a((int) r6)     // Catch:{ eq -> 0x05b2 }
            java.lang.Object r9 = r0.mo13648a(r9, r10)     // Catch:{ eq -> 0x05b2 }
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C2010ek.m9561a((java.lang.Object) r5, (java.lang.Object) r9)     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10024a((java.lang.Object) r2, (long) r7, (java.lang.Object) r5)     // Catch:{ eq -> 0x05b2 }
            goto L_0x018a
        L_0x017a:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.gh r5 = r1.m9714a((int) r6)     // Catch:{ eq -> 0x05b2 }
            java.lang.Object r5 = r0.mo13648a(r5, r10)     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10024a((java.lang.Object) r2, (long) r7, (java.lang.Object) r5)     // Catch:{ eq -> 0x05b2 }
            r1.m9730b(r2, (int) r6)     // Catch:{ eq -> 0x05b2 }
        L_0x018a:
            r1.m9731b(r2, (int) r4, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x018f:
            r1.m9722a((java.lang.Object) r2, (int) r5, (com.google.android.gms.internal.measurement.C2060gg) r0)     // Catch:{ eq -> 0x05b2 }
            r1.m9731b(r2, (int) r4, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x0197:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ eq -> 0x05b2 }
            boolean r5 = r19.mo13673k()     // Catch:{ eq -> 0x05b2 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10024a((java.lang.Object) r2, (long) r7, (java.lang.Object) r5)     // Catch:{ eq -> 0x05b2 }
            r1.m9731b(r2, (int) r4, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x01a9:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ eq -> 0x05b2 }
            int r5 = r19.mo13670j()     // Catch:{ eq -> 0x05b2 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10024a((java.lang.Object) r2, (long) r7, (java.lang.Object) r5)     // Catch:{ eq -> 0x05b2 }
            r1.m9731b(r2, (int) r4, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x01bb:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ eq -> 0x05b2 }
            long r15 = r19.mo13668i()     // Catch:{ eq -> 0x05b2 }
            java.lang.Long r5 = java.lang.Long.valueOf(r15)     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10024a((java.lang.Object) r2, (long) r7, (java.lang.Object) r5)     // Catch:{ eq -> 0x05b2 }
            r1.m9731b(r2, (int) r4, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x01cd:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ eq -> 0x05b2 }
            int r5 = r19.mo13666h()     // Catch:{ eq -> 0x05b2 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10024a((java.lang.Object) r2, (long) r7, (java.lang.Object) r5)     // Catch:{ eq -> 0x05b2 }
            r1.m9731b(r2, (int) r4, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x01df:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ eq -> 0x05b2 }
            long r15 = r19.mo13662f()     // Catch:{ eq -> 0x05b2 }
            java.lang.Long r5 = java.lang.Long.valueOf(r15)     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10024a((java.lang.Object) r2, (long) r7, (java.lang.Object) r5)     // Catch:{ eq -> 0x05b2 }
            r1.m9731b(r2, (int) r4, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x01f1:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ eq -> 0x05b2 }
            long r15 = r19.mo13664g()     // Catch:{ eq -> 0x05b2 }
            java.lang.Long r5 = java.lang.Long.valueOf(r15)     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10024a((java.lang.Object) r2, (long) r7, (java.lang.Object) r5)     // Catch:{ eq -> 0x05b2 }
            r1.m9731b(r2, (int) r4, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x0203:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ eq -> 0x05b2 }
            float r5 = r19.mo13660e()     // Catch:{ eq -> 0x05b2 }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10024a((java.lang.Object) r2, (long) r7, (java.lang.Object) r5)     // Catch:{ eq -> 0x05b2 }
            r1.m9731b(r2, (int) r4, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x0215:
            r5 = r5 & r8
            long r7 = (long) r5     // Catch:{ eq -> 0x05b2 }
            double r15 = r19.mo13658d()     // Catch:{ eq -> 0x05b2 }
            java.lang.Double r5 = java.lang.Double.valueOf(r15)     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10024a((java.lang.Object) r2, (long) r7, (java.lang.Object) r5)     // Catch:{ eq -> 0x05b2 }
            r1.m9731b(r2, (int) r4, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x0227:
            java.lang.Object r4 = r1.m9729b((int) r6)     // Catch:{ eq -> 0x05b2 }
            int r5 = r1.m9737d((int) r6)     // Catch:{ eq -> 0x05b2 }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r2, r5)     // Catch:{ eq -> 0x05b2 }
            if (r7 != 0) goto L_0x0241
            com.google.android.gms.internal.measurement.fl r7 = r1.f7811s     // Catch:{ eq -> 0x05b2 }
            java.lang.Object r7 = r7.mo13920e(r4)     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10024a((java.lang.Object) r2, (long) r5, (java.lang.Object) r7)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0258
        L_0x0241:
            com.google.android.gms.internal.measurement.fl r8 = r1.f7811s     // Catch:{ eq -> 0x05b2 }
            boolean r8 = r8.mo13918c(r7)     // Catch:{ eq -> 0x05b2 }
            if (r8 == 0) goto L_0x0258
            com.google.android.gms.internal.measurement.fl r8 = r1.f7811s     // Catch:{ eq -> 0x05b2 }
            java.lang.Object r8 = r8.mo13920e(r4)     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.fl r9 = r1.f7811s     // Catch:{ eq -> 0x05b2 }
            r9.mo13915a(r8, r7)     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10024a((java.lang.Object) r2, (long) r5, (java.lang.Object) r8)     // Catch:{ eq -> 0x05b2 }
            r7 = r8
        L_0x0258:
            com.google.android.gms.internal.measurement.fl r5 = r1.f7811s     // Catch:{ eq -> 0x05b2 }
            java.util.Map r5 = r5.mo13916a(r7)     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.fl r6 = r1.f7811s     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.fj r4 = r6.mo13921f(r4)     // Catch:{ eq -> 0x05b2 }
            r0.mo13651a(r5, r4, (com.google.android.gms.internal.measurement.C1988dv) r10)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x0269:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.gh r6 = r1.m9714a((int) r6)     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.fa r7 = r1.f7808p     // Catch:{ eq -> 0x05b2 }
            java.util.List r4 = r7.mo13894a(r2, r4)     // Catch:{ eq -> 0x05b2 }
            r0.mo13655b(r4, r6, r10)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x027b:
            com.google.android.gms.internal.measurement.fa r4 = r1.f7808p     // Catch:{ eq -> 0x05b2 }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.util.List r4 = r4.mo13894a(r2, r5)     // Catch:{ eq -> 0x05b2 }
            r0.mo13685q(r4)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x0288:
            com.google.android.gms.internal.measurement.fa r4 = r1.f7808p     // Catch:{ eq -> 0x05b2 }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.util.List r4 = r4.mo13894a(r2, r5)     // Catch:{ eq -> 0x05b2 }
            r0.mo13683p(r4)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x0295:
            com.google.android.gms.internal.measurement.fa r4 = r1.f7808p     // Catch:{ eq -> 0x05b2 }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.util.List r4 = r4.mo13894a(r2, r5)     // Catch:{ eq -> 0x05b2 }
            r0.mo13681o(r4)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x02a2:
            com.google.android.gms.internal.measurement.fa r4 = r1.f7808p     // Catch:{ eq -> 0x05b2 }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.util.List r4 = r4.mo13894a(r2, r5)     // Catch:{ eq -> 0x05b2 }
            r0.mo13679n(r4)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x02af:
            com.google.android.gms.internal.measurement.fa r7 = r1.f7808p     // Catch:{ eq -> 0x05b2 }
            r5 = r5 & r8
            long r8 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.util.List r5 = r7.mo13894a(r2, r8)     // Catch:{ eq -> 0x05b2 }
            r0.mo13677m(r5)     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.en r6 = r1.m9735c((int) r6)     // Catch:{ eq -> 0x05b2 }
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C2063gj.m9842a(r4, r5, r6, r14, r11)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0380
        L_0x02c4:
            com.google.android.gms.internal.measurement.fa r4 = r1.f7808p     // Catch:{ eq -> 0x05b2 }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.util.List r4 = r4.mo13894a(r2, r5)     // Catch:{ eq -> 0x05b2 }
            r0.mo13675l(r4)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x02d1:
            com.google.android.gms.internal.measurement.fa r4 = r1.f7808p     // Catch:{ eq -> 0x05b2 }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.util.List r4 = r4.mo13894a(r2, r5)     // Catch:{ eq -> 0x05b2 }
            r0.mo13667h(r4)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x02de:
            com.google.android.gms.internal.measurement.fa r4 = r1.f7808p     // Catch:{ eq -> 0x05b2 }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.util.List r4 = r4.mo13894a(r2, r5)     // Catch:{ eq -> 0x05b2 }
            r0.mo13665g(r4)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x02eb:
            com.google.android.gms.internal.measurement.fa r4 = r1.f7808p     // Catch:{ eq -> 0x05b2 }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.util.List r4 = r4.mo13894a(r2, r5)     // Catch:{ eq -> 0x05b2 }
            r0.mo13663f(r4)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x02f8:
            com.google.android.gms.internal.measurement.fa r4 = r1.f7808p     // Catch:{ eq -> 0x05b2 }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.util.List r4 = r4.mo13894a(r2, r5)     // Catch:{ eq -> 0x05b2 }
            r0.mo13661e(r4)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x0305:
            com.google.android.gms.internal.measurement.fa r4 = r1.f7808p     // Catch:{ eq -> 0x05b2 }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.util.List r4 = r4.mo13894a(r2, r5)     // Catch:{ eq -> 0x05b2 }
            r0.mo13656c(r4)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x0312:
            com.google.android.gms.internal.measurement.fa r4 = r1.f7808p     // Catch:{ eq -> 0x05b2 }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.util.List r4 = r4.mo13894a(r2, r5)     // Catch:{ eq -> 0x05b2 }
            r0.mo13659d(r4)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x031f:
            com.google.android.gms.internal.measurement.fa r4 = r1.f7808p     // Catch:{ eq -> 0x05b2 }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.util.List r4 = r4.mo13894a(r2, r5)     // Catch:{ eq -> 0x05b2 }
            r0.mo13654b(r4)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x032c:
            com.google.android.gms.internal.measurement.fa r4 = r1.f7808p     // Catch:{ eq -> 0x05b2 }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.util.List r4 = r4.mo13894a(r2, r5)     // Catch:{ eq -> 0x05b2 }
            r0.mo13649a(r4)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x0339:
            com.google.android.gms.internal.measurement.fa r4 = r1.f7808p     // Catch:{ eq -> 0x05b2 }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.util.List r4 = r4.mo13894a(r2, r5)     // Catch:{ eq -> 0x05b2 }
            r0.mo13685q(r4)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x0346:
            com.google.android.gms.internal.measurement.fa r4 = r1.f7808p     // Catch:{ eq -> 0x05b2 }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.util.List r4 = r4.mo13894a(r2, r5)     // Catch:{ eq -> 0x05b2 }
            r0.mo13683p(r4)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x0353:
            com.google.android.gms.internal.measurement.fa r4 = r1.f7808p     // Catch:{ eq -> 0x05b2 }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.util.List r4 = r4.mo13894a(r2, r5)     // Catch:{ eq -> 0x05b2 }
            r0.mo13681o(r4)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x0360:
            com.google.android.gms.internal.measurement.fa r4 = r1.f7808p     // Catch:{ eq -> 0x05b2 }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.util.List r4 = r4.mo13894a(r2, r5)     // Catch:{ eq -> 0x05b2 }
            r0.mo13679n(r4)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x036d:
            com.google.android.gms.internal.measurement.fa r7 = r1.f7808p     // Catch:{ eq -> 0x05b2 }
            r5 = r5 & r8
            long r8 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.util.List r5 = r7.mo13894a(r2, r8)     // Catch:{ eq -> 0x05b2 }
            r0.mo13677m(r5)     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.en r6 = r1.m9735c((int) r6)     // Catch:{ eq -> 0x05b2 }
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C2063gj.m9842a(r4, r5, r6, r14, r11)     // Catch:{ eq -> 0x05b2 }
        L_0x0380:
            r14 = r4
            goto L_0x0011
        L_0x0383:
            com.google.android.gms.internal.measurement.fa r4 = r1.f7808p     // Catch:{ eq -> 0x05b2 }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.util.List r4 = r4.mo13894a(r2, r5)     // Catch:{ eq -> 0x05b2 }
            r0.mo13675l(r4)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x0390:
            com.google.android.gms.internal.measurement.fa r4 = r1.f7808p     // Catch:{ eq -> 0x05b2 }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.util.List r4 = r4.mo13894a(r2, r5)     // Catch:{ eq -> 0x05b2 }
            r0.mo13672k(r4)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x039d:
            com.google.android.gms.internal.measurement.gh r4 = r1.m9714a((int) r6)     // Catch:{ eq -> 0x05b2 }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.fa r7 = r1.f7808p     // Catch:{ eq -> 0x05b2 }
            java.util.List r5 = r7.mo13894a(r2, r5)     // Catch:{ eq -> 0x05b2 }
            r0.mo13650a(r5, r4, (com.google.android.gms.internal.measurement.C1988dv) r10)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x03ae:
            boolean r4 = m9741f(r5)     // Catch:{ eq -> 0x05b2 }
            if (r4 == 0) goto L_0x03c1
            com.google.android.gms.internal.measurement.fa r4 = r1.f7808p     // Catch:{ eq -> 0x05b2 }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.util.List r4 = r4.mo13894a(r2, r5)     // Catch:{ eq -> 0x05b2 }
            r0.mo13671j(r4)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x03c1:
            com.google.android.gms.internal.measurement.fa r4 = r1.f7808p     // Catch:{ eq -> 0x05b2 }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.util.List r4 = r4.mo13894a(r2, r5)     // Catch:{ eq -> 0x05b2 }
            r0.mo13669i(r4)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x03ce:
            com.google.android.gms.internal.measurement.fa r4 = r1.f7808p     // Catch:{ eq -> 0x05b2 }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.util.List r4 = r4.mo13894a(r2, r5)     // Catch:{ eq -> 0x05b2 }
            r0.mo13667h(r4)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x03db:
            com.google.android.gms.internal.measurement.fa r4 = r1.f7808p     // Catch:{ eq -> 0x05b2 }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.util.List r4 = r4.mo13894a(r2, r5)     // Catch:{ eq -> 0x05b2 }
            r0.mo13665g(r4)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x03e8:
            com.google.android.gms.internal.measurement.fa r4 = r1.f7808p     // Catch:{ eq -> 0x05b2 }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.util.List r4 = r4.mo13894a(r2, r5)     // Catch:{ eq -> 0x05b2 }
            r0.mo13663f(r4)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x03f5:
            com.google.android.gms.internal.measurement.fa r4 = r1.f7808p     // Catch:{ eq -> 0x05b2 }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.util.List r4 = r4.mo13894a(r2, r5)     // Catch:{ eq -> 0x05b2 }
            r0.mo13661e(r4)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x0402:
            com.google.android.gms.internal.measurement.fa r4 = r1.f7808p     // Catch:{ eq -> 0x05b2 }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.util.List r4 = r4.mo13894a(r2, r5)     // Catch:{ eq -> 0x05b2 }
            r0.mo13656c(r4)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x040f:
            com.google.android.gms.internal.measurement.fa r4 = r1.f7808p     // Catch:{ eq -> 0x05b2 }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.util.List r4 = r4.mo13894a(r2, r5)     // Catch:{ eq -> 0x05b2 }
            r0.mo13659d(r4)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x041c:
            com.google.android.gms.internal.measurement.fa r4 = r1.f7808p     // Catch:{ eq -> 0x05b2 }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.util.List r4 = r4.mo13894a(r2, r5)     // Catch:{ eq -> 0x05b2 }
            r0.mo13654b(r4)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x0429:
            com.google.android.gms.internal.measurement.fa r4 = r1.f7808p     // Catch:{ eq -> 0x05b2 }
            r5 = r5 & r8
            long r5 = (long) r5     // Catch:{ eq -> 0x05b2 }
            java.util.List r4 = r4.mo13894a(r2, r5)     // Catch:{ eq -> 0x05b2 }
            r0.mo13649a(r4)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x0436:
            boolean r4 = r1.m9724a(r2, (int) r6)     // Catch:{ eq -> 0x05b2 }
            if (r4 == 0) goto L_0x0454
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ eq -> 0x05b2 }
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r2, r4)     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.gh r6 = r1.m9714a((int) r6)     // Catch:{ eq -> 0x05b2 }
            java.lang.Object r6 = r0.mo13653b(r6, r10)     // Catch:{ eq -> 0x05b2 }
            java.lang.Object r6 = com.google.android.gms.internal.measurement.C2010ek.m9561a((java.lang.Object) r7, (java.lang.Object) r6)     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10024a((java.lang.Object) r2, (long) r4, (java.lang.Object) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x0454:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.gh r7 = r1.m9714a((int) r6)     // Catch:{ eq -> 0x05b2 }
            java.lang.Object r7 = r0.mo13653b(r7, r10)     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10024a((java.lang.Object) r2, (long) r4, (java.lang.Object) r7)     // Catch:{ eq -> 0x05b2 }
            r1.m9730b(r2, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x0467:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ eq -> 0x05b2 }
            long r7 = r19.mo13688t()     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10023a((java.lang.Object) r2, (long) r4, (long) r7)     // Catch:{ eq -> 0x05b2 }
            r1.m9730b(r2, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x0476:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ eq -> 0x05b2 }
            int r7 = r19.mo13687s()     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10022a((java.lang.Object) r2, (long) r4, (int) r7)     // Catch:{ eq -> 0x05b2 }
            r1.m9730b(r2, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x0485:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ eq -> 0x05b2 }
            long r7 = r19.mo13686r()     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10023a((java.lang.Object) r2, (long) r4, (long) r7)     // Catch:{ eq -> 0x05b2 }
            r1.m9730b(r2, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x0494:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ eq -> 0x05b2 }
            int r7 = r19.mo13684q()     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10022a((java.lang.Object) r2, (long) r4, (int) r7)     // Catch:{ eq -> 0x05b2 }
            r1.m9730b(r2, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x04a3:
            int r7 = r19.mo13682p()     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.en r9 = r1.m9735c((int) r6)     // Catch:{ eq -> 0x05b2 }
            if (r9 == 0) goto L_0x04ba
            boolean r9 = r9.mo13497a(r7)     // Catch:{ eq -> 0x05b2 }
            if (r9 == 0) goto L_0x04b4
            goto L_0x04ba
        L_0x04b4:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C2063gj.m9841a((int) r4, (int) r7, r14, r11)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0380
        L_0x04ba:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10022a((java.lang.Object) r2, (long) r4, (int) r7)     // Catch:{ eq -> 0x05b2 }
            r1.m9730b(r2, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x04c5:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ eq -> 0x05b2 }
            int r7 = r19.mo13680o()     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10022a((java.lang.Object) r2, (long) r4, (int) r7)     // Catch:{ eq -> 0x05b2 }
            r1.m9730b(r2, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x04d4:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.cx r7 = r19.mo13678n()     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10024a((java.lang.Object) r2, (long) r4, (java.lang.Object) r7)     // Catch:{ eq -> 0x05b2 }
            r1.m9730b(r2, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x04e3:
            boolean r4 = r1.m9724a(r2, (int) r6)     // Catch:{ eq -> 0x05b2 }
            if (r4 == 0) goto L_0x0501
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ eq -> 0x05b2 }
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r2, r4)     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.gh r6 = r1.m9714a((int) r6)     // Catch:{ eq -> 0x05b2 }
            java.lang.Object r6 = r0.mo13648a(r6, r10)     // Catch:{ eq -> 0x05b2 }
            java.lang.Object r6 = com.google.android.gms.internal.measurement.C2010ek.m9561a((java.lang.Object) r7, (java.lang.Object) r6)     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10024a((java.lang.Object) r2, (long) r4, (java.lang.Object) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x0501:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.gh r7 = r1.m9714a((int) r6)     // Catch:{ eq -> 0x05b2 }
            java.lang.Object r7 = r0.mo13648a(r7, r10)     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10024a((java.lang.Object) r2, (long) r4, (java.lang.Object) r7)     // Catch:{ eq -> 0x05b2 }
            r1.m9730b(r2, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x0514:
            r1.m9722a((java.lang.Object) r2, (int) r5, (com.google.android.gms.internal.measurement.C2060gg) r0)     // Catch:{ eq -> 0x05b2 }
            r1.m9730b(r2, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x051c:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ eq -> 0x05b2 }
            boolean r7 = r19.mo13673k()     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10025a((java.lang.Object) r2, (long) r4, (boolean) r7)     // Catch:{ eq -> 0x05b2 }
            r1.m9730b(r2, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x052b:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ eq -> 0x05b2 }
            int r7 = r19.mo13670j()     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10022a((java.lang.Object) r2, (long) r4, (int) r7)     // Catch:{ eq -> 0x05b2 }
            r1.m9730b(r2, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x053a:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ eq -> 0x05b2 }
            long r7 = r19.mo13668i()     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10023a((java.lang.Object) r2, (long) r4, (long) r7)     // Catch:{ eq -> 0x05b2 }
            r1.m9730b(r2, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x0549:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ eq -> 0x05b2 }
            int r7 = r19.mo13666h()     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10022a((java.lang.Object) r2, (long) r4, (int) r7)     // Catch:{ eq -> 0x05b2 }
            r1.m9730b(r2, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x0558:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ eq -> 0x05b2 }
            long r7 = r19.mo13662f()     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10023a((java.lang.Object) r2, (long) r4, (long) r7)     // Catch:{ eq -> 0x05b2 }
            r1.m9730b(r2, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x0567:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ eq -> 0x05b2 }
            long r7 = r19.mo13664g()     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10023a((java.lang.Object) r2, (long) r4, (long) r7)     // Catch:{ eq -> 0x05b2 }
            r1.m9730b(r2, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x0576:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ eq -> 0x05b2 }
            float r7 = r19.mo13660e()     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10021a((java.lang.Object) r2, (long) r4, (float) r7)     // Catch:{ eq -> 0x05b2 }
            r1.m9730b(r2, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x0585:
            r4 = r5 & r8
            long r4 = (long) r4     // Catch:{ eq -> 0x05b2 }
            double r7 = r19.mo13658d()     // Catch:{ eq -> 0x05b2 }
            com.google.android.gms.internal.measurement.C2086hf.m10020a((java.lang.Object) r2, (long) r4, (double) r7)     // Catch:{ eq -> 0x05b2 }
            r1.m9730b(r2, (int) r6)     // Catch:{ eq -> 0x05b2 }
            goto L_0x0011
        L_0x0594:
            r14 = r4
        L_0x0595:
            boolean r4 = r11.mo13992a(r14, (com.google.android.gms.internal.measurement.C2060gg) r0)     // Catch:{ eq -> 0x05b2 }
            if (r4 != 0) goto L_0x0011
            int r0 = r1.f7805m
        L_0x059d:
            int r3 = r1.f7806n
            if (r0 >= r3) goto L_0x05ac
            int[] r3 = r1.f7804l
            r3 = r3[r0]
            java.lang.Object r14 = r1.m9716a((java.lang.Object) r2, (int) r3, r14, r11)
            int r0 = r0 + 1
            goto L_0x059d
        L_0x05ac:
            if (r14 == 0) goto L_0x05b1
            r11.mo13996b((java.lang.Object) r2, r14)
        L_0x05b1:
            return
        L_0x05b2:
            r11.mo13991a((com.google.android.gms.internal.measurement.C2060gg) r0)     // Catch:{ all -> 0x05d9 }
            if (r14 != 0) goto L_0x05bc
            java.lang.Object r4 = r11.mo13997c(r2)     // Catch:{ all -> 0x05d9 }
            r14 = r4
        L_0x05bc:
            boolean r4 = r11.mo13992a(r14, (com.google.android.gms.internal.measurement.C2060gg) r0)     // Catch:{ all -> 0x05d9 }
            if (r4 != 0) goto L_0x0011
            int r0 = r1.f7805m
        L_0x05c4:
            int r3 = r1.f7806n
            if (r0 >= r3) goto L_0x05d3
            int[] r3 = r1.f7804l
            r3 = r3[r0]
            java.lang.Object r14 = r1.m9716a((java.lang.Object) r2, (int) r3, r14, r11)
            int r0 = r0 + 1
            goto L_0x05c4
        L_0x05d3:
            if (r14 == 0) goto L_0x05d8
            r11.mo13996b((java.lang.Object) r2, r14)
        L_0x05d8:
            return
        L_0x05d9:
            r0 = move-exception
            int r3 = r1.f7805m
        L_0x05dc:
            int r4 = r1.f7806n
            if (r3 >= r4) goto L_0x05eb
            int[] r4 = r1.f7804l
            r4 = r4[r3]
            java.lang.Object r14 = r1.m9716a((java.lang.Object) r2, (int) r4, r14, r11)
            int r3 = r3 + 1
            goto L_0x05dc
        L_0x05eb:
            if (r14 == 0) goto L_0x05f0
            r11.mo13996b((java.lang.Object) r2, r14)
        L_0x05f0:
            throw r0
        L_0x05f1:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2047fu.mo13927a(java.lang.Object, com.google.android.gms.internal.measurement.gg, com.google.android.gms.internal.measurement.dv):void");
    }

    /* renamed from: a */
    private final C2061gh m9714a(int i) {
        int i2 = (i / 3) << 1;
        C2061gh ghVar = (C2061gh) this.f7796d[i2];
        if (ghVar != null) {
            return ghVar;
        }
        C2061gh a = C2057gd.m9772a().mo13936a((Class) this.f7796d[i2 + 1]);
        this.f7796d[i2] = a;
        return a;
    }

    /* renamed from: b */
    private final Object m9729b(int i) {
        return this.f7796d[(i / 3) << 1];
    }

    /* renamed from: c */
    private final C2013en m9735c(int i) {
        return (C2013en) this.f7796d[((i / 3) << 1) + 1];
    }

    /* renamed from: c */
    public final void mo13932c(T t) {
        for (int i = this.f7805m; i < this.f7806n; i++) {
            long d = (long) (m9737d(this.f7804l[i]) & 1048575);
            Object f = C2086hf.m10047f(t, d);
            if (f != null) {
                C2086hf.m10024a((Object) t, d, this.f7811s.mo13919d(f));
            }
        }
        int length = this.f7804l.length;
        for (int i2 = this.f7806n; i2 < length; i2++) {
            this.f7808p.mo13896b(t, (long) this.f7804l[i2]);
        }
        this.f7809q.mo13999d(t);
        if (this.f7800h) {
            this.f7810r.mo13785c(t);
        }
    }

    /* renamed from: a */
    private final <UT, UB> UB m9716a(Object obj, int i, UB ub, C2079gz<UT, UB> gzVar) {
        C2013en c;
        int i2 = this.f7795c[i];
        Object f = C2086hf.m10047f(obj, (long) (m9737d(i) & 1048575));
        if (f == null || (c = m9735c(i)) == null) {
            return ub;
        }
        return m9715a(i, i2, this.f7811s.mo13916a(f), c, ub, gzVar);
    }

    /* renamed from: a */
    private final <K, V, UT, UB> UB m9715a(int i, int i2, Map<K, V> map, C2013en enVar, UB ub, C2079gz<UT, UB> gzVar) {
        C2036fj<?, ?> f = this.f7811s.mo13921f(m9729b(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!enVar.mo13497a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = gzVar.mo13983a();
                }
                C1967df c = C1958cx.m9079c(C2035fi.m9665a(f, next.getKey(), next.getValue()));
                try {
                    C2035fi.m9666a(c.mo13617b(), f, next.getKey(), next.getValue());
                    gzVar.mo13987a(ub, i2, c.mo13616a());
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
    public final boolean mo13933d(T r14) {
        /*
            r13 = this;
            r0 = 0
            r1 = -1
            r1 = 0
            r2 = -1
            r3 = 0
        L_0x0005:
            int r4 = r13.f7805m
            r5 = 1
            if (r1 >= r4) goto L_0x0108
            int[] r4 = r13.f7804l
            r4 = r4[r1]
            int[] r6 = r13.f7795c
            r6 = r6[r4]
            int r7 = r13.m9737d((int) r4)
            boolean r8 = r13.f7802j
            r9 = 1048575(0xfffff, float:1.469367E-39)
            if (r8 != 0) goto L_0x0035
            int[] r8 = r13.f7795c
            int r10 = r4 + 2
            r8 = r8[r10]
            r10 = r8 & r9
            int r8 = r8 >>> 20
            int r8 = r5 << r8
            if (r10 == r2) goto L_0x0036
            sun.misc.Unsafe r2 = f7794b
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
            boolean r10 = r13.m9726a(r14, (int) r4, (int) r3, (int) r8)
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
            com.google.android.gms.internal.measurement.fl r6 = r13.f7811s
            r7 = r7 & r9
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r7)
            java.util.Map r6 = r6.mo13917b(r7)
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x00b3
            java.lang.Object r4 = r13.m9729b((int) r4)
            com.google.android.gms.internal.measurement.fl r7 = r13.f7811s
            com.google.android.gms.internal.measurement.fj r4 = r7.mo13921f(r4)
            com.google.android.gms.internal.measurement.ho r4 = r4.f7787c
            com.google.android.gms.internal.measurement.ht r4 = r4.mo14047a()
            com.google.android.gms.internal.measurement.ht r7 = com.google.android.gms.internal.measurement.C2104ht.MESSAGE
            if (r4 != r7) goto L_0x00b3
            r4 = 0
            java.util.Collection r6 = r6.values()
            java.util.Iterator r6 = r6.iterator()
        L_0x0094:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00b3
            java.lang.Object r7 = r6.next()
            if (r4 != 0) goto L_0x00ac
            com.google.android.gms.internal.measurement.gd r4 = com.google.android.gms.internal.measurement.C2057gd.m9772a()
            java.lang.Class r8 = r7.getClass()
            com.google.android.gms.internal.measurement.gh r4 = r4.mo13936a(r8)
        L_0x00ac:
            boolean r7 = r4.mo13933d(r7)
            if (r7 != 0) goto L_0x0094
            r5 = 0
        L_0x00b3:
            if (r5 != 0) goto L_0x0104
            return r0
        L_0x00b6:
            boolean r5 = r13.m9725a(r14, (int) r6, (int) r4)
            if (r5 == 0) goto L_0x0104
            com.google.android.gms.internal.measurement.gh r4 = r13.m9714a((int) r4)
            boolean r4 = m9727a((java.lang.Object) r14, (int) r7, (com.google.android.gms.internal.measurement.C2061gh) r4)
            if (r4 != 0) goto L_0x0104
            return r0
        L_0x00c7:
            r6 = r7 & r9
            long r6 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.measurement.C2086hf.m10047f(r14, r6)
            java.util.List r6 = (java.util.List) r6
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x00f0
            com.google.android.gms.internal.measurement.gh r4 = r13.m9714a((int) r4)
            r7 = 0
        L_0x00db:
            int r8 = r6.size()
            if (r7 >= r8) goto L_0x00f0
            java.lang.Object r8 = r6.get(r7)
            boolean r8 = r4.mo13933d(r8)
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
            boolean r5 = r13.m9726a(r14, (int) r4, (int) r3, (int) r8)
            if (r5 == 0) goto L_0x0104
            com.google.android.gms.internal.measurement.gh r4 = r13.m9714a((int) r4)
            boolean r4 = m9727a((java.lang.Object) r14, (int) r7, (com.google.android.gms.internal.measurement.C2061gh) r4)
            if (r4 != 0) goto L_0x0104
            return r0
        L_0x0104:
            int r1 = r1 + 1
            goto L_0x0005
        L_0x0108:
            boolean r1 = r13.f7800h
            if (r1 == 0) goto L_0x0119
            com.google.android.gms.internal.measurement.dw<?> r1 = r13.f7810r
            com.google.android.gms.internal.measurement.dz r14 = r1.mo13777a((java.lang.Object) r14)
            boolean r14 = r14.mo13794g()
            if (r14 != 0) goto L_0x0119
            return r0
        L_0x0119:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2047fu.mo13933d(java.lang.Object):boolean");
    }

    /* renamed from: a */
    private static boolean m9727a(Object obj, int i, C2061gh ghVar) {
        return ghVar.mo13933d(C2086hf.m10047f(obj, (long) (i & 1048575)));
    }

    /* renamed from: a */
    private static void m9719a(int i, Object obj, C2105hu huVar) {
        if (obj instanceof String) {
            huVar.mo13737a(i, (String) obj);
        } else {
            huVar.mo13733a(i, (C1958cx) obj);
        }
    }

    /* renamed from: a */
    private final void m9722a(Object obj, int i, C2060gg ggVar) {
        if (m9741f(i)) {
            C2086hf.m10024a(obj, (long) (i & 1048575), (Object) ggVar.mo13676m());
        } else if (this.f7801i) {
            C2086hf.m10024a(obj, (long) (i & 1048575), (Object) ggVar.mo13674l());
        } else {
            C2086hf.m10024a(obj, (long) (i & 1048575), (Object) ggVar.mo13678n());
        }
    }

    /* renamed from: d */
    private final int m9737d(int i) {
        return this.f7795c[i + 1];
    }

    /* renamed from: e */
    private final int m9739e(int i) {
        return this.f7795c[i + 2];
    }

    /* renamed from: b */
    private static <T> double m9728b(T t, long j) {
        return ((Double) C2086hf.m10047f(t, j)).doubleValue();
    }

    /* renamed from: c */
    private static <T> float m9734c(T t, long j) {
        return ((Float) C2086hf.m10047f(t, j)).floatValue();
    }

    /* renamed from: d */
    private static <T> int m9738d(T t, long j) {
        return ((Integer) C2086hf.m10047f(t, j)).intValue();
    }

    /* renamed from: e */
    private static <T> long m9740e(T t, long j) {
        return ((Long) C2086hf.m10047f(t, j)).longValue();
    }

    /* renamed from: f */
    private static <T> boolean m9742f(T t, long j) {
        return ((Boolean) C2086hf.m10047f(t, j)).booleanValue();
    }

    /* renamed from: c */
    private final boolean m9736c(T t, T t2, int i) {
        return m9724a(t, i) == m9724a(t2, i);
    }

    /* renamed from: a */
    private final boolean m9726a(T t, int i, int i2, int i3) {
        if (this.f7802j) {
            return m9724a(t, i);
        }
        return (i2 & i3) != 0;
    }

    /* renamed from: a */
    private final boolean m9724a(T t, int i) {
        if (this.f7802j) {
            int d = m9737d(i);
            long j = (long) (d & 1048575);
            switch ((d & 267386880) >>> 20) {
                case 0:
                    return C2086hf.m10044e(t, j) != 0.0d;
                case 1:
                    return C2086hf.m10039d(t, j) != 0.0f;
                case 2:
                    return C2086hf.m10030b(t, j) != 0;
                case 3:
                    return C2086hf.m10030b(t, j) != 0;
                case 4:
                    return C2086hf.m10014a((Object) t, j) != 0;
                case 5:
                    return C2086hf.m10030b(t, j) != 0;
                case 6:
                    return C2086hf.m10014a((Object) t, j) != 0;
                case 7:
                    return C2086hf.m10038c(t, j);
                case 8:
                    Object f = C2086hf.m10047f(t, j);
                    if (f instanceof String) {
                        return !((String) f).isEmpty();
                    }
                    if (f instanceof C1958cx) {
                        return !C1958cx.f7583a.equals(f);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return C2086hf.m10047f(t, j) != null;
                case 10:
                    return !C1958cx.f7583a.equals(C2086hf.m10047f(t, j));
                case 11:
                    return C2086hf.m10014a((Object) t, j) != 0;
                case 12:
                    return C2086hf.m10014a((Object) t, j) != 0;
                case 13:
                    return C2086hf.m10014a((Object) t, j) != 0;
                case 14:
                    return C2086hf.m10030b(t, j) != 0;
                case 15:
                    return C2086hf.m10014a((Object) t, j) != 0;
                case 16:
                    return C2086hf.m10030b(t, j) != 0;
                case 17:
                    return C2086hf.m10047f(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int e = m9739e(i);
            return (C2086hf.m10014a((Object) t, (long) (e & 1048575)) & (1 << (e >>> 20))) != 0;
        }
    }

    /* renamed from: b */
    private final void m9730b(T t, int i) {
        if (!this.f7802j) {
            int e = m9739e(i);
            long j = (long) (e & 1048575);
            C2086hf.m10022a((Object) t, j, C2086hf.m10014a((Object) t, j) | (1 << (e >>> 20)));
        }
    }

    /* renamed from: a */
    private final boolean m9725a(T t, int i, int i2) {
        return C2086hf.m10014a((Object) t, (long) (m9739e(i2) & 1048575)) == i;
    }

    /* renamed from: b */
    private final void m9731b(T t, int i, int i2) {
        C2086hf.m10022a((Object) t, (long) (m9739e(i2) & 1048575), i);
    }
}
