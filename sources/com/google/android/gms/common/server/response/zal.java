package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.Map;

public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new C0957d();

    /* renamed from: a */
    final String f1178a;

    /* renamed from: b */
    final ArrayList<zam> f1179b;

    /* renamed from: c */
    private final int f1180c;

    zal(int i, String str, ArrayList<zam> arrayList) {
        this.f1180c = i;
        this.f1178a = str;
        this.f1179b = arrayList;
    }

    zal(String str, Map<String, FastJsonResponse.Field<?, ?>> map) {
        ArrayList<zam> arrayList;
        this.f1180c = 1;
        this.f1178a = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<>();
            for (String next : map.keySet()) {
                arrayList.add(new zam(next, map.get(next)));
            }
        }
        this.f1179b = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, this.f1180c);
        C0932b.m1377a(parcel, 2, this.f1178a, false);
        C0932b.m1388c(parcel, 3, this.f1179b, false);
        C0932b.m1365a(parcel, a);
    }
}
