package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ue */
public final class C1697ue extends azc implements C1695uc {
    C1697ue(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    /* renamed from: a */
    public final void mo12540a() {
        mo11430b(1, mo11432z());
    }

    /* renamed from: b */
    public final void mo12543b() {
        mo11430b(2, mo11432z());
    }

    /* renamed from: c */
    public final void mo12544c() {
        mo11430b(3, mo11432z());
    }

    /* renamed from: d */
    public final void mo12545d() {
        mo11430b(4, mo11432z());
    }

    /* renamed from: a */
    public final void mo12542a(C1683tr trVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) trVar);
        mo11430b(5, z);
    }

    /* renamed from: e */
    public final void mo12546e() {
        mo11430b(6, mo11432z());
    }

    /* renamed from: a */
    public final void mo12541a(int i) {
        Parcel z = mo11432z();
        z.writeInt(i);
        mo11430b(7, z);
    }

    /* renamed from: f */
    public final void mo12547f() {
        mo11430b(8, mo11432z());
    }
}
