package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.eb */
public abstract class C1261eb extends azd implements C1260ea {
    public C1261eb() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
        /*
            r0 = this;
            switch(r1) {
                case 2: goto L_0x0154;
                case 3: goto L_0x0149;
                case 4: goto L_0x013e;
                case 5: goto L_0x0133;
                case 6: goto L_0x0128;
                case 7: goto L_0x011d;
                case 8: goto L_0x0112;
                case 9: goto L_0x0107;
                case 10: goto L_0x00fc;
                case 11: goto L_0x00f1;
                case 12: goto L_0x00e5;
                case 13: goto L_0x00dd;
                case 14: goto L_0x00d1;
                case 15: goto L_0x00c1;
                case 16: goto L_0x00ad;
                case 17: goto L_0x009d;
                case 18: goto L_0x0091;
                case 19: goto L_0x0085;
                case 20: goto L_0x0079;
                case 21: goto L_0x0055;
                case 22: goto L_0x004d;
                case 23: goto L_0x0041;
                case 24: goto L_0x0035;
                case 25: goto L_0x0025;
                case 26: goto L_0x0015;
                case 27: goto L_0x000d;
                case 28: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            r0.mo11608x()
            r3.writeNoException()
            goto L_0x015e
        L_0x000d:
            r0.mo11607w()
            r3.writeNoException()
            goto L_0x015e
        L_0x0015:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.bst r1 = com.google.android.gms.internal.ads.bsu.m6362a(r1)
            r0.mo11585a((com.google.android.gms.internal.ads.bst) r1)
            r3.writeNoException()
            goto L_0x015e
        L_0x0025:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.bsx r1 = com.google.android.gms.internal.ads.bsy.m6366a(r1)
            r0.mo11586a((com.google.android.gms.internal.ads.bsx) r1)
            r3.writeNoException()
            goto L_0x015e
        L_0x0035:
            boolean r1 = r0.mo11592h()
            r3.writeNoException()
            com.google.android.gms.internal.ads.aze.m4504a((android.os.Parcel) r3, (boolean) r1)
            goto L_0x015e
        L_0x0041:
            java.util.List r1 = r0.mo11591g()
            r3.writeNoException()
            r3.writeList(r1)
            goto L_0x015e
        L_0x004d:
            r0.mo11609y()
            r3.writeNoException()
            goto L_0x015e
        L_0x0055:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x005d
            r1 = 0
            goto L_0x0071
        L_0x005d:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C1256dx
            if (r4 == 0) goto L_0x006b
            r1 = r2
            com.google.android.gms.internal.ads.dx r1 = (com.google.android.gms.internal.ads.C1256dx) r1
            goto L_0x0071
        L_0x006b:
            com.google.android.gms.internal.ads.dz r2 = new com.google.android.gms.internal.ads.dz
            r2.<init>(r1)
            r1 = r2
        L_0x0071:
            r0.mo11587a((com.google.android.gms.internal.ads.C1256dx) r1)
            r3.writeNoException()
            goto L_0x015e
        L_0x0079:
            android.os.Bundle r1 = r0.mo11604t()
            r3.writeNoException()
            com.google.android.gms.internal.ads.aze.m4507b(r3, r1)
            goto L_0x015e
        L_0x0085:
            com.google.android.gms.a.a r1 = r0.mo11602r()
            r3.writeNoException()
            com.google.android.gms.internal.ads.aze.m4502a((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x015e
        L_0x0091:
            com.google.android.gms.a.a r1 = r0.mo11601q()
            r3.writeNoException()
            com.google.android.gms.internal.ads.aze.m4502a((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x015e
        L_0x009d:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.aze.m4501a((android.os.Parcel) r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.mo11589c(r1)
            r3.writeNoException()
            goto L_0x015e
        L_0x00ad:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.aze.m4501a((android.os.Parcel) r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            boolean r1 = r0.mo11588b(r1)
            r3.writeNoException()
            com.google.android.gms.internal.ads.aze.m4504a((android.os.Parcel) r3, (boolean) r1)
            goto L_0x015e
        L_0x00c1:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.aze.m4501a((android.os.Parcel) r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.mo11584a((android.os.Bundle) r1)
            r3.writeNoException()
            goto L_0x015e
        L_0x00d1:
            com.google.android.gms.internal.ads.bz r1 = r0.mo11605u()
            r3.writeNoException()
            com.google.android.gms.internal.ads.aze.m4502a((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x015e
        L_0x00dd:
            r0.mo11606v()
            r3.writeNoException()
            goto L_0x015e
        L_0x00e5:
            java.lang.String r1 = r0.mo11603s()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x015e
        L_0x00f1:
            com.google.android.gms.internal.ads.btb r1 = r0.mo11600p()
            r3.writeNoException()
            com.google.android.gms.internal.ads.aze.m4502a((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x015e
        L_0x00fc:
            java.lang.String r1 = r0.mo11599o()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x015e
        L_0x0107:
            java.lang.String r1 = r0.mo11598n()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x015e
        L_0x0112:
            double r1 = r0.mo11597m()
            r3.writeNoException()
            r3.writeDouble(r1)
            goto L_0x015e
        L_0x011d:
            java.lang.String r1 = r0.mo11596l()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x015e
        L_0x0128:
            java.lang.String r1 = r0.mo11595k()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x015e
        L_0x0133:
            com.google.android.gms.internal.ads.ce r1 = r0.mo11594j()
            r3.writeNoException()
            com.google.android.gms.internal.ads.aze.m4502a((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x015e
        L_0x013e:
            java.lang.String r1 = r0.mo11593i()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x015e
        L_0x0149:
            java.util.List r1 = r0.mo11236f()
            r3.writeNoException()
            r3.writeList(r1)
            goto L_0x015e
        L_0x0154:
            java.lang.String r1 = r0.mo11590e()
            r3.writeNoException()
            r3.writeString(r1)
        L_0x015e:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1261eb.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
