package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;

public class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new C0934u();

    /* renamed from: a */
    private final int f1013a;
    @Nullable

    /* renamed from: b */
    private final String f1014b;

    public ClientIdentity(int i, @Nullable String str) {
        this.f1013a = i;
        this.f1014b = str;
    }

    public int hashCode() {
        return this.f1013a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.f1013a == this.f1013a && C0924o.m1303a(clientIdentity.f1014b, this.f1014b);
    }

    public String toString() {
        int i = this.f1013a;
        String str = this.f1014b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, this.f1013a);
        C0932b.m1377a(parcel, 2, this.f1014b, false);
        C0932b.m1365a(parcel, a);
    }
}
