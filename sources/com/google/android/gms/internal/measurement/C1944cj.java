package com.google.android.gms.internal.measurement;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.cj */
final class C1944cj extends C1941cg<Boolean> {
    C1944cj(C1947cm cmVar, String str, Boolean bool) {
        super(cmVar, str, bool, (C1942ch) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo13555a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (C1925br.f7525b.matcher(str).matches()) {
                return true;
            }
            if (C1925br.f7526c.matcher(str).matches()) {
                return false;
            }
        }
        String b = super.mo13556b();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 28 + String.valueOf(valueOf).length());
        sb.append("Invalid boolean value for ");
        sb.append(b);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
