package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C0914j;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;

public class ResolveAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResolveAccountResponse> CREATOR = new C0872ac();

    /* renamed from: a */
    private final int f1034a;

    /* renamed from: b */
    private IBinder f1035b;

    /* renamed from: c */
    private ConnectionResult f1036c;

    /* renamed from: d */
    private boolean f1037d;

    /* renamed from: e */
    private boolean f1038e;

    ResolveAccountResponse(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f1034a = i;
        this.f1035b = iBinder;
        this.f1036c = connectionResult;
        this.f1037d = z;
        this.f1038e = z2;
    }

    /* renamed from: a */
    public C0914j mo9776a() {
        return C0914j.C0915a.m1291a(this.f1035b);
    }

    /* renamed from: b */
    public ConnectionResult mo9777b() {
        return this.f1036c;
    }

    /* renamed from: c */
    public boolean mo9778c() {
        return this.f1037d;
    }

    /* renamed from: d */
    public boolean mo9779d() {
        return this.f1038e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, this.f1034a);
        C0932b.m1370a(parcel, 2, this.f1035b, false);
        C0932b.m1372a(parcel, 3, (Parcelable) mo9777b(), i, false);
        C0932b.m1379a(parcel, 4, mo9778c());
        C0932b.m1379a(parcel, 5, mo9779d());
        C0932b.m1365a(parcel, a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolveAccountResponse)) {
            return false;
        }
        ResolveAccountResponse resolveAccountResponse = (ResolveAccountResponse) obj;
        return this.f1036c.equals(resolveAccountResponse.f1036c) && mo9776a().equals(resolveAccountResponse.mo9776a());
    }
}
