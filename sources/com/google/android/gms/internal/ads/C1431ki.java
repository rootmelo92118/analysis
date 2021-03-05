package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.ki */
public final class C1431ki implements C1418jw {

    /* renamed from: a */
    private final zzasi f5623a;

    /* renamed from: b */
    private final C1437ko f5624b;

    /* renamed from: c */
    private final Context f5625c;

    /* renamed from: d */
    private final C1420jy f5626d;

    /* renamed from: e */
    private final boolean f5627e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final long f5628f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final long f5629g;

    /* renamed from: h */
    private final int f5630h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Object f5631i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f5632j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Map<abg<C1427ke>, C1424kb> f5633k = new HashMap();

    /* renamed from: l */
    private final boolean f5634l;

    /* renamed from: m */
    private final String f5635m;

    /* renamed from: n */
    private List<C1427ke> f5636n = new ArrayList();

    /* renamed from: o */
    private final boolean f5637o;

    public C1431ki(Context context, zzasi zzasi, C1437ko koVar, C1420jy jyVar, boolean z, boolean z2, String str, long j, long j2, int i, boolean z3) {
        this.f5625c = context;
        this.f5623a = zzasi;
        this.f5624b = koVar;
        this.f5626d = jyVar;
        this.f5627e = z;
        this.f5634l = z2;
        this.f5635m = str;
        this.f5628f = j;
        this.f5629g = j2;
        this.f5630h = 2;
        this.f5637o = z3;
    }

