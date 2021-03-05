package com.google.android.gms.internal.measurement;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.ci */
final class C1943ci extends C1941cg<Integer> {
    C1943ci(C1947cm cmVar, String str, Integer num) {
        super(cmVar, str, num, (C1942ch) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Integer mo13555a(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Long) {
            return Integer.valueOf(((Long) obj).intValue());
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String b = super.mo13556b();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 24 + String.valueOf(valueOf).length());
        sb.append("Invalid int value for ");
        sb.append(b);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
