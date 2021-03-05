package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.support.p034v4.util.ArrayMap;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.C0819c;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.util.C0969e;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.cc */
public final class C2200cc extends C2238dn {

    /* renamed from: a */
    protected C2209cl f8245a;

    /* renamed from: b */
    protected boolean f8246b = true;

    /* renamed from: c */
    private C2195by f8247c;

    /* renamed from: d */
    private final Set<C2196bz> f8248d = new CopyOnWriteArraySet();

    /* renamed from: e */
    private boolean f8249e;

    /* renamed from: f */
    private final AtomicReference<String> f8250f = new AtomicReference<>();

    protected C2200cc(C2166aw awVar) {
        super(awVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final boolean mo14406v() {
        return false;
    }

    /* renamed from: a */
    public final void mo14401a(boolean z) {
        mo14486E();
        mo14218b();
        mo14234q().mo14296a((Runnable) new C2208ck(this, z));
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: C */
    public final void m10639C() {
        if (!mo14237t().mo14733j(mo14224g().mo14808x()) || !this.f8222q.mo14307C() || !this.f8246b) {
            mo14235r().mo14837w().mo14841a("Updating Scion state (FE)");
            mo14225h().mo14450y();
            return;
        }
        mo14235r().mo14837w().mo14841a("Recording app launch after enabling measurement for the first time (FE)");
        mo14408y();
    }

    /* renamed from: a */
    public final void mo14395a(String str, String str2, Bundle bundle) {
        mo14396a(str, str2, bundle, true, true, mo14230m().mo9996a());
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: b */
    public final void mo14404b(String str, String str2, Bundle bundle) {
        mo14218b();
        mo14221d();
        mo14394a(str, str2, mo14230m().mo9996a(), bundle);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public final void mo14394a(String str, String str2, long j, Bundle bundle) {
        mo14218b();
        mo14221d();
        m10643a(str, str2, j, bundle, true, this.f8247c == null || C2264el.m11035e(str2), false, (String) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b8  */
    @android.support.annotation.WorkerThread
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m10643a(java.lang.String r29, java.lang.String r30, long r31, android.os.Bundle r33, boolean r34, boolean r35, boolean r36, java.lang.String r37) {
        /*
            r28 = this;
            r1 = r28
            r8 = r29
            r6 = r30
            r5 = r33
            r7 = r37
            com.google.android.gms.common.internal.C0926p.m1308a((java.lang.String) r29)
            com.google.android.gms.measurement.internal.et r0 = r28.mo14237t()
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.C2284h.f8556au
            boolean r0 = r0.mo14723d(r7, r4)
            if (r0 != 0) goto L_0x001c
            com.google.android.gms.common.internal.C0926p.m1308a((java.lang.String) r30)
        L_0x001c:
            com.google.android.gms.common.internal.C0926p.m1306a(r33)
            r28.mo14221d()
            r28.mo14486E()
            com.google.android.gms.measurement.internal.aw r0 = r1.f8222q
            boolean r0 = r0.mo14307C()
            if (r0 != 0) goto L_0x003b
            com.google.android.gms.measurement.internal.r r0 = r28.mo14235r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo14837w()
            java.lang.String r2 = "Event not sent since app measurement is disabled"
            r0.mo14841a(r2)
            return
        L_0x003b:
            boolean r0 = r1.f8249e
            r4 = 0
            r16 = 0
            r15 = 1
            if (r0 != 0) goto L_0x007f
            r1.f8249e = r15
            java.lang.String r0 = "com.google.android.gms.tagmanager.TagManagerService"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0072 }
            java.lang.String r9 = "initialize"
            java.lang.Class[] r10 = new java.lang.Class[r15]     // Catch:{ Exception -> 0x0063 }
            java.lang.Class<android.content.Context> r11 = android.content.Context.class
            r10[r16] = r11     // Catch:{ Exception -> 0x0063 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r9, r10)     // Catch:{ Exception -> 0x0063 }
            java.lang.Object[] r9 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0063 }
            android.content.Context r10 = r28.mo14231n()     // Catch:{ Exception -> 0x0063 }
            r9[r16] = r10     // Catch:{ Exception -> 0x0063 }
            r0.invoke(r4, r9)     // Catch:{ Exception -> 0x0063 }
            goto L_0x007f
        L_0x0063:
            r0 = move-exception
            com.google.android.gms.measurement.internal.r r9 = r28.mo14235r()     // Catch:{ ClassNotFoundException -> 0x0072 }
            com.google.android.gms.measurement.internal.t r9 = r9.mo14833i()     // Catch:{ ClassNotFoundException -> 0x0072 }
            java.lang.String r10 = "Failed to invoke Tag Manager's initialize() method"
            r9.mo14842a(r10, r0)     // Catch:{ ClassNotFoundException -> 0x0072 }
            goto L_0x007f
        L_0x0072:
            com.google.android.gms.measurement.internal.r r0 = r28.mo14235r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo14836v()
            java.lang.String r9 = "Tag Manager is not found and thus will not be used"
            r0.mo14841a(r9)
        L_0x007f:
            r0 = 40
            r9 = 2
            if (r36 == 0) goto L_0x00ec
            r28.mo14238u()
            java.lang.String r10 = "_iap"
            boolean r10 = r10.equals(r6)
            if (r10 != 0) goto L_0x00ec
            com.google.android.gms.measurement.internal.aw r10 = r1.f8222q
            com.google.android.gms.measurement.internal.el r10 = r10.mo14325j()
            java.lang.String r11 = "event"
            boolean r11 = r10.mo14572a((java.lang.String) r11, (java.lang.String) r6)
            if (r11 != 0) goto L_0x009f
        L_0x009d:
            r10 = 2
            goto L_0x00b6
        L_0x009f:
            java.lang.String r11 = "event"
            java.lang.String[] r12 = com.google.android.gms.measurement.internal.C2192bv.f8224a
            boolean r11 = r10.mo14573a((java.lang.String) r11, (java.lang.String[]) r12, (java.lang.String) r6)
            if (r11 != 0) goto L_0x00ac
            r10 = 13
            goto L_0x00b6
        L_0x00ac:
            java.lang.String r11 = "event"
            boolean r10 = r10.mo14571a((java.lang.String) r11, (int) r0, (java.lang.String) r6)
            if (r10 != 0) goto L_0x00b5
            goto L_0x009d
        L_0x00b5:
            r10 = 0
        L_0x00b6:
            if (r10 == 0) goto L_0x00ec
            com.google.android.gms.measurement.internal.r r2 = r28.mo14235r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo14832h()
            java.lang.String r3 = "Invalid public event name. Event will not be logged (FE)"
            com.google.android.gms.measurement.internal.p r4 = r28.mo14232o()
            java.lang.String r4 = r4.mo14824a((java.lang.String) r6)
            r2.mo14842a(r3, r4)
            com.google.android.gms.measurement.internal.aw r2 = r1.f8222q
            r2.mo14325j()
            java.lang.String r0 = com.google.android.gms.measurement.internal.C2264el.m11020a((java.lang.String) r6, (int) r0, (boolean) r15)
            if (r6 == 0) goto L_0x00df
            int r16 = r30.length()
            r2 = r16
            goto L_0x00e0
        L_0x00df:
            r2 = 0
        L_0x00e0:
            com.google.android.gms.measurement.internal.aw r3 = r1.f8222q
            com.google.android.gms.measurement.internal.el r3 = r3.mo14325j()
            java.lang.String r4 = "_ev"
            r3.mo14567a((int) r10, (java.lang.String) r4, (java.lang.String) r0, (int) r2)
            return
        L_0x00ec:
            r28.mo14238u()
            com.google.android.gms.measurement.internal.cp r10 = r28.mo14226i()
            com.google.android.gms.measurement.internal.co r14 = r10.mo14433x()
            if (r14 == 0) goto L_0x0103
            java.lang.String r10 = "_sc"
            boolean r10 = r5.containsKey(r10)
            if (r10 != 0) goto L_0x0103
            r14.f8288d = r15
        L_0x0103:
            if (r34 == 0) goto L_0x0109
            if (r36 == 0) goto L_0x0109
            r10 = 1
            goto L_0x010a
        L_0x0109:
            r10 = 0
        L_0x010a:
            com.google.android.gms.measurement.internal.C2213cp.m10706a((com.google.android.gms.measurement.internal.C2212co) r14, (android.os.Bundle) r5, (boolean) r10)
            java.lang.String r10 = "am"
            boolean r17 = r10.equals(r8)
            boolean r10 = com.google.android.gms.measurement.internal.C2264el.m11035e(r30)
            if (r34 == 0) goto L_0x014c
            com.google.android.gms.measurement.internal.by r2 = r1.f8247c
            if (r2 == 0) goto L_0x014c
            if (r10 != 0) goto L_0x014c
            if (r17 != 0) goto L_0x014c
            com.google.android.gms.measurement.internal.r r0 = r28.mo14235r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo14837w()
            java.lang.String r2 = "Passing event to registered event handler (FE)"
            com.google.android.gms.measurement.internal.p r3 = r28.mo14232o()
            java.lang.String r3 = r3.mo14824a((java.lang.String) r6)
            com.google.android.gms.measurement.internal.p r4 = r28.mo14232o()
            java.lang.String r4 = r4.mo14821a((android.os.Bundle) r5)
            r0.mo14843a(r2, r3, r4)
            com.google.android.gms.measurement.internal.by r2 = r1.f8247c
            r3 = r29
            r4 = r30
            r5 = r33
            r6 = r31
            r2.mo14381a(r3, r4, r5, r6)
            return
        L_0x014c:
            com.google.android.gms.measurement.internal.aw r2 = r1.f8222q
            boolean r2 = r2.mo14312H()
            if (r2 != 0) goto L_0x0155
            return
        L_0x0155:
            com.google.android.gms.measurement.internal.el r2 = r28.mo14233p()
            int r2 = r2.mo14574b((java.lang.String) r6)
            if (r2 == 0) goto L_0x019b
            com.google.android.gms.measurement.internal.r r3 = r28.mo14235r()
            com.google.android.gms.measurement.internal.t r3 = r3.mo14832h()
            java.lang.String r4 = "Invalid event name. Event will not be logged (FE)"
            com.google.android.gms.measurement.internal.p r5 = r28.mo14232o()
            java.lang.String r5 = r5.mo14824a((java.lang.String) r6)
            r3.mo14842a(r4, r5)
            r28.mo14233p()
            java.lang.String r0 = com.google.android.gms.measurement.internal.C2264el.m11020a((java.lang.String) r6, (int) r0, (boolean) r15)
            if (r6 == 0) goto L_0x0183
            int r3 = r30.length()
            r16 = r3
        L_0x0183:
            com.google.android.gms.measurement.internal.aw r3 = r1.f8222q
            com.google.android.gms.measurement.internal.el r3 = r3.mo14325j()
            java.lang.String r4 = "_ev"
            r29 = r3
            r30 = r37
            r31 = r2
            r32 = r4
            r33 = r0
            r34 = r16
            r29.mo14570a((java.lang.String) r30, (int) r31, (java.lang.String) r32, (java.lang.String) r33, (int) r34)
            return
        L_0x019b:
            r0 = 4
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r2 = "_o"
            r0[r16] = r2
            java.lang.String r2 = "_sn"
            r0[r15] = r2
            java.lang.String r2 = "_sc"
            r0[r9] = r2
            r2 = 3
            java.lang.String r9 = "_si"
            r0[r2] = r9
            java.util.List r0 = com.google.android.gms.common.util.C0970f.m1473a((T[]) r0)
            com.google.android.gms.measurement.internal.el r9 = r28.mo14233p()
            r2 = 1
            r10 = r37
            r11 = r30
            r12 = r33
            r13 = r0
            r18 = r14
            r14 = r36
            r5 = 1
            r15 = r2
            android.os.Bundle r2 = r9.mo14564a(r10, r11, r12, r13, r14, r15)
            if (r2 == 0) goto L_0x01fd
            java.lang.String r9 = "_sc"
            boolean r9 = r2.containsKey(r9)
            if (r9 == 0) goto L_0x01fd
            java.lang.String r9 = "_si"
            boolean r9 = r2.containsKey(r9)
            if (r9 != 0) goto L_0x01dc
            goto L_0x01fd
        L_0x01dc:
            java.lang.String r4 = "_sn"
            java.lang.String r4 = r2.getString(r4)
            java.lang.String r9 = "_sc"
            java.lang.String r9 = r2.getString(r9)
            java.lang.String r10 = "_si"
            long r10 = r2.getLong(r10)
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            com.google.android.gms.measurement.internal.co r11 = new com.google.android.gms.measurement.internal.co
            long r12 = r10.longValue()
            r11.<init>(r4, r9, r12)
            r14 = r11
            goto L_0x01fe
        L_0x01fd:
            r14 = r4
        L_0x01fe:
            if (r14 != 0) goto L_0x0203
            r4 = r18
            goto L_0x0204
        L_0x0203:
            r4 = r14
        L_0x0204:
            com.google.android.gms.measurement.internal.et r9 = r28.mo14237t()
            boolean r9 = r9.mo14743t(r7)
            r10 = 0
            if (r9 == 0) goto L_0x0238
            r28.mo14238u()
            com.google.android.gms.measurement.internal.cp r9 = r28.mo14226i()
            com.google.android.gms.measurement.internal.co r9 = r9.mo14433x()
            if (r9 == 0) goto L_0x0238
            java.lang.String r9 = "_ae"
            boolean r9 = r9.equals(r6)
            if (r9 == 0) goto L_0x0238
            com.google.android.gms.measurement.internal.dr r9 = r28.mo14228k()
            long r12 = r9.mo14496y()
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x0238
            com.google.android.gms.measurement.internal.el r9 = r28.mo14233p()
            r9.mo14568a((android.os.Bundle) r2, (long) r12)
        L_0x0238:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r15.add(r2)
            com.google.android.gms.measurement.internal.el r9 = r28.mo14233p()
            java.security.SecureRandom r9 = r9.mo14582h()
            long r13 = r9.nextLong()
            com.google.android.gms.measurement.internal.et r9 = r28.mo14237t()
            com.google.android.gms.measurement.internal.l r12 = r28.mo14224g()
            java.lang.String r12 = r12.mo14808x()
            boolean r9 = r9.mo14742s(r12)
            if (r9 == 0) goto L_0x0283
            java.lang.String r9 = "extend_session"
            long r9 = r2.getLong(r9, r10)
            r11 = 1
            int r18 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r18 != 0) goto L_0x0283
            com.google.android.gms.measurement.internal.r r9 = r28.mo14235r()
            com.google.android.gms.measurement.internal.t r9 = r9.mo14838x()
            java.lang.String r10 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r9.mo14841a(r10)
            com.google.android.gms.measurement.internal.aw r9 = r1.f8222q
            com.google.android.gms.measurement.internal.dr r9 = r9.mo14320e()
            r11 = r31
            r9.mo14493a((long) r11, (boolean) r5)
            goto L_0x0285
        L_0x0283:
            r11 = r31
        L_0x0285:
            java.util.Set r9 = r2.keySet()
            int r10 = r33.size()
            java.lang.String[] r10 = new java.lang.String[r10]
            java.lang.Object[] r9 = r9.toArray(r10)
            r10 = r9
            java.lang.String[] r10 = (java.lang.String[]) r10
            java.util.Arrays.sort(r10)
            int r9 = r10.length
            r19 = r15
            r15 = 0
            r20 = 0
        L_0x029f:
            if (r15 >= r9) goto L_0x0358
            r5 = r10[r15]
            java.lang.Object r18 = r2.get(r5)
            r28.mo14233p()
            r22 = r15
            android.os.Bundle[] r15 = com.google.android.gms.measurement.internal.C2264el.m11029a((java.lang.Object) r18)
            if (r15 == 0) goto L_0x0331
            int r3 = r15.length
            r2.putInt(r5, r3)
            r3 = 0
        L_0x02b7:
            int r7 = r15.length
            if (r3 >= r7) goto L_0x031b
            r7 = r15[r3]
            r23 = r15
            r15 = 1
            com.google.android.gms.measurement.internal.C2213cp.m10706a((com.google.android.gms.measurement.internal.C2212co) r4, (android.os.Bundle) r7, (boolean) r15)
            com.google.android.gms.measurement.internal.el r18 = r28.mo14233p()
            java.lang.String r21 = "_ep"
            r24 = 0
            r25 = r9
            r9 = r18
            r18 = r10
            r10 = r37
            r11 = r21
            r12 = r7
            r7 = r13
            r13 = r0
            r14 = r36
            r26 = r0
            r27 = r4
            r0 = r19
            r19 = r22
            r4 = r23
            r21 = 1
            r15 = r24
            android.os.Bundle r9 = r9.mo14564a(r10, r11, r12, r13, r14, r15)
            java.lang.String r10 = "_en"
            r9.putString(r10, r6)
            java.lang.String r10 = "_eid"
            r9.putLong(r10, r7)
            java.lang.String r10 = "_gn"
            r9.putString(r10, r5)
            java.lang.String r10 = "_ll"
            int r11 = r4.length
            r9.putInt(r10, r11)
            java.lang.String r10 = "_i"
            r9.putInt(r10, r3)
            r0.add(r9)
            int r3 = r3 + 1
            r11 = r31
            r15 = r4
            r13 = r7
            r10 = r18
            r9 = r25
            r4 = r27
            r8 = r29
            r19 = r0
            r0 = r26
            goto L_0x02b7
        L_0x031b:
            r26 = r0
            r27 = r4
            r25 = r9
            r18 = r10
            r7 = r13
            r4 = r15
            r0 = r19
            r19 = r22
            r21 = 1
            int r3 = r4.length
            r4 = r20
            int r20 = r4 + r3
            goto L_0x0342
        L_0x0331:
            r26 = r0
            r27 = r4
            r25 = r9
            r18 = r10
            r7 = r13
            r0 = r19
            r4 = r20
            r19 = r22
            r21 = 1
        L_0x0342:
            int r15 = r19 + 1
            r11 = r31
            r19 = r0
            r13 = r7
            r10 = r18
            r9 = r25
            r0 = r26
            r4 = r27
            r5 = 1
            r7 = r37
            r8 = r29
            goto L_0x029f
        L_0x0358:
            r7 = r13
            r0 = r19
            r4 = r20
            r21 = 1
            if (r4 == 0) goto L_0x036b
            java.lang.String r3 = "_eid"
            r2.putLong(r3, r7)
            java.lang.String r3 = "_epc"
            r2.putInt(r3, r4)
        L_0x036b:
            r8 = 0
        L_0x036c:
            int r2 = r0.size()
            if (r8 >= r2) goto L_0x03f6
            java.lang.Object r2 = r0.get(r8)
            android.os.Bundle r2 = (android.os.Bundle) r2
            if (r8 == 0) goto L_0x037c
            r3 = 1
            goto L_0x037d
        L_0x037c:
            r3 = 0
        L_0x037d:
            if (r3 == 0) goto L_0x0382
            java.lang.String r3 = "_ep"
            goto L_0x0383
        L_0x0382:
            r3 = r6
        L_0x0383:
            java.lang.String r4 = "_o"
            r9 = r29
            r2.putString(r4, r9)
            if (r35 == 0) goto L_0x0394
            com.google.android.gms.measurement.internal.el r4 = r28.mo14233p()
            android.os.Bundle r2 = r4.mo14563a((android.os.Bundle) r2)
        L_0x0394:
            r11 = r2
            com.google.android.gms.measurement.internal.r r2 = r28.mo14235r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo14837w()
            java.lang.String r4 = "Logging event (FE)"
            com.google.android.gms.measurement.internal.p r5 = r28.mo14232o()
            java.lang.String r5 = r5.mo14824a((java.lang.String) r6)
            com.google.android.gms.measurement.internal.p r7 = r28.mo14232o()
            java.lang.String r7 = r7.mo14821a((android.os.Bundle) r11)
            r2.mo14843a(r4, r5, r7)
            com.google.android.gms.measurement.internal.zzag r12 = new com.google.android.gms.measurement.internal.zzag
            com.google.android.gms.measurement.internal.zzad r4 = new com.google.android.gms.measurement.internal.zzad
            r4.<init>(r11)
            r2 = r12
            r13 = 1
            r5 = r29
            r14 = r6
            r15 = r37
            r6 = r31
            r2.<init>(r3, r4, r5, r6)
            com.google.android.gms.measurement.internal.ct r2 = r28.mo14225h()
            r2.mo14443a((com.google.android.gms.measurement.internal.zzag) r12, (java.lang.String) r15)
            if (r17 != 0) goto L_0x03ef
            java.util.Set<com.google.android.gms.measurement.internal.bz> r2 = r1.f8248d
            java.util.Iterator r12 = r2.iterator()
        L_0x03d4:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x03ef
            java.lang.Object r2 = r12.next()
            com.google.android.gms.measurement.internal.bz r2 = (com.google.android.gms.measurement.internal.C2196bz) r2
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>(r11)
            r3 = r29
            r4 = r30
            r6 = r31
            r2.onEvent(r3, r4, r5, r6)
            goto L_0x03d4
        L_0x03ef:
            int r8 = r8 + 1
            r6 = r14
            r21 = 1
            goto L_0x036c
        L_0x03f6:
            r14 = r6
            r13 = 1
            r28.mo14238u()
            com.google.android.gms.measurement.internal.cp r0 = r28.mo14226i()
            com.google.android.gms.measurement.internal.co r0 = r0.mo14433x()
            if (r0 == 0) goto L_0x0414
            java.lang.String r0 = "_ae"
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x0414
            com.google.android.gms.measurement.internal.dr r0 = r28.mo14228k()
            r0.mo14494a((boolean) r13, (boolean) r13)
        L_0x0414:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2200cc.m10643a(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo14396a(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        boolean z3;
        mo14218b();
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (z2) {
            if (this.f8247c != null && !C2264el.m11035e(str2)) {
                z3 = false;
                m10648b(str3, str2, j, bundle2, z2, z3, !z, (String) null);
            }
        }
        z3 = true;
        m10648b(str3, str2, j, bundle2, z2, z3, !z, (String) null);
    }

    /* renamed from: b */
    private final void m10648b(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        mo14234q().mo14296a((Runnable) new C2202ce(this, str, str2, j, C2264el.m11030b(bundle), z, z2, z3, str3));
    }

    /* renamed from: a */
    public final void mo14398a(String str, String str2, Object obj, boolean z) {
        mo14399a(str, str2, obj, z, mo14230m().mo9996a());
    }

    /* renamed from: a */
    public final void mo14399a(String str, String str2, Object obj, boolean z, long j) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int i = 6;
        int i2 = 0;
        if (z) {
            i = mo14233p().mo14577c(str2);
        } else {
            C2264el p = mo14233p();
            if (p.mo14572a("user property", str2)) {
                if (!p.mo14573a("user property", C2194bx.f8228a, str2)) {
                    i = 15;
                } else if (p.mo14571a("user property", 24, str2)) {
                    i = 0;
                }
            }
        }
        if (i != 0) {
            mo14233p();
            String a = C2264el.m11020a(str2, 24, true);
            if (str2 != null) {
                i2 = str2.length();
            }
            this.f8222q.mo14325j().mo14567a(i, "_ev", a, i2);
        } else if (obj != null) {
            int b = mo14233p().mo14575b(str2, obj);
            if (b != 0) {
                mo14233p();
                String a2 = C2264el.m11020a(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i2 = String.valueOf(obj).length();
                }
                this.f8222q.mo14325j().mo14567a(b, "_ev", a2, i2);
                return;
            }
            Object c = mo14233p().mo14578c(str2, obj);
            if (c != null) {
                m10644a(str3, str2, j, c);
            }
        } else {
            m10644a(str3, str2, j, (Object) null);
        }
    }

    /* renamed from: a */
    private final void m10644a(String str, String str2, long j, Object obj) {
        mo14234q().mo14296a((Runnable) new C2203cf(this, str, str2, obj, j));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public final void mo14397a(String str, String str2, Object obj, long j) {
        C0926p.m1308a(str);
        C0926p.m1308a(str2);
        mo14221d();
        mo14218b();
        mo14486E();
        if (!this.f8222q.mo14307C()) {
            mo14235r().mo14837w().mo14841a("User property not set since app measurement is disabled");
        } else if (this.f8222q.mo14312H()) {
            mo14235r().mo14837w().mo14843a("Setting user property (FE)", mo14232o().mo14824a(str2), obj);
            mo14225h().mo14444a(new zzfv(str2, j, obj, str));
        }
    }

    @Nullable
    /* renamed from: x */
    public final String mo14407x() {
        mo14218b();
        return this.f8250f.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14393a(@Nullable String str) {
        this.f8250f.set(str);
    }

    @WorkerThread
    /* renamed from: y */
    public final void mo14408y() {
        mo14221d();
        mo14218b();
        mo14486E();
        if (this.f8222q.mo14312H()) {
            mo14225h().mo14451z();
            this.f8246b = false;
            String v = mo14236s().mo14260v();
            if (!TextUtils.isEmpty(v)) {
                mo14229l().mo14377A();
                if (!v.equals(Build.VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", v);
                    mo14395a("auto", "_ou", bundle);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo14392a(C2196bz bzVar) {
        mo14218b();
        mo14486E();
        C0926p.m1306a(bzVar);
        if (!this.f8248d.add(bzVar)) {
            mo14235r().mo14833i().mo14841a("OnEventListener already registered");
        }
    }

    /* renamed from: b */
    public final void mo14403b(C2196bz bzVar) {
        mo14218b();
        mo14486E();
        C0926p.m1306a(bzVar);
        if (!this.f8248d.remove(bzVar)) {
            mo14235r().mo14833i().mo14841a("OnEventListener had not been registered");
        }
    }

    /* renamed from: a */
    public final void mo14391a(AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        C0926p.m1306a(conditionalUserProperty);
        mo14218b();
        AppMeasurement.ConditionalUserProperty conditionalUserProperty2 = new AppMeasurement.ConditionalUserProperty(conditionalUserProperty);
        if (!TextUtils.isEmpty(conditionalUserProperty2.mAppId)) {
            mo14235r().mo14833i().mo14841a("Package name should be null when calling setConditionalUserProperty");
        }
        conditionalUserProperty2.mAppId = null;
        m10650c(conditionalUserProperty2);
    }

    /* renamed from: b */
    public final void mo14402b(AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        C0926p.m1306a(conditionalUserProperty);
        C0926p.m1308a(conditionalUserProperty.mAppId);
        mo14215a();
        m10650c(new AppMeasurement.ConditionalUserProperty(conditionalUserProperty));
    }

    /* renamed from: c */
    private final void m10650c(AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        long a = mo14230m().mo9996a();
        C0926p.m1306a(conditionalUserProperty);
        C0926p.m1308a(conditionalUserProperty.mName);
        C0926p.m1308a(conditionalUserProperty.mOrigin);
        C0926p.m1306a(conditionalUserProperty.mValue);
        conditionalUserProperty.mCreationTimestamp = a;
        String str = conditionalUserProperty.mName;
        Object obj = conditionalUserProperty.mValue;
        if (mo14233p().mo14577c(str) != 0) {
            mo14235r().mo14830d_().mo14842a("Invalid conditional user property name", mo14232o().mo14826c(str));
        } else if (mo14233p().mo14575b(str, obj) != 0) {
            mo14235r().mo14830d_().mo14843a("Invalid conditional user property value", mo14232o().mo14826c(str), obj);
        } else {
            Object c = mo14233p().mo14578c(str, obj);
            if (c == null) {
                mo14235r().mo14830d_().mo14843a("Unable to normalize conditional user property value", mo14232o().mo14826c(str), obj);
                return;
            }
            conditionalUserProperty.mValue = c;
            long j = conditionalUserProperty.mTriggerTimeout;
            if (TextUtils.isEmpty(conditionalUserProperty.mTriggerEventName) || (j <= 15552000000L && j >= 1)) {
                long j2 = conditionalUserProperty.mTimeToLive;
                if (j2 > 15552000000L || j2 < 1) {
                    mo14235r().mo14830d_().mo14843a("Invalid conditional user property time to live", mo14232o().mo14826c(str), Long.valueOf(j2));
                } else {
                    mo14234q().mo14296a((Runnable) new C2204cg(this, conditionalUserProperty));
                }
            } else {
                mo14235r().mo14830d_().mo14843a("Invalid conditional user property timeout", mo14232o().mo14826c(str), Long.valueOf(j));
            }
        }
    }

    /* renamed from: c */
    public final void mo14405c(String str, String str2, Bundle bundle) {
        mo14218b();
        m10649b((String) null, str, str2, bundle);
    }

    /* renamed from: a */
    public final void mo14400a(String str, String str2, String str3, Bundle bundle) {
        C0926p.m1308a(str);
        mo14215a();
        m10649b(str, str2, str3, bundle);
    }

    /* renamed from: b */
    private final void m10649b(String str, String str2, String str3, Bundle bundle) {
        long a = mo14230m().mo9996a();
        C0926p.m1308a(str2);
        AppMeasurement.ConditionalUserProperty conditionalUserProperty = new AppMeasurement.ConditionalUserProperty();
        conditionalUserProperty.mAppId = str;
        conditionalUserProperty.mName = str2;
        conditionalUserProperty.mCreationTimestamp = a;
        if (str3 != null) {
            conditionalUserProperty.mExpiredEventName = str3;
            conditionalUserProperty.mExpiredEventParams = bundle;
        }
        mo14234q().mo14296a((Runnable) new C2205ch(this, conditionalUserProperty));
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: d */
    public final void m10651d(AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        AppMeasurement.ConditionalUserProperty conditionalUserProperty2 = conditionalUserProperty;
        mo14221d();
        mo14486E();
        C0926p.m1306a(conditionalUserProperty);
        C0926p.m1308a(conditionalUserProperty2.mName);
        C0926p.m1308a(conditionalUserProperty2.mOrigin);
        C0926p.m1306a(conditionalUserProperty2.mValue);
        if (!this.f8222q.mo14307C()) {
            mo14235r().mo14837w().mo14841a("Conditional property not sent since collection is disabled");
            return;
        }
        zzfv zzfv = new zzfv(conditionalUserProperty2.mName, conditionalUserProperty2.mTriggeredTimestamp, conditionalUserProperty2.mValue, conditionalUserProperty2.mOrigin);
        try {
            zzag a = mo14233p().mo14565a(conditionalUserProperty2.mAppId, conditionalUserProperty2.mTriggeredEventName, conditionalUserProperty2.mTriggeredEventParams, conditionalUserProperty2.mOrigin, 0, true, false);
            zzag a2 = mo14233p().mo14565a(conditionalUserProperty2.mAppId, conditionalUserProperty2.mTimedOutEventName, conditionalUserProperty2.mTimedOutEventParams, conditionalUserProperty2.mOrigin, 0, true, false);
            zzag a3 = mo14233p().mo14565a(conditionalUserProperty2.mAppId, conditionalUserProperty2.mExpiredEventName, conditionalUserProperty2.mExpiredEventParams, conditionalUserProperty2.mOrigin, 0, true, false);
            String str = conditionalUserProperty2.mAppId;
            String str2 = conditionalUserProperty2.mOrigin;
            long j = conditionalUserProperty2.mCreationTimestamp;
            String str3 = conditionalUserProperty2.mTriggerEventName;
            long j2 = conditionalUserProperty2.mTriggerTimeout;
            zzo zzo = r3;
            zzo zzo2 = new zzo(str, str2, zzfv, j, false, str3, a2, j2, a, conditionalUserProperty2.mTimeToLive, a3);
            mo14225h().mo14445a(zzo);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: e */
    public final void m10652e(AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        AppMeasurement.ConditionalUserProperty conditionalUserProperty2 = conditionalUserProperty;
        mo14221d();
        mo14486E();
        C0926p.m1306a(conditionalUserProperty);
        C0926p.m1308a(conditionalUserProperty2.mName);
        if (!this.f8222q.mo14307C()) {
            mo14235r().mo14837w().mo14841a("Conditional property not cleared since collection is disabled");
            return;
        }
        zzfv zzfv = new zzfv(conditionalUserProperty2.mName, 0, (Object) null, (String) null);
        try {
            zzag a = mo14233p().mo14565a(conditionalUserProperty2.mAppId, conditionalUserProperty2.mExpiredEventName, conditionalUserProperty2.mExpiredEventParams, conditionalUserProperty2.mOrigin, conditionalUserProperty2.mCreationTimestamp, true, false);
            zzo zzo = r3;
            zzo zzo2 = new zzo(conditionalUserProperty2.mAppId, conditionalUserProperty2.mOrigin, zzfv, conditionalUserProperty2.mCreationTimestamp, conditionalUserProperty2.mActive, conditionalUserProperty2.mTriggerEventName, (zzag) null, conditionalUserProperty2.mTriggerTimeout, (zzag) null, conditionalUserProperty2.mTimeToLive, a);
            mo14225h().mo14445a(zzo);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: a */
    public final List<AppMeasurement.ConditionalUserProperty> mo14387a(String str, String str2) {
        mo14218b();
        return m10645b((String) null, str, str2);
    }

    /* renamed from: a */
    public final List<AppMeasurement.ConditionalUserProperty> mo14388a(String str, String str2, String str3) {
        C0926p.m1308a(str);
        mo14215a();
        return m10645b(str, str2, str3);
    }

    /* renamed from: b */
    private final List<AppMeasurement.ConditionalUserProperty> m10645b(String str, String str2, String str3) {
        if (mo14234q().mo14299g()) {
            mo14235r().mo14830d_().mo14841a("Cannot get conditional user properties from analytics worker thread");
            return Collections.emptyList();
        } else if (C2270er.m11151a()) {
            mo14235r().mo14830d_().mo14841a("Cannot get conditional user properties from main thread");
            return Collections.emptyList();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                this.f8222q.mo14234q().mo14296a((Runnable) new C2206ci(this, atomicReference, str, str2, str3));
                try {
                    atomicReference.wait(5000);
                } catch (InterruptedException e) {
                    mo14235r().mo14833i().mo14843a("Interrupted waiting for get conditional user properties", str, e);
                }
            }
            List<zzo> list = (List) atomicReference.get();
            if (list == null) {
                mo14235r().mo14833i().mo14842a("Timed out waiting for get conditional user properties", str);
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (zzo zzo : list) {
                AppMeasurement.ConditionalUserProperty conditionalUserProperty = new AppMeasurement.ConditionalUserProperty();
                conditionalUserProperty.mAppId = zzo.f8679a;
                conditionalUserProperty.mOrigin = zzo.f8680b;
                conditionalUserProperty.mCreationTimestamp = zzo.f8682d;
                conditionalUserProperty.mName = zzo.f8681c.f8653a;
                conditionalUserProperty.mValue = zzo.f8681c.mo14860a();
                conditionalUserProperty.mActive = zzo.f8683e;
                conditionalUserProperty.mTriggerEventName = zzo.f8684f;
                if (zzo.f8685g != null) {
                    conditionalUserProperty.mTimedOutEventName = zzo.f8685g.f8649a;
                    if (zzo.f8685g.f8650b != null) {
                        conditionalUserProperty.mTimedOutEventParams = zzo.f8685g.f8650b.mo14851b();
                    }
                }
                conditionalUserProperty.mTriggerTimeout = zzo.f8686h;
                if (zzo.f8687i != null) {
                    conditionalUserProperty.mTriggeredEventName = zzo.f8687i.f8649a;
                    if (zzo.f8687i.f8650b != null) {
                        conditionalUserProperty.mTriggeredEventParams = zzo.f8687i.f8650b.mo14851b();
                    }
                }
                conditionalUserProperty.mTriggeredTimestamp = zzo.f8681c.f8654b;
                conditionalUserProperty.mTimeToLive = zzo.f8688j;
                if (zzo.f8689k != null) {
                    conditionalUserProperty.mExpiredEventName = zzo.f8689k.f8649a;
                    if (zzo.f8689k.f8650b != null) {
                        conditionalUserProperty.mExpiredEventParams = zzo.f8689k.f8650b.mo14851b();
                    }
                }
                arrayList.add(conditionalUserProperty);
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public final Map<String, Object> mo14390a(String str, String str2, boolean z) {
        mo14218b();
        return m10646b((String) null, str, str2, z);
    }

    /* renamed from: a */
    public final Map<String, Object> mo14389a(String str, String str2, String str3, boolean z) {
        C0926p.m1308a(str);
        mo14215a();
        return m10646b(str, str2, str3, z);
    }

    /* renamed from: b */
    private final Map<String, Object> m10646b(String str, String str2, String str3, boolean z) {
        if (mo14234q().mo14299g()) {
            mo14235r().mo14830d_().mo14841a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        } else if (C2270er.m11151a()) {
            mo14235r().mo14830d_().mo14841a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                this.f8222q.mo14234q().mo14296a((Runnable) new C2207cj(this, atomicReference, str, str2, str3, z));
                try {
                    atomicReference.wait(5000);
                } catch (InterruptedException e) {
                    mo14235r().mo14833i().mo14842a("Interrupted waiting for get user properties", e);
                }
            }
            List<zzfv> list = (List) atomicReference.get();
            if (list == null) {
                mo14235r().mo14833i().mo14841a("Timed out waiting for get user properties");
                return Collections.emptyMap();
            }
            ArrayMap arrayMap = new ArrayMap(list.size());
            for (zzfv zzfv : list) {
                arrayMap.put(zzfv.f8653a, zzfv.mo14860a());
            }
            return arrayMap;
        }
    }

    @Nullable
    /* renamed from: z */
    public final String mo14409z() {
        C2212co y = this.f8222q.mo14333w().mo14434y();
        if (y != null) {
            return y.f8285a;
        }
        return null;
    }

    @Nullable
    /* renamed from: A */
    public final String mo14385A() {
        C2212co y = this.f8222q.mo14333w().mo14434y();
        if (y != null) {
            return y.f8286b;
        }
        return null;
    }

    @Nullable
    /* renamed from: B */
    public final String mo14386B() {
        if (this.f8222q.mo14329p() != null) {
            return this.f8222q.mo14329p();
        }
        try {
            return C0819c.m1057a();
        } catch (IllegalStateException e) {
            this.f8222q.mo14235r().mo14830d_().mo14842a("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo14215a() {
        super.mo14215a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo14218b() {
        super.mo14218b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo14220c() {
        super.mo14220c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo14221d() {
        super.mo14221d();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C2143a mo14222e() {
        return super.mo14222e();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C2200cc mo14223f() {
        return super.mo14223f();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C2289l mo14224g() {
        return super.mo14224g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C2217ct mo14225h() {
        return super.mo14225h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C2213cp mo14226i() {
        return super.mo14226i();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C2291n mo14227j() {
        return super.mo14227j();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C2242dr mo14228k() {
        return super.mo14228k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C2170b mo14229l() {
        return super.mo14229l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C0969e mo14230m() {
        return super.mo14230m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Context mo14231n() {
        return super.mo14231n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C2293p mo14232o() {
        return super.mo14232o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C2264el mo14233p() {
        return super.mo14233p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C2161ar mo14234q() {
        return super.mo14234q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C2295r mo14235r() {
        return super.mo14235r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C2147ad mo14236s() {
        return super.mo14236s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C2272et mo14237t() {
        return super.mo14237t();
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ C2270er mo14238u() {
        return super.mo14238u();
    }
}
