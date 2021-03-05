package com.google.android.gms.internal.ads;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.pt */
public final class C1577pt implements C1564pg<C1120aw> {

    /* renamed from: a */
    private final boolean f6214a;

    /* renamed from: b */
    private final boolean f6215b;

    /* renamed from: c */
    private final boolean f6216c;

    public C1577pt(boolean z, boolean z2, boolean z3) {
        this.f6214a = z;
        this.f6215b = z2;
        this.f6216c = z3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.C1135bi mo12857a(com.google.android.gms.internal.ads.C1554ox r19, org.json.JSONObject r20) {
        /*
            r18 = this;
            r0 = r18
            r7 = r19
            r8 = r20
            java.lang.String r3 = "images"
            boolean r5 = r0.f6214a
            boolean r6 = r0.f6215b
            r4 = 0
            r1 = r19
            r2 = r20
            java.util.List r1 = r1.mo12863a((org.json.JSONObject) r2, (java.lang.String) r3, (boolean) r4, (boolean) r5, (boolean) r6)
            java.lang.String r2 = "secondary_image"
            boolean r3 = r0.f6214a
            com.google.android.gms.internal.ads.abg r2 = r7.mo12862a(r8, r2, r4, r3)
            com.google.android.gms.internal.ads.abg r3 = r19.mo12860a((org.json.JSONObject) r20)
            java.lang.String r4 = "video"
            com.google.android.gms.internal.ads.abg r4 = r7.mo12861a((org.json.JSONObject) r8, (java.lang.String) r4)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0030:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0046
            java.lang.Object r5 = r1.next()
            com.google.android.gms.internal.ads.abg r5 = (com.google.android.gms.internal.ads.abg) r5
            java.lang.Object r5 = r5.get()
            com.google.android.gms.internal.ads.at r5 = (com.google.android.gms.internal.ads.C1085at) r5
            r7.add(r5)
            goto L_0x0030
        L_0x0046:
            com.google.android.gms.internal.ads.afl r1 = com.google.android.gms.internal.ads.C1554ox.m7720a((com.google.android.gms.internal.ads.abg<com.google.android.gms.internal.ads.afl>) r4)
            com.google.android.gms.internal.ads.aw r4 = new com.google.android.gms.internal.ads.aw
            java.lang.String r5 = "headline"
            java.lang.String r5 = r8.getString(r5)
            boolean r6 = r0.f6216c
            if (r6 == 0) goto L_0x0092
            com.google.android.gms.internal.ads.wk r6 = com.google.android.gms.ads.internal.zzbv.zzlj()
            android.content.res.Resources r6 = r6.mo13127g()
            if (r6 == 0) goto L_0x0067
            int r9 = com.google.android.gms.ads.impl.C0726R.string.f664s7
            java.lang.String r6 = r6.getString(r9)
            goto L_0x0069
        L_0x0067:
            java.lang.String r6 = "Test Ad"
        L_0x0069:
            if (r5 == 0) goto L_0x0093
            java.lang.String r9 = java.lang.String.valueOf(r6)
            int r9 = r9.length()
            int r9 = r9 + 3
            java.lang.String r10 = java.lang.String.valueOf(r5)
            int r10 = r10.length()
            int r9 = r9 + r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r9)
            r10.append(r6)
            java.lang.String r6 = " : "
            r10.append(r6)
            r10.append(r5)
            java.lang.String r5 = r10.toString()
        L_0x0092:
            r6 = r5
        L_0x0093:
            java.lang.String r5 = "body"
            java.lang.String r9 = r8.getString(r5)
            java.lang.Object r2 = r2.get()
            com.google.android.gms.internal.ads.ce r2 = (com.google.android.gms.internal.ads.C1210ce) r2
            java.lang.String r5 = "call_to_action"
            java.lang.String r10 = r8.getString(r5)
            java.lang.String r5 = "advertiser"
            java.lang.String r11 = r8.getString(r5)
            java.lang.Object r3 = r3.get()
            r12 = r3
            com.google.android.gms.internal.ads.ap r12 = (com.google.android.gms.internal.ads.C1068ap) r12
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            r3 = 0
            if (r1 == 0) goto L_0x00c0
            com.google.android.gms.internal.ads.aga r5 = r1.mo10172b()
            r14 = r5
            goto L_0x00c1
        L_0x00c0:
            r14 = r3
        L_0x00c1:
            if (r1 == 0) goto L_0x00c9
            android.view.View r1 = r1.getView()
            r15 = r1
            goto L_0x00ca
        L_0x00c9:
            r15 = r3
        L_0x00ca:
            r16 = 0
            r17 = 0
            r5 = r4
            r8 = r9
            r9 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1577pt.mo12857a(com.google.android.gms.internal.ads.ox, org.json.JSONObject):com.google.android.gms.internal.ads.bi");
    }
}
