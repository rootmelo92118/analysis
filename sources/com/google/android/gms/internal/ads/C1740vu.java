package com.google.android.gms.internal.ads;

import android.content.Context;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.vu */
public final class C1740vu implements bmr {

    /* renamed from: a */
    private final Context f6653a;

    /* renamed from: b */
    private final Object f6654b;

    /* renamed from: c */
    private String f6655c;

    /* renamed from: d */
    private boolean f6656d;

    public C1740vu(Context context, String str) {
        this.f6653a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f6655c = str;
        this.f6656d = false;
        this.f6654b = new Object();
    }

    /* renamed from: a */
    public final void mo13070a(String str) {
        this.f6655c = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13071a(boolean r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.vv r0 = com.google.android.gms.ads.internal.zzbv.zzmf()
            android.content.Context r1 = r3.f6653a
            boolean r0 = r0.mo13075a(r1)
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.Object r0 = r3.f6654b
            monitor-enter(r0)
            boolean r1 = r3.f6656d     // Catch:{ all -> 0x003f }
            if (r1 != r4) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x0016:
            r3.f6656d = r4     // Catch:{ all -> 0x003f }
            java.lang.String r4 = r3.f6655c     // Catch:{ all -> 0x003f }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x0022
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x0022:
            boolean r4 = r3.f6656d     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x0032
            com.google.android.gms.internal.ads.vv r4 = com.google.android.gms.ads.internal.zzbv.zzmf()     // Catch:{ all -> 0x003f }
            android.content.Context r1 = r3.f6653a     // Catch:{ all -> 0x003f }
            java.lang.String r2 = r3.f6655c     // Catch:{ all -> 0x003f }
            r4.mo13072a((android.content.Context) r1, (java.lang.String) r2)     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x0032:
            com.google.android.gms.internal.ads.vv r4 = com.google.android.gms.ads.internal.zzbv.zzmf()     // Catch:{ all -> 0x003f }
            android.content.Context r1 = r3.f6653a     // Catch:{ all -> 0x003f }
            java.lang.String r2 = r3.f6655c     // Catch:{ all -> 0x003f }
            r4.mo13077b(r1, r2)     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1740vu.mo13071a(boolean):void");
    }

    /* renamed from: a */
    public final void mo10442a(bmq bmq) {
        mo13071a(bmq.f4778a);
    }
}
