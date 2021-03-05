package com.google.android.gms.measurement.internal;

import android.support.p034v4.util.ArrayMap;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.internal.measurement.C1905ay;
import com.google.android.gms.internal.measurement.C1906az;
import com.google.android.gms.internal.measurement.C1908ba;
import com.google.android.gms.internal.measurement.C1909bb;
import com.google.android.gms.internal.measurement.C1910bc;
import com.google.android.gms.internal.measurement.C1915bh;
import com.google.android.gms.internal.measurement.C1917bj;
import com.google.android.gms.internal.measurement.C1922bo;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.google.android.gms.measurement.internal.eq */
final class C2269eq extends C2253eb {
    C2269eq(C2254ec ecVar) {
        super(ecVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo14289e() {
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r84v0, resolved type: android.support.v4.util.ArrayMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r84v1, resolved type: android.support.v4.util.ArrayMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r68v0, resolved type: android.support.v4.util.ArrayMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: android.support.v4.util.ArrayMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r68v1, resolved type: android.support.v4.util.ArrayMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v109, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v113, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v33, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0393  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0439  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x045a  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x08c8  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x0aa2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02d7  */
    @android.support.annotation.WorkerThread
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C1914bg[] mo14711a(java.lang.String r99, com.google.android.gms.internal.measurement.C1916bi[] r100, com.google.android.gms.internal.measurement.C1922bo[] r101) {
        /*
            r98 = this;
            r7 = r98
            r15 = r99
            r13 = r100
            r14 = r101
            com.google.android.gms.common.internal.C0926p.m1308a((java.lang.String) r99)
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            android.support.v4.util.ArrayMap r12 = new android.support.v4.util.ArrayMap
            r12.<init>()
            android.support.v4.util.ArrayMap r10 = new android.support.v4.util.ArrayMap
            r10.<init>()
            android.support.v4.util.ArrayMap r9 = new android.support.v4.util.ArrayMap
            r9.<init>()
            android.support.v4.util.ArrayMap r8 = new android.support.v4.util.ArrayMap
            r8.<init>()
            android.support.v4.util.ArrayMap r6 = new android.support.v4.util.ArrayMap
            r6.<init>()
            com.google.android.gms.measurement.internal.et r0 = r98.mo14237t()
            boolean r23 = r0.mo14734k(r15)
            com.google.android.gms.measurement.internal.ew r0 = r98.mo14294i()
            java.util.Map r0 = r0.mo14779e(r15)
            if (r0 == 0) goto L_0x0185
            java.util.Set r1 = r0.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0043:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0185
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Object r4 = r0.get(r4)
            com.google.android.gms.internal.measurement.bm r4 = (com.google.android.gms.internal.measurement.C1920bm) r4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.Object r5 = r10.get(r5)
            java.util.BitSet r5 = (java.util.BitSet) r5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object r3 = r9.get(r3)
            java.util.BitSet r3 = (java.util.BitSet) r3
            if (r23 == 0) goto L_0x00b3
            r27 = r0
            android.support.v4.util.ArrayMap r0 = new android.support.v4.util.ArrayMap
            r0.<init>()
            if (r4 == 0) goto L_0x00a5
            r28 = r1
            com.google.android.gms.internal.measurement.bh[] r1 = r4.f7509c
            if (r1 != 0) goto L_0x0083
            goto L_0x00a7
        L_0x0083:
            com.google.android.gms.internal.measurement.bh[] r1 = r4.f7509c
            r29 = r3
            int r3 = r1.length
            r30 = r11
            r11 = 0
        L_0x008b:
            if (r11 >= r3) goto L_0x00ab
            r31 = r3
            r3 = r1[r11]
            r32 = r1
            java.lang.Integer r1 = r3.f7450a
            if (r1 == 0) goto L_0x009e
            java.lang.Integer r1 = r3.f7450a
            java.lang.Long r3 = r3.f7451b
            r0.put(r1, r3)
        L_0x009e:
            int r11 = r11 + 1
            r3 = r31
            r1 = r32
            goto L_0x008b
        L_0x00a5:
            r28 = r1
        L_0x00a7:
            r29 = r3
            r30 = r11
        L_0x00ab:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r8.put(r1, r0)
            goto L_0x00bc
        L_0x00b3:
            r27 = r0
            r28 = r1
            r29 = r3
            r30 = r11
            r0 = 0
        L_0x00bc:
            if (r5 != 0) goto L_0x00d7
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r10.put(r1, r5)
            java.util.BitSet r3 = new java.util.BitSet
            r3.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r9.put(r1, r3)
            goto L_0x00d9
        L_0x00d7:
            r3 = r29
        L_0x00d9:
            r1 = 0
        L_0x00da:
            long[] r11 = r4.f7507a
            int r11 = r11.length
            int r11 = r11 << 6
            if (r1 >= r11) goto L_0x012f
            long[] r11 = r4.f7507a
            boolean r11 = com.google.android.gms.measurement.internal.C2261ei.m10983a((long[]) r11, (int) r1)
            if (r11 == 0) goto L_0x0114
            com.google.android.gms.measurement.internal.r r11 = r98.mo14235r()
            com.google.android.gms.measurement.internal.t r11 = r11.mo14838x()
            r33 = r8
            java.lang.String r8 = "Filter already evaluated. audience ID, filter ID"
            r34 = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            r35 = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            r11.mo14843a(r8, r9, r10)
            r3.set(r1)
            long[] r8 = r4.f7508b
            boolean r8 = com.google.android.gms.measurement.internal.C2261ei.m10983a((long[]) r8, (int) r1)
            if (r8 == 0) goto L_0x011a
            r5.set(r1)
            r8 = 1
            goto L_0x011b
        L_0x0114:
            r33 = r8
            r34 = r9
            r35 = r10
        L_0x011a:
            r8 = 0
        L_0x011b:
            if (r0 == 0) goto L_0x0126
            if (r8 != 0) goto L_0x0126
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r0.remove(r8)
        L_0x0126:
            int r1 = r1 + 1
            r8 = r33
            r9 = r34
            r10 = r35
            goto L_0x00da
        L_0x012f:
            r33 = r8
            r34 = r9
            r35 = r10
            com.google.android.gms.internal.measurement.bg r1 = new com.google.android.gms.internal.measurement.bg
            r1.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r12.put(r8, r1)
            r8 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r8)
            r1.f7448d = r9
            r1.f7447c = r4
            com.google.android.gms.internal.measurement.bm r4 = new com.google.android.gms.internal.measurement.bm
            r4.<init>()
            r1.f7446b = r4
            com.google.android.gms.internal.measurement.bm r4 = r1.f7446b
            long[] r5 = com.google.android.gms.measurement.internal.C2261ei.m10984a((java.util.BitSet) r5)
            r4.f7508b = r5
            com.google.android.gms.internal.measurement.bm r4 = r1.f7446b
            long[] r3 = com.google.android.gms.measurement.internal.C2261ei.m10984a((java.util.BitSet) r3)
            r4.f7507a = r3
            if (r23 == 0) goto L_0x0177
            com.google.android.gms.internal.measurement.bm r1 = r1.f7446b
            com.google.android.gms.internal.measurement.bh[] r0 = m11147a(r0)
            r1.f7509c = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            android.support.v4.util.ArrayMap r1 = new android.support.v4.util.ArrayMap
            r1.<init>()
            r6.put(r0, r1)
        L_0x0177:
            r0 = r27
            r1 = r28
            r11 = r30
            r8 = r33
            r9 = r34
            r10 = r35
            goto L_0x0043
        L_0x0185:
            r33 = r8
            r34 = r9
            r35 = r10
            r30 = r11
            if (r13 == 0) goto L_0x079c
            android.support.v4.util.ArrayMap r9 = new android.support.v4.util.ArrayMap
            r9.<init>()
            int r8 = r13.length
            r27 = 0
            r2 = r27
            r0 = 0
            r1 = 0
            r4 = 0
        L_0x019c:
            if (r4 >= r8) goto L_0x079c
            r5 = r13[r4]
            java.lang.String r10 = r5.f7454b
            com.google.android.gms.internal.measurement.bj[] r11 = r5.f7453a
            r36 = r2
            com.google.android.gms.measurement.internal.et r2 = r98.mo14237t()
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C2284h.f8530W
            boolean r2 = r2.mo14721c(r15, r3)
            r16 = 1
            if (r2 == 0) goto L_0x0379
            r98.mo14291g()
            java.lang.String r2 = "_eid"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C2261ei.m10986b(r5, r2)
            r3 = r2
            java.lang.Long r3 = (java.lang.Long) r3
            if (r3 == 0) goto L_0x01c4
            r2 = 1
            goto L_0x01c5
        L_0x01c4:
            r2 = 0
        L_0x01c5:
            if (r2 == 0) goto L_0x01d3
            r38 = r4
            java.lang.String r4 = "_ep"
            boolean r4 = r10.equals(r4)
            if (r4 == 0) goto L_0x01d5
            r4 = 1
            goto L_0x01d6
        L_0x01d3:
            r38 = r4
        L_0x01d5:
            r4 = 0
        L_0x01d6:
            if (r4 == 0) goto L_0x0330
            r98.mo14291g()
            java.lang.String r2 = "_en"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C2261ei.m10986b(r5, r2)
            r10 = r2
            java.lang.String r10 = (java.lang.String) r10
            boolean r2 = android.text.TextUtils.isEmpty(r10)
            if (r2 == 0) goto L_0x01ff
            com.google.android.gms.measurement.internal.r r2 = r98.mo14235r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo14830d_()
            java.lang.String r4 = "Extra parameter without an event name. eventId"
            r2.mo14842a(r4, r3)
            r41 = r6
            r26 = r38
            r24 = 1
            goto L_0x031c
        L_0x01ff:
            if (r0 == 0) goto L_0x0216
            if (r1 == 0) goto L_0x0216
            long r18 = r3.longValue()
            long r20 = r1.longValue()
            int r2 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r2 == 0) goto L_0x0210
            goto L_0x0216
        L_0x0210:
            r4 = r0
            r18 = r1
            r1 = r36
            goto L_0x0240
        L_0x0216:
            com.google.android.gms.measurement.internal.ew r2 = r98.mo14294i()
            android.util.Pair r2 = r2.mo14754a((java.lang.String) r15, (java.lang.Long) r3)
            if (r2 == 0) goto L_0x0309
            java.lang.Object r4 = r2.first
            if (r4 != 0) goto L_0x0226
            goto L_0x0309
        L_0x0226:
            java.lang.Object r0 = r2.first
            com.google.android.gms.internal.measurement.bi r0 = (com.google.android.gms.internal.measurement.C1916bi) r0
            java.lang.Object r1 = r2.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r98.mo14291g()
            java.lang.String r4 = "_eid"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C2261ei.m10986b(r0, r4)
            java.lang.Long r4 = (java.lang.Long) r4
            r18 = r4
            r4 = r0
        L_0x0240:
            r0 = 0
            long r19 = r1 - r16
            int r0 = (r19 > r27 ? 1 : (r19 == r27 ? 0 : -1))
            if (r0 > 0) goto L_0x028f
            com.google.android.gms.measurement.internal.ew r1 = r98.mo14294i()
            r1.mo14221d()
            com.google.android.gms.measurement.internal.r r0 = r1.mo14235r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo14838x()
            java.lang.String r2 = "Clearing complex main event info. appId"
            r0.mo14842a(r2, r15)
            android.database.sqlite.SQLiteDatabase r0 = r1.mo14787y()     // Catch:{ SQLiteException -> 0x0272 }
            java.lang.String r2 = "delete from main_event_params where app_id=?"
            r39 = r4
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0270 }
            r21 = 0
            r4[r21] = r15     // Catch:{ SQLiteException -> 0x026e }
            r0.execSQL(r2, r4)     // Catch:{ SQLiteException -> 0x026e }
            goto L_0x0285
        L_0x026e:
            r0 = move-exception
            goto L_0x0278
        L_0x0270:
            r0 = move-exception
            goto L_0x0276
        L_0x0272:
            r0 = move-exception
            r39 = r4
            r3 = 1
        L_0x0276:
            r21 = 0
        L_0x0278:
            com.google.android.gms.measurement.internal.r r1 = r1.mo14235r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo14830d_()
            java.lang.String r2 = "Error clearing complex main event"
            r1.mo14842a(r2, r0)
        L_0x0285:
            r13 = r5
            r41 = r6
            r26 = r38
            r1 = r39
            r24 = 1
            goto L_0x02ac
        L_0x028f:
            r39 = r4
            r4 = 1
            r21 = 0
            com.google.android.gms.measurement.internal.ew r1 = r98.mo14294i()
            r2 = r99
            r13 = r5
            r26 = r38
            r40 = r39
            r24 = 1
            r4 = r19
            r41 = r6
            r6 = r40
            r1.mo14770a(r2, r3, r4, r6)
            r1 = r40
        L_0x02ac:
            com.google.android.gms.internal.measurement.bj[] r0 = r1.f7453a
            int r0 = r0.length
            int r2 = r11.length
            int r0 = r0 + r2
            com.google.android.gms.internal.measurement.bj[] r0 = new com.google.android.gms.internal.measurement.C1917bj[r0]
            com.google.android.gms.internal.measurement.bj[] r2 = r1.f7453a
            int r3 = r2.length
            r4 = 0
            r5 = 0
        L_0x02b8:
            if (r4 >= r3) goto L_0x02d3
            r6 = r2[r4]
            r98.mo14291g()
            r42 = r1
            java.lang.String r1 = r6.f7459a
            com.google.android.gms.internal.measurement.bj r1 = com.google.android.gms.measurement.internal.C2261ei.m10976a((com.google.android.gms.internal.measurement.C1916bi) r13, (java.lang.String) r1)
            if (r1 != 0) goto L_0x02ce
            int r1 = r5 + 1
            r0[r5] = r6
            r5 = r1
        L_0x02ce:
            int r4 = r4 + 1
            r1 = r42
            goto L_0x02b8
        L_0x02d3:
            r42 = r1
            if (r5 <= 0) goto L_0x02f3
            int r1 = r11.length
            r2 = 0
        L_0x02d9:
            if (r2 >= r1) goto L_0x02e5
            r3 = r11[r2]
            int r4 = r5 + 1
            r0[r5] = r3
            int r2 = r2 + 1
            r5 = r4
            goto L_0x02d9
        L_0x02e5:
            int r1 = r0.length
            if (r5 != r1) goto L_0x02e9
            goto L_0x02ef
        L_0x02e9:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            com.google.android.gms.internal.measurement.bj[] r0 = (com.google.android.gms.internal.measurement.C1917bj[]) r0
        L_0x02ef:
            r29 = r0
            r0 = r10
            goto L_0x0303
        L_0x02f3:
            com.google.android.gms.measurement.internal.r r0 = r98.mo14235r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo14833i()
            java.lang.String r1 = "No unique parameters in main event. eventName"
            r0.mo14842a(r1, r10)
            r0 = r10
            r29 = r11
        L_0x0303:
            r25 = r18
            r36 = r19
            goto L_0x0387
        L_0x0309:
            r41 = r6
            r26 = r38
            r24 = 1
            com.google.android.gms.measurement.internal.r r2 = r98.mo14235r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo14830d_()
            java.lang.String r4 = "Extra parameter without existing main event. eventName, eventId"
            r2.mo14843a(r4, r10, r3)
        L_0x031c:
            r31 = r8
            r65 = r9
            r79 = r12
            r14 = r30
            r77 = r33
            r78 = r34
            r80 = r35
            r2 = r36
            r72 = r41
            goto L_0x0780
        L_0x0330:
            r13 = r5
            r41 = r6
            r26 = r38
            r24 = 1
            if (r2 == 0) goto L_0x0380
            r98.mo14291g()
            java.lang.String r0 = "_epc"
            java.lang.Long r1 = java.lang.Long.valueOf(r27)
            java.lang.Object r0 = com.google.android.gms.measurement.internal.C2261ei.m10986b(r13, r0)
            if (r0 != 0) goto L_0x0349
            r0 = r1
        L_0x0349:
            java.lang.Long r0 = (java.lang.Long) r0
            long r18 = r0.longValue()
            int r0 = (r18 > r27 ? 1 : (r18 == r27 ? 0 : -1))
            if (r0 > 0) goto L_0x0362
            com.google.android.gms.measurement.internal.r r0 = r98.mo14235r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo14833i()
            java.lang.String r1 = "Complex event with zero extra param count. eventName"
            r0.mo14842a(r1, r10)
            r0 = r3
            goto L_0x036f
        L_0x0362:
            com.google.android.gms.measurement.internal.ew r1 = r98.mo14294i()
            r2 = r99
            r0 = r3
            r4 = r18
            r6 = r13
            r1.mo14770a(r2, r3, r4, r6)
        L_0x036f:
            r25 = r0
            r0 = r10
            r29 = r11
            r42 = r13
            r36 = r18
            goto L_0x0387
        L_0x0379:
            r26 = r4
            r13 = r5
            r41 = r6
            r24 = 1
        L_0x0380:
            r42 = r0
            r25 = r1
            r0 = r10
            r29 = r11
        L_0x0387:
            com.google.android.gms.measurement.internal.ew r1 = r98.mo14294i()
            java.lang.String r2 = r13.f7454b
            com.google.android.gms.measurement.internal.d r1 = r1.mo14755a((java.lang.String) r15, (java.lang.String) r2)
            if (r1 != 0) goto L_0x03e5
            com.google.android.gms.measurement.internal.r r1 = r98.mo14235r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo14833i()
            java.lang.String r2 = "Event aggregate wasn't created during raw event logging. appId, event"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r99)
            com.google.android.gms.measurement.internal.p r4 = r98.mo14232o()
            java.lang.String r4 = r4.mo14824a((java.lang.String) r0)
            r1.mo14843a(r2, r3, r4)
            com.google.android.gms.measurement.internal.d r1 = new com.google.android.gms.measurement.internal.d
            java.lang.String r10 = r13.f7454b
            r2 = 1
            r4 = 1
            java.lang.Long r6 = r13.f7455c
            long r16 = r6.longValue()
            r18 = 0
            r6 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r31 = r8
            r11 = r33
            r8 = r1
            r44 = r9
            r43 = r34
            r9 = r99
            r45 = r35
            r48 = r11
            r47 = r12
            r46 = r30
            r11 = r2
            r2 = r13
            r3 = r14
            r13 = r4
            r5 = r15
            r15 = r16
            r17 = r18
            r19 = r6
            r8.<init>(r9, r10, r11, r13, r15, r17, r19, r20, r21, r22)
            goto L_0x0426
        L_0x03e5:
            r31 = r8
            r44 = r9
            r47 = r12
            r2 = r13
            r3 = r14
            r5 = r15
            r46 = r30
            r48 = r33
            r43 = r34
            r45 = r35
            com.google.android.gms.measurement.internal.d r4 = new com.google.android.gms.measurement.internal.d
            java.lang.String r6 = r1.f8319a
            java.lang.String r8 = r1.f8320b
            long r9 = r1.f8321c
            long r52 = r9 + r16
            long r9 = r1.f8322d
            long r54 = r9 + r16
            long r9 = r1.f8323e
            long r11 = r1.f8324f
            java.lang.Long r13 = r1.f8325g
            java.lang.Long r14 = r1.f8326h
            java.lang.Long r15 = r1.f8327i
            java.lang.Boolean r1 = r1.f8328j
            r49 = r4
            r50 = r6
            r51 = r8
            r56 = r9
            r58 = r11
            r60 = r13
            r61 = r14
            r62 = r15
            r63 = r1
            r49.<init>(r50, r51, r52, r54, r56, r58, r60, r61, r62, r63)
            r1 = r4
        L_0x0426:
            com.google.android.gms.measurement.internal.ew r4 = r98.mo14294i()
            r4.mo14762a((com.google.android.gms.measurement.internal.C2224d) r1)
            long r8 = r1.f8321c
            r10 = r44
            java.lang.Object r1 = r10.get(r0)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L_0x044b
            com.google.android.gms.measurement.internal.ew r1 = r98.mo14294i()
            java.util.Map r1 = r1.mo14781f(r5, r0)
            if (r1 != 0) goto L_0x0448
            android.support.v4.util.ArrayMap r1 = new android.support.v4.util.ArrayMap
            r1.<init>()
        L_0x0448:
            r10.put(r0, r1)
        L_0x044b:
            r11 = r1
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r12 = r1.iterator()
        L_0x0454:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x076c
            java.lang.Object r1 = r12.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r13 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r14 = r46
            boolean r1 = r14.contains(r1)
            if (r1 == 0) goto L_0x0484
            com.google.android.gms.measurement.internal.r r1 = r98.mo14235r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo14838x()
            java.lang.String r4 = "Skipping failed audience ID"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            r1.mo14842a(r4, r6)
            r46 = r14
            goto L_0x0454
        L_0x0484:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r15 = r47
            java.lang.Object r1 = r15.get(r1)
            com.google.android.gms.internal.measurement.bg r1 = (com.google.android.gms.internal.measurement.C1914bg) r1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r6 = r45
            java.lang.Object r4 = r6.get(r4)
            java.util.BitSet r4 = (java.util.BitSet) r4
            r64 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r65 = r10
            r10 = r43
            java.lang.Object r2 = r10.get(r2)
            java.util.BitSet r2 = (java.util.BitSet) r2
            if (r23 == 0) goto L_0x04cd
            r66 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r67 = r12
            r12 = r48
            java.lang.Object r2 = r12.get(r2)
            java.util.Map r2 = (java.util.Map) r2
            r68 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r7 = r41
            java.lang.Object r2 = r7.get(r2)
            java.util.Map r2 = (java.util.Map) r2
            goto L_0x04d8
        L_0x04cd:
            r66 = r2
            r67 = r12
            r7 = r41
            r12 = r48
            r2 = 0
            r68 = 0
        L_0x04d8:
            if (r1 != 0) goto L_0x0537
            com.google.android.gms.internal.measurement.bg r1 = new com.google.android.gms.internal.measurement.bg
            r1.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r15.put(r4, r1)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r24)
            r1.f7448d = r4
            java.util.BitSet r4 = new java.util.BitSet
            r4.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r6.put(r1, r4)
            java.util.BitSet r1 = new java.util.BitSet
            r1.<init>()
            r69 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r10.put(r2, r1)
            if (r23 == 0) goto L_0x052c
            android.support.v4.util.ArrayMap r2 = new android.support.v4.util.ArrayMap
            r2.<init>()
            r70 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r12.put(r1, r2)
            android.support.v4.util.ArrayMap r1 = new android.support.v4.util.ArrayMap
            r1.<init>()
            r71 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r7.put(r2, r1)
            r72 = r7
            r2 = r70
            r73 = r71
            r7 = r1
            goto L_0x0541
        L_0x052c:
            r70 = r1
            r72 = r7
            r73 = r68
            r7 = r69
            r2 = r70
            goto L_0x0541
        L_0x0537:
            r69 = r2
            r72 = r7
            r2 = r66
            r73 = r68
            r7 = r69
        L_0x0541:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.lang.Object r1 = r11.get(r1)
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r16 = r1.iterator()
        L_0x054f:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x0750
            java.lang.Object r1 = r16.next()
            com.google.android.gms.internal.measurement.ay r1 = (com.google.android.gms.internal.measurement.C1905ay) r1
            r74 = r2
            com.google.android.gms.measurement.internal.r r2 = r98.mo14235r()
            r75 = r11
            r11 = 2
            boolean r2 = r2.mo14829a((int) r11)
            if (r2 == 0) goto L_0x05a1
            com.google.android.gms.measurement.internal.r r2 = r98.mo14235r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo14838x()
            java.lang.String r11 = "Evaluating filter. audience, filter, event"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r5 = r1.f7400a
            r76 = r6
            com.google.android.gms.measurement.internal.p r6 = r98.mo14232o()
            r77 = r12
            java.lang.String r12 = r1.f7401b
            java.lang.String r6 = r6.mo14824a((java.lang.String) r12)
            r2.mo14844a(r11, r3, r5, r6)
            com.google.android.gms.measurement.internal.r r2 = r98.mo14235r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo14838x()
            java.lang.String r3 = "Filter definition"
            com.google.android.gms.measurement.internal.ei r5 = r98.mo14291g()
            java.lang.String r5 = r5.mo14547a((com.google.android.gms.internal.measurement.C1905ay) r1)
            r2.mo14842a(r3, r5)
            goto L_0x05a5
        L_0x05a1:
            r76 = r6
            r77 = r12
        L_0x05a5:
            java.lang.Integer r2 = r1.f7400a
            if (r2 == 0) goto L_0x0711
            java.lang.Integer r2 = r1.f7400a
            int r2 = r2.intValue()
            r11 = 256(0x100, float:3.59E-43)
            if (r2 <= r11) goto L_0x05b5
            goto L_0x0711
        L_0x05b5:
            if (r23 == 0) goto L_0x069e
            if (r1 == 0) goto L_0x05c7
            java.lang.Boolean r2 = r1.f7404e
            if (r2 == 0) goto L_0x05c7
            java.lang.Boolean r2 = r1.f7404e
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x05c7
            r12 = 1
            goto L_0x05c8
        L_0x05c7:
            r12 = 0
        L_0x05c8:
            if (r1 == 0) goto L_0x05d9
            java.lang.Boolean r2 = r1.f7405f
            if (r2 == 0) goto L_0x05d9
            java.lang.Boolean r2 = r1.f7405f
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x05d9
            r17 = 1
            goto L_0x05db
        L_0x05d9:
            r17 = 0
        L_0x05db:
            java.lang.Integer r2 = r1.f7400a
            int r2 = r2.intValue()
            boolean r2 = r4.get(r2)
            if (r2 == 0) goto L_0x0608
            if (r12 != 0) goto L_0x0608
            if (r17 != 0) goto L_0x0608
            com.google.android.gms.measurement.internal.r r2 = r98.mo14235r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo14838x()
            java.lang.String r3 = "Event filter already evaluated true and it is not associated with a dynamic audience. audience ID, filter ID"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r1 = r1.f7400a
            r2.mo14843a(r3, r5, r1)
            r2 = r74
            r11 = r75
            r6 = r76
            r12 = r77
            goto L_0x074a
        L_0x0608:
            r5 = r1
            r6 = r73
            r1 = r98
            r3 = r64
            r11 = r74
            r2 = r5
            r78 = r10
            r79 = r15
            r10 = r101
            r15 = r3
            r3 = r0
            r10 = r4
            r4 = r29
            r81 = r0
            r0 = r5
            r82 = r6
            r80 = r76
            r5 = r8
            java.lang.Boolean r1 = r1.m11139a(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.r r2 = r98.mo14235r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo14838x()
            java.lang.String r3 = "Event filter result"
            if (r1 != 0) goto L_0x0638
            java.lang.String r4 = "null"
            goto L_0x0639
        L_0x0638:
            r4 = r1
        L_0x0639:
            r2.mo14842a(r3, r4)
            if (r1 != 0) goto L_0x0659
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r14.add(r0)
        L_0x0645:
            r4 = r10
            r2 = r11
            r64 = r15
            r11 = r75
            r12 = r77
            r10 = r78
            r15 = r79
            r6 = r80
            r0 = r81
            r73 = r82
            goto L_0x074a
        L_0x0659:
            java.lang.Integer r2 = r0.f7400a
            int r2 = r2.intValue()
            r11.set(r2)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0645
            java.lang.Integer r1 = r0.f7400a
            int r1 = r1.intValue()
            r10.set(r1)
            if (r12 != 0) goto L_0x0675
            if (r17 == 0) goto L_0x0645
        L_0x0675:
            java.lang.Long r1 = r15.f7455c
            if (r1 == 0) goto L_0x0645
            if (r17 == 0) goto L_0x068b
            java.lang.Integer r0 = r0.f7400a
            int r0 = r0.intValue()
            java.lang.Long r1 = r15.f7455c
            long r1 = r1.longValue()
            m11148b(r7, r0, r1)
            goto L_0x0645
        L_0x068b:
            java.lang.Integer r0 = r0.f7400a
            int r0 = r0.intValue()
            java.lang.Long r1 = r15.f7455c
            long r1 = r1.longValue()
            r12 = r82
            m11146a((java.util.Map<java.lang.Integer, java.lang.Long>) r12, (int) r0, (long) r1)
            goto L_0x0738
        L_0x069e:
            r81 = r0
            r0 = r1
            r78 = r10
            r79 = r15
            r15 = r64
            r12 = r73
            r11 = r74
            r80 = r76
            r10 = r4
            java.lang.Integer r1 = r0.f7400a
            int r1 = r1.intValue()
            boolean r1 = r10.get(r1)
            if (r1 == 0) goto L_0x06cf
            com.google.android.gms.measurement.internal.r r1 = r98.mo14235r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo14838x()
            java.lang.String r2 = "Event filter already evaluated true. audience ID, filter ID"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r0 = r0.f7400a
            r1.mo14843a(r2, r3, r0)
            goto L_0x0738
        L_0x06cf:
            r1 = r98
            r2 = r0
            r3 = r81
            r4 = r29
            r5 = r8
            java.lang.Boolean r1 = r1.m11139a(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.r r2 = r98.mo14235r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo14838x()
            java.lang.String r3 = "Event filter result"
            if (r1 != 0) goto L_0x06ea
            java.lang.String r4 = "null"
            goto L_0x06eb
        L_0x06ea:
            r4 = r1
        L_0x06eb:
            r2.mo14842a(r3, r4)
            if (r1 != 0) goto L_0x06f8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r14.add(r0)
            goto L_0x0738
        L_0x06f8:
            java.lang.Integer r2 = r0.f7400a
            int r2 = r2.intValue()
            r11.set(r2)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0738
            java.lang.Integer r0 = r0.f7400a
            int r0 = r0.intValue()
            r10.set(r0)
            goto L_0x0738
        L_0x0711:
            r81 = r0
            r0 = r1
            r78 = r10
            r79 = r15
            r15 = r64
            r12 = r73
            r11 = r74
            r80 = r76
            r10 = r4
            com.google.android.gms.measurement.internal.r r1 = r98.mo14235r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo14833i()
            java.lang.String r2 = "Invalid event filter ID. appId, id"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r99)
            java.lang.Integer r0 = r0.f7400a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.mo14843a(r2, r3, r0)
        L_0x0738:
            r4 = r10
            r2 = r11
            r73 = r12
            r64 = r15
            r11 = r75
            r12 = r77
            r10 = r78
            r15 = r79
            r6 = r80
            r0 = r81
        L_0x074a:
            r3 = r101
            r5 = r99
            goto L_0x054f
        L_0x0750:
            r79 = r15
            r45 = r6
            r43 = r10
            r48 = r12
            r46 = r14
            r2 = r64
            r10 = r65
            r12 = r67
            r41 = r72
            r47 = r79
            r3 = r101
            r5 = r99
            r7 = r98
            goto L_0x0454
        L_0x076c:
            r65 = r10
            r72 = r41
            r78 = r43
            r80 = r45
            r14 = r46
            r79 = r47
            r77 = r48
            r1 = r25
            r2 = r36
            r0 = r42
        L_0x0780:
            int r4 = r26 + 1
            r13 = r100
            r30 = r14
            r8 = r31
            r9 = r65
            r6 = r72
            r33 = r77
            r34 = r78
            r12 = r79
            r35 = r80
            r7 = r98
            r14 = r101
            r15 = r99
            goto L_0x019c
        L_0x079c:
            r72 = r6
            r79 = r12
            r14 = r30
            r77 = r33
            r78 = r34
            r80 = r35
            r24 = 1
            r1 = r101
            if (r1 == 0) goto L_0x0ace
            android.support.v4.util.ArrayMap r0 = new android.support.v4.util.ArrayMap
            r0.<init>()
            int r2 = r1.length
            r3 = 0
        L_0x07b5:
            if (r3 >= r2) goto L_0x0ace
            r4 = r1[r3]
            java.lang.String r5 = r4.f7516b
            java.lang.Object r5 = r0.get(r5)
            java.util.Map r5 = (java.util.Map) r5
            if (r5 != 0) goto L_0x07dc
            com.google.android.gms.measurement.internal.ew r5 = r98.mo14294i()
            java.lang.String r6 = r4.f7516b
            r7 = r99
            java.util.Map r5 = r5.mo14783g(r7, r6)
            if (r5 != 0) goto L_0x07d6
            android.support.v4.util.ArrayMap r5 = new android.support.v4.util.ArrayMap
            r5.<init>()
        L_0x07d6:
            java.lang.String r6 = r4.f7516b
            r0.put(r6, r5)
            goto L_0x07de
        L_0x07dc:
            r7 = r99
        L_0x07de:
            java.util.Set r6 = r5.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x07e6:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0ab8
            java.lang.Object r8 = r6.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            boolean r9 = r14.contains(r9)
            if (r9 == 0) goto L_0x0812
            com.google.android.gms.measurement.internal.r r9 = r98.mo14235r()
            com.google.android.gms.measurement.internal.t r9 = r9.mo14838x()
            java.lang.String r10 = "Skipping failed audience ID"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9.mo14842a(r10, r8)
            goto L_0x07e6
        L_0x0812:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r10 = r79
            java.lang.Object r9 = r10.get(r9)
            com.google.android.gms.internal.measurement.bg r9 = (com.google.android.gms.internal.measurement.C1914bg) r9
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r12 = r80
            java.lang.Object r11 = r12.get(r11)
            java.util.BitSet r11 = (java.util.BitSet) r11
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            r15 = r78
            java.lang.Object r13 = r15.get(r13)
            java.util.BitSet r13 = (java.util.BitSet) r13
            if (r23 == 0) goto L_0x0857
            r83 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1 = r77
            java.lang.Object r0 = r1.get(r0)
            java.util.Map r0 = (java.util.Map) r0
            r84 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r85 = r2
            r2 = r72
            java.lang.Object r0 = r2.get(r0)
            java.util.Map r0 = (java.util.Map) r0
            goto L_0x0862
        L_0x0857:
            r83 = r0
            r85 = r2
            r2 = r72
            r1 = r77
            r0 = 0
            r84 = 0
        L_0x0862:
            if (r9 != 0) goto L_0x08af
            com.google.android.gms.internal.measurement.bg r9 = new com.google.android.gms.internal.measurement.bg
            r9.<init>()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r10.put(r11, r9)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r24)
            r9.f7448d = r11
            java.util.BitSet r11 = new java.util.BitSet
            r11.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r12.put(r9, r11)
            java.util.BitSet r13 = new java.util.BitSet
            r13.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r15.put(r9, r13)
            if (r23 == 0) goto L_0x08af
            android.support.v4.util.ArrayMap r0 = new android.support.v4.util.ArrayMap
            r0.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r1.put(r9, r0)
            android.support.v4.util.ArrayMap r9 = new android.support.v4.util.ArrayMap
            r9.<init>()
            r86 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r2.put(r0, r9)
            r87 = r2
            r0 = r86
            goto L_0x08b4
        L_0x08af:
            r9 = r0
            r87 = r2
            r0 = r84
        L_0x08b4:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            java.lang.Object r2 = r5.get(r2)
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x08c2:
            boolean r16 = r2.hasNext()
            if (r16 == 0) goto L_0x0aa2
            java.lang.Object r16 = r2.next()
            r88 = r2
            r2 = r16
            com.google.android.gms.internal.measurement.bb r2 = (com.google.android.gms.internal.measurement.C1909bb) r2
            r89 = r5
            com.google.android.gms.measurement.internal.r r5 = r98.mo14235r()
            r90 = r6
            r6 = 2
            boolean r5 = r5.mo14829a((int) r6)
            if (r5 == 0) goto L_0x091a
            com.google.android.gms.measurement.internal.r r5 = r98.mo14235r()
            com.google.android.gms.measurement.internal.t r5 = r5.mo14838x()
            java.lang.String r6 = "Evaluating filter. audience, filter, property"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r91 = r1
            java.lang.Integer r1 = r2.f7419a
            r92 = r15
            com.google.android.gms.measurement.internal.p r15 = r98.mo14232o()
            r93 = r10
            java.lang.String r10 = r2.f7420b
            java.lang.String r10 = r15.mo14826c(r10)
            r5.mo14844a(r6, r7, r1, r10)
            com.google.android.gms.measurement.internal.r r1 = r98.mo14235r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo14838x()
            java.lang.String r5 = "Filter definition"
            com.google.android.gms.measurement.internal.ei r6 = r98.mo14291g()
            java.lang.String r6 = r6.mo14548a((com.google.android.gms.internal.measurement.C1909bb) r2)
            r1.mo14842a(r5, r6)
            goto L_0x0920
        L_0x091a:
            r91 = r1
            r93 = r10
            r92 = r15
        L_0x0920:
            java.lang.Integer r1 = r2.f7419a
            if (r1 == 0) goto L_0x0a6b
            java.lang.Integer r1 = r2.f7419a
            int r1 = r1.intValue()
            r5 = 256(0x100, float:3.59E-43)
            if (r1 <= r5) goto L_0x0930
            goto L_0x0a6b
        L_0x0930:
            if (r23 == 0) goto L_0x09f8
            if (r2 == 0) goto L_0x0942
            java.lang.Boolean r1 = r2.f7422d
            if (r1 == 0) goto L_0x0942
            java.lang.Boolean r1 = r2.f7422d
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0942
            r1 = 1
            goto L_0x0943
        L_0x0942:
            r1 = 0
        L_0x0943:
            if (r2 == 0) goto L_0x0953
            java.lang.Boolean r6 = r2.f7423e
            if (r6 == 0) goto L_0x0953
            java.lang.Boolean r6 = r2.f7423e
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0953
            r6 = 1
            goto L_0x0954
        L_0x0953:
            r6 = 0
        L_0x0954:
            java.lang.Integer r7 = r2.f7419a
            int r7 = r7.intValue()
            boolean r7 = r11.get(r7)
            if (r7 == 0) goto L_0x0985
            if (r1 != 0) goto L_0x0985
            if (r6 != 0) goto L_0x0985
            com.google.android.gms.measurement.internal.r r1 = r98.mo14235r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo14838x()
            java.lang.String r6 = "Property filter already evaluated true and it is not associated with a dynamic audience. audience ID, filter ID"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r2 = r2.f7419a
            r1.mo14843a(r6, r7, r2)
            r2 = r88
            r5 = r89
            r6 = r90
            r1 = r91
            r15 = r92
            r10 = r93
            goto L_0x0a2d
        L_0x0985:
            r10 = r87
            r7 = r98
            java.lang.Boolean r15 = r7.m11140a((com.google.android.gms.internal.measurement.C1909bb) r2, (com.google.android.gms.internal.measurement.C1922bo) r4)
            com.google.android.gms.measurement.internal.r r16 = r98.mo14235r()
            com.google.android.gms.measurement.internal.t r5 = r16.mo14838x()
            r94 = r10
            java.lang.String r10 = "Property filter result"
            if (r15 != 0) goto L_0x09a2
            java.lang.String r16 = "null"
            r95 = r12
            r12 = r16
            goto L_0x09a5
        L_0x09a2:
            r95 = r12
            r12 = r15
        L_0x09a5:
            r5.mo14842a(r10, r12)
            if (r15 != 0) goto L_0x09b2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r14.add(r1)
            goto L_0x0a1d
        L_0x09b2:
            java.lang.Integer r5 = r2.f7419a
            int r5 = r5.intValue()
            r13.set(r5)
            java.lang.Integer r5 = r2.f7419a
            int r5 = r5.intValue()
            boolean r10 = r15.booleanValue()
            r11.set(r5, r10)
            boolean r5 = r15.booleanValue()
            if (r5 == 0) goto L_0x0a1d
            if (r1 != 0) goto L_0x09d2
            if (r6 == 0) goto L_0x0a1d
        L_0x09d2:
            java.lang.Long r1 = r4.f7515a
            if (r1 == 0) goto L_0x0a1d
            if (r6 == 0) goto L_0x09e8
            java.lang.Integer r1 = r2.f7419a
            int r1 = r1.intValue()
            java.lang.Long r2 = r4.f7515a
            long r5 = r2.longValue()
            m11148b(r9, r1, r5)
            goto L_0x0a1d
        L_0x09e8:
            java.lang.Integer r1 = r2.f7419a
            int r1 = r1.intValue()
            java.lang.Long r2 = r4.f7515a
            long r5 = r2.longValue()
            m11146a((java.util.Map<java.lang.Integer, java.lang.Long>) r0, (int) r1, (long) r5)
            goto L_0x0a1d
        L_0x09f8:
            r95 = r12
            r94 = r87
            r7 = r98
            java.lang.Integer r1 = r2.f7419a
            int r1 = r1.intValue()
            boolean r1 = r11.get(r1)
            if (r1 == 0) goto L_0x0a31
            com.google.android.gms.measurement.internal.r r1 = r98.mo14235r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo14838x()
            java.lang.String r5 = "Property filter already evaluated true. audience ID, filter ID"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r2 = r2.f7419a
            r1.mo14843a(r5, r6, r2)
        L_0x0a1d:
            r2 = r88
            r5 = r89
            r6 = r90
            r1 = r91
            r15 = r92
            r10 = r93
            r87 = r94
            r12 = r95
        L_0x0a2d:
            r7 = r99
            goto L_0x08c2
        L_0x0a31:
            java.lang.Boolean r1 = r7.m11140a((com.google.android.gms.internal.measurement.C1909bb) r2, (com.google.android.gms.internal.measurement.C1922bo) r4)
            com.google.android.gms.measurement.internal.r r5 = r98.mo14235r()
            com.google.android.gms.measurement.internal.t r5 = r5.mo14838x()
            java.lang.String r6 = "Property filter result"
            if (r1 != 0) goto L_0x0a44
            java.lang.String r10 = "null"
            goto L_0x0a45
        L_0x0a44:
            r10 = r1
        L_0x0a45:
            r5.mo14842a(r6, r10)
            if (r1 != 0) goto L_0x0a52
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r14.add(r1)
            goto L_0x0a1d
        L_0x0a52:
            java.lang.Integer r5 = r2.f7419a
            int r5 = r5.intValue()
            r13.set(r5)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0a1d
            java.lang.Integer r1 = r2.f7419a
            int r1 = r1.intValue()
            r11.set(r1)
            goto L_0x0a1d
        L_0x0a6b:
            r95 = r12
            r94 = r87
            r7 = r98
            com.google.android.gms.measurement.internal.r r0 = r98.mo14235r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo14833i()
            java.lang.String r1 = "Invalid property filter ID. appId, id"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r99)
            java.lang.Integer r2 = r2.f7419a
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.mo14843a(r1, r5, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r14.add(r0)
            r0 = r83
            r2 = r85
            r5 = r89
            r6 = r90
            r77 = r91
            r78 = r92
            r79 = r93
            r72 = r94
            r80 = r95
            goto L_0x0ab2
        L_0x0aa2:
            r7 = r98
            r77 = r1
            r79 = r10
            r80 = r12
            r78 = r15
            r0 = r83
            r2 = r85
            r72 = r87
        L_0x0ab2:
            r1 = r101
            r7 = r99
            goto L_0x07e6
        L_0x0ab8:
            r83 = r0
            r85 = r2
            r94 = r72
            r91 = r77
            r92 = r78
            r93 = r79
            r95 = r80
            r7 = r98
            int r3 = r3 + 1
            r1 = r101
            goto L_0x07b5
        L_0x0ace:
            r94 = r72
            r91 = r77
            r92 = r78
            r93 = r79
            r95 = r80
            r7 = r98
            int r0 = r95.size()
            com.google.android.gms.internal.measurement.bg[] r1 = new com.google.android.gms.internal.measurement.C1914bg[r0]
            java.util.Set r0 = r95.keySet()
            java.util.Iterator r2 = r0.iterator()
            r3 = 0
        L_0x0ae9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0c9a
            java.lang.Object r0 = r2.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            boolean r4 = r14.contains(r4)
            if (r4 != 0) goto L_0x0c96
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r5 = r93
            java.lang.Object r4 = r5.get(r4)
            com.google.android.gms.internal.measurement.bg r4 = (com.google.android.gms.internal.measurement.C1914bg) r4
            if (r4 != 0) goto L_0x0b16
            com.google.android.gms.internal.measurement.bg r4 = new com.google.android.gms.internal.measurement.bg
            r4.<init>()
        L_0x0b16:
            int r6 = r3 + 1
            r1[r3] = r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r4.f7445a = r3
            com.google.android.gms.internal.measurement.bm r3 = new com.google.android.gms.internal.measurement.bm
            r3.<init>()
            r4.f7446b = r3
            com.google.android.gms.internal.measurement.bm r3 = r4.f7446b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r9 = r95
            java.lang.Object r8 = r9.get(r8)
            java.util.BitSet r8 = (java.util.BitSet) r8
            long[] r8 = com.google.android.gms.measurement.internal.C2261ei.m10984a((java.util.BitSet) r8)
            r3.f7508b = r8
            com.google.android.gms.internal.measurement.bm r3 = r4.f7446b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r10 = r92
            java.lang.Object r8 = r10.get(r8)
            java.util.BitSet r8 = (java.util.BitSet) r8
            long[] r8 = com.google.android.gms.measurement.internal.C2261ei.m10984a((java.util.BitSet) r8)
            r3.f7507a = r8
            if (r23 == 0) goto L_0x0bef
            com.google.android.gms.internal.measurement.bm r3 = r4.f7446b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r11 = r91
            java.lang.Object r8 = r11.get(r8)
            java.util.Map r8 = (java.util.Map) r8
            com.google.android.gms.internal.measurement.bh[] r8 = m11147a(r8)
            r3.f7509c = r8
            com.google.android.gms.internal.measurement.bm r3 = r4.f7446b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r12 = r94
            java.lang.Object r8 = r12.get(r8)
            java.util.Map r8 = (java.util.Map) r8
            if (r8 != 0) goto L_0x0b7f
            r13 = 0
            com.google.android.gms.internal.measurement.bn[] r8 = new com.google.android.gms.internal.measurement.C1921bn[r13]
            r96 = r2
            r97 = r5
            r15 = r8
            goto L_0x0bec
        L_0x0b7f:
            r13 = 0
            int r15 = r8.size()
            com.google.android.gms.internal.measurement.bn[] r15 = new com.google.android.gms.internal.measurement.C1921bn[r15]
            java.util.Set r16 = r8.keySet()
            java.util.Iterator r16 = r16.iterator()
            r17 = 0
        L_0x0b90:
            boolean r18 = r16.hasNext()
            if (r18 == 0) goto L_0x0be8
            java.lang.Object r18 = r16.next()
            r13 = r18
            java.lang.Integer r13 = (java.lang.Integer) r13
            r96 = r2
            com.google.android.gms.internal.measurement.bn r2 = new com.google.android.gms.internal.measurement.bn
            r2.<init>()
            r2.f7512a = r13
            java.lang.Object r13 = r8.get(r13)
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto L_0x0bda
            java.util.Collections.sort(r13)
            r97 = r5
            int r5 = r13.size()
            long[] r5 = new long[r5]
            java.util.Iterator r13 = r13.iterator()
            r18 = 0
        L_0x0bc0:
            boolean r19 = r13.hasNext()
            if (r19 == 0) goto L_0x0bd7
            java.lang.Object r19 = r13.next()
            java.lang.Long r19 = (java.lang.Long) r19
            int r20 = r18 + 1
            long r21 = r19.longValue()
            r5[r18] = r21
            r18 = r20
            goto L_0x0bc0
        L_0x0bd7:
            r2.f7513b = r5
            goto L_0x0bdc
        L_0x0bda:
            r97 = r5
        L_0x0bdc:
            int r5 = r17 + 1
            r15[r17] = r2
            r17 = r5
            r2 = r96
            r5 = r97
            r13 = 0
            goto L_0x0b90
        L_0x0be8:
            r96 = r2
            r97 = r5
        L_0x0bec:
            r3.f7510d = r15
            goto L_0x0bf7
        L_0x0bef:
            r96 = r2
            r97 = r5
            r11 = r91
            r12 = r94
        L_0x0bf7:
            com.google.android.gms.measurement.internal.ew r2 = r98.mo14294i()
            com.google.android.gms.internal.measurement.bm r3 = r4.f7446b
            r2.mo14508k()
            r2.mo14221d()
            com.google.android.gms.common.internal.C0926p.m1308a((java.lang.String) r99)
            com.google.android.gms.common.internal.C0926p.m1306a(r3)
            int r4 = r3.mo14106e()     // Catch:{ IOException -> 0x0c71 }
            byte[] r4 = new byte[r4]     // Catch:{ IOException -> 0x0c71 }
            int r5 = r4.length     // Catch:{ IOException -> 0x0c71 }
            r8 = 0
            com.google.android.gms.internal.measurement.hw r5 = com.google.android.gms.internal.measurement.C2107hw.m10220a(r4, r8, r5)     // Catch:{ IOException -> 0x0c6f }
            r3.mo13499a((com.google.android.gms.internal.measurement.C2107hw) r5)     // Catch:{ IOException -> 0x0c6f }
            r5.mo14068a()     // Catch:{ IOException -> 0x0c6f }
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.String r5 = "app_id"
            r13 = r99
            r3.put(r5, r13)
            java.lang.String r5 = "audience_id"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.put(r5, r0)
            java.lang.String r0 = "current_results"
            r3.put(r0, r4)
            android.database.sqlite.SQLiteDatabase r0 = r2.mo14787y()     // Catch:{ SQLiteException -> 0x0c5b }
            java.lang.String r4 = "audience_filter_values"
            r5 = 5
            r15 = 0
            long r3 = r0.insertWithOnConflict(r4, r15, r3, r5)     // Catch:{ SQLiteException -> 0x0c59 }
            r16 = -1
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x0c87
            com.google.android.gms.measurement.internal.r r0 = r2.mo14235r()     // Catch:{ SQLiteException -> 0x0c59 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo14830d_()     // Catch:{ SQLiteException -> 0x0c59 }
            java.lang.String r3 = "Failed to insert filter results (got -1). appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r99)     // Catch:{ SQLiteException -> 0x0c59 }
            r0.mo14842a(r3, r4)     // Catch:{ SQLiteException -> 0x0c59 }
            goto L_0x0c87
        L_0x0c59:
            r0 = move-exception
            goto L_0x0c5d
        L_0x0c5b:
            r0 = move-exception
            r15 = 0
        L_0x0c5d:
            com.google.android.gms.measurement.internal.r r2 = r2.mo14235r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo14830d_()
            java.lang.String r3 = "Error storing filter results. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r99)
            r2.mo14843a(r3, r4, r0)
            goto L_0x0c87
        L_0x0c6f:
            r0 = move-exception
            goto L_0x0c73
        L_0x0c71:
            r0 = move-exception
            r8 = 0
        L_0x0c73:
            r13 = r99
            r15 = 0
            com.google.android.gms.measurement.internal.r r2 = r2.mo14235r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo14830d_()
            java.lang.String r3 = "Configuration loss. Failed to serialize filter results. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C2295r.m11413a((java.lang.String) r99)
            r2.mo14843a(r3, r4, r0)
        L_0x0c87:
            r3 = r6
            r95 = r9
            r92 = r10
            r91 = r11
            r94 = r12
            r2 = r96
            r93 = r97
            goto L_0x0ae9
        L_0x0c96:
            r13 = r99
            goto L_0x0ae9
        L_0x0c9a:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r3)
            com.google.android.gms.internal.measurement.bg[] r0 = (com.google.android.gms.internal.measurement.C1914bg[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2269eq.mo14711a(java.lang.String, com.google.android.gms.internal.measurement.bi[], com.google.android.gms.internal.measurement.bo[]):com.google.android.gms.internal.measurement.bg[]");
    }

    /* renamed from: a */
    private final Boolean m11139a(C1905ay ayVar, String str, C1917bj[] bjVarArr, long j) {
        Boolean bool;
        if (ayVar.f7403d != null) {
            Boolean a = m11138a(j, ayVar.f7403d);
            if (a == null) {
                return null;
            }
            if (!a.booleanValue()) {
                return false;
            }
        }
        HashSet hashSet = new HashSet();
        for (C1906az azVar : ayVar.f7402c) {
            if (TextUtils.isEmpty(azVar.f7411d)) {
                mo14235r().mo14833i().mo14842a("null or empty param name in filter. event", mo14232o().mo14824a(str));
                return null;
            }
            hashSet.add(azVar.f7411d);
        }
        ArrayMap arrayMap = new ArrayMap();
        for (C1917bj bjVar : bjVarArr) {
            if (hashSet.contains(bjVar.f7459a)) {
                if (bjVar.f7461c != null) {
                    arrayMap.put(bjVar.f7459a, bjVar.f7461c);
                } else if (bjVar.f7462d != null) {
                    arrayMap.put(bjVar.f7459a, bjVar.f7462d);
                } else if (bjVar.f7460b != null) {
                    arrayMap.put(bjVar.f7459a, bjVar.f7460b);
                } else {
                    mo14235r().mo14833i().mo14843a("Unknown value for param. event, param", mo14232o().mo14824a(str), mo14232o().mo14825b(bjVar.f7459a));
                    return null;
                }
            }
        }
        for (C1906az azVar2 : ayVar.f7402c) {
            boolean equals = Boolean.TRUE.equals(azVar2.f7410c);
            String str2 = azVar2.f7411d;
            if (TextUtils.isEmpty(str2)) {
                mo14235r().mo14833i().mo14842a("Event has empty param name. event", mo14232o().mo14824a(str));
                return null;
            }
            Object obj = arrayMap.get(str2);
            if (obj instanceof Long) {
                if (azVar2.f7409b == null) {
                    mo14235r().mo14833i().mo14843a("No number filter for long param. event, param", mo14232o().mo14824a(str), mo14232o().mo14825b(str2));
                    return null;
                }
                Boolean a2 = m11138a(((Long) obj).longValue(), azVar2.f7409b);
                if (a2 == null) {
                    return null;
                }
                if ((true ^ a2.booleanValue()) ^ equals) {
                    return false;
                }
            } else if (obj instanceof Double) {
                if (azVar2.f7409b == null) {
                    mo14235r().mo14833i().mo14843a("No number filter for double param. event, param", mo14232o().mo14824a(str), mo14232o().mo14825b(str2));
                    return null;
                }
                Boolean a3 = m11137a(((Double) obj).doubleValue(), azVar2.f7409b);
                if (a3 == null) {
                    return null;
                }
                if ((true ^ a3.booleanValue()) ^ equals) {
                    return false;
                }
            } else if (obj instanceof String) {
                if (azVar2.f7408a != null) {
                    bool = m11144a((String) obj, azVar2.f7408a);
                } else if (azVar2.f7409b != null) {
                    String str3 = (String) obj;
                    if (C2261ei.m10982a(str3)) {
                        bool = m11143a(str3, azVar2.f7409b);
                    } else {
                        mo14235r().mo14833i().mo14843a("Invalid param value for number filter. event, param", mo14232o().mo14824a(str), mo14232o().mo14825b(str2));
                        return null;
                    }
                } else {
                    mo14235r().mo14833i().mo14843a("No filter for String param. event, param", mo14232o().mo14824a(str), mo14232o().mo14825b(str2));
                    return null;
                }
                if (bool == null) {
                    return null;
                }
                if ((true ^ bool.booleanValue()) ^ equals) {
                    return false;
                }
            } else if (obj == null) {
                mo14235r().mo14838x().mo14843a("Missing param for filter. event, param", mo14232o().mo14824a(str), mo14232o().mo14825b(str2));
                return false;
            } else {
                mo14235r().mo14833i().mo14843a("Unknown param type. event, param", mo14232o().mo14824a(str), mo14232o().mo14825b(str2));
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    private final Boolean m11140a(C1909bb bbVar, C1922bo boVar) {
        C1906az azVar = bbVar.f7421c;
        if (azVar == null) {
            mo14235r().mo14833i().mo14842a("Missing property filter. property", mo14232o().mo14826c(boVar.f7516b));
            return null;
        }
        boolean equals = Boolean.TRUE.equals(azVar.f7410c);
        if (boVar.f7518d != null) {
            if (azVar.f7409b != null) {
                return m11141a(m11138a(boVar.f7518d.longValue(), azVar.f7409b), equals);
            }
            mo14235r().mo14833i().mo14842a("No number filter for long property. property", mo14232o().mo14826c(boVar.f7516b));
            return null;
        } else if (boVar.f7519e != null) {
            if (azVar.f7409b != null) {
                return m11141a(m11137a(boVar.f7519e.doubleValue(), azVar.f7409b), equals);
            }
            mo14235r().mo14833i().mo14842a("No number filter for double property. property", mo14232o().mo14826c(boVar.f7516b));
            return null;
        } else if (boVar.f7517c == null) {
            mo14235r().mo14833i().mo14842a("User property has no value, property", mo14232o().mo14826c(boVar.f7516b));
            return null;
        } else if (azVar.f7408a != null) {
            return m11141a(m11144a(boVar.f7517c, azVar.f7408a), equals);
        } else {
            if (azVar.f7409b == null) {
                mo14235r().mo14833i().mo14842a("No string or number filter defined. property", mo14232o().mo14826c(boVar.f7516b));
            } else if (C2261ei.m10982a(boVar.f7517c)) {
                return m11141a(m11143a(boVar.f7517c, azVar.f7409b), equals);
            } else {
                mo14235r().mo14833i().mo14843a("Invalid user property value for Numeric number filter. property, value", mo14232o().mo14826c(boVar.f7516b), boVar.f7517c);
            }
            return null;
        }
    }

    /* renamed from: a */
    private static Boolean m11141a(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() ^ z);
    }

    /* renamed from: a */
    private final Boolean m11144a(String str, C1910bc bcVar) {
        String str2;
        ArrayList arrayList;
        C0926p.m1306a(bcVar);
        if (str == null || bcVar.f7424a == null || bcVar.f7424a.intValue() == 0) {
            return null;
        }
        if (bcVar.f7424a.intValue() == 6) {
            if (bcVar.f7427d == null || bcVar.f7427d.length == 0) {
                return null;
            }
        } else if (bcVar.f7425b == null) {
            return null;
        }
        int intValue = bcVar.f7424a.intValue();
        boolean z = bcVar.f7426c != null && bcVar.f7426c.booleanValue();
        if (z || intValue == 1 || intValue == 6) {
            str2 = bcVar.f7425b;
        } else {
            str2 = bcVar.f7425b.toUpperCase(Locale.ENGLISH);
        }
        String str3 = str2;
        if (bcVar.f7427d == null) {
            arrayList = null;
        } else {
            String[] strArr = bcVar.f7427d;
            if (z) {
                arrayList = Arrays.asList(strArr);
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (String upperCase : strArr) {
                    arrayList2.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                arrayList = arrayList2;
            }
        }
        return m11142a(str, intValue, z, str3, arrayList, intValue == 1 ? str3 : null);
    }

    /* renamed from: a */
    private final Boolean m11142a(String str, int i, boolean z, String str2, List<String> list, String str3) {
        if (str == null) {
            return null;
        }
        if (i == 6) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 1) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i) {
            case 1:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    mo14235r().mo14833i().mo14842a("Invalid regular expression in REGEXP audience filter. expression", str3);
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    /* renamed from: a */
    private final Boolean m11138a(long j, C1908ba baVar) {
        try {
            return m11145a(new BigDecimal(j), baVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private final Boolean m11137a(double d, C1908ba baVar) {
        try {
            return m11145a(new BigDecimal(d), baVar, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private final Boolean m11143a(String str, C1908ba baVar) {
        if (!C2261ei.m10982a(str)) {
            return null;
        }
        try {
            return m11145a(new BigDecimal(str), baVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0072, code lost:
        if (r3 != null) goto L_0x0074;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Boolean m11145a(java.math.BigDecimal r7, com.google.android.gms.internal.measurement.C1908ba r8, double r9) {
        /*
            com.google.android.gms.common.internal.C0926p.m1306a(r8)
            java.lang.Integer r0 = r8.f7413a
            r1 = 0
            if (r0 == 0) goto L_0x00f0
            java.lang.Integer r0 = r8.f7413a
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0012
            goto L_0x00f0
        L_0x0012:
            java.lang.Integer r0 = r8.f7413a
            int r0 = r0.intValue()
            r2 = 4
            if (r0 != r2) goto L_0x0024
            java.lang.String r0 = r8.f7416d
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = r8.f7417e
            if (r0 != 0) goto L_0x0029
        L_0x0023:
            return r1
        L_0x0024:
            java.lang.String r0 = r8.f7415c
            if (r0 != 0) goto L_0x0029
            return r1
        L_0x0029:
            java.lang.Integer r0 = r8.f7413a
            int r0 = r0.intValue()
            java.lang.Integer r3 = r8.f7413a
            int r3 = r3.intValue()
            if (r3 != r2) goto L_0x005b
            java.lang.String r3 = r8.f7416d
            boolean r3 = com.google.android.gms.measurement.internal.C2261ei.m10982a((java.lang.String) r3)
            if (r3 == 0) goto L_0x005a
            java.lang.String r3 = r8.f7417e
            boolean r3 = com.google.android.gms.measurement.internal.C2261ei.m10982a((java.lang.String) r3)
            if (r3 != 0) goto L_0x0048
            goto L_0x005a
        L_0x0048:
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0059 }
            java.lang.String r4 = r8.f7416d     // Catch:{ NumberFormatException -> 0x0059 }
            r3.<init>(r4)     // Catch:{ NumberFormatException -> 0x0059 }
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0059 }
            java.lang.String r8 = r8.f7417e     // Catch:{ NumberFormatException -> 0x0059 }
            r4.<init>(r8)     // Catch:{ NumberFormatException -> 0x0059 }
            r8 = r3
            r3 = r1
            goto L_0x006d
        L_0x0059:
            return r1
        L_0x005a:
            return r1
        L_0x005b:
            java.lang.String r3 = r8.f7415c
            boolean r3 = com.google.android.gms.measurement.internal.C2261ei.m10982a((java.lang.String) r3)
            if (r3 != 0) goto L_0x0064
            return r1
        L_0x0064:
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x00ef }
            java.lang.String r8 = r8.f7415c     // Catch:{ NumberFormatException -> 0x00ef }
            r3.<init>(r8)     // Catch:{ NumberFormatException -> 0x00ef }
            r8 = r1
            r4 = r8
        L_0x006d:
            if (r0 != r2) goto L_0x0072
            if (r8 != 0) goto L_0x0074
            return r1
        L_0x0072:
            if (r3 == 0) goto L_0x00ee
        L_0x0074:
            r2 = -1
            r5 = 0
            r6 = 1
            switch(r0) {
                case 1: goto L_0x00e2;
                case 2: goto L_0x00d6;
                case 3: goto L_0x008d;
                case 4: goto L_0x007b;
                default: goto L_0x007a;
            }
        L_0x007a:
            goto L_0x00ee
        L_0x007b:
            int r8 = r7.compareTo(r8)
            if (r8 == r2) goto L_0x0088
            int r7 = r7.compareTo(r4)
            if (r7 == r6) goto L_0x0088
            r5 = 1
        L_0x0088:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        L_0x008d:
            r0 = 0
            int r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x00ca
            java.math.BigDecimal r8 = new java.math.BigDecimal
            r8.<init>(r9)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r1 = 2
            r0.<init>(r1)
            java.math.BigDecimal r8 = r8.multiply(r0)
            java.math.BigDecimal r8 = r3.subtract(r8)
            int r8 = r7.compareTo(r8)
            if (r8 != r6) goto L_0x00c5
            java.math.BigDecimal r8 = new java.math.BigDecimal
            r8.<init>(r9)
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r1)
            java.math.BigDecimal r8 = r8.multiply(r9)
            java.math.BigDecimal r8 = r3.add(r8)
            int r7 = r7.compareTo(r8)
            if (r7 != r2) goto L_0x00c5
            r5 = 1
        L_0x00c5:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        L_0x00ca:
            int r7 = r7.compareTo(r3)
            if (r7 != 0) goto L_0x00d1
            r5 = 1
        L_0x00d1:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        L_0x00d6:
            int r7 = r7.compareTo(r3)
            if (r7 != r6) goto L_0x00dd
            r5 = 1
        L_0x00dd:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        L_0x00e2:
            int r7 = r7.compareTo(r3)
            if (r7 != r2) goto L_0x00e9
            r5 = 1
        L_0x00e9:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        L_0x00ee:
            return r1
        L_0x00ef:
            return r1
        L_0x00f0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2269eq.m11145a(java.math.BigDecimal, com.google.android.gms.internal.measurement.ba, double):java.lang.Boolean");
    }

    /* renamed from: a */
    private static C1915bh[] m11147a(Map<Integer, Long> map) {
        if (map == null) {
            return null;
        }
        int i = 0;
        C1915bh[] bhVarArr = new C1915bh[map.size()];
        for (Integer next : map.keySet()) {
            C1915bh bhVar = new C1915bh();
            bhVar.f7450a = next;
            bhVar.f7451b = map.get(next);
            bhVarArr[i] = bhVar;
            i++;
        }
        return bhVarArr;
    }

    /* renamed from: a */
    private static void m11146a(Map<Integer, Long> map, int i, long j) {
        Long l = map.get(Integer.valueOf(i));
        long j2 = j / 1000;
        if (l == null || j2 > l.longValue()) {
            map.put(Integer.valueOf(i), Long.valueOf(j2));
        }
    }

    /* renamed from: b */
    private static void m11148b(Map<Integer, List<Long>> map, int i, long j) {
        List list = map.get(Integer.valueOf(i));
        if (list == null) {
            list = new ArrayList();
            map.put(Integer.valueOf(i), list);
        }
        list.add(Long.valueOf(j / 1000));
    }
}
