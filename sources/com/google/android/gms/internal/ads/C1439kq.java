package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.kq */
public final class C1439kq extends azc implements C1437ko {
    C1439kq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C1440kr mo12677a(java.lang.String r4) {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.mo11432z()
            r0.writeString(r4)
            r4 = 1
            android.os.Parcel r4 = r3.mo11428a(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0014
            r0 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.C1440kr
            if (r2 == 0) goto L_0x0022
            r0 = r1
            com.google.android.gms.internal.ads.kr r0 = (com.google.android.gms.internal.ads.C1440kr) r0
            goto L_0x0028
        L_0x0022:
            com.google.android.gms.internal.ads.kt r1 = new com.google.android.gms.internal.ads.kt
            r1.<init>(r0)
            r0 = r1
        L_0x0028:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1439kq.mo12677a(java.lang.String):com.google.android.gms.internal.ads.kr");
    }

    /* renamed from: b */
    public final boolean mo12679b(String str) {
        Parcel z = mo11432z();
        z.writeString(str);
        Parcel a = mo11428a(2, z);
        boolean a2 = aze.m4505a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: c */
    public final C1484mh mo12680c(String str) {
        Parcel z = mo11432z();
        z.writeString(str);
        Parcel a = mo11428a(3, z);
        C1484mh a2 = C1485mi.m7611a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
