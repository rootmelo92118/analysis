package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.kw */
public final class C1445kw extends azc implements C1443ku {
    C1445kw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    /* renamed from: a */
    public final void mo12650a() {
        mo11430b(1, mo11432z());
    }

    /* renamed from: b */
    public final void mo12659b() {
        mo11430b(2, mo11432z());
    }

    /* renamed from: a */
    public final void mo12651a(int i) {
        Parcel z = mo11432z();
        z.writeInt(i);
        mo11430b(3, z);
    }

    /* renamed from: c */
    public final void mo12660c() {
        mo11430b(4, mo11432z());
    }

    /* renamed from: d */
    public final void mo12661d() {
        mo11430b(5, mo11432z());
    }

    /* renamed from: e */
    public final void mo12662e() {
        mo11430b(6, mo11432z());
    }

    /* renamed from: a */
    public final void mo12655a(C1446kx kxVar) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) kxVar);
        mo11430b(7, z);
    }

    /* renamed from: f */
    public final void mo12663f() {
        mo11430b(8, mo11432z());
    }

    /* renamed from: a */
    public final void mo12658a(String str, String str2) {
        Parcel z = mo11432z();
        z.writeString(str);
        z.writeString(str2);
        mo11430b(9, z);
    }

    /* renamed from: a */
    public final void mo12652a(C1233da daVar, String str) {
        Parcel z = mo11432z();
        aze.m4502a(z, (IInterface) daVar);
        z.writeString(str);
        mo11430b(10, z);
    }

    /* renamed from: g */
    public final void mo12664g() {
        mo11430b(11, mo11432z());
    }

    /* renamed from: a */
    public final void mo12657a(String str) {
        Parcel z = mo11432z();
        z.writeString(str);
        mo11430b(12, z);
    }

    /* renamed from: h */
    public final void mo12665h() {
        mo11430b(13, mo11432z());
    }

    /* renamed from: a */
    public final void mo12656a(zzawd zzawd) {
        Parcel z = mo11432z();
        aze.m4503a(z, (Parcelable) zzawd);
        mo11430b(14, z);
    }

    /* renamed from: i */
    public final void mo12666i() {
        mo11430b(15, mo11432z());
    }
}
