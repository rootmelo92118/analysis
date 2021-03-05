package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p000a.p001a.p002a.p003a.p004a.p009d.C0080b;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.os */
public final class C1549os extends C1539oi {

    /* renamed from: g */
    protected C1427ke f5831g;

    /* renamed from: h */
    private C1437ko f5832h;

    /* renamed from: i */
    private C1418jw f5833i;

    /* renamed from: j */
    private C1420jy f5834j;

    /* renamed from: k */
    private final C1019ad f5835k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final afl f5836l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f5837m;

    C1549os(Context context, C1753wg wgVar, C1437ko koVar, C1544on onVar, C1019ad adVar, afl afl) {
        super(context, wgVar, onVar);
        this.f5832h = koVar;
        this.f5834j = wgVar.f6726c;
        this.f5835k = adVar;
        this.f5836l = afl;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C1752wf mo12848a(int i) {
        String name;
        String str;
        boolean z;
        C1420jy jyVar;
        long j;
        zzaso zzaso;
        String str2;
        String str3;
        boolean z2;
        C1420jy jyVar2;
        long j2;
        Iterator<C1427ke> it;
        C1420jy jyVar3;
        int i2;
        zzasi zzasi = this.f5817e.f6724a;
        zzwb zzwb = zzasi.f7032c;
        afl afl = this.f5836l;
        List<String> list = this.f5818f.f7084c;
        List<String> list2 = this.f5818f.f7086e;
        List<String> list3 = this.f5818f.f7090i;
        int i3 = this.f5818f.f7092k;
        long j3 = this.f5818f.f7091j;
        String str4 = zzasi.f7038i;
        boolean z3 = this.f5818f.f7088g;
        C1419jx jxVar = this.f5831g != null ? this.f5831g.f5617b : null;
        C1440kr krVar = this.f5831g != null ? this.f5831g.f5618c : null;
        if (this.f5831g != null) {
            name = this.f5831g.f5619d;
        } else {
            name = AdMobAdapter.class.getName();
        }
        String str5 = name;
        C1420jy jyVar4 = this.f5834j;
        C1423ka kaVar = this.f5831g != null ? this.f5831g.f5620e : null;
        C1419jx jxVar2 = jxVar;
        C1440kr krVar2 = krVar;
        long j4 = this.f5818f.f7089h;
        zzwf zzwf = this.f5817e.f6727d;
        long j5 = j4;
        long j6 = this.f5818f.f7087f;
        long j7 = this.f5817e.f6729f;
        long j8 = this.f5818f.f7094m;
        String str6 = this.f5818f.f7095n;
        JSONObject jSONObject = this.f5817e.f6731h;
        zzawd zzawd = this.f5818f.f7056A;
        List<String> list4 = this.f5818f.f7057B;
        List<String> list5 = this.f5818f.f7058C;
        zzwf zzwf2 = zzwf;
        boolean z4 = this.f5834j != null ? this.f5834j.f5580o : false;
        zzaso zzaso2 = this.f5818f.f7060E;
        if (this.f5833i != null) {
            List<C1427ke> b = this.f5833i.mo12641b();
            if (b == null) {
                jyVar = jyVar4;
                zzaso = zzaso2;
                str2 = "".toString();
                str = str4;
                z = z3;
                j = j8;
            } else {
                Iterator<C1427ke> it2 = b.iterator();
                String str7 = "";
                while (it2.hasNext()) {
                    zzaso zzaso3 = zzaso2;
                    C1427ke next = it2.next();
                    if (next != null) {
                        it = it2;
                        if (next.f5617b == null || TextUtils.isEmpty(next.f5617b.f5548d)) {
                            jyVar3 = jyVar4;
                        } else {
                            String valueOf = String.valueOf(str7);
                            j2 = j8;
                            String str8 = next.f5617b.f5548d;
                            switch (next.f5616a) {
                                case -1:
                                    i2 = 4;
                                    break;
                                case 0:
                                    jyVar2 = jyVar4;
                                    i2 = 0;
                                    break;
                                case 1:
                                    jyVar2 = jyVar4;
                                    i2 = 1;
                                    break;
                                case 3:
                                    i2 = 2;
                                    break;
                                case 4:
                                    i2 = 3;
                                    break;
                                case 5:
                                    i2 = 5;
                                    break;
                                default:
                                    i2 = 6;
                                    break;
                            }
                            jyVar2 = jyVar4;
                            long j9 = next.f5622g;
                            z2 = z3;
                            str3 = str4;
                            StringBuilder sb = new StringBuilder(String.valueOf(str8).length() + 33);
                            sb.append(str8);
                            sb.append(".");
                            sb.append(i2);
                            sb.append(".");
                            sb.append(j9);
                            String sb2 = sb.toString();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(sb2).length());
                            sb3.append(valueOf);
                            sb3.append(sb2);
                            sb3.append(C0080b.ROLL_OVER_FILE_NAME_SEPARATOR);
                            str7 = sb3.toString();
                            zzaso2 = zzaso3;
                            it2 = it;
                            j8 = j2;
                            jyVar4 = jyVar2;
                            z3 = z2;
                            str4 = str3;
                        }
                    } else {
                        jyVar3 = jyVar4;
                        it = it2;
                    }
                    str3 = str4;
                    z2 = z3;
                    j2 = j8;
                    zzaso2 = zzaso3;
                    it2 = it;
                    j8 = j2;
                    jyVar4 = jyVar2;
                    z3 = z2;
                    str4 = str3;
                }
                jyVar = jyVar4;
                zzaso = zzaso2;
                str = str4;
                z = z3;
                j = j8;
                str2 = str7.substring(0, Math.max(0, str7.length() - 1));
            }
        } else {
            jyVar = jyVar4;
            zzaso = zzaso2;
            str = str4;
            z = z3;
            j = j8;
            str2 = null;
        }
        return new C1752wf(zzwb, afl, list, i, list2, list3, i3, j3, str, z, jxVar2, krVar2, str5, jyVar, kaVar, j5, zzwf2, j6, j7, j, str6, jSONObject, (C1135bi) null, zzawd, list4, list5, z4, zzaso, str2, this.f5818f.f7063H, this.f5818f.f7067L, this.f5817e.f6732i, this.f5818f.f7070O, this.f5817e.f6733j, this.f5818f.f7072Q, this.f5818f.f7073R, this.f5818f.f7074S, this.f5818f.f7075T, this.f5818f.f7077V);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.jw] */
    /* JADX WARNING: type inference failed for: r17v2, types: [com.google.android.gms.internal.ads.kl] */
    /* JADX WARNING: type inference failed for: r4v5, types: [com.google.android.gms.internal.ads.ki] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00a3, code lost:
        r2 = r2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12849a(long r32) {
        /*
            r31 = this;
            r1 = r31
            java.lang.Object r2 = r1.f5816d
            monitor-enter(r2)
            com.google.android.gms.internal.ads.jy r0 = r1.f5834j     // Catch:{ all -> 0x0174 }
            int r0 = r0.f5578m     // Catch:{ all -> 0x0174 }
            r3 = -1
            if (r0 == r3) goto L_0x0043
            com.google.android.gms.internal.ads.ki r0 = new com.google.android.gms.internal.ads.ki     // Catch:{ all -> 0x0174 }
            android.content.Context r5 = r1.f5814b     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.wg r3 = r1.f5817e     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.zzasi r6 = r3.f6724a     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.ko r7 = r1.f5832h     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.jy r8 = r1.f5834j     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.zzasm r3 = r1.f5818f     // Catch:{ all -> 0x0174 }
            boolean r9 = r3.f7100s     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.zzasm r3 = r1.f5818f     // Catch:{ all -> 0x0174 }
            boolean r10 = r3.f7107z     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.zzasm r3 = r1.f5818f     // Catch:{ all -> 0x0174 }
            java.lang.String r11 = r3.f7065J     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.e<java.lang.Long> r3 = com.google.android.gms.internal.ads.C1557p.f5974bc     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.m r4 = com.google.android.gms.internal.ads.bre.m6321e()     // Catch:{ all -> 0x0174 }
            java.lang.Object r3 = r4.mo12778a(r3)     // Catch:{ all -> 0x0174 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x0174 }
            long r14 = r3.longValue()     // Catch:{ all -> 0x0174 }
            r16 = 2
            com.google.android.gms.internal.ads.wg r3 = r1.f5817e     // Catch:{ all -> 0x0174 }
            boolean r3 = r3.f6733j     // Catch:{ all -> 0x0174 }
            r4 = r0
            r12 = r32
            r17 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r14, r16, r17)     // Catch:{ all -> 0x0174 }
            goto L_0x008a
        L_0x0043:
            com.google.android.gms.internal.ads.kl r0 = new com.google.android.gms.internal.ads.kl     // Catch:{ all -> 0x0174 }
            android.content.Context r3 = r1.f5814b     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.wg r4 = r1.f5817e     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.zzasi r4 = r4.f6724a     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.ko r5 = r1.f5832h     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.jy r6 = r1.f5834j     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.zzasm r7 = r1.f5818f     // Catch:{ all -> 0x0174 }
            boolean r7 = r7.f7100s     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.zzasm r8 = r1.f5818f     // Catch:{ all -> 0x0174 }
            boolean r8 = r8.f7107z     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.zzasm r9 = r1.f5818f     // Catch:{ all -> 0x0174 }
            java.lang.String r9 = r9.f7065J     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.e<java.lang.Long> r10 = com.google.android.gms.internal.ads.C1557p.f5974bc     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.m r11 = com.google.android.gms.internal.ads.bre.m6321e()     // Catch:{ all -> 0x0174 }
            java.lang.Object r10 = r11.mo12778a(r10)     // Catch:{ all -> 0x0174 }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ all -> 0x0174 }
            long r27 = r10.longValue()     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.ad r10 = r1.f5835k     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.wg r11 = r1.f5817e     // Catch:{ all -> 0x0174 }
            boolean r11 = r11.f6733j     // Catch:{ all -> 0x0174 }
            r17 = r0
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r8
            r24 = r9
            r25 = r32
            r29 = r10
            r30 = r11
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r27, r29, r30)     // Catch:{ all -> 0x0174 }
        L_0x008a:
            r1.f5833i = r0     // Catch:{ all -> 0x0174 }
            monitor-exit(r2)     // Catch:{ all -> 0x0174 }
            java.util.ArrayList r0 = new java.util.ArrayList
            com.google.android.gms.internal.ads.jy r2 = r1.f5834j
            java.util.List<com.google.android.gms.internal.ads.jx> r2 = r2.f5566a
            r0.<init>(r2)
            com.google.android.gms.internal.ads.wg r2 = r1.f5817e
            com.google.android.gms.internal.ads.zzasi r2 = r2.f6724a
            com.google.android.gms.internal.ads.zzwb r2 = r2.f7032c
            android.os.Bundle r2 = r2.f7283m
            java.lang.String r3 = "com.google.ads.mediation.admob.AdMobAdapter"
            r4 = 0
            if (r2 == 0) goto L_0x00b0
            android.os.Bundle r2 = r2.getBundle(r3)
            if (r2 == 0) goto L_0x00b0
            java.lang.String r5 = "_skipMediation"
            boolean r2 = r2.getBoolean(r5)
            goto L_0x00b1
        L_0x00b0:
            r2 = 0
        L_0x00b1:
            if (r2 == 0) goto L_0x00cf
            java.util.ListIterator r2 = r0.listIterator()
        L_0x00b7:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00cf
            java.lang.Object r5 = r2.next()
            com.google.android.gms.internal.ads.jx r5 = (com.google.android.gms.internal.ads.C1419jx) r5
            java.util.List<java.lang.String> r5 = r5.f5547c
            boolean r5 = r5.contains(r3)
            if (r5 != 0) goto L_0x00b7
            r2.remove()
            goto L_0x00b7
        L_0x00cf:
            com.google.android.gms.internal.ads.jw r2 = r1.f5833i
            com.google.android.gms.internal.ads.ke r0 = r2.mo12639a(r0)
            r1.f5831g = r0
            com.google.android.gms.internal.ads.ke r0 = r1.f5831g
            int r0 = r0.f5616a
            switch(r0) {
                case 0: goto L_0x0104;
                case 1: goto L_0x00fb;
                default: goto L_0x00de;
            }
        L_0x00de:
            com.google.android.gms.internal.ads.ol r0 = new com.google.android.gms.internal.ads.ol
            com.google.android.gms.internal.ads.ke r2 = r1.f5831g
            int r2 = r2.f5616a
            r3 = 40
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            java.lang.String r3 = "Unexpected mediation result: "
            r5.append(r3)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r0.<init>(r2, r4)
            throw r0
        L_0x00fb:
            com.google.android.gms.internal.ads.ol r0 = new com.google.android.gms.internal.ads.ol
            r2 = 3
            java.lang.String r3 = "No fill from any mediation ad networks."
            r0.<init>(r3, r2)
            throw r0
        L_0x0104:
            com.google.android.gms.internal.ads.ke r0 = r1.f5831g
            com.google.android.gms.internal.ads.jx r0 = r0.f5617b
            if (r0 == 0) goto L_0x0173
            com.google.android.gms.internal.ads.ke r0 = r1.f5831g
            com.google.android.gms.internal.ads.jx r0 = r0.f5617b
            java.lang.String r0 = r0.f5559o
            if (r0 == 0) goto L_0x0173
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r2 = 1
            r0.<init>(r2)
            android.os.Handler r2 = com.google.android.gms.internal.ads.C1782xi.f6838a
            com.google.android.gms.internal.ads.ot r3 = new com.google.android.gms.internal.ads.ot
            r3.<init>(r1, r0)
            r2.post(r3)
            r2 = 10
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x014d }
            r0.await(r2, r5)     // Catch:{ InterruptedException -> 0x014d }
            java.lang.Object r2 = r1.f5816d
            monitor-enter(r2)
            boolean r0 = r1.f5837m     // Catch:{ all -> 0x014a }
            if (r0 == 0) goto L_0x0142
            com.google.android.gms.internal.ads.afl r0 = r1.f5836l     // Catch:{ all -> 0x014a }
            boolean r0 = r0.mo10331A()     // Catch:{ all -> 0x014a }
            if (r0 != 0) goto L_0x013a
            monitor-exit(r2)     // Catch:{ all -> 0x014a }
            return
        L_0x013a:
            com.google.android.gms.internal.ads.ol r0 = new com.google.android.gms.internal.ads.ol     // Catch:{ all -> 0x014a }
            java.lang.String r3 = "Assets not loaded, web view is destroyed"
            r0.<init>(r3, r4)     // Catch:{ all -> 0x014a }
            throw r0     // Catch:{ all -> 0x014a }
        L_0x0142:
            com.google.android.gms.internal.ads.ol r0 = new com.google.android.gms.internal.ads.ol     // Catch:{ all -> 0x014a }
            java.lang.String r3 = "View could not be prepared"
            r0.<init>(r3, r4)     // Catch:{ all -> 0x014a }
            throw r0     // Catch:{ all -> 0x014a }
        L_0x014a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x014a }
            throw r0
        L_0x014d:
            r0 = move-exception
            com.google.android.gms.internal.ads.ol r2 = new com.google.android.gms.internal.ads.ol
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            int r3 = r3 + 38
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            java.lang.String r3 = "Interrupted while waiting for latch : "
            r5.append(r3)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r2.<init>(r0, r4)
            throw r2
        L_0x0173:
            return
        L_0x0174:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0174 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1549os.mo12849a(long):void");
    }

    public final void onStop() {
        synchronized (this.f5816d) {
            super.onStop();
            if (this.f5833i != null) {
                this.f5833i.mo12640a();
            }
        }
    }
}
