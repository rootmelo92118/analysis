package com.google.android.gms.common.api;

import android.support.p034v4.util.ArrayMap;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C0807ae;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.api.c */
public class C0789c extends Exception {

    /* renamed from: a */
    private final ArrayMap<C0807ae<?>, ConnectionResult> f800a;

    public C0789c(ArrayMap<C0807ae<?>, ConnectionResult> arrayMap) {
        this.f800a = arrayMap;
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C0807ae next : this.f800a.keySet()) {
            ConnectionResult connectionResult = this.f800a.get(next);
            if (connectionResult.mo9509b()) {
                z = false;
            }
            String a = next.mo9631a();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 2 + String.valueOf(valueOf).length());
            sb.append(a);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
