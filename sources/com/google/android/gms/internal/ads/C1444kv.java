package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.kv */
public abstract class C1444kv extends azd implements C1443ku {
    public C1444kv() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    /* renamed from: a */
    public static C1443ku m7286a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if (queryLocalInterface instanceof C1443ku) {
            return (C1443ku) queryLocalInterface;
        }
        return new C1445kw(iBinder);
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
                case 1: goto L_0x0080;
                case 2: goto L_0x007c;
                case 3: goto L_0x0074;
                case 4: goto L_0x0070;
                case 5: goto L_0x006c;
                case 6: goto L_0x0068;
                case 7: goto L_0x0048;
                case 8: goto L_0x0044;
                case 9: goto L_0x0038;
                case 10: goto L_0x0028;
                case 11: goto L_0x0024;
                case 12: goto L_0x001c;
                case 13: goto L_0x0017;
                case 14: goto L_0x000a;
                case 15: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            r0.mo12666i()
            goto L_0x0083
        L_0x000a:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzawd> r1 = com.google.android.gms.internal.ads.zzawd.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.aze.m4501a((android.os.Parcel) r2, r1)
            com.google.android.gms.internal.ads.zzawd r1 = (com.google.android.gms.internal.ads.zzawd) r1
            r0.mo12656a((com.google.android.gms.internal.ads.zzawd) r1)
            goto L_0x0083
        L_0x0017:
            r0.mo12665h()
            goto L_0x0083
        L_0x001c:
            java.lang.String r1 = r2.readString()
            r0.mo12657a((java.lang.String) r1)
            goto L_0x0083
        L_0x0024:
            r0.mo12664g()
            goto L_0x0083
        L_0x0028:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.da r1 = com.google.android.gms.internal.ads.C1234db.m6710a(r1)
            java.lang.String r2 = r2.readString()
            r0.mo12652a((com.google.android.gms.internal.ads.C1233da) r1, (java.lang.String) r2)
            goto L_0x0083
        L_0x0038:
            java.lang.String r1 = r2.readString()
            java.lang.String r2 = r2.readString()
            r0.mo12658a((java.lang.String) r1, (java.lang.String) r2)
            goto L_0x0083
        L_0x0044:
            r0.mo12663f()
            goto L_0x0083
        L_0x0048:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0050
            r1 = 0
            goto L_0x0064
        L_0x0050:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C1446kx
            if (r4 == 0) goto L_0x005e
            r1 = r2
            com.google.android.gms.internal.ads.kx r1 = (com.google.android.gms.internal.ads.C1446kx) r1
            goto L_0x0064
        L_0x005e:
            com.google.android.gms.internal.ads.kz r2 = new com.google.android.gms.internal.ads.kz
            r2.<init>(r1)
            r1 = r2
        L_0x0064:
            r0.mo12655a((com.google.android.gms.internal.ads.C1446kx) r1)
            goto L_0x0083
        L_0x0068:
            r0.mo12662e()
            goto L_0x0083
        L_0x006c:
            r0.mo12661d()
            goto L_0x0083
        L_0x0070:
            r0.mo12660c()
            goto L_0x0083
        L_0x0074:
            int r1 = r2.readInt()
            r0.mo12651a((int) r1)
            goto L_0x0083
        L_0x007c:
            r0.mo12659b()
            goto L_0x0083
        L_0x0080:
            r0.mo12650a()
        L_0x0083:
            r3.writeNoException()
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1444kv.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
