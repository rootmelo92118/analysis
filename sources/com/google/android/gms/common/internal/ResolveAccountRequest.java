package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;

public class ResolveAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResolveAccountRequest> CREATOR = new C0871ab();

    /* renamed from: a */
    private final int f1030a;

    /* renamed from: b */
    private final Account f1031b;

    /* renamed from: c */
    private final int f1032c;

    /* renamed from: d */
    private final GoogleSignInAccount f1033d;

    ResolveAccountRequest(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f1030a = i;
        this.f1031b = account;
        this.f1032c = i2;
        this.f1033d = googleSignInAccount;
    }

    public ResolveAccountRequest(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    /* renamed from: a */
    public Account mo9772a() {
        return this.f1031b;
    }

    /* renamed from: b */
    public int mo9773b() {
        return this.f1032c;
    }

    @Nullable
    /* renamed from: c */
    public GoogleSignInAccount mo9774c() {
        return this.f1033d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, this.f1030a);
        C0932b.m1372a(parcel, 2, (Parcelable) mo9772a(), i, false);
        C0932b.m1367a(parcel, 3, mo9773b());
        C0932b.m1372a(parcel, 4, (Parcelable) mo9774c(), i, false);
        C0932b.m1365a(parcel, a);
    }
}
