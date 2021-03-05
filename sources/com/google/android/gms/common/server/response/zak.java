package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new C0956c();

    /* renamed from: a */
    private final int f1174a;

    /* renamed from: b */
    private final HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> f1175b;

    /* renamed from: c */
    private final ArrayList<zal> f1176c = null;

    /* renamed from: d */
    private final String f1177d;

    zak(int i, ArrayList<zal> arrayList, String str) {
        this.f1174a = i;
        HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> hashMap = new HashMap<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zal = arrayList.get(i2);
            String str2 = zal.f1178a;
            HashMap hashMap2 = new HashMap();
            int size2 = zal.f1179b.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zam = zal.f1179b.get(i3);
                hashMap2.put(zam.f1181a, zam.f1182b);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f1175b = hashMap;
        this.f1177d = (String) C0926p.m1306a(str);
        mo9975a();
    }

    /* renamed from: a */
    public final void mo9975a() {
        for (String str : this.f1175b.keySet()) {
            Map map = this.f1175b.get(str);
            for (String str2 : map.keySet()) {
                ((FastJsonResponse.Field) map.get(str2)).mo9955a(this);
            }
        }
    }

    /* renamed from: a */
    public final Map<String, FastJsonResponse.Field<?, ?>> mo9974a(String str) {
        return this.f1175b.get(str);
    }

    /* renamed from: b */
    public final String mo9976b() {
        return this.f1177d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String next : this.f1175b.keySet()) {
            sb.append(next);
            sb.append(":\n");
            Map map = this.f1175b.get(next);
            for (String str : map.keySet()) {
                sb.append("  ");
                sb.append(str);
                sb.append(": ");
                sb.append(map.get(str));
            }
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, this.f1174a);
        ArrayList arrayList = new ArrayList();
        for (String next : this.f1175b.keySet()) {
            arrayList.add(new zal(next, this.f1175b.get(next)));
        }
        C0932b.m1388c(parcel, 2, arrayList, false);
        C0932b.m1377a(parcel, 3, this.f1177d, false);
        C0932b.m1365a(parcel, a);
    }
}
