package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class zzkk extends zzkp {
    public static final Parcelable.Creator<zzkk> CREATOR = new bet();

    /* renamed from: a */
    private final String f7240a;

    /* renamed from: b */
    private final String f7241b;

    /* renamed from: d */
    private final int f7242d;

    /* renamed from: e */
    private final byte[] f7243e;

    public zzkk(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f7240a = str;
        this.f7241b = null;
        this.f7242d = 3;
        this.f7243e = bArr;
    }

    zzkk(Parcel parcel) {
        super("APIC");
        this.f7240a = parcel.readString();
        this.f7241b = parcel.readString();
        this.f7242d = parcel.readInt();
        this.f7243e = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzkk zzkk = (zzkk) obj;
        return this.f7242d == zzkk.f7242d && bkp.m5820a((Object) this.f7240a, (Object) zzkk.f7240a) && bkp.m5820a((Object) this.f7241b, (Object) zzkk.f7241b) && Arrays.equals(this.f7243e, zzkk.f7243e);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((this.f7242d + 527) * 31) + (this.f7240a != null ? this.f7240a.hashCode() : 0)) * 31;
        if (this.f7241b != null) {
            i = this.f7241b.hashCode();
        }
        return ((hashCode + i) * 31) + Arrays.hashCode(this.f7243e);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7240a);
        parcel.writeString(this.f7241b);
        parcel.writeInt(this.f7242d);
        parcel.writeByteArray(this.f7243e);
    }
}
