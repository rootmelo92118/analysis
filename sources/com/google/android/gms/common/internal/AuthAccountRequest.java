package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;

public class AuthAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthAccountRequest> CREATOR = new C0933t();

    /* renamed from: a */
    private final int f1006a;
    @Deprecated

    /* renamed from: b */
    private final IBinder f1007b;

    /* renamed from: c */
    private final Scope[] f1008c;

    /* renamed from: d */
    private Integer f1009d;

    /* renamed from: e */
    private Integer f1010e;

    /* renamed from: f */
    private Account f1011f;

    AuthAccountRequest(int i, IBinder iBinder, Scope[] scopeArr, Integer num, Integer num2, Account account) {
        this.f1006a = i;
        this.f1007b = iBinder;
        this.f1008c = scopeArr;
        this.f1009d = num;
        this.f1010e = num2;
        this.f1011f = account;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, this.f1006a);
        C0932b.m1370a(parcel, 2, this.f1007b, false);
        C0932b.m1381a(parcel, 3, (T[]) this.f1008c, i, false);
        C0932b.m1375a(parcel, 4, this.f1009d, false);
        C0932b.m1375a(parcel, 5, this.f1010e, false);
        C0932b.m1372a(parcel, 6, (Parcelable) this.f1011f, i, false);
        C0932b.m1365a(parcel, a);
    }
}