    /* renamed from: a */
    public final C1427ke mo12639a(List<C1419jx> list) {
        C1772wz.m1624b("Starting mediation.");
        ArrayList arrayList = new ArrayList();
        zzwf zzwf = this.f5623a.f7033d;
        int[] iArr = new int[2];
        if (zzwf.f7298g != null) {
            zzbv.zzlz();
            if (C1429kg.m7188a(this.f5635m, iArr)) {
                int i = 0;
                int i2 = iArr[0];
                int i3 = iArr[1];
                zzwf[] zzwfArr = zzwf.f7298g;
                int length = zzwfArr.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    zzwf zzwf2 = zzwfArr[i];
                    if (i2 == zzwf2.f7296e && i3 == zzwf2.f7293b) {
                        zzwf = zzwf2;
                        break;
                    }
                    i++;
                }
            }
        }
        Iterator<C1419jx> it = list.iterator();
        while (it.hasNext()) {
            C1419jx next = it.next();
            String valueOf = String.valueOf(next.f5546b);
            C1772wz.m1628d(valueOf.length() != 0 ? "Trying mediation network: ".concat(valueOf) : new String("Trying mediation network: "));
            Iterator<String> it2 = next.f5547c.iterator();
            while (it2.hasNext()) {
                Context context = this.f5625c;
                C1437ko koVar = this.f5624b;
                C1420jy jyVar = this.f5626d;
                zzwb zzwb = this.f5623a.f7032c;
                zzbbi zzbbi = this.f5623a.f7040k;
                boolean z = this.f5627e;
                boolean z2 = this.f5634l;
                zzacp zzacp = this.f5623a.f7054y;
                Iterator<C1419jx> it3 = it;
                List<String> list2 = this.f5623a.f7043n;
                Iterator<String> it4 = it2;
                ArrayList arrayList2 = arrayList;
                boolean z3 = z;
                C1419jx jxVar = next;
                zzwf zzwf3 = zzwf;
                zzbbi zzbbi2 = zzbbi;
                C1424kb kbVar = new C1424kb(context, it2.next(), koVar, jyVar, jxVar, zzwb, zzwf3, zzbbi2, z3, z2, zzacp, list2, this.f5623a.f7055z, this.f5623a.f7020X, this.f5637o);
                abg a = C1780xg.m8354a(new C1432kj(this, kbVar));
                this.f5633k.put(a, kbVar);
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(a);
                arrayList = arrayList3;
                it = it3;
                it2 = it4;
            }
        }
        ArrayList arrayList4 = arrayList;
        if (this.f5630h != 2) {
            return m7191b((List<abg<C1427ke>>) arrayList4);
        }
        return m7194c((List<abg<C1427ke>>) arrayList4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (r4.hasNext() == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        r0 = r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1 = (com.google.android.gms.internal.ads.C1427ke) r0.get();
        r3.f5636n.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r1 == null) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        if (r1.f5616a != 0) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        m7190a((com.google.android.gms.internal.ads.abg<com.google.android.gms.internal.ads.C1427ke>) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        com.google.android.gms.internal.ads.C1772wz.m1627c("Exception while processing an adapter; continuing with other adapters", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        m7190a((com.google.android.gms.internal.ads.abg<com.google.android.gms.internal.ads.C1427ke>) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        return new com.google.android.gms.internal.ads.C1427ke(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r4 = r4.iterator();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.C1427ke m7191b(java.util.List<com.google.android.gms.internal.ads.abg<com.google.android.gms.internal.ads.C1427ke>> r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f5631i
            monitor-enter(r0)
            boolean r1 = r3.f5632j     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x000f
            com.google.android.gms.internal.ads.ke r4 = new com.google.android.gms.internal.ads.ke     // Catch:{ all -> 0x0047 }
            r1 = -1
            r4.<init>(r1)     // Catch:{ all -> 0x0047 }
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            return r4
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            java.util.Iterator r4 = r4.iterator()
        L_0x0014:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x003c
            java.lang.Object r0 = r4.next()
            com.google.android.gms.internal.ads.abg r0 = (com.google.android.gms.internal.ads.abg) r0
            java.lang.Object r1 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            com.google.android.gms.internal.ads.ke r1 = (com.google.android.gms.internal.ads.C1427ke) r1     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            java.util.List<com.google.android.gms.internal.ads.ke> r2 = r3.f5636n     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            r2.add(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            if (r1 == 0) goto L_0x0014
            int r2 = r1.f5616a     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            if (r2 != 0) goto L_0x0014
            r3.m7190a((com.google.android.gms.internal.ads.abg<com.google.android.gms.internal.ads.C1427ke>) r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            return r1
        L_0x0035:
            r0 = move-exception
            java.lang.String r1 = "Exception while processing an adapter; continuing with other adapters"
            com.google.android.gms.internal.ads.C1772wz.m1627c(r1, r0)
            goto L_0x0014
        L_0x003c:
            r4 = 0
            r3.m7190a((com.google.android.gms.internal.ads.abg<com.google.android.gms.internal.ads.C1427ke>) r4)
            com.google.android.gms.internal.ads.ke r4 = new com.google.android.gms.internal.ads.ke
            r0 = 1
            r4.<init>(r0)
            return r4
        L_0x0047:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1431ki.m7191b(java.util.List):com.google.android.gms.internal.ads.ke");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r13.f5626d.f5579n == -1) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        r0 = r13.f5626d.f5579n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r0 = 10000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        r14 = r14.iterator();
        r3 = null;
        r1 = r0;
        r0 = null;
        r4 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r14.hasNext() == false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        r5 = r14.next();
        r6 = com.google.android.gms.ads.internal.zzbv.zzlm().mo9996a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r1 != 0) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r5.isDone() == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        r10 = (com.google.android.gms.internal.ads.C1427ke) r5.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
        r10 = (com.google.android.gms.internal.ads.C1427ke) r5.get(r1, java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        r13.f5636n.add(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0061, code lost:
        if (r10 == null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0065, code lost:
        if (r10.f5616a != 0) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0067, code lost:
        r11 = r10.f5621f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0069, code lost:
        if (r11 == null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006f, code lost:
        if (r11.mo12672a() <= r4) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0075, code lost:
        r3 = r5;
        r0 = r10;
        r4 = r11.mo12672a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0078, code lost:
        r1 = java.lang.Math.max(r1 - (com.google.android.gms.ads.internal.zzbv.zzlm().mo9996a() - r6), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        com.google.android.gms.internal.ads.C1772wz.m1627c("Exception while processing an adapter; continuing with other adapters", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008c, code lost:
        r1 = java.lang.Math.max(r1 - (com.google.android.gms.ads.internal.zzbv.zzlm().mo9996a() - r6), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009b, code lost:
        java.lang.Math.max(r1 - (com.google.android.gms.ads.internal.zzbv.zzlm().mo9996a() - r6), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a8, code lost:
        throw r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a9, code lost:
        m7190a((com.google.android.gms.internal.ads.abg<com.google.android.gms.internal.ads.C1427ke>) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ac, code lost:
        if (r0 != null) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b4, code lost:
        return new com.google.android.gms.internal.ads.C1427ke(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b5, code lost:
        return r0;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.C1427ke m7194c(java.util.List<com.google.android.gms.internal.ads.abg<com.google.android.gms.internal.ads.C1427ke>> r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f5631i
            monitor-enter(r0)
            boolean r1 = r13.f5632j     // Catch:{ all -> 0x00b6 }
            r2 = -1
            if (r1 == 0) goto L_0x000f
            com.google.android.gms.internal.ads.ke r14 = new com.google.android.gms.internal.ads.ke     // Catch:{ all -> 0x00b6 }
            r14.<init>(r2)     // Catch:{ all -> 0x00b6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b6 }
            return r14
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x00b6 }
            com.google.android.gms.internal.ads.jy r0 = r13.f5626d
            long r0 = r0.f5579n
            r3 = -1
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.jy r0 = r13.f5626d
            long r0 = r0.f5579n
            goto L_0x0021
        L_0x001f:
            r0 = 10000(0x2710, double:4.9407E-320)
        L_0x0021:
            java.util.Iterator r14 = r14.iterator()
            r3 = 0
            r1 = r0
            r0 = r3
            r4 = -1
        L_0x0029:
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L_0x00a9
            java.lang.Object r5 = r14.next()
            com.google.android.gms.internal.ads.abg r5 = (com.google.android.gms.internal.ads.abg) r5
            com.google.android.gms.common.util.e r6 = com.google.android.gms.ads.internal.zzbv.zzlm()
            long r6 = r6.mo9996a()
            r8 = 0
            int r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0054
            boolean r10 = r5.isDone()     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            if (r10 == 0) goto L_0x0054
            java.lang.Object r10 = r5.get()     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            com.google.android.gms.internal.ads.ke r10 = (com.google.android.gms.internal.ads.C1427ke) r10     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            goto L_0x005c
        L_0x0050:
            r14 = move-exception
            goto L_0x009b
        L_0x0052:
            r5 = move-exception
            goto L_0x0087
        L_0x0054:
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            java.lang.Object r10 = r5.get(r1, r10)     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            com.google.android.gms.internal.ads.ke r10 = (com.google.android.gms.internal.ads.C1427ke) r10     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
        L_0x005c:
            java.util.List<com.google.android.gms.internal.ads.ke> r11 = r13.f5636n     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            r11.add(r10)     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            if (r10 == 0) goto L_0x0078
            int r11 = r10.f5616a     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            if (r11 != 0) goto L_0x0078
            com.google.android.gms.internal.ads.kx r11 = r10.f5621f     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            if (r11 == 0) goto L_0x0078
            int r12 = r11.mo12672a()     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            if (r12 <= r4) goto L_0x0078
            int r11 = r11.mo12672a()     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            r3 = r5
            r0 = r10
            r4 = r11
        L_0x0078:
            com.google.android.gms.common.util.e r5 = com.google.android.gms.ads.internal.zzbv.zzlm()
            long r10 = r5.mo9996a()
            long r10 = r10 - r6
            long r1 = r1 - r10
            long r1 = java.lang.Math.max(r1, r8)
            goto L_0x0029
        L_0x0087:
            java.lang.String r10 = "Exception while processing an adapter; continuing with other adapters"
            com.google.android.gms.internal.ads.C1772wz.m1627c(r10, r5)     // Catch:{ all -> 0x0050 }
            com.google.android.gms.common.util.e r5 = com.google.android.gms.ads.internal.zzbv.zzlm()
            long r10 = r5.mo9996a()
            long r10 = r10 - r6
            long r1 = r1 - r10
            long r1 = java.lang.Math.max(r1, r8)
            goto L_0x0029
        L_0x009b:
            com.google.android.gms.common.util.e r0 = com.google.android.gms.ads.internal.zzbv.zzlm()
            long r3 = r0.mo9996a()
            long r3 = r3 - r6
            long r1 = r1 - r3
            java.lang.Math.max(r1, r8)
            throw r14
        L_0x00a9:
            r13.m7190a((com.google.android.gms.internal.ads.abg<com.google.android.gms.internal.ads.C1427ke>) r3)
            if (r0 != 0) goto L_0x00b5
            com.google.android.gms.internal.ads.ke r14 = new com.google.android.gms.internal.ads.ke
            r0 = 1
            r14.<init>(r0)
            return r14
        L_0x00b5:
            return r0
        L_0x00b6:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b6 }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1431ki.m7194c(java.util.List):com.google.android.gms.internal.ads.ke");
    }

    /* renamed from: a */
    private final void m7190a(abg<C1427ke> abg) {
        C1782xi.f6838a.post(new C1433kk(this, abg));
    }

    /* renamed from: a */
    public final void mo12640a() {
        synchronized (this.f5631i) {
            this.f5632j = true;
            for (C1424kb a : this.f5633k.values()) {
                a.mo12668a();
            }
        }
    }

    /* renamed from: b */
    public final List<C1427ke> mo12641b() {
        return this.f5636n;
    }
}
