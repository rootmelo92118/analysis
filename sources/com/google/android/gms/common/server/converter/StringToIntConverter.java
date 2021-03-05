package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;

public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.C0953a<String, Integer> {
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new C0951b();

    /* renamed from: a */
    private final int f1147a;

    /* renamed from: b */
    private final HashMap<String, Integer> f1148b;

    /* renamed from: c */
    private final SparseArray<String> f1149c;

    /* renamed from: d */
    private final ArrayList<zaa> f1150d;

    StringToIntConverter(int i, ArrayList<zaa> arrayList) {
        this.f1147a = i;
        this.f1148b = new HashMap<>();
        this.f1149c = new SparseArray<>();
        this.f1150d = null;
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            zaa zaa2 = (zaa) obj;
            mo9935a(zaa2.f1151a, zaa2.f1152b);
        }
    }

    public static final class zaa extends AbstractSafeParcelable {
        public static final Parcelable.Creator<zaa> CREATOR = new C0952c();

        /* renamed from: a */
        final String f1151a;

        /* renamed from: b */
        final int f1152b;

        /* renamed from: c */
        private final int f1153c;

        zaa(int i, String str, int i2) {
            this.f1153c = i;
            this.f1151a = str;
            this.f1152b = i2;
        }

        zaa(String str, int i) {
            this.f1153c = 1;
            this.f1151a = str;
            this.f1152b = i;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C0932b.m1364a(parcel);
            C0932b.m1367a(parcel, 1, this.f1153c);
            C0932b.m1377a(parcel, 2, this.f1151a, false);
            C0932b.m1367a(parcel, 3, this.f1152b);
            C0932b.m1365a(parcel, a);
        }
    }

    public StringToIntConverter() {
        this.f1147a = 1;
        this.f1148b = new HashMap<>();
        this.f1149c = new SparseArray<>();
        this.f1150d = null;
    }

    /* renamed from: a */
    public final StringToIntConverter mo9935a(String str, int i) {
        this.f1148b.put(str, Integer.valueOf(i));
        this.f1149c.put(i, str);
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, this.f1147a);
        ArrayList arrayList = new ArrayList();
        for (String next : this.f1148b.keySet()) {
            arrayList.add(new zaa(next, this.f1148b.get(next).intValue()));
        }
        C0932b.m1388c(parcel, 2, arrayList, false);
        C0932b.m1365a(parcel, a);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9936a(Object obj) {
        String str = this.f1149c.get(((Integer) obj).intValue());
        return (str != null || !this.f1148b.containsKey("gms_unknown")) ? str : "gms_unknown";
    }
}
