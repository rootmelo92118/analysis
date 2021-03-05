package com.google.android.gms.internal.ads;

@C1598qn
/* renamed from: com.google.android.gms.internal.ads.ps */
public final class C1576ps implements C1564pg<C1090au> {

    /* renamed from: a */
    private final boolean f6211a;

    /* renamed from: b */
    private final boolean f6212b;

    /* renamed from: c */
    private final boolean f6213c;

    public C1576ps(boolean z, boolean z2, boolean z3) {
        this.f6211a = z;
        this.f6212b = z2;
        this.f6213c = z3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00db  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.C1135bi mo12857a(com.google.android.gms.internal.ads.C1554ox r22, org.json.JSONObject r23) {
        /*
            r21 = this;
            r0 = r21
            r7 = r22
            r8 = r23
            java.lang.String r3 = "images"
            boolean r5 = r0.f6211a
            boolean r6 = r0.f6212b
            r4 = 0
            r1 = r22
            r2 = r23
            java.util.List r1 = r1.mo12863a((org.json.JSONObject) r2, (java.lang.String) r3, (boolean) r4, (boolean) r5, (boolean) r6)
            java.lang.String r2 = "app_icon"
            boolean r3 = r0.f6211a
            r4 = 1
            com.google.android.gms.internal.ads.abg r2 = r7.mo12862a(r8, r2, r4, r3)
            java.lang.String r3 = "video"
            com.google.android.gms.internal.ads.abg r3 = r7.mo12861a((org.json.JSONObject) r8, (java.lang.String) r3)
            com.google.android.gms.internal.ads.abg r4 = r22.mo12860a((org.json.JSONObject) r23)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0031:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0047
            java.lang.Object r5 = r1.next()
            com.google.android.gms.internal.ads.abg r5 = (com.google.android.gms.internal.ads.abg) r5
            java.lang.Object r5 = r5.get()
            com.google.android.gms.internal.ads.at r5 = (com.google.android.gms.internal.ads.C1085at) r5
            r7.add(r5)
            goto L_0x0031
        L_0x0047:
            com.google.android.gms.internal.ads.afl r1 = com.google.android.gms.internal.ads.C1554ox.m7720a((com.google.android.gms.internal.ads.abg<com.google.android.gms.internal.ads.afl>) r3)
            com.google.android.gms.internal.ads.au r3 = new com.google.android.gms.internal.ads.au
            java.lang.String r5 = "headline"
            java.lang.String r5 = r8.getString(r5)
            boolean r6 = r0.f6213c
            if (r6 == 0) goto L_0x0093
            com.google.android.gms.internal.ads.wk r6 = com.google.android.gms.ads.internal.zzbv.zzlj()
            android.content.res.Resources r6 = r6.mo13127g()
            if (r6 == 0) goto L_0x0068
            int r9 = com.google.android.gms.ads.impl.C0726R.string.f664s7
            java.lang.String r6 = r6.getString(r9)
            goto L_0x006a
        L_0x0068:
            java.lang.String r6 = "Test Ad"
        L_0x006a:
            if (r5 == 0) goto L_0x0094
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
        L_0x0093:
            r6 = r5
        L_0x0094:
            java.lang.String r5 = "body"
            java.lang.String r9 = r8.getString(r5)
            java.lang.Object r2 = r2.get()
            com.google.android.gms.internal.ads.ce r2 = (com.google.android.gms.internal.ads.C1210ce) r2
            java.lang.String r5 = "call_to_action"
            java.lang.String r10 = r8.getString(r5)
            java.lang.String r5 = "rating"
            r11 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            double r11 = r8.optDouble(r5, r11)
            java.lang.String r5 = "store"
            java.lang.String r13 = r8.optString(r5)
            java.lang.String r5 = "price"
            java.lang.String r14 = r8.optString(r5)
            java.lang.Object r4 = r4.get()
            r15 = r4
            com.google.android.gms.internal.ads.ap r15 = (com.google.android.gms.internal.ads.C1068ap) r15
            android.os.Bundle r16 = new android.os.Bundle
            r16.<init>()
            r4 = 0
            if (r1 == 0) goto L_0x00d0
            com.google.android.gms.internal.ads.aga r5 = r1.mo10172b()
            r17 = r5
            goto L_0x00d2
        L_0x00d0:
            r17 = r4
        L_0x00d2:
            if (r1 == 0) goto L_0x00db
            android.view.View r1 = r1.getView()
            r18 = r1
            goto L_0x00dd
        L_0x00db:
            r18 = r4
        L_0x00dd:
            r19 = 0
            r20 = 0
            r5 = r3
            r8 = r9
            r9 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1576ps.mo12857a(com.google.android.gms.internal.ads.ox, org.json.JSONObject):com.google.android.gms.internal.ads.bi");
    }
}
