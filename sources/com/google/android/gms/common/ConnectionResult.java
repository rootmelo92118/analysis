package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C0924o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C0932b;

public final class ConnectionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new C0940j();

    /* renamed from: a */
    public static final ConnectionResult f759a = new ConnectionResult(0);

    /* renamed from: b */
    private final int f760b;

    /* renamed from: c */
    private final int f761c;

    /* renamed from: d */
    private final PendingIntent f762d;

    /* renamed from: e */
    private final String f763e;

    ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f760b = i;
        this.f761c = i2;
        this.f762d = pendingIntent;
        this.f763e = str;
    }

    public ConnectionResult(int i) {
        this(i, (PendingIntent) null, (String) null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, (String) null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    /* renamed from: a */
    public final boolean mo9508a() {
        return (this.f761c == 0 || this.f762d == null) ? false : true;
    }

    /* renamed from: b */
    public final boolean mo9509b() {
        return this.f761c == 0;
    }

    /* renamed from: c */
    public final int mo9510c() {
        return this.f761c;
    }

    @Nullable
    /* renamed from: d */
    public final PendingIntent mo9511d() {
        return this.f762d;
    }

    @Nullable
    /* renamed from: e */
    public final String mo9512e() {
        return this.f763e;
    }

    /* renamed from: a */
    static String m883a(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f761c == connectionResult.f761c && C0924o.m1303a(this.f762d, connectionResult.f762d) && C0924o.m1303a(this.f763e, connectionResult.f763e);
    }

    public final int hashCode() {
        return C0924o.m1301a(Integer.valueOf(this.f761c), this.f762d, this.f763e);
    }

    public final String toString() {
        return C0924o.m1302a((Object) this).mo9911a("statusCode", m883a(this.f761c)).mo9911a("resolution", this.f762d).mo9911a("message", this.f763e).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C0932b.m1364a(parcel);
        C0932b.m1367a(parcel, 1, this.f760b);
        C0932b.m1367a(parcel, 2, mo9510c());
        C0932b.m1372a(parcel, 3, (Parcelable) mo9511d(), i, false);
        C0932b.m1377a(parcel, 4, mo9512e(), false);
        C0932b.m1365a(parcel, a);
    }
}
