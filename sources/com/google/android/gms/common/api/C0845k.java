package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;

/* renamed from: com.google.android.gms.common.api.k */
public final class C0845k extends UnsupportedOperationException {

    /* renamed from: a */
    private final Feature f938a;

    public C0845k(Feature feature) {
        this.f938a = feature;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.f938a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
