package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class btd extends azc implements btb {
    btd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    /* renamed from: a */
    public final void mo10461a() {
        mo11430b(1, mo11432z());
    }

    /* renamed from: b */
    public final void mo10470b() {
        mo11430b(2, mo11432z());
    }

    /* renamed from: a */
    public final void mo10468a(boolean z) {
        Parcel z2 = mo11432z();
        aze.m4504a(z2, z);
        mo11430b(3, z2);
    }

    /* renamed from: c */
    public final boolean mo10471c() {
        Parcel a = mo11428a(4, mo11432z());
        boolean a2 = aze.m4505a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: d */
    public final int mo10472d() {
        Parcel a = mo11428a(5, mo11432z());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: e */
    public final float mo10473e() {
        Parcel a = mo11428a(6, mo11432z());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    /* renamed from: f */
    public final float mo10474f() {
        Parcel a = mo11428a(7, mo11432z());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    /* renamed from: a */
    public final void mo10465a(bte bte) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) bte);
        mo11430b(8, z);
    }

    /* renamed from: h */
    public final float mo10476h() {
        Parcel a = mo11428a(9, mo11432z());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    /* renamed from: i */
    public final boolean mo10477i() {
        Parcel a = mo11428a(10, mo11432z());
        boolean a2 = aze.m4505a(a);
        a.recycle();
        return a2;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.bte mo10475g() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo11432z()
            r1 = 11
            android.os.Parcel r0 = r4.mo11428a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.bte
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.bte r1 = (com.google.android.gms.internal.ads.bte) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.btg r2 = new com.google.android.gms.internal.ads.btg
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.btd.mo10475g():com.google.android.gms.internal.ads.bte");
    }

    /* renamed from: j */
    public final boolean mo10478j() {
        Parcel a = mo11428a(12, mo11432z());
        boolean a2 = aze.m4505a(a);
        a.recycle();
        return a2;
    }
}
