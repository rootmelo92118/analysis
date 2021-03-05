package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;
import java.util.Map;

@C1598qn
public final class zzafl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzafl> CREATOR = new C1277eq();

    /* renamed from: a */
    private final String f6979a;

    /* renamed from: b */
    private final String[] f6980b;

    /* renamed from: c */
    private final String[] f6981c;

    zzafl(String str, String[] strArr, String[] strArr2) {
        this.f6979a = str;
        this.f6980b = strArr;
        this.f6981c = strArr2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1377a(parcel, 1, this.f6979a, false);
        C0932b.m1382a(parcel, 2, this.f6980b, false);
        C0932b.m1382a(parcel, 3, this.f6981c, false);
        C0932b.m1365a(parcel, a);
    }

    /* renamed from: a */
    public static zzafl m8607a(blj blj) {
        Map<String, String> b = blj.mo12116b();
        int size = b.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Map.Entry next : b.entrySet()) {
            strArr[i] = (String) next.getKey();
            strArr2[i] = (String) next.getValue();
            i++;
        }
        return new zzafl(blj.mo12122e(), strArr, strArr2);
    }
}
