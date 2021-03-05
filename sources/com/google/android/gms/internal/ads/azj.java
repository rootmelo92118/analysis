package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p039a.C0719a;

public final class azj extends azc implements azh {
    azj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    /* renamed from: a */
    public final void mo11439a(C0719a aVar, String str) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        z.writeString(str);
        mo11430b(2, z);
    }

    /* renamed from: a */
    public final void mo11437a() {
        mo11430b(3, mo11432z());
    }

    /* renamed from: a */
    public final void mo11442a(int[] iArr) {
        Parcel z = mo11432z();
        z.writeIntArray((int[]) null);
        mo11430b(4, z);
    }

    /* renamed from: a */
    public final void mo11441a(byte[] bArr) {
        Parcel z = mo11432z();
        z.writeByteArray(bArr);
        mo11430b(5, z);
    }

    /* renamed from: a */
    public final void mo11438a(int i) {
        Parcel z = mo11432z();
        z.writeInt(i);
        mo11430b(6, z);
    }

    /* renamed from: b */
    public final void mo11443b(int i) {
        Parcel z = mo11432z();
        z.writeInt(i);
        mo11430b(7, z);
    }

    /* renamed from: a */
    public final void mo11440a(C0719a aVar, String str, String str2) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        z.writeString(str);
        z.writeString((String) null);
        mo11430b(8, z);
    }
}
