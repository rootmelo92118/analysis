package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.ud */
public abstract class C1696ud extends azd implements C1695uc {
    public C1696ud() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    /* renamed from: a */
    public static C1695uc m8033a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        if (queryLocalInterface instanceof C1695uc) {
            return (C1695uc) queryLocalInterface;
        }
        return new C1697ue(iBinder);
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
                case 1: goto L_0x0041;
                case 2: goto L_0x003d;
                case 3: goto L_0x0039;
                case 4: goto L_0x0035;
                case 5: goto L_0x0015;
                case 6: goto L_0x0011;
                case 7: goto L_0x0009;
                case 8: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            r0.mo12547f()
            goto L_0x0044
        L_0x0009:
            int r1 = r2.readInt()
            r0.mo12541a((int) r1)
            goto L_0x0044
        L_0x0011:
            r0.mo12546e()
            goto L_0x0044
        L_0x0015:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x001d
            r1 = 0
            goto L_0x0031
        L_0x001d:
            java.lang.String r2 = "com.google.android.gms.ads.internal.reward.client.IRewardItem"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C1683tr
            if (r4 == 0) goto L_0x002b
            r1 = r2
            com.google.android.gms.internal.ads.tr r1 = (com.google.android.gms.internal.ads.C1683tr) r1
            goto L_0x0031
        L_0x002b:
            com.google.android.gms.internal.ads.tt r2 = new com.google.android.gms.internal.ads.tt
            r2.<init>(r1)
            r1 = r2
        L_0x0031:
            r0.mo12542a((com.google.android.gms.internal.ads.C1683tr) r1)
            goto L_0x0044
        L_0x0035:
            r0.mo12545d()
            goto L_0x0044
        L_0x0039:
            r0.mo12544c()
            goto L_0x0044
        L_0x003d:
            r0.mo12543b()
            goto L_0x0044
        L_0x0041:
            r0.mo12540a()
        L_0x0044:
            r3.writeNoException()
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1696ud.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
