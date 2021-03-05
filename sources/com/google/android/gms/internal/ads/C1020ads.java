package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.Nullable;
import com.google.android.gms.common.util.C0975k;
import java.io.IOException;
import java.io.InputStream;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.ads */
public final class C1020ads implements bje {

    /* renamed from: a */
    private InputStream f1457a;

    /* renamed from: b */
    private boolean f1458b;

    /* renamed from: c */
    private final Context f1459c;

    /* renamed from: d */
    private final bje f1460d;
    @Nullable

    /* renamed from: e */
    private final bjx<bje> f1461e;

    /* renamed from: f */
    private final adt f1462f;

    /* renamed from: g */
    private Uri f1463g;

    public C1020ads(Context context, bje bje, bjx<bje> bjx, adt adt) {
        this.f1459c = context;
        this.f1460d = bje;
        this.f1461e = bjx;
        this.f1462f = adt;
    }

    /* renamed from: a */
    public final void mo10213a() {
        if (this.f1458b) {
            this.f1458b = false;
            this.f1463g = null;
            if (this.f1457a != null) {
                C0975k.m1495a(this.f1457a);
                this.f1457a = null;
            } else {
                this.f1460d.mo10213a();
            }
            if (this.f1461e != null) {
                this.f1461e.mo10245a(this);
                return;
            }
            return;
        }
        throw new IOException("Attempt to close an already closed CacheDataSource.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r4.cancel(true);
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4.cancel(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d6, code lost:
        r4 = com.google.android.gms.ads.internal.zzbv.zzlm().mo9997b() - r9;
        r1.f1462f.mo10215a(false, r4);
        r2 = new java.lang.StringBuilder(44);
        r2.append("Cache connection took ");
        r2.append(r4);
        r2.append("ms");
        com.google.android.gms.internal.ads.C1772wz.m8287a(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00fe, code lost:
        r2 = com.google.android.gms.ads.internal.zzbv.zzlm().mo9997b() - r9;
        r1.f1462f.mo10215a(false, r2);
        r4 = new java.lang.StringBuilder(44);
        r5 = "Cache connection took ";
        r4.append(r5);
        r4.append(r2);
        r2 = "ms";
        r4.append(r2);
        com.google.android.gms.internal.ads.C1772wz.m8287a(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0125, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:18:0x00a1, B:21:0x00d3] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x00a1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x00d3 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x00a1=Splitter:B:18:0x00a1, B:21:0x00d3=Splitter:B:21:0x00d3} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo10212a(com.google.android.gms.internal.ads.bji r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            boolean r2 = r1.f1458b
            if (r2 != 0) goto L_0x016a
            r2 = 1
            r1.f1458b = r2
            android.net.Uri r3 = r0.f4453a
            r1.f1463g = r3
            com.google.android.gms.internal.ads.bjx<com.google.android.gms.internal.ads.bje> r3 = r1.f1461e
            if (r3 == 0) goto L_0x0018
            com.google.android.gms.internal.ads.bjx<com.google.android.gms.internal.ads.bje> r3 = r1.f1461e
            r3.mo10247a(r1, (com.google.android.gms.internal.ads.bji) r0)
        L_0x0018:
            android.net.Uri r3 = r0.f4453a
            com.google.android.gms.internal.ads.zzty r3 = com.google.android.gms.internal.ads.zzty.m8825a((android.net.Uri) r3)
            com.google.android.gms.internal.ads.e<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.C1557p.f6025ca
            com.google.android.gms.internal.ads.m r5 = com.google.android.gms.internal.ads.bre.m6321e()
            java.lang.Object r4 = r5.mo12778a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = -1
            if (r4 == 0) goto L_0x0126
            if (r3 == 0) goto L_0x0144
            long r7 = r0.f4456d
            r3.f7263c = r7
            boolean r4 = r3.f7262b
            if (r4 == 0) goto L_0x0049
            com.google.android.gms.internal.ads.e<java.lang.Long> r4 = com.google.android.gms.internal.ads.C1557p.f6027cc
            com.google.android.gms.internal.ads.m r7 = com.google.android.gms.internal.ads.bre.m6321e()
            java.lang.Object r4 = r7.mo12778a(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            goto L_0x0055
        L_0x0049:
            com.google.android.gms.internal.ads.e<java.lang.Long> r4 = com.google.android.gms.internal.ads.C1557p.f6026cb
            com.google.android.gms.internal.ads.m r7 = com.google.android.gms.internal.ads.bre.m6321e()
            java.lang.Object r4 = r7.mo12778a(r4)
            java.lang.Long r4 = (java.lang.Long) r4
        L_0x0055:
            long r7 = r4.longValue()
            com.google.android.gms.common.util.e r4 = com.google.android.gms.ads.internal.zzbv.zzlm()
            long r9 = r4.mo9997b()
            com.google.android.gms.ads.internal.zzbv.zzmb()
            android.content.Context r4 = r1.f1459c
            java.util.concurrent.Future r4 = com.google.android.gms.internal.ads.bow.m6116a(r4, r3)
            r11 = 0
            r12 = 44
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException | TimeoutException -> 0x00d3, InterruptedException -> 0x00a1 }
            java.lang.Object r7 = r4.get(r7, r13)     // Catch:{ ExecutionException | TimeoutException -> 0x00d3, InterruptedException -> 0x00a1 }
            java.io.InputStream r7 = (java.io.InputStream) r7     // Catch:{ ExecutionException | TimeoutException -> 0x00d3, InterruptedException -> 0x00a1 }
            r1.f1457a = r7     // Catch:{ ExecutionException | TimeoutException -> 0x00d3, InterruptedException -> 0x00a1 }
            com.google.android.gms.common.util.e r0 = com.google.android.gms.ads.internal.zzbv.zzlm()
            long r3 = r0.mo9997b()
            long r3 = r3 - r9
            com.google.android.gms.internal.ads.adt r0 = r1.f1462f
            r0.mo10215a(r2, r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r12)
            java.lang.String r2 = "Cache connection took "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = "ms"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.C1772wz.m8287a(r0)
            return r5
        L_0x009f:
            r0 = move-exception
            goto L_0x00fe
        L_0x00a1:
            r4.cancel(r2)     // Catch:{ all -> 0x009f }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x009f }
            r2.interrupt()     // Catch:{ all -> 0x009f }
            com.google.android.gms.common.util.e r2 = com.google.android.gms.ads.internal.zzbv.zzlm()
            long r4 = r2.mo9997b()
            long r4 = r4 - r9
            com.google.android.gms.internal.ads.adt r2 = r1.f1462f
            r2.mo10215a(r11, r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r12)
            java.lang.String r6 = "Cache connection took "
            r2.append(r6)
            r2.append(r4)
            java.lang.String r4 = "ms"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.google.android.gms.internal.ads.C1772wz.m8287a(r2)
            goto L_0x0144
        L_0x00d3:
            r4.cancel(r2)     // Catch:{ all -> 0x009f }
            com.google.android.gms.common.util.e r2 = com.google.android.gms.ads.internal.zzbv.zzlm()
            long r4 = r2.mo9997b()
            long r4 = r4 - r9
            com.google.android.gms.internal.ads.adt r2 = r1.f1462f
            r2.mo10215a(r11, r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r12)
            java.lang.String r6 = "Cache connection took "
            r2.append(r6)
            r2.append(r4)
            java.lang.String r4 = "ms"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.google.android.gms.internal.ads.C1772wz.m8287a(r2)
            goto L_0x0144
        L_0x00fe:
            com.google.android.gms.common.util.e r2 = com.google.android.gms.ads.internal.zzbv.zzlm()
            long r2 = r2.mo9997b()
            long r2 = r2 - r9
            com.google.android.gms.internal.ads.adt r4 = r1.f1462f
            r4.mo10215a(r11, r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r12)
            java.lang.String r5 = "Cache connection took "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = "ms"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.google.android.gms.internal.ads.C1772wz.m8287a(r2)
            throw r0
        L_0x0126:
            r2 = 0
            if (r3 == 0) goto L_0x0135
            long r7 = r0.f4456d
            r3.f7263c = r7
            com.google.android.gms.internal.ads.boc r2 = com.google.android.gms.ads.internal.zzbv.zzll()
            com.google.android.gms.internal.ads.zztv r2 = r2.mo12269a((com.google.android.gms.internal.ads.zzty) r3)
        L_0x0135:
            if (r2 == 0) goto L_0x0144
            boolean r4 = r2.mo13449a()
            if (r4 == 0) goto L_0x0144
            java.io.InputStream r0 = r2.mo13450b()
            r1.f1457a = r0
            return r5
        L_0x0144:
            if (r3 == 0) goto L_0x0163
            com.google.android.gms.internal.ads.bji r2 = new com.google.android.gms.internal.ads.bji
            java.lang.String r3 = r3.f7261a
            android.net.Uri r8 = android.net.Uri.parse(r3)
            byte[] r9 = r0.f4454b
            long r10 = r0.f4455c
            long r12 = r0.f4456d
            long r14 = r0.f4457e
            java.lang.String r3 = r0.f4458f
            int r0 = r0.f4459g
            r7 = r2
            r16 = r3
            r17 = r0
            r7.<init>(r8, r9, r10, r12, r14, r16, r17)
            r0 = r2
        L_0x0163:
            com.google.android.gms.internal.ads.bje r2 = r1.f1460d
            long r2 = r2.mo10212a(r0)
            return r2
        L_0x016a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Attempt to open an already open CacheDataSource."
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1020ads.mo10212a(com.google.android.gms.internal.ads.bji):long");
    }

    /* renamed from: a */
    public final int mo10211a(byte[] bArr, int i, int i2) {
        int i3;
        if (this.f1458b) {
            if (this.f1457a != null) {
                i3 = this.f1457a.read(bArr, i, i2);
            } else {
                i3 = this.f1460d.mo10211a(bArr, i, i2);
            }
            if (this.f1461e != null) {
                this.f1461e.mo10246a(this, i3);
            }
            return i3;
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }

    /* renamed from: b */
    public final Uri mo10214b() {
        return this.f1463g;
    }
}
