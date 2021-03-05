package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class btc extends azd implements btb {
    public btc() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    /* renamed from: a */
    public static btb m6391a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        if (queryLocalInterface instanceof btb) {
            return (btb) queryLocalInterface;
        }
        return new btd(iBinder);
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
                case 1: goto L_0x0096;
                case 2: goto L_0x008f;
                case 3: goto L_0x0084;
                case 4: goto L_0x0079;
                case 5: goto L_0x006e;
                case 6: goto L_0x0063;
                case 7: goto L_0x0058;
                case 8: goto L_0x0035;
                case 9: goto L_0x0029;
                case 10: goto L_0x001d;
                case 11: goto L_0x0011;
                case 12: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            boolean r1 = r0.mo10478j()
            r3.writeNoException()
            com.google.android.gms.internal.ads.aze.m4504a((android.os.Parcel) r3, (boolean) r1)
            goto L_0x009c
        L_0x0011:
            com.google.android.gms.internal.ads.bte r1 = r0.mo10475g()
            r3.writeNoException()
            com.google.android.gms.internal.ads.aze.m4502a((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x009c
        L_0x001d:
            boolean r1 = r0.mo10477i()
            r3.writeNoException()
            com.google.android.gms.internal.ads.aze.m4504a((android.os.Parcel) r3, (boolean) r1)
            goto L_0x009c
        L_0x0029:
            float r1 = r0.mo10476h()
            r3.writeNoException()
            r3.writeFloat(r1)
            goto L_0x009c
        L_0x0035:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x003d
            r1 = 0
            goto L_0x0051
        L_0x003d:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.bte
            if (r4 == 0) goto L_0x004b
            r1 = r2
            com.google.android.gms.internal.ads.bte r1 = (com.google.android.gms.internal.ads.bte) r1
            goto L_0x0051
        L_0x004b:
            com.google.android.gms.internal.ads.btg r2 = new com.google.android.gms.internal.ads.btg
            r2.<init>(r1)
            r1 = r2
        L_0x0051:
            r0.mo10465a((com.google.android.gms.internal.ads.bte) r1)
            r3.writeNoException()
            goto L_0x009c
        L_0x0058:
            float r1 = r0.mo10474f()
            r3.writeNoException()
            r3.writeFloat(r1)
            goto L_0x009c
        L_0x0063:
            float r1 = r0.mo10473e()
            r3.writeNoException()
            r3.writeFloat(r1)
            goto L_0x009c
        L_0x006e:
            int r1 = r0.mo10472d()
            r3.writeNoException()
            r3.writeInt(r1)
            goto L_0x009c
        L_0x0079:
            boolean r1 = r0.mo10471c()
            r3.writeNoException()
            com.google.android.gms.internal.ads.aze.m4504a((android.os.Parcel) r3, (boolean) r1)
            goto L_0x009c
        L_0x0084:
            boolean r1 = com.google.android.gms.internal.ads.aze.m4505a(r2)
            r0.mo10468a((boolean) r1)
            r3.writeNoException()
            goto L_0x009c
        L_0x008f:
            r0.mo10470b()
            r3.writeNoException()
            goto L_0x009c
        L_0x0096:
            r0.mo10461a()
            r3.writeNoException()
        L_0x009c:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.btc.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
