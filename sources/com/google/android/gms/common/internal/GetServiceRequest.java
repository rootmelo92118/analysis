package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C0851d;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C0914j;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;

public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new C0876ag();

    /* renamed from: a */
    String f1019a;

    /* renamed from: b */
    IBinder f1020b;

    /* renamed from: c */
    Scope[] f1021c;

    /* renamed from: d */
    Bundle f1022d;

    /* renamed from: e */
    Account f1023e;

    /* renamed from: f */
    Feature[] f1024f;

    /* renamed from: g */
    Feature[] f1025g;

    /* renamed from: h */
    private final int f1026h;

    /* renamed from: i */
    private final int f1027i;

    /* renamed from: j */
    private int f1028j;

    /* renamed from: k */
    private boolean f1029k;

    public GetServiceRequest(int i) {
        this.f1026h = 4;
        this.f1028j = C0851d.f948b;
        this.f1027i = i;
        this.f1029k = true;
    }

    GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z) {
        this.f1026h = i;
        this.f1027i = i2;
        this.f1028j = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f1019a = "com.google.android.gms";
        } else {
            this.f1019a = str;
        }
        if (i < 2) {
            this.f1023e = iBinder != null ? C0869a.m1181a(C0914j.C0915a.m1291a(iBinder)) : null;
        } else {
            this.f1020b = iBinder;
            this.f1023e = account;
        }
        this.f1021c = scopeArr;
        this.f1022d = bundle;
        this.f1024f = featureArr;
        this.f1025g = featureArr2;
        this.f1029k = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, this.f1026h);
        C0932b.m1367a(parcel, 2, this.f1027i);
        C0932b.m1367a(parcel, 3, this.f1028j);
        C0932b.m1377a(parcel, 4, this.f1019a, false);
        C0932b.m1370a(parcel, 5, this.f1020b, false);
        C0932b.m1381a(parcel, 6, (T[]) this.f1021c, i, false);
        C0932b.m1369a(parcel, 7, this.f1022d, false);
        C0932b.m1372a(parcel, 8, (Parcelable) this.f1023e, i, false);
        C0932b.m1381a(parcel, 10, (T[]) this.f1024f, i, false);
        C0932b.m1381a(parcel, 11, (T[]) this.f1025g, i, false);
        C0932b.m1379a(parcel, 12, this.f1029k);
        C0932b.m1365a(parcel, a);
    }
}
