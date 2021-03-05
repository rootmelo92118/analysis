package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

public final class zzki implements Parcelable {
    public static final Parcelable.Creator<zzki> CREATOR = new bes();

    /* renamed from: a */
    private final zza[] f7239a;

    public interface zza extends Parcelable {
    }

    public zzki(List<? extends zza> list) {
        this.f7239a = new zza[list.size()];
        list.toArray(this.f7239a);
    }

    public final int describeContents() {
        return 0;
    }

    zzki(Parcel parcel) {
        this.f7239a = new zza[parcel.readInt()];
        for (int i = 0; i < this.f7239a.length; i++) {
            this.f7239a[i] = (zza) parcel.readParcelable(zza.class.getClassLoader());
        }
    }

    /* renamed from: a */
    public final int mo13427a() {
        return this.f7239a.length;
    }

    /* renamed from: a */
    public final zza mo13428a(int i) {
        return this.f7239a[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f7239a, ((zzki) obj).f7239a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7239a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7239a.length);
        for (zza writeParcelable : this.f7239a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
