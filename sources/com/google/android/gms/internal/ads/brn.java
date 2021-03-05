package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class brn extends azc implements brl {
    brn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    /* renamed from: a */
    public final void mo12296a() {
        mo11430b(1, mo11432z());
    }

    /* renamed from: a */
    public final void mo12297a(int i) {
        Parcel z = mo11432z();
        z.writeInt(i);
        mo11430b(2, z);
    }

    /* renamed from: b */
    public final void mo12298b() {
        mo11430b(3, mo11432z());
    }

    /* renamed from: c */
    public final void mo12299c() {
        mo11430b(4, mo11432z());
    }

    /* renamed from: d */
    public final void mo12300d() {
        mo11430b(5, mo11432z());
    }

    /* renamed from: f */
    public final void mo12302f() {
        mo11430b(6, mo11432z());
    }

    /* renamed from: e */
    public final void mo12301e() {
        mo11430b(7, mo11432z());
    }
}
