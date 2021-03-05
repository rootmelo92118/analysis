package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

final /* synthetic */ class aac implements aah {

    /* renamed from: a */
    private final String f1272a;

    /* renamed from: b */
    private final String f1273b;

    /* renamed from: c */
    private final Map f1274c;

    /* renamed from: d */
    private final byte[] f1275d;

    aac(String str, String str2, Map map, byte[] bArr) {
        this.f1272a = str;
        this.f1273b = str2;
        this.f1274c = map;
        this.f1275d = bArr;
    }

    /* renamed from: a */
    public final void mo10034a(JsonWriter jsonWriter) {
        aab.m1593a(this.f1272a, this.f1273b, this.f1274c, this.f1275d, jsonWriter);
    }
}
