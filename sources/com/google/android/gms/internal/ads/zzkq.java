package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

public final class zzkq extends zzkp {
    public static final Parcelable.Creator<zzkq> CREATOR = new bew();

    /* renamed from: a */
    private final String f7248a;

    /* renamed from: b */
    private final String f7249b;

    public zzkq(String str, String str2, String str3) {
        super(str);
        this.f7248a = null;
        this.f7249b = str3;
    }

    zzkq(Parcel parcel) {
        super(parcel.readString());
        this.f7248a = parcel.readString();
        this.f7249b = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzkq zzkq = (zzkq) obj;
        return this.f7247c.equals(zzkq.f7247c) && bkp.m5820a((Object) this.f7248a, (Object) zzkq.f7248a) && bkp.m5820a((Object) this.f7249b, (Object) zzkq.f7249b);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((this.f7247c.hashCode() + 527) * 31) + (this.f7248a != null ? this.f7248a.hashCode() : 0)) * 31;
        if (this.f7249b != null) {
            i = this.f7249b.hashCode();
        }
        return hashCode + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7247c);
        parcel.writeString(this.f7248a);
        parcel.writeString(this.f7249b);
    }
}
