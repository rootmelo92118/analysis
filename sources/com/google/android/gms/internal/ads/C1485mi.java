package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.mi */
public abstract class C1485mi extends azd implements C1484mh {
    public C1485mi() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    /* renamed from: a */
    public static C1484mh m7611a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        if (queryLocalInterface instanceof C1484mh) {
            return (C1484mh) queryLocalInterface;
        }
        return new C1486mj(iBinder);
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [com.google.android.gms.internal.ads.mk] */
    /* JADX WARNING: type inference failed for: r1v9, types: [com.google.android.gms.internal.ads.lz] */
    /* JADX WARNING: type inference failed for: r1v10, types: [com.google.android.gms.internal.ads.ly] */
    /* JADX WARNING: type inference failed for: r5v6, types: [com.google.android.gms.internal.ads.ly] */
    /* JADX WARNING: type inference failed for: r1v17, types: [com.google.android.gms.internal.ads.mc] */
    /* JADX WARNING: type inference failed for: r1v18, types: [com.google.android.gms.internal.ads.mb] */
    /* JADX WARNING: type inference failed for: r5v9, types: [com.google.android.gms.internal.ads.mb] */
    /* JADX WARNING: type inference failed for: r1v23, types: [com.google.android.gms.internal.ads.mg] */
    /* JADX WARNING: type inference failed for: r1v24, types: [com.google.android.gms.internal.ads.mf] */
    /* JADX WARNING: type inference failed for: r5v12, types: [com.google.android.gms.internal.ads.mf] */
    /* JADX WARNING: type inference failed for: r1v30, types: [com.google.android.gms.internal.ads.me] */
    /* JADX WARNING: type inference failed for: r1v31, types: [com.google.android.gms.internal.ads.md] */
    /* JADX WARNING: type inference failed for: r5v15, types: [com.google.android.gms.internal.ads.md] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) {
        /*
            r9 = this;
            r1 = 0
            switch(r10) {
                case 1: goto L_0x018e;
                case 2: goto L_0x0183;
                case 3: goto L_0x0178;
                case 4: goto L_0x0124;
                case 5: goto L_0x0118;
                case 6: goto L_0x00ce;
                case 7: goto L_0x00c6;
                case 8: goto L_0x007c;
                case 9: goto L_0x0074;
                case 10: goto L_0x0064;
                case 11: goto L_0x0050;
                case 12: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r0 = 0
            return r0
        L_0x0006:
            java.lang.String r2 = r11.readString()
            java.lang.String r3 = r11.readString()
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.aze.m4501a((android.os.Parcel) r11, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            android.os.IBinder r5 = r11.readStrongBinder()
            com.google.android.gms.a.a r5 = com.google.android.gms.p039a.C0719a.C0720a.m768a(r5)
            android.os.IBinder r6 = r11.readStrongBinder()
            if (r6 != 0) goto L_0x0026
        L_0x0024:
            r6 = r1
            goto L_0x0039
        L_0x0026:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback"
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r7 = r1 instanceof com.google.android.gms.internal.ads.C1480md
            if (r7 == 0) goto L_0x0033
            com.google.android.gms.internal.ads.md r1 = (com.google.android.gms.internal.ads.C1480md) r1
            goto L_0x0024
        L_0x0033:
            com.google.android.gms.internal.ads.me r1 = new com.google.android.gms.internal.ads.me
            r1.<init>(r6)
            goto L_0x0024
        L_0x0039:
            android.os.IBinder r0 = r11.readStrongBinder()
            com.google.android.gms.internal.ads.ku r7 = com.google.android.gms.internal.ads.C1444kv.m7286a(r0)
            r0 = r9
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r0.mo12791a((java.lang.String) r1, (java.lang.String) r2, (android.os.Bundle) r3, (com.google.android.gms.p039a.C0719a) r4, (com.google.android.gms.internal.ads.C1480md) r5, (com.google.android.gms.internal.ads.C1443ku) r6)
            r12.writeNoException()
            goto L_0x01da
        L_0x0050:
            java.lang.String[] r1 = r11.createStringArray()
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            java.lang.Object[] r0 = r11.createTypedArray(r2)
            android.os.Bundle[] r0 = (android.os.Bundle[]) r0
            r9.mo12793a(r1, r0)
            r12.writeNoException()
            goto L_0x01da
        L_0x0064:
            android.os.IBinder r0 = r11.readStrongBinder()
            com.google.android.gms.a.a r0 = com.google.android.gms.p039a.C0719a.C0720a.m768a(r0)
            r9.mo12787a(r0)
            r12.writeNoException()
            goto L_0x01da
        L_0x0074:
            r9.mo12797e()
            r12.writeNoException()
            goto L_0x01da
        L_0x007c:
            java.lang.String r2 = r11.readString()
            java.lang.String r3 = r11.readString()
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.aze.m4501a((android.os.Parcel) r11, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            android.os.IBinder r5 = r11.readStrongBinder()
            com.google.android.gms.a.a r5 = com.google.android.gms.p039a.C0719a.C0720a.m768a(r5)
            android.os.IBinder r6 = r11.readStrongBinder()
            if (r6 != 0) goto L_0x009c
        L_0x009a:
            r6 = r1
            goto L_0x00af
        L_0x009c:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback"
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r7 = r1 instanceof com.google.android.gms.internal.ads.C1482mf
            if (r7 == 0) goto L_0x00a9
            com.google.android.gms.internal.ads.mf r1 = (com.google.android.gms.internal.ads.C1482mf) r1
            goto L_0x009a
        L_0x00a9:
            com.google.android.gms.internal.ads.mg r1 = new com.google.android.gms.internal.ads.mg
            r1.<init>(r6)
            goto L_0x009a
        L_0x00af:
            android.os.IBinder r0 = r11.readStrongBinder()
            com.google.android.gms.internal.ads.ku r7 = com.google.android.gms.internal.ads.C1444kv.m7286a(r0)
            r0 = r9
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r0.mo12792a((java.lang.String) r1, (java.lang.String) r2, (android.os.Bundle) r3, (com.google.android.gms.p039a.C0719a) r4, (com.google.android.gms.internal.ads.C1482mf) r5, (com.google.android.gms.internal.ads.C1443ku) r6)
            r12.writeNoException()
            goto L_0x01da
        L_0x00c6:
            r9.mo12796d()
            r12.writeNoException()
            goto L_0x01da
        L_0x00ce:
            java.lang.String r2 = r11.readString()
            java.lang.String r3 = r11.readString()
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.aze.m4501a((android.os.Parcel) r11, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            android.os.IBinder r5 = r11.readStrongBinder()
            com.google.android.gms.a.a r5 = com.google.android.gms.p039a.C0719a.C0720a.m768a(r5)
            android.os.IBinder r6 = r11.readStrongBinder()
            if (r6 != 0) goto L_0x00ee
        L_0x00ec:
            r6 = r1
            goto L_0x0101
        L_0x00ee:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback"
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r7 = r1 instanceof com.google.android.gms.internal.ads.C1478mb
            if (r7 == 0) goto L_0x00fb
            com.google.android.gms.internal.ads.mb r1 = (com.google.android.gms.internal.ads.C1478mb) r1
            goto L_0x00ec
        L_0x00fb:
            com.google.android.gms.internal.ads.mc r1 = new com.google.android.gms.internal.ads.mc
            r1.<init>(r6)
            goto L_0x00ec
        L_0x0101:
            android.os.IBinder r0 = r11.readStrongBinder()
            com.google.android.gms.internal.ads.ku r7 = com.google.android.gms.internal.ads.C1444kv.m7286a(r0)
            r0 = r9
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r0.mo12790a((java.lang.String) r1, (java.lang.String) r2, (android.os.Bundle) r3, (com.google.android.gms.p039a.C0719a) r4, (com.google.android.gms.internal.ads.C1478mb) r5, (com.google.android.gms.internal.ads.C1443ku) r6)
            r12.writeNoException()
            goto L_0x01da
        L_0x0118:
            com.google.android.gms.internal.ads.btb r0 = r9.mo12795c()
            r12.writeNoException()
            com.google.android.gms.internal.ads.aze.m4502a((android.os.Parcel) r12, (android.os.IInterface) r0)
            goto L_0x01da
        L_0x0124:
            java.lang.String r2 = r11.readString()
            java.lang.String r3 = r11.readString()
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.aze.m4501a((android.os.Parcel) r11, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            android.os.IBinder r5 = r11.readStrongBinder()
            com.google.android.gms.a.a r5 = com.google.android.gms.p039a.C0719a.C0720a.m768a(r5)
            android.os.IBinder r6 = r11.readStrongBinder()
            if (r6 != 0) goto L_0x0144
        L_0x0142:
            r6 = r1
            goto L_0x0157
        L_0x0144:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback"
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r7 = r1 instanceof com.google.android.gms.internal.ads.C1474ly
            if (r7 == 0) goto L_0x0151
            com.google.android.gms.internal.ads.ly r1 = (com.google.android.gms.internal.ads.C1474ly) r1
            goto L_0x0142
        L_0x0151:
            com.google.android.gms.internal.ads.lz r1 = new com.google.android.gms.internal.ads.lz
            r1.<init>(r6)
            goto L_0x0142
        L_0x0157:
            android.os.IBinder r1 = r11.readStrongBinder()
            com.google.android.gms.internal.ads.ku r7 = com.google.android.gms.internal.ads.C1444kv.m7286a(r1)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzwf> r1 = com.google.android.gms.internal.ads.zzwf.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.aze.m4501a((android.os.Parcel) r11, r1)
            r8 = r0
            com.google.android.gms.internal.ads.zzwf r8 = (com.google.android.gms.internal.ads.zzwf) r8
            r0 = r9
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r0.mo12789a(r1, r2, r3, r4, r5, r6, r7)
            r12.writeNoException()
            goto L_0x01da
        L_0x0178:
            com.google.android.gms.internal.ads.zzans r0 = r9.mo12794b()
            r12.writeNoException()
            com.google.android.gms.internal.ads.aze.m4507b(r12, r0)
            goto L_0x01da
        L_0x0183:
            com.google.android.gms.internal.ads.zzans r0 = r9.mo12786a()
            r12.writeNoException()
            com.google.android.gms.internal.ads.aze.m4507b(r12, r0)
            goto L_0x01da
        L_0x018e:
            android.os.IBinder r2 = r11.readStrongBinder()
            com.google.android.gms.a.a r2 = com.google.android.gms.p039a.C0719a.C0720a.m768a(r2)
            java.lang.String r3 = r11.readString()
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.aze.m4501a((android.os.Parcel) r11, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
            android.os.Parcelable r5 = com.google.android.gms.internal.ads.aze.m4501a((android.os.Parcel) r11, r5)
            android.os.Bundle r5 = (android.os.Bundle) r5
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzwf> r6 = com.google.android.gms.internal.ads.zzwf.CREATOR
            android.os.Parcelable r6 = com.google.android.gms.internal.ads.aze.m4501a((android.os.Parcel) r11, r6)
            com.google.android.gms.internal.ads.zzwf r6 = (com.google.android.gms.internal.ads.zzwf) r6
            android.os.IBinder r0 = r11.readStrongBinder()
            if (r0 != 0) goto L_0x01ba
        L_0x01b8:
            r7 = r1
            goto L_0x01cd
        L_0x01ba:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r7 = r1 instanceof com.google.android.gms.internal.ads.C1487mk
            if (r7 == 0) goto L_0x01c7
            com.google.android.gms.internal.ads.mk r1 = (com.google.android.gms.internal.ads.C1487mk) r1
            goto L_0x01b8
        L_0x01c7:
            com.google.android.gms.internal.ads.ml r1 = new com.google.android.gms.internal.ads.ml
            r1.<init>(r0)
            goto L_0x01b8
        L_0x01cd:
            r0 = r9
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r0.mo12788a((com.google.android.gms.p039a.C0719a) r1, (java.lang.String) r2, (android.os.Bundle) r3, (android.os.Bundle) r4, (com.google.android.gms.internal.ads.zzwf) r5, (com.google.android.gms.internal.ads.C1487mk) r6)
            r12.writeNoException()
        L_0x01da:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1485mi.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
