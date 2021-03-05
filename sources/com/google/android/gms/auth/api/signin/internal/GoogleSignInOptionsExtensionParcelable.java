package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;

public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new C0733c();

    /* renamed from: a */
    private final int f705a;

    /* renamed from: b */
    private int f706b;

    /* renamed from: c */
    private Bundle f707c;

    GoogleSignInOptionsExtensionParcelable(int i, int i2, Bundle bundle) {
        this.f705a = i;
        this.f706b = i2;
        this.f707c = bundle;
    }

    /* renamed from: a */
    public int mo9459a() {
        return this.f706b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, this.f705a);
        C0932b.m1367a(parcel, 2, mo9459a());
        C0932b.m1369a(parcel, 3, this.f707c, false);
        C0932b.m1365a(parcel, a);
    }
}
