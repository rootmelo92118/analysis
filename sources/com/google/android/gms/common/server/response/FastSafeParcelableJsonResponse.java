package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    /* renamed from: a */
    public Object mo9947a(String str) {
        return null;
    }

    /* renamed from: b */
    public boolean mo9951b(String str) {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public int hashCode() {
        int i = 0;
        for (FastJsonResponse.Field next : mo9948a().values()) {
            if (mo9949a(next)) {
                i = (i * 31) + mo9950b(next).hashCode();
            }
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        for (FastJsonResponse.Field next : mo9948a().values()) {
            if (mo9949a(next)) {
                if (!fastJsonResponse.mo9949a(next) || !mo9950b(next).equals(fastJsonResponse.mo9950b(next))) {
                    return false;
                }
            } else if (fastJsonResponse.mo9949a(next)) {
                return false;
            }
        }
        return true;
    }
}
