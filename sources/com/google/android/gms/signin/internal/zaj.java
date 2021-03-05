package com.google.android.gms.signin.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;

public final class zaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaj> CREATOR = new C2318i();

    /* renamed from: a */
    private final int f8716a;

    /* renamed from: b */
    private final ConnectionResult f8717b;

    /* renamed from: c */
    private final ResolveAccountResponse f8718c;

    zaj(int i, ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this.f8716a = i;
        this.f8717b = connectionResult;
        this.f8718c = resolveAccountResponse;
    }

    public zaj(int i) {
        this(new ConnectionResult(8, (PendingIntent) null), (ResolveAccountResponse) null);
    }

    private zaj(ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this(1, connectionResult, (ResolveAccountResponse) null);
    }

    /* renamed from: a */
    public final ConnectionResult mo14887a() {
        return this.f8717b;
    }

    /* renamed from: b */
    public final ResolveAccountResponse mo14888b() {
        return this.f8718c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, this.f8716a);
        C0932b.m1372a(parcel, 2, (Parcelable) this.f8717b, i, false);
        C0932b.m1372a(parcel, 3, (Parcelable) this.f8718c, i, false);
        C0932b.m1365a(parcel, a);
    }
}
