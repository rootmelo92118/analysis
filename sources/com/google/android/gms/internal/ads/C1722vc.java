package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.p039a.C0719a;

/* renamed from: com.google.android.gms.internal.ads.vc */
public final class C1722vc extends azc implements C1718uz {
    C1722vc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    /* renamed from: a */
    public final void mo13029a(C0719a aVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        mo11430b(1, z);
    }

    /* renamed from: a */
    public final void mo13030a(C0719a aVar, int i) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        z.writeInt(i);
        mo11430b(2, z);
    }

    /* renamed from: b */
    public final void mo13035b(C0719a aVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        mo11430b(3, z);
    }

    /* renamed from: c */
    public final void mo13037c(C0719a aVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        mo11430b(4, z);
    }

    /* renamed from: d */
    public final void mo13038d(C0719a aVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        mo11430b(5, z);
    }

    /* renamed from: e */
    public final void mo13039e(C0719a aVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        mo11430b(6, z);
    }

    /* renamed from: a */
    public final void mo13031a(C0719a aVar, zzawd zzawd) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        aze.m4503a(z, (Parcelable) zzawd);
        mo11430b(7, z);
    }

    /* renamed from: f */
    public final void mo13040f(C0719a aVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        mo11430b(8, z);
    }

    /* renamed from: b */
    public final void mo13036b(C0719a aVar, int i) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        z.writeInt(i);
        mo11430b(9, z);
    }

    /* renamed from: g */
    public final void mo13041g(C0719a aVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        mo11430b(10, z);
    }

    /* renamed from: h */
    public final void mo13042h(C0719a aVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) aVar);
        mo11430b(11, z);
    }

    /* renamed from: a */
    public final void mo13028a(Bundle bundle) {
        Parcel z = mo11432z();
        aze.m4503a(z, (Parcelable) bundle);
        mo11430b(12, z);
    }
}
