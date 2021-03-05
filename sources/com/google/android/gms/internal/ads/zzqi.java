package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class zzqi implements Parcelable {
    public static final Parcelable.Creator<zzqi> CREATOR = new bkt();

    /* renamed from: a */
    public final int f7250a;

    /* renamed from: b */
    public final int f7251b;

    /* renamed from: c */
    public final int f7252c;

    /* renamed from: d */
    public final byte[] f7253d;

    /* renamed from: e */
    private int f7254e;

    public zzqi(int i, int i2, int i3, byte[] bArr) {
        this.f7250a = i;
        this.f7251b = i2;
        this.f7252c = i3;
        this.f7253d = bArr;
    }

    public final int describeContents() {
        return 0;
    }

    zzqi(Parcel parcel) {
        this.f7250a = parcel.readInt();
        this.f7251b = parcel.readInt();
        this.f7252c = parcel.readInt();
        this.f7253d = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzqi zzqi = (zzqi) obj;
        return this.f7250a == zzqi.f7250a && this.f7251b == zzqi.f7251b && this.f7252c == zzqi.f7252c && Arrays.equals(this.f7253d, zzqi.f7253d);
    }

    public final String toString() {
        int i = this.f7250a;
        int i2 = this.f7251b;
        int i3 = this.f7252c;
        boolean z = this.f7253d != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        if (this.f7254e == 0) {
            this.f7254e = ((((((this.f7250a + 527) * 31) + this.f7251b) * 31) + this.f7252c) * 31) + Arrays.hashCode(this.f7253d);
        }
        return this.f7254e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7250a);
        parcel.writeInt(this.f7251b);
        parcel.writeInt(this.f7252c);
        parcel.writeInt(this.f7253d != null ? 1 : 0);
        if (this.f7253d != null) {
            parcel.writeByteArray(this.f7253d);
        }
    }
}
