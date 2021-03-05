package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;

public class SignInButtonConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInButtonConfig> CREATOR = new C0873ad();

    /* renamed from: a */
    private final int f1039a;

    /* renamed from: b */
    private final int f1040b;

    /* renamed from: c */
    private final int f1041c;
    @Deprecated

    /* renamed from: d */
    private final Scope[] f1042d;

    SignInButtonConfig(int i, int i2, int i3, Scope[] scopeArr) {
        this.f1039a = i;
        this.f1040b = i2;
        this.f1041c = i3;
        this.f1042d = scopeArr;
    }

    public SignInButtonConfig(int i, int i2, Scope[] scopeArr) {
        this(1, i, i2, (Scope[]) null);
    }

    /* renamed from: a */
    public int mo9782a() {
        return this.f1040b;
    }

    /* renamed from: b */
    public int mo9783b() {
        return this.f1041c;
    }

    @Deprecated
    /* renamed from: c */
    public Scope[] mo9784c() {
        return this.f1042d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, this.f1039a);
        C0932b.m1367a(parcel, 2, mo9782a());
        C0932b.m1367a(parcel, 3, mo9783b());
        C0932b.m1381a(parcel, 4, (T[]) mo9784c(), i, false);
        C0932b.m1365a(parcel, a);
    }
}
