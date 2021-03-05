package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;

public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new C2271es();

    /* renamed from: a */
    public String f8679a;

    /* renamed from: b */
    public String f8680b;

    /* renamed from: c */
    public zzfv f8681c;

    /* renamed from: d */
    public long f8682d;

    /* renamed from: e */
    public boolean f8683e;

    /* renamed from: f */
    public String f8684f;

    /* renamed from: g */
    public zzag f8685g;

    /* renamed from: h */
    public long f8686h;

    /* renamed from: i */
    public zzag f8687i;

    /* renamed from: j */
    public long f8688j;

    /* renamed from: k */
    public zzag f8689k;

    zzo(zzo zzo) {
        C0926p.m1306a(zzo);
        this.f8679a = zzo.f8679a;
        this.f8680b = zzo.f8680b;
        this.f8681c = zzo.f8681c;
        this.f8682d = zzo.f8682d;
        this.f8683e = zzo.f8683e;
        this.f8684f = zzo.f8684f;
        this.f8685g = zzo.f8685g;
        this.f8686h = zzo.f8686h;
        this.f8687i = zzo.f8687i;
        this.f8688j = zzo.f8688j;
        this.f8689k = zzo.f8689k;
    }

    zzo(String str, String str2, zzfv zzfv, long j, boolean z, String str3, zzag zzag, long j2, zzag zzag2, long j3, zzag zzag3) {
        this.f8679a = str;
        this.f8680b = str2;
        this.f8681c = zzfv;
        this.f8682d = j;
        this.f8683e = z;
        this.f8684f = str3;
        this.f8685g = zzag;
        this.f8686h = j2;
        this.f8687i = zzag2;
        this.f8688j = j3;
        this.f8689k = zzag3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1377a(parcel, 2, this.f8679a, false);
        C0932b.m1377a(parcel, 3, this.f8680b, false);
        C0932b.m1372a(parcel, 4, (Parcelable) this.f8681c, i, false);
        C0932b.m1368a(parcel, 5, this.f8682d);
        C0932b.m1379a(parcel, 6, this.f8683e);
        C0932b.m1377a(parcel, 7, this.f8684f, false);
        C0932b.m1372a(parcel, 8, (Parcelable) this.f8685g, i, false);
        C0932b.m1368a(parcel, 9, this.f8686h);
        C0932b.m1372a(parcel, 10, (Parcelable) this.f8687i, i, false);
        C0932b.m1368a(parcel, 11, this.f8688j);
        C0932b.m1372a(parcel, 12, (Parcelable) this.f8689k, i, false);
        C0932b.m1365a(parcel, a);
    }
}
