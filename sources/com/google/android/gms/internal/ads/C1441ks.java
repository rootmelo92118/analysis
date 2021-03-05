package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ks */
public abstract class C1441ks extends azd implements C1440kr {
    public C1441ks() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /* JADX WARNING: type inference failed for: r10v5, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r10v7, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r9, android.os.Parcel r10, android.os.Parcel r11, int r12) {
        /*
            r8 = this;
            r12 = 0
            switch(r9) {
                case 1: goto L_0x0242;
                case 2: goto L_0x0237;
                case 3: goto L_0x0203;
                case 4: goto L_0x01fb;
                case 5: goto L_0x01f3;
                case 6: goto L_0x01ac;
                case 7: goto L_0x016e;
                case 8: goto L_0x0166;
                case 9: goto L_0x015e;
                case 10: goto L_0x0134;
                case 11: goto L_0x0120;
                case 12: goto L_0x0118;
                case 13: goto L_0x010c;
                case 14: goto L_0x00c2;
                case 15: goto L_0x00b6;
                case 16: goto L_0x00aa;
                case 17: goto L_0x009e;
                case 18: goto L_0x0092;
                case 19: goto L_0x0086;
                case 20: goto L_0x006e;
                case 21: goto L_0x005e;
                case 22: goto L_0x0052;
                case 23: goto L_0x0036;
                case 24: goto L_0x002a;
                case 25: goto L_0x001e;
                case 26: goto L_0x0012;
                case 27: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r9 = 0
            return r9
        L_0x0006:
            com.google.android.gms.internal.ads.lg r9 = r8.mo12707p()
            r11.writeNoException()
            com.google.android.gms.internal.ads.aze.m4502a((android.os.Parcel) r11, (android.os.IInterface) r9)
            goto L_0x0283
        L_0x0012:
            com.google.android.gms.internal.ads.btb r9 = r8.mo12706o()
            r11.writeNoException()
            com.google.android.gms.internal.ads.aze.m4502a((android.os.Parcel) r11, (android.os.IInterface) r9)
            goto L_0x0283
        L_0x001e:
            boolean r9 = com.google.android.gms.internal.ads.aze.m4505a(r10)
            r8.mo12692a((boolean) r9)
            r11.writeNoException()
            goto L_0x0283
        L_0x002a:
            com.google.android.gms.internal.ads.da r9 = r8.mo12705n()
            r11.writeNoException()
            com.google.android.gms.internal.ads.aze.m4502a((android.os.Parcel) r11, (android.os.IInterface) r9)
            goto L_0x0283
        L_0x0036:
            android.os.IBinder r9 = r10.readStrongBinder()
            com.google.android.gms.a.a r9 = com.google.android.gms.p039a.C0719a.C0720a.m768a(r9)
            android.os.IBinder r12 = r10.readStrongBinder()
            com.google.android.gms.internal.ads.uz r12 = com.google.android.gms.internal.ads.C1721vb.m8122a(r12)
            java.util.ArrayList r10 = r10.createStringArrayList()
            r8.mo12683a((com.google.android.gms.p039a.C0719a) r9, (com.google.android.gms.internal.ads.C1718uz) r12, (java.util.List<java.lang.String>) r10)
            r11.writeNoException()
            goto L_0x0283
        L_0x0052:
            boolean r9 = r8.mo12704m()
            r11.writeNoException()
            com.google.android.gms.internal.ads.aze.m4504a((android.os.Parcel) r11, (boolean) r9)
            goto L_0x0283
        L_0x005e:
            android.os.IBinder r9 = r10.readStrongBinder()
            com.google.android.gms.a.a r9 = com.google.android.gms.p039a.C0719a.C0720a.m768a(r9)
            r8.mo12682a((com.google.android.gms.p039a.C0719a) r9)
            r11.writeNoException()
            goto L_0x0283
        L_0x006e:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzwb> r9 = com.google.android.gms.internal.ads.zzwb.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.ads.aze.m4501a((android.os.Parcel) r10, r9)
            com.google.android.gms.internal.ads.zzwb r9 = (com.google.android.gms.internal.ads.zzwb) r9
            java.lang.String r12 = r10.readString()
            java.lang.String r10 = r10.readString()
            r8.mo12691a((com.google.android.gms.internal.ads.zzwb) r9, (java.lang.String) r12, (java.lang.String) r10)
            r11.writeNoException()
            goto L_0x0283
        L_0x0086:
            android.os.Bundle r9 = r8.mo12703l()
            r11.writeNoException()
            com.google.android.gms.internal.ads.aze.m4507b(r11, r9)
            goto L_0x0283
        L_0x0092:
            android.os.Bundle r9 = r8.mo12702k()
            r11.writeNoException()
            com.google.android.gms.internal.ads.aze.m4507b(r11, r9)
            goto L_0x0283
        L_0x009e:
            android.os.Bundle r9 = r8.mo12701j()
            r11.writeNoException()
            com.google.android.gms.internal.ads.aze.m4507b(r11, r9)
            goto L_0x0283
        L_0x00aa:
            com.google.android.gms.internal.ads.ld r9 = r8.mo12700i()
            r11.writeNoException()
            com.google.android.gms.internal.ads.aze.m4502a((android.os.Parcel) r11, (android.os.IInterface) r9)
            goto L_0x0283
        L_0x00b6:
            com.google.android.gms.internal.ads.la r9 = r8.mo12699h()
            r11.writeNoException()
            com.google.android.gms.internal.ads.aze.m4502a((android.os.Parcel) r11, (android.os.IInterface) r9)
            goto L_0x0283
        L_0x00c2:
            android.os.IBinder r9 = r10.readStrongBinder()
            com.google.android.gms.a.a r1 = com.google.android.gms.p039a.C0719a.C0720a.m768a(r9)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzwb> r9 = com.google.android.gms.internal.ads.zzwb.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.ads.aze.m4501a((android.os.Parcel) r10, r9)
            r2 = r9
            com.google.android.gms.internal.ads.zzwb r2 = (com.google.android.gms.internal.ads.zzwb) r2
            java.lang.String r3 = r10.readString()
            java.lang.String r4 = r10.readString()
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 != 0) goto L_0x00e3
        L_0x00e1:
            r5 = r12
            goto L_0x00f6
        L_0x00e3:
            java.lang.String r12 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener"
            android.os.IInterface r12 = r9.queryLocalInterface(r12)
            boolean r0 = r12 instanceof com.google.android.gms.internal.ads.C1443ku
            if (r0 == 0) goto L_0x00f0
            com.google.android.gms.internal.ads.ku r12 = (com.google.android.gms.internal.ads.C1443ku) r12
            goto L_0x00e1
        L_0x00f0:
            com.google.android.gms.internal.ads.kw r12 = new com.google.android.gms.internal.ads.kw
            r12.<init>(r9)
            goto L_0x00e1
        L_0x00f6:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzacp> r9 = com.google.android.gms.internal.ads.zzacp.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.ads.aze.m4501a((android.os.Parcel) r10, r9)
            r6 = r9
            com.google.android.gms.internal.ads.zzacp r6 = (com.google.android.gms.internal.ads.zzacp) r6
            java.util.ArrayList r7 = r10.createStringArrayList()
            r0 = r8
            r0.mo12687a(r1, r2, r3, r4, r5, r6, r7)
            r11.writeNoException()
            goto L_0x0283
        L_0x010c:
            boolean r9 = r8.mo12698g()
            r11.writeNoException()
            com.google.android.gms.internal.ads.aze.m4504a((android.os.Parcel) r11, (boolean) r9)
            goto L_0x0283
        L_0x0118:
            r8.mo12697f()
            r11.writeNoException()
            goto L_0x0283
        L_0x0120:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzwb> r9 = com.google.android.gms.internal.ads.zzwb.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.ads.aze.m4501a((android.os.Parcel) r10, r9)
            com.google.android.gms.internal.ads.zzwb r9 = (com.google.android.gms.internal.ads.zzwb) r9
            java.lang.String r10 = r10.readString()
            r8.mo12690a(r9, r10)
            r11.writeNoException()
            goto L_0x0283
        L_0x0134:
            android.os.IBinder r9 = r10.readStrongBinder()
            com.google.android.gms.a.a r1 = com.google.android.gms.p039a.C0719a.C0720a.m768a(r9)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzwb> r9 = com.google.android.gms.internal.ads.zzwb.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.ads.aze.m4501a((android.os.Parcel) r10, r9)
            r2 = r9
            com.google.android.gms.internal.ads.zzwb r2 = (com.google.android.gms.internal.ads.zzwb) r2
            java.lang.String r3 = r10.readString()
            android.os.IBinder r9 = r10.readStrongBinder()
            com.google.android.gms.internal.ads.uz r4 = com.google.android.gms.internal.ads.C1721vb.m8122a(r9)
            java.lang.String r5 = r10.readString()
            r0 = r8
            r0.mo12685a((com.google.android.gms.p039a.C0719a) r1, (com.google.android.gms.internal.ads.zzwb) r2, (java.lang.String) r3, (com.google.android.gms.internal.ads.C1718uz) r4, (java.lang.String) r5)
            r11.writeNoException()
            goto L_0x0283
        L_0x015e:
            r8.mo12696e()
            r11.writeNoException()
            goto L_0x0283
        L_0x0166:
            r8.mo12695d()
            r11.writeNoException()
            goto L_0x0283
        L_0x016e:
            android.os.IBinder r9 = r10.readStrongBinder()
            com.google.android.gms.a.a r1 = com.google.android.gms.p039a.C0719a.C0720a.m768a(r9)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzwb> r9 = com.google.android.gms.internal.ads.zzwb.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.ads.aze.m4501a((android.os.Parcel) r10, r9)
            r2 = r9
            com.google.android.gms.internal.ads.zzwb r2 = (com.google.android.gms.internal.ads.zzwb) r2
            java.lang.String r3 = r10.readString()
            java.lang.String r4 = r10.readString()
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 != 0) goto L_0x018f
        L_0x018d:
            r5 = r12
            goto L_0x01a3
        L_0x018f:
            java.lang.String r10 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener"
            android.os.IInterface r10 = r9.queryLocalInterface(r10)
            boolean r12 = r10 instanceof com.google.android.gms.internal.ads.C1443ku
            if (r12 == 0) goto L_0x019d
            r12 = r10
            com.google.android.gms.internal.ads.ku r12 = (com.google.android.gms.internal.ads.C1443ku) r12
            goto L_0x018d
        L_0x019d:
            com.google.android.gms.internal.ads.kw r12 = new com.google.android.gms.internal.ads.kw
            r12.<init>(r9)
            goto L_0x018d
        L_0x01a3:
            r0 = r8
            r0.mo12686a((com.google.android.gms.p039a.C0719a) r1, (com.google.android.gms.internal.ads.zzwb) r2, (java.lang.String) r3, (java.lang.String) r4, (com.google.android.gms.internal.ads.C1443ku) r5)
            r11.writeNoException()
            goto L_0x0283
        L_0x01ac:
            android.os.IBinder r9 = r10.readStrongBinder()
            com.google.android.gms.a.a r1 = com.google.android.gms.p039a.C0719a.C0720a.m768a(r9)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzwf> r9 = com.google.android.gms.internal.ads.zzwf.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.ads.aze.m4501a((android.os.Parcel) r10, r9)
            r2 = r9
            com.google.android.gms.internal.ads.zzwf r2 = (com.google.android.gms.internal.ads.zzwf) r2
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzwb> r9 = com.google.android.gms.internal.ads.zzwb.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.ads.aze.m4501a((android.os.Parcel) r10, r9)
            r3 = r9
            com.google.android.gms.internal.ads.zzwb r3 = (com.google.android.gms.internal.ads.zzwb) r3
            java.lang.String r4 = r10.readString()
            java.lang.String r5 = r10.readString()
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 != 0) goto L_0x01d6
        L_0x01d4:
            r6 = r12
            goto L_0x01ea
        L_0x01d6:
            java.lang.String r10 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener"
            android.os.IInterface r10 = r9.queryLocalInterface(r10)
            boolean r12 = r10 instanceof com.google.android.gms.internal.ads.C1443ku
            if (r12 == 0) goto L_0x01e4
            r12 = r10
            com.google.android.gms.internal.ads.ku r12 = (com.google.android.gms.internal.ads.C1443ku) r12
            goto L_0x01d4
        L_0x01e4:
            com.google.android.gms.internal.ads.kw r12 = new com.google.android.gms.internal.ads.kw
            r12.<init>(r9)
            goto L_0x01d4
        L_0x01ea:
            r0 = r8
            r0.mo12689a(r1, r2, r3, r4, r5, r6)
            r11.writeNoException()
            goto L_0x0283
        L_0x01f3:
            r8.mo12694c()
            r11.writeNoException()
            goto L_0x0283
        L_0x01fb:
            r8.mo12693b()
            r11.writeNoException()
            goto L_0x0283
        L_0x0203:
            android.os.IBinder r9 = r10.readStrongBinder()
            com.google.android.gms.a.a r9 = com.google.android.gms.p039a.C0719a.C0720a.m768a(r9)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzwb> r0 = com.google.android.gms.internal.ads.zzwb.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.aze.m4501a((android.os.Parcel) r10, r0)
            com.google.android.gms.internal.ads.zzwb r0 = (com.google.android.gms.internal.ads.zzwb) r0
            java.lang.String r1 = r10.readString()
            android.os.IBinder r10 = r10.readStrongBinder()
            if (r10 != 0) goto L_0x021e
            goto L_0x0230
        L_0x021e:
            java.lang.String r12 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener"
            android.os.IInterface r12 = r10.queryLocalInterface(r12)
            boolean r2 = r12 instanceof com.google.android.gms.internal.ads.C1443ku
            if (r2 == 0) goto L_0x022b
            com.google.android.gms.internal.ads.ku r12 = (com.google.android.gms.internal.ads.C1443ku) r12
            goto L_0x0230
        L_0x022b:
            com.google.android.gms.internal.ads.kw r12 = new com.google.android.gms.internal.ads.kw
            r12.<init>(r10)
        L_0x0230:
            r8.mo12684a(r9, r0, r1, r12)
            r11.writeNoException()
            goto L_0x0283
        L_0x0237:
            com.google.android.gms.a.a r9 = r8.mo12681a()
            r11.writeNoException()
            com.google.android.gms.internal.ads.aze.m4502a((android.os.Parcel) r11, (android.os.IInterface) r9)
            goto L_0x0283
        L_0x0242:
            android.os.IBinder r9 = r10.readStrongBinder()
            com.google.android.gms.a.a r1 = com.google.android.gms.p039a.C0719a.C0720a.m768a(r9)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzwf> r9 = com.google.android.gms.internal.ads.zzwf.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.ads.aze.m4501a((android.os.Parcel) r10, r9)
            r2 = r9
            com.google.android.gms.internal.ads.zzwf r2 = (com.google.android.gms.internal.ads.zzwf) r2
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzwb> r9 = com.google.android.gms.internal.ads.zzwb.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.ads.aze.m4501a((android.os.Parcel) r10, r9)
            r3 = r9
            com.google.android.gms.internal.ads.zzwb r3 = (com.google.android.gms.internal.ads.zzwb) r3
            java.lang.String r4 = r10.readString()
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 != 0) goto L_0x0268
        L_0x0266:
            r5 = r12
            goto L_0x027c
        L_0x0268:
            java.lang.String r10 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener"
            android.os.IInterface r10 = r9.queryLocalInterface(r10)
            boolean r12 = r10 instanceof com.google.android.gms.internal.ads.C1443ku
            if (r12 == 0) goto L_0x0276
            r12 = r10
            com.google.android.gms.internal.ads.ku r12 = (com.google.android.gms.internal.ads.C1443ku) r12
            goto L_0x0266
        L_0x0276:
            com.google.android.gms.internal.ads.kw r12 = new com.google.android.gms.internal.ads.kw
            r12.<init>(r9)
            goto L_0x0266
        L_0x027c:
            r0 = r8
            r0.mo12688a((com.google.android.gms.p039a.C0719a) r1, (com.google.android.gms.internal.ads.zzwf) r2, (com.google.android.gms.internal.ads.zzwb) r3, (java.lang.String) r4, (com.google.android.gms.internal.ads.C1443ku) r5)
            r11.writeNoException()
        L_0x0283:
            r9 = 1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1441ks.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
