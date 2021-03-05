package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ff */
public abstract class C1293ff extends azd implements C1292fe {
    public C1293ff() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) {
        /*
            r1 = this;
            switch(r2) {
                case 3: goto L_0x0037;
                case 4: goto L_0x0030;
                case 5: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r2 = 0
            return r2
        L_0x0005:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.a.a r2 = com.google.android.gms.p039a.C0719a.C0720a.m768a(r2)
            android.os.IBinder r3 = r3.readStrongBinder()
            if (r3 != 0) goto L_0x0015
            r3 = 0
            goto L_0x0029
        L_0x0015:
            java.lang.String r5 = "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback"
            android.os.IInterface r5 = r3.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.C1294fg
            if (r0 == 0) goto L_0x0023
            r3 = r5
            com.google.android.gms.internal.ads.fg r3 = (com.google.android.gms.internal.ads.C1294fg) r3
            goto L_0x0029
        L_0x0023:
            com.google.android.gms.internal.ads.fh r5 = new com.google.android.gms.internal.ads.fh
            r5.<init>(r3)
            r3 = r5
        L_0x0029:
            r1.mo11091a(r2, r3)
            r4.writeNoException()
            goto L_0x0041
        L_0x0030:
            r1.mo11097f()
            r4.writeNoException()
            goto L_0x0041
        L_0x0037:
            com.google.android.gms.internal.ads.btb r2 = r1.mo11096e()
            r4.writeNoException()
            com.google.android.gms.internal.ads.aze.m4502a((android.os.Parcel) r4, (android.os.IInterface) r2)
        L_0x0041:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1293ff.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
