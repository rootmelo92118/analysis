package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

public final class zzkm extends zzkp {
    public static final Parcelable.Creator<zzkm> CREATOR = new beu();

    /* renamed from: a */
    public final String f7244a;

    /* renamed from: b */
    public final String f7245b;

    /* renamed from: d */
    private final String f7246d;

    public zzkm(String str, String str2, String str3) {
        super("COMM");
        this.f7246d = str;
        this.f7244a = str2;
        this.f7245b = str3;
    }

    zzkm(Parcel parcel) {
        super("COMM");
        this.f7246d = parcel.readString();
        this.f7244a = parcel.readString();
        this.f7245b = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzkm zzkm = (zzkm) obj;
        return bkp.m5820a((Object) this.f7244a, (Object) zzkm.f7244a) && bkp.m5820a((Object) this.f7246d, (Object) zzkm.f7246d) && bkp.m5820a((Object) this.f7245b, (Object) zzkm.f7245b);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((this.f7246d != null ? this.f7246d.hashCode() : 0) + 527) * 31) + (this.f7244a != null ? this.f7244a.hashCode() : 0)) * 31;
        if (this.f7245b != null) {
            i = this.f7245b.hashCode();
        }
        return hashCode + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7247c);
        parcel.writeString(this.f7246d);
        parcel.writeString(this.f7245b);
    }
}
